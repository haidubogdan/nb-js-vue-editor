// Generated from VueAntlrColoringLexer.g4 by ANTLR 4.13.2

 /*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
  package org.netbeans.modules.javascript2.vue.syntax.antlr4.coloring;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VueAntlrColoringLexer extends ColoringLexerAdaptor {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEMPLATE_TAG_OPEN=1, LISTENER_ATTR=2, QUOTE_ATTR=3, JAVASCRIPT=4, JAVASCRIPT_ATTR=5, 
		HTML=6, TEMPLATE_TAG_CLOSE=7;
	public static final int
		INSIDE_TEMPLATE=1, INSIDE_SCRIPT_ATTR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_TEMPLATE", "INSIDE_SCRIPT_ATTR"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Identifier", "TEMPLATE_TAG_OPEN", "OTHER", "TEMPLATE_TAG_CLOSE", "LISTENER_ATTR_TEMPLATE", 
			"TEMPLATE_OTHER", "EXIT_TEMPLATE_EOF", "SCRIPT_ATTR_QUOTE_EXIT", "SCRIPT_ATTR_QUOTE", 
			"SCRIPT_ATTR_OTHER", "EXIT_SCRIPT_ATTR_EOF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'</template>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEMPLATE_TAG_OPEN", "LISTENER_ATTR", "QUOTE_ATTR", "JAVASCRIPT", 
			"JAVASCRIPT_ATTR", "HTML", "TEMPLATE_TAG_CLOSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public VueAntlrColoringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VueAntlrColoringLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			TEMPLATE_TAG_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			SCRIPT_ATTR_QUOTE_EXIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			SCRIPT_ATTR_QUOTE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEMPLATE_TAG_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			this.setInsideTemplateTag(true);
			break;
		}
	}
	private void SCRIPT_ATTR_QUOTE_EXIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			this.setAttrQuoteState(false);
			break;
		}
	}
	private void SCRIPT_ATTR_QUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			this.setAttrQuoteState(true);
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return LISTENER_ATTR_TEMPLATE_sempred((RuleContext)_localctx, predIndex);
		case 7:
			return SCRIPT_ATTR_QUOTE_EXIT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean LISTENER_ATTR_TEMPLATE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this._input.LA(1) == '=';
		}
		return true;
	}
	private boolean SCRIPT_ATTR_QUOTE_EXIT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return this.getAttrQuoteState() == true;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0007k\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002"+
		"\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005"+
		"\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002"+
		"\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b"+
		"\u0000\n\u0000\f\u0000\u001f\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0003\u0000\u0005\u0001\u0007\u0000\t\u0007\u000b"+
		"\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000"+
		"\u0003\u0000\u0001\u0002\u0002\u0003\u0000__az\u0080\u8000\ufffe\u0004"+
		"\u000009__az\u0080\u8000\ufffei\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0001\t\u0001\u0000\u0000\u0000\u0001\u000b"+
		"\u0001\u0000\u0000\u0000\u0001\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0002\u0013\u0001"+
		"\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0002\u0017\u0001"+
		"\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005 \u0001\u0000"+
		"\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000"+
		"\u000bG\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fR\u0001"+
		"\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000"+
		"\u0000\u0015b\u0001\u0000\u0000\u0000\u0017f\u0001\u0000\u0000\u0000\u0019"+
		"\u001d\u0007\u0000\u0000\u0000\u001a\u001c\u0007\u0001\u0000\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"\u0004\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005"+
		"<\u0000\u0000!\"\u0005t\u0000\u0000\"#\u0005e\u0000\u0000#$\u0005m\u0000"+
		"\u0000$%\u0005p\u0000\u0000%&\u0005l\u0000\u0000&\'\u0005a\u0000\u0000"+
		"\'(\u0005t\u0000\u0000()\u0005e\u0000\u0000)-\u0001\u0000\u0000\u0000"+
		"*,\u0005 \u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000001\u0005>\u0000\u000012\u0006\u0001\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0006\u0001\u0001\u00004\u0006\u0001"+
		"\u0000\u0000\u000056\t\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0006"+
		"\u0002\u0002\u00008\b\u0001\u0000\u0000\u00009:\u0005<\u0000\u0000:;\u0005"+
		"/\u0000\u0000;<\u0005t\u0000\u0000<=\u0005e\u0000\u0000=>\u0005m\u0000"+
		"\u0000>?\u0005p\u0000\u0000?@\u0005l\u0000\u0000@A\u0005a\u0000\u0000"+
		"AB\u0005t\u0000\u0000BC\u0005e\u0000\u0000CD\u0005>\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EF\u0006\u0003\u0003\u0000F\n\u0001\u0000\u0000\u0000"+
		"GH\u0005@\u0000\u0000HI\u0003\u0003\u0000\u0000IJ\u0004\u0004\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0006\u0004\u0004\u0000LM\u0006\u0004\u0005"+
		"\u0000M\f\u0001\u0000\u0000\u0000NO\t\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0006\u0005\u0002\u0000Q\u000e\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0000\u0000\u0001ST\u0001\u0000\u0000\u0000TU\u0006\u0006\u0002"+
		"\u0000UV\u0006\u0006\u0003\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0004"+
		"\u0007\u0001\u0000XY\u0005\"\u0000\u0000YZ\u0006\u0007\u0006\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0006\u0007\u0007\u0000\\\u0012\u0001\u0000\u0000"+
		"\u0000]^\u0005\"\u0000\u0000^_\u0006\b\b\u0000_`\u0001\u0000\u0000\u0000"+
		"`a\u0006\b\u0007\u0000a\u0014\u0001\u0000\u0000\u0000bc\t\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0006\t\t\u0000e\u0016\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0000\u0000\u0001gh\u0001\u0000\u0000\u0000hi\u0006"+
		"\n\u0002\u0000ij\u0006\n\u0003\u0000j\u0018\u0001\u0000\u0000\u0000\u0005"+
		"\u0000\u0001\u0002\u001d-\n\u0001\u0001\u0000\u0005\u0001\u0000\u0007"+
		"\u0006\u0000\u0004\u0000\u0000\u0007\u0002\u0000\u0005\u0002\u0000\u0001"+
		"\u0007\u0001\u0007\u0003\u0000\u0001\b\u0002\u0007\u0005\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}