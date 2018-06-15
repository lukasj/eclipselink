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
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.schema;

import java.util.ListIterator;

import org.eclipse.persistence.tools.workbench.mappingsmodel.schema.Wildcard;

final class WildcardNodeStructure
    extends SchemaComponentNodeStructure
    implements SpecificParticleNodeStructure
{
    // **************** Constructors ******************************************

    WildcardNodeStructure(Wildcard wildcard) {
        super(wildcard);
    }

    // **************** SchemaComponentNodeStructure contract *****************

    public String displayString() {
        return "any";
    }

    // **************** ParticleTermNodeStructure contract ********************

    public void disengageParticle() {
        this.disengageComponent();
    }

    public ListIterator details(ListIterator particleDetails) {
        return particleDetails;
    }
}
