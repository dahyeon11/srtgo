package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.wD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4733wD0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f23440a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4847xD0 f23441b;

    C4733wD0(C4847xD0 c4847xD0) {
        this.f23441b = c4847xD0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23440a < this.f23441b.f23672a.size() || this.f23441b.f23673b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f23440a >= this.f23441b.f23672a.size()) {
            C4847xD0 c4847xD0 = this.f23441b;
            c4847xD0.f23672a.add(c4847xD0.f23673b.next());
            return next();
        }
        C4847xD0 c4847xD02 = this.f23441b;
        int i8 = this.f23440a;
        this.f23440a = i8 + 1;
        return c4847xD02.f23672a.get(i8);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
