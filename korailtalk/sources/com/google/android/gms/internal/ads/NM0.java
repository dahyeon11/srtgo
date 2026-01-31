package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class NM0 {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private NM0(Object obj, int i8, int i9, long j8, int i10) {
        this.zza = obj;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = j8;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NM0)) {
            return false;
        }
        NM0 nm0 = (NM0) obj;
        return this.zza.equals(nm0.zza) && this.zzb == nm0.zzb && this.zzc == nm0.zzc && this.zzd == nm0.zzd && this.zze == nm0.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final NM0 zza(Object obj) {
        return this.zza.equals(obj) ? this : new NM0(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public NM0(Object obj, int i8, int i9, long j8) {
        this(obj, i8, i9, j8, -1);
    }

    public NM0(Object obj, long j8) {
        this(obj, -1, -1, j8, -1);
    }

    public NM0(Object obj, long j8, int i8) {
        this(obj, -1, -1, j8, i8);
    }
}
