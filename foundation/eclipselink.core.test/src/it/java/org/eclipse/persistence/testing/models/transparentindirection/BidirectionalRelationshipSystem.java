/*
 * Copyright (c) 1998, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.models.transparentindirection;

import org.eclipse.persistence.sessions.DatabaseSession;
import org.eclipse.persistence.testing.framework.TestSystem;

/**
 * @author Guy Pelletier
 * @version 1.0
 */
public class BidirectionalRelationshipSystem extends TestSystem {
    public BidirectionalRelationshipSystem() {
    }

    @Override
    public void addDescriptors(DatabaseSession session) {
        if (project == null) {
            project = new BidirectionalRelationshipProject(session);
        }

        session.addDescriptors(project);
    }

    @Override
    public void createTables(DatabaseSession session) {
        new BidirectionalRelationshipTableCreator().replaceTables(session);
    }
}
