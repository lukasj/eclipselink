/*******************************************************************************
 * Copyright (c) 2014, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Martin Vojtek - July 7/2014
 ******************************************************************************/
// Contributors:
// Martin Vojtek - July 7/2014
package org.eclipse.persistence.testing.jaxb.annotations.xmlnullpolicy.nillabletype;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@org.eclipse.persistence.oxm.annotations.XmlNullPolicy(nullRepresentationForXml = org.eclipse.persistence.oxm.annotations.XmlMarshalNullRepresentation.EMPTY_NODE)
public class NillableRoot {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @XmlElement(nillable = true)
    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @XmlElement(nillable = true)
    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

}
