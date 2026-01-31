package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class E1 implements InterfaceC2425c1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f12727a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12728b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12729c;

    /* renamed from: d, reason: collision with root package name */
    private int f12730d;

    /* renamed from: e, reason: collision with root package name */
    private int f12731e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC2769f1 f12732f;

    /* renamed from: g, reason: collision with root package name */
    private K1 f12733g;

    public E1(int i8, int i9, String str) {
        this.f12727a = i8;
        this.f12728b = i9;
        this.f12729c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        int i8 = this.f12731e;
        if (i8 != 1) {
            if (i8 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        K1 k12 = this.f12733g;
        k12.getClass();
        int iZza = H1.zza(k12, interfaceC2540d1, 1024, true);
        if (iZza == -1) {
            this.f12731e = 2;
            this.f12733g.zzs(0L, 1, this.f12730d, 0, null);
            this.f12730d = 0;
        } else {
            this.f12730d += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f12732f = interfaceC2769f1;
        K1 k1Zzw = interfaceC2769f1.zzw(1024, 4);
        this.f12733g = k1Zzw;
        O4 o42 = new O4();
        o42.zzX(this.f12729c);
        k1Zzw.zzl(o42.zzad());
        this.f12732f.zzD();
        this.f12732f.zzO(new F1(-9223372036854775807L));
        this.f12731e = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        if (j8 == 0 || this.f12731e == 1) {
            this.f12731e = 1;
            this.f12730d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        F10.zzf((this.f12727a == -1 || this.f12728b == -1) ? false : true);
        C4099qh0 c4099qh0 = new C4099qh0(this.f12728b);
        ((Q0) interfaceC2540d1).zzm(c4099qh0.zzM(), 0, this.f12728b, false);
        return c4099qh0.zzq() == this.f12727a;
    }
}
