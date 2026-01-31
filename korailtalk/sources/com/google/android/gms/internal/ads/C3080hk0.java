package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.hk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3080hk0 extends C3421kk0 implements NavigableMap {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f19838h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3080hk0(AbstractC4105qk0 abstractC4105qk0, NavigableMap navigableMap) {
        super(abstractC4105qk0, navigableMap);
        this.f19838h = abstractC4105qk0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f18669d)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return c(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18669d)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C3421kk0
    final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.f18669d);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C3080hk0(this.f19838h, ((NavigableMap) ((SortedMap) this.f18669d)).descendingMap());
    }

    final Map.Entry f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionE = this.f19838h.e();
        collectionE.addAll((Collection) entry.getValue());
        it.remove();
        return new C2050Wk0(entry.getKey(), this.f19838h.f(collectionE));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f18669d)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return c(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f18669d)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return c(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18669d)).floorKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.C3421kk0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableSet b() {
        return new C3194ik0(this.f19838h, (NavigableMap) ((SortedMap) this.f18669d));
    }

    @Override // com.google.android.gms.internal.ads.C3421kk0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f18669d)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return c(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18669d)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C3421kk0, com.google.android.gms.internal.ads.C2621dk0, com.google.android.gms.internal.ads.AbstractC4904xl0, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f18669d)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return c(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f18669d)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return c(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18669d)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return f(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.C3421kk0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C3421kk0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.android.gms.internal.ads.C3421kk0
    /* renamed from: zzh */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z8) {
        return new C3080hk0(this.f19838h, ((NavigableMap) ((SortedMap) this.f18669d)).headMap(obj, z8));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z8, Object obj2, boolean z9) {
        return new C3080hk0(this.f19838h, ((NavigableMap) ((SortedMap) this.f18669d)).subMap(obj, z8, obj2, z9));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z8) {
        return new C3080hk0(this.f19838h, ((NavigableMap) ((SortedMap) this.f18669d)).tailMap(obj, z8));
    }
}
