package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class EJ0 {
    public static final EJ0 zza = new BJ0().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ EJ0(BJ0 bj0, CJ0 cj0) {
        this.zzb = bj0.f12262a;
        this.zzc = bj0.f12263b;
        this.zzd = bj0.f12264c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EJ0.class == obj.getClass()) {
            EJ0 ej0 = (EJ0) obj;
            if (this.zzb == ej0.zzb && this.zzc == ej0.zzc && this.zzd == ej0.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z8 = this.zzb;
        boolean z9 = this.zzc;
        return ((z8 ? 1 : 0) << 2) + (z9 ? 1 : 0) + (z9 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
