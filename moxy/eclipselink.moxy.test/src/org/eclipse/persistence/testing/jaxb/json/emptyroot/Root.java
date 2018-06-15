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
 *     Denise Smith - 2.4 - April 2012
 ******************************************************************************/
// Contributors:
//     Denise Smith - 2.4 - April 2012
package org.eclipse.persistence.testing.jaxb.json.emptyroot;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Root {
   public String something;

    @Override
    public int hashCode() {
        return something != null ? something.hashCode() : 0;
    }

    public boolean equals(Object obj){
       if(!(obj instanceof Root)){
           return false;
       }
       if(something == null){
           return ((Root)obj).something == null;
       }else{
           return something.equals(((Root)obj).something);
       }

   }
}
