package com.google.android.gms.internal.ads;

import H1.C0534f1;

/* renamed from: com.google.android.gms.internal.ads.ds */
/* loaded from: classes2.dex */
public final class BinderC2635ds extends AbstractBinderC1815Qr {

    /* renamed from: a */
    private final V1.b f18693a;

    /* renamed from: b */
    private final C2750es f18694b;

    public BinderC2635ds(V1.b bVar, C2750es c2750es) {
        this.f18693a = bVar;
        this.f18694b = c2750es;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1815Qr, com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zze(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1815Qr, com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zzf(C0534f1 c0534f1) {
        V1.b bVar = this.f18693a;
        if (bVar != null) {
            bVar.onAdFailedToLoad(c0534f1.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1815Qr, com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zzg() {
        C2750es c2750es;
        V1.b bVar = this.f18693a;
        if (bVar == null || (c2750es = this.f18694b) == null) {
            return;
        }
        bVar.onAdLoaded(c2750es);
    }
}
