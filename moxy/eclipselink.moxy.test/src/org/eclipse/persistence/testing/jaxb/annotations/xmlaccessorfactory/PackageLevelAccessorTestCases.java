/*******************************************************************************
 * Copyright (c) 2012, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Matt MacIvor - 2.4 - Initial Implementation
 ******************************************************************************/
// Contributors:
//     Matt MacIvor - 2.4 - Initial Implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmlaccessorfactory;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

public class PackageLevelAccessorTestCases extends JAXBWithJSONTestCases {

    private static final String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/annotations/xmlaccessorfactory/customer-package.xml";
    private static final String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/annotations/xmlaccessorfactory/customer-package.json";

    public PackageLevelAccessorTestCases(String name) throws Exception {
        super(name);
        setClasses(new Class[] { CustomerPackageLevel.class });
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
    }

    public Object getControlObject() {
        CustomerPackageLevel cust = new CustomerPackageLevel();
        cust.fieldProperty = "fieldPropertyValue";
        cust.setProperty("propertyValue");

        return cust;
    }

    @Override
    protected Map getProperties() throws JAXBException {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(JAXBContextProperties.XML_ACCESSOR_FACTORY_SUPPORT, true);

        return properties;
    }

}
