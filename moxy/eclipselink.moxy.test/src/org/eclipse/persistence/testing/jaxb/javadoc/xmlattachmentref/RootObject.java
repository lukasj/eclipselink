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
 *     Praba Vijayaratnam - 2.3 - initial implementation
 ******************************************************************************/
// Contributors:
//     Praba Vijayaratnam - 2.3 - initial implementation
package org.eclipse.persistence.testing.jaxb.javadoc.xmlattachmentref;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAttachmentRef;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RootObject {

    @XmlElement
    @XmlAttachmentRef
    public DataHandler data;

    @XmlElement
    @XmlAttachmentRef
    public DataHandler body;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RootObject)) {
            return false;
        }
        RootObject rootObj = (RootObject) obj;
        return (rootObj.data.equals(data)) && rootObj.body.equals(body);
    }
}
