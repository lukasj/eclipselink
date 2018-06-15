/*******************************************************************************
 * Copyright (c) 2012, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Matt MacIvor - 2.4 - Initial Implementation
 ******************************************************************************/
// Contributors:
//     Matt MacIvor - 2.4 - Initial Implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmlaccessorfactory;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.bind.XmlAccessorFactory;

@XmlRootElement(name="customer")
@XmlAccessorFactory(ClassLevelAccessorFactory.class)
public class CustomerClassOverride {

    public String fieldProperty;
    private String property;


    public String getProperty() {
        return property;
    }

    public void setProperty(String value) {
        property = value;
    }

    public boolean equals(Object obj) {
        CustomerClassOverride cust = (CustomerClassOverride)obj;
        return this.fieldProperty.equals(cust.fieldProperty) && this.property.equals(cust.getProperty());
    }
}
