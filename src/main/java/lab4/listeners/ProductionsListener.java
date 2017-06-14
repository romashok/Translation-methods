package lab4.listeners;

import lab4.parser.GrammarFileBaseListener;
import lab4.parser.GrammarFileParser;
import lab4.utils.GRule;
import lab4.utils.LRule;
import lab4.utils.Rule;

public class ProductionsListener extends GrammarFileBaseListener {
    private Rule rule;

    public ProductionsListener(Rule rule) {
        this.rule = rule;
    }

    @Override
    public void enterProductions(GrammarFileParser.ProductionsContext ctx) {
        super.enterProductions(ctx);

        ctx.production().forEach(production -> {
            ProductionListener listener = new ProductionListener();
            production.enterRule(listener);
            if (rule instanceof LRule) {
                ((LRule) rule).addMatch(listener.getMatch().get(0));
            } else if (rule instanceof GRule) {
                rule.addAlt(listener.getMatch());
            }
        });
    }
}
