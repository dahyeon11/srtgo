package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rN0 */
/* loaded from: classes2.dex */
final class C4183rN0 implements LM0, InterfaceC2769f1, InterfaceC2422c, InterfaceC2996h, EN0 {

    /* renamed from: M */
    private static final Map f22413M;

    /* renamed from: N */
    private static final Q5 f22414N;

    /* renamed from: A */
    private boolean f22415A;

    /* renamed from: B */
    private boolean f22416B;

    /* renamed from: C */
    private int f22417C;

    /* renamed from: D */
    private boolean f22418D;

    /* renamed from: E */
    private long f22419E;

    /* renamed from: F */
    private long f22420F;

    /* renamed from: G */
    private boolean f22421G;

    /* renamed from: H */
    private int f22422H;

    /* renamed from: I */
    private boolean f22423I;

    /* renamed from: J */
    private boolean f22424J;

    /* renamed from: K */
    private final C3163iP0 f22425K;

    /* renamed from: L */
    private final C2703eP0 f22426L;

    /* renamed from: a */
    private final Uri f22427a;

    /* renamed from: b */
    private final Ky0 f22428b;

    /* renamed from: c */
    private final InterfaceC2925gL0 f22429c;

    /* renamed from: d */
    private final WM0 f22430d;

    /* renamed from: e */
    private final C2352bL0 f22431e;

    /* renamed from: f */
    private final InterfaceC3728nN0 f22432f;

    /* renamed from: g */
    private final long f22433g;

    /* renamed from: h */
    private final C3338k f22434h = new C3338k("ProgressiveMediaPeriod");

    /* renamed from: i */
    private final InterfaceC2929gN0 f22435i;

    /* renamed from: j */
    private final K30 f22436j;

    /* renamed from: k */
    private final Runnable f22437k;

    /* renamed from: l */
    private final Runnable f22438l;

    /* renamed from: m */
    private final Handler f22439m;

    /* renamed from: n */
    private final boolean f22440n;

    /* renamed from: o */
    private KM0 f22441o;

    /* renamed from: p */
    private M2 f22442p;

    /* renamed from: q */
    private FN0[] f22443q;

    /* renamed from: r */
    private C3956pN0[] f22444r;

    /* renamed from: s */
    private boolean f22445s;

    /* renamed from: t */
    private boolean f22446t;

    /* renamed from: u */
    private boolean f22447u;

    /* renamed from: v */
    private C4070qN0 f22448v;

    /* renamed from: w */
    private C1 f22449w;

    /* renamed from: x */
    private long f22450x;

    /* renamed from: y */
    private boolean f22451y;

    /* renamed from: z */
    private int f22452z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f22413M = Collections.unmodifiableMap(map);
        O4 o42 = new O4();
        o42.zzK("icy");
        o42.zzX("application/x-icy");
        f22414N = o42.zzad();
    }

    public C4183rN0(Uri uri, Ky0 ky0, InterfaceC2929gN0 interfaceC2929gN0, InterfaceC2925gL0 interfaceC2925gL0, C2352bL0 c2352bL0, C3163iP0 c3163iP0, WM0 wm0, InterfaceC3728nN0 interfaceC3728nN0, C2703eP0 c2703eP0, String str, int i8, long j8) {
        this.f22427a = uri;
        this.f22428b = ky0;
        this.f22429c = interfaceC2925gL0;
        this.f22431e = c2352bL0;
        this.f22425K = c3163iP0;
        this.f22430d = wm0;
        this.f22432f = interfaceC3728nN0;
        this.f22426L = c2703eP0;
        this.f22433g = i8;
        this.f22435i = interfaceC2929gN0;
        this.f22450x = j8;
        this.f22440n = j8 != -9223372036854775807L;
        this.f22436j = new K30(InterfaceC3002h20.zza);
        this.f22437k = new Runnable() { // from class: com.google.android.gms.internal.ads.iN0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.m();
            }
        };
        this.f22438l = new Runnable() { // from class: com.google.android.gms.internal.ads.jN0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c();
            }
        };
        this.f22439m = AbstractC2281am0.zzx(null);
        this.f22444r = new C3956pN0[0];
        this.f22443q = new FN0[0];
        this.f22420F = -9223372036854775807L;
        this.f22452z = 1;
    }

    static /* bridge */ /* synthetic */ void b(final C4183rN0 c4183rN0) {
        c4183rN0.f22439m.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hN0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d();
            }
        });
    }

    private final int i() {
        int iZzd = 0;
        for (FN0 fn0 : this.f22443q) {
            iZzd += fn0.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long j(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.FN0[] r3 = r5.f22443q
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.qN0 r4 = r5.f22448v
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzh()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4183rN0.j(boolean):long");
    }

    private final K1 k(C3956pN0 c3956pN0) {
        int length = this.f22443q.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (c3956pN0.equals(this.f22444r[i8])) {
                return this.f22443q[i8];
            }
        }
        FN0 fn0 = new FN0(this.f22426L, this.f22429c, this.f22431e);
        fn0.zzu(this);
        int i9 = length + 1;
        C3956pN0[] c3956pN0Arr = (C3956pN0[]) Arrays.copyOf(this.f22444r, i9);
        c3956pN0Arr[length] = c3956pN0;
        int i10 = AbstractC2281am0.zza;
        this.f22444r = c3956pN0Arr;
        FN0[] fn0Arr = (FN0[]) Arrays.copyOf(this.f22443q, i9);
        fn0Arr[length] = fn0;
        this.f22443q = fn0Arr;
        return fn0;
    }

    private final void l() {
        F10.zzf(this.f22446t);
        this.f22448v.getClass();
        this.f22449w.getClass();
    }

    public final void m() {
        int i8;
        if (this.f22424J || this.f22446t || !this.f22445s || this.f22449w == null) {
            return;
        }
        for (FN0 fn0 : this.f22443q) {
            if (fn0.zzi() == null) {
                return;
            }
        }
        this.f22436j.zzc();
        int length = this.f22443q.length;
        TH[] thArr = new TH[length];
        boolean[] zArr = new boolean[length];
        for (int i9 = 0; i9 < length; i9++) {
            Q5 q5Zzi = this.f22443q[i9].zzi();
            q5Zzi.getClass();
            String str = q5Zzi.zzn;
            boolean zZzg = AbstractC4239rv.zzg(str);
            boolean z8 = zZzg || AbstractC4239rv.zzh(str);
            zArr[i9] = z8;
            this.f22447u = z8 | this.f22447u;
            M2 m22 = this.f22442p;
            if (m22 != null) {
                if (zZzg || this.f22444r[i9].zzb) {
                    C1735Ot c1735Ot = q5Zzi.zzl;
                    C1735Ot c1735Ot2 = c1735Ot == null ? new C1735Ot(-9223372036854775807L, m22) : c1735Ot.zzc(m22);
                    O4 o4Zzb = q5Zzi.zzb();
                    o4Zzb.zzQ(c1735Ot2);
                    q5Zzi = o4Zzb.zzad();
                }
                if (zZzg && q5Zzi.zzh == -1 && q5Zzi.zzi == -1 && (i8 = m22.zza) != -1) {
                    O4 o4Zzb2 = q5Zzi.zzb();
                    o4Zzb2.zzx(i8);
                    q5Zzi = o4Zzb2.zzad();
                }
            }
            thArr[i9] = new TH(Integer.toString(i9), q5Zzi.zzc(this.f22429c.zza(q5Zzi)));
        }
        this.f22448v = new C4070qN0(new SN0(thArr), zArr);
        this.f22446t = true;
        KM0 km0 = this.f22441o;
        km0.getClass();
        km0.zzi(this);
    }

    private final void n(int i8) {
        l();
        C4070qN0 c4070qN0 = this.f22448v;
        boolean[] zArr = c4070qN0.zzd;
        if (zArr[i8]) {
            return;
        }
        Q5 q5Zzb = c4070qN0.zza.zzb(i8).zzb(0);
        this.f22430d.zzc(new JM0(1, AbstractC4239rv.zzb(q5Zzb.zzn), q5Zzb, 0, null, AbstractC2281am0.zzu(this.f22419E), -9223372036854775807L));
        zArr[i8] = true;
    }

    private final void o(int i8) {
        l();
        boolean[] zArr = this.f22448v.zzb;
        if (this.f22421G && zArr[i8] && !this.f22443q[i8].zzx(false)) {
            this.f22420F = 0L;
            this.f22421G = false;
            this.f22416B = true;
            this.f22419E = 0L;
            this.f22422H = 0;
            for (FN0 fn0 : this.f22443q) {
                fn0.zzp(false);
            }
            KM0 km0 = this.f22441o;
            km0.getClass();
            km0.zzg(this);
        }
    }

    private final void p() {
        C3614mN0 c3614mN0 = new C3614mN0(this, this.f22427a, this.f22428b, this.f22435i, this, this.f22436j);
        if (this.f22446t) {
            F10.zzf(q());
            long j8 = this.f22450x;
            if (j8 != -9223372036854775807L && this.f22420F > j8) {
                this.f22423I = true;
                this.f22420F = -9223372036854775807L;
                return;
            }
            C1 c12 = this.f22449w;
            c12.getClass();
            C3614mN0.e(c3614mN0, c12.zzg(this.f22420F).zza.zzc, this.f22420F);
            for (FN0 fn0 : this.f22443q) {
                fn0.zzt(this.f22420F);
            }
            this.f22420F = -9223372036854775807L;
        }
        this.f22422H = i();
        long jZza = this.f22434h.zza(c3614mN0, this, C3163iP0.zza(this.f22452z));
        NB0 nb0 = c3614mN0.f20896k;
        this.f22430d.zzg(new EM0(c3614mN0.f20886a, nb0, nb0.zza, Collections.emptyMap(), jZza, 0L, 0L), new JM0(1, -1, null, 0, null, AbstractC2281am0.zzu(c3614mN0.f20895j), AbstractC2281am0.zzu(this.f22450x)));
    }

    private final boolean q() {
        return this.f22420F != -9223372036854775807L;
    }

    private final boolean r() {
        return this.f22416B || q();
    }

    static /* bridge */ /* synthetic */ long w(C4183rN0 c4183rN0, boolean z8) {
        return c4183rN0.j(true);
    }

    final /* synthetic */ void c() {
        if (this.f22424J) {
            return;
        }
        KM0 km0 = this.f22441o;
        km0.getClass();
        km0.zzg(this);
    }

    final /* synthetic */ void d() {
        this.f22418D = true;
    }

    final /* synthetic */ void e(C1 c12) {
        this.f22449w = this.f22442p == null ? c12 : new B1(-9223372036854775807L, 0L);
        if (c12.zza() == -9223372036854775807L && this.f22450x != -9223372036854775807L) {
            this.f22449w = new C3500lN0(this, this.f22449w);
        }
        this.f22450x = this.f22449w.zza();
        boolean z8 = false;
        if (!this.f22418D && c12.zza() == -9223372036854775807L) {
            z8 = true;
        }
        this.f22451y = z8;
        this.f22452z = true == z8 ? 7 : 1;
        this.f22432f.zza(this.f22450x, c12.zzh(), this.f22451y);
        if (this.f22446t) {
            return;
        }
        m();
    }

    final void f() throws IOException {
        this.f22434h.zzi(C3163iP0.zza(this.f22452z));
    }

    final void g(int i8) throws IOException {
        this.f22443q[i8].zzm();
        f();
    }

    final boolean h(int i8) {
        return !r() && this.f22443q[i8].zzx(this.f22423I);
    }

    final int s(int i8, ZF0 zf0, BE0 be0, int i9) {
        if (r()) {
            return -3;
        }
        n(i8);
        int iZze = this.f22443q[i8].zze(zf0, be0, i9, this.f22423I);
        if (iZze == -3) {
            o(i8);
        }
        return iZze;
    }

    final int t(int i8, long j8) {
        if (r()) {
            return 0;
        }
        n(i8);
        FN0 fn0 = this.f22443q[i8];
        int iZzc = fn0.zzc(j8, this.f22423I);
        fn0.zzv(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        o(i8);
        return 0;
    }

    final K1 z() {
        return k(new C3956pN0(0, true));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final void zzD() {
        this.f22445s = true;
        this.f22439m.post(this.f22437k);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2422c
    public final /* bridge */ /* synthetic */ void zzJ(InterfaceC2881g interfaceC2881g, long j8, long j9, boolean z8) {
        C3614mN0 c3614mN0 = (C3614mN0) interfaceC2881g;
        C4165rE0 c4165rE0 = c3614mN0.f20888c;
        EM0 em0 = new EM0(c3614mN0.f20886a, c3614mN0.f20896k, c4165rE0.zzh(), c4165rE0.zzi(), j8, j9, c4165rE0.zzg());
        long unused = c3614mN0.f20886a;
        this.f22430d.zzd(em0, new JM0(1, -1, null, 0, null, AbstractC2281am0.zzu(c3614mN0.f20895j), AbstractC2281am0.zzu(this.f22450x)));
        if (z8) {
            return;
        }
        for (FN0 fn0 : this.f22443q) {
            fn0.zzp(false);
        }
        if (this.f22417C > 0) {
            KM0 km0 = this.f22441o;
            km0.getClass();
            km0.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2422c
    public final /* bridge */ /* synthetic */ void zzK(InterfaceC2881g interfaceC2881g, long j8, long j9) {
        C1 c12;
        if (this.f22450x == -9223372036854775807L && (c12 = this.f22449w) != null) {
            boolean zZzh = c12.zzh();
            long j10 = j(true);
            long j11 = j10 == Long.MIN_VALUE ? 0L : j10 + H0.y.MIN_BACKOFF_MILLIS;
            this.f22450x = j11;
            this.f22432f.zza(j11, zZzh, this.f22451y);
        }
        C3614mN0 c3614mN0 = (C3614mN0) interfaceC2881g;
        C4165rE0 c4165rE0 = c3614mN0.f20888c;
        EM0 em0 = new EM0(c3614mN0.f20886a, c3614mN0.f20896k, c4165rE0.zzh(), c4165rE0.zzi(), j8, j9, c4165rE0.zzg());
        long unused = c3614mN0.f20886a;
        this.f22430d.zze(em0, new JM0(1, -1, null, 0, null, AbstractC2281am0.zzu(c3614mN0.f20895j), AbstractC2281am0.zzu(this.f22450x)));
        this.f22423I = true;
        KM0 km0 = this.f22441o;
        km0.getClass();
        km0.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2996h
    public final void zzL() {
        for (FN0 fn0 : this.f22443q) {
            fn0.zzo();
        }
        this.f22435i.zze();
    }

    @Override // com.google.android.gms.internal.ads.EN0
    public final void zzM(Q5 q52) {
        this.f22439m.post(this.f22437k);
    }

    public final void zzN() {
        if (this.f22446t) {
            for (FN0 fn0 : this.f22443q) {
                fn0.zzn();
            }
        }
        this.f22434h.zzj(this);
        this.f22439m.removeCallbacksAndMessages(null);
        this.f22441o = null;
        this.f22424J = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final void zzO(final C1 c12) {
        this.f22439m.post(new Runnable() { // from class: com.google.android.gms.internal.ads.kN0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.e(c12);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zza(long j8, IG0 ig0) {
        l();
        if (!this.f22449w.zzh()) {
            return 0L;
        }
        A1 a1Zzg = this.f22449w.zzg(j8);
        D1 d12 = a1Zzg.zza;
        D1 d13 = a1Zzg.zzb;
        long j9 = ig0.zzf;
        if (j9 == 0) {
            if (ig0.zzg == 0) {
                return j8;
            }
            j9 = 0;
        }
        long j10 = d12.zzb;
        int i8 = AbstractC2281am0.zza;
        long j11 = j8 - j9;
        long j12 = ig0.zzg;
        long j13 = j8 + j12;
        long j14 = j8 ^ j13;
        long j15 = j12 ^ j13;
        if (((j8 ^ j9) & (j8 ^ j11)) < 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((j14 & j15) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z8 = j11 <= j10 && j10 <= j13;
        long j16 = d13.zzb;
        boolean z9 = j11 <= j16 && j16 <= j13;
        if (z8 && z9) {
            if (Math.abs(j10 - j8) > Math.abs(j16 - j8)) {
                return j16;
            }
        } else if (!z8) {
            return z9 ? j16 : j11;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzb() {
        long j8;
        l();
        if (this.f22423I || this.f22417C == 0) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.f22420F;
        }
        if (this.f22447u) {
            int length = this.f22443q.length;
            j8 = Long.MAX_VALUE;
            for (int i8 = 0; i8 < length; i8++) {
                C4070qN0 c4070qN0 = this.f22448v;
                if (c4070qN0.zzb[i8] && c4070qN0.zzc[i8] && !this.f22443q[i8].zzw()) {
                    j8 = Math.min(j8, this.f22443q[i8].zzh());
                }
            }
        } else {
            j8 = Long.MAX_VALUE;
        }
        if (j8 == Long.MAX_VALUE) {
            j8 = j(false);
        }
        return j8 == Long.MIN_VALUE ? this.f22419E : j8;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzd() {
        if (!this.f22416B) {
            return -9223372036854775807L;
        }
        if (!this.f22423I && i() <= this.f22422H) {
            return -9223372036854775807L;
        }
        this.f22416B = false;
        return this.f22419E;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006f  */
    @Override // com.google.android.gms.internal.ads.LM0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zze(long r7) {
        /*
            r6 = this;
            r6.l()
            com.google.android.gms.internal.ads.qN0 r0 = r6.f22448v
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.C1 r1 = r6.f22449w
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L12
            r7 = 0
        L12:
            r1 = 0
            r6.f22416B = r1
            r6.f22419E = r7
            boolean r2 = r6.q()
            if (r2 == 0) goto L20
            r6.f22420F = r7
            return r7
        L20:
            int r2 = r6.f22452z
            r3 = 7
            if (r2 == r3) goto L4e
            com.google.android.gms.internal.ads.FN0[] r2 = r6.f22443q
            int r2 = r2.length
            r3 = r1
        L29:
            if (r3 >= r2) goto L80
            com.google.android.gms.internal.ads.FN0[] r4 = r6.f22443q
            r4 = r4[r3]
            boolean r5 = r6.f22440n
            if (r5 == 0) goto L3c
            int r5 = r4.zza()
            boolean r4 = r4.zzy(r5)
            goto L40
        L3c:
            boolean r4 = r4.zzz(r7, r1)
        L40:
            if (r4 != 0) goto L4b
            boolean r4 = r0[r3]
            if (r4 != 0) goto L4e
            boolean r4 = r6.f22447u
            if (r4 != 0) goto L4b
            goto L4e
        L4b:
            int r3 = r3 + 1
            goto L29
        L4e:
            r6.f22421G = r1
            r6.f22420F = r7
            r6.f22423I = r1
            com.google.android.gms.internal.ads.k r0 = r6.f22434h
            boolean r2 = r0.zzl()
            if (r2 == 0) goto L6f
            com.google.android.gms.internal.ads.FN0[] r0 = r6.f22443q
            int r2 = r0.length
        L5f:
            if (r1 >= r2) goto L69
            r3 = r0[r1]
            r3.zzk()
            int r1 = r1 + 1
            goto L5f
        L69:
            com.google.android.gms.internal.ads.k r0 = r6.f22434h
            r0.zzg()
            goto L80
        L6f:
            r0.zzh()
            com.google.android.gms.internal.ads.FN0[] r0 = r6.f22443q
            int r2 = r0.length
            r3 = r1
        L76:
            if (r3 >= r2) goto L80
            r4 = r0[r3]
            r4.zzp(r1)
            int r3 = r3 + 1
            goto L76
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4183rN0.zze(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0042  */
    @Override // com.google.android.gms.internal.ads.LM0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.PO0[] r8, boolean[] r9, com.google.android.gms.internal.ads.GN0[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4183rN0.zzf(com.google.android.gms.internal.ads.PO0[], boolean[], com.google.android.gms.internal.ads.GN0[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final SN0 zzh() {
        l();
        return this.f22448v.zza;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzj(long j8, boolean z8) {
        if (this.f22440n) {
            return;
        }
        l();
        if (q()) {
            return;
        }
        boolean[] zArr = this.f22448v.zzc;
        int length = this.f22443q.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f22443q[i8].zzj(j8, false, zArr[i8]);
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzk() throws IOException {
        f();
        if (this.f22423I && !this.f22446t) {
            throw C1901Sv.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzl(KM0 km0, long j8) {
        this.f22441o = km0;
        this.f22436j.zze();
        p();
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final void zzm(long j8) {
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzo(C2685eG0 c2685eG0) {
        if (this.f22423I) {
            return false;
        }
        C3338k c3338k = this.f22434h;
        if (c3338k.zzk() || this.f22421G) {
            return false;
        }
        if (this.f22446t && this.f22417C == 0) {
            return false;
        }
        boolean zZze = this.f22436j.zze();
        if (c3338k.zzl()) {
            return zZze;
        }
        p();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzp() {
        return this.f22434h.zzl() && this.f22436j.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2422c
    public final /* bridge */ /* synthetic */ C2651e zzu(InterfaceC2881g interfaceC2881g, long j8, long j9, IOException iOException, int i8) {
        long jMin;
        C2651e c2651eZzb;
        C1 c12;
        C3614mN0 c3614mN0 = (C3614mN0) interfaceC2881g;
        C4165rE0 c4165rE0 = c3614mN0.f20888c;
        EM0 em0 = new EM0(c3614mN0.f20886a, c3614mN0.f20896k, c4165rE0.zzh(), c4165rE0.zzi(), j8, j9, c4165rE0.zzg());
        long unused = c3614mN0.f20895j;
        int i9 = AbstractC2281am0.zza;
        if ((iOException instanceof C1901Sv) || (iOException instanceof FileNotFoundException) || (iOException instanceof C3141iE0) || (iOException instanceof C3224j)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C3565lz0) && ((C3565lz0) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i8 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            c2651eZzb = C3338k.zzd;
        } else {
            int i10 = i();
            boolean z8 = i10 > this.f22422H;
            if (this.f22418D || !((c12 = this.f22449w) == null || c12.zza() == -9223372036854775807L)) {
                this.f22422H = i10;
            } else {
                boolean z9 = this.f22446t;
                if (!z9 || r()) {
                    this.f22416B = z9;
                    this.f22419E = 0L;
                    this.f22422H = 0;
                    for (FN0 fn0 : this.f22443q) {
                        fn0.zzp(false);
                    }
                    C3614mN0.e(c3614mN0, 0L, 0L);
                } else {
                    this.f22421G = true;
                    c2651eZzb = C3338k.zzc;
                }
            }
            c2651eZzb = C3338k.zzb(z8, jMin);
        }
        boolean zZzc = c2651eZzb.zzc();
        this.f22430d.zzf(em0, new JM0(1, -1, null, 0, null, AbstractC2281am0.zzu(c3614mN0.f20895j), AbstractC2281am0.zzu(this.f22450x)), iOException, true ^ zZzc);
        if (!zZzc) {
            long unused2 = c3614mN0.f20886a;
        }
        return c2651eZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final K1 zzw(int i8, int i9) {
        return k(new C3956pN0(i8, false));
    }
}
