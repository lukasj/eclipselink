/*******************************************************************************
 * Copyright (c) 2005, 2015 SAP. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     SAP - initial API and implementation
 ******************************************************************************/
// Contributors:
//     SAP - initial API and implementation
// CPR:: Copyright (c) 2005, 2015 SAP. All rights reserved.

package org.eclipse.persistence.testing.models.wdf.jpa2.embedded;

import static javax.persistence.AccessType.FIELD;

import javax.persistence.Access;
import javax.persistence.Embeddable;

@Embeddable
@Access(FIELD)
public class EmbeddedFieldAccess {

    private int data;

    public int getValue() {
        return data;
    }

    public void setValue(int value) {
        data = value;
    }

}
