/*******************************************************************************
 * Copyright (c) 2006, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 *
 ******************************************************************************/
// Contributors:
//     Oracle - initial API and implementation
//
package org.eclipse.persistence.jpa.tests.jpql.parser;

import org.junit.Test;
import static org.eclipse.persistence.jpa.tests.jpql.parser.JPQLParserTester.*;

@SuppressWarnings("nls")
public final class EmptyCollectionComparisonExpressionTest extends JPQLParserTest {

    @Test
    public void test_JPQLQuery_01() {

        String query = "SELECT e FROM Employee e WHERE e.addresses IS EMPTY";

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(collectionPath("e.addresses").isEmpty())
        );

        testQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_02() {

        String query = "SELECT e FROM Employee e WHERE e.addresses IS NOT EMPTY";

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(collectionPath("e.addresses").isNotEmpty())
        );

        testQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_03() {

        String query = "SELECT e FROM Employee e WHERE IS EMPTY";

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(nullExpression().isEmpty())
        );

        testQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_04() {

        String query = "SELECT e FROM Employee e WHERE IS NOT EMPTY";

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(nullExpression().isNotEmpty())
        );

        testQuery(query, selectStatement);
    }
}
