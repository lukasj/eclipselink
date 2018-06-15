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
 * dmccann - August 24/2010 - 2.2 - Initial implementation
 ******************************************************************************/
// Contributors:
// dmccann - August 24/2010 - 2.2 - Initial implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmldiscriminator;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

@XmlRootElement(name = "vehicle-data")
@XmlDiscriminatorNode("@vtype")
@XmlDiscriminatorValue("vehicle")
public class Vehicle {
    public String model;
    public String manufacturer;
    @XmlElement(name = "top-speed")
    public int topSpeed;
}
