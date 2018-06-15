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
package org.eclipse.persistence.testing.oxm.mappings.xmlfragment;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class XMLFragmentMappingTestSuite extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite("XMLFragment Mapping Test Suite");
        suite.addTestSuite(XMLFragmentElementTestCases.class);
        suite.addTestSuite(XMLFragmentAttributeTestCases.class);
        suite.addTestSuite(XMLFragmentTextNodeTestCases.class);
        suite.addTestSuite(XMLFragmentNSTestCases.class);
        suite.addTestSuite(XMLFragmentNSAttributeTestCases.class);
        suite.addTestSuite(SelfTestCases.class);
        return suite;
    }

    public static void main(String[] args) {
        String[] arguments = { "-c", "org.eclipse.persistence.testing.oxm.mappings.xmlfragment.XMLFragmentMappingTestSuite" };
        //System.setProperty("useDeploymentXML", "true");
        //System.setProperty("useDocPres", "true");
        //System.setProperty("useLogging", "true");
        //System.setProperty("useSAXParsing", "true");
        junit.textui.TestRunner.main(arguments);
    }
}
