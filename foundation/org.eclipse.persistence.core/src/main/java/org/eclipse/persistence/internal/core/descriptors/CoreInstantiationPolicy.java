/*
 * Copyright (c) 2012, 2021 Oracle and/or its affiliates. All rights reserved.
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
//     Blaise Doughan - 2.5 - initial implementation
package org.eclipse.persistence.internal.core.descriptors;

public abstract class CoreInstantiationPolicy {

    /**
     * Default constructor.
     */
    protected CoreInstantiationPolicy() {
    }

    /**
     * Build and return a new instance, using the appropriate mechanism.
     */
    public abstract Object buildNewInstance();

    public abstract void useFactoryInstantiationPolicy(String factoryClassName, String methodName);
}
