package lab3.listeners;

import lab3.FunctionalBaseListener;
import lab3.FunctionalParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ParamListener extends FunctionalBaseListener {

    private List<String> vars;
    private Set<String> scopeVars;

    public ParamListener(Set<String> scopeVars) {
        this.vars = new ArrayList<>();
        this.scopeVars = scopeVars;
    }

    private List<String> extractSegment(FunctionalParser.ParamContext ctx, int i) {
        ExprListener exprListener = new ExprListener(scopeVars);
        ctx.expr(i).enterRule(exprListener);
        return exprListener.getVars();
    }

    @Override
    public void enterParam(FunctionalParser.ParamContext ctx) {
        super.enterParam(ctx);

        switch (ctx.getChildCount()) {
            case 1:
                if (ctx.constant() == null) {
                    vars.add(ctx.ID().getText());
                } else {
                    vars.add(ctx.constant().getText());
                }
                break;
            case 3:
                if (ctx.BINOP() == null) {
                    vars.add("( ");
                    vars.addAll(extractSegment(ctx, 0));
                    vars.add(" )");
                } else {
                    vars.addAll(extractSegment(ctx, 0));
                    vars.add(ctx.BINOP().getText());
                    vars.addAll(extractSegment(ctx, 1));
                }
                break;
            default:
                throw new RuntimeException("Must be unreachable!");
        }

    }

    public List<String> getVars() {
        return vars;
    }

    @Override
    public String toString() {
        return vars.stream().collect(Collectors.joining(" "));
    }
}
