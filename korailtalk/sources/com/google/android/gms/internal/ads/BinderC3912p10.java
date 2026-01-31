package com.google.android.gms.internal.ads;

import H1.C0545j0;
import H1.InterfaceC0521b0;
import H1.InterfaceC0533f0;
import H1.InterfaceC0554m0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import i2.AbstractC5683p;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.p10 */
/* loaded from: classes2.dex */
public final class BinderC3912p10 extends H1.W {

    /* renamed from: a */
    private final H1.d2 f21613a;

    /* renamed from: b */
    private final Context f21614b;

    /* renamed from: c */
    private final C4725w90 f21615c;

    /* renamed from: d */
    private final String f21616d;

    /* renamed from: e */
    private final L1.a f21617e;

    /* renamed from: f */
    private final C3000h10 f21618f;

    /* renamed from: g */
    private final X90 f21619g;

    /* renamed from: h */
    private final C2487cb f21620h;

    /* renamed from: i */
    private final LQ f21621i;

    /* renamed from: j */
    private C2463cK f21622j;

    /* renamed from: k */
    private boolean f21623k = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaE)).booleanValue();

    public BinderC3912p10(Context context, H1.d2 d2Var, String str, C4725w90 c4725w90, C3000h10 c3000h10, X90 x90, L1.a aVar, C2487cb c2487cb, LQ lq) {
        this.f21613a = d2Var;
        this.f21616d = str;
        this.f21614b = context;
        this.f21615c = c4725w90;
        this.f21618f = c3000h10;
        this.f21619g = x90;
        this.f21617e = aVar;
        this.f21620h = c2487cb;
        this.f21621i = lq;
    }

    private final synchronized boolean d() {
        C2463cK c2463cK = this.f21622j;
        if (c2463cK != null) {
            if (!c2463cK.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // H1.W, H1.X
    public final void zzA() {
    }

    @Override // H1.W, H1.X
    public final synchronized void zzB() {
        AbstractC5683p.checkMainThread("resume must be called on the main UI thread.");
        C2463cK c2463cK = this.f21622j;
        if (c2463cK != null) {
            c2463cK.zzm().zzc(null);
        }
    }

    @Override // H1.W, H1.X
    public final void zzD(H1.J j8) {
        AbstractC5683p.checkMainThread("setAdListener must be called on the main UI thread.");
        this.f21618f.zzj(j8);
    }

    @Override // H1.W, H1.X
    public final void zzE(InterfaceC0521b0 interfaceC0521b0) {
        AbstractC5683p.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // H1.W, H1.X
    public final void zzG(InterfaceC0533f0 interfaceC0533f0) {
        AbstractC5683p.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.f21618f.zzm(interfaceC0533f0);
    }

    @Override // H1.W, H1.X
    public final void zzH(InterfaceC1871Sd interfaceC1871Sd) {
    }

    @Override // H1.W, H1.X
    public final void zzJ(InterfaceC0554m0 interfaceC0554m0) {
        this.f21618f.zzn(interfaceC0554m0);
    }

    @Override // H1.W, H1.X
    public final synchronized void zzL(boolean z8) {
        AbstractC5683p.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f21623k = z8;
    }

    @Override // H1.W, H1.X
    public final void zzM(InterfaceC2403bq interfaceC2403bq) {
    }

    @Override // H1.W, H1.X
    public final void zzN(boolean z8) {
    }

    @Override // H1.W, H1.X
    public final synchronized void zzO(InterfaceC1756Ph interfaceC1756Ph) {
        AbstractC5683p.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f21615c.zzi(interfaceC1756Ph);
    }

    @Override // H1.W, H1.X
    public final void zzP(H1.L0 l02) {
        AbstractC5683p.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!l02.zzf()) {
                this.f21621i.zze();
            }
        } catch (RemoteException e8) {
            L1.n.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f21618f.zzl(l02);
    }

    @Override // H1.W, H1.X
    public final void zzQ(InterfaceC2746eq interfaceC2746eq, String str) {
    }

    @Override // H1.W, H1.X
    public final void zzR(String str) {
    }

    @Override // H1.W, H1.X
    public final void zzS(InterfaceC4801wr interfaceC4801wr) {
        this.f21619g.zzm(interfaceC4801wr);
    }

    @Override // H1.W, H1.X
    public final void zzT(String str) {
    }

    @Override // H1.W, H1.X
    public final synchronized void zzW(InterfaceC6172a interfaceC6172a) {
        if (this.f21622j == null) {
            L1.n.zzj("Interstitial can not be shown before loaded.");
            this.f21618f.zzq(AbstractC4542ub0.zzd(9, null, null));
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcH)).booleanValue()) {
            this.f21620h.zzc().zzn(new Throwable().getStackTrace());
        }
        this.f21622j.zzc(this.f21623k, (Activity) r2.b.unwrap(interfaceC6172a));
    }

    @Override // H1.W, H1.X
    public final synchronized void zzX() {
        AbstractC5683p.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.f21622j == null) {
            L1.n.zzj("Interstitial can not be shown before loaded.");
            this.f21618f.zzq(AbstractC4542ub0.zzd(9, null, null));
        } else {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcH)).booleanValue()) {
                this.f21620h.zzc().zzn(new Throwable().getStackTrace());
            }
            this.f21622j.zzc(this.f21623k, null);
        }
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzZ() {
        return this.f21615c.zza();
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzaa() {
        AbstractC5683p.checkMainThread("isLoaded must be called on the main UI thread.");
        return d();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0024  */
    @Override // H1.W, H1.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(H1.Y1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC3872oi.zzi     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzlg     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r0 = 1
            goto L28
        L24:
            r0 = r1
            goto L28
        L26:
            r6 = move-exception
            goto L8e
        L28:
            L1.a r2 = r5.f21617e     // Catch: java.lang.Throwable -> L26
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.kh r3 = com.google.android.gms.internal.ads.AbstractC4439th.zzlh     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.rh r4 = H1.C.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L26
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L26
            if (r2 < r3) goto L40
            if (r0 != 0) goto L45
        L40:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            i2.AbstractC5683p.checkMainThread(r0)     // Catch: java.lang.Throwable -> L26
        L45:
            G1.u.zzp()     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = r5.f21614b     // Catch: java.lang.Throwable -> L26
            boolean r0 = K1.K0.zzH(r0)     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r0 == 0) goto L67
            H1.d0 r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L67
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            L1.n.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.h10 r6 = r5.f21618f     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L8c
            r0 = 4
            H1.f1 r0 = com.google.android.gms.internal.ads.AbstractC4542ub0.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.zzdB(r0)     // Catch: java.lang.Throwable -> L26
            goto L8c
        L67:
            boolean r0 = r5.d()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L8c
            android.content.Context r0 = r5.f21614b     // Catch: java.lang.Throwable -> L26
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.AbstractC3973pb0.zza(r0, r1)     // Catch: java.lang.Throwable -> L26
            r5.f21622j = r2     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.w90 r0 = r5.f21615c     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r5.f21616d     // Catch: java.lang.Throwable -> L26
            H1.d2 r2 = r5.f21613a     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.p90 r3 = new com.google.android.gms.internal.ads.p90     // Catch: java.lang.Throwable -> L26
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.o10 r2 = new com.google.android.gms.internal.ads.o10     // Catch: java.lang.Throwable -> L26
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8c:
            monitor-exit(r5)
            return r1
        L8e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC3912p10.zzab(H1.Y1):boolean");
    }

    @Override // H1.W, H1.X
    public final Bundle zzd() {
        AbstractC5683p.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // H1.W, H1.X
    public final H1.d2 zzg() {
        return null;
    }

    @Override // H1.W, H1.X
    public final H1.J zzi() {
        return this.f21618f.zzg();
    }

    @Override // H1.W, H1.X
    public final InterfaceC0533f0 zzj() {
        return this.f21618f.zzi();
    }

    @Override // H1.W, H1.X
    public final synchronized H1.S0 zzk() {
        C2463cK c2463cK;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgW)).booleanValue() && (c2463cK = this.f21622j) != null) {
            return c2463cK.zzl();
        }
        return null;
    }

    @Override // H1.W, H1.X
    public final H1.V0 zzl() {
        return null;
    }

    @Override // H1.W, H1.X
    public final InterfaceC6172a zzn() {
        return null;
    }

    @Override // H1.W, H1.X
    public final synchronized String zzr() {
        return this.f21616d;
    }

    @Override // H1.W, H1.X
    public final synchronized String zzs() {
        C2463cK c2463cK = this.f21622j;
        if (c2463cK == null || c2463cK.zzl() == null) {
            return null;
        }
        return c2463cK.zzl().zzg();
    }

    @Override // H1.W, H1.X
    public final synchronized String zzt() {
        C2463cK c2463cK = this.f21622j;
        if (c2463cK == null || c2463cK.zzl() == null) {
            return null;
        }
        return c2463cK.zzl().zzg();
    }

    @Override // H1.W, H1.X
    public final synchronized void zzx() {
        AbstractC5683p.checkMainThread("destroy must be called on the main UI thread.");
        C2463cK c2463cK = this.f21622j;
        if (c2463cK != null) {
            c2463cK.zzm().zza(null);
        }
    }

    @Override // H1.W, H1.X
    public final void zzy(H1.Y1 y12, H1.M m8) {
        this.f21618f.zzk(m8);
        zzab(y12);
    }

    @Override // H1.W, H1.X
    public final synchronized void zzz() {
        AbstractC5683p.checkMainThread("pause must be called on the main UI thread.");
        C2463cK c2463cK = this.f21622j;
        if (c2463cK != null) {
            c2463cK.zzm().zzb(null);
        }
    }

    @Override // H1.W, H1.X
    public final void zzC(H1.G g8) {
    }

    @Override // H1.W, H1.X
    public final void zzF(H1.d2 d2Var) {
    }

    @Override // H1.W, H1.X
    public final void zzI(H1.j2 j2Var) {
    }

    @Override // H1.W, H1.X
    public final void zzK(H1.Z0 z02) {
    }

    @Override // H1.W, H1.X
    public final void zzU(H1.R1 r12) {
    }

    @Override // H1.W, H1.X
    public final void zzac(C0545j0 c0545j0) {
    }
}
