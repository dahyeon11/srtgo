package com.j256.ormlite.field;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.types.VoidType;
import com.j256.ormlite.misc.JavaxPersistence;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class DatabaseFieldConfig {
    public static final boolean DEFAULT_CAN_BE_NULL = true;
    public static final boolean DEFAULT_FOREIGN_COLLECTION_ORDER_ASCENDING = true;
    private static final int DEFAULT_MAX_EAGER_FOREIGN_COLLECTION_LEVEL = 1;
    private boolean allowGeneratedIdInsert;
    private boolean canBeNull;
    private String columnDefinition;
    private String columnName;
    private DataPersister dataPersister;
    private DataType dataType;
    private String defaultValue;
    private String fieldName;
    private boolean foreign;
    private boolean foreignAutoCreate;
    private boolean foreignAutoRefresh;
    private boolean foreignCollection;
    private String foreignCollectionColumnName;
    private boolean foreignCollectionEager;
    private String foreignCollectionForeignFieldName;
    private int foreignCollectionMaxEagerLevel;
    private boolean foreignCollectionOrderAscending;
    private String foreignCollectionOrderColumnName;
    private String foreignColumnName;
    private DatabaseTableConfig<?> foreignTableConfig;
    private String format;
    private boolean generatedId;
    private String generatedIdSequence;
    private boolean id;
    private boolean index;
    private String indexName;
    private int maxForeignAutoRefreshLevel;
    private boolean persisted;
    private Class<? extends DataPersister> persisterClass;
    private boolean readOnly;
    private boolean throwIfNull;
    private boolean unique;
    private boolean uniqueCombo;
    private boolean uniqueIndex;
    private String uniqueIndexName;
    private Enum<?> unknownEnumValue;
    private boolean useGetSet;
    private boolean version;
    private int width;
    public static final Class<? extends DataPersister> DEFAULT_PERSISTER_CLASS = VoidType.class;
    public static final DataType DEFAULT_DATA_TYPE = DataType.UNKNOWN;

    public DatabaseFieldConfig() {
        this.dataType = DEFAULT_DATA_TYPE;
        this.canBeNull = true;
        this.persisted = true;
        this.maxForeignAutoRefreshLevel = -1;
        this.persisterClass = DEFAULT_PERSISTER_CLASS;
        this.foreignCollectionMaxEagerLevel = 1;
        this.foreignCollectionOrderAscending = true;
    }

    public static Method findGetMethod(Field field, boolean z8) throws NoSuchMethodException, SecurityException {
        String strMethodFromField = methodFromField(field, "get");
        try {
            Method method = field.getDeclaringClass().getMethod(strMethodFromField, null);
            if (method.getReturnType() == field.getType()) {
                return method;
            }
            if (!z8) {
                return null;
            }
            throw new IllegalArgumentException("Return type of get method " + strMethodFromField + " does not return " + field.getType());
        } catch (Exception unused) {
            if (!z8) {
                return null;
            }
            throw new IllegalArgumentException("Could not find appropriate get method for " + field);
        }
    }

    private String findIndexName(String str) {
        if (this.columnName == null) {
            return str + "_" + this.fieldName + "_idx";
        }
        return str + "_" + this.columnName + "_idx";
    }

    public static Enum<?> findMatchingEnumVal(Field field, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (Enum<?> r32 : (Enum[]) field.getType().getEnumConstants()) {
            if (r32.name().equals(str)) {
                return r32;
            }
        }
        throw new IllegalArgumentException("Unknwown enum unknown name " + str + " for field " + field);
    }

    public static Method findSetMethod(Field field, boolean z8) throws NoSuchMethodException, SecurityException {
        String strMethodFromField = methodFromField(field, "set");
        try {
            Method method = field.getDeclaringClass().getMethod(strMethodFromField, field.getType());
            if (method.getReturnType() == Void.TYPE) {
                return method;
            }
            if (!z8) {
                return null;
            }
            throw new IllegalArgumentException("Return type of set method " + strMethodFromField + " returns " + method.getReturnType() + " instead of void");
        } catch (Exception unused) {
            if (!z8) {
                return null;
            }
            throw new IllegalArgumentException("Could not find appropriate set method for " + field);
        }
    }

    public static DatabaseFieldConfig fromDatabaseField(DatabaseType databaseType, String str, Field field, DatabaseField databaseField) {
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig();
        databaseFieldConfig.fieldName = field.getName();
        if (databaseType.isEntityNamesMustBeUpCase()) {
            databaseFieldConfig.fieldName = databaseFieldConfig.fieldName.toUpperCase();
        }
        databaseFieldConfig.columnName = valueIfNotBlank(databaseField.columnName());
        databaseFieldConfig.dataType = databaseField.dataType();
        String strDefaultValue = databaseField.defaultValue();
        if (!strDefaultValue.equals(DatabaseField.DEFAULT_STRING)) {
            databaseFieldConfig.defaultValue = strDefaultValue;
        }
        databaseFieldConfig.width = databaseField.width();
        databaseFieldConfig.canBeNull = databaseField.canBeNull();
        databaseFieldConfig.id = databaseField.id();
        databaseFieldConfig.generatedId = databaseField.generatedId();
        databaseFieldConfig.generatedIdSequence = valueIfNotBlank(databaseField.generatedIdSequence());
        databaseFieldConfig.foreign = databaseField.foreign();
        databaseFieldConfig.useGetSet = databaseField.useGetSet();
        databaseFieldConfig.unknownEnumValue = findMatchingEnumVal(field, databaseField.unknownEnumName());
        databaseFieldConfig.throwIfNull = databaseField.throwIfNull();
        databaseFieldConfig.format = valueIfNotBlank(databaseField.format());
        databaseFieldConfig.unique = databaseField.unique();
        databaseFieldConfig.uniqueCombo = databaseField.uniqueCombo();
        databaseFieldConfig.index = databaseField.index();
        databaseFieldConfig.indexName = valueIfNotBlank(databaseField.indexName());
        databaseFieldConfig.uniqueIndex = databaseField.uniqueIndex();
        databaseFieldConfig.uniqueIndexName = valueIfNotBlank(databaseField.uniqueIndexName());
        databaseFieldConfig.foreignAutoRefresh = databaseField.foreignAutoRefresh();
        databaseFieldConfig.maxForeignAutoRefreshLevel = databaseField.maxForeignAutoRefreshLevel();
        databaseFieldConfig.persisterClass = databaseField.persisterClass();
        databaseFieldConfig.allowGeneratedIdInsert = databaseField.allowGeneratedIdInsert();
        databaseFieldConfig.columnDefinition = valueIfNotBlank(databaseField.columnDefinition());
        databaseFieldConfig.foreignAutoCreate = databaseField.foreignAutoCreate();
        databaseFieldConfig.version = databaseField.version();
        databaseFieldConfig.foreignColumnName = valueIfNotBlank(databaseField.foreignColumnName());
        databaseFieldConfig.readOnly = databaseField.readOnly();
        return databaseFieldConfig;
    }

    public static DatabaseFieldConfig fromField(DatabaseType databaseType, String str, Field field) {
        DatabaseField databaseField = (DatabaseField) field.getAnnotation(DatabaseField.class);
        if (databaseField == null) {
            ForeignCollectionField foreignCollectionField = (ForeignCollectionField) field.getAnnotation(ForeignCollectionField.class);
            return foreignCollectionField != null ? fromForeignCollection(databaseType, field, foreignCollectionField) : JavaxPersistence.createFieldConfig(databaseType, field);
        }
        if (databaseField.persisted()) {
            return fromDatabaseField(databaseType, str, field, databaseField);
        }
        return null;
    }

    private static DatabaseFieldConfig fromForeignCollection(DatabaseType databaseType, Field field, ForeignCollectionField foreignCollectionField) {
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig();
        databaseFieldConfig.fieldName = field.getName();
        if (foreignCollectionField.columnName().length() > 0) {
            databaseFieldConfig.columnName = foreignCollectionField.columnName();
        }
        databaseFieldConfig.foreignCollection = true;
        databaseFieldConfig.foreignCollectionEager = foreignCollectionField.eager();
        int iMaxEagerForeignCollectionLevel = foreignCollectionField.maxEagerForeignCollectionLevel();
        if (iMaxEagerForeignCollectionLevel != 1) {
            databaseFieldConfig.foreignCollectionMaxEagerLevel = iMaxEagerForeignCollectionLevel;
        } else {
            databaseFieldConfig.foreignCollectionMaxEagerLevel = foreignCollectionField.maxEagerLevel();
        }
        databaseFieldConfig.foreignCollectionOrderColumnName = valueIfNotBlank(foreignCollectionField.orderColumnName());
        databaseFieldConfig.foreignCollectionOrderAscending = foreignCollectionField.orderAscending();
        databaseFieldConfig.foreignCollectionColumnName = valueIfNotBlank(foreignCollectionField.columnName());
        String strValueIfNotBlank = valueIfNotBlank(foreignCollectionField.foreignFieldName());
        if (strValueIfNotBlank == null) {
            databaseFieldConfig.foreignCollectionForeignFieldName = valueIfNotBlank(valueIfNotBlank(foreignCollectionField.foreignColumnName()));
        } else {
            databaseFieldConfig.foreignCollectionForeignFieldName = strValueIfNotBlank;
        }
        return databaseFieldConfig;
    }

    private static String methodFromField(Field field, String str) {
        return str + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
    }

    private static String valueIfNotBlank(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public String getColumnDefinition() {
        return this.columnDefinition;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public DataPersister getDataPersister() {
        DataPersister dataPersister = this.dataPersister;
        return dataPersister == null ? this.dataType.getDataPersister() : dataPersister;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getForeignCollectionColumnName() {
        return this.foreignCollectionColumnName;
    }

    public String getForeignCollectionForeignFieldName() {
        return this.foreignCollectionForeignFieldName;
    }

    public int getForeignCollectionMaxEagerLevel() {
        return this.foreignCollectionMaxEagerLevel;
    }

    public String getForeignCollectionOrderColumnName() {
        return this.foreignCollectionOrderColumnName;
    }

    public String getForeignColumnName() {
        return this.foreignColumnName;
    }

    public DatabaseTableConfig<?> getForeignTableConfig() {
        return this.foreignTableConfig;
    }

    public String getFormat() {
        return this.format;
    }

    public String getGeneratedIdSequence() {
        return this.generatedIdSequence;
    }

    public String getIndexName(String str) {
        if (this.index && this.indexName == null) {
            this.indexName = findIndexName(str);
        }
        return this.indexName;
    }

    public int getMaxForeignAutoRefreshLevel() {
        return this.maxForeignAutoRefreshLevel;
    }

    public Class<? extends DataPersister> getPersisterClass() {
        return this.persisterClass;
    }

    public String getUniqueIndexName(String str) {
        if (this.uniqueIndex && this.uniqueIndexName == null) {
            this.uniqueIndexName = findIndexName(str);
        }
        return this.uniqueIndexName;
    }

    public Enum<?> getUnknownEnumValue() {
        return this.unknownEnumValue;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowGeneratedIdInsert() {
        return this.allowGeneratedIdInsert;
    }

    public boolean isCanBeNull() {
        return this.canBeNull;
    }

    public boolean isForeign() {
        return this.foreign;
    }

    public boolean isForeignAutoCreate() {
        return this.foreignAutoCreate;
    }

    public boolean isForeignAutoRefresh() {
        return this.foreignAutoRefresh;
    }

    public boolean isForeignCollection() {
        return this.foreignCollection;
    }

    public boolean isForeignCollectionEager() {
        return this.foreignCollectionEager;
    }

    public boolean isForeignCollectionOrderAscending() {
        return this.foreignCollectionOrderAscending;
    }

    public boolean isGeneratedId() {
        return this.generatedId;
    }

    public boolean isId() {
        return this.id;
    }

    public boolean isIndex() {
        return this.index;
    }

    public boolean isPersisted() {
        return this.persisted;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public boolean isThrowIfNull() {
        return this.throwIfNull;
    }

    public boolean isUnique() {
        return this.unique;
    }

    public boolean isUniqueCombo() {
        return this.uniqueCombo;
    }

    public boolean isUniqueIndex() {
        return this.uniqueIndex;
    }

    public boolean isUseGetSet() {
        return this.useGetSet;
    }

    public boolean isVersion() {
        return this.version;
    }

    public void postProcess() {
        if (this.foreignColumnName != null) {
            this.foreignAutoRefresh = true;
        }
        if (this.foreignAutoRefresh && this.maxForeignAutoRefreshLevel == -1) {
            this.maxForeignAutoRefreshLevel = 2;
        }
    }

    public void setAllowGeneratedIdInsert(boolean z8) {
        this.allowGeneratedIdInsert = z8;
    }

    public void setCanBeNull(boolean z8) {
        this.canBeNull = z8;
    }

    public void setColumnDefinition(String str) {
        this.columnDefinition = str;
    }

    public void setColumnName(String str) {
        this.columnName = str;
    }

    public void setDataPersister(DataPersister dataPersister) {
        this.dataPersister = dataPersister;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public void setFieldName(String str) {
        this.fieldName = str;
    }

    public void setForeign(boolean z8) {
        this.foreign = z8;
    }

    public void setForeignAutoCreate(boolean z8) {
        this.foreignAutoCreate = z8;
    }

    public void setForeignAutoRefresh(boolean z8) {
        this.foreignAutoRefresh = z8;
    }

    public void setForeignCollection(boolean z8) {
        this.foreignCollection = z8;
    }

    public void setForeignCollectionColumnName(String str) {
        this.foreignCollectionColumnName = str;
    }

    public void setForeignCollectionEager(boolean z8) {
        this.foreignCollectionEager = z8;
    }

    @Deprecated
    public void setForeignCollectionForeignColumnName(String str) {
        this.foreignCollectionForeignFieldName = str;
    }

    public void setForeignCollectionForeignFieldName(String str) {
        this.foreignCollectionForeignFieldName = str;
    }

    @Deprecated
    public void setForeignCollectionMaxEagerForeignCollectionLevel(int i8) {
        this.foreignCollectionMaxEagerLevel = i8;
    }

    public void setForeignCollectionMaxEagerLevel(int i8) {
        this.foreignCollectionMaxEagerLevel = i8;
    }

    public void setForeignCollectionOrderAscending(boolean z8) {
        this.foreignCollectionOrderAscending = z8;
    }

    @Deprecated
    public void setForeignCollectionOrderColumn(String str) {
        this.foreignCollectionOrderColumnName = str;
    }

    public void setForeignCollectionOrderColumnName(String str) {
        this.foreignCollectionOrderColumnName = str;
    }

    public void setForeignColumnName(String str) {
        this.foreignColumnName = str;
    }

    public void setForeignTableConfig(DatabaseTableConfig<?> databaseTableConfig) {
        this.foreignTableConfig = databaseTableConfig;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setGeneratedId(boolean z8) {
        this.generatedId = z8;
    }

    public void setGeneratedIdSequence(String str) {
        this.generatedIdSequence = str;
    }

    public void setId(boolean z8) {
        this.id = z8;
    }

    public void setIndex(boolean z8) {
        this.index = z8;
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    @Deprecated
    public void setMaxEagerForeignCollectionLevel(int i8) {
        this.foreignCollectionMaxEagerLevel = i8;
    }

    public void setMaxForeignAutoRefreshLevel(int i8) {
        this.maxForeignAutoRefreshLevel = i8;
    }

    public void setPersisted(boolean z8) {
        this.persisted = z8;
    }

    public void setPersisterClass(Class<? extends DataPersister> cls) {
        this.persisterClass = cls;
    }

    public void setReadOnly(boolean z8) {
        this.readOnly = z8;
    }

    public void setThrowIfNull(boolean z8) {
        this.throwIfNull = z8;
    }

    public void setUnique(boolean z8) {
        this.unique = z8;
    }

    public void setUniqueCombo(boolean z8) {
        this.uniqueCombo = z8;
    }

    public void setUniqueIndex(boolean z8) {
        this.uniqueIndex = z8;
    }

    public void setUniqueIndexName(String str) {
        this.uniqueIndexName = str;
    }

    public void setUnknownEnumValue(Enum<?> r12) {
        this.unknownEnumValue = r12;
    }

    public void setUseGetSet(boolean z8) {
        this.useGetSet = z8;
    }

    public void setVersion(boolean z8) {
        this.version = z8;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }

    public DatabaseFieldConfig(String str) {
        this.dataType = DEFAULT_DATA_TYPE;
        this.canBeNull = true;
        this.persisted = true;
        this.maxForeignAutoRefreshLevel = -1;
        this.persisterClass = DEFAULT_PERSISTER_CLASS;
        this.foreignCollectionMaxEagerLevel = 1;
        this.foreignCollectionOrderAscending = true;
        this.fieldName = str;
    }

    public DatabaseFieldConfig(String str, String str2, DataType dataType, String str3, int i8, boolean z8, boolean z9, boolean z10, String str4, boolean z11, DatabaseTableConfig<?> databaseTableConfig, boolean z12, Enum<?> r16, boolean z13, String str5, boolean z14, String str6, String str7, boolean z15, int i9, int i10) {
        this.dataType = DEFAULT_DATA_TYPE;
        this.canBeNull = true;
        this.persisted = true;
        this.maxForeignAutoRefreshLevel = -1;
        this.persisterClass = DEFAULT_PERSISTER_CLASS;
        this.foreignCollectionMaxEagerLevel = 1;
        this.foreignCollectionOrderAscending = true;
        this.fieldName = str;
        this.columnName = str2;
        this.dataType = DataType.UNKNOWN;
        this.defaultValue = str3;
        this.width = i8;
        this.canBeNull = z8;
        this.id = z9;
        this.generatedId = z10;
        this.generatedIdSequence = str4;
        this.foreign = z11;
        this.foreignTableConfig = databaseTableConfig;
        this.useGetSet = z12;
        this.unknownEnumValue = r16;
        this.throwIfNull = z13;
        this.format = str5;
        this.unique = z14;
        this.indexName = str6;
        this.uniqueIndexName = str7;
        this.foreignAutoRefresh = z15;
        this.maxForeignAutoRefreshLevel = i9;
        this.foreignCollectionMaxEagerLevel = i10;
    }
}
