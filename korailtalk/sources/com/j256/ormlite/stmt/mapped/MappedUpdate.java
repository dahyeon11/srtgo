package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/* loaded from: classes2.dex */
public class MappedUpdate<T, ID> extends BaseMappedStatement<T, ID> {
    private final FieldType versionFieldType;
    private final int versionFieldTypeIndex;

    private MappedUpdate(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType fieldType, int i8) {
        super(tableInfo, str, fieldTypeArr);
        this.versionFieldType = fieldType;
        this.versionFieldTypeIndex = i8;
    }

    public static <T, ID> MappedUpdate<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) throws SQLException {
        FieldType idField = tableInfo.getIdField();
        if (idField == null) {
            throw new SQLException("Cannot update " + tableInfo.getDataClass() + " because it doesn't have an id field");
        }
        StringBuilder sb = new StringBuilder(64);
        BaseMappedStatement.appendTableName(databaseType, sb, "UPDATE ", tableInfo.getTableName());
        FieldType fieldType = null;
        int i8 = 0;
        int i9 = -1;
        for (FieldType fieldType2 : tableInfo.getFieldTypes()) {
            if (isFieldUpdatable(fieldType2, idField)) {
                if (fieldType2.isVersion()) {
                    i9 = i8;
                    fieldType = fieldType2;
                }
                i8++;
            }
        }
        int i10 = i8 + 1;
        if (fieldType != null) {
            i10 = i8 + 2;
        }
        FieldType[] fieldTypeArr = new FieldType[i10];
        boolean z8 = true;
        int i11 = 0;
        for (FieldType fieldType3 : tableInfo.getFieldTypes()) {
            if (isFieldUpdatable(fieldType3, idField)) {
                if (z8) {
                    sb.append("SET ");
                    z8 = false;
                } else {
                    sb.append(", ");
                }
                BaseMappedStatement.appendFieldColumnName(databaseType, sb, fieldType3, null);
                fieldTypeArr[i11] = fieldType3;
                sb.append("= ?");
                i11++;
            }
        }
        sb.append(' ');
        BaseMappedStatement.appendWhereFieldEq(databaseType, idField, sb, null);
        int i12 = i11 + 1;
        fieldTypeArr[i11] = idField;
        if (fieldType != null) {
            sb.append(" AND ");
            BaseMappedStatement.appendFieldColumnName(databaseType, sb, fieldType, null);
            sb.append("= ?");
            fieldTypeArr[i12] = fieldType;
        }
        return new MappedUpdate<>(tableInfo, sb.toString(), fieldTypeArr, fieldType, i9);
    }

    private static boolean isFieldUpdatable(FieldType fieldType, FieldType fieldType2) {
        return (fieldType == fieldType2 || fieldType.isForeignCollection() || fieldType.isReadOnly()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int update(DatabaseConnection databaseConnection, T t8, ObjectCache objectCache) throws IllegalAccessException, SQLException, IllegalArgumentException, InvocationTargetException {
        Object objMoveToNextValue;
        try {
            if (this.argFieldTypes.length <= 1) {
                return 0;
            }
            Object[] fieldObjects = getFieldObjects(t8);
            FieldType fieldType = this.versionFieldType;
            if (fieldType != null) {
                objMoveToNextValue = this.versionFieldType.moveToNextValue(fieldType.extractJavaFieldValue(t8));
                fieldObjects[this.versionFieldTypeIndex] = this.versionFieldType.convertJavaFieldToSqlArgValue(objMoveToNextValue);
            } else {
                objMoveToNextValue = null;
            }
            int iUpdate = databaseConnection.update(this.statement, fieldObjects, this.argFieldTypes);
            if (iUpdate > 0) {
                if (objMoveToNextValue != null) {
                    this.versionFieldType.assignField(t8, objMoveToNextValue, false, null);
                }
                if (objectCache != 0) {
                    Object obj = objectCache.get(this.clazz, this.idField.extractJavaFieldValue(t8));
                    if (obj != null && obj != t8) {
                        for (FieldType fieldType2 : this.tableInfo.getFieldTypes()) {
                            if (fieldType2 != this.idField) {
                                fieldType2.assignField(obj, fieldType2.extractJavaFieldValue(t8), false, objectCache);
                            }
                        }
                    }
                }
            }
            BaseMappedStatement.logger.debug("update data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(fieldObjects.length), Integer.valueOf(iUpdate));
            if (fieldObjects.length > 0) {
                BaseMappedStatement.logger.trace("update arguments: {}", (Object) fieldObjects);
            }
            return iUpdate;
        } catch (SQLException e8) {
            throw SqlExceptionUtil.create("Unable to run update stmt on object " + t8 + ": " + this.statement, e8);
        }
    }
}
