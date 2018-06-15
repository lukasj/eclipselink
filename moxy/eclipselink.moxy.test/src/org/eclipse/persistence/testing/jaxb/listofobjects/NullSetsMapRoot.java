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
 *     Blaise Doughan - 2.4 - initial implementation
 ******************************************************************************/
// Contributors:
//     Blaise Doughan - 2.4 - initial implementation
package org.eclipse.persistence.testing.jaxb.listofobjects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NullSetsMapRoot {

    private NullSetsMap nullSetsMap = new NullSetsMap();

    public NullSetsMap getNullSetsMap() {
        return nullSetsMap;
    }

    public void setNullSetsMap(NullSetsMap nullSetsMap) {
        this.nullSetsMap = nullSetsMap;
    }

}
