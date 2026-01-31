package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1395Gk0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1518Jk0 f13195a;

    C1395Gk0(C1518Jk0 c1518Jk0) {
        this.f13195a = c1518Jk0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13195a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13195a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1518Jk0 c1518Jk0 = this.f13195a;
        Map mapO = c1518Jk0.o();
        return mapO != null ? mapO.keySet().iterator() : new C1149Ak0(c1518Jk0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapO = this.f13195a.o();
        return mapO != null ? mapO.keySet().remove(obj) : this.f13195a.B(obj) != C1518Jk0.f13682j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13195a.size();
    }
}
