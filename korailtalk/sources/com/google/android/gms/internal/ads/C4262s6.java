package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.s6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4262s6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f22558a;

    /* renamed from: c, reason: collision with root package name */
    private final String f22560c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22561d;

    /* renamed from: e, reason: collision with root package name */
    private String f22562e;

    /* renamed from: f, reason: collision with root package name */
    private K1 f22563f;

    /* renamed from: h, reason: collision with root package name */
    private int f22565h;

    /* renamed from: i, reason: collision with root package name */
    private int f22566i;

    /* renamed from: j, reason: collision with root package name */
    private long f22567j;

    /* renamed from: k, reason: collision with root package name */
    private Q5 f22568k;

    /* renamed from: l, reason: collision with root package name */
    private int f22569l;

    /* renamed from: m, reason: collision with root package name */
    private int f22570m;

    /* renamed from: g, reason: collision with root package name */
    private int f22564g = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f22573p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f22559b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    private int f22571n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f22572o = -1;

    public C4262s6(String str, int i8, int i9) {
        this.f22558a = new C4099qh0(new byte[i9]);
        this.f22560c = str;
        this.f22561d = i8;
    }

    private final void a(Y0 y02) {
        int i8;
        int i9 = y02.zzb;
        if (i9 == -2147483647 || (i8 = y02.zzc) == -1) {
            return;
        }
        Q5 q52 = this.f22568k;
        if (q52 != null && i8 == q52.zzA && i9 == q52.zzB && AbstractC2281am0.zzG(y02.zza, q52.zzn)) {
            return;
        }
        Q5 q53 = this.f22568k;
        O4 o42 = q53 == null ? new O4() : q53.zzb();
        o42.zzK(this.f22562e);
        o42.zzX(y02.zza);
        o42.zzy(y02.zzc);
        o42.zzY(y02.zzb);
        o42.zzO(this.f22560c);
        o42.zzV(this.f22561d);
        Q5 q5Zzad = o42.zzad();
        this.f22568k = q5Zzad;
        this.f22563f.zzl(q5Zzad);
    }

    private final boolean b(C4099qh0 c4099qh0, byte[] bArr, int i8) {
        int iMin = Math.min(c4099qh0.zzb(), i8 - this.f22565h);
        c4099qh0.zzG(bArr, this.f22565h, iMin);
        int i9 = this.f22565h + iMin;
        this.f22565h = i9;
        return i9 == i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.C4099qh0 r18) throws com.google.android.gms.internal.ads.C1901Sv {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4262s6.zza(com.google.android.gms.internal.ads.qh0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f22562e = c3011h7.zzb();
        this.f22563f = interfaceC2769f1.zzw(c3011h7.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f22573p = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f22564g = 0;
        this.f22565h = 0;
        this.f22566i = 0;
        this.f22573p = -9223372036854775807L;
        this.f22559b.set(0);
    }
}
