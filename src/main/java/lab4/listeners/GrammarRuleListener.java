package lab4.listeners;

import lab4.parser.GrammarFileBaseListener;
import lab4.parser.GrammarFileParser;
import lab4.utils.GRule;
import lab4.utils.GrammarInfo;
import lab4.utils.Rule;

public class GrammarRuleListener extends GrammarFileBaseListener {
    @Override
    public void enterGrammarRule(GrammarFileParser.GrammarRuleContext ctx) {
        super.enterGrammarRule(ctx);

        Rule rule = new GRule(ctx.grammarRuleName().getText());
        ProductionsListener listener = new ProductionsListener(rule);
        ctx.productions().enterRule(listener);
        GrammarInfo.addGrammarRule((GRule) rule);
    }
}
