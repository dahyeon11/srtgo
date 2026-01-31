package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class FA0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f12952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GA0 f12953b;

    FA0(GA0 ga0) {
        this.f12953b = ga0;
        this.f12952a = ga0.f13116a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12952a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f12952a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
