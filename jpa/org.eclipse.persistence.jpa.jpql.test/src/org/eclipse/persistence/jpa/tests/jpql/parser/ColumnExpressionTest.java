/*******************************************************************************
 * Copyright (c) 2012, 2015 Oracle and/or its affiliates. All rights reserved.
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

import org.eclipse.persistence.jpa.jpql.parser.Expression;

/**
 * Unit-tests for {@link org.eclipse.persistence.jpa.jpql.parser.FunctionExpression FunctionExpression}.
 * when the JPQL identifier is 'COLUMN'.
 *
 * @version 2.5
 * @since 2.4
 * @author Pascal Filion
 */
@SuppressWarnings("nls")
public final class ColumnExpressionTest extends AbstractFunctionExpressionTest {

    @Override
    protected String functionName(int index) {
        switch (index) {
            case 0:  return "'EMP_ID'";
            case 1:  return "'NAME";
            case 2:  return "''";
            default: return "'FIRST_NAME'";
        }
    }

    @Override
    protected String identifier(int index) {
        return Expression.COLUMN;
    }

    @Override
    protected boolean isExpression_14_Bad() {
        return true;
    }
}
