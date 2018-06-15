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
 * dmccann - May 29/2009 - 2.0 - Initial implementation
 ******************************************************************************/
// Contributors:
// dmccann - May 29/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.jaxb.schemagen.customizedmapping.xmlelementref;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.testing.jaxb.schemagen.employee.Department;

@XmlRootElement(name="employee")
public class Employee {
    public String name;

    @XmlElementRef
    public ArrayList<Address> otherAddresses;
}
