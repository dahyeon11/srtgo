package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class FM0 implements LM0, KM0 {

    /* renamed from: a */
    private final long f12976a;

    /* renamed from: b */
    private PM0 f12977b;

    /* renamed from: c */
    private LM0 f12978c;

    /* renamed from: d */
    private KM0 f12979d;

    /* renamed from: e */
    private long f12980e = -9223372036854775807L;

    /* renamed from: f */
    private final C2703eP0 f12981f;
    public final NM0 zza;

    public FM0(NM0 nm0, C2703eP0 c2703eP0, long j8) {
        this.zza = nm0;
        this.f12981f = c2703eP0;
        this.f12976a = j8;
    }

    private final long a(long j8) {
        long j9 = this.f12980e;
        return j9 != -9223372036854775807L ? j9 : j8;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zza(long j8, IG0 ig0) {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        return lm0.zza(j8, ig0);
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzb() {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        return lm0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzc() {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        return lm0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzd() {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        return lm0.zzd();
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zze(long j8) {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        return lm0.zze(j8);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzf(PO0[] po0Arr, boolean[] zArr, GN0[] gn0Arr, boolean[] zArr2, long j8) {
        long j9 = this.f12980e;
        long j10 = (j9 == -9223372036854775807L || j8 != this.f12976a) ? j8 : j9;
        this.f12980e = -9223372036854775807L;
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        return lm0.zzf(po0Arr, zArr, gn0Arr, zArr2, j10);
    }

    @Override // com.google.android.gms.internal.ads.KM0, com.google.android.gms.internal.ads.HN0
    public final /* bridge */ /* synthetic */ void zzg(IN0 in0) {
        KM0 km0 = this.f12979d;
        int i8 = AbstractC2281am0.zza;
        km0.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final SN0 zzh() {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        return lm0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void zzi(LM0 lm0) {
        KM0 km0 = this.f12979d;
        int i8 = AbstractC2281am0.zza;
        km0.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzj(long j8, boolean z8) {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        lm0.zzj(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzk() {
        LM0 lm0 = this.f12978c;
        if (lm0 != null) {
            lm0.zzk();
            return;
        }
        PM0 pm0 = this.f12977b;
        if (pm0 != null) {
            pm0.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzl(KM0 km0, long j8) {
        this.f12979d = km0;
        LM0 lm0 = this.f12978c;
        if (lm0 != null) {
            lm0.zzl(this, a(this.f12976a));
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final void zzm(long j8) {
        LM0 lm0 = this.f12978c;
        int i8 = AbstractC2281am0.zza;
        lm0.zzm(j8);
    }

    public final long zzn() {
        return this.f12980e;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzo(C2685eG0 c2685eG0) {
        LM0 lm0 = this.f12978c;
        return lm0 != null && lm0.zzo(c2685eG0);
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzp() {
        LM0 lm0 = this.f12978c;
        return lm0 != null && lm0.zzp();
    }

    public final long zzq() {
        return this.f12976a;
    }

    public final void zzr(NM0 nm0) {
        long jA = a(this.f12976a);
        PM0 pm0 = this.f12977b;
        pm0.getClass();
        LM0 lm0ZzI = pm0.zzI(nm0, this.f12981f, jA);
        this.f12978c = lm0ZzI;
        if (this.f12979d != null) {
            lm0ZzI.zzl(this, jA);
        }
    }

    public final void zzs(long j8) {
        this.f12980e = j8;
    }

    public final void zzt() {
        LM0 lm0 = this.f12978c;
        if (lm0 != null) {
            PM0 pm0 = this.f12977b;
            pm0.getClass();
            pm0.zzG(lm0);
        }
    }

    public final void zzu(PM0 pm0) {
        F10.zzf(this.f12977b == null);
        this.f12977b = pm0;
    }
}
