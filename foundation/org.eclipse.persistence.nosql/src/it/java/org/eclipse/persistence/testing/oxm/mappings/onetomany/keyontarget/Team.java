/*
 * Copyright (c) 1998, 2024 Oracle and/or its affiliates. All rights reserved.
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
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.oxm.mappings.onetomany.keyontarget;

import java.util.Vector;

public class Team
{
  private int id;
  private Vector employees;
  private Vector projects;

  public Team()
  {
    employees = new Vector();
    projects = new Vector();
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public void addProject(Project project)
  {
    projects.add(project);
  }

  public void addEmployee(Employee employee)
  {
    employees.add(employee);
  }

  public Vector getProjects()
  {
    return projects;
  }

  public Vector getEmployees()
  {
    return employees;
  }

  public void setProjects(Vector newProjects)
  {
    projects = newProjects;
  }

  public void setEmployees(Vector newEmployees)
  {
    employees = newEmployees;
  }

  public String toString()
  {
    StringBuilder result = new StringBuilder("TEAM: " + this.getId());
    result.append("EMPLOYEES: ");

    for(int i=0; i<employees.size();i++)
    {
      result.append(employees.elementAt(i));
    }

    result.append("PROJECTS: ");
    for(int i=0; i<projects.size();i++)
    {
      result.append(projects.elementAt(i));
    }
    return result.toString();
  }

   public boolean equals(Object object)
   {
     if(!(object instanceof Team teamObject))
      return false;

       if((((this.getEmployees() == null) && (teamObject.getEmployees() == null))||
          (this.getEmployees().containsAll(teamObject.getEmployees()))) &&
        (((this.getProjects() == null) && (teamObject.getProjects() == null))||
          (this.getProjects().containsAll(teamObject.getProjects()))) &&
          (this.getId()==teamObject.getId())         )
          return true;

      return false;
   }
}
