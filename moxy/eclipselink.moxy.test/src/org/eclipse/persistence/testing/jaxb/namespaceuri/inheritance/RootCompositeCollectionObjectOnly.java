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
 *     Oracle - December 2011
 ******************************************************************************/
// Contributors:
//     Oracle - December 2011
package org.eclipse.persistence.testing.jaxb.namespaceuri.inheritance;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root", namespace="rootNamespace")
public class RootCompositeCollectionObjectOnly {

    public List objectList;

    public RootCompositeCollectionObjectOnly(){
        objectList = new ArrayList();
    }

    public boolean equals(Object obj){
        if(!(obj instanceof RootCompositeCollectionObjectOnly)){
            return false;
        }

        if(!compareLists(objectList, ((RootCompositeCollectionObjectOnly)obj).objectList)){
            return false;
        }

        return true;
    }

    private boolean compareLists(List list1, List list2){
        if(list1.size() != list2.size()){
            return false;
        }
        if(!list1.containsAll(list2)){
            return false;
        }
        if(!list2.containsAll(list1)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RootCompositeCollectionObjectOnly [objectList=" + objectList + "]";
    }

}
