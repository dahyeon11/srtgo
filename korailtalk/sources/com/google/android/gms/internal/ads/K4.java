package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class K4 implements S4 {

    /* renamed from: a */
    private final R4 f13727a;

    /* renamed from: b */
    private final long f13728b;

    /* renamed from: c */
    private final long f13729c;

    /* renamed from: d */
    private final X4 f13730d;

    /* renamed from: e */
    private int f13731e;

    /* renamed from: f */
    private long f13732f;

    /* renamed from: g */
    private long f13733g;

    /* renamed from: h */
    private long f13734h;

    /* renamed from: i */
    private long f13735i;

    /* renamed from: j */
    private long f13736j;

    /* renamed from: k */
    private long f13737k;

    /* renamed from: l */
    private long f13738l;

    public K4(X4 x42, long j8, long j9, long j10, long j11, boolean z8) {
        F10.zzd(j8 >= 0 && j9 > j8);
        this.f13730d = x42;
        this.f13728b = j8;
        this.f13729c = j9;
        if (j10 == j9 - j8 || z8) {
            this.f13732f = j11;
            this.f13731e = 4;
        } else {
            this.f13731e = 0;
        }
        this.f13727a = new R4();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x001d  */
    @Override // com.google.android.gms.internal.ads.S4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.InterfaceC2540d1 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.K4.zzd(com.google.android.gms.internal.ads.d1):long");
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final /* bridge */ /* synthetic */ C1 zze() {
        if (this.f13732f != 0) {
            return new J4(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final void zzg(long j8) {
        this.f13734h = Math.max(0L, Math.min(j8, this.f13732f - 1));
        this.f13731e = 2;
        this.f13735i = this.f13728b;
        this.f13736j = this.f13729c;
        this.f13737k = 0L;
        this.f13738l = this.f13732f;
    }
}
