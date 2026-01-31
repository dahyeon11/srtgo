package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class WN0 {
    public final long zza;
    public final long zzb;

    public WN0(long j8, long j9) {
        this.zza = j8;
        this.zzb = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WN0)) {
            return false;
        }
        WN0 wn0 = (WN0) obj;
        return this.zza == wn0.zza && this.zzb == wn0.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
