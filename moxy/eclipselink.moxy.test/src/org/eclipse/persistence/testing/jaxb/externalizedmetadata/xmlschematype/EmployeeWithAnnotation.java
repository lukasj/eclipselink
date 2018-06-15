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
 * dmccann - December 08/2009 - 2.0 - Initial implementation
 * Martin Vojtek - November 14/2014 - 2.6 - Added XmlIDExtension
 ******************************************************************************/
// Contributors:
// dmccann - December 08/2009 - 2.0 - Initial implementation
// Martin Vojtek - November 14/2014 - 2.6 - Added XmlIDExtension
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.xmlschematype;

import org.eclipse.persistence.oxm.annotations.XmlIDExtension;

public class EmployeeWithAnnotation {
    @javax.xml.bind.annotation.XmlAttribute
    @javax.xml.bind.annotation.XmlID
    @XmlIDExtension
    @javax.xml.bind.annotation.XmlSchemaType(name="string")
    public int id;
    @javax.xml.bind.annotation.XmlElement
    @javax.xml.bind.annotation.XmlSchemaType(name="date")
    public java.util.GregorianCalendar hireDate;
}
