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
 *     Denise Smith - August 2011 - 2.4 - Initial implementation
 ******************************************************************************/
// Contributors:
//     Denise Smith - August 2011 - 2.4 - Initial implementation
package org.eclipse.persistence.testing.jaxb.json.norootelement;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.testing.jaxb.json.JSONMarshalUnmarshalTestCases;

public class NoRootElementNSTestCases extends JSONMarshalUnmarshalTestCases {
    private final static String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/json/norootelement/addressNS.json";

    public NoRootElementNSTestCases(String name) throws Exception {
        super(name);
        setControlJSON(JSON_RESOURCE);
        setClasses(new Class[]{Address.class});

    }

    public Object getControlObject() {
        Address addr = new Address();
        addr.setId(10);
        addr.setCity("Ottawa");
        addr.setStreet("Main street");

        return addr;
    }

    @Override
    public Class getUnmarshalClass(){
        return Address.class;
    }

    public Object getReadControlObject(){
        QName name = new QName("");
        JAXBElement jbe = new JAXBElement<Address>(name, Address.class, (Address)getControlObject());
        return jbe;
    }

     public Map getProperties(){
            Map props = new HashMap();

            Map<String, String> namespaceMap = new HashMap<String, String>();

            namespaceMap.put("namespace1","ns0");

            props.put(JAXBContextProperties.NAMESPACE_PREFIX_MAPPER, namespaceMap);
            props.put(JAXBContextProperties.JSON_INCLUDE_ROOT, Boolean.FALSE);
            return props;
        }

}

