package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class VD0 implements GD0 {

    /* renamed from: c, reason: collision with root package name */
    private static final GD0 f16811c = HD0.zza(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List f16812a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16813b;

    /* synthetic */ VD0(List list, List list2, TD0 td0) {
        this.f16812a = list;
        this.f16813b = list2;
    }

    public static UD0 zza(int i8, int i9) {
        return new UD0(i8, i9, null);
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.f16812a.size();
        ArrayList arrayList = new ArrayList(this.f16813b.size());
        int size2 = this.f16813b.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Collection collection = (Collection) ((PD0) this.f16813b.get(i8)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetA = DD0.a(size);
        int size3 = this.f16812a.size();
        for (int i9 = 0; i9 < size3; i9++) {
            Object objZzb = ((PD0) this.f16812a.get(i9)).zzb();
            objZzb.getClass();
            hashSetA.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i10 = 0; i10 < size4; i10++) {
            for (Object obj : (Collection) arrayList.get(i10)) {
                obj.getClass();
                hashSetA.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetA);
    }
}
