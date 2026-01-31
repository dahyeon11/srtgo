package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.view.View;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
final class TX extends AbstractBinderC1279Do {

    /* renamed from: a, reason: collision with root package name */
    private final C3511lX f16487a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UX f16488b;

    /* synthetic */ TX(UX ux, C3511lX c3511lX, SX sx) {
        this.f16488b = ux;
        this.f16487a = c3511lX;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1279Do, com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zze(String str) {
        ((BinderC2942gY) this.f16487a.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1279Do, com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zzf(C0534f1 c0534f1) {
        ((BinderC2942gY) this.f16487a.zzc).zzh(c0534f1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1279Do, com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zzg(InterfaceC6172a interfaceC6172a) {
        this.f16488b.f16669c = (View) r2.b.unwrap(interfaceC6172a);
        ((BinderC2942gY) this.f16487a.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1279Do, com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zzh(InterfaceC2284ao interfaceC2284ao) {
        this.f16488b.f16670d = interfaceC2284ao;
        ((BinderC2942gY) this.f16487a.zzc).zzo();
    }
}
