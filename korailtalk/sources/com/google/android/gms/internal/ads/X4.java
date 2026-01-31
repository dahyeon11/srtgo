package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
abstract class X4 {

    /* renamed from: b, reason: collision with root package name */
    private K1 f17108b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2769f1 f17109c;

    /* renamed from: d, reason: collision with root package name */
    private S4 f17110d;

    /* renamed from: e, reason: collision with root package name */
    private long f17111e;

    /* renamed from: f, reason: collision with root package name */
    private long f17112f;

    /* renamed from: g, reason: collision with root package name */
    private long f17113g;

    /* renamed from: h, reason: collision with root package name */
    private int f17114h;

    /* renamed from: i, reason: collision with root package name */
    private int f17115i;

    /* renamed from: k, reason: collision with root package name */
    private long f17117k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17118l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17119m;

    /* renamed from: a, reason: collision with root package name */
    private final Q4 f17107a = new Q4();

    /* renamed from: j, reason: collision with root package name */
    private U4 f17116j = new U4();

    protected abstract long a(C4099qh0 c4099qh0);

    protected void b(boolean z8) {
        int i8;
        if (z8) {
            this.f17116j = new U4();
            this.f17112f = 0L;
            i8 = 0;
        } else {
            i8 = 1;
        }
        this.f17114h = i8;
        this.f17111e = -1L;
        this.f17113g = 0L;
    }

    protected abstract boolean c(C4099qh0 c4099qh0, long j8, U4 u42);

    final int d(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) throws EOFException, InterruptedIOException {
        F10.zzb(this.f17108b);
        int i8 = AbstractC2281am0.zza;
        int i9 = this.f17114h;
        if (i9 == 0) {
            while (this.f17107a.zze(interfaceC2540d1)) {
                long jZzf = interfaceC2540d1.zzf();
                long j8 = this.f17112f;
                this.f17117k = jZzf - j8;
                if (c(this.f17107a.zza(), j8, this.f17116j)) {
                    this.f17112f = interfaceC2540d1.zzf();
                } else {
                    Q5 q52 = this.f17116j.f16576a;
                    this.f17115i = q52.zzB;
                    if (!this.f17119m) {
                        this.f17108b.zzl(q52);
                        this.f17119m = true;
                    }
                    S4 s42 = this.f17116j.f16577b;
                    if (s42 != null) {
                        this.f17110d = s42;
                    } else if (interfaceC2540d1.zzd() == -1) {
                        this.f17110d = new W4(null);
                    } else {
                        R4 r4Zzb = this.f17107a.zzb();
                        this.f17110d = new K4(this, this.f17112f, interfaceC2540d1.zzd(), r4Zzb.zzd + r4Zzb.zze, r4Zzb.zzb, (r4Zzb.zza & 4) != 0);
                    }
                    this.f17114h = 2;
                    this.f17107a.zzd();
                }
            }
            this.f17114h = 3;
            return -1;
        }
        if (i9 == 1) {
            ((Q0) interfaceC2540d1).zzo((int) this.f17112f, false);
            this.f17114h = 2;
            return 0;
        }
        if (i9 != 2) {
            return -1;
        }
        long jZzd = this.f17110d.zzd(interfaceC2540d1);
        if (jZzd >= 0) {
            c5050z1.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            h(-(jZzd + 2));
        }
        if (!this.f17118l) {
            C1 c1Zze = this.f17110d.zze();
            F10.zzb(c1Zze);
            this.f17109c.zzO(c1Zze);
            this.f17118l = true;
        }
        if (this.f17117k <= 0 && !this.f17107a.zze(interfaceC2540d1)) {
            this.f17114h = 3;
            return -1;
        }
        this.f17117k = 0L;
        C4099qh0 c4099qh0Zza = this.f17107a.zza();
        long jA = a(c4099qh0Zza);
        if (jA >= 0) {
            long j9 = this.f17113g;
            if (j9 + jA >= this.f17111e) {
                long jE = e(j9);
                H1.zzb(this.f17108b, c4099qh0Zza, c4099qh0Zza.zze());
                this.f17108b.zzs(jE, 1, c4099qh0Zza.zze(), 0, null);
                this.f17111e = -1L;
            }
        }
        this.f17113g += jA;
        return 0;
    }

    protected final long e(long j8) {
        return (j8 * 1000000) / this.f17115i;
    }

    protected final long f(long j8) {
        return (this.f17115i * j8) / 1000000;
    }

    final void g(InterfaceC2769f1 interfaceC2769f1, K1 k12) {
        this.f17109c = interfaceC2769f1;
        this.f17108b = k12;
        b(true);
    }

    protected void h(long j8) {
        this.f17113g = j8;
    }

    final void i(long j8, long j9) {
        this.f17107a.zzc();
        if (j8 == 0) {
            b(!this.f17118l);
            return;
        }
        if (this.f17114h != 0) {
            long jF = f(j9);
            this.f17111e = jF;
            S4 s42 = this.f17110d;
            int i8 = AbstractC2281am0.zza;
            s42.zzg(jF);
            this.f17114h = 2;
        }
    }
}
