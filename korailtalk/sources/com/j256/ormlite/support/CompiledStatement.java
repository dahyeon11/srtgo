package com.j256.ormlite.support;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.field.SqlType;

/* loaded from: classes2.dex */
public interface CompiledStatement {
    void cancel();

    void close();

    void closeQuietly();

    int getColumnCount();

    String getColumnName(int i8);

    int runExecute();

    DatabaseResults runQuery(ObjectCache objectCache);

    int runUpdate();

    void setMaxRows(int i8);

    void setObject(int i8, Object obj, SqlType sqlType);

    void setQueryTimeout(long j8);
}
