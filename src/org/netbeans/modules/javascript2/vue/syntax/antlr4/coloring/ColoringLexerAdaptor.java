/*
Licensed to the Apache Software Foundation (ASF)
 */
package org.netbeans.modules.javascript2.vue.syntax.antlr4.coloring;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

/**
 *
 * @author bogdan
 */
public abstract class ColoringLexerAdaptor extends Lexer {

    private boolean insideTemplateTag = false;
    private boolean attrQuoteOpened = false;

    public ColoringLexerAdaptor(CharStream input) {
        super(input);
    }

    @Override
    public void reset() {
        insideTemplateTag = false;
        super.reset();
    }

    public void setInsideTemplateTag(boolean state) {
        insideTemplateTag = state;
    }

    public boolean isInsideTemplateTag() {
        return insideTemplateTag;
    }
    
    public void setAttrQuoteState(boolean state) {
        attrQuoteOpened = state;
    }

    public boolean getAttrQuoteState() {
        return attrQuoteOpened;
    }
}
