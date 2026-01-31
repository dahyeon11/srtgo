package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;

/* renamed from: com.google.android.gms.internal.ads.j6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3237j6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final C1755Pg0 f20183a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f20184b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20185c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20186d;

    /* renamed from: e, reason: collision with root package name */
    private String f20187e;

    /* renamed from: f, reason: collision with root package name */
    private K1 f20188f;

    /* renamed from: g, reason: collision with root package name */
    private int f20189g;

    /* renamed from: h, reason: collision with root package name */
    private int f20190h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20191i;

    /* renamed from: j, reason: collision with root package name */
    private long f20192j;

    /* renamed from: k, reason: collision with root package name */
    private Q5 f20193k;

    /* renamed from: l, reason: collision with root package name */
    private int f20194l;

    /* renamed from: m, reason: collision with root package name */
    private long f20195m;

    public C3237j6() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zza(C4099qh0 c4099qh0) {
        F10.zzb(this.f20188f);
        while (c4099qh0.zzb() > 0) {
            int i8 = this.f20189g;
            if (i8 == 0) {
                while (true) {
                    if (c4099qh0.zzb() <= 0) {
                        break;
                    }
                    if (this.f20191i) {
                        int iZzm = c4099qh0.zzm();
                        if (iZzm == 119) {
                            this.f20191i = false;
                            this.f20189g = 1;
                            C4099qh0 c4099qh02 = this.f20184b;
                            c4099qh02.zzM()[0] = AbstractC5358c.VT;
                            c4099qh02.zzM()[1] = 119;
                            this.f20190h = 2;
                            break;
                        }
                        this.f20191i = iZzm == 11;
                    } else {
                        this.f20191i = c4099qh0.zzm() == 11;
                    }
                }
            } else if (i8 != 1) {
                int iMin = Math.min(c4099qh0.zzb(), this.f20194l - this.f20190h);
                this.f20188f.zzq(c4099qh0, iMin);
                int i9 = this.f20190h + iMin;
                this.f20190h = i9;
                if (i9 == this.f20194l) {
                    F10.zzf(this.f20195m != -9223372036854775807L);
                    this.f20188f.zzs(this.f20195m, 1, this.f20194l, 0, null);
                    this.f20195m += this.f20192j;
                    this.f20189g = 0;
                }
            } else {
                byte[] bArrZzM = this.f20184b.zzM();
                int iMin2 = Math.min(c4099qh0.zzb(), 128 - this.f20190h);
                c4099qh0.zzG(bArrZzM, this.f20190h, iMin2);
                int i10 = this.f20190h + iMin2;
                this.f20190h = i10;
                if (i10 == 128) {
                    this.f20183a.zzk(0);
                    C5048z0 c5048z0Zze = A0.zze(this.f20183a);
                    Q5 q52 = this.f20193k;
                    if (q52 == null || c5048z0Zze.zzc != q52.zzA || c5048z0Zze.zzb != q52.zzB || !AbstractC2281am0.zzG(c5048z0Zze.zza, q52.zzn)) {
                        O4 o42 = new O4();
                        o42.zzK(this.f20187e);
                        o42.zzX(c5048z0Zze.zza);
                        o42.zzy(c5048z0Zze.zzc);
                        o42.zzY(c5048z0Zze.zzb);
                        o42.zzO(this.f20185c);
                        o42.zzV(this.f20186d);
                        o42.zzS(c5048z0Zze.zzf);
                        if ("audio/ac3".equals(c5048z0Zze.zza)) {
                            o42.zzx(c5048z0Zze.zzf);
                        }
                        Q5 q5Zzad = o42.zzad();
                        this.f20193k = q5Zzad;
                        this.f20188f.zzl(q5Zzad);
                    }
                    this.f20194l = c5048z0Zze.zzd;
                    this.f20192j = (c5048z0Zze.zze * 1000000) / this.f20193k.zzB;
                    this.f20184b.zzK(0);
                    this.f20188f.zzq(this.f20184b, 128);
                    this.f20189g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f20187e = c3011h7.zzb();
        this.f20188f = interfaceC2769f1.zzw(c3011h7.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f20195m = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f20189g = 0;
        this.f20190h = 0;
        this.f20191i = false;
        this.f20195m = -9223372036854775807L;
    }

    public C3237j6(String str, int i8) {
        C1755Pg0 c1755Pg0 = new C1755Pg0(new byte[128], 128);
        this.f20183a = c1755Pg0;
        this.f20184b = new C4099qh0(c1755Pg0.zza);
        this.f20189g = 0;
        this.f20195m = -9223372036854775807L;
        this.f20185c = str;
        this.f20186d = i8;
    }
}
