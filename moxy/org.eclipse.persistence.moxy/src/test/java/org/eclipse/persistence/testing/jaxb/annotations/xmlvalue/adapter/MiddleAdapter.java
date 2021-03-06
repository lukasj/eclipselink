/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Blaise Doughan - 2.3.3 - initial implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmlvalue.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class MiddleAdapter extends XmlAdapter<MiddleAdapted, Middle> {

    @Override
    public Middle unmarshal(MiddleAdapted middleAdapted) throws Exception {
        if(null == middleAdapted) {
            return null;
        }
        return new Middle(middleAdapted.value);
    }

    @Override
    public MiddleAdapted marshal(Middle middle) throws Exception {
        if(null == middle) {
            return null;
        }
        MiddleAdapted middleAdapted = new MiddleAdapted();
        middleAdapted.value = middle.value;
        return middleAdapted;
    }

}
