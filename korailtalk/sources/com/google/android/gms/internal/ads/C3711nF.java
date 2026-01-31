package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3711nF {

    /* renamed from: b, reason: collision with root package name */
    private static final String f21229b = Integer.toString(0, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f21230c = Integer.toString(1, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f21231d = Integer.toString(2, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f21232e = Integer.toString(3, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f21233f = Integer.toString(4, 36);

    @Deprecated
    public static final RG0 zza = new RG0() { // from class: com.google.android.gms.internal.ads.ME
    };

    /* renamed from: a, reason: collision with root package name */
    private OF f21234a = OF.zza;
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3711nF.class.equals(obj.getClass())) {
            C3711nF c3711nF = (C3711nF) obj;
            if (AbstractC2281am0.zzG(this.zzb, c3711nF.zzb) && AbstractC2281am0.zzG(this.zzc, c3711nF.zzc) && this.zzd == c3711nF.zzd && this.zze == c3711nF.zze && this.zzg == c3711nF.zzg && AbstractC2281am0.zzG(this.f21234a, c3711nF.f21234a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzc;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzd;
        long j8 = this.zze;
        return (((((iHashCode2 * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 961) + (this.zzg ? 1 : 0)) * 31) + this.f21234a.hashCode();
    }

    public final int zza(int i8) {
        return this.f21234a.zza(i8).zzd;
    }

    public final int zzb() {
        int i8 = this.f21234a.zzc;
        return 0;
    }

    public final int zzc(long j8) {
        return -1;
    }

    public final int zzd(long j8) {
        this.f21234a.zzb(-1);
        return -1;
    }

    public final int zze(int i8) {
        return this.f21234a.zza(i8).zza(-1);
    }

    public final int zzf(int i8, int i9) {
        return this.f21234a.zza(i8).zza(i9);
    }

    public final int zzg() {
        int i8 = this.f21234a.zze;
        return 0;
    }

    public final long zzh(int i8, int i9) {
        C3436ks c3436ksZza = this.f21234a.zza(i8);
        if (c3436ksZza.zzd != -1) {
            return c3436ksZza.zzh[i9];
        }
        return -9223372036854775807L;
    }

    public final long zzi(int i8) {
        long j8 = this.f21234a.zza(i8).zzc;
        return 0L;
    }

    public final long zzj() {
        long j8 = this.f21234a.zzd;
        return 0L;
    }

    public final long zzk(int i8) {
        long j8 = this.f21234a.zza(i8).zzi;
        return 0L;
    }

    public final C3711nF zzl(Object obj, Object obj2, int i8, long j8, long j9, OF of, boolean z8) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = i8;
        this.zze = j8;
        this.zzf = 0L;
        this.f21234a = of;
        this.zzg = z8;
        return this;
    }

    public final boolean zzm(int i8) {
        zzb();
        if (i8 != -1) {
            return false;
        }
        this.f21234a.zzb(-1);
        return false;
    }

    public final boolean zzn(int i8) {
        boolean z8 = this.f21234a.zza(i8).zzj;
        return false;
    }
}
