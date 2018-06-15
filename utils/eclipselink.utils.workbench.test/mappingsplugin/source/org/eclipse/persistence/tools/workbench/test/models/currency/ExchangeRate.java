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
 *     Oracle - initial API and implementation from Oracle TopLink
******************************************************************************/
// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.tools.workbench.test.models.currency;

public class ExchangeRate
{
    private Integer id;
    private CurrencyRange currencyRange;
    private Integer periodLength;
/**
 *
 * @return org.eclipse.persistence.tools.workbench.test.models.currency.CurrencyRange
 */
public CurrencyRange getCurrencyRange() {
    return currencyRange;
}
/**
 *
 * @return java.lang.Integer
 */
public java.lang.Integer getId() {
    return id;
}
/**
 *
 * @return java.lang.Integer
 */
public java.lang.Integer getPeriodLength() {
    return periodLength;
}
/**
 *
 * @param newCurrencyRange org.eclipse.persistence.tools.workbench.test.models.currency.CurrencyRange
 */
public void setCurrencyRange(CurrencyRange newCurrencyRange) {
    currencyRange = newCurrencyRange;
}
/**
 *
 * @param newId java.lang.Integer
 */
public void setId(java.lang.Integer newId) {
    id = newId;
}
/**
 *
 * @param newPeriodLength java.lang.Integer
 */
public void setPeriodLength(java.lang.Integer newPeriodLength) {
    periodLength = newPeriodLength;
}
}
