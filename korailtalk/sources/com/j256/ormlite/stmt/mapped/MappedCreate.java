package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Log;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.GeneratedKeyHolder;
import com.j256.ormlite.table.TableInfo;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/* loaded from: classes2.dex */
public class MappedCreate<T, ID> extends BaseMappedStatement<T, ID> {
    private String dataClassName;
    private final String queryNextSequenceStmt;
    private int versionFieldTypeIndex;

    private static class KeyHolder implements GeneratedKeyHolder {
        Number key;

        private KeyHolder() {
        }

        @Override // com.j256.ormlite.support.GeneratedKeyHolder
        public void addKey(Number number) throws SQLException {
            if (this.key == null) {
                this.key = number;
                return;
            }
            throw new SQLException("generated key has already been set to " + this.key + ", now set to " + number);
        }

        public Number getKey() {
            return this.key;
        }
    }

    private MappedCreate(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, String str2, int i8) {
        super(tableInfo, str, fieldTypeArr);
        this.dataClassName = tableInfo.getDataClass().getSimpleName();
        this.queryNextSequenceStmt = str2;
        this.versionFieldTypeIndex = i8;
    }

    private void assignIdValue(T t8, Number number, String str, ObjectCache objectCache) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.idField.assignIdValue(t8, number, objectCache);
        if (BaseMappedStatement.logger.isLevelEnabled(Log.Level.DEBUG)) {
            BaseMappedStatement.logger.debug("assigned id '{}' from {} to '{}' in {} object", new Object[]{number, str, this.idField.getFieldName(), this.dataClassName});
        }
    }

    private void assignSequenceId(DatabaseConnection databaseConnection, T t8, ObjectCache objectCache) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long jQueryForLong = databaseConnection.queryForLong(this.queryNextSequenceStmt);
        BaseMappedStatement.logger.debug("queried for sequence {} using stmt: {}", Long.valueOf(jQueryForLong), this.queryNextSequenceStmt);
        if (jQueryForLong != 0) {
            assignIdValue(t8, Long.valueOf(jQueryForLong), "sequence", objectCache);
            return;
        }
        throw new SQLException("Should not have returned 0 for stmt: " + this.queryNextSequenceStmt);
    }

    public static <T, ID> MappedCreate<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) {
        StringBuilder sb = new StringBuilder(128);
        BaseMappedStatement.appendTableName(databaseType, sb, "INSERT INTO ", tableInfo.getTableName());
        int i8 = 0;
        int i9 = -1;
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            if (isFieldCreatable(databaseType, fieldType)) {
                if (fieldType.isVersion()) {
                    i9 = i8;
                }
                i8++;
            }
        }
        FieldType[] fieldTypeArr = new FieldType[i8];
        if (i8 == 0) {
            databaseType.appendInsertNoColumns(sb);
        } else {
            sb.append('(');
            boolean z8 = true;
            int i10 = 0;
            boolean z9 = true;
            for (FieldType fieldType2 : tableInfo.getFieldTypes()) {
                if (isFieldCreatable(databaseType, fieldType2)) {
                    if (z9) {
                        z9 = false;
                    } else {
                        sb.append(",");
                    }
                    BaseMappedStatement.appendFieldColumnName(databaseType, sb, fieldType2, null);
                    fieldTypeArr[i10] = fieldType2;
                    i10++;
                }
            }
            sb.append(") VALUES (");
            for (FieldType fieldType3 : tableInfo.getFieldTypes()) {
                if (isFieldCreatable(databaseType, fieldType3)) {
                    if (z8) {
                        z8 = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append("?");
                }
            }
            sb.append(")");
        }
        return new MappedCreate<>(tableInfo, sb.toString(), fieldTypeArr, buildQueryNextSequence(databaseType, tableInfo.getIdField()), i9);
    }

    private static String buildQueryNextSequence(DatabaseType databaseType, FieldType fieldType) {
        String generatedIdSequence;
        if (fieldType == null || (generatedIdSequence = fieldType.getGeneratedIdSequence()) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(64);
        databaseType.appendSelectNextValFromSequence(sb, generatedIdSequence);
        return sb.toString();
    }

    private boolean foreignCollectionsAreAssigned(FieldType[] fieldTypeArr, Object obj) {
        for (FieldType fieldType : fieldTypeArr) {
            if (fieldType.extractJavaFieldValue(obj) == null) {
                return false;
            }
        }
        return true;
    }

    private static boolean isFieldCreatable(DatabaseType databaseType, FieldType fieldType) {
        if (fieldType.isForeignCollection() || fieldType.isReadOnly()) {
            return false;
        }
        return (databaseType.isIdSequenceNeeded() && databaseType.isSelectSequenceBeforeInsert()) || !fieldType.isGeneratedId() || fieldType.isSelfGeneratedId() || fieldType.isAllowGeneratedIdInsert();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int insert(DatabaseType databaseType, DatabaseConnection databaseConnection, T t8, ObjectCache objectCache) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        KeyHolder keyHolder;
        Object objMoveToNextValue;
        Object objExtractRawJavaFieldValue;
        FieldType fieldType = this.idField;
        if (fieldType == null) {
            keyHolder = null;
        } else {
            boolean z8 = !fieldType.isAllowGeneratedIdInsert() || this.idField.isObjectsFieldValueDefault(t8);
            if (this.idField.isSelfGeneratedId() && this.idField.isGeneratedId()) {
                if (z8) {
                    FieldType fieldType2 = this.idField;
                    fieldType2.assignField(t8, fieldType2.generateId(), false, objectCache);
                }
            } else if (this.idField.isGeneratedIdSequence() && databaseType.isSelectSequenceBeforeInsert()) {
                if (z8) {
                    assignSequenceId(databaseConnection, t8, objectCache);
                }
            } else if (this.idField.isGeneratedId() && z8) {
                keyHolder = new KeyHolder();
            }
            keyHolder = null;
        }
        try {
            if (this.tableInfo.isForeignAutoCreate()) {
                for (FieldType fieldType3 : this.tableInfo.getFieldTypes()) {
                    if (fieldType3.isForeignAutoCreate() && (objExtractRawJavaFieldValue = fieldType3.extractRawJavaFieldValue(t8)) != null && fieldType3.getForeignIdField().isObjectsFieldValueDefault(objExtractRawJavaFieldValue)) {
                        fieldType3.createWithForeignDao(objExtractRawJavaFieldValue);
                    }
                }
            }
            Object[] fieldObjects = getFieldObjects(t8);
            int i8 = this.versionFieldTypeIndex;
            if (i8 < 0 || fieldObjects[i8] != null) {
                objMoveToNextValue = null;
            } else {
                FieldType fieldType4 = this.argFieldTypes[i8];
                objMoveToNextValue = fieldType4.moveToNextValue(null);
                fieldObjects[this.versionFieldTypeIndex] = fieldType4.convertJavaFieldToSqlArgValue(objMoveToNextValue);
            }
            try {
                int iInsert = databaseConnection.insert(this.statement, fieldObjects, this.argFieldTypes, keyHolder);
                BaseMappedStatement.logger.debug("insert data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(fieldObjects.length), Integer.valueOf(iInsert));
                if (fieldObjects.length > 0) {
                    BaseMappedStatement.logger.trace("insert arguments: {}", (Object) fieldObjects);
                }
                if (iInsert > 0) {
                    if (objMoveToNextValue != null) {
                        this.argFieldTypes[this.versionFieldTypeIndex].assignField(t8, objMoveToNextValue, false, null);
                    }
                    if (keyHolder != null) {
                        Number key = keyHolder.getKey();
                        if (key == null) {
                            throw new SQLException("generated-id key was not set by the update call");
                        }
                        if (key.longValue() == 0) {
                            throw new SQLException("generated-id key must not be 0 value");
                        }
                        assignIdValue(t8, key, "keyholder", objectCache);
                    }
                    if (objectCache != 0 && foreignCollectionsAreAssigned(this.tableInfo.getForeignCollections(), t8)) {
                        objectCache.put(this.clazz, this.idField.extractJavaFieldValue(t8), t8);
                    }
                }
                return iInsert;
            } catch (SQLException e8) {
                BaseMappedStatement.logger.debug("insert data with statement '{}' and {} args, threw exception: {}", this.statement, Integer.valueOf(fieldObjects.length), e8);
                if (fieldObjects.length > 0) {
                    BaseMappedStatement.logger.trace("insert arguments: {}", (Object) fieldObjects);
                }
                throw e8;
            }
        } catch (SQLException e9) {
            throw SqlExceptionUtil.create("Unable to run insert stmt on object " + t8 + ": " + this.statement, e9);
        }
    }
}
