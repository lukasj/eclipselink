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
 *  - rbarkhouse - 05 September 2012 - 2.4 - Initial implementation
 ******************************************************************************/
// Contributors:
//  - rbarkhouse - 05 September 2012 - 2.4 - Initial implementation
package org.eclipse.persistence.testing.jaxb.typemappinginfo.parray;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.jaxb.TypeMappingInfo;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.eclipse.persistence.jaxb.TypeMappingInfo.ElementScope;
import org.eclipse.persistence.oxm.MediaType;
import org.eclipse.persistence.oxm.XMLConstants;
import org.eclipse.persistence.testing.jaxb.typemappinginfo.TypeMappingInfoWithJSONTestCases;

public class StringArrayTestsCases extends TypeMappingInfoWithJSONTestCases {

    protected final static String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/typemappinginfo/parray/string.xml";
    protected final static String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/typemappinginfo/parray/string.json";

    public String[] stringArrayField;

    public StringArrayTestsCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
        setTypeMappingInfos(getTypeMappingInfos());
    }

    protected TypeMappingInfo[] getTypeMappingInfos() throws Exception {
        if (typeMappingInfos == null) {
            typeMappingInfos = new TypeMappingInfo[1];
            TypeMappingInfo tmi = new TypeMappingInfo();
            tmi.setXmlTagName(new QName("http://jaxb.dev.java.net/array", "testTagName"));
            tmi.setElementScope(ElementScope.Global);
            tmi.setType(getClass().getField("stringArrayField").getGenericType());
            typeMappingInfos[0] = tmi;
        }
        return typeMappingInfos;
    }

    protected Object getControlObject() {
        QName qname = new QName("http://jaxb.dev.java.net/array", "testTagName");

        String[] value = new String[3];
        value[0] = "one";
        value[1] = "two";
        value[2] = "three";

        JAXBElement jaxbElement = new JAXBElement(qname, String[].class, value);
        return jaxbElement;
    }

    public Map<String, InputStream> getControlSchemaFiles() {
        InputStream instream = ClassLoader.getSystemResourceAsStream("org/eclipse/persistence/testing/jaxb/typemappinginfo/parray/string.xsd");

        Map<String, InputStream> controlSchema = new HashMap<String, InputStream>();
        controlSchema.put("http://jaxb.dev.java.net/array", instream);
        return controlSchema;
    }

}
