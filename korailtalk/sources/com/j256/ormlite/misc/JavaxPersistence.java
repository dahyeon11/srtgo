package com.j256.ormlite.misc;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DataPersisterManager;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseFieldConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Collection;

/* loaded from: classes2.dex */
public class JavaxPersistence {
    public static DatabaseFieldConfig createFieldConfig(DatabaseType databaseType, Field field) throws IllegalAccessException, SQLException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation;
        Annotation annotation2 = null;
        Annotation annotation3 = null;
        Annotation annotation4 = null;
        Annotation annotation5 = null;
        Annotation annotation6 = null;
        Annotation annotation7 = null;
        Annotation annotation8 = null;
        Annotation annotation9 = null;
        Annotation annotation10 = null;
        for (Annotation annotation11 : field.getAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation11.annotationType();
            if (clsAnnotationType.getName().equals("javax.persistence.Column")) {
                annotation2 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.Basic")) {
                annotation3 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.Id")) {
                annotation4 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.GeneratedValue")) {
                annotation9 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.OneToOne")) {
                annotation5 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.ManyToOne")) {
                annotation6 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.JoinColumn")) {
                annotation10 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.Enumerated")) {
                annotation7 = annotation11;
            }
            if (clsAnnotationType.getName().equals("javax.persistence.Version")) {
                annotation8 = annotation11;
            }
        }
        if (annotation2 == null && annotation3 == null && annotation4 == null && annotation5 == null && annotation6 == null && annotation7 == null && annotation8 == null) {
            return null;
        }
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig();
        String name = field.getName();
        if (databaseType.isEntityNamesMustBeUpCase()) {
            name = name.toUpperCase();
        }
        databaseFieldConfig.setFieldName(name);
        if (annotation2 != null) {
            try {
                String str = (String) annotation2.getClass().getMethod("name", null).invoke(annotation2, null);
                if (str != null && str.length() > 0) {
                    databaseFieldConfig.setColumnName(str);
                }
                annotation = annotation8;
                String str2 = (String) annotation2.getClass().getMethod("columnDefinition", null).invoke(annotation2, null);
                if (str2 != null && str2.length() > 0) {
                    databaseFieldConfig.setColumnDefinition(str2);
                }
                databaseFieldConfig.setWidth(((Integer) annotation2.getClass().getMethod("length", null).invoke(annotation2, null)).intValue());
                Boolean bool = (Boolean) annotation2.getClass().getMethod("nullable", null).invoke(annotation2, null);
                if (bool != null) {
                    databaseFieldConfig.setCanBeNull(bool.booleanValue());
                }
                Boolean bool2 = (Boolean) annotation2.getClass().getMethod("unique", null).invoke(annotation2, null);
                if (bool2 != null) {
                    databaseFieldConfig.setUnique(bool2.booleanValue());
                }
            } catch (Exception e8) {
                throw SqlExceptionUtil.create("Problem accessing fields from the @Column annotation for field " + field, e8);
            }
        } else {
            annotation = annotation8;
        }
        if (annotation3 != null) {
            try {
                Boolean bool3 = (Boolean) annotation3.getClass().getMethod("optional", null).invoke(annotation3, null);
                if (bool3 == null) {
                    databaseFieldConfig.setCanBeNull(true);
                } else {
                    databaseFieldConfig.setCanBeNull(bool3.booleanValue());
                }
            } catch (Exception e9) {
                throw SqlExceptionUtil.create("Problem accessing fields from the @Basic annotation for field " + field, e9);
            }
        }
        if (annotation4 != null) {
            if (annotation9 == null) {
                databaseFieldConfig.setId(true);
            } else {
                databaseFieldConfig.setGeneratedId(true);
            }
        }
        if (annotation5 != null || annotation6 != null) {
            if (Collection.class.isAssignableFrom(field.getType()) || ForeignCollection.class.isAssignableFrom(field.getType())) {
                databaseFieldConfig.setForeignCollection(true);
                if (annotation10 != null) {
                    try {
                        String str3 = (String) annotation10.getClass().getMethod("name", null).invoke(annotation10, null);
                        if (str3 != null && str3.length() > 0) {
                            databaseFieldConfig.setForeignCollectionColumnName(str3);
                        }
                        Object objInvoke = annotation10.getClass().getMethod("fetch", null).invoke(annotation10, null);
                        if (objInvoke != null && objInvoke.toString().equals("EAGER")) {
                            databaseFieldConfig.setForeignCollectionEager(true);
                        }
                    } catch (Exception e10) {
                        throw SqlExceptionUtil.create("Problem accessing fields from the @JoinColumn annotation for field " + field, e10);
                    }
                }
            } else {
                databaseFieldConfig.setForeign(true);
                if (annotation10 != null) {
                    try {
                        String str4 = (String) annotation10.getClass().getMethod("name", null).invoke(annotation10, null);
                        if (str4 != null && str4.length() > 0) {
                            databaseFieldConfig.setColumnName(str4);
                        }
                        Boolean bool4 = (Boolean) annotation10.getClass().getMethod("nullable", null).invoke(annotation10, null);
                        if (bool4 != null) {
                            databaseFieldConfig.setCanBeNull(bool4.booleanValue());
                        }
                        Boolean bool5 = (Boolean) annotation10.getClass().getMethod("unique", null).invoke(annotation10, null);
                        if (bool5 != null) {
                            databaseFieldConfig.setUnique(bool5.booleanValue());
                        }
                    } catch (Exception e11) {
                        throw SqlExceptionUtil.create("Problem accessing fields from the @JoinColumn annotation for field " + field, e11);
                    }
                }
            }
        }
        if (annotation7 != null) {
            try {
                Object objInvoke2 = annotation7.getClass().getMethod("value", null).invoke(annotation7, null);
                if (objInvoke2 == null || !objInvoke2.toString().equals("STRING")) {
                    databaseFieldConfig.setDataType(DataType.ENUM_INTEGER);
                } else {
                    databaseFieldConfig.setDataType(DataType.ENUM_STRING);
                }
            } catch (Exception e12) {
                throw SqlExceptionUtil.create("Problem accessing fields from the @Enumerated annotation for field " + field, e12);
            }
        }
        if (annotation != null) {
            databaseFieldConfig.setVersion(true);
        }
        if (databaseFieldConfig.getDataPersister() == null) {
            databaseFieldConfig.setDataPersister(DataPersisterManager.lookupForField(field));
        }
        databaseFieldConfig.setUseGetSet((DatabaseFieldConfig.findGetMethod(field, false) == null || DatabaseFieldConfig.findSetMethod(field, false) == null) ? false : true);
        return databaseFieldConfig;
    }

    public static String getEntityName(Class<?> cls) {
        Annotation annotation = null;
        for (Annotation annotation2 : cls.getAnnotations()) {
            if (annotation2.annotationType().getName().equals("javax.persistence.Entity")) {
                annotation = annotation2;
            }
        }
        if (annotation == null) {
            return null;
        }
        try {
            String str = (String) annotation.getClass().getMethod("name", null).invoke(annotation, null);
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            return null;
        } catch (Exception e8) {
            throw new IllegalStateException("Could not get entity name from class " + cls, e8);
        }
    }
}
