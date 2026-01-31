package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1376Gb extends AbstractC3400ka {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;
    public Long zzf;
    public Long zzg;
    public Long zzh;
    public Long zzi;
    public Long zzj;
    public Long zzk;

    public C1376Gb() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3400ka
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        map.put(3, this.zzd);
        map.put(4, this.zze);
        map.put(5, this.zzf);
        map.put(6, this.zzg);
        map.put(7, this.zzh);
        map.put(8, this.zzi);
        map.put(9, this.zzj);
        map.put(10, this.zzk);
        return map;
    }

    public C1376Gb(String str) {
        HashMap mapA = AbstractC3400ka.a(str);
        if (mapA != null) {
            this.zza = (Long) mapA.get(0);
            this.zzb = (Long) mapA.get(1);
            this.zzc = (Long) mapA.get(2);
            this.zzd = (Long) mapA.get(3);
            this.zze = (Long) mapA.get(4);
            this.zzf = (Long) mapA.get(5);
            this.zzg = (Long) mapA.get(6);
            this.zzh = (Long) mapA.get(7);
            this.zzi = (Long) mapA.get(8);
            this.zzj = (Long) mapA.get(9);
            this.zzk = (Long) mapA.get(10);
        }
    }
}
