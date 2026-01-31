package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class I1 {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public I1(int i8, byte[] bArr, int i9, int i10) {
        this.zza = i8;
        this.zzb = bArr;
        this.zzc = i9;
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I1.class == obj.getClass()) {
            I1 i12 = (I1) obj;
            if (this.zza == i12.zza && this.zzc == i12.zzc && this.zzd == i12.zzd && Arrays.equals(this.zzb, i12.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
