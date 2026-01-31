package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.Yx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2149Yx {

    /* renamed from: a, reason: collision with root package name */
    private final int f17464a;
    public final float zzc;
    public final float zzd;
    public static final C2149Yx zza = new C2149Yx(1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    private static final String f17462b = Integer.toString(0, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f17463c = Integer.toString(1, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.xx
    };

    public C2149Yx(float f8, float f9) {
        F10.zzd(f8 > 0.0f);
        F10.zzd(f9 > 0.0f);
        this.zzc = f8;
        this.zzd = f9;
        this.f17464a = Math.round(f8 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2149Yx.class == obj.getClass()) {
            C2149Yx c2149Yx = (C2149Yx) obj;
            if (this.zzc == c2149Yx.zzc && this.zzd == c2149Yx.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + 527) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j8) {
        return j8 * this.f17464a;
    }
}
