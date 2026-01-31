package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class W6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f16932a;

    /* renamed from: b, reason: collision with root package name */
    private final K1[] f16933b;

    public W6(List list) {
        this.f16932a = list;
        this.f16933b = new K1[list.size()];
    }

    public final void zza(long j8, C4099qh0 c4099qh0) {
        N0.zza(j8, c4099qh0, this.f16933b);
    }

    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        for (int i8 = 0; i8 < this.f16933b.length; i8++) {
            c3011h7.zzc();
            K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 3);
            Q5 q52 = (Q5) this.f16932a.get(i8);
            String str = q52.zzn;
            boolean z8 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z8 = false;
            }
            F10.zze(z8, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strZzb = q52.zzb;
            if (strZzb == null) {
                strZzb = c3011h7.zzb();
            }
            O4 o42 = new O4();
            o42.zzK(strZzb);
            o42.zzX(str);
            o42.zzZ(q52.zzf);
            o42.zzO(q52.zze);
            o42.zzw(q52.zzF);
            o42.zzL(q52.zzp);
            k1Zzw.zzl(o42.zzad());
            this.f16933b[i8] = k1Zzw;
        }
    }
}
