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
 * dmccann - October 7/2009 - 2.0 - Initial implementation
 ******************************************************************************/
// Contributors:
// dmccann - October 7/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.xmlvalue;

import java.util.Arrays;

public class InternationalPricesNoAnnotation {
    public java.math.BigDecimal[] prices;
    public String currency;

    public boolean equals(Object obj){
        if(obj instanceof InternationalPricesNoAnnotation){
            InternationalPricesNoAnnotation priceObj = (InternationalPricesNoAnnotation)obj;
            return currency.equals(priceObj.currency) && Arrays.equals(prices, priceObj.prices);
        }
        return false;
    }
}
