/*
Licensed to the Apache Software Foundation (ASF)
 */
package org.netbeans.modules.javascript2.vue.grammar.antlr4.coloring;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

/**
 *
 * @author bogdan
 */
public abstract class ColoringLexerAdaptor extends Lexer {

    private boolean insideTemplateTag = false;
    private boolean insideStyleTag = false;
    private boolean attrQuoteOpened = false;
    private boolean varInterpolationOpened = false;
    private String scriptLanguage = "";

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
    
    public void setInsideStyleTag(boolean state) {
        insideStyleTag = state;
    }

    public boolean isInsideStyleTag() {
        return insideStyleTag;
    }
    
    public void setAttrQuoteState(boolean state) {
        attrQuoteOpened = state;
    }

    public boolean getAttrQuoteState() {
        return attrQuoteOpened;
    }
        
    public void setVarInterpolationOpened(boolean state) {
        varInterpolationOpened = state;
    }

    public boolean isVarInterpolationOpened() {
        return varInterpolationOpened;
    }
    
    public String getScriptLanguage() {
        return scriptLanguage;
    }
}
