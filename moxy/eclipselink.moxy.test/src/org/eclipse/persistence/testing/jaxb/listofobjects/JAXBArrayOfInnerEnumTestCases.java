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
 *     Matt MacIvor - 2.3 - initial implementation
 ******************************************************************************/
// Contributors:
//     Matt MacIvor - 2.3 - initial implementation
package org.eclipse.persistence.testing.jaxb.listofobjects;

import org.eclipse.persistence.testing.jaxb.JAXBTestCases;
import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

import junit.framework.TestCase;

public class JAXBArrayOfInnerEnumTestCases extends JAXBWithJSONTestCases {
    public static String XML_RESOURCE="org/eclipse/persistence/testing/jaxb/listofobjects/innerenum.xml";
    public static String JSON_RESOURCE="org/eclipse/persistence/testing/jaxb/listofobjects/innerenum.json";

    public JAXBArrayOfInnerEnumTestCases(String name) throws Exception {
        super(name);
        setClasses(new Class[]{InnerEnumWrapper.class});
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
    }

    @Override
    protected Object getControlObject() {
        return new InnerEnumWrapper();
    }

}
