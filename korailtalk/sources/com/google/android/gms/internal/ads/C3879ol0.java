package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.ol0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3879ol0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    final List f21558a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3875oj0 f21559b;

    C3879ol0(List list, InterfaceC3875oj0 interfaceC3875oj0) {
        list.getClass();
        this.f21558a = list;
        this.f21559b = interfaceC3875oj0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        return this.f21559b.apply(this.f21558a.get(i8));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f21558a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new C3765nl0(this, this.f21558a.listIterator(i8));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        return this.f21559b.apply(this.f21558a.remove(i8));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        this.f21558a.subList(i8, i9).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21558a.size();
    }
}
