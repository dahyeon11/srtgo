package com.j256.ormlite.dao;

import java.util.Collection;

/* loaded from: classes2.dex */
public interface ForeignCollection<T> extends Collection<T>, CloseableIterable<T> {
    @Override // java.util.Collection
    boolean add(T t8);

    void closeLastIterator();

    CloseableIterator<T> closeableIterator(int i8);

    CloseableWrappedIterable<T> getWrappedIterable();

    CloseableWrappedIterable<T> getWrappedIterable(int i8);

    boolean isEager();

    CloseableIterator<T> iterator(int i8);

    CloseableIterator<T> iteratorThrow();

    CloseableIterator<T> iteratorThrow(int i8);

    int refresh(T t8);

    int refreshAll();

    int refreshCollection();

    int update(T t8);

    int updateAll();
}
