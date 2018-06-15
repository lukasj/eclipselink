/*******************************************************************************
 * Copyright (c) 2005, 2015 SAP. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     SAP - initial API and implementation
 ******************************************************************************/
// Contributors:
//     SAP - initial API and implementation
// CPR:: Copyright (c) 2005, 2015 SAP. All rights reserved.

package org.eclipse.persistence.testing.framework.wdf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.eclipse.persistence.platform.database.DatabasePlatform;

/**
 * Test should be skipped in a certain environment. This is not an issue.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Skip {

    /**
     * The database platform classes on which this test should be skipped. Default: skip on all databases
     */
    Class<? extends DatabasePlatform>[] databases() default {};

    /**
     * The fully qualified names of the database platforms on which this test should be skipped. Default: skip on all databases.
     */
    String[] databaseNames() default {};

    /**
     * Indicates if this test should be skipped on server.
     */
    boolean server() default false;
}
