package com.j256.ormlite.support;

import com.j256.ormlite.dao.ObjectCache;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public interface DatabaseResults {
    void close();

    void closeQuietly();

    int findColumn(String str);

    boolean first();

    BigDecimal getBigDecimal(int i8);

    InputStream getBlobStream(int i8);

    boolean getBoolean(int i8);

    byte getByte(int i8);

    byte[] getBytes(int i8);

    char getChar(int i8);

    int getColumnCount();

    String[] getColumnNames();

    double getDouble(int i8);

    float getFloat(int i8);

    int getInt(int i8);

    long getLong(int i8);

    ObjectCache getObjectCache();

    short getShort(int i8);

    String getString(int i8);

    Timestamp getTimestamp(int i8);

    boolean last();

    boolean moveAbsolute(int i8);

    boolean moveRelative(int i8);

    boolean next();

    boolean previous();

    boolean wasNull(int i8);
}
