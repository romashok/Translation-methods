package lab3.listeners;

import lab3.FunctionalBaseListener;
import lab3.FunctionalParser;
import org.antlr.v4.runtime.Token;

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
            funcRepr = String.format("%s(%s)",
                    funcName,
                    ctx.params
                            .stream()
                            .map(Token::getText)
                            .collect(Collectors.joining(", ")));
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
