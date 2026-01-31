package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.ql0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4107ql0 extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final List f21986a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3875oj0 f21987b;

    C4107ql0(List list, InterfaceC3875oj0 interfaceC3875oj0) {
        list.getClass();
        this.f21986a = list;
        this.f21987b = interfaceC3875oj0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f21986a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new C3993pl0(this, this.f21986a.listIterator(i8));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        this.f21986a.subList(i8, i9).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21986a.size();
    }
}
