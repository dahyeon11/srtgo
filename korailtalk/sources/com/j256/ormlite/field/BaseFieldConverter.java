package com.j256.ormlite.field;

import com.j256.ormlite.support.DatabaseResults;

/* loaded from: classes2.dex */
public abstract class BaseFieldConverter implements FieldConverter {
    @Override // com.j256.ormlite.field.FieldConverter
    public boolean isStreamType() {
        return false;
    }

    @Override // com.j256.ormlite.field.FieldConverter
    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        return obj;
    }

    @Override // com.j256.ormlite.field.FieldConverter
    public Object resultToJava(FieldType fieldType, DatabaseResults databaseResults, int i8) {
        Object objResultToSqlArg = resultToSqlArg(fieldType, databaseResults, i8);
        if (objResultToSqlArg == null) {
            return null;
        }
        return sqlArgToJava(fieldType, objResultToSqlArg, i8);
    }

    @Override // com.j256.ormlite.field.FieldConverter
    public Object sqlArgToJava(FieldType fieldType, Object obj, int i8) {
        return obj;
    }
}
