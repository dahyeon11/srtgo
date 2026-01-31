package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class h extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f26067a;

    public h(ArrayList<Object> arrayList) {
        Objects.requireNonNull(arrayList);
        this.f26067a = arrayList;
    }

    private Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Element must be non-null");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        this.f26067a.add(i8, a(obj));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f26067a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f26067a.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return this.f26067a.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        return this.f26067a.get(i8);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.f26067a.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.f26067a.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.f26067a.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i8) {
        return this.f26067a.remove(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return this.f26067a.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        return this.f26067a.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        return this.f26067a.set(i8, a(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26067a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.f26067a.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.f26067a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f26067a.toArray(tArr);
    }
}
