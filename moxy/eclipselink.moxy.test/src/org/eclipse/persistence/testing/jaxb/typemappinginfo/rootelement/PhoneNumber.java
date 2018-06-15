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
*     bdoughan - January 13/2010 - 2.0.1 - Initial implementation
******************************************************************************/
// Contributors:
//     bdoughan - January 13/2010 - 2.0.1 - Initial implementation
package org.eclipse.persistence.testing.jaxb.typemappinginfo.rootelement;

public class PhoneNumber {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            PhoneNumber testPhoneNumber = (PhoneNumber) obj;
            if(null == number) {
                return null == testPhoneNumber.getNumber();
            } else {
                return number.equals(testPhoneNumber.getNumber());
            }
        } catch(ClassCastException e) {
            return false;
        }
    }

}
