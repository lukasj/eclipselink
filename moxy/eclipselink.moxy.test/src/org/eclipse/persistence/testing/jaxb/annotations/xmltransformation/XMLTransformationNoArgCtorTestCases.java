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
 * Denise Smith - 2.3
 ******************************************************************************/
// Contributors:
// Denise Smith - 2.3
package org.eclipse.persistence.testing.jaxb.annotations.xmltransformation;

import org.eclipse.persistence.testing.jaxb.JAXBTestCases;
import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

public class XMLTransformationNoArgCtorTestCases extends JAXBWithJSONTestCases{
    public XMLTransformationNoArgCtorTestCases(String name) throws Exception {
        super(name);
        setClasses(new Class[] {EmployeeWithAddressAndTransformer.class});
        setControlDocument("org/eclipse/persistence/testing/jaxb/annotations/xmltransformation/employee.xml");
        setControlJSON("org/eclipse/persistence/testing/jaxb/annotations/xmltransformation/employee.json");
    }

    public Object getControlObject() {
        EmployeeWithAddressAndTransformer emp = new EmployeeWithAddressAndTransformer();
        emp.name = "John Smith";
        AddressNoCtor address = new AddressNoCtor("theStreet", "theCity");
        emp.address = address;
        return emp;
    }
}
