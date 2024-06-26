/*
 * Copyright (c) 1998, 2022 Oracle and/or its affiliates. All rights reserved.
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
//     tware - fix for bug 352533
package org.eclipse.persistence.testing.models.jpa.cacheable;

import jakarta.persistence.Cacheable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="JPA_CACHEABLE_TRUE_DER")
@Cacheable(true)
public class CacheableTrueDerivedIDEntity {

    @EmbeddedId
    protected CacheableTrueDerivedIDPK pk;

    @OneToOne
    @JoinColumn(name="CF_ID")
    protected CacheableFalseEntity cacheableFalse;

    public CacheableTrueDerivedIDEntity(){}

    public CacheableTrueDerivedIDEntity(String description, CacheableFalseEntity cacheableFalse){
        this.pk = new CacheableTrueDerivedIDPK(description, cacheableFalse.getId());
        this.cacheableFalse = cacheableFalse;
    }

    public CacheableFalseEntity getCacheableFalse() {
        return cacheableFalse;
    }

    public void setCacheableFalse(CacheableFalseEntity cacheableFalse) {
        this.cacheableFalse = cacheableFalse;
    }

    public CacheableTrueDerivedIDPK getPk() {
        return pk;
    }

    public void setPk(CacheableTrueDerivedIDPK pk) {
        this.pk = pk;
    }

}

