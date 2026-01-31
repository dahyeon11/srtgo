package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ME0 {
    public final String zza;
    public final Q5 zzb;
    public final Q5 zzc;
    public final int zzd;
    public final int zze;

    public ME0(String str, Q5 q52, Q5 q53, int i8, int i9) {
        boolean z8 = true;
        if (i8 != 0) {
            if (i9 == 0) {
                i9 = 0;
            } else {
                z8 = false;
            }
        }
        F10.zzd(z8);
        F10.zzc(str);
        this.zza = str;
        this.zzb = q52;
        q53.getClass();
        this.zzc = q53;
        this.zzd = i8;
        this.zze = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ME0.class == obj.getClass()) {
            ME0 me0 = (ME0) obj;
            if (this.zzd == me0.zzd && this.zze == me0.zze && this.zza.equals(me0.zza) && this.zzb.equals(me0.zzb) && this.zzc.equals(me0.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
