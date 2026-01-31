package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.dk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2621dk0 extends AbstractC4904xl0 {

    /* renamed from: d, reason: collision with root package name */
    final transient Map f18669d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f18670e;

    C2621dk0(AbstractC4105qk0 abstractC4105qk0, Map map) {
        this.f18670e = abstractC4105qk0;
        this.f18669d = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4904xl0
    protected final Set a() {
        return new C2392bk0(this);
    }

    final Map.Entry c(Map.Entry entry) {
        Object key = entry.getKey();
        return new C2050Wk0(key, this.f18670e.g(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC4105qk0 abstractC4105qk0 = this.f18670e;
        if (this.f18669d == abstractC4105qk0.f21984d) {
            abstractC4105qk0.zzp();
        } else {
            AbstractC3537ll0.b(new C2506ck0(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f18669d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f18669d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) AbstractC5018yl0.a(this.f18669d, obj);
        if (collection == null) {
            return null;
        }
        return this.f18670e.g(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f18669d.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4904xl0, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f18670e.zzt();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f18669d.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionE = this.f18670e.e();
        collectionE.addAll(collection);
        this.f18670e.f21985e -= collection.size();
        collection.clear();
        return collectionE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18669d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f18669d.toString();
    }
}
