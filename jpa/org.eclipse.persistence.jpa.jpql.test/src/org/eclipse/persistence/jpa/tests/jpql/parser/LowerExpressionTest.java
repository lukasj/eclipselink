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
public final class LowerExpressionTest extends JPQLParserTest {

    @Test
    public void test_JPQLQuery_01() {

        String query = "SELECT e FROM Employee e WHERE LOWER(e.firstName)";

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(lower(path("e.firstName")))
        );

        testQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_02() {

        String query = "SELECT e FROM Employee e WHERE LOWER(AVG(e.firstName))";

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(lower(avg("e.firstName")))
        );

        testQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_03() {

        String query = "SELECT e FROM Employee e WHERE LOWER";

        LowerExpressionTester lower = lower(nullExpression());
        lower.hasLeftParenthesis  = false;
        lower.hasRightParenthesis = false;

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(lower)
        );

        testInvalidQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_04() {

        String query = "SELECT e FROM Employee e WHERE LOWER(";

        LowerExpressionTester lower = lower(nullExpression());
        lower.hasLeftParenthesis  = true;
        lower.hasRightParenthesis = false;

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(lower)
        );

        testInvalidQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_05() {

        String query = "SELECT e FROM Employee e WHERE LOWER()";

        LowerExpressionTester lower = lower(nullExpression());
        lower.hasLeftParenthesis  = true;
        lower.hasRightParenthesis = true;

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(lower)
        );

        testInvalidQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_06() {

        String query = "SELECT e FROM Employee e WHERE LOWER GROUP BY e.name";

        LowerExpressionTester lower = lower(nullExpression());
        lower.hasLeftParenthesis  = false;
        lower.hasRightParenthesis = false;

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(lower),
            groupBy(path("e.name"))
        );

        testInvalidQuery(query, selectStatement);
    }

    @Test
    public void test_JPQLQuery_07() {

        String query = "SELECT e FROM Employee e WHERE LOWER( GROUP BY e.name";

        LowerExpressionTester lower = lower(nullExpression());
        lower.hasLeftParenthesis  = true;
        lower.hasRightParenthesis = false;

        SelectStatementTester selectStatement = selectStatement(
            select(variable("e")),
            from("Employee", "e"),
            where(lower),
            groupBy(path("e.name"))
        );

        testInvalidQuery(query, selectStatement);
    }
}
