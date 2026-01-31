package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3956pN0 {
    public final int zza;
    public final boolean zzb;

    public C3956pN0(int i8, boolean z8) {
        this.zza = i8;
        this.zzb = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3956pN0.class == obj.getClass()) {
            C3956pN0 c3956pN0 = (C3956pN0) obj;
            if (this.zza == c3956pN0.zza && this.zzb == c3956pN0.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
