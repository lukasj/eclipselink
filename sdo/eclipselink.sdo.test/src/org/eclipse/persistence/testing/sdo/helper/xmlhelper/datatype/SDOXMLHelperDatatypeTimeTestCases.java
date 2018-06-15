/*******************************************************************************
* Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
* This program and the accompanying materials are made available under the terms
* of the Eclipse Public License v1.0 and Eclipse Distribution License v1.0
* which accompanies this distribution.
*
* The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
* and the Eclipse Distribution License is available at
* http://www.eclipse.org/org/documents/edl-v10.php.
*
* Contributors:
* rbarkhouse - May 26 2008 - 1.0M8 - Initial implementation
******************************************************************************/
// Contributors:
// rbarkhouse - May 26 2008 - 1.0M8 - Initial implementation

package org.eclipse.persistence.testing.sdo.helper.xmlhelper.datatype;

import org.eclipse.persistence.sdo.SDOConstants;
import org.eclipse.persistence.sdo.SDOType;

import junit.textui.TestRunner;

public class SDOXMLHelperDatatypeTimeTestCases extends SDOXMLHelperDatatypeTestCase {

    public SDOXMLHelperDatatypeTimeTestCases(String name) {
        super(name);
    }

    public static void main(String[] args) {
        String[] arguments = { "-c", "org.eclipse.persistence.testing.sdo.helper.xmlhelper.datatype.SDOXMLHelperDatatypeTimeTestCases" };
        TestRunner.main(arguments);
    }

    protected Class getDatatypeJavaClass() {
        return String.class;
    }

    protected SDOType getValueType() {
        return SDOConstants.SDO_TIME;
    }

    protected String getControlFileName() {
        return ("./org/eclipse/persistence/testing/sdo/helper/xmlhelper/datatype/myTime-1.xml");
    }

    protected String getControlRootURI() {
        return "myTime-NS";
    }

    protected String getControlRootName() {
        return "myTime";
    }

    protected String getSchemaNameForUserDefinedType() {
        return getSchemaLocation() + "myTime.xsd";
    }

    protected String getSchemaNameForBuiltinType() {
        return getSchemaLocation() + "myTime-builtin.xsd";
    }

}
