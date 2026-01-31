package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3954pM0 implements GN0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f21750a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4068qM0 f21751b;
    public final GN0 zza;

    public C3954pM0(C4068qM0 c4068qM0, GN0 gn0) {
        this.f21751b = c4068qM0;
        this.zza = gn0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.GN0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.ZF0 r13, com.google.android.gms.internal.ads.BE0 r14, int r15) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.qM0 r0 = r12.f21751b
            boolean r1 = r0.a()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r12.f21750a
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r14.zzc(r3)
            return r4
        L14:
            long r0 = r0.zzb()
            com.google.android.gms.internal.ads.GN0 r5 = r12.zza
            int r15 = r5.zza(r13, r14, r15)
            r5 = -5
            r6 = -9223372036854775808
            if (r15 != r5) goto L4e
            com.google.android.gms.internal.ads.Q5 r14 = r13.zza
            r14.getClass()
            int r15 = r14.zzD
            r0 = 0
            if (r15 != 0) goto L32
            int r15 = r14.zzE
            if (r15 == 0) goto L4d
            r15 = r0
        L32:
            com.google.android.gms.internal.ads.qM0 r1 = r12.f21751b
            long r1 = r1.f21922d
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            int r0 = r14.zzE
        L3d:
            com.google.android.gms.internal.ads.O4 r14 = r14.zzb()
            r14.zzF(r15)
            r14.zzG(r0)
            com.google.android.gms.internal.ads.Q5 r14 = r14.zzad()
            r13.zza = r14
        L4d:
            return r5
        L4e:
            com.google.android.gms.internal.ads.qM0 r13 = r12.f21751b
            long r8 = r13.f21922d
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L72
            if (r15 != r4) goto L5e
            long r10 = r14.zze
            int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r13 >= 0) goto L68
        L5e:
            if (r15 != r2) goto L72
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 != 0) goto L72
            boolean r13 = r14.zzd
            if (r13 != 0) goto L72
        L68:
            r14.zzb()
            r14.zzc(r3)
            r13 = 1
            r12.f21750a = r13
            return r4
        L72:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3954pM0.zza(com.google.android.gms.internal.ads.ZF0, com.google.android.gms.internal.ads.BE0, int):int");
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final int zzb(long j8) {
        if (this.f21751b.a()) {
            return -3;
        }
        return this.zza.zzb(j8);
    }

    public final void zzc() {
        this.f21750a = false;
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.GN0
    public final boolean zze() {
        return !this.f21751b.a() && this.zza.zze();
    }
}
