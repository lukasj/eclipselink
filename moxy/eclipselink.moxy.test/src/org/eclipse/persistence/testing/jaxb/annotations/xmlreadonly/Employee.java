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
package org.eclipse.persistence.testing.jaxb.annotations.xmlreadonly;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlReadOnly;

@XmlRootElement(name="employee")
public class Employee {
    public String name;

    @XmlReadOnly
    public String readOnlyField;

    public boolean equals(Object obj) {
        if(obj instanceof Employee) {
            return name.equals(((Employee)obj).name) && readOnlyField.equals(((Employee)obj).readOnlyField);
        }
        return false;
    }

}
