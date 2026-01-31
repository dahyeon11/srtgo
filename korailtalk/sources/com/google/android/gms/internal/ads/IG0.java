package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class IG0 {
    public static final IG0 zza;
    public static final IG0 zzb;
    public static final IG0 zzc;
    public static final IG0 zzd;
    public static final IG0 zze;
    public final long zzf;
    public final long zzg;

    static {
        IG0 ig0 = new IG0(0L, 0L);
        zza = ig0;
        zzb = new IG0(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new IG0(Long.MAX_VALUE, 0L);
        zzd = new IG0(0L, Long.MAX_VALUE);
        zze = ig0;
    }

    public IG0(long j8, long j9) {
        F10.zzd(j8 >= 0);
        F10.zzd(j9 >= 0);
        this.zzf = j8;
        this.zzg = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IG0.class == obj.getClass()) {
            IG0 ig0 = (IG0) obj;
            if (this.zzf == ig0.zzf && this.zzg == ig0.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
