/*******************************************************************************
 * Copyright (c) 2010, 2015   Karsten Wutzke. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     12/23/2010-2.3 Guy Pelletier submitted for Karsten Wutzke
 *       - 331386: NPE when mapping chain of 2 multi-column relationships using JPA 2.0 and @EmbeddedId composite PK-FK
 ******************************************************************************/
// Contributors:
//     12/23/2010-2.3 Guy Pelletier submitted for Karsten Wutzke
//       - 331386: NPE when mapping chain of 2 multi-column relationships using JPA 2.0 and @EmbeddedId composite PK-FK
// CPR:: Copyright (c) 2010, 2015 Karsten Wutzke. All rights reserved.
package org.eclipse.persistence.testing.models.jpa.ddlgeneration;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Bars")
public class Bar implements Serializable {
    @EmbeddedId
    private BarId embeddedId;
}


