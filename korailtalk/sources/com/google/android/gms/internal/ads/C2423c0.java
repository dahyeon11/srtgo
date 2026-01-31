package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2423c0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2309b0 f18217a;

    /* renamed from: b, reason: collision with root package name */
    private final V f18218b;

    /* renamed from: g, reason: collision with root package name */
    private IQ f18223g;

    /* renamed from: i, reason: collision with root package name */
    private long f18225i;

    /* renamed from: c, reason: collision with root package name */
    private final T f18219c = new T();

    /* renamed from: d, reason: collision with root package name */
    private final C4902xk0 f18220d = new C4902xk0(10);

    /* renamed from: e, reason: collision with root package name */
    private final C4902xk0 f18221e = new C4902xk0(10);

    /* renamed from: f, reason: collision with root package name */
    private final C3066hd0 f18222f = new C3066hd0(16);

    /* renamed from: h, reason: collision with root package name */
    private IQ f18224h = IQ.zza;

    /* renamed from: j, reason: collision with root package name */
    private long f18226j = -9223372036854775807L;

    public C2423c0(InterfaceC2309b0 interfaceC2309b0, V v8) {
        this.f18217a = interfaceC2309b0;
        this.f18218b = v8;
    }

    private static Object a(C4902xk0 c4902xk0) {
        F10.zzd(c4902xk0.zza() > 0);
        while (c4902xk0.zza() > 1) {
            c4902xk0.zzb();
        }
        Object objZzb = c4902xk0.zzb();
        objZzb.getClass();
        return objZzb;
    }

    public final void zza() {
        this.f18222f.zzc();
        this.f18226j = -9223372036854775807L;
        C4902xk0 c4902xk0 = this.f18221e;
        if (c4902xk0.zza() > 0) {
            Long l8 = (Long) a(c4902xk0);
            l8.longValue();
            this.f18221e.zzd(0L, l8);
        }
        if (this.f18223g != null) {
            this.f18220d.zze();
            return;
        }
        C4902xk0 c4902xk02 = this.f18220d;
        if (c4902xk02.zza() > 0) {
            this.f18223g = (IQ) a(c4902xk02);
        }
    }

    public final void zzb(long j8, long j9) {
        this.f18221e.zzd(j8, Long.valueOf(j9));
    }

    public final void zzc(long j8, long j9) {
        while (true) {
            C3066hd0 c3066hd0 = this.f18222f;
            if (c3066hd0.zzd()) {
                return;
            }
            C4902xk0 c4902xk0 = this.f18221e;
            long jZza = c3066hd0.zza();
            Long l8 = (Long) c4902xk0.zzc(jZza);
            if (l8 != null && l8.longValue() != this.f18225i) {
                this.f18225i = l8.longValue();
                this.f18218b.zzf();
            }
            int iZza = this.f18218b.zza(jZza, j8, j9, this.f18225i, false, this.f18219c);
            if (iZza == 0 || iZza == 1) {
                this.f18226j = jZza;
                long jZzb = this.f18222f.zzb();
                IQ iq = (IQ) this.f18220d.zzc(jZzb);
                if (iq != null && !iq.equals(IQ.zza) && !iq.equals(this.f18224h)) {
                    this.f18224h = iq;
                    this.f18217a.zzm(iq);
                }
                this.f18217a.zzp(iZza == 0 ? -1L : this.f18219c.zzd(), jZzb, this.f18225i, this.f18218b.zzp());
            } else {
                if (iZza != 2 && iZza != 3 && iZza != 4) {
                    return;
                }
                this.f18226j = jZza;
                this.f18222f.zzb();
                this.f18217a.zzl();
            }
        }
    }

    public final void zzd(float f8) {
        F10.zzd(f8 > 0.0f);
        this.f18218b.zzn(f8);
    }

    public final boolean zze(long j8) {
        long j9 = this.f18226j;
        return j9 != -9223372036854775807L && j9 >= j8;
    }
}
