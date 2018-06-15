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
 *     Blaise Doughan - 2.2 - initial implementation
 ******************************************************************************/
// Contributors:
//     Blaise Doughan - 2.2 - initial implementation
package org.eclipse.persistence.testing.jaxb.xmlmarshaller.locator;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="root")
@XmlType(propOrder={"name", "child"})
public class AnyCollectionRoot {

    private String name;
    private List<Object> child;

    public AnyCollectionRoot() {
        child = new ArrayList<Object>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAnyElement(lax=true)
    public List<Object> getChild() {
        return child;
    }

    public void setChild(List<Object> child) {
        this.child = child;
    }

}
