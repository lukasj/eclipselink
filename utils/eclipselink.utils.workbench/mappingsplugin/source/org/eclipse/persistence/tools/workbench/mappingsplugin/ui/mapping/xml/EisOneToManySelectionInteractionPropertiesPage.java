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
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping.xml;

import java.awt.Component;

import org.eclipse.persistence.tools.workbench.framework.context.WorkbenchContextHolder;
import org.eclipse.persistence.tools.workbench.framework.ui.view.ScrollablePropertiesPage;
import org.eclipse.persistence.tools.workbench.mappingsmodel.mapping.xml.MWEisReferenceMapping;
import org.eclipse.persistence.tools.workbench.mappingsplugin.ui.query.xml.InteractionPanel;
import org.eclipse.persistence.tools.workbench.uitools.app.PropertyAspectAdapter;
import org.eclipse.persistence.tools.workbench.uitools.app.PropertyValueModel;


final class EisOneToManySelectionInteractionPropertiesPage extends ScrollablePropertiesPage {

    EisOneToManySelectionInteractionPropertiesPage(PropertyValueModel nodeHolder, WorkbenchContextHolder contextHolder) {
        super(nodeHolder, contextHolder);
        addHelpTopicId(this, "mappings.eis.selectionInteraction");
    }

    protected Component buildPage(){
        return new InteractionPanel(getApplicationContext(), buildInteractionAdapter(), "mappings.eis.selectionInteraction");
    }

    private PropertyValueModel buildInteractionAdapter() {
        return new PropertyAspectAdapter(getSelectionHolder(), MWEisReferenceMapping.SELECTION_INTERACTION_PROPERTY) {
            protected Object getValueFromSubject() {
                return ((MWEisReferenceMapping) this.subject).getSelectionInteraction();
            }
        };
    }

}
