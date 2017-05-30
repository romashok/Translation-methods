package lab3.listeners;

import lab3.FunctionalBaseListener;
import lab3.FunctionalParser;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DefineListener extends FunctionalBaseListener {
    Set<String> scopeVars;

    public DefineListener() {
        scopeVars = new HashSet<>();
        scopeVars.add("True");
        scopeVars.add("False");
    }

    @Override
    public void enterDefine(FunctionalParser.DefineContext ctx) {
        super.enterDefine(ctx);

        String funcName = ctx.ID().toString();


        ctx.args().ID().forEach(arg -> scopeVars.add(arg.getText()));
        String args = ctx.args().ID().stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.print(String.format("def %s(%s):\n", funcName, args));

        CondListener condListener = new CondListener(scopeVars);
        ctx.cond().enterRule(condListener);
        condListener.getBody().forEach(line -> System.out.println("  " + line));
    }
}
