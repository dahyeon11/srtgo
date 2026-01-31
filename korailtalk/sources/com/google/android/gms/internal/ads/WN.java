package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import i2.AbstractC5683p;
import java.util.Collections;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class WN extends AbstractBinderC3538lm implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC1717Oi {

    /* renamed from: a, reason: collision with root package name */
    private View f16984a;

    /* renamed from: b, reason: collision with root package name */
    private H1.V0 f16985b;

    /* renamed from: c, reason: collision with root package name */
    private NL f16986c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16987d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16988e = false;

    public WN(NL nl, SL sl) {
        this.f16984a = sl.zzf();
        this.f16985b = sl.zzj();
        this.f16986c = nl;
        if (sl.zzs() != null) {
            sl.zzs().zzap(this);
        }
    }

    private static final void b(InterfaceC3994pm interfaceC3994pm, int i8) {
        try {
            interfaceC3994pm.zze(i8);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    private final void zzg() {
        View view;
        NL nl = this.f16986c;
        if (nl == null || (view = this.f16984a) == null) {
            return;
        }
        nl.zzB(view, Collections.emptyMap(), Collections.emptyMap(), NL.zzX(this.f16984a));
    }

    private final void zzh() {
        View view = this.f16984a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f16984a);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3538lm, com.google.android.gms.internal.ads.InterfaceC3652mm
    public final H1.V0 zzb() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.f16987d) {
            return this.f16985b;
        }
        L1.n.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3538lm, com.google.android.gms.internal.ads.InterfaceC3652mm
    public final InterfaceC2168Zi zzc() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f16987d) {
            L1.n.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        NL nl = this.f16986c;
        if (nl == null || nl.zzc() == null) {
            return null;
        }
        return nl.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3538lm, com.google.android.gms.internal.ads.InterfaceC3652mm
    public final void zzd() {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        NL nl = this.f16986c;
        if (nl != null) {
            nl.zzb();
        }
        this.f16986c = null;
        this.f16984a = null;
        this.f16985b = null;
        this.f16987d = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3538lm, com.google.android.gms.internal.ads.InterfaceC3652mm
    public final void zze(InterfaceC6172a interfaceC6172a) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(interfaceC6172a, new VN(this));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3538lm, com.google.android.gms.internal.ads.InterfaceC3652mm
    public final void zzf(InterfaceC6172a interfaceC6172a, InterfaceC3994pm interfaceC3994pm) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f16987d) {
            L1.n.zzg("Instream ad can not be shown after destroy().");
            b(interfaceC3994pm, 2);
            return;
        }
        View view = this.f16984a;
        if (view == null || this.f16985b == null) {
            L1.n.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            b(interfaceC3994pm, 0);
            return;
        }
        if (this.f16988e) {
            L1.n.zzg("Instream ad should not be used again.");
            b(interfaceC3994pm, 1);
            return;
        }
        this.f16988e = true;
        zzh();
        ((ViewGroup) r2.b.unwrap(interfaceC6172a)).addView(this.f16984a, new ViewGroup.LayoutParams(-1, -1));
        G1.u.zzx();
        C1531Jt.zza(this.f16984a, this);
        G1.u.zzx();
        C1531Jt.zzb(this.f16984a, this);
        zzg();
        try {
            interfaceC3994pm.zzf();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
