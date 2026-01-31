package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4254s2 extends AbstractC4140r2 {

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f22545b;

    /* renamed from: c, reason: collision with root package name */
    private final C4099qh0 f22546c;

    /* renamed from: d, reason: collision with root package name */
    private int f22547d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22548e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22549f;

    /* renamed from: g, reason: collision with root package name */
    private int f22550g;

    public C4254s2(K1 k12) {
        super(k12);
        this.f22545b = new C4099qh0(AbstractC5148zt0.zza);
        this.f22546c = new C4099qh0(4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4140r2
    protected final boolean a(C4099qh0 c4099qh0) throws C4027q2 {
        int iZzm = c4099qh0.zzm();
        int i8 = iZzm >> 4;
        int i9 = iZzm & 15;
        if (i9 == 7) {
            this.f22550g = i8;
            return i8 != 5;
        }
        throw new C4027q2("Video format not supported: " + i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4140r2
    protected final boolean b(C4099qh0 c4099qh0, long j8) throws C1901Sv {
        int i8;
        int iZzm = c4099qh0.zzm();
        long jZzh = c4099qh0.zzh();
        if (iZzm == 0) {
            if (!this.f22548e) {
                C4099qh0 c4099qh02 = new C4099qh0(new byte[c4099qh0.zzb()]);
                c4099qh0.zzG(c4099qh02.zzM(), 0, c4099qh0.zzb());
                E0 e0Zza = E0.zza(c4099qh02);
                this.f22547d = e0Zza.zzb;
                O4 o42 = new O4();
                o42.zzX("video/avc");
                o42.zzz(e0Zza.zzk);
                o42.zzac(e0Zza.zzc);
                o42.zzI(e0Zza.zzd);
                o42.zzT(e0Zza.zzj);
                o42.zzL(e0Zza.zza);
                this.f22333a.zzl(o42.zzad());
                this.f22548e = true;
                return false;
            }
        } else if (iZzm == 1 && this.f22548e) {
            int i9 = this.f22550g == 1 ? 1 : 0;
            if (this.f22549f) {
                i8 = i9;
            } else if (i9 != 0) {
                i8 = 1;
            }
            byte[] bArrZzM = this.f22546c.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 0;
            bArrZzM[2] = 0;
            int i10 = 4 - this.f22547d;
            int i11 = 0;
            while (c4099qh0.zzb() > 0) {
                c4099qh0.zzG(this.f22546c.zzM(), i10, this.f22547d);
                this.f22546c.zzK(0);
                C4099qh0 c4099qh03 = this.f22546c;
                C4099qh0 c4099qh04 = this.f22545b;
                int iZzp = c4099qh03.zzp();
                c4099qh04.zzK(0);
                this.f22333a.zzq(this.f22545b, 4);
                this.f22333a.zzq(c4099qh0, iZzp);
                i11 = i11 + 4 + iZzp;
            }
            this.f22333a.zzs(j8 + (jZzh * 1000), i8, i11, 0, null);
            this.f22549f = true;
            return true;
        }
        return false;
    }
}
