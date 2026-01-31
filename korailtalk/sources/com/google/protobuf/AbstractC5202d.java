package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5202d extends AbstractList implements AbstractC5227l0.i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26402a = true;

    AbstractC5202d() {
    }

    protected void a() {
        if (!this.f26402a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> collection) {
        a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!get(i8).equals(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i8 = 0; i8 < size; i8++) {
            iHashCode = (iHashCode * 31) + get(i8).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5227l0.i
    public boolean isModifiable() {
        return this.f26402a;
    }

    @Override // com.google.protobuf.AbstractC5227l0.i
    public void makeImmutable() {
        this.f26402a = false;
    }

    public abstract /* synthetic */ AbstractC5227l0.i mutableCopyWithCapacity(int i8);

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i8) {
        a();
        return super.remove(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        a();
        return super.set(i8, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        a();
        super.add(i8, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<Object> collection) {
        a();
        return super.addAll(i8, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
