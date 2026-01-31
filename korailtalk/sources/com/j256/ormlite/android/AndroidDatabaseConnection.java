package com.j256.ormlite.android;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.misc.VersionUtils;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.GeneratedKeyHolder;
import java.sql.SQLException;
import java.sql.Savepoint;

/* loaded from: classes2.dex */
public class AndroidDatabaseConnection implements DatabaseConnection {
    private static final String ANDROID_VERSION = "VERSION__4.48__";
    private final boolean cancelQueriesEnabled;
    private final SQLiteDatabase db;
    private final boolean readWrite;
    private static Logger logger = LoggerFactory.getLogger((Class<?>) AndroidDatabaseConnection.class);
    private static final String[] NO_STRING_ARGS = new String[0];

    /* renamed from: com.j256.ormlite.android.AndroidDatabaseConnection$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$j256$ormlite$field$SqlType;

        static {
            int[] iArr = new int[SqlType.values().length];
            $SwitchMap$com$j256$ormlite$field$SqlType = iArr;
            try {
                iArr[SqlType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.LONG_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.CHAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.BYTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.SHORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.INTEGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.LONG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.DOUBLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.BYTE_ARRAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.SERIALIZABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.BLOB.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.BIG_DECIMAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$j256$ormlite$field$SqlType[SqlType.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private static class OurSavePoint implements Savepoint {
        private String name;

        public OurSavePoint(String str) {
            this.name = str;
        }

        @Override // java.sql.Savepoint
        public int getSavepointId() {
            return 0;
        }

        @Override // java.sql.Savepoint
        public String getSavepointName() {
            return this.name;
        }
    }

    static {
        VersionUtils.checkCoreVersusAndroidVersions(ANDROID_VERSION);
    }

    public AndroidDatabaseConnection(SQLiteDatabase sQLiteDatabase, boolean z8) {
        this(sQLiteDatabase, z8, false);
    }

    private void bindArgs(SQLiteStatement sQLiteStatement, Object[] objArr, FieldType[] fieldTypeArr) throws SQLException {
        if (objArr == null) {
            return;
        }
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                sQLiteStatement.bindNull(i8 + 1);
            } else {
                SqlType sqlType = fieldTypeArr[i8].getSqlType();
                switch (AnonymousClass1.$SwitchMap$com$j256$ormlite$field$SqlType[sqlType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        sQLiteStatement.bindString(i8 + 1, obj.toString());
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        sQLiteStatement.bindLong(i8 + 1, ((Number) obj).longValue());
                        break;
                    case 9:
                    case 10:
                        sQLiteStatement.bindDouble(i8 + 1, ((Number) obj).doubleValue());
                        break;
                    case 11:
                    case 12:
                        sQLiteStatement.bindBlob(i8 + 1, (byte[]) obj);
                        break;
                    case 13:
                    case 14:
                    case 15:
                        throw new SQLException("Invalid Android type: " + sqlType);
                    default:
                        throw new SQLException("Unknown sql argument type: " + sqlType);
                }
            }
        }
    }

    private String[] toStrings(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        String[] strArr = new String[objArr.length];
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                strArr[i8] = null;
            } else {
                strArr[i8] = obj.toString();
            }
        }
        return strArr;
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public void close() throws SQLException {
        try {
            this.db.close();
            logger.trace("{}: db {} closed", this, this.db);
        } catch (android.database.SQLException e8) {
            throw SqlExceptionUtil.create("problems closing the database connection", e8);
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public void closeQuietly() {
        try {
            close();
        } catch (SQLException unused) {
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public void commit(Savepoint savepoint) throws SQLException {
        try {
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
            if (savepoint == null) {
                logger.trace("{}: transaction is successfuly ended", this);
            } else {
                logger.trace("{}: transaction {} is successfuly ended", this, savepoint.getSavepointName());
            }
        } catch (android.database.SQLException e8) {
            if (savepoint == null) {
                throw SqlExceptionUtil.create("problems commiting transaction", e8);
            }
            throw SqlExceptionUtil.create("problems commiting transaction " + savepoint.getSavepointName(), e8);
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public CompiledStatement compileStatement(String str, StatementBuilder.StatementType statementType, FieldType[] fieldTypeArr, int i8) {
        AndroidCompiledStatement androidCompiledStatement = new AndroidCompiledStatement(str, this.db, statementType, this.cancelQueriesEnabled);
        logger.trace("{}: compiled statement got {}: {}", this, androidCompiledStatement, str);
        return androidCompiledStatement;
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public int delete(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        return update(str, objArr, fieldTypeArr, "deleted");
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public int executeStatement(String str, int i8) {
        return AndroidCompiledStatement.execSql(this.db, str, str, NO_STRING_ARGS);
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public int insert(String str, Object[] objArr, FieldType[] fieldTypeArr, GeneratedKeyHolder generatedKeyHolder) {
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                sQLiteStatementCompileStatement = this.db.compileStatement(str);
                bindArgs(sQLiteStatementCompileStatement, objArr, fieldTypeArr);
                long jExecuteInsert = sQLiteStatementCompileStatement.executeInsert();
                if (generatedKeyHolder != null) {
                    generatedKeyHolder.addKey(Long.valueOf(jExecuteInsert));
                }
                logger.trace("{}: insert statement is compiled and executed, changed {}: {}", (Object) this, (Object) 1, (Object) str);
                sQLiteStatementCompileStatement.close();
                return 1;
            } catch (android.database.SQLException e8) {
                throw SqlExceptionUtil.create("inserting to database failed: " + str, e8);
            }
        } catch (Throwable th) {
            if (sQLiteStatementCompileStatement != null) {
                sQLiteStatementCompileStatement.close();
            }
            throw th;
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public boolean isAutoCommit() throws SQLException {
        try {
            boolean zInTransaction = this.db.inTransaction();
            logger.trace("{}: in transaction is {}", this, Boolean.valueOf(zInTransaction));
            return !zInTransaction;
        } catch (android.database.SQLException e8) {
            throw SqlExceptionUtil.create("problems getting auto-commit from database", e8);
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public boolean isAutoCommitSupported() {
        return true;
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public boolean isClosed() throws SQLException {
        try {
            boolean zIsOpen = this.db.isOpen();
            logger.trace("{}: db {} isOpen returned {}", this, this.db, Boolean.valueOf(zIsOpen));
            return !zIsOpen;
        } catch (android.database.SQLException e8) {
            throw SqlExceptionUtil.create("problems detecting if the database is closed", e8);
        }
    }

    public boolean isReadWrite() {
        return this.readWrite;
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public boolean isTableExists(String str) {
        Cursor cursorRawQuery = this.db.rawQuery("SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = '" + str + "'", null);
        try {
            boolean z8 = cursorRawQuery.getCount() > 0;
            logger.trace("{}: isTableExists '{}' returned {}", this, str, Boolean.valueOf(z8));
            return z8;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public long queryForLong(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                sQLiteStatementCompileStatement = this.db.compileStatement(str);
                long jSimpleQueryForLong = sQLiteStatementCompileStatement.simpleQueryForLong();
                logger.trace("{}: query for long simple query returned {}: {}", this, Long.valueOf(jSimpleQueryForLong), str);
                sQLiteStatementCompileStatement.close();
                return jSimpleQueryForLong;
            } catch (android.database.SQLException e8) {
                throw SqlExceptionUtil.create("queryForLong from database failed: " + str, e8);
            }
        } catch (Throwable th) {
            if (sQLiteStatementCompileStatement != null) {
                sQLiteStatementCompileStatement.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    @Override // com.j256.ormlite.support.DatabaseConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object queryForOne(java.lang.String r4, java.lang.Object[] r5, com.j256.ormlite.field.FieldType[] r6, com.j256.ormlite.stmt.GenericRowMapper<T> r7, com.j256.ormlite.dao.ObjectCache r8) throws java.lang.Throwable {
        /*
            r3 = this;
            r6 = 0
            android.database.sqlite.SQLiteDatabase r0 = r3.db     // Catch: java.lang.Throwable -> L40 android.database.SQLException -> L42
            java.lang.String[] r5 = r3.toStrings(r5)     // Catch: java.lang.Throwable -> L40 android.database.SQLException -> L42
            android.database.Cursor r5 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L40 android.database.SQLException -> L42
            com.j256.ormlite.android.AndroidDatabaseResults r0 = new com.j256.ormlite.android.AndroidDatabaseResults     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            r0.<init>(r5, r8)     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            com.j256.ormlite.logger.Logger r8 = com.j256.ormlite.android.AndroidDatabaseConnection.logger     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            java.lang.String r1 = "{}: queried for one result: {}"
            r8.trace(r1, r3, r4)     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            boolean r8 = r0.first()     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            if (r8 != 0) goto L23
            if (r5 == 0) goto L22
            r5.close()
        L22:
            return r6
        L23:
            java.lang.Object r6 = r7.mapRow(r0)     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            boolean r7 = r0.next()     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            if (r7 == 0) goto L3a
            java.lang.Object r4 = com.j256.ormlite.support.DatabaseConnection.MORE_THAN_ONE     // Catch: java.lang.Throwable -> L35 android.database.SQLException -> L38
            if (r5 == 0) goto L34
            r5.close()
        L34:
            return r4
        L35:
            r4 = move-exception
            r6 = r5
            goto L5c
        L38:
            r6 = move-exception
            goto L46
        L3a:
            if (r5 == 0) goto L3f
            r5.close()
        L3f:
            return r6
        L40:
            r4 = move-exception
            goto L5c
        L42:
            r5 = move-exception
            r2 = r6
            r6 = r5
            r5 = r2
        L46:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r7.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r8 = "queryForOne from database failed: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L35
            r7.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L35
            java.sql.SQLException r4 = com.j256.ormlite.misc.SqlExceptionUtil.create(r4, r6)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L5c:
            if (r6 == 0) goto L61
            r6.close()
        L61:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidDatabaseConnection.queryForOne(java.lang.String, java.lang.Object[], com.j256.ormlite.field.FieldType[], com.j256.ormlite.stmt.GenericRowMapper, com.j256.ormlite.dao.ObjectCache):java.lang.Object");
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public void rollback(Savepoint savepoint) throws SQLException {
        try {
            this.db.endTransaction();
            if (savepoint == null) {
                logger.trace("{}: transaction is ended, unsuccessfuly", this);
            } else {
                logger.trace("{}: transaction {} is ended, unsuccessfuly", this, savepoint.getSavepointName());
            }
        } catch (android.database.SQLException e8) {
            if (savepoint == null) {
                throw SqlExceptionUtil.create("problems rolling back transaction", e8);
            }
            throw SqlExceptionUtil.create("problems rolling back transaction " + savepoint.getSavepointName(), e8);
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public void setAutoCommit(boolean z8) {
        if (!z8) {
            if (this.db.inTransaction()) {
                return;
            }
            this.db.beginTransaction();
        } else if (this.db.inTransaction()) {
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
        }
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public Savepoint setSavePoint(String str) throws SQLException {
        try {
            this.db.beginTransaction();
            logger.trace("{}: save-point set with name {}", this, str);
            return new OurSavePoint(str);
        } catch (android.database.SQLException e8) {
            throw SqlExceptionUtil.create("problems beginning transaction " + str, e8);
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(super.hashCode());
    }

    @Override // com.j256.ormlite.support.DatabaseConnection
    public int update(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        return update(str, objArr, fieldTypeArr, "updated");
    }

    public AndroidDatabaseConnection(SQLiteDatabase sQLiteDatabase, boolean z8, boolean z9) {
        this.db = sQLiteDatabase;
        this.readWrite = z8;
        this.cancelQueriesEnabled = z9;
        logger.trace("{}: db {} opened, read-write = {}", this, sQLiteDatabase, Boolean.valueOf(z8));
    }

    private int update(String str, Object[] objArr, FieldType[] fieldTypeArr, String str2) throws Throwable {
        int iSimpleQueryForLong;
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                SQLiteStatement sQLiteStatementCompileStatement2 = this.db.compileStatement(str);
                try {
                    bindArgs(sQLiteStatementCompileStatement2, objArr, fieldTypeArr);
                    sQLiteStatementCompileStatement2.execute();
                    sQLiteStatementCompileStatement2.close();
                    try {
                        sQLiteStatementCompileStatement = this.db.compileStatement("SELECT CHANGES()");
                        iSimpleQueryForLong = (int) sQLiteStatementCompileStatement.simpleQueryForLong();
                        sQLiteStatementCompileStatement.close();
                    } catch (android.database.SQLException unused) {
                        if (sQLiteStatementCompileStatement != null) {
                            sQLiteStatementCompileStatement.close();
                        }
                        iSimpleQueryForLong = 1;
                    } catch (Throwable th) {
                        if (sQLiteStatementCompileStatement != null) {
                            sQLiteStatementCompileStatement.close();
                        }
                        throw th;
                    }
                    logger.trace("{} statement is compiled and executed, changed {}: {}", str2, Integer.valueOf(iSimpleQueryForLong), str);
                    return iSimpleQueryForLong;
                } catch (android.database.SQLException e8) {
                    e = e8;
                    throw SqlExceptionUtil.create("updating database failed: " + str, e);
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteStatementCompileStatement = sQLiteStatementCompileStatement2;
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.close();
                    }
                    throw th;
                }
            } catch (android.database.SQLException e9) {
                e = e9;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    @Override // com.j256.ormlite.support.DatabaseConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long queryForLong(java.lang.String r6, java.lang.Object[] r7, com.j256.ormlite.field.FieldType[] r8) throws java.lang.Throwable {
        /*
            r5 = this;
            r8 = 0
            android.database.sqlite.SQLiteDatabase r0 = r5.db     // Catch: java.lang.Throwable -> L34 android.database.SQLException -> L36
            java.lang.String[] r7 = r5.toStrings(r7)     // Catch: java.lang.Throwable -> L34 android.database.SQLException -> L36
            android.database.Cursor r7 = r0.rawQuery(r6, r7)     // Catch: java.lang.Throwable -> L34 android.database.SQLException -> L36
            com.j256.ormlite.android.AndroidDatabaseResults r0 = new com.j256.ormlite.android.AndroidDatabaseResults     // Catch: java.lang.Throwable -> L1c android.database.SQLException -> L1f
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> L1c android.database.SQLException -> L1f
            boolean r8 = r0.first()     // Catch: java.lang.Throwable -> L1c android.database.SQLException -> L1f
            if (r8 == 0) goto L21
            r8 = 0
            long r0 = r0.getLong(r8)     // Catch: java.lang.Throwable -> L1c android.database.SQLException -> L1f
            goto L23
        L1c:
            r6 = move-exception
            r8 = r7
            goto L50
        L1f:
            r8 = move-exception
            goto L3a
        L21:
            r0 = 0
        L23:
            com.j256.ormlite.logger.Logger r8 = com.j256.ormlite.android.AndroidDatabaseConnection.logger     // Catch: java.lang.Throwable -> L1c android.database.SQLException -> L1f
            java.lang.String r2 = "{}: query for long raw query returned {}: {}"
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1c android.database.SQLException -> L1f
            r8.trace(r2, r5, r3, r6)     // Catch: java.lang.Throwable -> L1c android.database.SQLException -> L1f
            if (r7 == 0) goto L33
            r7.close()
        L33:
            return r0
        L34:
            r6 = move-exception
            goto L50
        L36:
            r7 = move-exception
            r4 = r8
            r8 = r7
            r7 = r4
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "queryForLong from database failed: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1c
            r0.append(r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L1c
            java.sql.SQLException r6 = com.j256.ormlite.misc.SqlExceptionUtil.create(r6, r8)     // Catch: java.lang.Throwable -> L1c
            throw r6     // Catch: java.lang.Throwable -> L1c
        L50:
            if (r8 == 0) goto L55
            r8.close()
        L55:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidDatabaseConnection.queryForLong(java.lang.String, java.lang.Object[], com.j256.ormlite.field.FieldType[]):long");
    }
}
