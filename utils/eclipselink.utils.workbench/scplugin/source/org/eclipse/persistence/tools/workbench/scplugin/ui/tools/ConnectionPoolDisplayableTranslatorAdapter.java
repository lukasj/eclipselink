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
package org.eclipse.persistence.tools.workbench.scplugin.ui.tools;

// Mapping Workbench
import org.eclipse.persistence.tools.workbench.framework.resources.ResourceRepository;

/**
 * This <code>DisplayableTranslator</code> is responsible to add more
 * information into the string used in the title bar that represents the edited
 * session.
 *
 * @version 10.1.3
 * @author Pascal Filion
 */
public final class ConnectionPoolDisplayableTranslatorAdapter extends AbstractDisplayableTranslatorAdapter
{
    /**
     * Creates a new <code>ConnectionPoolDisplayableTranslatorAdapter</code>.
     *
     * @param repository The repository used to retrieve localized string and the
     * icon that decorates objects of type {@link LoginNode}
     */
    public ConnectionPoolDisplayableTranslatorAdapter(ResourceRepository repository)
    {
        super(new ConnectionPoolCellRendererAdapter(repository));
    }
}
