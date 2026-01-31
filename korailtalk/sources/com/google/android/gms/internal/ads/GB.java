package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class GB {

    /* renamed from: a, reason: collision with root package name */
    static final String f13117a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f13118b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    static final String f13119c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    static final String f13120d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    static final String f13121e = Integer.toString(4, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f13122f = Integer.toString(5, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f13123g = Integer.toString(6, 36);

    @Deprecated
    public static final RG0 zze = new RG0() { // from class: com.google.android.gms.internal.ads.fB
    };
    public final Object zzf;
    public final int zzg;
    public final C3658mp zzh;
    public final Object zzi;
    public final int zzj;
    public final long zzk;
    public final long zzl;
    public final int zzm;
    public final int zzn;

    public GB(Object obj, int i8, C3658mp c3658mp, Object obj2, int i9, long j8, long j9, int i10, int i11) {
        this.zzf = obj;
        this.zzg = i8;
        this.zzh = c3658mp;
        this.zzi = obj2;
        this.zzj = i9;
        this.zzk = j8;
        this.zzl = j9;
        this.zzm = i10;
        this.zzn = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GB.class == obj.getClass()) {
            GB gb = (GB) obj;
            if (this.zzg == gb.zzg && this.zzj == gb.zzj && this.zzk == gb.zzk && this.zzl == gb.zzl && this.zzm == gb.zzm && this.zzn == gb.zzn && AbstractC4672vj0.zza(this.zzh, gb.zzh) && AbstractC4672vj0.zza(this.zzf, gb.zzf) && AbstractC4672vj0.zza(this.zzi, gb.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzf, Integer.valueOf(this.zzg), this.zzh, this.zzi, Integer.valueOf(this.zzj), Long.valueOf(this.zzk), Long.valueOf(this.zzl), Integer.valueOf(this.zzm), Integer.valueOf(this.zzn)});
    }
}
