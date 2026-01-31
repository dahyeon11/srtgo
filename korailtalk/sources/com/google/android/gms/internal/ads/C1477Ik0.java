package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ik0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1477Ik0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1518Jk0 f13492a;

    C1477Ik0(C1518Jk0 c1518Jk0) {
        this.f13492a = c1518Jk0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f13492a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1518Jk0 c1518Jk0 = this.f13492a;
        Map mapO = c1518Jk0.o();
        return mapO != null ? mapO.values().iterator() : new C1231Ck0(c1518Jk0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f13492a.size();
    }
}
