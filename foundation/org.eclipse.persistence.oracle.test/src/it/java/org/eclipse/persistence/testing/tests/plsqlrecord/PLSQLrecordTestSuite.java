/*
 * Copyright (c) 2018, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.persistence.testing.tests.plsqlrecord;

// JUnit imports
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    PLSQLrecordInTestSet.class,
    PLSQLrecordOutTestSet.class,
    PLSQLrecordInOutTestSet.class,
    PLSQLrecordWithCompatibleTypeInTestSet.class,
    PLSQLrecordWithCompatibleTypeOutTestSet.class,
    PLSQLrecordWithCompatibleTypeInOutTestSet.class
})
public class PLSQLrecordTestSuite {
}
