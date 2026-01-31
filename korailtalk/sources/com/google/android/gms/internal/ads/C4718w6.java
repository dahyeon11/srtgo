package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4718w6 implements InterfaceC4490u6 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f23399q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f23400a;

    /* renamed from: b, reason: collision with root package name */
    private K1 f23401b;

    /* renamed from: c, reason: collision with root package name */
    private final C3353k7 f23402c;

    /* renamed from: d, reason: collision with root package name */
    private final C4099qh0 f23403d;

    /* renamed from: e, reason: collision with root package name */
    private final J6 f23404e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f23405f;

    /* renamed from: g, reason: collision with root package name */
    private final C4604v6 f23406g;

    /* renamed from: h, reason: collision with root package name */
    private long f23407h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23408i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23409j;

    /* renamed from: k, reason: collision with root package name */
    private long f23410k;

    /* renamed from: l, reason: collision with root package name */
    private long f23411l;

    /* renamed from: m, reason: collision with root package name */
    private long f23412m;

    /* renamed from: n, reason: collision with root package name */
    private long f23413n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23414o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23415p;

    public C4718w6() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.C4099qh0 r28) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4718w6.zza(com.google.android.gms.internal.ads.qh0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f23400a = c3011h7.zzb();
        this.f23401b = interfaceC2769f1.zzw(c3011h7.zza(), 2);
        C3353k7 c3353k7 = this.f23402c;
        if (c3353k7 != null) {
            c3353k7.zzb(interfaceC2769f1, c3011h7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f23411l = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        AbstractC5148zt0.zzf(this.f23405f);
        this.f23406g.zzb();
        J6 j62 = this.f23404e;
        if (j62 != null) {
            j62.zzb();
        }
        this.f23407h = 0L;
        this.f23408i = false;
        this.f23411l = -9223372036854775807L;
        this.f23413n = -9223372036854775807L;
    }

    C4718w6(C3353k7 c3353k7) {
        C4099qh0 c4099qh0;
        this.f23402c = c3353k7;
        this.f23405f = new boolean[4];
        this.f23406g = new C4604v6(128);
        if (c3353k7 != null) {
            this.f23404e = new J6(178, 128);
            c4099qh0 = new C4099qh0();
        } else {
            c4099qh0 = null;
            this.f23404e = null;
        }
        this.f23403d = c4099qh0;
        this.f23411l = -9223372036854775807L;
        this.f23413n = -9223372036854775807L;
    }
}
