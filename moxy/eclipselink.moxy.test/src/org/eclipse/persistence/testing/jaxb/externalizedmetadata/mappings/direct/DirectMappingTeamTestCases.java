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
 * dmccann - January 28/2010 - 2.1 - Initial implementation
 ******************************************************************************/
// Contributors:
// dmccann - January 28/2010 - 2.1 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.mappings.direct;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

public class DirectMappingTeamTestCases extends JAXBWithJSONTestCases{

    private static final String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/externalizedmetadata/mappings/direct/team.xml";
    private static final String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/externalizedmetadata/mappings/direct/team.json";

    public DirectMappingTeamTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
        setClasses(new Class[]{Team.class});
    }

    public Map getProperties(){
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("org/eclipse/persistence/testing/jaxb/externalizedmetadata/mappings/direct/team-oxm.xml");

        HashMap<String, Source> metadataSourceMap = new HashMap<String, Source>();
        metadataSourceMap.put("org.eclipse.persistence.testing.jaxb.externalizedmetadata.mappings.direct", new StreamSource(inputStream));
        Map<String, Map<String, Source>> properties = new HashMap<String, Map<String, Source>>();
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, metadataSourceMap);

        return properties;
    }


    public void testSchemaGen() throws Exception{
           List controlSchemas = new ArrayList();
           InputStream is = ClassLoader.getSystemResourceAsStream("org/eclipse/persistence/testing/jaxb/externalizedmetadata/mappings/direct/team.xsd");
           InputStream is2 = ClassLoader.getSystemResourceAsStream("org/eclipse/persistence/testing/jaxb/externalizedmetadata/mappings/direct/team2.xsd");
           InputStream is3 = ClassLoader.getSystemResourceAsStream("org/eclipse/persistence/testing/jaxb/externalizedmetadata/mappings/direct/team3.xsd");
           controlSchemas.add(is);
           controlSchemas.add(is2);
           controlSchemas.add(is3);

           super.testSchemaGen(controlSchemas);
    }

    protected Object getControlObject() {
        Team team = new Team();
        team.address = "theAddress";
        team.personalInfo = "somePersonalInfo";
        return team;
    }

}
