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
package org.netbeans.modules.javascript2.vue.editor.lexer;

import java.io.File;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.javascript2.vue.editor.StringUtils;
import org.netbeans.modules.javascript2.vue.editor.VueGoldenFileTestBase;
import org.netbeans.modules.javascript2.vue.editor.VueLanguage;
import org.netbeans.modules.javascript2.vue.editor.VueUtils;

/**
 *
 * @author bogdan.haidu
 */
public class VueLexerTest extends VueGoldenFileTestBase {

    public static final String TESTFILES_DIR = "testfiles/lexer/vue/";
    
    public VueLexerTest(String name) {
        super(name);
    }

    public void testAttributeBindingLexer_01() throws Exception {
        performTest("attribute_binding_01.vue");
    }

    public void testTemplateLexer_01() throws Exception {
        performTest("template_01.vue");
    }

    public void testUserInputLexer_01() throws Exception {
        performTest("user_input_01.vue");
    }

    public void testComponentLexer_01() throws Exception {
        performTest("component_01.vue");
    }

    @Override
    protected String getTestResult(String filename) throws Exception {
        String content = VueUtils.getFileContent(new File(getDataDir(), TESTFILES_DIR + filename ));
        VueLanguage lang = new VueLanguage();
        Language<VueTokenId> language = lang.getLexerLanguage();
        TokenHierarchy<?> hierarchy = TokenHierarchy.create(content, language);
        return createResult(hierarchy.tokenSequence(language));
    }

    private String createResult(TokenSequence<VueTokenId> ts) throws Exception {
        StringBuilder result = new StringBuilder();
        while (ts.moveNext()) {
            VueTokenId tokenId = ts.token().id();
            CharSequence text = ts.token().text();
            result.append("Token #");
            result.append(ts.index());
            result.append(" ");
            result.append(tokenId.name());
            String token = StringUtils.replaceLinesAndTabs(text.toString());
            if (!token.isEmpty()) {
                result.append(" ");
                result.append("[");
                result.append(token);
                result.append("]");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
