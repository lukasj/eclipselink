/*******************************************************************************
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     10/24/2017-3.0 Tomas Kraus
 *       - 526419: Modify EclipseLink to reflect changes in JTA 1.1.
 ******************************************************************************/
// Contributors:
//     10/24/2017-3.0 Tomas Kraus
//       - 526419: Modify EclipseLink to reflect changes in JTA 1.1.
package org.eclipse.persistence.testing.models.jpa22.jta;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.eclipse.persistence.logging.AbstractSessionLog;
import org.eclipse.persistence.logging.SessionLog;

/**
 * EJB used to test 1st step of JTA 1.1 statements synchronization.
 */
@Stateful
public class AnimalDAO {

    /** Persistence unit used in this EJB. */
    static final String PU_NAME = "JTA";

    /** Entity manager injected from persistence context. */
    @PersistenceContext(unitName=PU_NAME)
    EntityManager em;

    /**
     * Create {@link Animal} entity.
     * @param id primary key of entity being created
     * @param name name attribute to set
     * @return new persisted {@link Animal} entity
     */
    public Animal createAnimal(final int id, final String name, final AnimalCheck listener) {
        Animal animal = new Animal();
        animal.setId(id);
        animal.setName(name);
        AbstractSessionLog.getLog().log(SessionLog.INFO, "EM persist {0}", new Object[] { new String(animal.toString()) }, false);
        em.persist(animal);
        if (listener != null) {
            listener.onEvent(AnimalEvent.create(animal.clone()));
        }
        return animal;
    }

}
