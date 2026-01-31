package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Dk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1272Dk0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1518Jk0 f12707a;

    C1272Dk0(C1518Jk0 c1518Jk0) {
        this.f12707a = c1518Jk0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12707a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapO = this.f12707a.o();
        if (mapO != null) {
            return mapO.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZ = this.f12707a.z(entry.getKey());
            if (iZ != -1 && AbstractC4672vj0.zza(C1518Jk0.m(this.f12707a, iZ), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1518Jk0 c1518Jk0 = this.f12707a;
        Map mapO = c1518Jk0.o();
        return mapO != null ? mapO.entrySet().iterator() : new C1190Bk0(c1518Jk0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapO = this.f12707a.o();
        if (mapO != null) {
            return mapO.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C1518Jk0 c1518Jk0 = this.f12707a;
        if (c1518Jk0.u()) {
            return false;
        }
        int iY = c1518Jk0.y();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C1518Jk0 c1518Jk02 = this.f12707a;
        int iB = AbstractC1559Kk0.b(key, value, iY, C1518Jk0.l(c1518Jk02), c1518Jk02.a(), c1518Jk02.b(), c1518Jk02.c());
        if (iB == -1) {
            return false;
        }
        this.f12707a.t(iB, iY);
        C1518Jk0 c1518Jk03 = this.f12707a;
        c1518Jk03.f13688f--;
        this.f12707a.r();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12707a.size();
    }
}
