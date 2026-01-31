package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3306jk {
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;
    public static final C3306jk zza = new C3306jk(new C3077hj());

    /* renamed from: a, reason: collision with root package name */
    private static final String f20297a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f20298b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f20299c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f20300d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f20301e = Integer.toString(4, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.Gi
    };

    private C3306jk(C3077hj c3077hj) {
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3306jk)) {
            return false;
        }
        long j8 = ((C3306jk) obj).zzc;
        return true;
    }

    public final int hashCode() {
        int i8 = (int) (-9223372034707292159L);
        return (((((((i8 * 31) + i8) * 31) + i8) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
