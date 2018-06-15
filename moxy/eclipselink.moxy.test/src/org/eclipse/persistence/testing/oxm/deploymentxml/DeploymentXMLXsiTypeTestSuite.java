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
*     mmacivor - Initial implementation
******************************************************************************/
// Contributors:
//     mmacivor - Initial implementation
package org.eclipse.persistence.testing.oxm.deploymentxml;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.persistence.testing.oxm.deferred.DeferredContentHandlerTestCases;

public class DeploymentXMLXsiTypeTestSuite extends TestCase {
        public static Test suite() {
            TestSuite suite = new TestSuite("DeploymentXMLXsiTypeTestSuite");

            suite.addTestSuite(DeploymentXMLXsiTypeTestCases.class);
            return suite;
        }

}
