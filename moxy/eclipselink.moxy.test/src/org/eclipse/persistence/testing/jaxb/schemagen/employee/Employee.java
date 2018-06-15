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
package org.eclipse.persistence.testing.jaxb.schemagen.employee;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="employee-data")
@XmlType(name = "employee-type", propOrder = {"firstName", "birthday", "id", "age", "lastName", "address", "department",
    "startTime", "phoneNumbers", "responsibilities", "peeps"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee
{
    @DecimalMax(value="10")
    @XmlAttribute(name="id", required=true)
    public int id;

    @Size(min=2, max=10)
    @XmlElement(required = true)
    public String firstName;

    public String lastName;

    @Valid
    @XmlMixed
    public Address address;

    @XmlAttribute
    public Department department;

    @XmlElement(name="phone-number")
    public java.util.Collection<PhoneNumber> phoneNumbers;

    @XmlSchemaType(name="date")
    public java.util.Calendar birthday;

    public java.util.Calendar startTime;

    public int age;

    @XmlElement(name= "responsibilities")
    @XmlList
    public java.util.Collection<String> responsibilities;

    @XmlElement(name="peep", namespace="examplenamespace")
    public java.util.Collection<Employee> peeps;
}
