/*******************************************************************************
 * Copyright (c) 2011, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *  - rbarkhouse - 27 January 2012 - 2.3.3 - Initial implementation
 ******************************************************************************/
// Contributors:
//  - rbarkhouse - 27 January 2012 - 2.3.3 - Initial implementation
package org.eclipse.persistence.testing.jaxb.collections;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CollectionHolderWrappersNillableInitialized extends CollectionHolderWrappersNillable {

    public static final List TEST_LIST = new ArrayList();

    public CollectionHolderWrappersNillableInitialized() {
        collection1 = TEST_LIST;
        collection2 = TEST_LIST;
        collection3 = TEST_LIST;
        collection4 = TEST_LIST;
        collection5 = TEST_LIST;
        collection6 = TEST_LIST;
        collection7 = TEST_LIST;
    }

}
