package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class F implements InterfaceC4478u0, GP, InterfaceC2309b0 {

    /* renamed from: o */
    private static final Executor f12883o = new Executor() { // from class: com.google.android.gms.internal.ads.q
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };

    /* renamed from: a */
    private final Context f12884a;

    /* renamed from: b */
    private final D f12885b;

    /* renamed from: c */
    private final IC f12886c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f12887d;

    /* renamed from: e */
    private InterfaceC3002h20 f12888e;

    /* renamed from: f */
    private V f12889f;

    /* renamed from: g */
    private C2423c0 f12890g;

    /* renamed from: h */
    private Q5 f12891h;

    /* renamed from: i */
    private S f12892i;

    /* renamed from: j */
    private InterfaceC4721w70 f12893j;

    /* renamed from: k */
    private Pair f12894k;

    /* renamed from: l */
    private int f12895l;

    /* renamed from: m */
    private int f12896m;

    /* renamed from: n */
    private float f12897n;

    /* synthetic */ F(C4363t c4363t, E e8) {
        Context context = c4363t.f22763a;
        this.f12884a = context;
        D d9 = new D(this, context);
        this.f12885b = d9;
        IC ic = c4363t.f22765c;
        F10.zzb(ic);
        this.f12886c = ic;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f12887d = copyOnWriteArraySet;
        this.f12896m = 0;
        this.f12897n = 1.0f;
        copyOnWriteArraySet.add(d9);
    }

    static /* bridge */ /* synthetic */ InterfaceC2817fP b(F f8, Q5 q52, InterfaceC3002h20 interfaceC3002h20) throws C4250s0 {
        F10.zzf(f8.f12896m == 0);
        F10.zzf((f8.f12890g == null || f8.f12889f == null) ? false : true);
        f8.f12888e = interfaceC3002h20;
        Looper looperMyLooper = Looper.myLooper();
        F10.zzb(looperMyLooper);
        f8.f12893j = interfaceC3002h20.zzb(looperMyLooper, null);
        C3724nL0 c3724nL0H = h(q52.zzz);
        if (c3724nL0H.zzf == 7 && AbstractC2281am0.zza < 34) {
            C2693eK0 c2693eK0Zzc = c3724nL0H.zzc();
            c2693eK0Zzc.zzd(6);
            c3724nL0H = c2693eK0Zzc.zzg();
        }
        C3724nL0 c3724nL0 = c3724nL0H;
        try {
            IC ic = f8.f12886c;
            Context context = f8.f12884a;
            ZM0 zm0 = ZM0.zza;
            final InterfaceC4721w70 interfaceC4721w70 = f8.f12893j;
            Objects.requireNonNull(interfaceC4721w70);
            ic.zza(context, c3724nL0, zm0, f8, new Executor() { // from class: com.google.android.gms.internal.ads.r
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC4721w70.zzh(runnable);
                }
            }, AbstractC2394bl0.zzm(), 0L);
            Pair pair = f8.f12894k;
            if (pair == null) {
                throw null;
            }
            C1839Rh0 c1839Rh0 = (C1839Rh0) pair.second;
            c1839Rh0.zzb();
            c1839Rh0.zza();
            throw null;
        } catch (C2586dO e8) {
            throw new C4250s0(e8, q52);
        }
    }

    static /* bridge */ /* synthetic */ void d(final F f8) {
        if (f8.i()) {
            f8.f12895l++;
            C2423c0 c2423c0 = f8.f12890g;
            F10.zzb(c2423c0);
            c2423c0.zza();
            InterfaceC4721w70 interfaceC4721w70 = f8.f12893j;
            F10.zzb(interfaceC4721w70);
            interfaceC4721w70.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.s
                @Override // java.lang.Runnable
                public final void run() {
                    F.zzf(this.zza);
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ void e(F f8, float f9) {
        f8.f12897n = f9;
        C2423c0 c2423c0 = f8.f12890g;
        if (c2423c0 != null) {
            c2423c0.zzd(f9);
        }
    }

    static /* bridge */ /* synthetic */ boolean g(F f8, long j8) {
        if (f8.f12895l != 0) {
            return false;
        }
        C2423c0 c2423c0 = f8.f12890g;
        F10.zzb(c2423c0);
        return c2423c0.zze(j8);
    }

    public static C3724nL0 h(C3724nL0 c3724nL0) {
        return (c3724nL0 == null || !c3724nL0.zzf()) ? C3724nL0.zza : c3724nL0;
    }

    private final boolean i() {
        return this.f12896m == 1;
    }

    public static /* synthetic */ void zzf(F f8) {
        int i8 = f8.f12895l - 1;
        f8.f12895l = i8;
        if (i8 > 0) {
            return;
        }
        if (i8 < 0) {
            throw new IllegalStateException(String.valueOf(i8));
        }
        C2423c0 c2423c0 = f8.f12890g;
        F10.zzb(c2423c0);
        c2423c0.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4478u0
    public final V zzc() {
        return this.f12889f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4478u0
    public final InterfaceC4364t0 zzd() {
        return this.f12885b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4478u0
    public final void zzk() {
        C1839Rh0 c1839Rh0 = C1839Rh0.zza;
        c1839Rh0.zzb();
        c1839Rh0.zza();
        this.f12894k = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309b0
    public final void zzl() {
        Iterator it = this.f12887d.iterator();
        while (it.hasNext()) {
            ((InterfaceC4477u) it.next()).zzb(this);
        }
        F10.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309b0
    public final void zzm(IQ iq) {
        O4 o42 = new O4();
        o42.zzac(iq.zzc);
        o42.zzI(iq.zzd);
        o42.zzX("video/raw");
        this.f12891h = o42.zzad();
        Iterator it = this.f12887d.iterator();
        while (it.hasNext()) {
            ((InterfaceC4477u) it.next()).zzc(this, iq);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4478u0
    public final void zzn() {
        if (this.f12896m == 2) {
            return;
        }
        InterfaceC4721w70 interfaceC4721w70 = this.f12893j;
        if (interfaceC4721w70 != null) {
            interfaceC4721w70.zze(null);
        }
        this.f12894k = null;
        this.f12896m = 2;
    }

    public final void zzo(long j8, long j9) {
        if (this.f12895l == 0) {
            C2423c0 c2423c0 = this.f12890g;
            F10.zzb(c2423c0);
            c2423c0.zzc(j8, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309b0
    public final void zzp(long j8, long j9, long j10, boolean z8) {
        if (z8 && this.f12894k != null) {
            Iterator it = this.f12887d.iterator();
            while (it.hasNext()) {
                ((InterfaceC4477u) it.next()).zza(this);
            }
        }
        if (this.f12892i != null) {
            Q5 q5Zzad = this.f12891h;
            if (q5Zzad == null) {
                q5Zzad = new O4().zzad();
            }
            F10.zzb(this.f12888e);
            this.f12892i.zza(j9 - j10, System.nanoTime(), q5Zzad, null);
        }
        F10.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4478u0
    public final void zzq(Surface surface, C1839Rh0 c1839Rh0) {
        Pair pair = this.f12894k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C1839Rh0) this.f12894k.second).equals(c1839Rh0)) {
            return;
        }
        this.f12894k = Pair.create(surface, c1839Rh0);
        c1839Rh0.zzb();
        c1839Rh0.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4478u0
    public final void zzr(List list) {
        this.f12885b.zzk(list);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4478u0
    public final void zzs(V v8) {
        F10.zzf(!i());
        this.f12889f = v8;
        C2423c0 c2423c0 = new C2423c0(this, v8);
        this.f12890g = c2423c0;
        c2423c0.zzd(this.f12897n);
    }
}
