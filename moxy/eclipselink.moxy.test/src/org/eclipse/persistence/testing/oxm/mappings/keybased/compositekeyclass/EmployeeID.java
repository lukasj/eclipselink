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
*     bdoughan - Oct 29/2009 - 2.0 - Initial implementation
******************************************************************************/
// Contributors:
//     bdoughan - Oct 29/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.oxm.mappings.keybased.compositekeyclass;

public class EmployeeID {

    private int id1;
    private String id2;

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    @Override
    public boolean equals(Object o) {
        try {
            EmployeeID test = (EmployeeID) o;
            if(id1 != test.getId1()) {
                return false;
            }
            return id2.equals(test.getId2());
        } catch(ClassCastException e) {
            return false;
        }
    }

}
