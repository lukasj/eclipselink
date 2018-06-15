/*******************************************************************************
 * Copyright (c) 2012, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *  - rbarkhouse - 30 August 2012 - 2.4 - Initial implementation
 ******************************************************************************/
// Contributors:
//  - rbarkhouse - 30 August 2012 - 2.4 - Initial implementation
package org.eclipse.persistence.testing.jaxb.xmladapter.inheritance.generics;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class GenericAdapter<T extends Linkable> extends XmlAdapter<T, T> {

    private Map<String, T> cache = new HashMap<String, T>();

    public void cacheObject(T linkable) {
        cache.put(linkable.getHref(), linkable);
    }

    @Override
    public T marshal(T v) throws Exception {
        return v;
    }

    @Override
    public T unmarshal(T linkable) throws Exception {
        if(null == linkable.getHref()) {
            return linkable;
        }
        return cache.get(linkable.getHref());
    }

}
