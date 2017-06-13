package lab3.listeners;

import lab3.parser.FunctionalBaseListener;
import lab3.parser.FunctionalParser;

public class DeflistListener extends FunctionalBaseListener {
    @Override
    public void enterDeflist(FunctionalParser.DeflistContext ctx) {
        super.enterDeflist(ctx);

        ctx.define().forEach(
                d -> {
                    DefineListener defineListener = new DefineListener();
                    d.enterRule(defineListener);
                    System.out.print("\n");
                });
    }
}
