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
 *     Blaise Doughan - 2.2 - initial implementation
 ******************************************************************************/
// Contributors:
//     Blaise Doughan - 2.2 - initial implementation
package org.eclipse.persistence.testing.jaxb.xmladapter.direct.objectlist;

public class PhoneNumber {

    String value;

    public PhoneNumber(String value) {
        this.value = value;
    }

    public boolean equals(Object object) {
        if(null == object || PhoneNumber.class != object.getClass()) {
            return false;
        }
        PhoneNumber test = (PhoneNumber) object;
        if(null == value) {
            return null == test.value;
        } else {
            return value.equals(test.value);
        }
    }

}
