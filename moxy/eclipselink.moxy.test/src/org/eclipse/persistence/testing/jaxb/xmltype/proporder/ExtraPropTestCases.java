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
 *     Denise Smith - October 2012
 ******************************************************************************/
// Contributors:
//     Denise Smith - October 2012
package org.eclipse.persistence.testing.jaxb.xmltype.proporder;

import javax.xml.bind.JAXBException;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import junit.framework.TestCase;

public class ExtraPropTestCases extends TestCase {
    public void testInvalidPropOrder() {

        try {
            JAXBContextFactory.createContext(new Class[] {ExtraPropRoot.class}, null);

        } catch(javax.xml.bind.JAXBException e) {
            try {
                throw e.getLinkedException();
            } catch(org.eclipse.persistence.exceptions.JAXBException e2) {
                assertEquals(50012, e2.getErrorCode());
                return;
            } catch(Throwable t) {
                fail();
            }
        fail();
    }
    }
}
