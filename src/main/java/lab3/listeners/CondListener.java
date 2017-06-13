package lab3.listeners;

import lab3.parser.FunctionalBaseListener;
import lab3.parser.FunctionalParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class CondListener extends FunctionalBaseListener {

    private List<String> body;
    private Set<String> scopeVars;

    private void addBranch(FunctionalParser.CondContext ctx, int i, String indent) {
        CondListener condListener = new CondListener(scopeVars);
        ctx.cond(i).enterRule(condListener);
        condListener.getBody().forEach(line -> body.add(indent + line));
    }

    private String extractExpr(FunctionalParser.CondContext ctx) {
        ExprListener exprListener = new ExprListener(scopeVars);
        ctx.expr().enterRule(exprListener);
        return exprListener.toString();
    }

    public CondListener(Set<String> scopeVars) {
        this.body = new ArrayList<>();
        this.scopeVars = scopeVars;
    }

    @Override
    public void enterCond(FunctionalParser.CondContext ctx) {
        super.enterCond(ctx);

        switch (ctx.getChildCount()) {
            case 1:
                body.add("return " + extractExpr(ctx));
                break;
            case 3:
                addBranch(ctx, 0, "");
                break;
            case 6:
                body.add("if " + extractExpr(ctx) + ":");
                addBranch(ctx, 0, "  ");
                body.add("else:");
                addBranch(ctx, 1, "  ");
                break;
            default:
                throw new RuntimeException("Must be unreachable!");
        }
    }

    public List<String> getBody() {
        return body;
    }

}
