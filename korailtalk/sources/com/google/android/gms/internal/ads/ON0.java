package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ON0 implements LM0, KM0 {

    /* renamed from: a, reason: collision with root package name */
    private final LM0 f15108a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15109b;

    /* renamed from: c, reason: collision with root package name */
    private KM0 f15110c;

    public ON0(LM0 lm0, long j8) {
        this.f15108a = lm0;
        this.f15109b = j8;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zza(long j8, IG0 ig0) {
        long j9 = this.f15109b;
        return this.f15108a.zza(j8 - j9, ig0) + j9;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzb() {
        long jZzb = this.f15108a.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f15109b;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzc() {
        long jZzc = this.f15108a.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f15109b;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzd() {
        long jZzd = this.f15108a.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.f15109b;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zze(long j8) {
        long j9 = this.f15109b;
        return this.f15108a.zze(j8 - j9) + j9;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzf(PO0[] po0Arr, boolean[] zArr, GN0[] gn0Arr, boolean[] zArr2, long j8) {
        GN0[] gn0Arr2 = new GN0[gn0Arr.length];
        int i8 = 0;
        while (true) {
            GN0 gn0Zzc = null;
            if (i8 >= gn0Arr.length) {
                break;
            }
            NN0 nn0 = (NN0) gn0Arr[i8];
            if (nn0 != null) {
                gn0Zzc = nn0.zzc();
            }
            gn0Arr2[i8] = gn0Zzc;
            i8++;
        }
        long jZzf = this.f15108a.zzf(po0Arr, zArr, gn0Arr2, zArr2, j8 - this.f15109b);
        for (int i9 = 0; i9 < gn0Arr.length; i9++) {
            GN0 gn0 = gn0Arr2[i9];
            if (gn0 == null) {
                gn0Arr[i9] = null;
            } else {
                GN0 gn02 = gn0Arr[i9];
                if (gn02 == null || ((NN0) gn02).zzc() != gn0) {
                    gn0Arr[i9] = new NN0(gn0, this.f15109b);
                }
            }
        }
        return jZzf + this.f15109b;
    }

    @Override // com.google.android.gms.internal.ads.KM0, com.google.android.gms.internal.ads.HN0
    public final /* bridge */ /* synthetic */ void zzg(IN0 in0) {
        KM0 km0 = this.f15110c;
        km0.getClass();
        km0.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final SN0 zzh() {
        return this.f15108a.zzh();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void zzi(LM0 lm0) {
        KM0 km0 = this.f15110c;
        km0.getClass();
        km0.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzj(long j8, boolean z8) {
        this.f15108a.zzj(j8 - this.f15109b, false);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzk() {
        this.f15108a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzl(KM0 km0, long j8) {
        this.f15110c = km0;
        this.f15108a.zzl(this, j8 - this.f15109b);
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final void zzm(long j8) {
        this.f15108a.zzm(j8 - this.f15109b);
    }

    public final LM0 zzn() {
        return this.f15108a;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzo(C2685eG0 c2685eG0) {
        long j8 = c2685eG0.zza;
        long j9 = this.f15109b;
        C2456cG0 c2456cG0Zza = c2685eG0.zza();
        c2456cG0Zza.zze(j8 - j9);
        return this.f15108a.zzo(c2456cG0Zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzp() {
        return this.f15108a.zzp();
    }
}
