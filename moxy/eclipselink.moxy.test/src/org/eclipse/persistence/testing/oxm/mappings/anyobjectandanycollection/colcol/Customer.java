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
package org.eclipse.persistence.testing.oxm.mappings.anyobjectandanycollection.colcol;

import java.util.Vector;

public class Customer {
    private Vector anyObject;
    private Vector contactMethods;

    public Customer() {
        super();
    }

    public String toString() {
        return "Customer[" + "\n\tContactMethods: " + getContactMethods() + " anyObject: " + getAnyObject() + "]";
    }

    public Vector getAnyObject() {
        return anyObject;
    }

    public void setAnyObject(Vector anyObject) {
        this.anyObject = anyObject;
    }

    public Vector getContactMethods() {
        return contactMethods;
    }

    public void setContactMethods(Vector contactMethods) {
        this.contactMethods = contactMethods;
    }

    public boolean equals(Object object) {
        if (object instanceof Customer) {
            Customer anObject = (Customer)object;

            // check all null case 0000
            if ((anyObject == null) && (anObject.getAnyObject() == null) &&//
                    (contactMethods == null) && (anObject.getContactMethods() == null)) {
                return true;
            }

            // check case 0101
            if ((anyObject == null) && (anObject.getAnyObject() == null) &&//
                    (contactMethods != null) && (anObject.getContactMethods() != null)) {
                return contactMethods.equals(anObject.getContactMethods());
            }

            // check case 1010
            if ((anyObject != null) && (anObject.getAnyObject() != null) &&//
                    (contactMethods == null) && (anObject.getContactMethods() == null)) {
                return anyObject.equals(anObject.getAnyObject());
            }

            // check case 1111
            if ((anyObject != null) && (anObject.getAnyObject() != null) &&//
                    (contactMethods != null) && (anObject.getContactMethods() != null)) {
                if (anyObject.equals(anObject.getAnyObject())) {
                    return contactMethods.equals(anObject.getContactMethods());
                } else {
                    return false;
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
