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
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/
// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.sdo.helper.xsdhelper.generate.slr;

import org.eclipse.persistence.sdo.helper.SchemaLocationResolver;
import commonj.sdo.Type;

public class Example4SLRMultiple implements SchemaLocationResolver {
    public String resolveSchemaLocation(Type sourceType, Type referencedType) {
        if(referencedType.getURI().contains("commonj.sdo")) {
            return null;
        }
        return referencedType.getName() + ".xsd";
    }
}
