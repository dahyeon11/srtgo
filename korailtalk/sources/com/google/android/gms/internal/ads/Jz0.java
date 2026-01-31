package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Jz0 {
    Jz0() {
    }

    public static final boolean zza(Object obj) {
        return !((Iz0) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        Iz0 iz0Zzb = (Iz0) obj;
        Iz0 iz0 = (Iz0) obj2;
        if (!iz0.isEmpty()) {
            if (!iz0Zzb.zze()) {
                iz0Zzb = iz0Zzb.zzb();
            }
            iz0Zzb.zzd(iz0);
        }
        return iz0Zzb;
    }
}
