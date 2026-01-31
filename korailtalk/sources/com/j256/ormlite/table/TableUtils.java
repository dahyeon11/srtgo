package com.j256.ormlite.table;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class TableUtils {
    private static Logger logger = LoggerFactory.getLogger((Class<?>) TableUtils.class);
    private static final FieldType[] noFieldTypes = new FieldType[0];

    private TableUtils() {
    }

    private static <T, ID> void addCreateIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, boolean z8, boolean z9) {
        HashMap map = new HashMap();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            String uniqueIndexName = z9 ? fieldType.getUniqueIndexName() : fieldType.getIndexName();
            if (uniqueIndexName != null) {
                List arrayList = (List) map.get(uniqueIndexName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(uniqueIndexName, arrayList);
                }
                arrayList.add(fieldType.getColumnName());
            }
        }
        StringBuilder sb = new StringBuilder(128);
        for (Map.Entry entry : map.entrySet()) {
            logger.info("creating index '{}' for table '{}", entry.getKey(), tableInfo.getTableName());
            sb.append("CREATE ");
            if (z9) {
                sb.append("UNIQUE ");
            }
            sb.append("INDEX ");
            if (z8 && databaseType.isCreateIndexIfNotExistsSupported()) {
                sb.append("IF NOT EXISTS ");
            }
            databaseType.appendEscapedEntityName(sb, (String) entry.getKey());
            sb.append(" ON ");
            databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
            sb.append(" ( ");
            boolean z10 = true;
            for (String str : (List) entry.getValue()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb.append(", ");
                }
                databaseType.appendEscapedEntityName(sb, str);
            }
            sb.append(" )");
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private static <T, ID> void addCreateTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, List<String> list2, boolean z8) {
        boolean z9;
        int i8;
        int i9;
        FieldType[] fieldTypeArr;
        StringBuilder sb = new StringBuilder(256);
        sb.append("CREATE TABLE ");
        if (z8 && databaseType.isCreateIfNotExistsSupported()) {
            sb.append("IF NOT EXISTS ");
        }
        databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
        sb.append(" (");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        FieldType[] fieldTypes = tableInfo.getFieldTypes();
        int length = fieldTypes.length;
        boolean z10 = false;
        boolean z11 = true;
        int i10 = 0;
        while (i10 < length) {
            FieldType fieldType = fieldTypes[i10];
            if (fieldType.isForeignCollection()) {
                i8 = i10;
                i9 = length;
                fieldTypeArr = fieldTypes;
            } else {
                if (z11) {
                    z9 = z10;
                } else {
                    sb.append(", ");
                    z9 = z11;
                }
                String columnDefinition = fieldType.getColumnDefinition();
                if (columnDefinition == null) {
                    i8 = i10;
                    i9 = length;
                    fieldTypeArr = fieldTypes;
                    databaseType.appendColumnArg(tableInfo.getTableName(), sb, fieldType, arrayList, arrayList2, arrayList3, list2);
                } else {
                    i8 = i10;
                    i9 = length;
                    fieldTypeArr = fieldTypes;
                    databaseType.appendEscapedEntityName(sb, fieldType.getColumnName());
                    sb.append(' ');
                    sb.append(columnDefinition);
                    sb.append(' ');
                }
                z11 = z9;
            }
            i10 = i8 + 1;
            length = i9;
            fieldTypes = fieldTypeArr;
            z10 = false;
        }
        databaseType.addPrimaryKeySql(tableInfo.getFieldTypes(), arrayList, arrayList2, arrayList3, list2);
        databaseType.addUniqueComboSql(tableInfo.getFieldTypes(), arrayList, arrayList2, arrayList3, list2);
        for (String str : arrayList) {
            sb.append(", ");
            sb.append(str);
        }
        sb.append(") ");
        databaseType.appendCreateTableSuffix(sb);
        list.addAll(arrayList2);
        list.add(sb.toString());
        list.addAll(arrayList3);
        addCreateIndexStatements(databaseType, tableInfo, list, z8, false);
        addCreateIndexStatements(databaseType, tableInfo, list, z8, true);
    }

    private static <T, ID> void addDropIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list) {
        HashSet<String> hashSet = new HashSet();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            String indexName = fieldType.getIndexName();
            if (indexName != null) {
                hashSet.add(indexName);
            }
            String uniqueIndexName = fieldType.getUniqueIndexName();
            if (uniqueIndexName != null) {
                hashSet.add(uniqueIndexName);
            }
        }
        StringBuilder sb = new StringBuilder(48);
        for (String str : hashSet) {
            logger.info("dropping index '{}' for table '{}", str, tableInfo.getTableName());
            sb.append("DROP INDEX ");
            databaseType.appendEscapedEntityName(sb, str);
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private static <T, ID> void addDropTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            databaseType.dropColumnArg(fieldType, arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("DROP TABLE ");
        databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
        sb.append(' ');
        list.addAll(arrayList);
        list.add(sb.toString());
        list.addAll(arrayList2);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, Class<T> cls) {
        String strExtractTableName = DatabaseTableConfig.extractTableName(cls);
        if (connectionSource.getDatabaseType().isEntityNamesMustBeUpCase()) {
            strExtractTableName = strExtractTableName.toUpperCase();
        }
        return clearTable(connectionSource, strExtractTableName);
    }

    public static <T> int createTable(ConnectionSource connectionSource, Class<T> cls) {
        return createTable(connectionSource, (Class) cls, false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, Class<T> cls) {
        return createTable(connectionSource, (Class) cls, true);
    }

    private static <T, ID> int doCreateTable(ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z8) {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        logger.info("creating table '{}'", tableInfo.getTableName());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        addCreateTableStatements(databaseType, tableInfo, arrayList, arrayList2, z8);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection();
        try {
            return doStatements(readWriteConnection, "create", arrayList, false, databaseType.isCreateTableReturnsNegative(), databaseType.isCreateTableReturnsZero()) + doCreateTestQueries(readWriteConnection, databaseType, arrayList2);
        } finally {
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    private static int doCreateTestQueries(DatabaseConnection databaseConnection, DatabaseType databaseType, List<String> list) throws Throwable {
        int i8 = 0;
        for (String str : list) {
            CompiledStatement compiledStatement = null;
            try {
                try {
                    CompiledStatement compiledStatementCompileStatement = databaseConnection.compileStatement(str, StatementBuilder.StatementType.SELECT, noFieldTypes, -1);
                    try {
                        DatabaseResults databaseResultsRunQuery = compiledStatementCompileStatement.runQuery(null);
                        int i9 = 0;
                        for (boolean zFirst = databaseResultsRunQuery.first(); zFirst; zFirst = databaseResultsRunQuery.next()) {
                            i9++;
                        }
                        logger.info("executing create table after-query got {} results: {}", Integer.valueOf(i9), str);
                        compiledStatementCompileStatement.close();
                        i8++;
                    } catch (SQLException e8) {
                        e = e8;
                        compiledStatement = compiledStatementCompileStatement;
                        throw SqlExceptionUtil.create("executing create table after-query failed: " + str, e);
                    } catch (Throwable th) {
                        th = th;
                        compiledStatement = compiledStatementCompileStatement;
                        if (compiledStatement != null) {
                            compiledStatement.close();
                        }
                        throw th;
                    }
                } catch (SQLException e9) {
                    e = e9;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return i8;
    }

    private static <T, ID> int doDropTable(DatabaseType databaseType, ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z8) {
        logger.info("dropping table '{}'", tableInfo.getTableName());
        ArrayList arrayList = new ArrayList();
        addDropIndexStatements(databaseType, tableInfo, arrayList);
        addDropTableStatements(databaseType, tableInfo, arrayList);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection();
        try {
            return doStatements(readWriteConnection, "drop", arrayList, z8, databaseType.isCreateTableReturnsNegative(), false);
        } finally {
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int doStatements(com.j256.ormlite.support.DatabaseConnection r8, java.lang.String r9, java.util.Collection<java.lang.String> r10, boolean r11, boolean r12, boolean r13) throws java.sql.SQLException {
        /*
            java.util.Iterator r10 = r10.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r4 = com.j256.ormlite.stmt.StatementBuilder.StatementType.EXECUTE     // Catch: java.lang.Throwable -> L2f java.sql.SQLException -> L34
            com.j256.ormlite.field.FieldType[] r5 = com.j256.ormlite.table.TableUtils.noFieldTypes     // Catch: java.lang.Throwable -> L2f java.sql.SQLException -> L34
            r6 = -1
            com.j256.ormlite.support.CompiledStatement r3 = r8.compileStatement(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f java.sql.SQLException -> L34
            int r4 = r3.runExecute()     // Catch: java.lang.Throwable -> L2f java.sql.SQLException -> L34
            com.j256.ormlite.logger.Logger r5 = com.j256.ormlite.table.TableUtils.logger     // Catch: java.lang.Throwable -> L2f java.sql.SQLException -> L32
            java.lang.String r6 = "executed {} table statement changed {} rows: {}"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2f java.sql.SQLException -> L32
            r5.info(r6, r9, r7, r2)     // Catch: java.lang.Throwable -> L2f java.sql.SQLException -> L32
        L2b:
            r3.close()
            goto L42
        L2f:
            r8 = move-exception
            goto La9
        L32:
            r5 = move-exception
            goto L36
        L34:
            r5 = move-exception
            r4 = r0
        L36:
            if (r11 == 0) goto L93
            com.j256.ormlite.logger.Logger r6 = com.j256.ormlite.table.TableUtils.logger     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = "ignoring {} error '{}' for statement: {}"
            r6.info(r7, r9, r5, r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L42
            goto L2b
        L42:
            if (r4 >= 0) goto L6b
            if (r12 == 0) goto L47
            goto L8f
        L47:
            java.sql.SQLException r8 = new java.sql.SQLException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "SQL statement "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = " updated "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = " rows, we were expecting >= 0"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6b:
            if (r4 <= 0) goto L8f
            if (r13 != 0) goto L70
            goto L8f
        L70:
            java.sql.SQLException r8 = new java.sql.SQLException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "SQL statement updated "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = " rows, we were expecting == 0: "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L8f:
            int r1 = r1 + 1
            goto L6
        L93:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r8.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r9 = "SQL statement failed: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L2f
            r8.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2f
            java.sql.SQLException r8 = com.j256.ormlite.misc.SqlExceptionUtil.create(r8, r5)     // Catch: java.lang.Throwable -> L2f
            throw r8     // Catch: java.lang.Throwable -> L2f
        La9:
            if (r3 == 0) goto Lae
            r3.close()
        Lae:
            throw r8
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.table.TableUtils.doStatements(com.j256.ormlite.support.DatabaseConnection, java.lang.String, java.util.Collection, boolean, boolean, boolean):int");
    }

    public static <T, ID> int dropTable(ConnectionSource connectionSource, Class<T> cls, boolean z8) {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        Dao daoCreateDao = DaoManager.createDao(connectionSource, cls);
        return daoCreateDao instanceof BaseDaoImpl ? doDropTable(databaseType, connectionSource, ((BaseDaoImpl) daoCreateDao).getTableInfo(), z8) : doDropTable(databaseType, connectionSource, new TableInfo(connectionSource, (BaseDaoImpl) null, cls), z8);
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, Class<T> cls) {
        Dao daoCreateDao = DaoManager.createDao(connectionSource, cls);
        return daoCreateDao instanceof BaseDaoImpl ? addCreateTableStatements(connectionSource, ((BaseDaoImpl) daoCreateDao).getTableInfo(), false) : addCreateTableStatements(connectionSource, new TableInfo(connectionSource, (BaseDaoImpl) null, cls), false);
    }

    public static <T> int createTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return createTable(connectionSource, (DatabaseTableConfig) databaseTableConfig, false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return createTable(connectionSource, (DatabaseTableConfig) databaseTableConfig, true);
    }

    private static <T, ID> int createTable(ConnectionSource connectionSource, Class<T> cls, boolean z8) {
        Dao daoCreateDao = DaoManager.createDao(connectionSource, cls);
        if (daoCreateDao instanceof BaseDaoImpl) {
            return doCreateTable(connectionSource, ((BaseDaoImpl) daoCreateDao).getTableInfo(), z8);
        }
        return doCreateTable(connectionSource, new TableInfo(connectionSource, (BaseDaoImpl) null, cls), z8);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return clearTable(connectionSource, databaseTableConfig.getTableName());
    }

    private static <T> int clearTable(ConnectionSource connectionSource, String str) {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        StringBuilder sb = new StringBuilder(48);
        if (databaseType.isTruncateSupported()) {
            sb.append("TRUNCATE TABLE ");
        } else {
            sb.append("DELETE FROM ");
        }
        databaseType.appendEscapedEntityName(sb, str);
        String string = sb.toString();
        logger.info("clearing table '{}' with '{}", str, string);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection();
        CompiledStatement compiledStatementCompileStatement = null;
        try {
            compiledStatementCompileStatement = readWriteConnection.compileStatement(string, StatementBuilder.StatementType.EXECUTE, noFieldTypes, -1);
            int iRunExecute = compiledStatementCompileStatement.runExecute();
            compiledStatementCompileStatement.close();
            connectionSource.releaseConnection(readWriteConnection);
            return iRunExecute;
        } catch (Throwable th) {
            if (compiledStatementCompileStatement != null) {
                compiledStatementCompileStatement.close();
            }
            connectionSource.releaseConnection(readWriteConnection);
            throw th;
        }
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        Dao daoCreateDao = DaoManager.createDao(connectionSource, databaseTableConfig);
        if (daoCreateDao instanceof BaseDaoImpl) {
            return addCreateTableStatements(connectionSource, ((BaseDaoImpl) daoCreateDao).getTableInfo(), false);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return addCreateTableStatements(connectionSource, new TableInfo(connectionSource.getDatabaseType(), (BaseDaoImpl) null, databaseTableConfig), false);
    }

    public static <T, ID> int dropTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig, boolean z8) {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        Dao daoCreateDao = DaoManager.createDao(connectionSource, databaseTableConfig);
        if (daoCreateDao instanceof BaseDaoImpl) {
            return doDropTable(databaseType, connectionSource, ((BaseDaoImpl) daoCreateDao).getTableInfo(), z8);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return doDropTable(databaseType, connectionSource, new TableInfo(databaseType, (BaseDaoImpl) null, databaseTableConfig), z8);
    }

    private static <T, ID> int createTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig, boolean z8) {
        Dao daoCreateDao = DaoManager.createDao(connectionSource, databaseTableConfig);
        if (daoCreateDao instanceof BaseDaoImpl) {
            return doCreateTable(connectionSource, ((BaseDaoImpl) daoCreateDao).getTableInfo(), z8);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return doCreateTable(connectionSource, new TableInfo(connectionSource.getDatabaseType(), (BaseDaoImpl) null, databaseTableConfig), z8);
    }

    private static <T, ID> List<String> addCreateTableStatements(ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z8) {
        ArrayList arrayList = new ArrayList();
        addCreateTableStatements(connectionSource.getDatabaseType(), tableInfo, arrayList, new ArrayList(), z8);
        return arrayList;
    }
}
