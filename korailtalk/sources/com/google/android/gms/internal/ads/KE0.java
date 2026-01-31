package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class KE0 implements EG0, GG0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f13765b;

    /* renamed from: d, reason: collision with root package name */
    private HG0 f13767d;

    /* renamed from: e, reason: collision with root package name */
    private int f13768e;

    /* renamed from: f, reason: collision with root package name */
    private C2577dJ0 f13769f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3002h20 f13770g;

    /* renamed from: h, reason: collision with root package name */
    private int f13771h;

    /* renamed from: i, reason: collision with root package name */
    private GN0 f13772i;

    /* renamed from: j, reason: collision with root package name */
    private Q5[] f13773j;

    /* renamed from: k, reason: collision with root package name */
    private long f13774k;

    /* renamed from: l, reason: collision with root package name */
    private long f13775l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13777n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13778o;

    /* renamed from: q, reason: collision with root package name */
    private FG0 f13780q;

    /* renamed from: a, reason: collision with root package name */
    private final Object f13764a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ZF0 f13766c = new ZF0();

    /* renamed from: m, reason: collision with root package name */
    private long f13776m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private RG f13779p = RG.zza;

    public KE0(int i8) {
        this.f13765b = i8;
    }

    private final void i(long j8, boolean z8) {
        this.f13777n = false;
        this.f13775l = j8;
        this.f13776m = j8;
        u(j8, z8);
    }

    protected void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        FG0 fg0;
        synchronized (this.f13764a) {
            fg0 = this.f13780q;
        }
        if (fg0 != null) {
            fg0.zza(this);
        }
    }

    protected void c() {
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f(Q5[] q5Arr, long j8, long j9, NM0 nm0) {
        throw null;
    }

    protected final boolean g() {
        if (zzQ()) {
            return this.f13777n;
        }
        GN0 gn0 = this.f13772i;
        gn0.getClass();
        return gn0.zze();
    }

    protected final Q5[] h() {
        Q5[] q5Arr = this.f13773j;
        q5Arr.getClass();
        return q5Arr;
    }

    protected final int j(ZF0 zf0, BE0 be0, int i8) {
        GN0 gn0 = this.f13772i;
        gn0.getClass();
        int iZza = gn0.zza(zf0, be0, i8);
        if (iZza == -4) {
            if (be0.zzf()) {
                this.f13776m = Long.MIN_VALUE;
                return this.f13777n ? -4 : -3;
            }
            long j8 = be0.zze + this.f13774k;
            be0.zze = j8;
            this.f13776m = Math.max(this.f13776m, j8);
        } else if (iZza == -5) {
            Q5 q52 = zf0.zza;
            q52.getClass();
            long j9 = q52.zzr;
            if (j9 != Long.MAX_VALUE) {
                O4 o4Zzb = q52.zzb();
                o4Zzb.zzab(j9 + this.f13774k);
                zf0.zza = o4Zzb.zzad();
                return -5;
            }
        }
        return iZza;
    }

    protected final ZF0 k() {
        ZF0 zf0 = this.f13766c;
        zf0.zzb = null;
        zf0.zza = null;
        return zf0;
    }

    protected final int l(long j8) {
        GN0 gn0 = this.f13772i;
        gn0.getClass();
        return gn0.zzb(j8 - this.f13774k);
    }

    protected final long m() {
        return this.f13775l;
    }

    protected final InterfaceC3002h20 n() {
        InterfaceC3002h20 interfaceC3002h20 = this.f13770g;
        interfaceC3002h20.getClass();
        return interfaceC3002h20;
    }

    protected final WE0 o(Throwable th, Q5 q52, boolean z8, int i8) {
        int iZzY = 4;
        if (q52 != null && !this.f13778o) {
            this.f13778o = true;
            try {
                iZzY = zzY(q52) & 7;
            } catch (WE0 unused) {
            } finally {
                this.f13778o = false;
            }
        }
        return WE0.zzb(th, zzU(), this.f13768e, q52, iZzY, z8, i8);
    }

    protected final HG0 p() {
        HG0 hg0 = this.f13767d;
        hg0.getClass();
        return hg0;
    }

    protected final C2577dJ0 q() {
        C2577dJ0 c2577dJ0 = this.f13769f;
        c2577dJ0.getClass();
        return c2577dJ0;
    }

    protected void r() {
        throw null;
    }

    protected void s(boolean z8, boolean z9) {
    }

    protected void t() {
    }

    protected void u(long j8, boolean z8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzG() {
        F10.zzf(this.f13771h == 0);
        a();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzH(Q5[] q5Arr, GN0 gn0, long j8, long j9, NM0 nm0) {
        F10.zzf(!this.f13777n);
        this.f13772i = gn0;
        if (this.f13776m == Long.MIN_VALUE) {
            this.f13776m = j8;
        }
        this.f13773j = q5Arr;
        this.f13774k = j9;
        f(q5Arr, j8, j9, nm0);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzI() {
        F10.zzf(this.f13771h == 0);
        ZF0 zf0 = this.f13766c;
        zf0.zzb = null;
        zf0.zza = null;
        c();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzJ(long j8) {
        i(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzK() {
        this.f13777n = true;
    }

    @Override // com.google.android.gms.internal.ads.GG0
    public final void zzL(FG0 fg0) {
        synchronized (this.f13764a) {
            this.f13780q = fg0;
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public /* synthetic */ void zzM(float f8, float f9) {
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzN(RG rg) {
        if (AbstractC2281am0.zzG(this.f13779p, rg)) {
            return;
        }
        this.f13779p = rg;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzO() {
        F10.zzf(this.f13771h == 1);
        this.f13771h = 2;
        d();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzP() {
        F10.zzf(this.f13771h == 2);
        this.f13771h = 1;
        e();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final boolean zzQ() {
        return this.f13776m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final boolean zzR() {
        return this.f13777n;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.GG0
    public abstract /* synthetic */ String zzU();

    @Override // com.google.android.gms.internal.ads.EG0
    public abstract /* synthetic */ void zzV(long j8, long j9);

    @Override // com.google.android.gms.internal.ads.EG0
    public abstract /* synthetic */ boolean zzW();

    @Override // com.google.android.gms.internal.ads.EG0
    public abstract /* synthetic */ boolean zzX();

    @Override // com.google.android.gms.internal.ads.GG0
    public abstract /* synthetic */ int zzY(Q5 q52);

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.GG0
    public final int zzb() {
        return this.f13765b;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final int zzcU() {
        return this.f13771h;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long zzcW() {
        return this.f13776m;
    }

    @Override // com.google.android.gms.internal.ads.GG0
    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public InterfaceC2800fG0 zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final GG0 zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final GN0 zzo() {
        return this.f13772i;
    }

    @Override // com.google.android.gms.internal.ads.GG0
    public final void zzp() {
        synchronized (this.f13764a) {
            this.f13780q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzq() {
        F10.zzf(this.f13771h == 1);
        ZF0 zf0 = this.f13766c;
        zf0.zzb = null;
        zf0.zza = null;
        this.f13771h = 0;
        this.f13772i = null;
        this.f13773j = null;
        this.f13777n = false;
        r();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzr(HG0 hg0, Q5[] q5Arr, GN0 gn0, long j8, boolean z8, boolean z9, long j9, long j10, NM0 nm0) {
        F10.zzf(this.f13771h == 0);
        this.f13767d = hg0;
        this.f13771h = 1;
        s(z8, z9);
        zzH(q5Arr, gn0, j9, j10, nm0);
        i(j9, z8);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public /* synthetic */ void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.InterfaceC5081zG0
    public void zzt(int i8, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzu(int i8, C2577dJ0 c2577dJ0, InterfaceC3002h20 interfaceC3002h20) {
        this.f13768e = i8;
        this.f13769f = c2577dJ0;
        this.f13770g = interfaceC3002h20;
        t();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void zzv() {
        GN0 gn0 = this.f13772i;
        gn0.getClass();
        gn0.zzd();
    }
}
