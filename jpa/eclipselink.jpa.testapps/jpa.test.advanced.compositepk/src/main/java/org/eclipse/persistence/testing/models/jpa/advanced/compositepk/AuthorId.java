/*
 * Copyright (c) 2017, 2022 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.persistence.testing.models.jpa.advanced.compositepk;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import java.io.Serializable;

@Embeddable
public class AuthorId implements Serializable {

    private static final long serialVersionUID = -8247509662551594669L;

    @Embedded
    private NumberId numberId;

    public AuthorId() {
        this.numberId = new NumberId();
    }

    @Override
    public int hashCode() {
        return numberId.hashCode();
    }

    public NumberId getNumberId() {
        return numberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AuthorId other = (AuthorId) obj;
        if (numberId == null) {
            if (other.numberId != null)
                return false;
        } else if (!numberId.equals(other.numberId))
            return false;
        return true;
    }

    public String toString() {
        return "AuthorId [numberId=" + this.numberId + "]";
    }
}
