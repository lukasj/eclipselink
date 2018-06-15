/*******************************************************************************
 * Copyright (c) 2010, 2015  Frank Schwarz. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     11/23/2010-2.2 Frank Schwarz
 *       - 328774: TABLE_PER_CLASS-mapped key of a java.util.Map does not work for querying
 ******************************************************************************/
// Contributors:
//     11/23/2010-2.2 Frank Schwarz
//       - 328774: TABLE_PER_CLASS-mapped key of a java.util.Map does not work for querying
// CPR:: Copyright (c) 2010, 2015 Frank Schwarz. All rights reserved.
package org.eclipse.persistence.testing.models.jpa.ddlgeneration.tableperclass;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CodeExample extends BaseEntity {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
