/*
 * Copyright (c) 1998, 2020 Oracle and/or its affiliates. All rights reserved.
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
//    2.3.1
@XmlSchema(
     namespace = "someuri",
     xmlns = { @XmlNs( prefix = "testPrefix",
                       namespaceURI="someuri") }
          )
@XmlAccessorType(PUBLIC_MEMBER)
package org.eclipse.persistence.testing.jaxb.typemappinginfo.object.prefixes;

import jakarta.xml.bind.annotation.XmlSchema;
import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlAccessorType;
import static jakarta.xml.bind.annotation.XmlAccessType.PUBLIC_MEMBER;
