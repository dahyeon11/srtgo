package com.google.android.gms.internal.ads;

import H1.InterfaceC0521b0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import i2.AbstractC5683p;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.sa0 */
/* loaded from: classes2.dex */
public final class BinderC4312sa0 extends AbstractBinderC4345sr {

    /* renamed from: a */
    private final C3175ia0 f22662a;

    /* renamed from: b */
    private final X90 f22663b;

    /* renamed from: c */
    private final C1498Ja0 f22664c;

    /* renamed from: d */
    private MO f22665d;

    /* renamed from: e */
    private boolean f22666e = false;

    public BinderC4312sa0(C3175ia0 c3175ia0, X90 x90, C1498Ja0 c1498Ja0) {
        this.f22662a = c3175ia0;
        this.f22663b = x90;
        this.f22664c = c1498Ja0;
    }

    private final synchronized boolean e() {
        MO mo = this.f22665d;
        if (mo != null) {
            if (!mo.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final Bundle zzb() {
        AbstractC5683p.checkMainThread("getAdMetadata can only be called from the UI thread.");
        MO mo = this.f22665d;
        return mo != null ? mo.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized H1.S0 zzc() {
        MO mo;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgW)).booleanValue() && (mo = this.f22665d) != null) {
            return mo.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized String zzd() {
        MO mo = this.f22665d;
        if (mo == null || mo.zzl() == null) {
            return null;
        }
        return mo.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final void zze() {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzf(InterfaceC6172a interfaceC6172a) {
        AbstractC5683p.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.f22663b.zzg(null);
        if (this.f22665d != null) {
            if (interfaceC6172a != null) {
                context = (Context) r2.b.unwrap(interfaceC6172a);
            }
            this.f22665d.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0042, code lost:
    
        if (((java.lang.Boolean) H1.C.zzc().zza(com.google.android.gms.internal.ads.AbstractC4439th.zzfz)).booleanValue() == false) goto L47;
     */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.C4915xr r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            i2.AbstractC5683p.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzfx     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.mt r2 = G1.u.zzo()     // Catch: java.lang.Throwable -> L20
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.e()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzfz     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.Z90 r0 = new com.google.android.gms.internal.ads.Z90     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.f22665d = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.ia0 r1 = r4.f22662a     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.g(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.ia0 r1 = r4.f22662a     // Catch: java.lang.Throwable -> L20
            H1.Y1 r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.qa0 r3 = new com.google.android.gms.internal.ads.qa0     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC4312sa0.zzg(com.google.android.gms.internal.ads.xr):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzi(InterfaceC6172a interfaceC6172a) {
        AbstractC5683p.checkMainThread("pause must be called on the main UI thread.");
        if (this.f22665d != null) {
            this.f22665d.zzm().zzb(interfaceC6172a == null ? null : (Context) r2.b.unwrap(interfaceC6172a));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzk(InterfaceC6172a interfaceC6172a) {
        AbstractC5683p.checkMainThread("resume must be called on the main UI thread.");
        if (this.f22665d != null) {
            this.f22665d.zzm().zzc(interfaceC6172a == null ? null : (Context) r2.b.unwrap(interfaceC6172a));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final void zzl(InterfaceC0521b0 interfaceC0521b0) {
        AbstractC5683p.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (interfaceC0521b0 == null) {
            this.f22663b.zzg(null);
        } else {
            this.f22663b.zzg(new C4198ra0(this, interfaceC0521b0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzm(String str) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.f22664c.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzn(boolean z8) {
        AbstractC5683p.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f22666e = z8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final void zzo(InterfaceC4801wr interfaceC4801wr) {
        AbstractC5683p.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f22663b.zzm(interfaceC4801wr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzp(String str) {
        AbstractC5683p.checkMainThread("setUserId must be called on the main UI thread.");
        this.f22664c.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzq() {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final synchronized void zzr(InterfaceC6172a interfaceC6172a) {
        try {
            AbstractC5683p.checkMainThread("showAd must be called on the main UI thread.");
            if (this.f22665d != null) {
                Activity activity = null;
                if (interfaceC6172a != null) {
                    Object objUnwrap = r2.b.unwrap(interfaceC6172a);
                    if (objUnwrap instanceof Activity) {
                        activity = (Activity) objUnwrap;
                    }
                }
                this.f22665d.zzh(this.f22666e, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final boolean zzs() {
        AbstractC5683p.checkMainThread("isLoaded must be called on the main UI thread.");
        return e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final boolean zzt() {
        MO mo = this.f22665d;
        return mo != null && mo.zzg();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4345sr, com.google.android.gms.internal.ads.InterfaceC4459tr
    public final void zzu(C4231rr c4231rr) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f22663b.zzn(c4231rr);
    }
}
