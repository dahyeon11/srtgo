package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ib, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1458Ib extends AbstractC3400ka {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public C1458Ib() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3400ka
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        map.put(3, this.zzd);
        map.put(4, this.zze);
        return map;
    }

    public C1458Ib(String str) {
        HashMap mapA = AbstractC3400ka.a(str);
        if (mapA != null) {
            this.zza = (Long) mapA.get(0);
            this.zzb = (Long) mapA.get(1);
            this.zzc = (Long) mapA.get(2);
            this.zzd = (Long) mapA.get(3);
            this.zze = (Long) mapA.get(4);
        }
    }
}
