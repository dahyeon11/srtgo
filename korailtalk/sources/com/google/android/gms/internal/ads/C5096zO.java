package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import J1.InterfaceC0619b;

/* renamed from: com.google.android.gms.internal.ads.zO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5096zO extends C3273jO implements DJ {

    /* renamed from: f, reason: collision with root package name */
    private DJ f24174f;

    protected final synchronized void b(InterfaceC0517a interfaceC0517a, InterfaceC3990pk interfaceC3990pk, J1.w wVar, InterfaceC4217rk interfaceC4217rk, InterfaceC0619b interfaceC0619b, DJ dj) {
        super.a(interfaceC0517a, interfaceC3990pk, wVar, interfaceC4217rk, interfaceC0619b);
        this.f24174f = dj;
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final synchronized void zzdG() {
        DJ dj = this.f24174f;
        if (dj != null) {
            dj.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final synchronized void zzdf() {
        DJ dj = this.f24174f;
        if (dj != null) {
            dj.zzdf();
        }
    }
}
