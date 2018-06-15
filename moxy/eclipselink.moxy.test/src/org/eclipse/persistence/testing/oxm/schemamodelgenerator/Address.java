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
* dmccann - Mar 2/2009 - 2.0 - Initial implementation
******************************************************************************/
// Contributors:
// dmccann - Mar 2/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.oxm.schemamodelgenerator;

import java.util.Collection;

public class Address {
    public String id;                       // XMLDirectMapping - PK
    public String street;                   // XMLDirectMapping
    public String city;                     // XMLDirectMapping - PK
    public String country;                  // XMLDirectMapping
    public String postalCode;               // XMLDirectMapping
    public Object thingy;                   // XMLAnyObjectMapping
    public Collection<Employee> occupants;  // XMLCollectionReferenceMapping

    public Address() {}
}
