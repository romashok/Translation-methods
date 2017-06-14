package lab4.utils;

public class LRule extends Rule<Match> {
    public LRule(String name) {
        super(name);
    }

    public void addMatch(String alt) {
        if (alt.startsWith("[") && alt.endsWith("]")) {
            alts.add(new RegExp(alt));
        } else {
            alts.add(new Match(alt));
        }
    }
}
