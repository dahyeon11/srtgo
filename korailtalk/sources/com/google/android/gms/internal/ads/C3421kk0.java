package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.kk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3421kk0 extends C2621dk0 implements SortedMap {

    /* renamed from: f, reason: collision with root package name */
    SortedSet f20460f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f20461g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3421kk0(AbstractC4105qk0 abstractC4105qk0, SortedMap sortedMap) {
        super(abstractC4105qk0, sortedMap);
        this.f20461g = abstractC4105qk0;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    SortedMap d() {
        return (SortedMap) this.f18669d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC4904xl0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet b() {
        return new C3535lk0(this.f20461g, d());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C3421kk0(this.f20461g, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C3421kk0(this.f20461g, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C3421kk0(this.f20461g, d().tailMap(obj));
    }

    @Override // com.google.android.gms.internal.ads.C2621dk0, com.google.android.gms.internal.ads.AbstractC4904xl0, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f20460f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f20460f = sortedSetB;
        return sortedSetB;
    }
}
