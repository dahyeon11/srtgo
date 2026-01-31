package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class NF0 extends AbstractC4056qG0 implements InterfaceC2913gF0 {
    public static final /* synthetic */ int zzd = 0;

    /* renamed from: A */
    private final long f14815A;

    /* renamed from: B */
    private int f14816B;

    /* renamed from: C */
    private int f14817C;

    /* renamed from: D */
    private boolean f14818D;

    /* renamed from: E */
    private int f14819E;

    /* renamed from: F */
    private IG0 f14820F;

    /* renamed from: G */
    private C2558dA f14821G;

    /* renamed from: H */
    private C3550ls f14822H;

    /* renamed from: I */
    private C3550ls f14823I;

    /* renamed from: J */
    private Q5 f14824J;

    /* renamed from: K */
    private Q5 f14825K;

    /* renamed from: L */
    private Object f14826L;

    /* renamed from: M */
    private Surface f14827M;

    /* renamed from: N */
    private int f14828N;

    /* renamed from: O */
    private C1839Rh0 f14829O;

    /* renamed from: P */
    private LE0 f14830P;

    /* renamed from: Q */
    private LE0 f14831Q;

    /* renamed from: R */
    private int f14832R;

    /* renamed from: S */
    private C3940pF0 f14833S;

    /* renamed from: T */
    private float f14834T;

    /* renamed from: U */
    private boolean f14835U;

    /* renamed from: V */
    private C5107zY f14836V;

    /* renamed from: W */
    private boolean f14837W;

    /* renamed from: X */
    private boolean f14838X;

    /* renamed from: Y */
    private C2308b f14839Y;

    /* renamed from: Z */
    private IQ f14840Z;

    /* renamed from: a0 */
    private C3550ls f14841a0;

    /* renamed from: b */
    final WO0 f14842b;

    /* renamed from: b0 */
    private C4853xG0 f14843b0;

    /* renamed from: c */
    final C2558dA f14844c;

    /* renamed from: c0 */
    private int f14845c0;

    /* renamed from: d */
    private final K30 f14846d;

    /* renamed from: d0 */
    private long f14847d0;

    /* renamed from: e */
    private final Context f14848e;

    /* renamed from: e0 */
    private final C3028hF0 f14849e0;

    /* renamed from: f */
    private final InterfaceC3021hC f14850f;

    /* renamed from: f0 */
    private JN0 f14851f0;

    /* renamed from: g */
    private final EG0[] f14852g;

    /* renamed from: h */
    private final VO0 f14853h;

    /* renamed from: i */
    private final InterfaceC4721w70 f14854i;

    /* renamed from: j */
    private final XF0 f14855j;

    /* renamed from: k */
    private final C1211Ca0 f14856k;

    /* renamed from: l */
    private final CopyOnWriteArraySet f14857l;

    /* renamed from: m */
    private final C3711nF f14858m;

    /* renamed from: n */
    private final List f14859n;

    /* renamed from: o */
    private final boolean f14860o;

    /* renamed from: p */
    private final MM0 f14861p;

    /* renamed from: q */
    private final OG0 f14862q;

    /* renamed from: r */
    private final Looper f14863r;

    /* renamed from: s */
    private final InterfaceC2589dP0 f14864s;

    /* renamed from: t */
    private final InterfaceC3002h20 f14865t;

    /* renamed from: u */
    private final JF0 f14866u;

    /* renamed from: v */
    private final LF0 f14867v;

    /* renamed from: w */
    private final FE0 f14868w;

    /* renamed from: x */
    private final JE0 f14869x;

    /* renamed from: y */
    private final MG0 f14870y;

    /* renamed from: z */
    private final NG0 f14871z;

    static {
        AbstractC1609Lp.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.cP0, java.lang.Object] */
    public NF0(C2798fF0 c2798fF0, InterfaceC3021hC interfaceC3021hC) {
        K30 k30 = new K30(InterfaceC3002h20.zza);
        this.f14846d = k30;
        try {
            AbstractC2834fc0.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha01] [" + AbstractC2281am0.zze + "]");
            Context applicationContext = c2798fF0.f19143a.getApplicationContext();
            this.f14848e = applicationContext;
            ?? Apply = c2798fF0.f19150h.apply(c2798fF0.f19144b);
            this.f14862q = Apply;
            this.f14833S = c2798fF0.f19152j;
            this.f14828N = c2798fF0.f19153k;
            this.f14835U = false;
            this.f14815A = c2798fF0.f19157o;
            JF0 jf0 = new JF0(this, null);
            this.f14866u = jf0;
            LF0 lf0 = new LF0(null);
            this.f14867v = lf0;
            Handler handler = new Handler(c2798fF0.f19151i);
            EG0[] eg0ArrZza = ((YE0) c2798fF0.f19145c).zza.zza(handler, jf0, jf0, jf0, jf0);
            this.f14852g = eg0ArrZza;
            int length = eg0ArrZza.length;
            VO0 vo0 = (VO0) c2798fF0.f19147e.zza();
            this.f14853h = vo0;
            this.f14861p = C2798fF0.a(((ZE0) c2798fF0.f19146d).zza);
            C3048hP0 c3048hP0Zzg = C3048hP0.zzg(((C2454cF0) c2798fF0.f19149g).zza);
            this.f14864s = c3048hP0Zzg;
            this.f14860o = c2798fF0.f19154l;
            this.f14820F = c2798fF0.f19155m;
            Looper looper = c2798fF0.f19151i;
            this.f14863r = looper;
            InterfaceC3002h20 interfaceC3002h20 = c2798fF0.f19144b;
            this.f14865t = interfaceC3002h20;
            this.f14850f = interfaceC3021hC;
            C1211Ca0 c1211Ca0 = new C1211Ca0(looper, interfaceC3002h20, new A90() { // from class: com.google.android.gms.internal.ads.CF0
                @Override // com.google.android.gms.internal.ads.A90
                public final void zza(Object obj, L2 l22) {
                }
            });
            this.f14856k = c1211Ca0;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f14857l = copyOnWriteArraySet;
            this.f14859n = new ArrayList();
            this.f14851f0 = new JN0(0);
            int length2 = eg0ArrZza.length;
            WO0 wo0 = new WO0(new HG0[2], new PO0[2], CN.zza, null);
            this.f14842b = wo0;
            this.f14858m = new C3711nF();
            C2420bz c2420bz = new C2420bz();
            c2420bz.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            vo0.zzn();
            c2420bz.zzd(29, true);
            c2420bz.zzd(23, false);
            c2420bz.zzd(25, false);
            c2420bz.zzd(33, false);
            c2420bz.zzd(26, false);
            c2420bz.zzd(34, false);
            C2558dA c2558dAZze = c2420bz.zze();
            this.f14844c = c2558dAZze;
            C2420bz c2420bz2 = new C2420bz();
            c2420bz2.zzb(c2558dAZze);
            c2420bz2.zza(4);
            c2420bz2.zza(10);
            this.f14821G = c2420bz2.zze();
            this.f14854i = interfaceC3002h20.zzb(looper, null);
            C3028hF0 c3028hF0 = new C3028hF0(this);
            this.f14849e0 = c3028hF0;
            this.f14843b0 = C4853xG0.zzg(wo0);
            Apply.zzR(interfaceC3021hC, looper);
            this.f14855j = new XF0(eg0ArrZza, vo0, wo0, (InterfaceC2227aG0) c2798fF0.f19148f.zza(), c3048hP0Zzg, 0, false, Apply, this.f14820F, c2798fF0.f19161s, c2798fF0.f19156n, false, looper, interfaceC3002h20, c3028hF0, AbstractC2281am0.zza < 31 ? new C2577dJ0(c2798fF0.f19160r) : EF0.zza(applicationContext, this, c2798fF0.f19158p, c2798fF0.f19160r), null);
            this.f14834T = 1.0f;
            C3550ls c3550ls = C3550ls.zza;
            this.f14822H = c3550ls;
            this.f14823I = c3550ls;
            this.f14841a0 = c3550ls;
            int iGenerateAudioSessionId = -1;
            this.f14845c0 = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                iGenerateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.f14832R = iGenerateAudioSessionId;
            this.f14836V = C5107zY.zza;
            this.f14837W = true;
            if (Apply == 0) {
                throw null;
            }
            c1211Ca0.zzb(Apply);
            c3048hP0Zzg.zze(new Handler(looper), Apply);
            copyOnWriteArraySet.add(jf0);
            this.f14868w = new FE0(c2798fF0.f19143a, handler, jf0);
            this.f14869x = new JE0(c2798fF0.f19143a, handler, jf0);
            AbstractC2281am0.zzG(null, null);
            this.f14870y = new MG0(c2798fF0.f19143a);
            this.f14871z = new NG0(c2798fF0.f19143a);
            this.f14839Y = new C2243aO0(0).zza();
            this.f14840Z = IQ.zza;
            this.f14829O = C1839Rh0.zza;
            vo0.zzk(this.f14833S);
            D(1, 10, Integer.valueOf(this.f14832R));
            D(2, 10, Integer.valueOf(this.f14832R));
            D(1, 3, this.f14833S);
            D(2, 4, Integer.valueOf(this.f14828N));
            D(2, 5, 0);
            D(1, 9, Boolean.valueOf(this.f14835U));
            D(2, 7, lf0);
            D(6, 8, lf0);
            k30.zze();
        } catch (Throwable th) {
            this.f14846d.zze();
            throw th;
        }
    }

    private final C4853xG0 A(C4853xG0 c4853xG0, RG rg, Pair pair) {
        F10.zzd(rg.zzo() || pair != null);
        RG rg2 = c4853xG0.zza;
        long jV = v(c4853xG0);
        C4853xG0 c4853xG0Zzf = c4853xG0.zzf(rg);
        if (rg.zzo()) {
            NM0 nm0Zzh = C4853xG0.zzh();
            long jZzr = AbstractC2281am0.zzr(this.f14847d0);
            C4853xG0 c4853xG0Zza = c4853xG0Zzf.zzb(nm0Zzh, jZzr, jZzr, jZzr, 0L, SN0.zza, this.f14842b, AbstractC2394bl0.zzm()).zza(nm0Zzh);
            c4853xG0Zza.zzp = c4853xG0Zza.zzr;
            return c4853xG0Zza;
        }
        Object obj = c4853xG0Zzf.zzb.zza;
        int i8 = AbstractC2281am0.zza;
        boolean zEquals = obj.equals(pair.first);
        NM0 nm0 = !zEquals ? new NM0(pair.first, -1L) : c4853xG0Zzf.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzr2 = AbstractC2281am0.zzr(jV);
        if (!rg2.zzo()) {
            rg2.zzn(obj, this.f14858m);
        }
        if (!zEquals || jLongValue < jZzr2) {
            F10.zzf(!nm0.zzb());
            C4853xG0 c4853xG0Zza2 = c4853xG0Zzf.zzb(nm0, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? SN0.zza : c4853xG0Zzf.zzh, !zEquals ? this.f14842b : c4853xG0Zzf.zzi, !zEquals ? AbstractC2394bl0.zzm() : c4853xG0Zzf.zzj).zza(nm0);
            c4853xG0Zza2.zzp = jLongValue;
            return c4853xG0Zza2;
        }
        if (jLongValue != jZzr2) {
            F10.zzf(!nm0.zzb());
            long jMax = Math.max(0L, c4853xG0Zzf.zzq - (jLongValue - jZzr2));
            long j8 = c4853xG0Zzf.zzp;
            if (c4853xG0Zzf.zzk.equals(c4853xG0Zzf.zzb)) {
                j8 = jLongValue + jMax;
            }
            C4853xG0 c4853xG0Zzb = c4853xG0Zzf.zzb(nm0, jLongValue, jLongValue, jLongValue, jMax, c4853xG0Zzf.zzh, c4853xG0Zzf.zzi, c4853xG0Zzf.zzj);
            c4853xG0Zzb.zzp = j8;
            return c4853xG0Zzb;
        }
        int iZza = rg.zza(c4853xG0Zzf.zzk.zza);
        if (iZza != -1 && rg.zzd(iZza, this.f14858m, false).zzd == rg.zzn(nm0.zza, this.f14858m).zzd) {
            return c4853xG0Zzf;
        }
        rg.zzn(nm0.zza, this.f14858m);
        long jZzh = nm0.zzb() ? this.f14858m.zzh(nm0.zzb, nm0.zzc) : this.f14858m.zze;
        C4853xG0 c4853xG0Zza3 = c4853xG0Zzf.zzb(nm0, c4853xG0Zzf.zzr, c4853xG0Zzf.zzr, c4853xG0Zzf.zzd, jZzh - c4853xG0Zzf.zzr, c4853xG0Zzf.zzh, c4853xG0Zzf.zzi, c4853xG0Zzf.zzj).zza(nm0);
        c4853xG0Zza3.zzp = jZzh;
        return c4853xG0Zza3;
    }

    private final AG0 B(InterfaceC5081zG0 interfaceC5081zG0) {
        int iT = t(this.f14843b0);
        RG rg = this.f14843b0.zza;
        if (iT == -1) {
            iT = 0;
        }
        InterfaceC3002h20 interfaceC3002h20 = this.f14865t;
        XF0 xf0 = this.f14855j;
        return new AG0(xf0, interfaceC5081zG0, rg, iT, interfaceC3002h20, xf0.zzb());
    }

    public final void C(final int i8, final int i9) {
        if (i8 == this.f14829O.zzb() && i9 == this.f14829O.zza()) {
            return;
        }
        this.f14829O = new C1839Rh0(i8, i9);
        C1211Ca0 c1211Ca0 = this.f14856k;
        c1211Ca0.zzd(24, new Z80() { // from class: com.google.android.gms.internal.ads.zF0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                int i10 = NF0.zzd;
                ((EA) obj).zzo(i8, i9);
            }
        });
        c1211Ca0.zzc();
        D(2, 14, new C1839Rh0(i8, i9));
    }

    private final void D(int i8, int i9, Object obj) {
        EG0[] eg0Arr = this.f14852g;
        int length = eg0Arr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            EG0 eg0 = eg0Arr[i10];
            if (eg0.zzb() == i8) {
                AG0 ag0B = B(eg0);
                ag0B.zzf(i9);
                ag0B.zze(obj);
                ag0B.zzd();
            }
        }
    }

    public final void E() {
        D(1, 2, Float.valueOf(this.f14834T * this.f14869x.zza()));
    }

    public final void F(Object obj) {
        ArrayList arrayList = new ArrayList();
        EG0[] eg0Arr = this.f14852g;
        int length = eg0Arr.length;
        boolean z8 = false;
        for (int i8 = 0; i8 < 2; i8++) {
            EG0 eg0 = eg0Arr[i8];
            if (eg0.zzb() == 2) {
                AG0 ag0B = B(eg0);
                ag0B.zzf(1);
                ag0B.zze(obj);
                ag0B.zzd();
                arrayList.add(ag0B);
            }
        }
        Object obj2 = this.f14826L;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AG0) it.next()).zzi(this.f14815A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z8 = true;
            }
            Object obj3 = this.f14826L;
            Surface surface = this.f14827M;
            if (obj3 == surface) {
                surface.release();
                this.f14827M = null;
            }
        }
        this.f14826L = obj;
        if (z8) {
            G(WE0.zzd(new YF0(3), 1003));
        }
    }

    private final void G(WE0 we0) {
        C4853xG0 c4853xG0 = this.f14843b0;
        C4853xG0 c4853xG0Zza = c4853xG0.zza(c4853xG0.zzb);
        c4853xG0Zza.zzp = c4853xG0Zza.zzr;
        c4853xG0Zza.zzq = 0L;
        C4853xG0 c4853xG0Zze = c4853xG0Zza.zze(1);
        if (we0 != null) {
            c4853xG0Zze = c4853xG0Zze.zzd(we0);
        }
        this.f14816B++;
        this.f14855j.zzo();
        I(c4853xG0Zze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void H(boolean z8, int i8, int i9) {
        int i10 = 0;
        boolean z9 = z8 && i8 != -1;
        if (z9 && i8 != 1) {
            i10 = 1;
        }
        C4853xG0 c4853xG0 = this.f14843b0;
        if (c4853xG0.zzl == z9 && c4853xG0.zzm == i10) {
            return;
        }
        this.f14816B++;
        C4853xG0 c4853xG0Zzc = c4853xG0.zzc(z9, i10);
        this.f14855j.zzn(z9, i10);
        I(c4853xG0Zzc, 0, i9, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x04e2  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(final com.google.android.gms.internal.ads.C4853xG0 r43, final int r44, final int r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.NF0.I(com.google.android.gms.internal.ads.xG0, int, int, boolean, int, long, int, boolean):void");
    }

    private final void J() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            K();
            boolean z8 = this.f14843b0.zzo;
            zzv();
            zzv();
        }
    }

    private final void K() {
        this.f14846d.zzb();
        if (Thread.currentThread() != this.f14863r.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f14863r.getThread().getName());
            if (this.f14837W) {
                throw new IllegalStateException(str);
            }
            AbstractC2834fc0.zzg("ExoPlayerImpl", str, this.f14838X ? null : new IllegalStateException());
            this.f14838X = true;
        }
    }

    static /* bridge */ /* synthetic */ void m(NF0 nf0, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        nf0.F(surface);
        nf0.f14827M = surface;
    }

    private final int t(C4853xG0 c4853xG0) {
        return c4853xG0.zza.zzo() ? this.f14845c0 : c4853xG0.zza.zzn(c4853xG0.zzb.zza, this.f14858m).zzd;
    }

    public static int u(boolean z8, int i8) {
        return (!z8 || i8 == 1) ? 1 : 2;
    }

    private final long v(C4853xG0 c4853xG0) {
        if (!c4853xG0.zzb.zzb()) {
            return AbstractC2281am0.zzu(w(c4853xG0));
        }
        c4853xG0.zza.zzn(c4853xG0.zzb.zza, this.f14858m);
        long j8 = c4853xG0.zzc;
        if (j8 != -9223372036854775807L) {
            return AbstractC2281am0.zzu(j8) + AbstractC2281am0.zzu(0L);
        }
        long j9 = c4853xG0.zza.zze(t(c4853xG0), this.f21914a, 0L).zzn;
        return AbstractC2281am0.zzu(0L);
    }

    private final long w(C4853xG0 c4853xG0) {
        if (c4853xG0.zza.zzo()) {
            return AbstractC2281am0.zzr(this.f14847d0);
        }
        long j8 = c4853xG0.zzr;
        if (c4853xG0.zzb.zzb()) {
            return j8;
        }
        y(c4853xG0.zza, c4853xG0.zzb, j8);
        return j8;
    }

    private static long x(C4853xG0 c4853xG0) {
        C4055qG c4055qG = new C4055qG();
        C3711nF c3711nF = new C3711nF();
        c4853xG0.zza.zzn(c4853xG0.zzb.zza, c3711nF);
        long j8 = c4853xG0.zzc;
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        long j9 = c4853xG0.zza.zze(c3711nF.zzd, c4055qG, 0L).zzn;
        return 0L;
    }

    private final long y(RG rg, NM0 nm0, long j8) {
        rg.zzn(nm0.zza, this.f14858m);
        return j8;
    }

    private final Pair z(RG rg, int i8, long j8) {
        if (rg.zzo()) {
            this.f14845c0 = i8;
            if (j8 == -9223372036854775807L) {
                j8 = 0;
            }
            this.f14847d0 = j8;
            return null;
        }
        if (i8 == -1 || i8 >= rg.zzc()) {
            i8 = rg.zzg(false);
            long j9 = rg.zze(i8, this.f21914a, 0L).zzn;
            j8 = AbstractC2281am0.zzu(0L);
        }
        return rg.zzl(this.f21914a, this.f14858m, i8, AbstractC2281am0.zzr(j8));
    }

    final /* synthetic */ void p(VF0 vf0) {
        long j8;
        boolean z8;
        int i8 = this.f14816B - vf0.zzb;
        this.f14816B = i8;
        boolean z9 = true;
        if (vf0.zzc) {
            this.f14817C = vf0.zzd;
            this.f14818D = true;
        }
        if (vf0.zze) {
            this.f14819E = vf0.zzf;
        }
        if (i8 == 0) {
            RG rg = vf0.zza.zza;
            if (!this.f14843b0.zza.zzo() && rg.zzo()) {
                this.f14845c0 = -1;
                this.f14847d0 = 0L;
            }
            if (!rg.zzo()) {
                List listJ = ((CG0) rg).j();
                F10.zzf(listJ.size() == this.f14859n.size());
                for (int i9 = 0; i9 < listJ.size(); i9++) {
                    ((MF0) this.f14859n.get(i9)).zzc((RG) listJ.get(i9));
                }
            }
            if (this.f14818D) {
                if (vf0.zza.zzb.equals(this.f14843b0.zzb) && vf0.zza.zzd == this.f14843b0.zzr) {
                    z9 = false;
                }
                if (!z9) {
                    j8 = -9223372036854775807L;
                } else if (rg.zzo() || vf0.zza.zzb.zzb()) {
                    j8 = vf0.zza.zzd;
                } else {
                    C4853xG0 c4853xG0 = vf0.zza;
                    NM0 nm0 = c4853xG0.zzb;
                    j8 = c4853xG0.zzd;
                    y(rg, nm0, j8);
                }
                z8 = z9;
            } else {
                j8 = -9223372036854775807L;
                z8 = false;
            }
            this.f14818D = false;
            I(vf0.zza, 1, this.f14819E, z8, this.f14817C, j8, -1, false);
        }
    }

    final /* synthetic */ void q(final VF0 vf0) {
        this.f14854i.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.BF0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.p(vf0);
            }
        });
    }

    final /* synthetic */ void r(EA ea) {
        ea.zza(this.f14821G);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzA(SG0 sg0) {
        K();
        this.f14862q.zzQ(sg0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzB(PM0 pm0) {
        K();
        List listSingletonList = Collections.singletonList(pm0);
        K();
        K();
        t(this.f14843b0);
        zzk();
        this.f14816B++;
        if (!this.f14859n.isEmpty()) {
            int size = this.f14859n.size();
            for (int i8 = size - 1; i8 >= 0; i8--) {
                this.f14859n.remove(i8);
            }
            this.f14851f0 = this.f14851f0.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < listSingletonList.size(); i9++) {
            C4511uG0 c4511uG0 = new C4511uG0((PM0) listSingletonList.get(i9), this.f14860o);
            arrayList.add(c4511uG0);
            this.f14859n.add(i9, new MF0(c4511uG0.zzb, c4511uG0.zza));
        }
        this.f14851f0 = this.f14851f0.zzg(0, arrayList.size());
        CG0 cg0 = new CG0(this.f14859n, this.f14851f0);
        if (!cg0.zzo() && cg0.zzc() < 0) {
            throw new U7(cg0, -1, -9223372036854775807L);
        }
        int iZzg = cg0.zzg(false);
        C4853xG0 c4853xG0A = A(this.f14843b0, cg0, z(cg0, iZzg, -9223372036854775807L));
        int i10 = c4853xG0A.zze;
        if (iZzg != -1 && i10 != 1) {
            i10 = 4;
            if (!cg0.zzo() && iZzg < cg0.zzc()) {
                i10 = 2;
            }
        }
        C4853xG0 c4853xG0Zze = c4853xG0A.zze(i10);
        this.f14855j.zzq(arrayList, iZzg, AbstractC2281am0.zzr(-9223372036854775807L), this.f14851f0);
        I(c4853xG0Zze, 0, 1, (this.f14843b0.zzb.zza.equals(c4853xG0Zze.zzb.zza) || this.f14843b0.zza.zzo()) ? false : true, 4, w(c4853xG0Zze), -1, false);
    }

    public final WE0 zzE() {
        K();
        return this.f14843b0.zzf;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0
    public final void zza(int i8, long j8, int i9, boolean z8) {
        K();
        if (i8 == -1) {
            return;
        }
        F10.zzd(i8 >= 0);
        RG rg = this.f14843b0.zza;
        if (rg.zzo() || i8 < rg.zzc()) {
            this.f14862q.zzu();
            this.f14816B++;
            if (zzx()) {
                AbstractC2834fc0.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                VF0 vf0 = new VF0(this.f14843b0);
                vf0.zza(1);
                this.f14849e0.zza.q(vf0);
                return;
            }
            C4853xG0 c4853xG0Zze = this.f14843b0;
            int i10 = c4853xG0Zze.zze;
            if (i10 == 3 || (i10 == 4 && !rg.zzo())) {
                c4853xG0Zze = this.f14843b0.zze(2);
            }
            int iZzd = zzd();
            C4853xG0 c4853xG0A = A(c4853xG0Zze, rg, z(rg, i8, j8));
            this.f14855j.zzl(rg, i8, AbstractC2281am0.zzr(j8));
            I(c4853xG0A, 0, 1, true, 1, w(c4853xG0A), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzb() {
        K();
        if (zzx()) {
            return this.f14843b0.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzc() {
        K();
        if (zzx()) {
            return this.f14843b0.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzd() {
        K();
        int iT = t(this.f14843b0);
        if (iT == -1) {
            return 0;
        }
        return iT;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zze() {
        K();
        if (this.f14843b0.zza.zzo()) {
            return 0;
        }
        C4853xG0 c4853xG0 = this.f14843b0;
        return c4853xG0.zza.zza(c4853xG0.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzf() {
        K();
        return this.f14843b0.zze;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzg() {
        K();
        return this.f14843b0.zzm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzh() {
        K();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzi() {
        K();
        if (zzx()) {
            C4853xG0 c4853xG0 = this.f14843b0;
            return c4853xG0.zzk.equals(c4853xG0.zzb) ? AbstractC2281am0.zzu(this.f14843b0.zzp) : zzl();
        }
        K();
        if (this.f14843b0.zza.zzo()) {
            return this.f14847d0;
        }
        C4853xG0 c4853xG02 = this.f14843b0;
        long j8 = 0;
        if (c4853xG02.zzk.zzd != c4853xG02.zzb.zzd) {
            return AbstractC2281am0.zzu(c4853xG02.zza.zze(zzd(), this.f21914a, 0L).zzo);
        }
        long j9 = c4853xG02.zzp;
        if (this.f14843b0.zzk.zzb()) {
            C4853xG0 c4853xG03 = this.f14843b0;
            c4853xG03.zza.zzn(c4853xG03.zzk.zza, this.f14858m).zzi(this.f14843b0.zzk.zzb);
        } else {
            j8 = j9;
        }
        C4853xG0 c4853xG04 = this.f14843b0;
        y(c4853xG04.zza, c4853xG04.zzk, j8);
        return AbstractC2281am0.zzu(j8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzj() {
        K();
        return v(this.f14843b0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzk() {
        K();
        return AbstractC2281am0.zzu(w(this.f14843b0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzl() {
        K();
        if (zzx()) {
            C4853xG0 c4853xG0 = this.f14843b0;
            NM0 nm0 = c4853xG0.zzb;
            c4853xG0.zza.zzn(nm0.zza, this.f14858m);
            return AbstractC2281am0.zzu(this.f14858m.zzh(nm0.zzb, nm0.zzc));
        }
        RG rgZzn = zzn();
        if (rgZzn.zzo()) {
            return -9223372036854775807L;
        }
        return AbstractC2281am0.zzu(rgZzn.zze(zzd(), this.f21914a, 0L).zzo);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzm() {
        K();
        return AbstractC2281am0.zzu(this.f14843b0.zzq);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final RG zzn() {
        K();
        return this.f14843b0.zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final CN zzo() {
        K();
        return this.f14843b0.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzp() {
        K();
        JE0 je0 = this.f14869x;
        boolean zZzv = zzv();
        int iZzb = je0.zzb(zZzv, 2);
        H(zZzv, iZzb, u(zZzv, iZzb));
        C4853xG0 c4853xG0 = this.f14843b0;
        if (c4853xG0.zze != 1) {
            return;
        }
        C4853xG0 c4853xG0Zzd = c4853xG0.zzd(null);
        C4853xG0 c4853xG0Zze = c4853xG0Zzd.zze(true == c4853xG0Zzd.zza.zzo() ? 4 : 2);
        this.f14816B++;
        this.f14855j.zzk();
        I(c4853xG0Zze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzq() {
        AbstractC2834fc0.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha01] [" + AbstractC2281am0.zze + "] [" + AbstractC1609Lp.zza() + "]");
        K();
        this.f14869x.zzd();
        if (!this.f14855j.zzp()) {
            C1211Ca0 c1211Ca0 = this.f14856k;
            c1211Ca0.zzd(10, new Z80() { // from class: com.google.android.gms.internal.ads.AF0
                @Override // com.google.android.gms.internal.ads.Z80
                public final void zza(Object obj) {
                    ((EA) obj).zzj(WE0.zzd(new YF0(1), 1003));
                }
            });
            c1211Ca0.zzc();
        }
        this.f14856k.zze();
        this.f14854i.zze(null);
        this.f14864s.zzf(this.f14862q);
        C4853xG0 c4853xG0 = this.f14843b0;
        boolean z8 = c4853xG0.zzo;
        C4853xG0 c4853xG0Zze = c4853xG0.zze(1);
        this.f14843b0 = c4853xG0Zze;
        C4853xG0 c4853xG0Zza = c4853xG0Zze.zza(c4853xG0Zze.zzb);
        this.f14843b0 = c4853xG0Zza;
        c4853xG0Zza.zzp = c4853xG0Zza.zzr;
        this.f14843b0.zzq = 0L;
        this.f14862q.zzP();
        this.f14853h.zzj();
        Surface surface = this.f14827M;
        if (surface != null) {
            surface.release();
            this.f14827M = null;
        }
        this.f14836V = C5107zY.zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzr(boolean z8) {
        K();
        int iZzb = this.f14869x.zzb(z8, zzf());
        H(z8, iZzb, u(z8, iZzb));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzs(Surface surface) {
        K();
        F(surface);
        int i8 = surface == null ? 0 : -1;
        C(i8, i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzt(float f8) {
        K();
        final float fMax = Math.max(0.0f, Math.min(f8, 1.0f));
        if (this.f14834T == fMax) {
            return;
        }
        this.f14834T = fMax;
        E();
        C1211Ca0 c1211Ca0 = this.f14856k;
        c1211Ca0.zzd(22, new Z80() { // from class: com.google.android.gms.internal.ads.qF0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                int i8 = NF0.zzd;
                ((EA) obj).zzs(fMax);
            }
        });
        c1211Ca0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzu() {
        K();
        this.f14869x.zzb(zzv(), 1);
        G(null);
        this.f14836V = new C5107zY(AbstractC2394bl0.zzm(), this.f14843b0.zzr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final boolean zzv() {
        K();
        return this.f14843b0.zzl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final boolean zzw() {
        K();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final boolean zzx() {
        K();
        return this.f14843b0.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzy() {
        K();
        int length = this.f14852g.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzz(SG0 sg0) {
        this.f14862q.zzt(sg0);
    }
}
