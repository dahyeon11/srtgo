package com.j256.ormlite.misc;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import java.sql.Savepoint;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class TransactionManager {
    private static final String SAVE_POINT_PREFIX = "ORMLITE";
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) TransactionManager.class);
    private static AtomicInteger savePointCounter = new AtomicInteger();
    private ConnectionSource connectionSource;

    public TransactionManager() {
    }

    private static void commit(DatabaseConnection databaseConnection, Savepoint savepoint) {
        String savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.commit(savepoint);
        if (savepointName == null) {
            logger.debug("committed savePoint transaction");
        } else {
            logger.debug("committed savePoint transaction {}", savepointName);
        }
    }

    private static void rollBack(DatabaseConnection databaseConnection, Savepoint savepoint) {
        String savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.rollback(savepoint);
        if (savepointName == null) {
            logger.debug("rolled back savePoint transaction");
        } else {
            logger.debug("rolled back savePoint transaction {}", savepointName);
        }
    }

    public <T> T callInTransaction(Callable<T> callable) {
        return (T) callInTransaction(this.connectionSource, callable);
    }

    public void initialize() {
        if (this.connectionSource != null) {
            return;
        }
        throw new IllegalStateException("dataSource was not set on " + getClass().getSimpleName());
    }

    public void setConnectionSource(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
    }

    public TransactionManager(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
        initialize();
    }

    public static <T> T callInTransaction(ConnectionSource connectionSource, Callable<T> callable) {
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection();
        try {
            return (T) callInTransaction(readWriteConnection, connectionSource.saveSpecialConnection(readWriteConnection), connectionSource.getDatabaseType(), callable);
        } finally {
            connectionSource.clearSpecialConnection(readWriteConnection);
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public static <T> T callInTransaction(DatabaseConnection databaseConnection, DatabaseType databaseType, Callable<T> callable) {
        return (T) callInTransaction(databaseConnection, false, databaseType, callable);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0008, B:10:0x0015, B:12:0x001b, B:19:0x0032, B:21:0x004f, B:22:0x0057), top: B:51:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0008, B:10:0x0015, B:12:0x001b, B:19:0x0032, B:21:0x004f, B:22:0x0057), top: B:51:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0008, B:10:0x0015, B:12:0x001b, B:19:0x0032, B:21:0x004f, B:22:0x0057), top: B:51:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x006e, Exception -> 0x0071, SQLException -> 0x0073, TRY_LEAVE, TryCatch #7 {SQLException -> 0x0073, Exception -> 0x0071, blocks: (B:24:0x0064, B:26:0x006a), top: B:58:0x0064, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T callInTransaction(com.j256.ormlite.support.DatabaseConnection r6, boolean r7, com.j256.ormlite.db.DatabaseType r8, java.util.concurrent.Callable<T> r9) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "after commit exception, rolling back to save-point also threw exception"
            java.lang.String r1 = "restored auto-commit to true"
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L15
            boolean r7 = r8.isNestedSavePointsSupported()     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto Lf
            goto L15
        Lf:
            r7 = 0
            r8 = r3
            goto L64
        L12:
            r7 = move-exception
            goto L9e
        L15:
            boolean r7 = r6.isAutoCommitSupported()     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L32
            boolean r7 = r6.isAutoCommit()     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L31
            r6.setAutoCommit(r3)     // Catch: java.lang.Throwable -> L2c
            com.j256.ormlite.logger.Logger r8 = com.j256.ormlite.misc.TransactionManager.logger     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "had to set auto-commit to false"
            r8.debug(r3)     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r8 = move-exception
            r3 = r7
            r7 = r8
            goto L9e
        L31:
            r3 = r7
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r7.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r8 = "ORMLITE"
            r7.append(r8)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicInteger r8 = com.j256.ormlite.misc.TransactionManager.savePointCounter     // Catch: java.lang.Throwable -> L12
            int r8 = r8.incrementAndGet()     // Catch: java.lang.Throwable -> L12
            r7.append(r8)     // Catch: java.lang.Throwable -> L12
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L12
            java.sql.Savepoint r7 = r6.setSavePoint(r7)     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L57
            com.j256.ormlite.logger.Logger r8 = com.j256.ormlite.misc.TransactionManager.logger     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "started savePoint transaction"
            r8.debug(r4)     // Catch: java.lang.Throwable -> L12
            goto L62
        L57:
            com.j256.ormlite.logger.Logger r8 = com.j256.ormlite.misc.TransactionManager.logger     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "started savePoint transaction {}"
            java.lang.String r5 = r7.getSavepointName()     // Catch: java.lang.Throwable -> L12
            r8.debug(r4, r5)     // Catch: java.lang.Throwable -> L12
        L62:
            r8 = r3
            r3 = r2
        L64:
            java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L71 java.sql.SQLException -> L73
            if (r3 == 0) goto L75
            commit(r6, r7)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L71 java.sql.SQLException -> L73
            goto L75
        L6e:
            r7 = move-exception
            r3 = r8
            goto L9e
        L71:
            r9 = move-exception
            goto L80
        L73:
            r9 = move-exception
            goto L92
        L75:
            if (r8 == 0) goto L7f
            r6.setAutoCommit(r2)
            com.j256.ormlite.logger.Logger r6 = com.j256.ormlite.misc.TransactionManager.logger
            r6.debug(r1)
        L7f:
            return r9
        L80:
            if (r3 == 0) goto L8b
            rollBack(r6, r7)     // Catch: java.lang.Throwable -> L6e java.sql.SQLException -> L86
            goto L8b
        L86:
            com.j256.ormlite.logger.Logger r7 = com.j256.ormlite.misc.TransactionManager.logger     // Catch: java.lang.Throwable -> L6e
            r7.error(r9, r0)     // Catch: java.lang.Throwable -> L6e
        L8b:
            java.lang.String r7 = "Transaction callable threw non-SQL exception"
            java.sql.SQLException r7 = com.j256.ormlite.misc.SqlExceptionUtil.create(r7, r9)     // Catch: java.lang.Throwable -> L6e
            throw r7     // Catch: java.lang.Throwable -> L6e
        L92:
            if (r3 == 0) goto L9d
            rollBack(r6, r7)     // Catch: java.lang.Throwable -> L6e java.sql.SQLException -> L98
            goto L9d
        L98:
            com.j256.ormlite.logger.Logger r7 = com.j256.ormlite.misc.TransactionManager.logger     // Catch: java.lang.Throwable -> L6e
            r7.error(r9, r0)     // Catch: java.lang.Throwable -> L6e
        L9d:
            throw r9     // Catch: java.lang.Throwable -> L6e
        L9e:
            if (r3 == 0) goto La8
            r6.setAutoCommit(r2)
            com.j256.ormlite.logger.Logger r6 = com.j256.ormlite.misc.TransactionManager.logger
            r6.debug(r1)
        La8:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.misc.TransactionManager.callInTransaction(com.j256.ormlite.support.DatabaseConnection, boolean, com.j256.ormlite.db.DatabaseType, java.util.concurrent.Callable):java.lang.Object");
    }
}
