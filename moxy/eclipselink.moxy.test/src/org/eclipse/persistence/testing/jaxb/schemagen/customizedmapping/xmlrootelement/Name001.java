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
package org.eclipse.persistence.testing.jaxb.schemagen.customizedmapping.xmlrootelement;

import javax.xml.bind.annotation.*;

/**
 * Mapping:  Class to Element Declaration
 * if @XmlRootElement.name() is ##default, then the XML name derived
 * from the class name as specified:
 * A class name is mapped to an XML name by decapitalization
 * using java.beans.Introspector.decapitalize(class name ).
 */
@XmlRootElement(name="##default")
@XmlType(propOrder={"b001", "bt01", "d001", "f001", "i001", "l001", "s001", "sh01"})
public class Name001 {

    public String  s001;
    public boolean b001;
    public int     i001;
    public byte    bt01;
    public short   sh01;
    public long    l001;
    public float   f001;
    public double  d001;

    public Name001() {}
}
