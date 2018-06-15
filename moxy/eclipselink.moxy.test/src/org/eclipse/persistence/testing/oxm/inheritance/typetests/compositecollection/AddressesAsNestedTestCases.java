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
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/
// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.oxm.inheritance.typetests.compositecollection;

import java.util.ArrayList;
import org.eclipse.persistence.testing.oxm.inheritance.typetests.Address;
import org.eclipse.persistence.testing.oxm.mappings.XMLWithJSONMappingTestCases;

public class AddressesAsNestedTestCases extends XMLWithJSONMappingTestCases {
    private static final String READ_DOC = "org/eclipse/persistence/testing/oxm/inheritance/typetests/employee_with_addresses_noxsi.xml";
    private static final String JSON_READ_DOC = "org/eclipse/persistence/testing/oxm/inheritance/typetests/employee_with_addresses_noxsi.json";

    public AddressesAsNestedTestCases(String name) throws Exception {
        super(name);
        setProject(new COMCollectionTypeProject());
        setControlDocument(READ_DOC);
        setControlJSON(JSON_READ_DOC);
    }

    public Object getControlObject() {
        Employee emp = new Employee();
        ArrayList adds = new ArrayList();
        Address add = new Address();
        add.setId("123");
        add.setStreet("1 A Street");
        adds.add(add);
        add = new Address();
        add.setId("456");
        add.setStreet("2 A Street");
        adds.add(add);
        add = new Address();
        add.setId("789");
        add.setStreet("3 A Street");
        adds.add(add);
        emp.setAddresses(adds);
        return emp;
    }

    public static void main(String[] args) {
        String[] arguments = { "-c", "org.eclipse.persistence.testing.oxm.inheritance.typetests.compositecollection.AddressesAsNestedTestCases" };
        junit.textui.TestRunner.main(arguments);
    }
}
