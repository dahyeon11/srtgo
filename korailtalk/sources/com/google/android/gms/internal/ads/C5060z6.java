package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5060z6 implements InterfaceC4490u6 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f24109l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final C3353k7 f24110a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f24111b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f24112c;

    /* renamed from: d, reason: collision with root package name */
    private final C4832x6 f24113d;

    /* renamed from: e, reason: collision with root package name */
    private final J6 f24114e;

    /* renamed from: f, reason: collision with root package name */
    private C4946y6 f24115f;

    /* renamed from: g, reason: collision with root package name */
    private long f24116g;

    /* renamed from: h, reason: collision with root package name */
    private String f24117h;

    /* renamed from: i, reason: collision with root package name */
    private K1 f24118i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24119j;

    /* renamed from: k, reason: collision with root package name */
    private long f24120k;

    public C5060z6() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.C4099qh0 r18) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5060z6.zza(com.google.android.gms.internal.ads.qh0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f24117h = c3011h7.zzb();
        K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 2);
        this.f24118i = k1Zzw;
        this.f24115f = new C4946y6(k1Zzw);
        C3353k7 c3353k7 = this.f24110a;
        if (c3353k7 != null) {
            c3353k7.zzb(interfaceC2769f1, c3011h7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f24120k = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        AbstractC5148zt0.zzf(this.f24112c);
        this.f24113d.zzb();
        C4946y6 c4946y6 = this.f24115f;
        if (c4946y6 != null) {
            c4946y6.zzd();
        }
        J6 j62 = this.f24114e;
        if (j62 != null) {
            j62.zzb();
        }
        this.f24116g = 0L;
        this.f24120k = -9223372036854775807L;
    }

    C5060z6(C3353k7 c3353k7) {
        C4099qh0 c4099qh0;
        this.f24110a = c3353k7;
        this.f24112c = new boolean[4];
        this.f24113d = new C4832x6(128);
        this.f24120k = -9223372036854775807L;
        if (c3353k7 != null) {
            this.f24114e = new J6(178, 128);
            c4099qh0 = new C4099qh0();
        } else {
            c4099qh0 = null;
            this.f24114e = null;
        }
        this.f24111b = c4099qh0;
    }
}
