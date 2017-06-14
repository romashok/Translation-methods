package lab4.utils;

import java.util.*;
import java.util.stream.Collectors;

public class TopDownParsing {

    public static Map<String, Set<Character>> buildLexerFirst(List<LRule> rules) {
        HashMap<String, Set<Character>> map = new HashMap<>();
        for (LRule rule : rules) {
            Set<Character> first = new HashSet<>();
            for (Match match : rule.getAlts()) {
                if (match instanceof RegExp) {
                    first.addAll(((RegExp) match).getSymbols());
                } else {
                    // skip [']
                    first.add(match.getName().charAt(1));
                }
            }
            map.put(rule.getName(), first);
        }
        return map;
    }

    public static Map<String, Set<Character>> buildGrammarFirst(List<GRule> grules, List<LRule> lrules) {
        Map<String, Set<Character>> FIRST = new HashMap<>();
        grules.stream().map(Rule::getName).forEach(k -> FIRST.put(k, new HashSet<>()));
        FIRST.putAll(buildLexerFirst(lrules));

        boolean changed = true;
        while (changed) {
            changed = false;
            for (GRule rule : grules) {
                String non = rule.getName();
                for (List<String> alt : rule.getAlts()) {
                    Set<Character> newFirst = evalFirst(grules, alt, FIRST);
                    if (!FIRST.get(non).containsAll(newFirst)) {
                        FIRST.get(non).addAll(newFirst);
                        changed = true;
                    }
                }
            }
        }
        return FIRST;
    }

    public static Set<Character> evalFirst(List<GRule> rules, List<String> alt, Map<String, Set<Character>> FIRST) {
        Set<Character> set = new HashSet<>();
        switch (alt.size()) {
            case 0:
                set.add('#'); // epsilon
                return set;
            default:
                String str = alt.get(0);
                if (str.startsWith("\'")) {
                    // starts with terminal
                    set.add(str.charAt(1));
                } else {
                    // starts with nonterminal
                    if (FIRST.get(str) != null) {
                        set.addAll(FIRST.get(str));
                        if (FIRST.get(str).contains('#') && alt.size() > 1) {
                            set.addAll(FIRST.get(alt.get(1)));
                        }
                    }
                }
        }
        return set;
    }


    public static Map<String, Set<Character>> buildGrammarFollow(List<GRule> grules, List<LRule> lrules) {
        Set<String> rules = new HashSet<>(grules.stream().map(Rule::getName).collect(Collectors.toList()));
        Map<String, Set<Character>> FIRST = buildGrammarFirst(grules, lrules);

        Map<String, Set<Character>> FOLLOW = new HashMap<>();
        grules.stream().map(Rule::getName).forEach(k -> FOLLOW.put(k, new HashSet<>()));
        FOLLOW.get(grules.get(0).getName()).add('~');

        boolean changed = true;
        while (changed) {
            changed = false;
            for (GRule rule : grules) {
                String non = rule.getName();
                for (List<String> alt : rule.getAlts()) {
                    for (int i = 0; i < alt.size() - 1; i++) {
                        String cur = alt.get(i);
                        if (!rules.contains(cur))
                            continue;
                        String next = alt.get(i + 1);

                        Set<Character> newFollow = new HashSet<>();
                        if (next.startsWith("\'")) {
                            newFollow.add(next.charAt(1));
                        } else {
                            newFollow.addAll(FIRST.get(next));
                            if (FIRST.get(next).contains('#')) {
                                newFollow.addAll(FOLLOW.get(non));
                            }
                            if (newFollow.contains('#')) {
                                newFollow.remove('#');
                            }
                        }
                        if (!FOLLOW.get(cur).containsAll(newFollow)) {
                            FOLLOW.get(cur).addAll(newFollow);
                            changed = true;
                        }
                    }
                    // last
                    if (!alt.isEmpty()) {
                        String cur = alt.get(alt.size() - 1);
                        if (!rules.contains(cur))
                            continue;
                        Set<Character> newFollow = new HashSet<>();
                        newFollow.addAll(FOLLOW.get(non));

                        if (!FOLLOW.get(cur).containsAll(newFollow)) {
                            FOLLOW.get(cur).addAll(newFollow);
                            changed = true;
                        }
                    }
                }
            }
        }
        return FOLLOW;
    }
}
