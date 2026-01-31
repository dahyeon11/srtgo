package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2965gk0 extends C4676vl0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f19392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2965gk0(AbstractC4105qk0 abstractC4105qk0, Map map) {
        super(map);
        this.f19392b = abstractC4105qk0;
    }

    @Override // com.google.android.gms.internal.ads.C4676vl0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC3537ll0.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f23306a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f23306a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23306a.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.C4676vl0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2850fk0(this, this.f23306a.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.C4676vl0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f23306a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f19392b.f21985e -= size;
        return size > 0;
    }
}
