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
 *     rbarkhouse - 2009-10-07 13:24:58 - initial implementation
 ******************************************************************************/
// Contributors:
//     rbarkhouse - 2009-10-07 13:24:58 - initial implementation
package org.eclipse.persistence.testing.oxm.mappings.collectionreference.reuse;

public class Address {

    public int id;
    public String info;
    public String type;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address addObj = (Address) obj;
            if (this.id != addObj.id) {
                return false;
            }
            if (!(this.info.equals(addObj.info))) {
                return false;
            }
            if (!(this.type.equals(addObj.type))) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

}
