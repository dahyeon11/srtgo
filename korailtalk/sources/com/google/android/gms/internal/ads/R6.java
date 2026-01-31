package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class R6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4490u6 f16060a;

    /* renamed from: b, reason: collision with root package name */
    private final C2132Yk0 f16061b;

    /* renamed from: c, reason: collision with root package name */
    private final C1755Pg0 f16062c = new C1755Pg0(new byte[64], 64);

    /* renamed from: d, reason: collision with root package name */
    private boolean f16063d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16064e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16065f;

    public R6(InterfaceC4490u6 interfaceC4490u6, C2132Yk0 c2132Yk0) {
        this.f16060a = interfaceC4490u6;
        this.f16061b = c2132Yk0;
    }

    public final void zza(C4099qh0 c4099qh0) {
        long jZzb;
        char c9;
        c4099qh0.zzG(this.f16062c.zza, 0, 3);
        this.f16062c.zzk(0);
        this.f16062c.zzm(8);
        this.f16063d = this.f16062c.zzo();
        this.f16064e = this.f16062c.zzo();
        this.f16062c.zzm(6);
        C1755Pg0 c1755Pg0 = this.f16062c;
        c4099qh0.zzG(c1755Pg0.zza, 0, c1755Pg0.zzd(8));
        this.f16062c.zzk(0);
        if (this.f16063d) {
            this.f16062c.zzm(4);
            long jZzd = this.f16062c.zzd(3);
            this.f16062c.zzm(1);
            int iZzd = this.f16062c.zzd(15) << 15;
            this.f16062c.zzm(1);
            long jZzd2 = this.f16062c.zzd(15);
            this.f16062c.zzm(1);
            if (this.f16065f || !this.f16064e) {
                c9 = 30;
            } else {
                this.f16062c.zzm(4);
                this.f16062c.zzm(1);
                int iZzd2 = this.f16062c.zzd(15) << 15;
                this.f16062c.zzm(1);
                long jZzd3 = this.f16062c.zzd(15);
                this.f16062c.zzm(1);
                this.f16061b.zzb(iZzd2 | (this.f16062c.zzd(3) << 30) | jZzd3);
                this.f16065f = true;
                c9 = 30;
            }
            jZzb = this.f16061b.zzb((jZzd << c9) | iZzd | jZzd2);
        } else {
            jZzb = 0;
        }
        this.f16060a.zzd(jZzb, 4);
        this.f16060a.zza(c4099qh0);
        this.f16060a.zzc();
    }

    public final void zzb() {
        this.f16065f = false;
        this.f16060a.zze();
    }
}
