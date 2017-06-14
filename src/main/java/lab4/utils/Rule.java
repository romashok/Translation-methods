package lab4.utils;

import java.util.ArrayList;
import java.util.List;

public class Rule<T> {
    protected String name;
    protected List<T> alts;

    public Rule(String name) {
        this.name = name;
        alts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAlt(T alt) {
        alts.add(alt);
    }

    public List<T> getAlts() {
        return alts;
    }

}
