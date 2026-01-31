package com.google.android.gms.internal.ads;

import A1.a;
import H1.C0534f1;

/* renamed from: com.google.android.gms.internal.ads.Kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1544Kd extends AbstractBinderC1830Rd {

    /* renamed from: a, reason: collision with root package name */
    private final a.AbstractC0004a f13847a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13848b;

    public BinderC1544Kd(a.AbstractC0004a abstractC0004a, String str) {
        this.f13847a = abstractC0004a;
        this.f13848b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1830Rd, com.google.android.gms.internal.ads.InterfaceC1871Sd
    public final void zzb(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1830Rd, com.google.android.gms.internal.ads.InterfaceC1871Sd
    public final void zzc(C0534f1 c0534f1) {
        if (this.f13847a != null) {
            this.f13847a.onAdFailedToLoad(c0534f1.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1830Rd, com.google.android.gms.internal.ads.InterfaceC1871Sd
    public final void zzd(InterfaceC1748Pd interfaceC1748Pd) {
        if (this.f13847a != null) {
            this.f13847a.onAdLoaded(new C1585Ld(interfaceC1748Pd, this.f13848b));
        }
    }
}
