/*******************************************************************************
 * Copyright (c) 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Marcel Valovy
 ******************************************************************************/
// Contributors:
//     Marcel Valovy
package org.eclipse.persistence.testing.jaxb.beanvalidation.special;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Contains only inherited method constraint.
 *
 * @author Marcel Valovy
 */
@XmlRootElement
public class InheritanceAnnotatedEmployee extends MethodAnnotatedEmployee {

    public InheritanceAnnotatedEmployee(){
    }

}
