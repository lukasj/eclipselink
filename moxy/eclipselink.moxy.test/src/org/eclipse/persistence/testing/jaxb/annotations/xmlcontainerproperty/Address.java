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
* mmacivor - January 09, 2009 - 1.1 - Initial implementation
******************************************************************************/
// Contributors:
// mmacivor - January 09, 2009 - 1.1 - Initial implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmlcontainerproperty;

import javax.xml.bind.annotation.*;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;


public class Address {
    public String street;
    public String city;

    @XmlInverseReference(mappedBy="address")
    public Employee owningEmployee;

    public boolean equals(Object o) {
        if(!(o instanceof Address)) {
            return false;
        }
        Address obj = (Address)o;
        boolean equal = true;

        equal = equal && street.equals(obj.street);
        equal = equal && city.equals(obj.city);

        equal = equal && owningEmployee.id == obj.owningEmployee.id;

        return equal;
    }
}
