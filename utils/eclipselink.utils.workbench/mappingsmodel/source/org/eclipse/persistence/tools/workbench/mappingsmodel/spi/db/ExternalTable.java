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
package org.eclipse.persistence.tools.workbench.mappingsmodel.spi.db;

/**
 * Interface defining the meta-data    required by the TopLink
 * Mapping Workbench.
 * @see ExternalTableDescription
 */
public interface ExternalTable {

    /**
     * Return an array of the table's columns.
     */
    ExternalColumn[] getColumns();

    /**
     * Return an array of the table's foreign keys.
     */
    ExternalForeignKey[] getForeignKeys();

}
