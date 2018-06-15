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
package org.eclipse.persistence.testing.oxm.mappings.directtofield.union;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.eclipse.persistence.testing.oxm.mappings.directtofield.union.xmlattribute.SimpleUnionXMLAttributeTestCases;

public class UnionTestCases extends TestCase {
    public static Test suite() {
        TestSuite suite = new TestSuite("Union Test Cases");

        suite.addTestSuite(SimpleUnionTestCases.class);
        suite.addTestSuite(SimpleUnionNoConversionTestCases.class);
        suite.addTestSuite(UnionDateTimeToDateTestCases.class);
        suite.addTestSuite(UnionWithTypeAttributeTestCases.class);
        suite.addTestSuite(UnionWithTypeAttributeNotSetTestCases.class);
        suite.addTestSuite(SimpleUnionXMLAttributeTestCases.class);

        return suite;
    }

    public static void main(String[] args) {
        String[] arguments = { "-c", "org.eclipse.persistence.testing.oxm.mappings.directtofield.union.UnionTestCases" };
        junit.textui.TestRunner.main(arguments);
    }
}
