package lab4.listeners;

import lab4.parser.GrammarFileBaseListener;
import lab4.parser.GrammarFileParser;

public class LineListener extends GrammarFileBaseListener {
    @Override
    public void enterLine(GrammarFileParser.LineContext ctx) {
        super.enterLine(ctx);

        if (ctx.grammarRule() != null) {
            GrammarRuleListener listener = new GrammarRuleListener();
            ctx.grammarRule().enterRule(listener);
        } else if (ctx.lexerRule() != null) {
            LexerRuleListener listener = new LexerRuleListener();
            ctx.lexerRule().enterRule(listener);
        }
    }
}
