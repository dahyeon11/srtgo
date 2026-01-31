package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class IQ {
    public final int zzc;
    public final int zzd;
    public final int zze = 0;
    public final float zzf;
    public static final IQ zza = new IQ(0, 0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    private static final String f13460a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f13461b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f13462c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f13463d = Integer.toString(3, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.hQ
    };

    public IQ(int i8, int i9, int i10, float f8) {
        this.zzc = i8;
        this.zzd = i9;
        this.zzf = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IQ) {
            IQ iq = (IQ) obj;
            if (this.zzc == iq.zzc && this.zzd == iq.zzd && this.zzf == iq.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzc + 217) * 31) + this.zzd) * 961) + Float.floatToRawIntBits(this.zzf);
    }
}
