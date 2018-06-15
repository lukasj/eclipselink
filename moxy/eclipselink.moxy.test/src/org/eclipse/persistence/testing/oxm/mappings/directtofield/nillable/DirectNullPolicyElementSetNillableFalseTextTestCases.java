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
 *     Denise Smith - Sepetember 2012
 ******************************************************************************/
// Contributors:
//     Denise Smith - Sepetember 2012
package org.eclipse.persistence.testing.oxm.mappings.directtofield.nillable;

/**
 * Same as super class except the XML document being read has some text
 * after the xsi:nil that should be ignored
 */
public class DirectNullPolicyElementSetNillableFalseTextTestCases extends
        DirectNullPolicyElementSetNillableTestCases {

    protected final static String XML_READ_RESOURCE = //
        "org/eclipse/persistence/testing/oxm/mappings/directtofield/nillable/DirectNullPolicyElementSetNillableFalseText.xml";
    protected final static String XML_WRITE_RESOURCE = //
        "org/eclipse/persistence/testing/oxm/mappings/directtofield/nillable/DirectNullPolicyElementSetNillableFalseTextWrite.xml";
    protected final static String JSON_RESOURCE = //
        "org/eclipse/persistence/testing/oxm/mappings/directtofield/nillable/DirectNullPolicyElementSetNillableFalse.json";


    public DirectNullPolicyElementSetNillableFalseTextTestCases(String name)
            throws Exception {
        super(name);
        setControlDocument(XML_READ_RESOURCE);
        setWriteControlDocument(XML_WRITE_RESOURCE);
        setControlJSON(JSON_RESOURCE);
    }

    protected Object getControlObject() {
        Employee anEmployee = new Employee();
        anEmployee.setId(123);
        anEmployee.setFirstName("abc");
        anEmployee.setLastName("Doe");
        return anEmployee;
    }
}
