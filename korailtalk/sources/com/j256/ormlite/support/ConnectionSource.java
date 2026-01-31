package com.j256.ormlite.support;

import com.j256.ormlite.db.DatabaseType;

/* loaded from: classes2.dex */
public interface ConnectionSource {
    void clearSpecialConnection(DatabaseConnection databaseConnection);

    void close();

    void closeQuietly();

    DatabaseType getDatabaseType();

    DatabaseConnection getReadOnlyConnection();

    DatabaseConnection getReadWriteConnection();

    DatabaseConnection getSpecialConnection();

    boolean isOpen();

    void releaseConnection(DatabaseConnection databaseConnection);

    boolean saveSpecialConnection(DatabaseConnection databaseConnection);
}
