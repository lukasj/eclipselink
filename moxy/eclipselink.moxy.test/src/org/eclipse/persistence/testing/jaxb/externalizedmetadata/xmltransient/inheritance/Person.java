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
 * dmccann - July 09/2009 - 2.0 - Initial implementation
 ******************************************************************************/
// Contributors:
// dmccann - July 09/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.xmltransient.inheritance;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class Person {
    public String name;
    public int age;

    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person personObj = (Person)obj;
            return name.equals(personObj.name) && age == personObj.age;
        }
        return false;
    }
}
