package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4376t6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f22778a;

    /* renamed from: b, reason: collision with root package name */
    private final K1[] f22779b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22780c;

    /* renamed from: d, reason: collision with root package name */
    private int f22781d;

    /* renamed from: e, reason: collision with root package name */
    private int f22782e;

    /* renamed from: f, reason: collision with root package name */
    private long f22783f = -9223372036854775807L;

    public C4376t6(List list) {
        this.f22778a = list;
        this.f22779b = new K1[list.size()];
    }

    private final boolean a(C4099qh0 c4099qh0, int i8) {
        if (c4099qh0.zzb() == 0) {
            return false;
        }
        if (c4099qh0.zzm() != i8) {
            this.f22780c = false;
        }
        this.f22781d--;
        return this.f22780c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zza(C4099qh0 c4099qh0) {
        if (this.f22780c) {
            if (this.f22781d != 2 || a(c4099qh0, 32)) {
                if (this.f22781d != 1 || a(c4099qh0, 0)) {
                    int iZzd = c4099qh0.zzd();
                    int iZzb = c4099qh0.zzb();
                    for (K1 k12 : this.f22779b) {
                        c4099qh0.zzK(iZzd);
                        k12.zzq(c4099qh0, iZzb);
                    }
                    this.f22782e += iZzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        for (int i8 = 0; i8 < this.f22779b.length; i8++) {
            C2666e7 c2666e7 = (C2666e7) this.f22778a.get(i8);
            c3011h7.zzc();
            K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 3);
            O4 o42 = new O4();
            o42.zzK(c3011h7.zzb());
            o42.zzX("application/dvbsubs");
            o42.zzL(Collections.singletonList(c2666e7.zzb));
            o42.zzO(c2666e7.zza);
            k1Zzw.zzl(o42.zzad());
            this.f22779b[i8] = k1Zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
        if (this.f22780c) {
            F10.zzf(this.f22783f != -9223372036854775807L);
            for (K1 k12 : this.f22779b) {
                k12.zzs(this.f22783f, 1, this.f22782e, 0, null);
            }
            this.f22780c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        if ((i8 & 4) == 0) {
            return;
        }
        this.f22780c = true;
        this.f22783f = j8;
        this.f22782e = 0;
        this.f22781d = 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f22780c = false;
        this.f22783f = -9223372036854775807L;
    }
}
