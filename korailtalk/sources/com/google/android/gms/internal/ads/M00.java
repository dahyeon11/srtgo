package com.google.android.gms.internal.ads;

import H1.C0545j0;
import H1.InterfaceC0521b0;
import H1.InterfaceC0533f0;
import H1.InterfaceC0554m0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import i2.AbstractC5683p;
import java.util.Collections;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class M00 extends H1.W implements TG {

    /* renamed from: a */
    private final Context f14512a;

    /* renamed from: b */
    private final E80 f14513b;

    /* renamed from: c */
    private final String f14514c;

    /* renamed from: d */
    private final C3000h10 f14515d;

    /* renamed from: e */
    private H1.d2 f14516e;

    /* renamed from: f */
    private final C1743Pa0 f14517f;

    /* renamed from: g */
    private final L1.a f14518g;

    /* renamed from: h */
    private final LQ f14519h;

    /* renamed from: i */
    private MB f14520i;

    public M00(Context context, H1.d2 d2Var, String str, E80 e80, C3000h10 c3000h10, L1.a aVar, LQ lq) {
        this.f14512a = context;
        this.f14513b = e80;
        this.f14516e = d2Var;
        this.f14514c = str;
        this.f14515d = c3000h10;
        this.f14517f = e80.zzi();
        this.f14518g = aVar;
        this.f14519h = lq;
        e80.zzp(this);
    }

    private final synchronized void d(H1.d2 d2Var) {
        this.f14517f.zzs(d2Var);
        this.f14517f.zzy(this.f14516e.zzn);
    }

    private final synchronized boolean e(H1.Y1 y12) {
        try {
            if (f()) {
                AbstractC5683p.checkMainThread("loadAd must be called on the main UI thread.");
            }
            G1.u.zzp();
            if (!K1.K0.zzH(this.f14512a) || y12.zzs != null) {
                AbstractC3973pb0.zza(this.f14512a, y12.zzf);
                return this.f14513b.zzb(y12, this.f14514c, null, new L00(this));
            }
            L1.n.zzg("Failed to load the ad because app ID is missing.");
            C3000h10 c3000h10 = this.f14515d;
            if (c3000h10 != null) {
                c3000h10.zzdB(AbstractC4542ub0.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean f() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC3872oi.zzf
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzlg
            com.google.android.gms.internal.ads.rh r3 = H1.C.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            L1.a r3 = r6.f14518g
            int r3 = r3.clientJarVersion
            com.google.android.gms.internal.ads.kh r4 = com.google.android.gms.internal.ads.AbstractC4439th.zzlh
            com.google.android.gms.internal.ads.rh r5 = H1.C.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M00.f():boolean");
    }

    @Override // H1.W, H1.X
    public final synchronized void zzA() {
        AbstractC5683p.checkMainThread("recordManualImpression must be called on the main UI thread.");
        MB mb = this.f14520i;
        if (mb != null) {
            mb.zzg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:27:0x0001, B:29:0x000f, B:31:0x0021, B:37:0x003f, B:39:0x0043, B:36:0x003a), top: B:46:0x0001 }] */
    @Override // H1.W, H1.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC3872oi.zzh     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzlc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            L1.a r0 = r3.f14518g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzli     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            i2.AbstractC5683p.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.MB r0 = r3.f14520i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.aG r0 = r0.zzm()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M00.zzB():void");
    }

    @Override // H1.W, H1.X
    public final void zzC(H1.G g8) {
        if (f()) {
            AbstractC5683p.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.f14513b.zzo(g8);
    }

    @Override // H1.W, H1.X
    public final void zzD(H1.J j8) {
        if (f()) {
            AbstractC5683p.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.f14515d.zzj(j8);
    }

    @Override // H1.W, H1.X
    public final void zzE(InterfaceC0521b0 interfaceC0521b0) {
        AbstractC5683p.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // H1.W, H1.X
    public final synchronized void zzF(H1.d2 d2Var) {
        AbstractC5683p.checkMainThread("setAdSize must be called on the main UI thread.");
        this.f14517f.zzs(d2Var);
        this.f14516e = d2Var;
        MB mb = this.f14520i;
        if (mb != null) {
            mb.zzh(this.f14513b.zzd(), d2Var);
        }
    }

    @Override // H1.W, H1.X
    public final void zzG(InterfaceC0533f0 interfaceC0533f0) {
        if (f()) {
            AbstractC5683p.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.f14515d.zzm(interfaceC0533f0);
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
    public final synchronized void zzN(boolean z8) {
        try {
            if (f()) {
                AbstractC5683p.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f14517f.zzB(z8);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // H1.W, H1.X
    public final synchronized void zzO(InterfaceC1756Ph interfaceC1756Ph) {
        AbstractC5683p.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f14513b.zzq(interfaceC1756Ph);
    }

    @Override // H1.W, H1.X
    public final void zzP(H1.L0 l02) {
        if (f()) {
            AbstractC5683p.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!l02.zzf()) {
                this.f14519h.zze();
            }
        } catch (RemoteException e8) {
            L1.n.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f14515d.zzl(l02);
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
    public final synchronized void zzU(H1.R1 r12) {
        try {
            if (f()) {
                AbstractC5683p.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.f14517f.zzI(r12);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // H1.W, H1.X
    public final void zzX() {
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzY() {
        MB mb = this.f14520i;
        if (mb != null) {
            if (mb.zzr()) {
                return true;
            }
        }
        return false;
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzZ() {
        return this.f14513b.zza();
    }

    @Override // com.google.android.gms.internal.ads.TG
    public final synchronized void zza() {
        try {
            if (!this.f14513b.zzr()) {
                this.f14513b.zzn();
                return;
            }
            H1.d2 d2VarZzh = this.f14517f.zzh();
            MB mb = this.f14520i;
            if (mb != null && mb.zzf() != null && this.f14517f.zzS()) {
                d2VarZzh = AbstractC2071Xa0.zza(this.f14512a, Collections.singletonList(this.f14520i.zzf()));
            }
            d(d2VarZzh);
            this.f14517f.zzx(true);
            try {
                e(this.f14517f.zzf());
            } catch (RemoteException unused) {
                L1.n.zzj("Failed to refresh the banner ad.");
            }
            this.f14517f.zzx(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // H1.W, H1.X
    public final boolean zzaa() {
        return false;
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzab(H1.Y1 y12) {
        d(this.f14516e);
        return e(y12);
    }

    @Override // H1.W, H1.X
    public final synchronized void zzac(C0545j0 c0545j0) {
        AbstractC5683p.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.f14517f.zzU(c0545j0);
    }

    @Override // H1.W, H1.X
    public final Bundle zzd() {
        AbstractC5683p.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // H1.W, H1.X
    public final synchronized H1.d2 zzg() {
        AbstractC5683p.checkMainThread("getAdSize must be called on the main UI thread.");
        MB mb = this.f14520i;
        if (mb != null) {
            return AbstractC2071Xa0.zza(this.f14512a, Collections.singletonList(mb.zze()));
        }
        return this.f14517f.zzh();
    }

    @Override // H1.W, H1.X
    public final H1.J zzi() {
        return this.f14515d.zzg();
    }

    @Override // H1.W, H1.X
    public final InterfaceC0533f0 zzj() {
        return this.f14515d.zzi();
    }

    @Override // H1.W, H1.X
    public final synchronized H1.S0 zzk() {
        MB mb;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgW)).booleanValue() && (mb = this.f14520i) != null) {
            return mb.zzl();
        }
        return null;
    }

    @Override // H1.W, H1.X
    public final synchronized H1.V0 zzl() {
        AbstractC5683p.checkMainThread("getVideoController must be called from the main thread.");
        MB mb = this.f14520i;
        if (mb == null) {
            return null;
        }
        return mb.zzd();
    }

    @Override // H1.W, H1.X
    public final InterfaceC6172a zzn() {
        if (f()) {
            AbstractC5683p.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return r2.b.wrap(this.f14513b.zzd());
    }

    @Override // H1.W, H1.X
    public final synchronized String zzr() {
        return this.f14514c;
    }

    @Override // H1.W, H1.X
    public final synchronized String zzs() {
        MB mb = this.f14520i;
        if (mb == null || mb.zzl() == null) {
            return null;
        }
        return mb.zzl().zzg();
    }

    @Override // H1.W, H1.X
    public final synchronized String zzt() {
        MB mb = this.f14520i;
        if (mb == null || mb.zzl() == null) {
            return null;
        }
        return mb.zzl().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:27:0x0001, B:29:0x000f, B:31:0x0021, B:37:0x003f, B:39:0x0043, B:36:0x003a), top: B:46:0x0001 }] */
    @Override // H1.W, H1.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC3872oi.zze     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzld     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            L1.a r0 = r3.f14518g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzli     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            i2.AbstractC5683p.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.MB r0 = r3.f14520i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.zzb()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M00.zzx():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:27:0x0001, B:29:0x000f, B:31:0x0021, B:37:0x003f, B:39:0x0043, B:36:0x003a), top: B:46:0x0001 }] */
    @Override // H1.W, H1.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC3872oi.zzg     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzle     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            L1.a r0 = r3.f14518g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzli     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            i2.AbstractC5683p.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.MB r0 = r3.f14520i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.aG r0 = r0.zzm()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M00.zzz():void");
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
