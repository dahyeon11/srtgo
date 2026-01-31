package com.google.android.gms.internal.ads;

import H1.C0545j0;
import H1.InterfaceC0521b0;
import H1.InterfaceC0533f0;
import H1.InterfaceC0554m0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i2.AbstractC5683p;
import java.util.Collections;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class H00 extends H1.W {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13226a;

    /* renamed from: b, reason: collision with root package name */
    private final H1.J f13227b;

    /* renamed from: c, reason: collision with root package name */
    private final C1825Ra0 f13228c;

    /* renamed from: d, reason: collision with root package name */
    private final MB f13229d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f13230e;

    /* renamed from: f, reason: collision with root package name */
    private final LQ f13231f;

    public H00(Context context, H1.J j8, C1825Ra0 c1825Ra0, MB mb, LQ lq) {
        this.f13226a = context;
        this.f13227b = j8;
        this.f13228c = c1825Ra0;
        this.f13229d = mb;
        this.f13231f = lq;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZzc = mb.zzc();
        G1.u.zzp();
        frameLayout.addView(viewZzc, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.f13230e = frameLayout;
    }

    @Override // H1.W, H1.X
    public final void zzA() {
        this.f13229d.zzg();
    }

    @Override // H1.W, H1.X
    public final void zzB() {
        AbstractC5683p.checkMainThread("destroy must be called on the main UI thread.");
        this.f13229d.zzm().zzc(null);
    }

    @Override // H1.W, H1.X
    public final void zzC(H1.G g8) {
        L1.n.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // H1.W, H1.X
    public final void zzD(H1.J j8) {
        L1.n.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // H1.W, H1.X
    public final void zzE(InterfaceC0521b0 interfaceC0521b0) {
        L1.n.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // H1.W, H1.X
    public final void zzF(H1.d2 d2Var) {
        AbstractC5683p.checkMainThread("setAdSize must be called on the main UI thread.");
        MB mb = this.f13229d;
        if (mb != null) {
            mb.zzh(this.f13230e, d2Var);
        }
    }

    @Override // H1.W, H1.X
    public final void zzG(InterfaceC0533f0 interfaceC0533f0) {
        C3000h10 c3000h10 = this.f13228c.zzc;
        if (c3000h10 != null) {
            c3000h10.zzm(interfaceC0533f0);
        }
    }

    @Override // H1.W, H1.X
    public final void zzH(InterfaceC1871Sd interfaceC1871Sd) {
    }

    @Override // H1.W, H1.X
    public final void zzL(boolean z8) {
    }

    @Override // H1.W, H1.X
    public final void zzM(InterfaceC2403bq interfaceC2403bq) {
    }

    @Override // H1.W, H1.X
    public final void zzN(boolean z8) {
        L1.n.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // H1.W, H1.X
    public final void zzO(InterfaceC1756Ph interfaceC1756Ph) {
        L1.n.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // H1.W, H1.X
    public final void zzP(H1.L0 l02) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlE)).booleanValue()) {
            L1.n.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        C3000h10 c3000h10 = this.f13228c.zzc;
        if (c3000h10 != null) {
            try {
                if (!l02.zzf()) {
                    this.f13231f.zze();
                }
            } catch (RemoteException e8) {
                L1.n.zzf("Error in making CSI ping for reporting paid event callback", e8);
            }
            c3000h10.zzl(l02);
        }
    }

    @Override // H1.W, H1.X
    public final void zzQ(InterfaceC2746eq interfaceC2746eq, String str) {
    }

    @Override // H1.W, H1.X
    public final void zzR(String str) {
    }

    @Override // H1.W, H1.X
    public final void zzS(InterfaceC4801wr interfaceC4801wr) {
    }

    @Override // H1.W, H1.X
    public final void zzT(String str) {
    }

    @Override // H1.W, H1.X
    public final void zzU(H1.R1 r12) {
        L1.n.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // H1.W, H1.X
    public final void zzX() {
    }

    @Override // H1.W, H1.X
    public final boolean zzY() {
        MB mb = this.f13229d;
        return mb != null && mb.zzr();
    }

    @Override // H1.W, H1.X
    public final boolean zzZ() {
        return false;
    }

    @Override // H1.W, H1.X
    public final boolean zzaa() {
        return false;
    }

    @Override // H1.W, H1.X
    public final boolean zzab(H1.Y1 y12) {
        L1.n.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // H1.W, H1.X
    public final void zzac(C0545j0 c0545j0) {
        L1.n.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // H1.W, H1.X
    public final Bundle zzd() {
        L1.n.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // H1.W, H1.X
    public final H1.d2 zzg() {
        AbstractC5683p.checkMainThread("getAdSize must be called on the main UI thread.");
        return AbstractC2071Xa0.zza(this.f13226a, Collections.singletonList(this.f13229d.zze()));
    }

    @Override // H1.W, H1.X
    public final H1.J zzi() {
        return this.f13227b;
    }

    @Override // H1.W, H1.X
    public final InterfaceC0533f0 zzj() {
        return this.f13228c.zzn;
    }

    @Override // H1.W, H1.X
    public final H1.S0 zzk() {
        return this.f13229d.zzl();
    }

    @Override // H1.W, H1.X
    public final H1.V0 zzl() {
        return this.f13229d.zzd();
    }

    @Override // H1.W, H1.X
    public final InterfaceC6172a zzn() {
        return r2.b.wrap(this.f13230e);
    }

    @Override // H1.W, H1.X
    public final String zzr() {
        return this.f13228c.zzf;
    }

    @Override // H1.W, H1.X
    public final String zzs() {
        if (this.f13229d.zzl() != null) {
            return this.f13229d.zzl().zzg();
        }
        return null;
    }

    @Override // H1.W, H1.X
    public final String zzt() {
        if (this.f13229d.zzl() != null) {
            return this.f13229d.zzl().zzg();
        }
        return null;
    }

    @Override // H1.W, H1.X
    public final void zzx() {
        AbstractC5683p.checkMainThread("destroy must be called on the main UI thread.");
        this.f13229d.zzb();
    }

    @Override // H1.W, H1.X
    public final void zzz() {
        AbstractC5683p.checkMainThread("destroy must be called on the main UI thread.");
        this.f13229d.zzm().zzb(null);
    }

    @Override // H1.W, H1.X
    public final void zzI(H1.j2 j2Var) {
    }

    @Override // H1.W, H1.X
    public final void zzJ(InterfaceC0554m0 interfaceC0554m0) {
    }

    @Override // H1.W, H1.X
    public final void zzK(H1.Z0 z02) {
    }

    @Override // H1.W, H1.X
    public final void zzW(InterfaceC6172a interfaceC6172a) {
    }

    @Override // H1.W, H1.X
    public final void zzy(H1.Y1 y12, H1.M m8) {
    }
}
