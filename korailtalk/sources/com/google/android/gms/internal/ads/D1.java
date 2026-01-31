package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class D1 {
    public static final D1 zza = new D1(0, 0);
    public final long zzb;
    public final long zzc;

    public D1(long j8, long j9) {
        this.zzb = j8;
        this.zzc = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D1.class == obj.getClass()) {
            D1 d12 = (D1) obj;
            if (this.zzb == d12.zzb && this.zzc == d12.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}
