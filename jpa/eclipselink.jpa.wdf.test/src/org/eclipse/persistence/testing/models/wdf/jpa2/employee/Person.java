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

package org.eclipse.persistence.testing.models.wdf.jpa2.employee;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Person2")
@DiscriminatorColumn
@Table(name = "TMP2_PERSON")
public class Person {
    @Id
    private int ssn;

    private String name;

    // @ElementCollection
    // public Collection<String> nicknames;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
