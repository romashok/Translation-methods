package lab3.listeners;

import lab3.parser.FunctionalBaseListener;
import lab3.parser.FunctionalParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExprListener extends FunctionalBaseListener {

    private List<String> vars;
    private Set<String> scopeVars;

    private List<String> extractSegment(FunctionalParser.ExprContext ctx, int i) {
        ExprListener exprListener = new ExprListener(scopeVars);
        ctx.expr(i).enterRule(exprListener);
        return exprListener.getVars();
    }

    private String makeFunctionCall(FunctionalParser.ExprContext ctx) {
        FuncListener funcListener = new FuncListener(scopeVars);
        ctx.func().enterRule(funcListener);
        return funcListener.getFuncRepr();
    }

    public ExprListener(Set<String> scopeVars) {
        this.vars = new ArrayList<>();
        this.scopeVars = scopeVars;
    }

    @Override
    public void enterExpr(FunctionalParser.ExprContext ctx) {
        super.enterExpr(ctx);

        switch (ctx.getChildCount()) {
            case 1:
                if (ctx.func() == null) {
                    vars.add(ctx.constant().getText());
                } else {
                    vars.add(makeFunctionCall(ctx));
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
