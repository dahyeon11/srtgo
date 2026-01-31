package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qM0 */
/* loaded from: classes2.dex */
public final class C4068qM0 implements LM0, KM0 {

    /* renamed from: a */
    private KM0 f21919a;

    /* renamed from: b */
    private C3954pM0[] f21920b = new C3954pM0[0];

    /* renamed from: c */
    private long f21921c = 0;

    /* renamed from: d */
    long f21922d;
    public final LM0 zza;

    public C4068qM0(LM0 lm0, boolean z8, long j8, long j9) {
        this.zza = lm0;
        this.f21922d = j9;
    }

    final boolean a() {
        return this.f21921c != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zza(long j8, IG0 ig0) {
        if (j8 == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(ig0.zzf, j8));
        long j9 = ig0.zzg;
        long j10 = this.f21922d;
        long jMax2 = Math.max(0L, Math.min(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j8));
        if (jMax != ig0.zzf || jMax2 != ig0.zzg) {
            ig0 = new IG0(jMax, jMax2);
        }
        return this.zza.zza(j8, ig0);
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j8 = this.f21922d;
            if (j8 == Long.MIN_VALUE || jZzb < j8) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j8 = this.f21922d;
            if (j8 == Long.MIN_VALUE || jZzc < j8) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzd() {
        if (a()) {
            long j8 = this.f21921c;
            this.f21921c = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j8;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        F10.zzf(jZzd2 >= 0);
        long j9 = this.f21922d;
        F10.zzf(j9 == Long.MIN_VALUE || jZzd2 <= j9);
        return jZzd2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    @Override // com.google.android.gms.internal.ads.LM0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f21921c = r0
            com.google.android.gms.internal.ads.pM0[] r0 = r7.f21920b
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zzc()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.LM0 r0 = r7.zza
            long r0 = r0.zze(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.f21922d
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.F10.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4068qM0.zze(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x005c  */
    @Override // com.google.android.gms.internal.ads.LM0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.PO0[] r15, boolean[] r16, com.google.android.gms.internal.ads.GN0[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.pM0[] r3 = new com.google.android.gms.internal.ads.C3954pM0[r2]
            r0.f21920b = r3
            com.google.android.gms.internal.ads.GN0[] r2 = new com.google.android.gms.internal.ads.GN0[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.pM0[] r5 = r0.f21920b
            r6 = r1[r4]
            com.google.android.gms.internal.ads.pM0 r6 = (com.google.android.gms.internal.ads.C3954pM0) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.GN0 r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.LM0 r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzf(r5, r6, r7, r8, r9)
            boolean r6 = r14.a()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f21921c = r12
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r9 = 1
            if (r6 == 0) goto L5d
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L5c
            long r6 = r0.f21922d
            r12 = -9223372036854775808
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L5c
            goto L5d
        L5c:
            r9 = r3
        L5d:
            com.google.android.gms.internal.ads.F10.zzf(r9)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.pM0[] r6 = r0.f21920b
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.pM0[] r7 = r0.f21920b
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.GN0 r8 = r8.zza
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.pM0 r8 = new com.google.android.gms.internal.ads.pM0
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.pM0[] r6 = r0.f21920b
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4068qM0.zzf(com.google.android.gms.internal.ads.PO0[], boolean[], com.google.android.gms.internal.ads.GN0[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.KM0, com.google.android.gms.internal.ads.HN0
    public final /* bridge */ /* synthetic */ void zzg(IN0 in0) {
        KM0 km0 = this.f21919a;
        km0.getClass();
        km0.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final SN0 zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void zzi(LM0 lm0) {
        KM0 km0 = this.f21919a;
        km0.getClass();
        km0.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzj(long j8, boolean z8) {
        this.zza.zzj(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzk() {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzl(KM0 km0, long j8) {
        this.f21919a = km0;
        this.zza.zzl(this, j8);
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final void zzm(long j8) {
        this.zza.zzm(j8);
    }

    public final void zzn(long j8, long j9) {
        this.f21922d = j9;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzo(C2685eG0 c2685eG0) {
        return this.zza.zzo(c2685eG0);
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
