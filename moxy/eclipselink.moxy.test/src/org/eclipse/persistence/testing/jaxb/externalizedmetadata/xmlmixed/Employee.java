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
 * dmccann - November 04/2009 - 2.0 - Initial implementation
 ******************************************************************************/
// Contributors:
// dmccann - November 04/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.xmlmixed;

@javax.xml.bind.annotation.XmlRootElement
public class Employee {
    public int a;
    public String b;

    /*
     * The following annotations will be done via XML metadata:
     *
     * @javax.xml.bind.annotation.XmlAnyElement
     * @javax.xml.bind.annotation.XmlMixed
     */
    public java.util.List<Object> stuff;
}
