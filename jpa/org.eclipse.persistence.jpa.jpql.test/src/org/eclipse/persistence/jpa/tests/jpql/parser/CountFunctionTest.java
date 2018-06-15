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

import org.eclipse.persistence.jpa.jpql.parser.AggregateFunction;
import org.eclipse.persistence.jpa.jpql.parser.CountFunction;
import static org.eclipse.persistence.jpa.tests.jpql.parser.JPQLParserTester.*;

/**
 * Unit-tests for {@link org.eclipse.persistence.jpa.jpql.parser.CountFunction CountFunction}.
 *
 * @version 2.5
 * @since 2.3
 * @author Pascal Filion
 */
public final class CountFunctionTest extends AggregateFunctionTest {

    @Override
    protected AggregateFunctionTester aggregateFunctionTester(ExpressionTester expression) {
        return count(expression);
    }

    @Override
    protected Class<? extends AggregateFunction> functionClass() {
        return CountFunction.class;
    }

    @Override
    protected String identifier() {
        return CountFunction.COUNT;
    }
}
