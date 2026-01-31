package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3353k7 {

    /* renamed from: a, reason: collision with root package name */
    private final List f20359a;

    /* renamed from: b, reason: collision with root package name */
    private final K1[] f20360b;

    public C3353k7(List list) {
        this.f20359a = list;
        this.f20360b = new K1[list.size()];
    }

    public final void zza(long j8, C4099qh0 c4099qh0) {
        if (c4099qh0.zzb() < 9) {
            return;
        }
        int iZzg = c4099qh0.zzg();
        int iZzg2 = c4099qh0.zzg();
        int iZzm = c4099qh0.zzm();
        if (iZzg == 434 && iZzg2 == 1195456820 && iZzm == 3) {
            N0.zzb(j8, c4099qh0, this.f20360b);
        }
    }

    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        for (int i8 = 0; i8 < this.f20360b.length; i8++) {
            c3011h7.zzc();
            K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 3);
            Q5 q52 = (Q5) this.f20359a.get(i8);
            String str = q52.zzn;
            boolean z8 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z8 = false;
            }
            F10.zze(z8, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            O4 o42 = new O4();
            o42.zzK(c3011h7.zzb());
            o42.zzX(str);
            o42.zzZ(q52.zzf);
            o42.zzO(q52.zze);
            o42.zzw(q52.zzF);
            o42.zzL(q52.zzp);
            k1Zzw.zzl(o42.zzad());
            this.f20360b[i8] = k1Zzw;
        }
    }
}
