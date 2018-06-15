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
 *     Blaise Doughan - 2.3.3 - initial implementation
 ******************************************************************************/
// Contributors:
//     Blaise Doughan - 2.3.3 - initial implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmlvalue.integer;

import javax.xml.bind.annotation.XmlValue;

public class Bottom {

    @XmlValue
    public Integer value;

    @Override
    public boolean equals(Object obj) {
        if(null == obj || obj.getClass() != this.getClass()) {
            return false;
        }
        Bottom test = (Bottom) obj;
        if(null == value) {
            return null == test.value;
        }
        return value.equals(test.value);
     }

}
