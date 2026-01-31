package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import e3.AbstractC5358c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class PL0 extends KE0 {

    /* renamed from: v0, reason: collision with root package name */
    private static final byte[] f15265v0 = {0, 0, 1, 103, 66, -64, AbstractC5358c.VT, -38, 37, -112, 0, 0, 1, 104, -50, AbstractC5358c.SI, 19, 32, 0, 0, 1, 101, -120, -124, AbstractC5358c.CR, -50, 113, AbstractC5358c.CAN, -96, 0, 47, -65, AbstractC5358c.FS, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final UK0 f15266A;

    /* renamed from: B, reason: collision with root package name */
    private Q5 f15267B;

    /* renamed from: C, reason: collision with root package name */
    private Q5 f15268C;

    /* renamed from: D, reason: collision with root package name */
    private MediaCrypto f15269D;

    /* renamed from: E, reason: collision with root package name */
    private float f15270E;

    /* renamed from: F, reason: collision with root package name */
    private AL0 f15271F;

    /* renamed from: G, reason: collision with root package name */
    private Q5 f15272G;

    /* renamed from: H, reason: collision with root package name */
    private MediaFormat f15273H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f15274I;

    /* renamed from: J, reason: collision with root package name */
    private float f15275J;

    /* renamed from: K, reason: collision with root package name */
    private ArrayDeque f15276K;

    /* renamed from: L, reason: collision with root package name */
    private NL0 f15277L;

    /* renamed from: M, reason: collision with root package name */
    private DL0 f15278M;

    /* renamed from: N, reason: collision with root package name */
    private int f15279N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f15280O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f15281P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f15282Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f15283R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f15284S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f15285T;

    /* renamed from: U, reason: collision with root package name */
    private long f15286U;

    /* renamed from: V, reason: collision with root package name */
    private int f15287V;

    /* renamed from: W, reason: collision with root package name */
    private int f15288W;

    /* renamed from: X, reason: collision with root package name */
    private ByteBuffer f15289X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f15290Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f15291Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f15292a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f15293b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f15294c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f15295d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f15296e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f15297f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f15298g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f15299h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f15300i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f15301j0;

    /* renamed from: k0, reason: collision with root package name */
    private long f15302k0;

    /* renamed from: l0, reason: collision with root package name */
    private long f15303l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f15304m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f15305n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f15306o0;

    /* renamed from: p0, reason: collision with root package name */
    protected LE0 f15307p0;

    /* renamed from: q0, reason: collision with root package name */
    private OL0 f15308q0;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC5091zL0 f15309r;

    /* renamed from: r0, reason: collision with root package name */
    private long f15310r0;

    /* renamed from: s, reason: collision with root package name */
    private final RL0 f15311s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f15312s0;

    /* renamed from: t, reason: collision with root package name */
    private final float f15313t;

    /* renamed from: t0, reason: collision with root package name */
    private C3040hL0 f15314t0;

    /* renamed from: u, reason: collision with root package name */
    private final BE0 f15315u;

    /* renamed from: u0, reason: collision with root package name */
    private C3040hL0 f15316u0;

    /* renamed from: v, reason: collision with root package name */
    private final BE0 f15317v;

    /* renamed from: w, reason: collision with root package name */
    private final BE0 f15318w;

    /* renamed from: x, reason: collision with root package name */
    private final C4749wL0 f15319x;

    /* renamed from: y, reason: collision with root package name */
    private final MediaCodec.BufferInfo f15320y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayDeque f15321z;

    public PL0(int i8, InterfaceC5091zL0 interfaceC5091zL0, RL0 rl0, boolean z8, float f8) {
        super(i8);
        this.f15309r = interfaceC5091zL0;
        this.f15311s = rl0;
        this.f15313t = f8;
        this.f15315u = new BE0(0, 0);
        this.f15317v = new BE0(0, 0);
        this.f15318w = new BE0(2, 0);
        C4749wL0 c4749wL0 = new C4749wL0();
        this.f15319x = c4749wL0;
        this.f15320y = new MediaCodec.BufferInfo();
        this.f15270E = 1.0f;
        this.f15321z = new ArrayDeque();
        this.f15308q0 = OL0.zza;
        c4749wL0.zzi(0);
        c4749wL0.zzc.order(ByteOrder.nativeOrder());
        this.f15266A = new UK0();
        this.f15275J = -1.0f;
        this.f15279N = 0;
        this.f15296e0 = 0;
        this.f15287V = -1;
        this.f15288W = -1;
        this.f15286U = -9223372036854775807L;
        this.f15302k0 = -9223372036854775807L;
        this.f15303l0 = -9223372036854775807L;
        this.f15310r0 = -9223372036854775807L;
        this.f15297f0 = 0;
        this.f15298g0 = 0;
        this.f15307p0 = new LE0();
    }

    protected static boolean H(Q5 q52) {
        return q52.zzH == 0;
    }

    private final void I() {
        this.f15287V = -1;
        this.f15317v.zzc = null;
    }

    private final void J() {
        this.f15288W = -1;
        this.f15289X = null;
    }

    private final void K(OL0 ol0) {
        this.f15308q0 = ol0;
        if (ol0.zzd != -9223372036854775807L) {
            this.f15312s0 = true;
        }
    }

    private final void L() {
        C3040hL0 c3040hL0 = this.f15316u0;
        c3040hL0.getClass();
        this.f15314t0 = c3040hL0;
        this.f15297f0 = 0;
        this.f15298g0 = 0;
    }

    private final boolean M() {
        if (this.f15299h0) {
            this.f15297f0 = 1;
            if (this.f15281P) {
                this.f15298g0 = 3;
                return false;
            }
            this.f15298g0 = 2;
        } else {
            L();
        }
        return true;
    }

    private final boolean N() throws WE0 {
        AL0 al0 = this.f15271F;
        if (al0 == null || this.f15297f0 == 2 || this.f15304m0) {
            return false;
        }
        if (this.f15287V < 0) {
            int iZza = al0.zza();
            this.f15287V = iZza;
            if (iZza < 0) {
                return false;
            }
            this.f15317v.zzc = al0.zzf(iZza);
            this.f15317v.zzb();
        }
        if (this.f15297f0 == 1) {
            if (!this.f15285T) {
                this.f15300i0 = true;
                al0.zzj(this.f15287V, 0, 0, 0L, 4);
                I();
            }
            this.f15297f0 = 2;
            return false;
        }
        if (this.f15283R) {
            this.f15283R = false;
            ByteBuffer byteBuffer = this.f15317v.zzc;
            byteBuffer.getClass();
            byteBuffer.put(f15265v0);
            al0.zzj(this.f15287V, 0, 38, 0L, 0);
            I();
            this.f15299h0 = true;
            return true;
        }
        if (this.f15296e0 == 1) {
            int i8 = 0;
            while (true) {
                Q5 q52 = this.f15272G;
                q52.getClass();
                if (i8 >= q52.zzp.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f15272G.zzp.get(i8);
                ByteBuffer byteBuffer2 = this.f15317v.zzc;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i8++;
            }
            this.f15296e0 = 2;
        }
        ByteBuffer byteBuffer3 = this.f15317v.zzc;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        ZF0 zf0K = k();
        try {
            int iJ = j(zf0K, this.f15317v, 0);
            if (iJ == -3) {
                if (zzQ()) {
                    this.f15303l0 = this.f15302k0;
                }
                return false;
            }
            if (iJ == -5) {
                if (this.f15296e0 == 2) {
                    this.f15317v.zzb();
                    this.f15296e0 = 1;
                }
                U(zf0K);
                return true;
            }
            BE0 be0 = this.f15317v;
            if (be0.zzf()) {
                this.f15303l0 = this.f15302k0;
                if (this.f15296e0 == 2) {
                    be0.zzb();
                    this.f15296e0 = 1;
                }
                this.f15304m0 = true;
                if (!this.f15299h0) {
                    g0();
                    return false;
                }
                try {
                    if (!this.f15285T) {
                        this.f15300i0 = true;
                        al0.zzj(this.f15287V, 0, 0, 0L, 4);
                        I();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e8) {
                    throw o(e8, this.f15267B, false, AbstractC2281am0.zzj(e8.getErrorCode()));
                }
            }
            if (!this.f15299h0 && !be0.zzg()) {
                be0.zzb();
                if (this.f15296e0 == 2) {
                    this.f15296e0 = 1;
                }
                return true;
            }
            boolean zZzk = be0.zzk();
            if (zZzk) {
                be0.zzb.zzb(iPosition);
            }
            long j8 = this.f15317v.zze;
            if (this.f15306o0) {
                if (this.f15321z.isEmpty()) {
                    C4902xk0 c4902xk0 = this.f15308q0.zze;
                    Q5 q53 = this.f15267B;
                    q53.getClass();
                    c4902xk0.zzd(j8, q53);
                } else {
                    C4902xk0 c4902xk02 = ((OL0) this.f15321z.peekLast()).zze;
                    Q5 q54 = this.f15267B;
                    q54.getClass();
                    c4902xk02.zzd(j8, q54);
                }
                this.f15306o0 = false;
            }
            long jMax = Math.max(this.f15302k0, j8);
            this.f15302k0 = jMax;
            if (zzQ() || this.f15317v.zzh()) {
                this.f15303l0 = jMax;
            }
            this.f15317v.zzj();
            BE0 be02 = this.f15317v;
            if (be02.zze()) {
                b0(be02);
            }
            x(this.f15317v);
            l0(this.f15317v);
            try {
                if (zZzk) {
                    al0.zzk(this.f15287V, 0, this.f15317v.zzb, j8, 0);
                } else {
                    int i9 = this.f15287V;
                    ByteBuffer byteBuffer4 = this.f15317v.zzc;
                    if (byteBuffer4 == null) {
                        throw null;
                    }
                    al0.zzj(i9, 0, byteBuffer4.limit(), j8, 0);
                }
                I();
                this.f15299h0 = true;
                this.f15296e0 = 0;
                this.f15307p0.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e9) {
                throw o(e9, this.f15267B, false, AbstractC2281am0.zzj(e9.getErrorCode()));
            }
        } catch (AE0 e10) {
            c0(e10);
            Q(0);
            Z();
            return true;
        }
    }

    private final boolean O() {
        return this.f15288W >= 0;
    }

    private final boolean P(long j8, long j9) {
        if (j9 >= j8) {
            return false;
        }
        Q5 q52 = this.f15268C;
        if (q52 == null || !Objects.equals(q52.zzn, "audio/opus")) {
            return true;
        }
        return !AbstractC4936y1.zzf(j8, j9);
    }

    private final boolean Q(int i8) {
        BE0 be0 = this.f15315u;
        ZF0 zf0K = k();
        be0.zzb();
        int iJ = j(zf0K, this.f15315u, i8 | 4);
        if (iJ == -5) {
            U(zf0K);
            return true;
        }
        if (iJ != -4 || !this.f15315u.zzf()) {
            return false;
        }
        this.f15304m0 = true;
        g0();
        return false;
    }

    private final boolean R(Q5 q52) {
        if (AbstractC2281am0.zza >= 23 && this.f15271F != null && this.f15298g0 != 3 && zzcU() != 0) {
            float f8 = this.f15270E;
            q52.getClass();
            float fV = v(f8, q52, h());
            float f9 = this.f15275J;
            if (f9 != fV) {
                if (fV == -1.0f) {
                    W();
                    return false;
                }
                if (f9 != -1.0f || fV > this.f15313t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fV);
                    AL0 al0 = this.f15271F;
                    al0.getClass();
                    al0.zzp(bundle);
                    this.f15275J = fV;
                }
            }
        }
        return true;
    }

    private final void V() {
        this.f15294c0 = false;
        this.f15319x.zzb();
        this.f15318w.zzb();
        this.f15293b0 = false;
        this.f15292a0 = false;
        this.f15266A.zzb();
    }

    private final void W() {
        if (this.f15299h0) {
            this.f15297f0 = 1;
            this.f15298g0 = 3;
        } else {
            z();
            r0();
        }
    }

    private final void Z() {
        try {
            AL0 al0 = this.f15271F;
            F10.zzb(al0);
            al0.zzi();
        } finally {
            A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a0(com.google.android.gms.internal.ads.DL0 r18, android.media.MediaCrypto r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PL0.a0(com.google.android.gms.internal.ads.DL0, android.media.MediaCrypto):void");
    }

    private final void g0() {
        int i8 = this.f15298g0;
        if (i8 == 1) {
            Z();
            return;
        }
        if (i8 == 2) {
            Z();
            L();
        } else if (i8 != 3) {
            this.f15305n0 = true;
            i0();
        } else {
            z();
            r0();
        }
    }

    protected void A() {
        I();
        J();
        this.f15286U = -9223372036854775807L;
        this.f15300i0 = false;
        this.f15299h0 = false;
        this.f15283R = false;
        this.f15284S = false;
        this.f15290Y = false;
        this.f15291Z = false;
        this.f15302k0 = -9223372036854775807L;
        this.f15303l0 = -9223372036854775807L;
        this.f15310r0 = -9223372036854775807L;
        this.f15297f0 = 0;
        this.f15298g0 = 0;
        this.f15296e0 = this.f15295d0 ? 1 : 0;
    }

    protected final void B() {
        A();
        this.f15276K = null;
        this.f15278M = null;
        this.f15272G = null;
        this.f15273H = null;
        this.f15274I = false;
        this.f15301j0 = false;
        this.f15275J = -1.0f;
        this.f15279N = 0;
        this.f15280O = false;
        this.f15281P = false;
        this.f15282Q = false;
        this.f15285T = false;
        this.f15295d0 = false;
        this.f15296e0 = 0;
    }

    protected final boolean C() {
        boolean zD = D();
        if (zD) {
            r0();
        }
        return zD;
    }

    protected final boolean D() {
        if (this.f15271F == null) {
            return false;
        }
        int i8 = this.f15298g0;
        if (i8 == 3 || ((this.f15280O && !this.f15301j0) || (this.f15281P && this.f15300i0))) {
            z();
            return true;
        }
        if (i8 == 2) {
            int i9 = AbstractC2281am0.zza;
            F10.zzf(i9 >= 23);
            if (i9 >= 23) {
                try {
                    L();
                } catch (WE0 e8) {
                    AbstractC2834fc0.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e8);
                    z();
                    return true;
                }
            }
        }
        Z();
        return false;
    }

    protected final boolean E() {
        return this.f15292a0;
    }

    protected final boolean F(Q5 q52) {
        return this.f15316u0 == null && k0(q52);
    }

    protected boolean G(DL0 dl0) {
        return true;
    }

    protected abstract int S(RL0 rl0, Q5 q52);

    protected ME0 T(DL0 dl0, Q5 q52, Q5 q53) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.gms.internal.ads.ME0 U(com.google.android.gms.internal.ads.ZF0 r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PL0.U(com.google.android.gms.internal.ads.ZF0):com.google.android.gms.internal.ads.ME0");
    }

    protected abstract C4977yL0 X(DL0 dl0, Q5 q52, MediaCrypto mediaCrypto, float f8);

    protected abstract List Y(RL0 rl0, Q5 q52, boolean z8);

    protected void b0(BE0 be0) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected void c() {
        try {
            V();
            z();
        } finally {
            this.f15316u0 = null;
        }
    }

    protected void c0(Exception exc) {
        throw null;
    }

    protected void d0(String str, C4977yL0 c4977yL0, long j8, long j9) {
        throw null;
    }

    protected void e0(String str) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.KE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void f(com.google.android.gms.internal.ads.Q5[] r13, long r14, long r16, com.google.android.gms.internal.ads.NM0 r18) {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.OL0 r1 = r0.f15308q0
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.OL0 r1 = new com.google.android.gms.internal.ads.OL0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.K(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.f15321z
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.f15302k0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.f15310r0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.OL0 r1 = new com.google.android.gms.internal.ads.OL0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.K(r1)
            com.google.android.gms.internal.ads.OL0 r1 = r0.f15308q0
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.h0()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.f15321z
            com.google.android.gms.internal.ads.OL0 r9 = new com.google.android.gms.internal.ads.OL0
            long r3 = r0.f15302k0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PL0.f(com.google.android.gms.internal.ads.Q5[], long, long, com.google.android.gms.internal.ads.NM0):void");
    }

    protected void f0(Q5 q52, MediaFormat mediaFormat) {
        throw null;
    }

    protected void h0() {
    }

    protected void i0() {
    }

    protected abstract boolean j0(long j8, long j9, AL0 al0, ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z8, boolean z9, Q5 q52);

    protected boolean k0(Q5 q52) {
        return false;
    }

    protected int l0(BE0 be0) {
        return 0;
    }

    protected final long m0() {
        return this.f15308q0.zzd;
    }

    protected final long n0() {
        return this.f15308q0.zzc;
    }

    protected final AL0 o0() {
        return this.f15271F;
    }

    protected CL0 p0(Throwable th, DL0 dl0) {
        return new CL0(th, dl0);
    }

    protected final DL0 q0() {
        return this.f15278M;
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected void r() {
        this.f15267B = null;
        K(OL0.zza);
        this.f15321z.clear();
        D();
    }

    protected final void r0() {
        Q5 q52;
        if (this.f15271F != null || this.f15292a0 || (q52 = this.f15267B) == null) {
            return;
        }
        if (F(q52)) {
            V();
            String str = q52.zzn;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f15319x.zzn(32);
            } else {
                this.f15319x.zzn(1);
            }
            this.f15292a0 = true;
            return;
        }
        C3040hL0 c3040hL0 = this.f15316u0;
        this.f15314t0 = c3040hL0;
        if (c3040hL0 != null) {
            F10.zzf(true);
            C3040hL0 c3040hL02 = this.f15314t0;
            boolean z8 = AbstractC3155iL0.zza;
            c3040hL02.zza();
        }
        try {
            if (this.f15314t0 != null) {
                F10.zzb(q52.zzn);
            }
            Q5 q53 = this.f15267B;
            if (q53 == null) {
                throw null;
            }
            if (this.f15276K == null) {
                try {
                    List listY = Y(this.f15311s, q53, false);
                    listY.isEmpty();
                    this.f15276K = new ArrayDeque();
                    if (!listY.isEmpty()) {
                        this.f15276K.add((DL0) listY.get(0));
                    }
                    this.f15277L = null;
                } catch (YL0 e8) {
                    throw new NL0(q53, (Throwable) e8, false, -49998);
                }
            }
            if (this.f15276K.isEmpty()) {
                throw new NL0(q53, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.f15276K;
            if (arrayDeque == null) {
                throw null;
            }
            DL0 dl0 = (DL0) arrayDeque.peekFirst();
            while (this.f15271F == null) {
                DL0 dl02 = (DL0) arrayDeque.peekFirst();
                if (dl02 == null) {
                    throw null;
                }
                if (!G(dl02)) {
                    return;
                }
                try {
                    a0(dl02, null);
                } catch (Exception e9) {
                    if (dl02 != dl0) {
                        throw e9;
                    }
                    try {
                        AbstractC2834fc0.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        a0(dl02, null);
                    } catch (Exception e10) {
                        AbstractC2834fc0.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(dl02.zza), e10);
                        arrayDeque.removeFirst();
                        NL0 nl0 = new NL0(q53, (Throwable) e10, false, dl02);
                        c0(nl0);
                        NL0 nl02 = this.f15277L;
                        if (nl02 == null) {
                            this.f15277L = nl0;
                        } else {
                            this.f15277L = NL0.a(nl02, nl0);
                        }
                        if (arrayDeque.isEmpty()) {
                            throw this.f15277L;
                        }
                    }
                }
            }
            this.f15276K = null;
        } catch (NL0 e11) {
            throw o(e11, q52, false, 4001);
        }
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected void s(boolean z8, boolean z9) {
        this.f15307p0 = new LE0();
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected void u(long j8, boolean z8) {
        this.f15304m0 = false;
        this.f15305n0 = false;
        if (this.f15292a0) {
            this.f15319x.zzb();
            this.f15318w.zzb();
            this.f15293b0 = false;
            this.f15266A.zzb();
        } else {
            C();
        }
        C4902xk0 c4902xk0 = this.f15308q0.zze;
        if (c4902xk0.zza() > 0) {
            this.f15306o0 = true;
        }
        c4902xk0.zze();
        this.f15321z.clear();
    }

    protected float v(float f8, Q5 q52, Q5[] q5Arr) {
        throw null;
    }

    protected void w(long j8) {
        this.f15310r0 = j8;
        while (!this.f15321z.isEmpty() && j8 >= ((OL0) this.f15321z.peek()).zzb) {
            OL0 ol0 = (OL0) this.f15321z.poll();
            ol0.getClass();
            K(ol0);
            h0();
        }
    }

    protected void x(BE0 be0) {
    }

    protected void y(Q5 q52) {
    }

    protected final void z() {
        try {
            AL0 al0 = this.f15271F;
            if (al0 != null) {
                al0.zzl();
                this.f15307p0.zzb++;
                DL0 dl0 = this.f15278M;
                if (dl0 == null) {
                    throw null;
                }
                e0(dl0.zza);
            }
            this.f15271F = null;
            this.f15269D = null;
            this.f15314t0 = null;
            B();
        } catch (Throwable th) {
            this.f15271F = null;
            this.f15269D = null;
            this.f15314t0 = null;
            B();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public void zzM(float f8, float f9) {
        this.f15270E = f9;
        R(this.f15272G);
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.GG0
    public abstract /* synthetic */ String zzU();

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public void zzV(long r23, long r25) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PL0.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public boolean zzW() {
        return this.f15305n0;
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public boolean zzX() {
        if (this.f15267B == null) {
            return false;
        }
        if (g() || O()) {
            return true;
        }
        if (this.f15286U == -9223372036854775807L) {
            return false;
        }
        n();
        return SystemClock.elapsedRealtime() < this.f15286U;
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.GG0
    public final int zzY(Q5 q52) throws WE0 {
        try {
            return S(this.f15311s, q52);
        } catch (YL0 e8) {
            throw o(e8, q52, false, 4002);
        }
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.GG0
    public final int zze() {
        return 8;
    }
}
