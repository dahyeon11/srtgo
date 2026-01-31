package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class EA0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f12785a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f12786b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ GA0 f12787c;

    EA0(GA0 ga0, int i8) {
        this.f12786b = i8;
        this.f12787c = ga0;
        this.f12785a = ga0.f13116a.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12785a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12785a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f12785a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12785a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f12785a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12785a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
