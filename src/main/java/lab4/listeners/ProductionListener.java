package lab4.listeners;

import lab4.parser.GrammarFileBaseListener;
import lab4.parser.GrammarFileParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.stream.Collectors;

public class ProductionListener extends GrammarFileBaseListener {
    private List<String> match;

    @Override
    public void enterProduction(GrammarFileParser.ProductionContext ctx) {
        super.enterProduction(ctx);

        match = ctx.term().stream()
                .map(RuleContext::getText)
                .collect(Collectors.toList());
    }

    public List<String> getMatch() {
        return match;
    }
}
