package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.RawRowMapper;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.table.TableInfo;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/* loaded from: classes2.dex */
public class RawRowMapperImpl<T, ID> implements RawRowMapper<T> {
    private final TableInfo<T, ID> tableInfo;

    public RawRowMapperImpl(TableInfo<T, ID> tableInfo) {
        this.tableInfo = tableInfo;
    }

    @Override // com.j256.ormlite.dao.RawRowMapper
    public T mapRow(String[] strArr, String[] strArr2) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        T tCreateObject = this.tableInfo.createObject();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (i8 < strArr2.length) {
                FieldType fieldTypeByColumnName = this.tableInfo.getFieldTypeByColumnName(strArr[i8]);
                fieldTypeByColumnName.assignField(tCreateObject, fieldTypeByColumnName.convertStringToJavaField(strArr2[i8], i8), false, null);
            }
        }
        return tCreateObject;
    }
}
