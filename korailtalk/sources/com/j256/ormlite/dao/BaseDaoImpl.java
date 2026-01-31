package com.j256.ormlite.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.BaseDaoEnabled;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.PreparedDelete;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.PreparedUpdate;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.stmt.StatementExecutor;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.stmt.Where;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.j256.ormlite.table.ObjectFactory;
import com.j256.ormlite.table.TableInfo;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class BaseDaoImpl<T, ID> implements Dao<T, ID> {
    private static final ThreadLocal<List<BaseDaoImpl<?, ?>>> daoConfigLevelLocal = new ThreadLocal<List<BaseDaoImpl<?, ?>>>() { // from class: com.j256.ormlite.dao.BaseDaoImpl.1
        AnonymousClass1() {
        }

        @Override // java.lang.ThreadLocal
        public List<BaseDaoImpl<?, ?>> initialValue() {
            return new ArrayList(10);
        }
    };
    private static ReferenceObjectCache defaultObjectCache;
    protected ConnectionSource connectionSource;
    protected final Class<T> dataClass;
    protected DatabaseType databaseType;
    private boolean initialized;
    protected CloseableIterator<T> lastIterator;
    private ObjectCache objectCache;
    protected ObjectFactory<T> objectFactory;
    protected StatementExecutor<T, ID> statementExecutor;
    protected DatabaseTableConfig<T> tableConfig;
    protected TableInfo<T, ID> tableInfo;

    /* renamed from: com.j256.ormlite.dao.BaseDaoImpl$1 */
    static class AnonymousClass1 extends ThreadLocal<List<BaseDaoImpl<?, ?>>> {
        AnonymousClass1() {
        }

        @Override // java.lang.ThreadLocal
        public List<BaseDaoImpl<?, ?>> initialValue() {
            return new ArrayList(10);
        }
    }

    /* renamed from: com.j256.ormlite.dao.BaseDaoImpl$2 */
    class AnonymousClass2 implements CloseableIterable<T> {
        AnonymousClass2() {
        }

        @Override // com.j256.ormlite.dao.CloseableIterable
        public CloseableIterator<T> closeableIterator() {
            try {
                return BaseDaoImpl.this.createIterator(-1);
            } catch (Exception e8) {
                throw new IllegalStateException("Could not build iterator for " + BaseDaoImpl.this.dataClass, e8);
            }
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return closeableIterator();
        }
    }

    /* renamed from: com.j256.ormlite.dao.BaseDaoImpl$3 */
    class AnonymousClass3 implements CloseableIterable<T> {
        final /* synthetic */ PreparedQuery val$preparedQuery;

        AnonymousClass3(PreparedQuery preparedQuery) {
            preparedQuery = preparedQuery;
        }

        @Override // com.j256.ormlite.dao.CloseableIterable
        public CloseableIterator<T> closeableIterator() {
            try {
                return BaseDaoImpl.this.createIterator(preparedQuery, -1);
            } catch (Exception e8) {
                throw new IllegalStateException("Could not build prepared-query iterator for " + BaseDaoImpl.this.dataClass, e8);
            }
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return closeableIterator();
        }
    }

    /* renamed from: com.j256.ormlite.dao.BaseDaoImpl$4 */
    static class AnonymousClass4 extends BaseDaoImpl<T, ID> {
        AnonymousClass4(ConnectionSource connectionSource, Class cls) {
            super(connectionSource, cls);
        }

        @Override // com.j256.ormlite.dao.BaseDaoImpl, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    /* renamed from: com.j256.ormlite.dao.BaseDaoImpl$5 */
    static class AnonymousClass5 extends BaseDaoImpl<T, ID> {
        AnonymousClass5(ConnectionSource connectionSource, DatabaseTableConfig databaseTableConfig) {
            super(connectionSource, databaseTableConfig);
        }

        @Override // com.j256.ormlite.dao.BaseDaoImpl, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    protected BaseDaoImpl(Class<T> cls) {
        this(null, cls, null);
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap:java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] (LINE:1) com.j256.ormlite.dao.BaseDaoImpl.class) */
    public static synchronized void clearAllInternalObjectCaches() {
        synchronized (BaseDaoImpl.class) {
            ReferenceObjectCache referenceObjectCache = defaultObjectCache;
            if (referenceObjectCache != null) {
                referenceObjectCache.clearAll();
                defaultObjectCache = null;
            }
        }
    }

    static <T, ID> Dao<T, ID> createDao(ConnectionSource connectionSource, Class<T> cls) {
        return new BaseDaoImpl<T, ID>(connectionSource, cls) { // from class: com.j256.ormlite.dao.BaseDaoImpl.4
            AnonymousClass4(ConnectionSource connectionSource2, Class cls2) {
                super(connectionSource2, cls2);
            }

            @Override // com.j256.ormlite.dao.BaseDaoImpl, java.lang.Iterable
            public /* bridge */ /* synthetic */ Iterator iterator() {
                return super.iterator();
            }
        };
    }

    public CloseableIterator<T> createIterator(int i8) {
        try {
            return this.statementExecutor.buildIterator(this, this.connectionSource, i8, this.objectCache);
        } catch (Exception e8) {
            throw new IllegalStateException("Could not build iterator for " + this.dataClass, e8);
        }
    }

    private <FT> ForeignCollection<FT> makeEmptyForeignCollection(T t8, String str) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        checkForInitialized();
        ID idExtractId = t8 == null ? null : extractId(t8);
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            if (fieldType.getColumnName().equals(str)) {
                BaseForeignCollection baseForeignCollectionBuildForeignCollection = fieldType.buildForeignCollection(t8, idExtractId);
                if (t8 != null) {
                    fieldType.assignField(t8, baseForeignCollectionBuildForeignCollection, true, null);
                }
                return baseForeignCollectionBuildForeignCollection;
            }
        }
        throw new IllegalArgumentException("Could not find a field named " + str);
    }

    @Override // com.j256.ormlite.dao.Dao
    public void assignEmptyForeignCollection(T t8, String str) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        makeEmptyForeignCollection(t8, str);
    }

    @Override // com.j256.ormlite.dao.Dao
    public <CT> CT callBatchTasks(Callable<CT> callable) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return (CT) this.statementExecutor.callBatchTasks(readWriteConnection, this.connectionSource.saveSpecialConnection(readWriteConnection), callable);
        } finally {
            this.connectionSource.clearSpecialConnection(readWriteConnection);
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    protected void checkForInitialized() {
        if (!this.initialized) {
            throw new IllegalStateException("you must call initialize() before you can use the dao");
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public void clearObjectCache() {
        ObjectCache objectCache = this.objectCache;
        if (objectCache != null) {
            objectCache.clear(this.dataClass);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public void closeLastIterator() {
        CloseableIterator<T> closeableIterator = this.lastIterator;
        if (closeableIterator != null) {
            closeableIterator.close();
            this.lastIterator = null;
        }
    }

    @Override // com.j256.ormlite.dao.CloseableIterable
    public CloseableIterator<T> closeableIterator() {
        return iterator(-1);
    }

    @Override // com.j256.ormlite.dao.Dao
    public void commit(DatabaseConnection databaseConnection) {
        databaseConnection.commit(null);
    }

    @Override // com.j256.ormlite.dao.Dao
    public long countOf() {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            return this.statementExecutor.queryForCountStar(readOnlyConnection);
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.j256.ormlite.dao.Dao
    public int create(T t8) {
        checkForInitialized();
        if (t8 == 0) {
            return 0;
        }
        if (t8 instanceof BaseDaoEnabled) {
            ((BaseDaoEnabled) t8).setDao(this);
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.create(readWriteConnection, t8, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public T createIfNotExists(T t8) {
        if (t8 == null) {
            return null;
        }
        T tQueryForSameId = queryForSameId(t8);
        if (tQueryForSameId != null) {
            return tQueryForSameId;
        }
        create(t8);
        return t8;
    }

    @Override // com.j256.ormlite.dao.Dao
    public Dao.CreateOrUpdateStatus createOrUpdate(T t8) throws SQLException {
        if (t8 == null) {
            return new Dao.CreateOrUpdateStatus(false, false, 0);
        }
        ID idExtractId = extractId(t8);
        return (idExtractId == null || !idExists(idExtractId)) ? new Dao.CreateOrUpdateStatus(true, false, create(t8)) : new Dao.CreateOrUpdateStatus(false, true, update((BaseDaoImpl<T, ID>) t8));
    }

    @Override // com.j256.ormlite.dao.Dao
    public int delete(T t8) {
        checkForInitialized();
        if (t8 == null) {
            return 0;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.delete(readWriteConnection, t8, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public DeleteBuilder<T, ID> deleteBuilder() {
        checkForInitialized();
        return new DeleteBuilder<>(this.databaseType, this.tableInfo, this);
    }

    @Override // com.j256.ormlite.dao.Dao
    public int deleteById(ID id) {
        checkForInitialized();
        if (id == null) {
            return 0;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.deleteById(readWriteConnection, id, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public int deleteIds(Collection<ID> collection) {
        checkForInitialized();
        if (collection == null || collection.isEmpty()) {
            return 0;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.deleteIds(readWriteConnection, collection, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public void endThreadConnection(DatabaseConnection databaseConnection) {
        this.connectionSource.clearSpecialConnection(databaseConnection);
        this.connectionSource.releaseConnection(databaseConnection);
    }

    @Override // com.j256.ormlite.dao.Dao
    public int executeRaw(String str, String... strArr) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            try {
                return this.statementExecutor.executeRaw(readWriteConnection, str, strArr);
            } catch (SQLException e8) {
                throw SqlExceptionUtil.create("Could not run raw execute statement " + str, e8);
            }
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public int executeRawNoArgs(String str) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            try {
                return this.statementExecutor.executeRawNoArgs(readWriteConnection, str);
            } catch (SQLException e8) {
                throw SqlExceptionUtil.create("Could not run raw execute statement " + str, e8);
            }
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public ID extractId(T t8) throws SQLException {
        checkForInitialized();
        FieldType idField = this.tableInfo.getIdField();
        if (idField != null) {
            return (ID) idField.extractJavaFieldValue(t8);
        }
        throw new SQLException("Class " + this.dataClass + " does not have an id field");
    }

    @Override // com.j256.ormlite.dao.Dao
    public FieldType findForeignFieldType(Class<?> cls) {
        checkForInitialized();
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            if (fieldType.getType() == cls) {
                return fieldType;
            }
        }
        return null;
    }

    @Override // com.j256.ormlite.dao.Dao
    public ConnectionSource getConnectionSource() {
        return this.connectionSource;
    }

    @Override // com.j256.ormlite.dao.Dao
    public Class<T> getDataClass() {
        return this.dataClass;
    }

    @Override // com.j256.ormlite.dao.Dao
    public <FT> ForeignCollection<FT> getEmptyForeignCollection(String str) {
        return makeEmptyForeignCollection(null, str);
    }

    @Override // com.j256.ormlite.dao.Dao
    public ObjectCache getObjectCache() {
        return this.objectCache;
    }

    public ObjectFactory<T> getObjectFactory() {
        return this.objectFactory;
    }

    @Override // com.j256.ormlite.dao.Dao
    public RawRowMapper<T> getRawRowMapper() {
        return this.statementExecutor.getRawRowMapper();
    }

    @Override // com.j256.ormlite.dao.Dao
    public GenericRowMapper<T> getSelectStarRowMapper() {
        return this.statementExecutor.getSelectStarRowMapper();
    }

    public DatabaseTableConfig<T> getTableConfig() {
        return this.tableConfig;
    }

    public TableInfo<T, ID> getTableInfo() {
        return this.tableInfo;
    }

    @Override // com.j256.ormlite.dao.Dao
    public CloseableWrappedIterable<T> getWrappedIterable() {
        checkForInitialized();
        return new CloseableWrappedIterableImpl(new CloseableIterable<T>() { // from class: com.j256.ormlite.dao.BaseDaoImpl.2
            AnonymousClass2() {
            }

            @Override // com.j256.ormlite.dao.CloseableIterable
            public CloseableIterator<T> closeableIterator() {
                try {
                    return BaseDaoImpl.this.createIterator(-1);
                } catch (Exception e8) {
                    throw new IllegalStateException("Could not build iterator for " + BaseDaoImpl.this.dataClass, e8);
                }
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return closeableIterator();
            }
        });
    }

    @Override // com.j256.ormlite.dao.Dao
    public boolean idExists(ID id) {
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            return this.statementExecutor.ifExists(readOnlyConnection, id);
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public void initialize() {
        if (this.initialized) {
            return;
        }
        ConnectionSource connectionSource = this.connectionSource;
        if (connectionSource == null) {
            throw new IllegalStateException("connectionSource was never set on " + getClass().getSimpleName());
        }
        DatabaseType databaseType = connectionSource.getDatabaseType();
        this.databaseType = databaseType;
        if (databaseType == null) {
            throw new IllegalStateException("connectionSource is getting a null DatabaseType in " + getClass().getSimpleName());
        }
        DatabaseTableConfig<T> databaseTableConfig = this.tableConfig;
        if (databaseTableConfig == null) {
            this.tableInfo = new TableInfo<>(this.connectionSource, this, this.dataClass);
        } else {
            databaseTableConfig.extractFieldTypes(this.connectionSource);
            this.tableInfo = new TableInfo<>(this.databaseType, this, this.tableConfig);
        }
        this.statementExecutor = new StatementExecutor<>(this.databaseType, this.tableInfo, this);
        List<BaseDaoImpl<?, ?>> list = daoConfigLevelLocal.get();
        list.add(this);
        if (list.size() > 1) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            try {
                BaseDaoImpl<?, ?> baseDaoImpl = list.get(i8);
                DaoManager.registerDao(this.connectionSource, baseDaoImpl);
                try {
                    for (FieldType fieldType : baseDaoImpl.getTableInfo().getFieldTypes()) {
                        fieldType.configDaoInformation(this.connectionSource, baseDaoImpl.getDataClass());
                    }
                    baseDaoImpl.initialized = true;
                } catch (SQLException e8) {
                    DaoManager.unregisterDao(this.connectionSource, baseDaoImpl);
                    throw e8;
                }
            } finally {
                list.clear();
                daoConfigLevelLocal.remove();
            }
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public boolean isAutoCommit() {
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return isAutoCommit(readWriteConnection);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public boolean isTableExists() {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            return readOnlyConnection.isTableExists(this.tableInfo.getTableName());
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public boolean isUpdatable() {
        return this.tableInfo.isUpdatable();
    }

    @Override // com.j256.ormlite.dao.Dao
    public T mapSelectStarRow(DatabaseResults databaseResults) {
        return this.statementExecutor.getSelectStarRowMapper().mapRow(databaseResults);
    }

    @Override // com.j256.ormlite.dao.Dao
    public String objectToString(T t8) {
        checkForInitialized();
        return this.tableInfo.objectToString(t8);
    }

    @Override // com.j256.ormlite.dao.Dao
    public boolean objectsEqual(T t8, T t9) throws SQLException {
        checkForInitialized();
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            if (!fieldType.getDataPersister().dataIsEqual(fieldType.extractJavaFieldValue(t8), fieldType.extractJavaFieldValue(t9))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.j256.ormlite.dao.Dao
    public List<T> query(PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        return this.statementExecutor.query(this.connectionSource, preparedQuery, this.objectCache);
    }

    @Override // com.j256.ormlite.dao.Dao
    public QueryBuilder<T, ID> queryBuilder() {
        checkForInitialized();
        return new QueryBuilder<>(this.databaseType, this.tableInfo, this);
    }

    @Override // com.j256.ormlite.dao.Dao
    public List<T> queryForAll() {
        checkForInitialized();
        return this.statementExecutor.queryForAll(this.connectionSource, this.objectCache);
    }

    @Override // com.j256.ormlite.dao.Dao
    public List<T> queryForEq(String str, Object obj) {
        return queryBuilder().where().eq(str, obj).query();
    }

    @Override // com.j256.ormlite.dao.Dao
    public List<T> queryForFieldValues(Map<String, Object> map) {
        return queryForFieldValues(map, false);
    }

    @Override // com.j256.ormlite.dao.Dao
    public List<T> queryForFieldValuesArgs(Map<String, Object> map) {
        return queryForFieldValues(map, true);
    }

    @Override // com.j256.ormlite.dao.Dao
    public T queryForFirst(PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            return this.statementExecutor.queryForFirst(readOnlyConnection, preparedQuery, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public T queryForId(ID id) {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            return this.statementExecutor.queryForId(readOnlyConnection, id, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public List<T> queryForMatching(T t8) {
        return queryForMatching(t8, false);
    }

    @Override // com.j256.ormlite.dao.Dao
    public List<T> queryForMatchingArgs(T t8) {
        return queryForMatching(t8, true);
    }

    @Override // com.j256.ormlite.dao.Dao
    public T queryForSameId(T t8) {
        ID idExtractId;
        checkForInitialized();
        if (t8 == null || (idExtractId = extractId(t8)) == null) {
            return null;
        }
        return queryForId(idExtractId);
    }

    @Override // com.j256.ormlite.dao.Dao
    public GenericRawResults<String[]> queryRaw(String str, String... strArr) throws SQLException {
        checkForInitialized();
        try {
            return this.statementExecutor.queryRaw(this.connectionSource, str, strArr, this.objectCache);
        } catch (SQLException e8) {
            throw SqlExceptionUtil.create("Could not perform raw query for " + str, e8);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public long queryRawValue(String str, String... strArr) {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            try {
                return this.statementExecutor.queryForLong(readOnlyConnection, str, strArr);
            } catch (SQLException e8) {
                throw SqlExceptionUtil.create("Could not perform raw value query for " + str, e8);
            }
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.j256.ormlite.dao.Dao
    public int refresh(T t8) {
        checkForInitialized();
        if (t8 == 0) {
            return 0;
        }
        if (t8 instanceof BaseDaoEnabled) {
            ((BaseDaoEnabled) t8).setDao(this);
        }
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            return this.statementExecutor.refresh(readOnlyConnection, t8, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public void rollBack(DatabaseConnection databaseConnection) {
        databaseConnection.rollback(null);
    }

    @Override // com.j256.ormlite.dao.Dao
    public void setAutoCommit(boolean z8) {
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            setAutoCommit(readWriteConnection, z8);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public void setConnectionSource(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
    }

    @Override // com.j256.ormlite.dao.Dao
    public void setObjectCache(boolean z8) throws SQLException {
        ReferenceObjectCache referenceObjectCache;
        if (!z8) {
            ObjectCache objectCache = this.objectCache;
            if (objectCache != null) {
                objectCache.clear(this.dataClass);
                this.objectCache = null;
                return;
            }
            return;
        }
        if (this.objectCache == null) {
            if (this.tableInfo.getIdField() == null) {
                throw new SQLException("Class " + this.dataClass + " must have an id field to enable the object cache");
            }
            synchronized (BaseDaoImpl.class) {
                try {
                    if (defaultObjectCache == null) {
                        defaultObjectCache = ReferenceObjectCache.makeWeakCache();
                    }
                    referenceObjectCache = defaultObjectCache;
                    this.objectCache = referenceObjectCache;
                } catch (Throwable th) {
                    throw th;
                }
            }
            referenceObjectCache.registerClass(this.dataClass);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public void setObjectFactory(ObjectFactory<T> objectFactory) {
        checkForInitialized();
        this.objectFactory = objectFactory;
    }

    public void setTableConfig(DatabaseTableConfig<T> databaseTableConfig) {
        this.tableConfig = databaseTableConfig;
    }

    @Override // com.j256.ormlite.dao.Dao
    public DatabaseConnection startThreadConnection() {
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        this.connectionSource.saveSpecialConnection(readWriteConnection);
        return readWriteConnection;
    }

    @Override // com.j256.ormlite.dao.Dao
    public int update(T t8) {
        checkForInitialized();
        if (t8 == null) {
            return 0;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.update(readWriteConnection, t8, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public UpdateBuilder<T, ID> updateBuilder() {
        checkForInitialized();
        return new UpdateBuilder<>(this.databaseType, this.tableInfo, this);
    }

    @Override // com.j256.ormlite.dao.Dao
    public int updateId(T t8, ID id) {
        checkForInitialized();
        if (t8 == null) {
            return 0;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.updateId(readWriteConnection, t8, id, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public int updateRaw(String str, String... strArr) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            try {
                return this.statementExecutor.updateRaw(readWriteConnection, str, strArr);
            } catch (SQLException e8) {
                throw SqlExceptionUtil.create("Could not run raw update statement " + str, e8);
            }
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    protected BaseDaoImpl(ConnectionSource connectionSource, Class<T> cls) {
        this(connectionSource, cls, null);
    }

    static <T, ID> Dao<T, ID> createDao(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return new BaseDaoImpl<T, ID>(connectionSource, databaseTableConfig) { // from class: com.j256.ormlite.dao.BaseDaoImpl.5
            AnonymousClass5(ConnectionSource connectionSource2, DatabaseTableConfig databaseTableConfig2) {
                super(connectionSource2, databaseTableConfig2);
            }

            @Override // com.j256.ormlite.dao.BaseDaoImpl, java.lang.Iterable
            public /* bridge */ /* synthetic */ Iterator iterator() {
                return super.iterator();
            }
        };
    }

    private List<T> queryForFieldValues(Map<String, Object> map, boolean z8) {
        checkForInitialized();
        QueryBuilder<T, ID> queryBuilder = queryBuilder();
        Where<T, ID> where = queryBuilder.where();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (z8) {
                value = new SelectArg(value);
            }
            where.eq(entry.getKey(), value);
        }
        if (map.size() == 0) {
            return Collections.emptyList();
        }
        where.and(map.size());
        return queryBuilder.query();
    }

    private List<T> queryForMatching(T t8, boolean z8) {
        checkForInitialized();
        QueryBuilder<T, ID> queryBuilder = queryBuilder();
        Where<T, ID> where = queryBuilder.where();
        int i8 = 0;
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            Object fieldValueIfNotDefault = fieldType.getFieldValueIfNotDefault(t8);
            if (fieldValueIfNotDefault != null) {
                if (z8) {
                    fieldValueIfNotDefault = new SelectArg(fieldValueIfNotDefault);
                }
                where.eq(fieldType.getColumnName(), fieldValueIfNotDefault);
                i8++;
            }
        }
        if (i8 == 0) {
            return Collections.emptyList();
        }
        where.and(i8);
        return queryBuilder.query();
    }

    @Override // java.lang.Iterable
    public CloseableIterator<T> iterator() {
        return iterator(-1);
    }

    protected BaseDaoImpl(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        this(connectionSource, databaseTableConfig.getDataClass(), databaseTableConfig);
    }

    public CloseableIterator<T> createIterator(PreparedQuery<T> preparedQuery, int i8) throws SQLException {
        try {
            return this.statementExecutor.buildIterator(this, this.connectionSource, preparedQuery, this.objectCache, i8);
        } catch (SQLException e8) {
            throw SqlExceptionUtil.create("Could not build prepared-query iterator for " + this.dataClass, e8);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public CloseableWrappedIterable<T> getWrappedIterable(PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        return new CloseableWrappedIterableImpl(new CloseableIterable<T>() { // from class: com.j256.ormlite.dao.BaseDaoImpl.3
            final /* synthetic */ PreparedQuery val$preparedQuery;

            AnonymousClass3(PreparedQuery preparedQuery2) {
                preparedQuery = preparedQuery2;
            }

            @Override // com.j256.ormlite.dao.CloseableIterable
            public CloseableIterator<T> closeableIterator() {
                try {
                    return BaseDaoImpl.this.createIterator(preparedQuery, -1);
                } catch (Exception e8) {
                    throw new IllegalStateException("Could not build prepared-query iterator for " + BaseDaoImpl.this.dataClass, e8);
                }
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return closeableIterator();
            }
        });
    }

    @Override // com.j256.ormlite.dao.Dao
    public CloseableIterator<T> iterator(int i8) {
        checkForInitialized();
        CloseableIterator<T> closeableIteratorCreateIterator = createIterator(i8);
        this.lastIterator = closeableIteratorCreateIterator;
        return closeableIteratorCreateIterator;
    }

    private BaseDaoImpl(ConnectionSource connectionSource, Class<T> cls, DatabaseTableConfig<T> databaseTableConfig) {
        this.dataClass = cls;
        this.tableConfig = databaseTableConfig;
        if (connectionSource != null) {
            this.connectionSource = connectionSource;
            initialize();
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public boolean isAutoCommit(DatabaseConnection databaseConnection) {
        return databaseConnection.isAutoCommit();
    }

    @Override // com.j256.ormlite.dao.Dao
    public <GR> GenericRawResults<GR> queryRaw(String str, RawRowMapper<GR> rawRowMapper, String... strArr) throws SQLException {
        checkForInitialized();
        try {
            return (GenericRawResults<GR>) this.statementExecutor.queryRaw(this.connectionSource, str, rawRowMapper, strArr, this.objectCache);
        } catch (SQLException e8) {
            throw SqlExceptionUtil.create("Could not perform raw query for " + str, e8);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public void setAutoCommit(DatabaseConnection databaseConnection, boolean z8) {
        databaseConnection.setAutoCommit(z8);
    }

    @Override // com.j256.ormlite.dao.Dao
    public long countOf(PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        StatementBuilder.StatementType type = preparedQuery.getType();
        StatementBuilder.StatementType statementType = StatementBuilder.StatementType.SELECT_LONG;
        if (type == statementType) {
            DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
            try {
                return this.statementExecutor.queryForLong(readOnlyConnection, preparedQuery);
            } finally {
                this.connectionSource.releaseConnection(readOnlyConnection);
            }
        }
        throw new IllegalArgumentException("Prepared query is not of type " + statementType + ", did you call QueryBuilder.setCountOf(true)?");
    }

    @Override // com.j256.ormlite.dao.Dao
    public int delete(Collection<T> collection) {
        checkForInitialized();
        if (collection == null || collection.isEmpty()) {
            return 0;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.deleteObjects(readWriteConnection, collection, this.objectCache);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery) {
        return iterator(preparedQuery, -1);
    }

    @Override // com.j256.ormlite.dao.Dao
    public int update(PreparedUpdate<T> preparedUpdate) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.update(readWriteConnection, preparedUpdate);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery, int i8) throws SQLException {
        checkForInitialized();
        CloseableIterator<T> closeableIteratorCreateIterator = createIterator(preparedQuery, i8);
        this.lastIterator = closeableIteratorCreateIterator;
        return closeableIteratorCreateIterator;
    }

    @Override // com.j256.ormlite.dao.Dao
    public <UO> GenericRawResults<UO> queryRaw(String str, DataType[] dataTypeArr, RawRowObjectMapper<UO> rawRowObjectMapper, String... strArr) throws SQLException {
        checkForInitialized();
        try {
            return this.statementExecutor.queryRaw(this.connectionSource, str, dataTypeArr, rawRowObjectMapper, strArr, this.objectCache);
        } catch (SQLException e8) {
            throw SqlExceptionUtil.create("Could not perform raw query for " + str, e8);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public int delete(PreparedDelete<T> preparedDelete) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            return this.statementExecutor.delete(readWriteConnection, preparedDelete);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public GenericRawResults<Object[]> queryRaw(String str, DataType[] dataTypeArr, String... strArr) throws SQLException {
        checkForInitialized();
        try {
            return this.statementExecutor.queryRaw(this.connectionSource, str, dataTypeArr, strArr, this.objectCache);
        } catch (SQLException e8) {
            throw SqlExceptionUtil.create("Could not perform raw query for " + str, e8);
        }
    }

    @Override // com.j256.ormlite.dao.Dao
    public void setObjectCache(ObjectCache objectCache) throws SQLException {
        if (objectCache == null) {
            ObjectCache objectCache2 = this.objectCache;
            if (objectCache2 != null) {
                objectCache2.clear(this.dataClass);
                this.objectCache = null;
                return;
            }
            return;
        }
        ObjectCache objectCache3 = this.objectCache;
        if (objectCache3 != null && objectCache3 != objectCache) {
            objectCache3.clear(this.dataClass);
        }
        if (this.tableInfo.getIdField() != null) {
            this.objectCache = objectCache;
            objectCache.registerClass(this.dataClass);
        } else {
            throw new SQLException("Class " + this.dataClass + " must have an id field to enable the object cache");
        }
    }
}
