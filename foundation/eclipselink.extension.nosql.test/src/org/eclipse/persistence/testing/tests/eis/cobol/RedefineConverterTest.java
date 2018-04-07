/*******************************************************************************
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
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
package org.eclipse.persistence.testing.tests.eis.cobol;

import java.util.Enumeration;

import org.eclipse.persistence.internal.eis.cobol.CobolRow;
import org.eclipse.persistence.internal.eis.cobol.FieldMetaData;
import org.eclipse.persistence.internal.eis.cobol.RecordMetaData;
import org.eclipse.persistence.internal.helper.DatabaseField;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.testing.framework.TestErrorException;
import org.eclipse.persistence.testing.framework.TestException;

public class RedefineConverterTest extends CobolTest {
    CobolRow resultRow;
    CobolRow row;
    byte[] recordData = new byte[420];

    public String description() {
        return "This test will take a database row, write its contents to a byte array and then " + "read the contents back into another database row, then compare the results to assure " + "the two rows are equal";
    }

    protected void test() {
        RecordMetaData recordMetaData = CobolTestModel.getConversionRecord();
        row = CobolTestModel.getConversionRow();
        row.remove("emp-tasks");
        row.add(new DatabaseField("emp-depart"), "accounting");
        Enumeration<DatabaseField> fieldEnum = Helper.elements(row.getFields());
        resultRow = new CobolRow();
        //write to array
        while (fieldEnum.hasMoreElements()) {
            DatabaseField databaseField = fieldEnum.nextElement();
            FieldMetaData field = recordMetaData.getFieldNamed(databaseField.getName());
            field.writeOnArray(row, recordData);
        }

        //write to database row
        fieldEnum = Helper.elements(row.getFields());
        while (fieldEnum.hasMoreElements()) {
            DatabaseField databaseField = fieldEnum.nextElement();
            FieldMetaData field = recordMetaData.getFieldNamed(databaseField.getName());
            field.writeOnRow(resultRow, recordData);
        }
    }

    protected void verify() throws TestException {
        if (!CobolTestModel.compareCobolRows(row, resultRow)) {
            TestErrorException exception = new TestErrorException("The rows do not match.");
            setTestException(exception);
        }
    }
}
