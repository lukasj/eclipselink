/*
 * Copyright (c) 2013, 2024 Oracle and/or its affiliates. All rights reserved.
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
//     Oracle - initial API and implementation
package org.eclipse.persistence.config;

/**
 * Tuning persistence property values.
 *
 * <p>JPA persistence property usage:
 * {@snippet :
 *  properties.add(PersistenceUnitProperties.TUNING, TunerType.Safe);
 * }
 * <p>Property values are case-insensitive.
 *
 * @see PersistenceUnitProperties#TUNING
 */
public final class TunerType {
    public static final String Safe = "Safe";
    public static final String Standard = "Standard";

    private TunerType() {
        // no instance please
    }
}
