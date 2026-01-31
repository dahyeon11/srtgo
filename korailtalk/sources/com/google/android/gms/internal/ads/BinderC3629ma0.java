package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import i2.AbstractC5683p;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.ma0 */
/* loaded from: classes2.dex */
public final class BinderC3629ma0 extends AbstractBinderC1488Ir {

    /* renamed from: a */
    private final C3175ia0 f20935a;

    /* renamed from: b */
    private final X90 f20936b;

    /* renamed from: c */
    private final String f20937c;

    /* renamed from: d */
    private final C1498Ja0 f20938d;

    /* renamed from: e */
    private final Context f20939e;

    /* renamed from: f */
    private final L1.a f20940f;

    /* renamed from: g */
    private final C2487cb f20941g;

    /* renamed from: h */
    private final LQ f20942h;

    /* renamed from: i */
    private MO f20943i;

    /* renamed from: j */
    private boolean f20944j = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaE)).booleanValue();

    public BinderC3629ma0(String str, C3175ia0 c3175ia0, Context context, X90 x90, C1498Ja0 c1498Ja0, L1.a aVar, C2487cb c2487cb, LQ lq) {
        this.f20937c = str;
        this.f20935a = c3175ia0;
        this.f20936b = x90;
        this.f20938d = c1498Ja0;
        this.f20939e = context;
        this.f20940f = aVar;
        this.f20941g = c2487cb;
        this.f20942h = lq;
    }

    private final synchronized void e(H1.Y1 y12, InterfaceC1856Rr interfaceC1856Rr, int i8) {
        try {
            boolean z8 = false;
            if (((Boolean) AbstractC3872oi.zzl.zze()).booleanValue()) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                    z8 = true;
                }
            }
            if (this.f20940f.clientJarVersion < ((Integer) H1.C.zzc().zza(AbstractC4439th.zzlh)).intValue() || !z8) {
                AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
            }
            this.f20936b.zzk(interfaceC1856Rr);
            G1.u.zzp();
            if (K1.K0.zzH(this.f20939e) && y12.zzs == null) {
                L1.n.zzg("Failed to load the ad because app ID is missing.");
                this.f20936b.zzdB(AbstractC4542ub0.zzd(4, null, null));
                return;
            }
            if (this.f20943i != null) {
                return;
            }
            Z90 z90 = new Z90(null);
            this.f20935a.g(i8);
            this.f20935a.zzb(y12, this.f20937c, z90, new C3515la0(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final Bundle zzb() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        MO mo = this.f20943i;
        return mo != null ? mo.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final H1.S0 zzc() {
        MO mo;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgW)).booleanValue() && (mo = this.f20943i) != null) {
            return mo.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final InterfaceC1406Gr zzd() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        MO mo = this.f20943i;
        if (mo != null) {
            return mo.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final synchronized String zze() {
        MO mo = this.f20943i;
        if (mo == null || mo.zzl() == null) {
            return null;
        }
        return mo.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final synchronized void zzf(H1.Y1 y12, InterfaceC1856Rr interfaceC1856Rr) {
        e(y12, interfaceC1856Rr, 2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final synchronized void zzg(H1.Y1 y12, InterfaceC1856Rr interfaceC1856Rr) {
        e(y12, interfaceC1856Rr, 3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final synchronized void zzh(boolean z8) {
        AbstractC5683p.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f20944j = z8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzi(H1.I0 i02) {
        if (i02 == null) {
            this.f20936b.zzg(null);
        } else {
            this.f20936b.zzg(new C3401ka0(this, i02));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzj(H1.L0 l02) {
        AbstractC5683p.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!l02.zzf()) {
                this.f20942h.zze();
            }
        } catch (RemoteException e8) {
            L1.n.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f20936b.zzi(l02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzk(InterfaceC1692Nr interfaceC1692Nr) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        this.f20936b.zzj(interfaceC1692Nr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final synchronized void zzl(C2143Yr c2143Yr) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        C1498Ja0 c1498Ja0 = this.f20938d;
        c1498Ja0.zza = c2143Yr.zza;
        c1498Ja0.zzb = c2143Yr.zzb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final synchronized void zzm(InterfaceC6172a interfaceC6172a) {
        zzn(interfaceC6172a, this.f20944j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final synchronized void zzn(InterfaceC6172a interfaceC6172a, boolean z8) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f20943i == null) {
            L1.n.zzj("Rewarded can not be shown before loaded");
            this.f20936b.zzq(AbstractC4542ub0.zzd(9, null, null));
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcH)).booleanValue()) {
            this.f20941g.zzc().zzn(new Throwable().getStackTrace());
        }
        this.f20943i.zzh(z8, (Activity) r2.b.unwrap(interfaceC6172a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final boolean zzo() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        MO mo = this.f20943i;
        return (mo == null || mo.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzp(C1897Sr c1897Sr) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        this.f20936b.zzo(c1897Sr);
    }
}
