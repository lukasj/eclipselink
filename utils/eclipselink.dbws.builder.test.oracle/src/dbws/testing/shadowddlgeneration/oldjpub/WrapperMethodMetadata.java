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
 *     Mike Norman - from Proof-of-concept, become production code
 ******************************************************************************/
// Contributors:
//     Mike Norman - from Proof-of-concept, become production code
package dbws.testing.shadowddlgeneration.oldjpub;

public class WrapperMethodMetadata {

    protected String name;
    protected String[] paramTypes;
    protected String[] paramNames;
    protected String returnType;

    public WrapperMethodMetadata(String name, String[] paramTypes, String[] paramNames,
        String returnType) {
        this.name = name;
        this.paramTypes = paramTypes;
        this.paramNames = paramNames;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public String[] getParamTypes() {
        return paramTypes;
    }

    public String[] getParamNames() {
        return paramNames;
    }

    public String getReturnType() {
        return returnType;
    }
}
