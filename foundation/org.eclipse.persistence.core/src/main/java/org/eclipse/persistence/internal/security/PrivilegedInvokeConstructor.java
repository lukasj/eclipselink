/*
 * Copyright (c) 1998, 2021 Oracle and/or its affiliates. All rights reserved.
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
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.internal.security;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.PrivilegedExceptionAction;

public class PrivilegedInvokeConstructor<T> implements PrivilegedExceptionAction<T> {

    private final Constructor<T> constructor;
    private final Object[] args;

    public PrivilegedInvokeConstructor(Constructor<T> constructor, Object[] args) {
        this.constructor = constructor;
        this.args = args;
    }

    @Override
    public T run() throws InstantiationException, InvocationTargetException, IllegalAccessException {
        return PrivilegedAccessHelper.<T>invokeConstructor(constructor, args);
    }
}

