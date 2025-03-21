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
  package org.netbeans.modules.javascript2.vue.grammar.antlr4.coloring;

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
		TEMPLATE_TAG_OPEN=1, VUE_DIRECTIVE=2, QUOTE_ATTR=3, JAVASCRIPT=4, JAVASCRIPT_ATTR=5, 
		HTML=6, CSS=7, TEMPLATE_TAG_CLOSE=8, VAR_TAG=9, STYLE_TAG_CLOSE=10;
	public static final int
		INSIDE_TEMPLATE=1, INSIDE_SCRIPT_ATTR=2, INSIDE_STYLE=3, INSIDE_VAR_INTERPOLATION=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_TEMPLATE", "INSIDE_SCRIPT_ATTR", "INSIDE_STYLE", 
		"INSIDE_VAR_INTERPOLATION"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Identifier", "ArgumentExtra", "TEMPLATE_TAG_OPEN", "STYLE_TAG_OPEN", 
			"OTHER", "TEMPLATE_TAG_CLOSE", "VUE_DIRECTIVE_TEMPLATE", "VUE_DIRECTIVE_SIMPLE", 
			"VAR_TAG", "TEMPLATE_OTHER", "EXIT_TEMPLATE_EOF", "SCRIPT_ATTR_QUOTE_EXIT", 
			"SCRIPT_ATTR_QUOTE", "SCRIPT_ATTR_OTHER", "EXIT_SCRIPT_ATTR_EOF", "STYLE_TAG_CLOSE", 
			"STYLE_OTHER", "EXIT_STYLE_EOF", "VAR_INTERPOLATION_END", "VAR_INTERPOLATION_OTHER", 
			"EXIT_VAR_INTERPOLATION_EOF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'</template>'", null, 
			"'</style>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEMPLATE_TAG_OPEN", "VUE_DIRECTIVE", "QUOTE_ATTR", "JAVASCRIPT", 
			"JAVASCRIPT_ATTR", "HTML", "CSS", "TEMPLATE_TAG_CLOSE", "VAR_TAG", "STYLE_TAG_CLOSE"
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
		case 2:
			TEMPLATE_TAG_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			STYLE_TAG_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			VAR_TAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			SCRIPT_ATTR_QUOTE_EXIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			SCRIPT_ATTR_QUOTE_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			VAR_INTERPOLATION_END_action((RuleContext)_localctx, actionIndex);
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
	private void STYLE_TAG_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			this.setInsideStyleTag(true);
			break;
		}
	}
	private void VAR_TAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			this.setVarInterpolationOpened(true);
			break;
		}
	}
	private void SCRIPT_ATTR_QUOTE_EXIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			this.setAttrQuoteState(false);
			break;
		}
	}
	private void SCRIPT_ATTR_QUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			this.setAttrQuoteState(true);
			break;
		}
	}
	private void VAR_INTERPOLATION_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			this.setVarInterpolationOpened(false);
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return VUE_DIRECTIVE_TEMPLATE_sempred((RuleContext)_localctx, predIndex);
		case 11:
			return SCRIPT_ATTR_QUOTE_EXIT_sempred((RuleContext)_localctx, predIndex);
		case 18:
			return VAR_INTERPOLATION_END_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean VUE_DIRECTIVE_TEMPLATE_sempred(RuleContext _localctx, int predIndex) {
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
	private boolean VAR_INTERPOLATION_END_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return this.isVarInterpolationOpened();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\n\u00fa\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0005\u00002\b\u0000\n\u0000\f\u00005\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003[\b"+
		"\u0003\n\u0003\f\u0003^\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0088\b\u0006\u0003\u0006\u008a\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00ab\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0005\u0000\u0007\u0000\t\u0001\u000b\u0000\r\u0000"+
		"\u000f\b\u0011\u0000\u0013\u0000\u0015\t\u0017\u0000\u0019\u0000\u001b"+
		"\u0000\u001d\u0000\u001f\u0000!\u0000#\n%\u0000\'\u0000)\u0000+\u0000"+
		"-\u0000\u0005\u0000\u0001\u0002\u0003\u0004\u0002\u0003\u0000__az\u0080"+
		"\u8000\ufffe\u0004\u000009__az\u0080\u8000\ufffe\u00ff\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000"+
		"\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000\u0000"+
		"\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000"+
		"\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000"+
		"\u0003#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0003\'"+
		"\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0004+\u0001\u0000"+
		"\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000"+
		"\u0007B\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bR\u0001"+
		"\u0000\u0000\u0000\re\u0001\u0000\u0000\u0000\u000fi\u0001\u0000\u0000"+
		"\u0000\u0011\u0089\u0001\u0000\u0000\u0000\u0013\u0090\u0001\u0000\u0000"+
		"\u0000\u0015\u00ae\u0001\u0000\u0000\u0000\u0017\u00b5\u0001\u0000\u0000"+
		"\u0000\u0019\u00b9\u0001\u0000\u0000\u0000\u001b\u00be\u0001\u0000\u0000"+
		"\u0000\u001d\u00c5\u0001\u0000\u0000\u0000\u001f\u00ca\u0001\u0000\u0000"+
		"\u0000!\u00ce\u0001\u0000\u0000\u0000#\u00d3\u0001\u0000\u0000\u0000%"+
		"\u00df\u0001\u0000\u0000\u0000\'\u00e3\u0001\u0000\u0000\u0000)\u00e8"+
		"\u0001\u0000\u0000\u0000+\u00f1\u0001\u0000\u0000\u0000-\u00f5\u0001\u0000"+
		"\u0000\u0000/3\u0007\u0000\u0000\u000002\u0007\u0001\u0000\u000010\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u00004\u0006\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u00006;\u0003\u0005\u0000\u000078\u0005.\u0000\u00008:\u0003\u0005"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<C\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>?\u0005[\u0000\u0000?@\u0003\u0005\u0000\u0000"+
		"@A\u0005]\u0000\u0000AC\u0001\u0000\u0000\u0000B6\u0001\u0000\u0000\u0000"+
		"B>\u0001\u0000\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0005<\u0000\u0000"+
		"EF\u0005t\u0000\u0000FG\u0005e\u0000\u0000GH\u0005m\u0000\u0000HI\u0005"+
		"p\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005a\u0000\u0000KL\u0005t\u0000"+
		"\u0000LM\u0005e\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0006\u0002\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\u0002\u0001\u0000Q\n\u0001\u0000"+
		"\u0000\u0000RS\u0005<\u0000\u0000ST\u0005s\u0000\u0000TU\u0005t\u0000"+
		"\u0000UV\u0005y\u0000\u0000VW\u0005l\u0000\u0000WX\u0005e\u0000\u0000"+
		"X\\\u0001\u0000\u0000\u0000Y[\u0005 \u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005>\u0000"+
		"\u0000`a\u0006\u0003\u0002\u0000ab\u0001\u0000\u0000\u0000bc\u0006\u0003"+
		"\u0003\u0000cd\u0006\u0003\u0004\u0000d\f\u0001\u0000\u0000\u0000ef\t"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0006\u0004\u0003\u0000"+
		"h\u000e\u0001\u0000\u0000\u0000ij\u0005<\u0000\u0000jk\u0005/\u0000\u0000"+
		"kl\u0005t\u0000\u0000lm\u0005e\u0000\u0000mn\u0005m\u0000\u0000no\u0005"+
		"p\u0000\u0000op\u0005l\u0000\u0000pq\u0005a\u0000\u0000qr\u0005t\u0000"+
		"\u0000rs\u0005e\u0000\u0000st\u0005>\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0006\u0005\u0005\u0000v\u0010\u0001\u0000\u0000\u0000wx\u0005v\u0000"+
		"\u0000xy\u0005-\u0000\u0000yz\u0001\u0000\u0000\u0000z}\u0003\u0005\u0000"+
		"\u0000{|\u0005:\u0000\u0000|~\u0003\u0007\u0001\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u008a\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005@\u0000\u0000\u0080\u008a\u0003\u0007\u0001\u0000\u0081\u0087"+
		"\u0005:\u0000\u0000\u0082\u0088\u0003\u0005\u0000\u0000\u0083\u0084\u0005"+
		"[\u0000\u0000\u0084\u0085\u0003\u0005\u0000\u0000\u0085\u0086\u0005]\u0000"+
		"\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000"+
		"\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000"+
		"\u0000\u0089w\u0001\u0000\u0000\u0000\u0089\u007f\u0001\u0000\u0000\u0000"+
		"\u0089\u0081\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0004\u0006\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0006\u0006\u0006\u0000\u008e\u008f\u0006\u0006\u0007\u0000"+
		"\u008f\u0012\u0001\u0000\u0000\u0000\u0090\u0091\u0005v\u0000\u0000\u0091"+
		"\u0092\u0005-\u0000\u0000\u0092\u00aa\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005o\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095\u0096\u0005c"+
		"\u0000\u0000\u0096\u00ab\u0005e\u0000\u0000\u0097\u0098\u0005e\u0000\u0000"+
		"\u0098\u0099\u0005l\u0000\u0000\u0099\u009a\u0005s\u0000\u0000\u009a\u00ab"+
		"\u0005e\u0000\u0000\u009b\u009c\u0005p\u0000\u0000\u009c\u009d\u0005r"+
		"\u0000\u0000\u009d\u00ab\u0005e\u0000\u0000\u009e\u009f\u0005c\u0000\u0000"+
		"\u009f\u00a0\u0005l\u0000\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u00a2"+
		"\u0005a\u0000\u0000\u00a2\u00ab\u0005k\u0000\u0000\u00a3\u00a4\u0005s"+
		"\u0000\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u00a6\u0005o\u0000\u0000"+
		"\u00a6\u00a7\u0005t\u0000\u0000\u00a7\u00a8\u0005:\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u0005\u0000\u0000\u00aa\u0093"+
		"\u0001\u0000\u0000\u0000\u00aa\u0097\u0001\u0000\u0000\u0000\u00aa\u009b"+
		"\u0001\u0000\u0000\u0000\u00aa\u009e\u0001\u0000\u0000\u0000\u00aa\u00a3"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0006\u0007\u0006\u0000\u00ad\u0014\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005{\u0000\u0000\u00af\u00b0\u0005{\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0006\b\b\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0006\b\t\u0000\u00b4\u0016\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\t\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0006\t\u0003\u0000\u00b8\u0018\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0000\u0000\u0001\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0006\n\u0003\u0000\u00bc\u00bd\u0006\n\u0005\u0000\u00bd\u001a\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0004\u000b\u0001\u0000\u00bf\u00c0\u0005"+
		"\"\u0000\u0000\u00c0\u00c1\u0006\u000b\n\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0006\u000b\u000b\u0000\u00c3\u00c4\u0006\u000b"+
		"\u0005\u0000\u00c4\u001c\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\"\u0000"+
		"\u0000\u00c6\u00c7\u0006\f\f\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0006\f\u000b\u0000\u00c9\u001e\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\t\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0006\r\r\u0000\u00cd \u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0000"+
		"\u0000\u0001\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0006\u000e"+
		"\u0003\u0000\u00d1\u00d2\u0006\u000e\u0005\u0000\u00d2\"\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005<\u0000\u0000\u00d4\u00d5\u0005/\u0000\u0000\u00d5"+
		"\u00d6\u0005s\u0000\u0000\u00d6\u00d7\u0005t\u0000\u0000\u00d7\u00d8\u0005"+
		"y\u0000\u0000\u00d8\u00d9\u0005l\u0000\u0000\u00d9\u00da\u0005e\u0000"+
		"\u0000\u00da\u00db\u0005>\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0006\u000f\u0003\u0000\u00dd\u00de\u0006\u000f\u0005\u0000"+
		"\u00de$\u0001\u0000\u0000\u0000\u00df\u00e0\t\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0006\u0010\u000e\u0000\u00e2"+
		"&\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0000\u0000\u0001\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0006\u0011\u0003\u0000\u00e6\u00e7"+
		"\u0006\u0011\u0005\u0000\u00e7(\u0001\u0000\u0000\u0000\u00e8\u00e9\u0004"+
		"\u0012\u0002\u0000\u00e9\u00ea\u0005}\u0000\u0000\u00ea\u00eb\u0005}\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006\u0012\u000f"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006\u0012\u0010"+
		"\u0000\u00ef\u00f0\u0006\u0012\u0005\u0000\u00f0*\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\t\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0006\u0013\u0011\u0000\u00f4,\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0000\u0000\u0001\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0006\u0014\u0003\u0000\u00f8\u00f9\u0006\u0014\u0005\u0000\u00f9.\u0001"+
		"\u0000\u0000\u0000\r\u0000\u0001\u0002\u0003\u00043;B\\}\u0087\u0089\u00aa"+
		"\u0012\u0001\u0002\u0000\u0005\u0001\u0000\u0001\u0003\u0001\u0007\u0006"+
		"\u0000\u0005\u0003\u0000\u0004\u0000\u0000\u0007\u0002\u0000\u0005\u0002"+
		"\u0000\u0001\b\u0002\u0005\u0004\u0000\u0001\u000b\u0003\u0007\u0003\u0000"+
		"\u0001\f\u0004\u0007\u0005\u0000\u0007\u0007\u0000\u0001\u0012\u0005\u0007"+
		"\t\u0000\u0007\u0004\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}