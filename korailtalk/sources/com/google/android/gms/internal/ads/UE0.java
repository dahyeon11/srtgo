package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class UE0 implements InterfaceC2800fG0 {

    /* renamed from: a, reason: collision with root package name */
    private final LG0 f16621a;

    /* renamed from: b, reason: collision with root package name */
    private final TE0 f16622b;

    /* renamed from: c, reason: collision with root package name */
    private EG0 f16623c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2800fG0 f16624d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16625e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16626f;

    public UE0(TE0 te0, InterfaceC3002h20 interfaceC3002h20) {
        this.f16622b = te0;
        this.f16621a = new LG0(interfaceC3002h20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final long zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.EG0 r0 = r4.f16623c
            if (r0 == 0) goto L71
            boolean r0 = r0.zzW()
            if (r0 != 0) goto L71
            if (r5 == 0) goto L15
            com.google.android.gms.internal.ads.EG0 r0 = r4.f16623c
            int r0 = r0.zzcU()
            r1 = 2
            if (r0 != r1) goto L71
        L15:
            com.google.android.gms.internal.ads.EG0 r0 = r4.f16623c
            boolean r0 = r0.zzX()
            if (r0 != 0) goto L28
            if (r5 != 0) goto L71
            com.google.android.gms.internal.ads.EG0 r5 = r4.f16623c
            boolean r5 = r5.zzQ()
            if (r5 == 0) goto L28
            goto L71
        L28:
            com.google.android.gms.internal.ads.fG0 r5 = r4.f16624d
            r5.getClass()
            long r0 = r5.zza()
            boolean r2 = r4.f16625e
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.LG0 r2 = r4.f16621a
            long r2 = r2.zza()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L45
            com.google.android.gms.internal.ads.LG0 r5 = r4.f16621a
            r5.zze()
            goto L7d
        L45:
            r2 = 0
            r4.f16625e = r2
            boolean r2 = r4.f16626f
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.LG0 r2 = r4.f16621a
            r2.zzd()
        L51:
            com.google.android.gms.internal.ads.LG0 r2 = r4.f16621a
            r2.zzb(r0)
            com.google.android.gms.internal.ads.Yx r5 = r5.zzc()
            com.google.android.gms.internal.ads.LG0 r0 = r4.f16621a
            com.google.android.gms.internal.ads.Yx r0 = r0.zzc()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L7d
            com.google.android.gms.internal.ads.LG0 r0 = r4.f16621a
            r0.zzg(r5)
            com.google.android.gms.internal.ads.TE0 r0 = r4.f16622b
            r0.zza(r5)
            goto L7d
        L71:
            r5 = 1
            r4.f16625e = r5
            boolean r5 = r4.f16626f
            if (r5 == 0) goto L7d
            com.google.android.gms.internal.ads.LG0 r5 = r4.f16621a
            r5.zzd()
        L7d:
            boolean r5 = r4.f16625e
            if (r5 == 0) goto L88
            com.google.android.gms.internal.ads.LG0 r5 = r4.f16621a
            long r0 = r5.zza()
            goto L91
        L88:
            com.google.android.gms.internal.ads.fG0 r5 = r4.f16624d
            r5.getClass()
            long r0 = r5.zza()
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.UE0.zzb(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final C2149Yx zzc() {
        InterfaceC2800fG0 interfaceC2800fG0 = this.f16624d;
        return interfaceC2800fG0 != null ? interfaceC2800fG0.zzc() : this.f16621a.zzc();
    }

    public final void zzd(EG0 eg0) {
        if (eg0 == this.f16623c) {
            this.f16624d = null;
            this.f16623c = null;
            this.f16625e = true;
        }
    }

    public final void zze(EG0 eg0) throws WE0 {
        InterfaceC2800fG0 interfaceC2800fG0;
        InterfaceC2800fG0 interfaceC2800fG0Zzk = eg0.zzk();
        if (interfaceC2800fG0Zzk == null || interfaceC2800fG0Zzk == (interfaceC2800fG0 = this.f16624d)) {
            return;
        }
        if (interfaceC2800fG0 != null) {
            throw WE0.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f16624d = interfaceC2800fG0Zzk;
        this.f16623c = eg0;
        interfaceC2800fG0Zzk.zzg(this.f16621a.zzc());
    }

    public final void zzf(long j8) {
        this.f16621a.zzb(j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final void zzg(C2149Yx c2149Yx) {
        InterfaceC2800fG0 interfaceC2800fG0 = this.f16624d;
        if (interfaceC2800fG0 != null) {
            interfaceC2800fG0.zzg(c2149Yx);
            c2149Yx = this.f16624d.zzc();
        }
        this.f16621a.zzg(c2149Yx);
    }

    public final void zzh() {
        this.f16626f = true;
        this.f16621a.zzd();
    }

    public final void zzi() {
        this.f16626f = false;
        this.f16621a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final boolean zzj() {
        if (this.f16625e) {
            return false;
        }
        InterfaceC2800fG0 interfaceC2800fG0 = this.f16624d;
        interfaceC2800fG0.getClass();
        return interfaceC2800fG0.zzj();
    }
}
