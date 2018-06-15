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
 * dmccann - November 23/2010 - 2.2 - Initial implementation
 ******************************************************************************/
// Contributors:
// dmccann - November 23/2010 - 2.2 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.mappings.multiple;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public final class LegAdapter extends XmlAdapter<String, String> {
    public LegAdapter() {}

    public String marshal(String arg0) throws Exception {
        return "CAD$";
    }

    public String unmarshal(String arg0) throws Exception {
        return null;
    }
}
