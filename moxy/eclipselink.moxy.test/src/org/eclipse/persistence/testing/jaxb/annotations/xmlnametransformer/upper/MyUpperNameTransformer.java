/*******************************************************************************
 * Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Denise Smith - 2.3
 ******************************************************************************/
// Contributors:
//     Denise Smith - 2.3
package org.eclipse.persistence.testing.jaxb.annotations.xmlnametransformer.upper;

import java.beans.Introspector;

import org.eclipse.persistence.oxm.XMLNameTransformer;

public class MyUpperNameTransformer implements XMLNameTransformer{

    public String transformTypeName(String name) {
        return name.toUpperCase();
    }

    public String transformElementName(String name) {
        return name.toUpperCase();
    }

    public String transformAttributeName(String name) {
        return name.toUpperCase();
    }

    public String transformRootElementName(String name) {
         name = name.substring(name.lastIndexOf('.') + 1);
        return name.toUpperCase();
    }

}
