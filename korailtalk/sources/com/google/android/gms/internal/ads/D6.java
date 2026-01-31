package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class D6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final W6 f12624a;

    /* renamed from: e, reason: collision with root package name */
    private long f12628e;

    /* renamed from: g, reason: collision with root package name */
    private String f12630g;

    /* renamed from: h, reason: collision with root package name */
    private K1 f12631h;

    /* renamed from: i, reason: collision with root package name */
    private C6 f12632i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12633j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12635l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f12629f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    private final J6 f12625b = new J6(7, 128);

    /* renamed from: c, reason: collision with root package name */
    private final J6 f12626c = new J6(8, 128);

    /* renamed from: d, reason: collision with root package name */
    private final J6 f12627d = new J6(6, 128);

    /* renamed from: k, reason: collision with root package name */
    private long f12634k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private final C4099qh0 f12636m = new C4099qh0();

    public D6(W6 w62, boolean z8, boolean z9) {
        this.f12624a = w62;
    }

    private final void a(byte[] bArr, int i8, int i9) {
        if (!this.f12633j) {
            this.f12625b.zza(bArr, i8, i9);
            this.f12626c.zza(bArr, i8, i9);
        }
        this.f12627d.zza(bArr, i8, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.C4099qh0 r19) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.D6.zza(com.google.android.gms.internal.ads.qh0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f12630g = c3011h7.zzb();
        K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 2);
        this.f12631h = k1Zzw;
        this.f12632i = new C6(k1Zzw, false, false);
        this.f12624a.zzb(interfaceC2769f1, c3011h7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f12634k = j8;
        int i9 = i8 & 2;
        this.f12635l = (i9 != 0) | this.f12635l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f12628e = 0L;
        this.f12635l = false;
        this.f12634k = -9223372036854775807L;
        AbstractC5148zt0.zzf(this.f12629f);
        this.f12625b.zzb();
        this.f12626c.zzb();
        this.f12627d.zzb();
        C6 c62 = this.f12632i;
        if (c62 != null) {
            c62.zzc();
        }
    }
}
