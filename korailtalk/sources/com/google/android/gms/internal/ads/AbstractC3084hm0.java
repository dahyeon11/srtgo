package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.hm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3084hm0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f19843a;

    AbstractC3084hm0(Iterator it) {
        it.getClass();
        this.f19843a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19843a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f19843a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19843a.remove();
    }
}
