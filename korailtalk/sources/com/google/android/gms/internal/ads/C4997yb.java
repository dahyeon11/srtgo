package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4997yb extends AbstractC3400ka {
    public Long zza;
    public Long zzb;

    public C4997yb() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3400ka
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        return map;
    }

    public C4997yb(String str) {
        HashMap mapA = AbstractC3400ka.a(str);
        if (mapA != null) {
            this.zza = (Long) mapA.get(0);
            this.zzb = (Long) mapA.get(1);
        }
    }
}
