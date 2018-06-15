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
package org.eclipse.persistence.testing.oxm.mappings.directcollection.identifiedbyposition.withgroupingelement;

import java.util.Vector;

import org.eclipse.persistence.testing.oxm.mappings.XMLMappingTestCases;
import org.eclipse.persistence.testing.oxm.mappings.directcollection.Employee;

public class DirectCollectionWithGroupingElementIdentifiedByPositionNullTestCases extends XMLMappingTestCases
{
    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/oxm/mappings/directcollection/identifiedbyposition/withgroupingelement/DirectCollectionWithGroupingElementNull.xml";
  private final static int CONTROL_ID = 123;
  private final static String CONTROL_RESPONSIBILITY4 = "rake the leaves";
  private final static String CONTROL_RESPONSIBILITY5 = "mow the lawn";

    public DirectCollectionWithGroupingElementIdentifiedByPositionNullTestCases(String name) throws Exception
    {
        super(name);
    setControlDocument(XML_RESOURCE);
        setProject(new DirectCollectionWithGroupingElementIdentifiedByPositionProject());
    }

    protected Object getControlObject() {
        Vector responsibilities = null;

        Vector responsibilities2 = new Vector();
        responsibilities2.addElement(CONTROL_RESPONSIBILITY4);
        responsibilities2.addElement(CONTROL_RESPONSIBILITY5);

    Employee employee = new Employee();
    employee.setID(CONTROL_ID);
        employee.setResponsibilities(responsibilities);
        employee.setOutdoorResponsibilities(responsibilities2);
    return employee;
  }

    /*
     * Null collection is treated as empty on a read
     */
    public Object getReadControlObject() {

        Vector responsibilities2 = new Vector();
        responsibilities2.addElement(CONTROL_RESPONSIBILITY4);
        responsibilities2.addElement(CONTROL_RESPONSIBILITY5);

    Employee employee = new Employee();
    employee.setID(CONTROL_ID);
        employee.setResponsibilities(new Vector());
        employee.setOutdoorResponsibilities(responsibilities2);
    return employee;
    }
}
