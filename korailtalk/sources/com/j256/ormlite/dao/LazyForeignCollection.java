package com.j256.ormlite.dao;

import com.j256.ormlite.field.FieldType;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class LazyForeignCollection<T, ID> extends BaseForeignCollection<T, ID> implements ForeignCollection<T>, Serializable {
    private static final long serialVersionUID = -5460708106909626233L;
    private transient CloseableIterator<T> lastIterator;

    public LazyForeignCollection(Dao<T, ID> dao, Object obj, Object obj2, FieldType fieldType, String str, boolean z8) {
        super(dao, obj, obj2, fieldType, str, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CloseableIterator<T> seperateIteratorThrow(int i8) {
        Dao<T, ID> dao = this.dao;
        if (dao != null) {
            return dao.iterator(getPreparedQuery(), i8);
        }
        throw new IllegalStateException("Internal DAO object is null.  Lazy collections cannot be used if they have been deserialized.");
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public void closeLastIterator() {
        CloseableIterator<T> closeableIterator = this.lastIterator;
        if (closeableIterator != null) {
            closeableIterator.close();
            this.lastIterator = null;
        }
    }

    @Override // com.j256.ormlite.dao.CloseableIterable
    public CloseableIterator<T> closeableIterator() {
        return closeableIterator(-1);
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        CloseableIterator<T> it = iterator();
        while (it.hasNext()) {
            try {
                if (it.next().equals(obj)) {
                    try {
                        return true;
                    } catch (SQLException unused) {
                        return true;
                    }
                }
            } finally {
                try {
                    it.close();
                } catch (SQLException unused2) {
                }
            }
        }
        try {
            it.close();
            return false;
        } catch (SQLException unused3) {
            return false;
        }
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        HashSet hashSet = new HashSet(collection);
        CloseableIterator<T> it = iterator();
        while (it.hasNext()) {
            try {
                hashSet.remove(it.next());
            } catch (Throwable th) {
                try {
                    it.close();
                } catch (SQLException unused) {
                }
                throw th;
            }
        }
        boolean zIsEmpty = hashSet.isEmpty();
        try {
            it.close();
        } catch (SQLException unused2) {
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public CloseableWrappedIterable<T> getWrappedIterable() {
        return getWrappedIterable(-1);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public boolean isEager() {
        return false;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        CloseableIterator<T> it = iterator();
        try {
            return !it.hasNext();
        } finally {
            try {
                it.close();
            } catch (SQLException unused) {
            }
        }
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public CloseableIterator<T> iteratorThrow() {
        return iteratorThrow(-1);
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public int refreshAll() {
        throw new UnsupportedOperationException("Cannot call updateAll() on a lazy collection.");
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public int refreshCollection() {
        return 0;
    }

    @Override // com.j256.ormlite.dao.BaseForeignCollection, java.util.Collection
    public boolean remove(Object obj) {
        CloseableIterator<T> it = iterator();
        while (it.hasNext()) {
            try {
                if (it.next().equals(obj)) {
                    it.remove();
                    try {
                        return true;
                    } catch (SQLException unused) {
                        return true;
                    }
                }
            } finally {
                try {
                    it.close();
                } catch (SQLException unused2) {
                }
            }
        }
        try {
            it.close();
            return false;
        } catch (SQLException unused3) {
            return false;
        }
    }

    @Override // com.j256.ormlite.dao.BaseForeignCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        CloseableIterator<T> it = iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            try {
                if (collection.contains(it.next())) {
                    it.remove();
                    z8 = true;
                }
            } finally {
                try {
                    it.close();
                } catch (SQLException unused) {
                }
            }
        }
        return z8;
    }

    @Override // java.util.Collection
    public int size() {
        CloseableIterator<T> it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            try {
                it.moveToNext();
                i8++;
            } finally {
                try {
                    it.close();
                } catch (SQLException unused) {
                }
            }
        }
        return i8;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        ArrayList arrayList = new ArrayList();
        CloseableIterator<T> it = iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(it.next());
            } catch (Throwable th) {
                try {
                    it.close();
                } catch (SQLException unused) {
                }
                throw th;
            }
        }
        Object[] array = arrayList.toArray();
        try {
            it.close();
        } catch (SQLException unused2) {
        }
        return array;
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public int updateAll() {
        throw new UnsupportedOperationException("Cannot call updateAll() on a lazy collection.");
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public CloseableIterator<T> closeableIterator(int i8) {
        try {
            return iteratorThrow(i8);
        } catch (SQLException e8) {
            throw new IllegalStateException("Could not build lazy iterator for " + this.dao.getDataClass(), e8);
        }
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public CloseableWrappedIterable<T> getWrappedIterable(final int i8) {
        return new CloseableWrappedIterableImpl(new CloseableIterable<T>() { // from class: com.j256.ormlite.dao.LazyForeignCollection.1
            @Override // com.j256.ormlite.dao.CloseableIterable
            public CloseableIterator<T> closeableIterator() {
                try {
                    return LazyForeignCollection.this.seperateIteratorThrow(i8);
                } catch (Exception e8) {
                    throw new IllegalStateException("Could not build lazy iterator for " + LazyForeignCollection.this.dao.getDataClass(), e8);
                }
            }

            @Override // java.lang.Iterable
            public CloseableIterator<T> iterator() {
                return closeableIterator();
            }
        });
    }

    @Override // java.util.Collection, java.lang.Iterable
    public CloseableIterator<T> iterator() {
        return closeableIterator(-1);
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public CloseableIterator<T> iteratorThrow(int i8) {
        CloseableIterator<T> closeableIteratorSeperateIteratorThrow = seperateIteratorThrow(i8);
        this.lastIterator = closeableIteratorSeperateIteratorThrow;
        return closeableIteratorSeperateIteratorThrow;
    }

    @Override // com.j256.ormlite.dao.ForeignCollection
    public CloseableIterator<T> iterator(int i8) {
        return closeableIterator(i8);
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        CloseableIterator<T> it = iterator();
        ArrayList arrayList = null;
        int i8 = 0;
        while (it.hasNext()) {
            try {
                T next = it.next();
                if (i8 >= eArr.length) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        for (E e8 : eArr) {
                            arrayList.add(e8);
                        }
                    }
                    arrayList.add(next);
                } else {
                    eArr[i8] = next;
                }
                i8++;
            } catch (Throwable th) {
                try {
                    it.close();
                } catch (SQLException unused) {
                }
                throw th;
            }
        }
        try {
            it.close();
        } catch (SQLException unused2) {
        }
        if (arrayList == null) {
            if (i8 < eArr.length - 1) {
                eArr[i8] = 0;
            }
            return eArr;
        }
        return (E[]) arrayList.toArray(eArr);
    }
}
