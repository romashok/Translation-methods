package lab4.listeners;

import lab4.parser.GrammarFileBaseListener;
import lab4.parser.GrammarFileParser;
import lab4.utils.GrammarInfo;

public class GrammarFileContentListener extends GrammarFileBaseListener {

    @Override
    public void enterGrammarFileContent(GrammarFileParser.GrammarFileContentContext ctx) {
        super.enterGrammarFileContent(ctx);

        GrammarInfo.setGrammarName(ctx.name.getText());
        ctx.line().forEach(line -> {
            LineListener listener = new LineListener();
            line.enterRule(listener);
        });
    }
}
