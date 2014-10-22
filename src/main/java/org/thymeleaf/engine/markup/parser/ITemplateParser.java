/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.engine.markup.parser;

import java.io.Reader;

import org.attoparser.IMarkupHandler;


/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface ITemplateParser {

    public void parse(
            final String documentName, final String document,
            final IMarkupHandler handler);

    public void parse(
            final String documentName, final char[] document,
            final IMarkupHandler handler);

    public void parse(
            final String documentName, final char[] document, final int offset, final int len,
            final IMarkupHandler handler);

    public void parse(
            final String documentName, final Reader reader,
            final IMarkupHandler handler);

    public void parse(
            final String documentName, final String document,
            final IMarkupHandler handler,
            final int lineOffset, final int colOffset);

    public void parse(
            final String documentName, final char[] document,
            final IMarkupHandler handler,
            final int lineOffset, final int colOffset);

    public void parse(
            final String documentName, final char[] document, final int offset, final int len,
            final IMarkupHandler handler,
            final int lineOffset, final int colOffset);

    public void parse(
            final String documentName, final Reader reader,
            final IMarkupHandler handler,
            final int lineOffset, final int colOffset);

}
