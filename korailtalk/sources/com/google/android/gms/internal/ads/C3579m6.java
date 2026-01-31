package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3579m6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final C1755Pg0 f20814a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f20815b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20816c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20817d;

    /* renamed from: e, reason: collision with root package name */
    private String f20818e;

    /* renamed from: f, reason: collision with root package name */
    private K1 f20819f;

    /* renamed from: g, reason: collision with root package name */
    private int f20820g;

    /* renamed from: h, reason: collision with root package name */
    private int f20821h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20822i;

    /* renamed from: j, reason: collision with root package name */
    private long f20823j;

    /* renamed from: k, reason: collision with root package name */
    private Q5 f20824k;

    /* renamed from: l, reason: collision with root package name */
    private int f20825l;

    /* renamed from: m, reason: collision with root package name */
    private long f20826m;

    public C3579m6() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zza(C4099qh0 c4099qh0) {
        F10.zzb(this.f20819f);
        while (c4099qh0.zzb() > 0) {
            int i8 = this.f20820g;
            if (i8 == 0) {
                while (c4099qh0.zzb() > 0) {
                    if (this.f20822i) {
                        int iZzm = c4099qh0.zzm();
                        this.f20822i = iZzm == 172;
                        if (iZzm != 64) {
                            if (iZzm == 65) {
                                iZzm = 65;
                            }
                        }
                        this.f20820g = 1;
                        C4099qh0 c4099qh02 = this.f20815b;
                        c4099qh02.zzM()[0] = -84;
                        c4099qh02.zzM()[1] = iZzm == 65 ? (byte) 65 : (byte) 64;
                        this.f20821h = 2;
                    } else {
                        this.f20822i = c4099qh0.zzm() == 172;
                    }
                }
            } else if (i8 != 1) {
                int iMin = Math.min(c4099qh0.zzb(), this.f20825l - this.f20821h);
                this.f20819f.zzq(c4099qh0, iMin);
                int i9 = this.f20821h + iMin;
                this.f20821h = i9;
                if (i9 == this.f20825l) {
                    F10.zzf(this.f20826m != -9223372036854775807L);
                    this.f20819f.zzs(this.f20826m, 1, this.f20825l, 0, null);
                    this.f20826m += this.f20823j;
                    this.f20820g = 0;
                }
            } else {
                byte[] bArrZzM = this.f20815b.zzM();
                int iMin2 = Math.min(c4099qh0.zzb(), 16 - this.f20821h);
                c4099qh0.zzG(bArrZzM, this.f20821h, iMin2);
                int i10 = this.f20821h + iMin2;
                this.f20821h = i10;
                if (i10 == 16) {
                    this.f20814a.zzk(0);
                    C0 c0Zza = D0.zza(this.f20814a);
                    Q5 q52 = this.f20824k;
                    if (q52 == null || q52.zzA != 2 || c0Zza.zza != q52.zzB || !"audio/ac4".equals(q52.zzn)) {
                        O4 o42 = new O4();
                        o42.zzK(this.f20818e);
                        o42.zzX("audio/ac4");
                        o42.zzy(2);
                        o42.zzY(c0Zza.zza);
                        o42.zzO(this.f20816c);
                        o42.zzV(this.f20817d);
                        Q5 q5Zzad = o42.zzad();
                        this.f20824k = q5Zzad;
                        this.f20819f.zzl(q5Zzad);
                    }
                    this.f20825l = c0Zza.zzb;
                    this.f20823j = (c0Zza.zzc * 1000000) / this.f20824k.zzB;
                    this.f20815b.zzK(0);
                    this.f20819f.zzq(this.f20815b, 16);
                    this.f20820g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f20818e = c3011h7.zzb();
        this.f20819f = interfaceC2769f1.zzw(c3011h7.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f20826m = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f20820g = 0;
        this.f20821h = 0;
        this.f20822i = false;
        this.f20826m = -9223372036854775807L;
    }

    public C3579m6(String str, int i8) {
        C1755Pg0 c1755Pg0 = new C1755Pg0(new byte[16], 16);
        this.f20814a = c1755Pg0;
        this.f20815b = new C4099qh0(c1755Pg0.zza);
        this.f20820g = 0;
        this.f20821h = 0;
        this.f20822i = false;
        this.f20826m = -9223372036854775807L;
        this.f20816c = str;
        this.f20817d = i8;
    }
}
