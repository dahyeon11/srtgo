package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class KR {
    public static final KR zza = new KR(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public KR(int i8, int i9, int i10) {
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = AbstractC2281am0.zzK(i10) ? AbstractC2281am0.zzm(i10, i9) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KR)) {
            return false;
        }
        KR kr2 = (KR) obj;
        return this.zzb == kr2.zzb && this.zzc == kr2.zzc && this.zzd == kr2.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + "]";
    }
}
