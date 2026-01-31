package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class KD0 extends CD0 {

    /* renamed from: b, reason: collision with root package name */
    private static final PD0 f13763b = HD0.zza(Collections.emptyMap());

    /* synthetic */ KD0(Map map, ID0 id0) {
        super(map);
    }

    public static JD0 zzc(int i8) {
        return new JD0(i8, null);
    }

    @Override // com.google.android.gms.internal.ads.CD0, com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzb = DD0.zzb(a().size());
        for (Map.Entry entry : a().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((PD0) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
