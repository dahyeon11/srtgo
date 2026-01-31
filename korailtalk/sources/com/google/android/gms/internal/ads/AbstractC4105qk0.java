package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.qk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4105qk0 extends AbstractC4446tk0 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private final transient Map f21984d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f21985e;

    protected AbstractC4105qk0(Map map) {
        AbstractC1188Bj0.zze(map.isEmpty());
        this.f21984d = map;
    }

    static /* bridge */ /* synthetic */ void n(AbstractC4105qk0 abstractC4105qk0, Object obj) {
        Object objRemove;
        try {
            objRemove = abstractC4105qk0.f21984d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC4105qk0.f21985e -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4446tk0
    final Collection a() {
        return new C4332sk0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4446tk0
    final Iterator b() {
        return new C2277ak0(this);
    }

    abstract Collection e();

    abstract Collection f(Collection collection);

    abstract Collection g(Object obj, Collection collection);

    final List i(Object obj, List list, AbstractC3763nk0 abstractC3763nk0) {
        return list instanceof RandomAccess ? new C3307jk0(this, obj, list, abstractC3763nk0) : new C3991pk0(this, obj, list, abstractC3763nk0);
    }

    final Map k() {
        Map map = this.f21984d;
        return map instanceof NavigableMap ? new C3080hk0(this, (NavigableMap) map) : map instanceof SortedMap ? new C3421kk0(this, (SortedMap) map) : new C2621dk0(this, map);
    }

    final Set l() {
        Map map = this.f21984d;
        return map instanceof NavigableMap ? new C3194ik0(this, (NavigableMap) map) : map instanceof SortedMap ? new C3535lk0(this, (SortedMap) map) : new C2965gk0(this, map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4446tk0, com.google.android.gms.internal.ads.InterfaceC1151Al0
    public final int zze() {
        return this.f21985e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4446tk0, com.google.android.gms.internal.ads.InterfaceC1151Al0
    public final void zzp() {
        Iterator it = this.f21984d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f21984d.clear();
        this.f21985e = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4446tk0, com.google.android.gms.internal.ads.InterfaceC1151Al0
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.f21984d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f21985e++;
            return true;
        }
        Collection collectionE = e();
        if (!collectionE.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f21985e++;
        this.f21984d.put(obj, collectionE);
        return true;
    }
}
