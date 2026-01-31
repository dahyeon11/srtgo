package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import m7.AbstractC5916c;

/* loaded from: classes2.dex */
public final class MK0 implements ZJ0 {

    /* renamed from: c0 */
    private static final Object f14571c0 = new Object();

    /* renamed from: d0 */
    private static ExecutorService f14572d0;

    /* renamed from: e0 */
    private static int f14573e0;

    /* renamed from: A */
    private long f14574A;

    /* renamed from: B */
    private long f14575B;

    /* renamed from: C */
    private long f14576C;

    /* renamed from: D */
    private long f14577D;

    /* renamed from: E */
    private int f14578E;

    /* renamed from: F */
    private boolean f14579F;

    /* renamed from: G */
    private boolean f14580G;

    /* renamed from: H */
    private long f14581H;

    /* renamed from: I */
    private float f14582I;

    /* renamed from: J */
    private ByteBuffer f14583J;

    /* renamed from: K */
    private int f14584K;

    /* renamed from: L */
    private ByteBuffer f14585L;

    /* renamed from: M */
    private boolean f14586M;

    /* renamed from: N */
    private boolean f14587N;

    /* renamed from: O */
    private boolean f14588O;

    /* renamed from: P */
    private boolean f14589P;

    /* renamed from: Q */
    private int f14590Q;

    /* renamed from: R */
    private RF0 f14591R;

    /* renamed from: S */
    private AJ0 f14592S;

    /* renamed from: T */
    private long f14593T;

    /* renamed from: U */
    private boolean f14594U;

    /* renamed from: V */
    private boolean f14595V;

    /* renamed from: W */
    private Looper f14596W;

    /* renamed from: X */
    private long f14597X;

    /* renamed from: Y */
    private long f14598Y;

    /* renamed from: Z */
    private Handler f14599Z;

    /* renamed from: a */
    private final Context f14600a;

    /* renamed from: a0 */
    private final C4861xK0 f14601a0;

    /* renamed from: b */
    private final C2808fK0 f14602b;

    /* renamed from: b0 */
    private final C3380kK0 f14603b0;

    /* renamed from: c */
    private final XK0 f14604c;

    /* renamed from: d */
    private final AbstractC2394bl0 f14605d;

    /* renamed from: e */
    private final AbstractC2394bl0 f14606e;

    /* renamed from: f */
    private final K30 f14607f;

    /* renamed from: g */
    private final C2579dK0 f14608g;

    /* renamed from: h */
    private final ArrayDeque f14609h;

    /* renamed from: i */
    private JK0 f14610i;

    /* renamed from: j */
    private final CK0 f14611j;

    /* renamed from: k */
    private final CK0 f14612k;

    /* renamed from: l */
    private final InterfaceC4405tK0 f14613l;

    /* renamed from: m */
    private C2577dJ0 f14614m;

    /* renamed from: n */
    private WJ0 f14615n;

    /* renamed from: o */
    private C4747wK0 f14616o;

    /* renamed from: p */
    private C4747wK0 f14617p;

    /* renamed from: q */
    private C3277jR f14618q;

    /* renamed from: r */
    private AudioTrack f14619r;

    /* renamed from: s */
    private C4289sJ0 f14620s;

    /* renamed from: t */
    private C5087zJ0 f14621t;

    /* renamed from: u */
    private BK0 f14622u;

    /* renamed from: v */
    private C3940pF0 f14623v;

    /* renamed from: w */
    private C5089zK0 f14624w;

    /* renamed from: x */
    private C5089zK0 f14625x;

    /* renamed from: y */
    private C2149Yx f14626y;

    /* renamed from: z */
    private boolean f14627z;

    /* synthetic */ MK0(C4519uK0 c4519uK0, KK0 kk0) {
        C4289sJ0 c4289sJ0B;
        Context context = c4519uK0.f23020a;
        this.f14600a = context;
        C3940pF0 c3940pF0 = C3940pF0.zza;
        this.f14623v = c3940pF0;
        if (context != null) {
            C4289sJ0 c4289sJ0 = C4289sJ0.zza;
            int i8 = AbstractC2281am0.zza;
            c4289sJ0B = C4289sJ0.b(context, c3940pF0, null);
        } else {
            c4289sJ0B = c4519uK0.f23021b;
        }
        this.f14620s = c4289sJ0B;
        this.f14601a0 = c4519uK0.f23024e;
        int i9 = AbstractC2281am0.zza;
        this.f14613l = c4519uK0.f23023d;
        C3380kK0 c3380kK0 = c4519uK0.f23025f;
        c3380kK0.getClass();
        this.f14603b0 = c3380kK0;
        K30 k30 = new K30(InterfaceC3002h20.zza);
        this.f14607f = k30;
        k30.zze();
        this.f14608g = new C2579dK0(new EK0(this, null));
        C2808fK0 c2808fK0 = new C2808fK0();
        this.f14602b = c2808fK0;
        XK0 xk0 = new XK0();
        this.f14604c = xk0;
        this.f14605d = AbstractC2394bl0.zzp(new SU(), c2808fK0, xk0);
        this.f14606e = AbstractC2394bl0.zzn(new WK0());
        this.f14582I = 1.0f;
        this.f14590Q = 0;
        this.f14591R = new RF0(0, 0.0f);
        C2149Yx c2149Yx = C2149Yx.zza;
        this.f14625x = new C5089zK0(c2149Yx, 0L, 0L, null);
        this.f14626y = c2149Yx;
        this.f14627z = false;
        this.f14609h = new ArrayDeque();
        this.f14611j = new CK0(100L);
        this.f14612k = new CK0(100L);
    }

    static /* synthetic */ void g(AudioTrack audioTrack, final WJ0 wj0, Handler handler, final TJ0 tj0, K30 k30) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (wj0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mK0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((SK0) wj0).f16244a.f16452x0.zzd(tj0);
                    }
                });
            }
            k30.zze();
            synchronized (f14571c0) {
                try {
                    int i8 = f14573e0 - 1;
                    f14573e0 = i8;
                    if (i8 == 0) {
                        f14572d0.shutdown();
                        f14572d0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (wj0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mK0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((SK0) wj0).f16244a.f16452x0.zzd(tj0);
                    }
                });
            }
            k30.zze();
            synchronized (f14571c0) {
                try {
                    int i9 = f14573e0 - 1;
                    f14573e0 = i9;
                    if (i9 == 0) {
                        f14572d0.shutdown();
                        f14572d0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final long i() {
        return this.f14617p.zzc == 0 ? this.f14574A / r0.zzb : this.f14575B;
    }

    public final long j() {
        C4747wK0 c4747wK0 = this.f14617p;
        if (c4747wK0.zzc != 0) {
            return this.f14577D;
        }
        long j8 = this.f14576C;
        long j9 = c4747wK0.zzd;
        int i8 = AbstractC2281am0.zza;
        return ((j8 + j9) - 1) / j9;
    }

    private final AudioTrack k(C4747wK0 c4747wK0) throws VJ0 {
        try {
            return c4747wK0.zza(this.f14623v, this.f14590Q);
        } catch (VJ0 e8) {
            WJ0 wj0 = this.f14615n;
            if (wj0 != null) {
                wj0.zza(e8);
            }
            throw e8;
        }
    }

    private final void l(long j8) {
        C2149Yx c2149Yx;
        boolean z8;
        if (x()) {
            C4861xK0 c4861xK0 = this.f14601a0;
            c2149Yx = this.f14626y;
            c4861xK0.zzc(c2149Yx);
        } else {
            c2149Yx = C2149Yx.zza;
        }
        C2149Yx c2149Yx2 = c2149Yx;
        this.f14626y = c2149Yx2;
        if (x()) {
            C4861xK0 c4861xK02 = this.f14601a0;
            z8 = this.f14627z;
            c4861xK02.zzd(z8);
        } else {
            z8 = false;
        }
        this.f14627z = z8;
        this.f14609h.add(new C5089zK0(c2149Yx2, Math.max(0L, j8), AbstractC2281am0.zzs(j(), this.f14617p.zze), null));
        s();
        WJ0 wj0 = this.f14615n;
        if (wj0 != null) {
            ((SK0) wj0).f16244a.f16452x0.zzw(this.f14627z);
        }
    }

    private final void m() {
        if (this.f14617p.zzc()) {
            this.f14594U = true;
        }
    }

    private final void n() {
        if (this.f14621t != null || this.f14600a == null) {
            return;
        }
        this.f14596W = Looper.myLooper();
        C5087zJ0 c5087zJ0 = new C5087zJ0(this.f14600a, new C3836oK0(this), this.f14623v, this.f14592S);
        this.f14621t = c5087zJ0;
        this.f14620s = c5087zJ0.zzc();
    }

    private final void o() throws IllegalStateException {
        if (this.f14587N) {
            return;
        }
        this.f14587N = true;
        this.f14608g.zzb(j());
        this.f14619r.stop();
    }

    private final void p(long j8) throws YJ0 {
        ByteBuffer byteBufferZzb;
        if (!this.f14618q.zzh()) {
            ByteBuffer byteBuffer = this.f14583J;
            if (byteBuffer == null) {
                byteBuffer = NS.zza;
            }
            t(byteBuffer, j8);
            return;
        }
        while (!this.f14618q.zzg()) {
            do {
                byteBufferZzb = this.f14618q.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    t(byteBufferZzb, j8);
                } else {
                    ByteBuffer byteBuffer2 = this.f14583J;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f14618q.zze(this.f14583J);
                    }
                }
            } while (!byteBufferZzb.hasRemaining());
            return;
        }
    }

    private final void q(C2149Yx c2149Yx) {
        long j8 = -9223372036854775807L;
        C5089zK0 c5089zK0 = new C5089zK0(c2149Yx, j8, j8, null);
        if (v()) {
            this.f14624w = c5089zK0;
        } else {
            this.f14625x = c5089zK0;
        }
    }

    private final void r() {
        if (v()) {
            int i8 = AbstractC2281am0.zza;
            this.f14619r.setVolume(this.f14582I);
        }
    }

    private final void s() {
        C3277jR c3277jR = this.f14617p.zzi;
        this.f14618q = c3277jR;
        c3277jR.zzc();
    }

    private final void t(ByteBuffer byteBuffer, long j8) throws YJ0 {
        WJ0 wj0;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f14585L;
            if (byteBuffer2 != null) {
                F10.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.f14585L = byteBuffer;
                int i8 = AbstractC2281am0.zza;
            }
            int iRemaining = byteBuffer.remaining();
            int i9 = AbstractC2281am0.zza;
            int iWrite = this.f14619r.write(byteBuffer, iRemaining, 1);
            this.f14593T = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if ((AbstractC2281am0.zza >= 24 && iWrite == -6) || iWrite == -32) {
                    if (j() > 0) {
                        z = true;
                    } else if (w(this.f14619r)) {
                        m();
                        z = true;
                    }
                }
                YJ0 yj0 = new YJ0(iWrite, this.f14617p.zza, z);
                WJ0 wj02 = this.f14615n;
                if (wj02 != null) {
                    wj02.zza(yj0);
                }
                if (yj0.zzb) {
                    this.f14620s = C4289sJ0.zza;
                    throw yj0;
                }
                this.f14612k.zzb(yj0);
                return;
            }
            this.f14612k.zza();
            if (w(this.f14619r)) {
                if (this.f14577D > 0) {
                    this.f14595V = false;
                }
                if (this.f14589P && (wj0 = this.f14615n) != null && iWrite < iRemaining) {
                    TK0 tk0 = ((SK0) wj0).f16244a;
                    if (tk0.f16449H0 != null) {
                        tk0.f16449H0.zza();
                    }
                }
            }
            int i10 = this.f14617p.zzc;
            if (i10 == 0) {
                this.f14576C += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i10 != 0) {
                    F10.zzf(byteBuffer == this.f14583J);
                    this.f14577D += this.f14578E * this.f14584K;
                }
                this.f14585L = null;
            }
        }
    }

    private final boolean u() throws YJ0 {
        if (!this.f14618q.zzh()) {
            ByteBuffer byteBuffer = this.f14585L;
            if (byteBuffer == null) {
                return true;
            }
            t(byteBuffer, Long.MIN_VALUE);
            return this.f14585L == null;
        }
        this.f14618q.zzd();
        p(Long.MIN_VALUE);
        if (!this.f14618q.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f14585L;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean v() {
        return this.f14619r != null;
    }

    private static boolean w(AudioTrack audioTrack) {
        return AbstractC2281am0.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean x() {
        C4747wK0 c4747wK0 = this.f14617p;
        if (c4747wK0.zzc != 0) {
            return false;
        }
        int i8 = c4747wK0.zza.zzC;
        return true;
    }

    public static /* synthetic */ void zzG(MK0 mk0) {
        if (mk0.f14598Y >= H0.q.MIN_PERIODIC_FLEX_MILLIS) {
            ((SK0) mk0.f14615n).f16244a.f16450I0 = true;
            mk0.f14598Y = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final boolean zzA(Q5 q52) {
        return zza(q52) != 0;
    }

    public final void zzJ(C4289sJ0 c4289sJ0) {
        F10.zzf(this.f14596W == Looper.myLooper());
        if (c4289sJ0.equals(this.f14620s)) {
            return;
        }
        this.f14620s = c4289sJ0;
        WJ0 wj0 = this.f14615n;
        if (wj0 != null) {
            ((SK0) wj0).f16244a.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final int zza(Q5 q52) {
        n();
        if (!"audio/raw".equals(q52.zzn)) {
            return this.f14620s.zzb(q52, this.f14623v) != null ? 2 : 0;
        }
        if (AbstractC2281am0.zzK(q52.zzC)) {
            return q52.zzC != 2 ? 1 : 2;
        }
        AbstractC2834fc0.zzf("DefaultAudioSink", "Invalid PCM encoding: " + q52.zzC);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final long zzb(boolean z8) {
        long jZzp;
        if (!v() || this.f14580G) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f14608g.zza(z8), AbstractC2281am0.zzs(j(), this.f14617p.zze));
        while (!this.f14609h.isEmpty() && jMin >= ((C5089zK0) this.f14609h.getFirst()).zzc) {
            this.f14625x = (C5089zK0) this.f14609h.remove();
        }
        C5089zK0 c5089zK0 = this.f14625x;
        long j8 = jMin - c5089zK0.zzc;
        if (c5089zK0.zza.equals(C2149Yx.zza)) {
            jZzp = this.f14625x.zzb + j8;
        } else if (this.f14609h.isEmpty()) {
            jZzp = this.f14601a0.zza(j8) + this.f14625x.zzb;
        } else {
            C5089zK0 c5089zK02 = (C5089zK0) this.f14609h.getFirst();
            jZzp = c5089zK02.zzb - AbstractC2281am0.zzp(c5089zK02.zzc - jMin, this.f14625x.zza.zzc);
        }
        long jZzb = this.f14601a0.zzb();
        long jZzs = jZzp + AbstractC2281am0.zzs(jZzb, this.f14617p.zze);
        long j9 = this.f14597X;
        if (jZzb > j9) {
            long jZzs2 = AbstractC2281am0.zzs(jZzb - j9, this.f14617p.zze);
            this.f14597X = jZzb;
            this.f14598Y += jZzs2;
            if (this.f14599Z == null) {
                this.f14599Z = new Handler(Looper.myLooper());
            }
            this.f14599Z.removeCallbacksAndMessages(null);
            this.f14599Z.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.nK0
                @Override // java.lang.Runnable
                public final void run() {
                    MK0.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzs;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final C2149Yx zzc() {
        return this.f14626y;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final EJ0 zzd(Q5 q52) {
        return this.f14594U ? EJ0.zza : this.f14603b0.zza(q52, this.f14623v);
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zze(Q5 q52, int i8, int[] iArr) throws UJ0 {
        int iIntValue;
        C3277jR c3277jR;
        int iZzm;
        int iIntValue2;
        int iZzm2;
        int i9;
        int i10;
        int i11;
        int iMax;
        n();
        if ("audio/raw".equals(q52.zzn)) {
            F10.zzd(AbstractC2281am0.zzK(q52.zzC));
            iZzm = AbstractC2281am0.zzm(q52.zzC, q52.zzA);
            C2091Xk0 c2091Xk0 = new C2091Xk0();
            c2091Xk0.zzh(this.f14605d);
            c2091Xk0.zzg(this.f14601a0.zze());
            C3277jR c3277jR2 = new C3277jR(c2091Xk0.zzi());
            if (c3277jR2.equals(this.f14618q)) {
                c3277jR2 = this.f14618q;
            }
            this.f14604c.zzq(q52.zzD, q52.zzE);
            this.f14602b.zzo(iArr);
            try {
                KR krZza = c3277jR2.zza(new KR(q52.zzB, q52.zzA, q52.zzC));
                iIntValue = krZza.zzd;
                i9 = krZza.zzb;
                int i12 = krZza.zzc;
                iIntValue2 = AbstractC2281am0.zzh(i12);
                c3277jR = c3277jR2;
                iZzm2 = AbstractC2281am0.zzm(iIntValue, i12);
                i10 = 0;
            } catch (C3620mS e8) {
                throw new UJ0(e8, q52);
            }
        } else {
            C3277jR c3277jR3 = new C3277jR(AbstractC2394bl0.zzm());
            int i13 = q52.zzB;
            EJ0 ej0 = EJ0.zza;
            Pair pairZzb = this.f14620s.zzb(q52, this.f14623v);
            if (pairZzb == null) {
                throw new UJ0("Unable to configure passthrough for: ".concat(String.valueOf(q52)), q52);
            }
            iIntValue = ((Integer) pairZzb.first).intValue();
            c3277jR = c3277jR3;
            iZzm = -1;
            iIntValue2 = ((Integer) pairZzb.second).intValue();
            iZzm2 = -1;
            i9 = i13;
            i10 = 2;
        }
        if (iIntValue == 0) {
            throw new UJ0("Invalid output encoding (mode=" + i10 + ") for: " + String.valueOf(q52), q52);
        }
        if (iIntValue2 == 0) {
            throw new UJ0("Invalid output channel config (mode=" + i10 + ") for: " + String.valueOf(q52), q52);
        }
        int i14 = q52.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(q52.zzn) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i9, iIntValue2, iIntValue);
        F10.zzf(minBufferSize != -2);
        int i15 = iZzm2 != -1 ? iZzm2 : 1;
        int i16 = 250000;
        if (i10 == 0) {
            i11 = i10;
            iMax = Math.max(PK0.a(250000, i9, i15), Math.min(minBufferSize * 4, PK0.a(750000, i9, i15)));
        } else if (i10 != 1) {
            if (iIntValue == 5) {
                i16 = 500000;
            } else if (iIntValue == 8) {
                i16 = AbstractC5916c.NANOS_IN_MILLIS;
                iIntValue = 8;
            }
            i11 = i10;
            iMax = AbstractC1235Cm0.zzb((i16 * (i14 != -1 ? AbstractC4450tm0.zza(i14, 8, RoundingMode.CEILING) : PK0.b(iIntValue))) / 1000000);
        } else {
            i11 = i10;
            iMax = AbstractC1235Cm0.zzb((PK0.b(iIntValue) * 50000000) / 1000000);
        }
        int i17 = iIntValue;
        this.f14594U = false;
        C4747wK0 c4747wK0 = new C4747wK0(q52, iZzm, i11, iZzm2, i9, iIntValue2, i17, (((Math.max(minBufferSize, iMax) + i15) - 1) / i15) * i15, c3277jR, false, false, false);
        if (v()) {
            this.f14616o = c4747wK0;
        } else {
            this.f14617p = c4747wK0;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzf() throws IllegalStateException {
        BK0 bk0;
        if (v()) {
            this.f14574A = 0L;
            this.f14575B = 0L;
            this.f14576C = 0L;
            this.f14577D = 0L;
            this.f14595V = false;
            this.f14578E = 0;
            this.f14625x = new C5089zK0(this.f14626y, 0L, 0L, null);
            this.f14581H = 0L;
            this.f14624w = null;
            this.f14609h.clear();
            this.f14583J = null;
            this.f14584K = 0;
            this.f14585L = null;
            this.f14587N = false;
            this.f14586M = false;
            this.f14588O = false;
            this.f14604c.zzp();
            s();
            if (this.f14608g.zzh()) {
                this.f14619r.pause();
            }
            if (w(this.f14619r)) {
                JK0 jk0 = this.f14610i;
                jk0.getClass();
                jk0.zzb(this.f14619r);
            }
            int i8 = AbstractC2281am0.zza;
            final TJ0 tj0Zzb = this.f14617p.zzb();
            C4747wK0 c4747wK0 = this.f14616o;
            if (c4747wK0 != null) {
                this.f14617p = c4747wK0;
                this.f14616o = null;
            }
            this.f14608g.zzc();
            if (AbstractC2281am0.zza >= 24 && (bk0 = this.f14622u) != null) {
                bk0.zzb();
                this.f14622u = null;
            }
            final AudioTrack audioTrack = this.f14619r;
            final K30 k30 = this.f14607f;
            final WJ0 wj0 = this.f14615n;
            k30.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f14571c0) {
                try {
                    if (f14572d0 == null) {
                        f14572d0 = AbstractC2281am0.zzE("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f14573e0++;
                    f14572d0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lK0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MK0.g(audioTrack, wj0, handler, tj0Zzb, k30);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f14619r = null;
        }
        this.f14612k.zza();
        this.f14611j.zza();
        this.f14597X = 0L;
        this.f14598Y = 0L;
        Handler handler2 = this.f14599Z;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzg() {
        this.f14579F = true;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzh() throws IllegalStateException {
        this.f14589P = false;
        if (v()) {
            if (this.f14608g.zzk() || w(this.f14619r)) {
                this.f14619r.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzi() throws IllegalStateException {
        this.f14589P = true;
        if (v()) {
            this.f14608g.zzf();
            this.f14619r.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzj() throws IllegalStateException {
        if (!this.f14586M && v() && u()) {
            o();
            this.f14586M = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzk() {
        C5087zJ0 c5087zJ0 = this.f14621t;
        if (c5087zJ0 != null) {
            c5087zJ0.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzl() throws IllegalStateException {
        zzf();
        AbstractC2394bl0 abstractC2394bl0 = this.f14605d;
        int size = abstractC2394bl0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((NS) abstractC2394bl0.get(i8)).zzf();
        }
        AbstractC2394bl0 abstractC2394bl02 = this.f14606e;
        int size2 = abstractC2394bl02.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((NS) abstractC2394bl02.get(i9)).zzf();
        }
        C3277jR c3277jR = this.f14618q;
        if (c3277jR != null) {
            c3277jR.zzf();
        }
        this.f14589P = false;
        this.f14594U = false;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzm(C3940pF0 c3940pF0) throws IllegalStateException {
        if (this.f14623v.equals(c3940pF0)) {
            return;
        }
        this.f14623v = c3940pF0;
        C5087zJ0 c5087zJ0 = this.f14621t;
        if (c5087zJ0 != null) {
            c5087zJ0.zzg(c3940pF0);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzn(int i8) throws IllegalStateException {
        if (this.f14590Q != i8) {
            this.f14590Q = i8;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzo(RF0 rf0) {
        if (this.f14591R.equals(rf0)) {
            return;
        }
        if (this.f14619r != null) {
            int i8 = this.f14591R.zza;
        }
        this.f14591R = rf0;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzp(InterfaceC3002h20 interfaceC3002h20) {
        this.f14608g.zze(interfaceC3002h20);
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzq(WJ0 wj0) {
        this.f14615n = wj0;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzr(int i8, int i9) {
        AudioTrack audioTrack = this.f14619r;
        if (audioTrack != null) {
            w(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzs(C2149Yx c2149Yx) {
        this.f14626y = new C2149Yx(Math.max(0.1f, Math.min(c2149Yx.zzc, 8.0f)), Math.max(0.1f, Math.min(c2149Yx.zzd, 8.0f)));
        q(c2149Yx);
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzt(C2577dJ0 c2577dJ0) {
        this.f14614m = c2577dJ0;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.f14592S = audioDeviceInfo == null ? null : new AJ0(audioDeviceInfo);
        C5087zJ0 c5087zJ0 = this.f14621t;
        if (c5087zJ0 != null) {
            c5087zJ0.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f14619r;
        if (audioTrack != null) {
            AbstractC3950pK0.zza(audioTrack, this.f14592S);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzv(boolean z8) {
        this.f14627z = z8;
        q(this.f14626y);
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final void zzw(float f8) {
        if (this.f14582I != f8) {
            this.f14582I = f8;
            r();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x02ef A[RETURN] */
    @Override // com.google.android.gms.internal.ads.ZJ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzx(java.nio.ByteBuffer r28, long r29, int r31) throws java.lang.IllegalStateException, com.google.android.gms.internal.ads.VJ0, com.google.android.gms.internal.ads.YJ0 {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MK0.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final boolean zzy() {
        if (v()) {
            return !(AbstractC2281am0.zza >= 29 && this.f14619r.isOffloadedPlayback() && this.f14588O) && this.f14608g.zzg(j());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ZJ0
    public final boolean zzz() {
        if (v()) {
            return this.f14586M && !zzy();
        }
        return true;
    }
}
