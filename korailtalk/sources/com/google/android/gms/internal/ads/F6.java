package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class F6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final W6 f12927a;

    /* renamed from: b, reason: collision with root package name */
    private String f12928b;

    /* renamed from: c, reason: collision with root package name */
    private K1 f12929c;

    /* renamed from: d, reason: collision with root package name */
    private E6 f12930d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12931e;

    /* renamed from: l, reason: collision with root package name */
    private long f12938l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f12932f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final J6 f12933g = new J6(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final J6 f12934h = new J6(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final J6 f12935i = new J6(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final J6 f12936j = new J6(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final J6 f12937k = new J6(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f12939m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final C4099qh0 f12940n = new C4099qh0();

    public F6(W6 w62) {
        this.f12927a = w62;
    }

    private final void a(byte[] bArr, int i8, int i9) {
        this.f12930d.zzb(bArr, i8, i9);
        if (!this.f12931e) {
            this.f12933g.zza(bArr, i8, i9);
            this.f12934h.zza(bArr, i8, i9);
            this.f12935i.zza(bArr, i8, i9);
        }
        this.f12936j.zza(bArr, i8, i9);
        this.f12937k.zza(bArr, i8, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.C4099qh0 r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.F6.zza(com.google.android.gms.internal.ads.qh0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f12928b = c3011h7.zzb();
        K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 2);
        this.f12929c = k1Zzw;
        this.f12930d = new E6(k1Zzw);
        this.f12927a.zzb(interfaceC2769f1, c3011h7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f12939m = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f12938l = 0L;
        this.f12939m = -9223372036854775807L;
        AbstractC5148zt0.zzf(this.f12932f);
        this.f12933g.zzb();
        this.f12934h.zzb();
        this.f12935i.zzb();
        this.f12936j.zzb();
        this.f12937k.zzb();
        E6 e62 = this.f12930d;
        if (e62 != null) {
            e62.zzc();
        }
    }
}
