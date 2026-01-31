package com.j256.ormlite.dao;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.stmt.mapped.MappedPreparedStmt;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class BaseForeignCollection<T, ID> implements ForeignCollection<T>, Serializable {
    private static final long serialVersionUID = -5158840898186237589L;
    protected final transient Dao<T, ID> dao;
    private final transient FieldType foreignFieldType;
    private final transient boolean orderAscending;
    private final transient String orderColumn;
    private final transient Object parent;
    private final transient Object parentId;
    private transient PreparedQuery<T> preparedQuery;

    protected BaseForeignCollection(Dao<T, ID> dao, Object obj, Object obj2, FieldType fieldType, String str, boolean z8) {
        this.dao = dao;
        this.foreignFieldType = fieldType;
        this.parentId = obj2;
        this.orderColumn = str;
        this.orderAscending = z8;
        this.parent = obj;
    }

    private boolean addElement(T t8) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.dao == null) {
            return false;
        }
        if (this.parent != null && this.foreignFieldType.getFieldValueIfNotDefault(t8) == null) {
            this.foreignFieldType.assignField(t8, this.parent, true, null);
        }
        this.dao.create(t8);
        return true;
    }

    @Override // com.j256.ormlite.dao.ForeignCollection, java.util.Collection
    public boolean add(T t8) {
        try {
            return addElement(t8);
        } catch (SQLException e8) {
            throw new IllegalStateException("Could not create data element in dao", e8);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            try {
                if (addElement(it.next())) {
                    z8 = true;
                }
            } catch (SQLException e8) {
                throw new IllegalStateException("Could not create data elements in dao", e8);
            }
        }
        return z8;
    }

    @Override // java.util.Collection
    public void clear() {
        if (this.dao == null) {
            return;
        }
        CloseableIterator<T> closeableIterator = closeableIterator();
        while (closeableIterator.hasNext()) {
            try {
                closeableIterator.next();
                closeableIterator.remove();
            } finally {
                try {
                    closeableIterator.close();
                } catch (SQLException unused) {
                }
            }
        }
    }

    protected PreparedQuery<T> getPreparedQuery() {
        if (this.dao == null) {
            return null;
        }
        if (this.preparedQuery == null) {
            SelectArg selectArg = new SelectArg();
            selectArg.setValue(this.parentId);
            QueryBuilder<T, ID> queryBuilder = this.dao.queryBuilder();
            String str = this.orderColumn;
            if (str != null) {
                queryBuilder.orderBy(str, this.orderAscending);
            }
            PreparedQuery<T> preparedQueryPrepare = queryBuilder.where().eq(this.foreignFieldType.getColumnName(), selectArg).prepare();
            this.preparedQuery = preparedQueryPrepare;
            if (preparedQueryPrepare instanceof MappedPreparedStmt) {
                ((MappedPreparedStmt) preparedQueryPrepare).setParentInformation(this.parent, this.parentId);
            }
        }
        return this.preparedQuery;
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public int refresh(T t8) {
        Dao<T, ID> dao = this.dao;
        if (dao == null) {
            return 0;
        }
        return dao.refresh(t8);
    }

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public abstract boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z8 = false;
        if (this.dao == null) {
            return false;
        }
        CloseableIterator<T> closeableIterator = closeableIterator();
        while (closeableIterator.hasNext()) {
            try {
                if (!collection.contains(closeableIterator.next())) {
                    closeableIterator.remove();
                    z8 = true;
                }
            } finally {
                try {
                    closeableIterator.close();
                } catch (SQLException unused) {
                }
            }
        }
        return z8;
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public int update(T t8) {
        Dao<T, ID> dao = this.dao;
        if (dao == null) {
            return 0;
        }
        return dao.update((Dao<T, ID>) t8);
    }
}
