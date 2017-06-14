package lab4.utils;

import java.util.HashSet;
import java.util.Set;

public class RegExp extends Match {
    final Set<Character> symbols;

    public RegExp(String name) {
        super(name);

        symbols = new HashSet<>();
        addSymbols();
    }

    private void addSymbols() {
        //skip prefix '[' and suffix ']'
        for (int i = 1; i < name.length() - 1; i++) {
            if (name.charAt(i) == '-' && name.charAt(i - 1) != '\\') {
                for (char c = name.charAt(i - 1); c < name.charAt(i + 1); c++) {
                    symbols.add(c);
                }
            } else {
                symbols.add(name.charAt(i));
            }
        }
    }

    public Set<Character> getSymbols() {
        return symbols;
    }
}
