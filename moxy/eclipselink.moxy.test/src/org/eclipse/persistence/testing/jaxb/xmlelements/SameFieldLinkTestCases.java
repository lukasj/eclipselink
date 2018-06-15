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
 *     Matt MacIvor - 2.4.1 - Initial Implementation
 ******************************************************************************/
// Contributors:
//     Matt MacIvor - 2.4.1 - Initial Implementation
package org.eclipse.persistence.testing.jaxb.xmlelements;

import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

public class SameFieldLinkTestCases extends JAXBWithJSONTestCases{

    private static final String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlelements/customer_link.xml";
    private static final String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlelements/customer_link.json";

    public SameFieldLinkTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
        setClasses(new Class[]{Customer.class});
    }

    @Override
    protected Object getControlObject() {
        Customer cust = new Customer();
        Link link = new Link();
        link.href = "link_location";
        cust.address = link;
        return cust;
    }

    @Override
    public boolean isUnmarshalTest() {
        return false;
    }

}
