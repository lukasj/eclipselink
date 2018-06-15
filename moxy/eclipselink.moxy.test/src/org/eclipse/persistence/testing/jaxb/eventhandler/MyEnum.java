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
 *    Denise Smith - May 2012
 ******************************************************************************/
// Contributors:
//    Denise Smith - May 2012
package org.eclipse.persistence.testing.jaxb.eventhandler;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(Integer.class)
public enum MyEnum {
    @XmlEnumValue("1") A,
    @XmlEnumValue("2") B
}
