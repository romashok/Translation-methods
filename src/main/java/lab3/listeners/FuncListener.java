package lab3.listeners;

import lab3.parser.FunctionalBaseListener;
import lab3.parser.FunctionalParser;

import java.util.Set;
import java.util.stream.Collectors;

public class FuncListener extends FunctionalBaseListener {
    private String funcRepr;
    private Set<String> scopeVars;

    public FuncListener(Set<String> scopeVars) {
        this.scopeVars = scopeVars;
    }

    @Override
    public void enterFunc(FunctionalParser.FuncContext ctx) {
        super.enterFunc(ctx);

        String funcName = ctx.name.getText();
        if (ctx.getChildCount() > 1) {
            String params = ctx.param().stream()
                    .map(e -> {
                        ParamListener paramListener = new ParamListener(scopeVars);
                        e.enterRule(paramListener);
                        return paramListener.toString();
                    })
                    .collect(Collectors.joining(", "));
            funcRepr = String.format("%s(%s)", funcName, params);
        } else {
            if (scopeVars.contains(funcName)) {
                funcRepr = funcName;
            } else {
                funcRepr = funcName + "()";
            }
        }
    }

    public String getFuncRepr() {
        return funcRepr;
    }
}
