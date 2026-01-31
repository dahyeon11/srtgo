package com.google.android.gms.internal.ads;

import H1.C0534f1;

/* renamed from: com.google.android.gms.internal.ads.Xr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2102Xr extends AbstractBinderC1815Qr {

    /* renamed from: a, reason: collision with root package name */
    private final U1.d f17299a;

    /* renamed from: b, reason: collision with root package name */
    private final U1.c f17300b;

    public BinderC2102Xr(U1.d dVar, U1.c cVar) {
        this.f17299a = dVar;
        this.f17300b = cVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1815Qr, com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zze(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1815Qr, com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zzf(C0534f1 c0534f1) {
        if (this.f17299a != null) {
            this.f17299a.onAdFailedToLoad(c0534f1.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1815Qr, com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zzg() {
        U1.d dVar = this.f17299a;
        if (dVar != null) {
            dVar.onAdLoaded(this.f17300b);
        }
    }
}
