package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OF {

    /* renamed from: a, reason: collision with root package name */
    private final C3436ks[] f15078a;
    public static final OF zza = new OF(null, new C3436ks[0], 0, -9223372036854775807L, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final C3436ks f15073b = new C3436ks(0).zzb(0);

    /* renamed from: c, reason: collision with root package name */
    private static final String f15074c = Integer.toString(1, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f15075d = Integer.toString(2, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f15076e = Integer.toString(3, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f15077f = Integer.toString(4, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.a
    };
    public final long zzd = 0;
    public final int zzc = 0;
    public final int zze = 0;

    private OF(Object obj, C3436ks[] c3436ksArr, long j8, long j9, int i8) {
        this.f15078a = c3436ksArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OF.class == obj.getClass()) {
            OF of = (OF) obj;
            if (AbstractC2281am0.zzG(null, null) && Arrays.equals(this.f15078a, of.f15078a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f15078a);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }

    public final C3436ks zza(int i8) {
        return i8 < 0 ? f15073b : this.f15078a[i8];
    }

    public final boolean zzb(int i8) {
        zza(-1);
        RG0 rg0 = C3436ks.zzb;
        return false;
    }
}
