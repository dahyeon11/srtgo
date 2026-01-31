package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.eb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2716eb extends AbstractC3400ka {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public C2716eb() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3400ka
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public C2716eb(String str) {
        HashMap mapA = AbstractC3400ka.a(str);
        if (mapA != null) {
            this.zza = (Long) mapA.get(0);
            this.zzb = (Long) mapA.get(1);
            this.zzc = (Long) mapA.get(2);
        }
    }
}
