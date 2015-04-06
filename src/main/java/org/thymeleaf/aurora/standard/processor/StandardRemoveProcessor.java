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
package org.thymeleaf.aurora.standard.processor;

import org.thymeleaf.aurora.context.ITemplateProcessingContext;
import org.thymeleaf.aurora.engine.IElementTagActionHandler;
import org.thymeleaf.aurora.engine.IProcessableElementTag;
import org.thymeleaf.aurora.processor.element.AbstractAttributeMatchingHTMLElementProcessor;

/**
 *
 * @author Daniel Fern&aacute;ndez
 *
 * @since 3.0.0
 *
 */
public class StandardRemoveProcessor extends AbstractAttributeMatchingHTMLElementProcessor {


    public StandardRemoveProcessor() {
        super("remove", 90);
    }



    public void process(
            final ITemplateProcessingContext processingContext,
            final IProcessableElementTag tag,
            final IElementTagActionHandler actionHandler) {

        final String value = tag.getAttributes().getValue(getDialectPrefix(), "remove");
        if ("tag".equals(value)) {
            actionHandler.removeTag();
        } else if ("all".equals(value)) {
            actionHandler.removeElement();
        } else {
            System.err.printf("UNKNOWN VALUE FOR th:remove : " + value);
        }

    }


}
