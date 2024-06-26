/*
 * Copyright (c) 2011, 2021 Oracle and/or its affiliates. All rights reserved.
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
//     Blaise Doughan - 2.4 - initial implementation
package org.eclipse.persistence.testing.jaxb.listofobjects;

import java.io.StringWriter;

import jakarta.xml.bind.Binder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.w3c.dom.Document;

import junit.framework.TestCase;
import org.w3c.dom.Node;

public class NullContainerTestCases extends TestCase {

    public void testMarshal() throws Exception {
        JAXBContext jc = JAXBContextFactory.createContext(new Class<?>[] {NullContainerRoot.class}, null);

        NullContainerRoot ncr = new NullContainerRoot();

        Marshaller marshaller = jc.createMarshaller();
        marshaller.marshal(ncr, new StringWriter());
    }

    public void testBinderMarshal() throws Exception {
        JAXBContext jc = JAXBContextFactory.createContext(new Class<?>[] {NullContainerRoot.class}, null);

        NullContainerRoot ncr = new NullContainerRoot();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.newDocument();
        Binder<Node> binder = jc.createBinder();
        binder.marshal(ncr, document);
    }

}
