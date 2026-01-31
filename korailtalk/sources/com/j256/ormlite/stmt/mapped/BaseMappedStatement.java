package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.table.TableInfo;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseMappedStatement<T, ID> {
    protected static Logger logger = LoggerFactory.getLogger((Class<?>) BaseMappedStatement.class);
    protected final FieldType[] argFieldTypes;
    protected final Class<T> clazz;
    protected final FieldType idField;
    protected final String statement;
    protected final TableInfo<T, ID> tableInfo;

    protected BaseMappedStatement(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr) {
        this.tableInfo = tableInfo;
        this.clazz = tableInfo.getDataClass();
        this.idField = tableInfo.getIdField();
        this.statement = str;
        this.argFieldTypes = fieldTypeArr;
    }

    static void appendFieldColumnName(DatabaseType databaseType, StringBuilder sb, FieldType fieldType, List<FieldType> list) {
        databaseType.appendEscapedEntityName(sb, fieldType.getColumnName());
        if (list != null) {
            list.add(fieldType);
        }
        sb.append(' ');
    }

    static void appendTableName(DatabaseType databaseType, StringBuilder sb, String str, String str2) {
        if (str != null) {
            sb.append(str);
        }
        databaseType.appendEscapedEntityName(sb, str2);
        sb.append(' ');
    }

    static void appendWhereFieldEq(DatabaseType databaseType, FieldType fieldType, StringBuilder sb, List<FieldType> list) {
        sb.append("WHERE ");
        appendFieldColumnName(databaseType, sb, fieldType, list);
        sb.append("= ?");
    }

    protected Object convertIdToFieldObject(ID id) {
        return this.idField.convertJavaFieldToSqlArgValue(id);
    }

    protected Object[] getFieldObjects(Object obj) {
        Object[] objArr = new Object[this.argFieldTypes.length];
        int i8 = 0;
        while (true) {
            FieldType[] fieldTypeArr = this.argFieldTypes;
            if (i8 >= fieldTypeArr.length) {
                return objArr;
            }
            FieldType fieldType = fieldTypeArr[i8];
            if (fieldType.isAllowGeneratedIdInsert()) {
                objArr[i8] = fieldType.getFieldValueIfNotDefault(obj);
            } else {
                objArr[i8] = fieldType.extractJavaFieldToSqlArgValue(obj);
            }
            if (objArr[i8] == null && fieldType.getDefaultValue() != null) {
                objArr[i8] = fieldType.getDefaultValue();
            }
            i8++;
        }
    }

    public String toString() {
        return "MappedStatement: " + this.statement;
    }
}
