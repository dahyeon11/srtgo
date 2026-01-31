package com.j256.ormlite.dao;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.PreparedDelete;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.PreparedUpdate;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.ObjectFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public interface Dao<T, ID> extends CloseableIterable<T> {

    public static class CreateOrUpdateStatus {
        private boolean created;
        private int numLinesChanged;
        private boolean updated;

        public CreateOrUpdateStatus(boolean z8, boolean z9, int i8) {
            this.created = z8;
            this.updated = z9;
            this.numLinesChanged = i8;
        }

        public int getNumLinesChanged() {
            return this.numLinesChanged;
        }

        public boolean isCreated() {
            return this.created;
        }

        public boolean isUpdated() {
            return this.updated;
        }
    }

    void assignEmptyForeignCollection(T t8, String str);

    <CT> CT callBatchTasks(Callable<CT> callable);

    void clearObjectCache();

    void closeLastIterator();

    void commit(DatabaseConnection databaseConnection);

    long countOf();

    long countOf(PreparedQuery<T> preparedQuery);

    int create(T t8);

    T createIfNotExists(T t8);

    CreateOrUpdateStatus createOrUpdate(T t8);

    int delete(PreparedDelete<T> preparedDelete);

    int delete(T t8);

    int delete(Collection<T> collection);

    DeleteBuilder<T, ID> deleteBuilder();

    int deleteById(ID id);

    int deleteIds(Collection<ID> collection);

    void endThreadConnection(DatabaseConnection databaseConnection);

    int executeRaw(String str, String... strArr);

    int executeRawNoArgs(String str);

    ID extractId(T t8);

    FieldType findForeignFieldType(Class<?> cls);

    ConnectionSource getConnectionSource();

    Class<T> getDataClass();

    <FT> ForeignCollection<FT> getEmptyForeignCollection(String str);

    ObjectCache getObjectCache();

    RawRowMapper<T> getRawRowMapper();

    GenericRowMapper<T> getSelectStarRowMapper();

    CloseableWrappedIterable<T> getWrappedIterable();

    CloseableWrappedIterable<T> getWrappedIterable(PreparedQuery<T> preparedQuery);

    boolean idExists(ID id);

    @Deprecated
    boolean isAutoCommit();

    boolean isAutoCommit(DatabaseConnection databaseConnection);

    boolean isTableExists();

    boolean isUpdatable();

    @Override // java.lang.Iterable
    CloseableIterator<T> iterator();

    CloseableIterator<T> iterator(int i8);

    CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery);

    CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery, int i8);

    T mapSelectStarRow(DatabaseResults databaseResults);

    String objectToString(T t8);

    boolean objectsEqual(T t8, T t9);

    List<T> query(PreparedQuery<T> preparedQuery);

    QueryBuilder<T, ID> queryBuilder();

    List<T> queryForAll();

    List<T> queryForEq(String str, Object obj);

    List<T> queryForFieldValues(Map<String, Object> map);

    List<T> queryForFieldValuesArgs(Map<String, Object> map);

    T queryForFirst(PreparedQuery<T> preparedQuery);

    T queryForId(ID id);

    List<T> queryForMatching(T t8);

    List<T> queryForMatchingArgs(T t8);

    T queryForSameId(T t8);

    <UO> GenericRawResults<UO> queryRaw(String str, RawRowMapper<UO> rawRowMapper, String... strArr);

    <UO> GenericRawResults<UO> queryRaw(String str, DataType[] dataTypeArr, RawRowObjectMapper<UO> rawRowObjectMapper, String... strArr);

    GenericRawResults<Object[]> queryRaw(String str, DataType[] dataTypeArr, String... strArr);

    GenericRawResults<String[]> queryRaw(String str, String... strArr);

    long queryRawValue(String str, String... strArr);

    int refresh(T t8);

    void rollBack(DatabaseConnection databaseConnection);

    void setAutoCommit(DatabaseConnection databaseConnection, boolean z8);

    @Deprecated
    void setAutoCommit(boolean z8);

    void setObjectCache(ObjectCache objectCache);

    void setObjectCache(boolean z8);

    void setObjectFactory(ObjectFactory<T> objectFactory);

    DatabaseConnection startThreadConnection();

    int update(PreparedUpdate<T> preparedUpdate);

    int update(T t8);

    UpdateBuilder<T, ID> updateBuilder();

    int updateId(T t8, ID id);

    int updateRaw(String str, String... strArr);
}
