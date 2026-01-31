package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.ik0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3194ik0 extends C3535lk0 implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f19968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3194ik0(AbstractC4105qk0 abstractC4105qk0, NavigableMap navigableMap) {
        super(abstractC4105qk0, navigableMap);
        this.f19968d = abstractC4105qk0;
    }

    @Override // com.google.android.gms.internal.ads.C3535lk0
    final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f23306a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23306a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C3194ik0(this.f19968d, ((NavigableMap) ((SortedMap) this.f23306a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23306a)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C3535lk0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23306a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23306a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return AbstractC3537ll0.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return AbstractC3537ll0.a(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.C3535lk0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C3535lk0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z8) {
        return new C3194ik0(this.f19968d, ((NavigableMap) ((SortedMap) this.f23306a)).headMap(obj, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        return new C3194ik0(this.f19968d, ((NavigableMap) ((SortedMap) this.f23306a)).subMap(obj, z8, obj2, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z8) {
        return new C3194ik0(this.f19968d, ((NavigableMap) ((SortedMap) this.f23306a)).tailMap(obj, z8));
    }
}
