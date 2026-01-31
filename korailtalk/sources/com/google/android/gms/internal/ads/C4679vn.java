package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;

/* renamed from: com.google.android.gms.internal.ads.vn */
/* loaded from: classes2.dex */
final class C4679vn implements InterfaceC1285Dt {

    /* renamed from: a */
    final /* synthetic */ C1203Bt f23308a;

    /* renamed from: b */
    final /* synthetic */ C2135Ym f23309b;

    C4679vn(C4907xn c4907xn, C1203Bt c1203Bt, C2135Ym c2135Ym) {
        this.f23308a = c1203Bt;
        this.f23309b = c2135Ym;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1285Dt
    public final void zza() {
        AbstractC0667v0.zza("callJs > getEngine: Promise rejected");
        this.f23308a.zzd(new C3085hn("Unable to obtain a JavascriptEngine."));
        this.f23309b.zzb();
    }
}
