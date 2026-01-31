package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import i2.AbstractC5683p;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class HB extends AbstractBinderC1707Od {

    /* renamed from: a, reason: collision with root package name */
    private final FB f13286a;

    /* renamed from: b, reason: collision with root package name */
    private final H1.X f13287b;

    /* renamed from: c, reason: collision with root package name */
    private final C3926p80 f13288c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13289d = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaH)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final LQ f13290e;

    public HB(FB fb, H1.X x8, C3926p80 c3926p80, LQ lq) {
        this.f13286a = fb;
        this.f13287b = x8;
        this.f13288c = c3926p80;
        this.f13290e = lq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1707Od, com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final H1.X zze() {
        return this.f13287b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1707Od, com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final H1.S0 zzf() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgW)).booleanValue()) {
            return this.f13286a.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1707Od, com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final void zzg(boolean z8) {
        this.f13289d = z8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1707Od, com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final void zzh(H1.L0 l02) {
        AbstractC5683p.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f13288c != null) {
            try {
                if (!l02.zzf()) {
                    this.f13290e.zze();
                }
            } catch (RemoteException e8) {
                L1.n.zzf("Error in making CSI ping for reporting paid event callback", e8);
            }
            this.f13288c.zzn(l02);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1707Od, com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final void zzi(InterfaceC6172a interfaceC6172a, InterfaceC2035Wd interfaceC2035Wd) {
        try {
            this.f13288c.zzp(interfaceC2035Wd);
            this.f13286a.zzd((Activity) r2.b.unwrap(interfaceC6172a), interfaceC2035Wd, this.f13289d);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
