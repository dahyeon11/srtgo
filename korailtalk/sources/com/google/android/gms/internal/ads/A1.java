package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class A1 {
    public final D1 zza;
    public final D1 zzb;

    public A1(D1 d12, D1 d13) {
        this.zza = d12;
        this.zzb = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A1.class == obj.getClass()) {
            A1 a12 = (A1) obj;
            if (this.zza.equals(a12.zza) && this.zzb.equals(a12.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        D1 d12 = this.zza;
        D1 d13 = this.zzb;
        return "[" + d12.toString() + (d12.equals(d13) ? "" : ", ".concat(this.zzb.toString())) + "]";
    }
}
