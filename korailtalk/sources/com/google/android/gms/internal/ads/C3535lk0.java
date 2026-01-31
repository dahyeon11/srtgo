package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.lk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3535lk0 extends C2965gk0 implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f20735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3535lk0(AbstractC4105qk0 abstractC4105qk0, SortedMap sortedMap) {
        super(abstractC4105qk0, sortedMap);
        this.f20735c = abstractC4105qk0;
    }

    SortedMap a() {
        return (SortedMap) this.f23306a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C3535lk0(this.f20735c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C3535lk0(this.f20735c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C3535lk0(this.f20735c, a().tailMap(obj));
    }
}
