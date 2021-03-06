/*
 * Copyright 2006 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.dev.util.xml;

import com.google.gwt.core.ext.UnableToCompleteException;

/**
 * Subclass for converting strings into Integer.
 */
public class AttributeConverterForInteger extends AttributeConverter {

  @Override
  public Object convertToArg(Schema schema, int lineNumber, String elemName,
      String attrName, String attrValue) throws UnableToCompleteException {
    try {
      return Integer.valueOf(attrValue);
    } catch (NumberFormatException e) {
      schema.onBadAttributeValue(lineNumber, elemName, attrName, attrValue,
        Integer.class);
      return null;
    }
  }
}