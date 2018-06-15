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
 *     Praba Vijayaratnam - 2.3 - initial implementation
 ******************************************************************************/
// Contributors:
//     Praba Vijayaratnam - 2.3 - initial implementation
package org.eclipse.persistence.testing.jaxb.javadoc.xmltype;

import javax.xml.bind.annotation.*;

@XmlType(name="USAddressType", factoryClass=USAddressFactory.class,factoryMethod="getUSAddress")

public class USAddress {

    private String city, name, state, street;
    private int zip;

    public USAddress(String name, String street, String city, String state, int zip){
        this.name=name;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }


 /*   public boolean equals(Object obj) {
        USAddress addr = (USAddress)obj;
        return name.equals(addr.name) && city.equals(addr.city) && street.equals(addr.street) && state.equals(addr.state);
    }
    */
}

