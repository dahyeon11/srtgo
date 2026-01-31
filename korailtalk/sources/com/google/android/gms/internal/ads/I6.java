package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class I6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f13403a;

    /* renamed from: b, reason: collision with root package name */
    private final C4708w1 f13404b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13405c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13406d;

    /* renamed from: e, reason: collision with root package name */
    private K1 f13407e;

    /* renamed from: f, reason: collision with root package name */
    private String f13408f;

    /* renamed from: g, reason: collision with root package name */
    private int f13409g;

    /* renamed from: h, reason: collision with root package name */
    private int f13410h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13411i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13412j;

    /* renamed from: k, reason: collision with root package name */
    private long f13413k;

    /* renamed from: l, reason: collision with root package name */
    private int f13414l;

    /* renamed from: m, reason: collision with root package name */
    private long f13415m;

    public I6() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zza(C4099qh0 c4099qh0) {
        F10.zzb(this.f13407e);
        while (c4099qh0.zzb() > 0) {
            int i8 = this.f13409g;
            if (i8 == 0) {
                byte[] bArrZzM = c4099qh0.zzM();
                int iZzd = c4099qh0.zzd();
                int iZze = c4099qh0.zze();
                while (true) {
                    if (iZzd >= iZze) {
                        c4099qh0.zzK(iZze);
                        break;
                    }
                    int i9 = iZzd + 1;
                    byte b9 = bArrZzM[iZzd];
                    boolean z8 = (b9 & 255) == 255;
                    boolean z9 = this.f13412j && (b9 & 224) == 224;
                    this.f13412j = z8;
                    if (z9) {
                        c4099qh0.zzK(i9);
                        this.f13412j = false;
                        this.f13403a.zzM()[1] = bArrZzM[iZzd];
                        this.f13410h = 2;
                        this.f13409g = 1;
                        break;
                    }
                    iZzd = i9;
                }
            } else if (i8 != 1) {
                int iMin = Math.min(c4099qh0.zzb(), this.f13414l - this.f13410h);
                this.f13407e.zzq(c4099qh0, iMin);
                int i10 = this.f13410h + iMin;
                this.f13410h = i10;
                if (i10 >= this.f13414l) {
                    F10.zzf(this.f13415m != -9223372036854775807L);
                    this.f13407e.zzs(this.f13415m, 1, this.f13414l, 0, null);
                    this.f13415m += this.f13413k;
                    this.f13410h = 0;
                    this.f13409g = 0;
                }
            } else {
                int iMin2 = Math.min(c4099qh0.zzb(), 4 - this.f13410h);
                c4099qh0.zzG(this.f13403a.zzM(), this.f13410h, iMin2);
                int i11 = this.f13410h + iMin2;
                this.f13410h = i11;
                if (i11 >= 4) {
                    this.f13403a.zzK(0);
                    if (this.f13404b.zza(this.f13403a.zzg())) {
                        this.f13414l = this.f13404b.zzc;
                        if (!this.f13411i) {
                            this.f13413k = (r0.zzg * 1000000) / r0.zzd;
                            O4 o42 = new O4();
                            o42.zzK(this.f13408f);
                            o42.zzX(this.f13404b.zzb);
                            o42.zzP(4096);
                            o42.zzy(this.f13404b.zze);
                            o42.zzY(this.f13404b.zzd);
                            o42.zzO(this.f13405c);
                            o42.zzV(this.f13406d);
                            this.f13407e.zzl(o42.zzad());
                            this.f13411i = true;
                        }
                        this.f13403a.zzK(0);
                        this.f13407e.zzq(this.f13403a, 4);
                        this.f13409g = 2;
                    } else {
                        this.f13410h = 0;
                        this.f13409g = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f13408f = c3011h7.zzb();
        this.f13407e = interfaceC2769f1.zzw(c3011h7.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f13415m = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f13409g = 0;
        this.f13410h = 0;
        this.f13412j = false;
        this.f13415m = -9223372036854775807L;
    }

    public I6(String str, int i8) {
        this.f13409g = 0;
        C4099qh0 c4099qh0 = new C4099qh0(4);
        this.f13403a = c4099qh0;
        c4099qh0.zzM()[0] = -1;
        this.f13404b = new C4708w1();
        this.f13415m = -9223372036854775807L;
        this.f13405c = str;
        this.f13406d = i8;
    }
}
