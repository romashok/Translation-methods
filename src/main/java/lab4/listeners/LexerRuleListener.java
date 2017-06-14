package lab4.listeners;

import lab4.parser.GrammarFileBaseListener;
import lab4.parser.GrammarFileParser;
import lab4.utils.GrammarInfo;
import lab4.utils.LRule;
import lab4.utils.Rule;

public class LexerRuleListener extends GrammarFileBaseListener {
    @Override
    public void enterLexerRule(GrammarFileParser.LexerRuleContext ctx) {
        super.enterLexerRule(ctx);

        Rule rule = new LRule(ctx.lexerToken().getText());
        ProductionsListener listener = new ProductionsListener(rule);
        ctx.productions().enterRule(listener);
        GrammarInfo.addLexerToken((LRule) rule);
    }
}
