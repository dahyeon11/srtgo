package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.jb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3288jb extends AbstractC3400ka {
    public long zza;
    public long zzb;

    public C3288jb() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3400ka
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public C3288jb(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapA = AbstractC3400ka.a(str);
        if (mapA != null) {
            this.zza = ((Long) mapA.get(0)).longValue();
            this.zzb = ((Long) mapA.get(1)).longValue();
        }
    }
}
