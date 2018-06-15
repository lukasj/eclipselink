/*******************************************************************************
 * Copyright (c) 2011, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Blaise Doughan - 2.2 - initial implementation
 ******************************************************************************/
// Contributors:
//     Blaise Doughan - 2.2 - initial implementation
package org.eclipse.persistence.testing.jaxb.xmlmarshaller.locator;

public class ElementTestCases extends LocatorTestCase {

    public ElementTestCases(String name) {
        super(name);
    }

    @Override
    public Class[] getClasses() {
        Class[] classes = {ElementRoot.class};
        return classes;
    }

    @Override
    public ElementRoot setupRootObject() {
        ElementRoot control = new ElementRoot();
        control.setName("123456789");
        control.setChild(child);
        return control;
    }

}
