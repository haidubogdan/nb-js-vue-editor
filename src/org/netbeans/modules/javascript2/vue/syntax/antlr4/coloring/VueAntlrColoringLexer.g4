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
lexer grammar VueAntlrColoringLexer;

@header{
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
}

options { 
    superClass = ColoringLexerAdaptor;
 }

tokens {
 TEMPLATE_TAG_OPEN,
 LISTENER_ATTR,
 QUOTE_ATTR,
 JAVASCRIPT,
 JAVASCRIPT_ATTR,   
 HTML
}
    
fragment Identifier 
    : [a-z_\u0080-\ufffe][a-z0-9_\u0080-\ufffe]*;   

TEMPLATE_TAG_OPEN : '<template' (' ')* '>' {this.setInsideTemplateTag(true);} ->pushMode(INSIDE_TEMPLATE);
 
OTHER : . ->type(HTML);   
    
mode INSIDE_TEMPLATE;

TEMPLATE_TAG_CLOSE : '</template>'->popMode;
LISTENER_ATTR_TEMPLATE : '@' Identifier {this._input.LA(1) == '='}? ->type(LISTENER_ATTR),pushMode(INSIDE_SCRIPT_ATTR);
TEMPLATE_OTHER : . ->type(HTML); 
EXIT_TEMPLATE_EOF : EOF->type(HTML),popMode;

mode INSIDE_SCRIPT_ATTR;

SCRIPT_ATTR_QUOTE_EXIT : {this.getAttrQuoteState() == true}? '"' {this.setAttrQuoteState(false);}->type(QUOTE_ATTR);
SCRIPT_ATTR_QUOTE : '"' {this.setAttrQuoteState(true);}->type(QUOTE_ATTR);

SCRIPT_ATTR_OTHER : . ->type(JAVASCRIPT_ATTR); 
EXIT_SCRIPT_ATTR_EOF : EOF->type(HTML),popMode;