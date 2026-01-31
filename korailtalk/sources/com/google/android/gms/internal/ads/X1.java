package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class X1 implements InterfaceC2425c1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f17090a;

    /* renamed from: b, reason: collision with root package name */
    private final W1 f17091b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3122i5 f17092c;

    /* renamed from: d, reason: collision with root package name */
    private int f17093d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC2769f1 f17094e;

    /* renamed from: f, reason: collision with root package name */
    private Y1 f17095f;

    /* renamed from: g, reason: collision with root package name */
    private long f17096g;

    /* renamed from: h, reason: collision with root package name */
    private C2198a2[] f17097h;

    /* renamed from: i, reason: collision with root package name */
    private long f17098i;

    /* renamed from: j, reason: collision with root package name */
    private C2198a2 f17099j;

    /* renamed from: k, reason: collision with root package name */
    private int f17100k;

    /* renamed from: l, reason: collision with root package name */
    private long f17101l;

    /* renamed from: m, reason: collision with root package name */
    private long f17102m;

    /* renamed from: n, reason: collision with root package name */
    private int f17103n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17104o;

    @Deprecated
    public X1() {
        this(1, InterfaceC3122i5.zza);
    }

    private final C2198a2 b(int i8) {
        for (C2198a2 c2198a2 : this.f17097h) {
            if (c2198a2.zzg(i8)) {
                return c2198a2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x030a  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.InterfaceC2540d1 r28, com.google.android.gms.internal.ads.C5050z1 r29) throws com.google.android.gms.internal.ads.C1901Sv, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.X1.zzb(com.google.android.gms.internal.ads.d1, com.google.android.gms.internal.ads.z1):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f17093d = 0;
        this.f17094e = interfaceC2769f1;
        this.f17098i = -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f17098i = -1L;
        this.f17099j = null;
        for (C2198a2 c2198a2 : this.f17097h) {
            c2198a2.zzf(j8);
        }
        if (j8 == 0) {
            this.f17093d = this.f17097h.length != 0 ? 3 : 0;
        } else {
            this.f17093d = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        ((Q0) interfaceC2540d1).zzm(this.f17090a.zzM(), 0, 12, false);
        this.f17090a.zzK(0);
        if (this.f17090a.zzi() != 1179011410) {
            return false;
        }
        this.f17090a.zzL(4);
        return this.f17090a.zzi() == 541677121;
    }

    public X1(int i8, InterfaceC3122i5 interfaceC3122i5) {
        this.f17092c = interfaceC3122i5;
        this.f17090a = new C4099qh0(12);
        this.f17091b = new W1(null);
        this.f17094e = new C2196a1();
        this.f17097h = new C2198a2[0];
        this.f17101l = -1L;
        this.f17102m = -1L;
        this.f17100k = -1;
        this.f17096g = -9223372036854775807L;
    }
}
