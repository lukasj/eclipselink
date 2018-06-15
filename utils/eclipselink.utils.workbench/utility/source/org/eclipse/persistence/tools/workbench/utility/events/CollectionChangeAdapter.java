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
package org.eclipse.persistence.tools.workbench.utility.events;

/**
 * Convenience implementation of CollectionChangeListener.
 */
public class CollectionChangeAdapter implements CollectionChangeListener {

    /**
     * Default constructor.
     */
    public CollectionChangeAdapter() {
        super();
    }

    /**
     * @see CollectionChangeListener#itemsAdded(CollectionChangeEvent)
     */
    public void itemsAdded(CollectionChangeEvent e) {
        // do nothing
    }

    /**
     * @see CollectionChangeListener#itemsRemoved(CollectionChangeEvent)
     */
    public void itemsRemoved(CollectionChangeEvent e) {
        // do nothing
    }

    /**
     * @see CollectionChangeListener#collectionChanged(CollectionChangeEvent)
     */
    public void collectionChanged(CollectionChangeEvent e) {
        // do nothing
    }

}
