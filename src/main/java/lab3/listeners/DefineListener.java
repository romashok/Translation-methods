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

        if (ctx.getChildCount() <= 4) {
            // recursive if-else | expression
            CondListener condListener = new CondListener(scopeVars);
            ctx.cond().enterRule(condListener);
            condListener.getBody().forEach(line -> System.out.println("  " + line));
        } else {
            makeGuardCond(ctx, 0, "  if ");
            makeGuardBody(ctx, 0);

            for (int i = 1; i < ctx.guard().size(); i++) {
                makeGuardCond(ctx, i, "  else if ");
                makeGuardBody(ctx, i);
            }
        }
    }

    void makeGuardCond(FunctionalParser.DefineContext ctx, int i, String stmt) {
        ExprListener exprListener = new ExprListener(scopeVars);
        ctx.guard(i).expr().enterRule(exprListener);
        System.out.print(stmt + exprListener.toString() + ":\n");
    }

    void makeGuardBody(FunctionalParser.DefineContext ctx, int i) {
        CondListener condListener = new CondListener(scopeVars);
        ctx.body(i).cond().enterRule(condListener);
        condListener.getBody().forEach(line -> System.out.println("    " + line));
    }
}
