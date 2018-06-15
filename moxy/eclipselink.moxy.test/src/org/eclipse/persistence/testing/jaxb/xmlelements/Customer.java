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
 *     Matt MacIvor - 2.4.1 - Initial Implementation
 ******************************************************************************/
// Contributors:
//     Matt MacIvor - 2.4.1 - Initial Implementation
package org.eclipse.persistence.testing.jaxb.xmlelements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    @XmlElements({
        @XmlElement(name="address", type=Address.class),
        @XmlElement(name="address", type=Link.class)
    })
    public Object address;

    public boolean equals(Object obj) {
        Customer cust = (Customer)obj;
        return address == cust.address || address.equals(address);
    }
}
