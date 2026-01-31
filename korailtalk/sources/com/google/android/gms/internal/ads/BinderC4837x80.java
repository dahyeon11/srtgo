package com.google.android.gms.internal.ads;

import H1.C0545j0;
import H1.InterfaceC0521b0;
import H1.InterfaceC0533f0;
import H1.InterfaceC0554m0;
import android.content.Context;
import android.os.Bundle;
import i2.AbstractC5683p;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.x80 */
/* loaded from: classes2.dex */
public final class BinderC4837x80 extends H1.W implements J1.w, InterfaceC1503Jd {

    /* renamed from: a */
    private final AbstractC2302ax f23647a;

    /* renamed from: b */
    private final Context f23648b;

    /* renamed from: d */
    private final String f23650d;

    /* renamed from: e */
    private final C4153r80 f23651e;

    /* renamed from: f */
    private final C3926p80 f23652f;

    /* renamed from: g */
    private final L1.a f23653g;

    /* renamed from: h */
    private final LQ f23654h;

    /* renamed from: j */
    private C4272sB f23656j;

    /* renamed from: k */
    protected FB f23657k;

    /* renamed from: c */
    private AtomicBoolean f23649c = new AtomicBoolean();

    /* renamed from: i */
    private long f23655i = -1;

    public BinderC4837x80(AbstractC2302ax abstractC2302ax, Context context, String str, C4153r80 c4153r80, C3926p80 c3926p80, L1.a aVar, LQ lq) {
        this.f23647a = abstractC2302ax;
        this.f23648b = context;
        this.f23650d = str;
        this.f23651e = c4153r80;
        this.f23652f = c3926p80;
        this.f23653g = aVar;
        this.f23654h = lq;
        c3926p80.zzm(this);
    }

    private final synchronized void d(int i8) {
        try {
            if (this.f23649c.compareAndSet(false, true)) {
                this.f23652f.zzj();
                C4272sB c4272sB = this.f23656j;
                if (c4272sB != null) {
                    G1.u.zzb().zze(c4272sB);
                }
                if (this.f23657k != null) {
                    long jElapsedRealtime = -1;
                    if (this.f23655i != -1) {
                        jElapsedRealtime = G1.u.zzB().elapsedRealtime() - this.f23655i;
                    }
                    this.f23657k.zze(jElapsedRealtime, i8);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // H1.W, H1.X
    public final synchronized void zzA() {
    }

    @Override // H1.W, H1.X
    public final synchronized void zzB() {
        AbstractC5683p.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // H1.W, H1.X
    public final synchronized void zzF(H1.d2 d2Var) {
        AbstractC5683p.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // H1.W, H1.X
    public final void zzH(InterfaceC1871Sd interfaceC1871Sd) {
        this.f23652f.zzo(interfaceC1871Sd);
    }

    @Override // H1.W, H1.X
    public final void zzI(H1.j2 j2Var) {
        this.f23651e.zzl(j2Var);
    }

    @Override // H1.W, H1.X
    public final void zzL(boolean z8) {
    }

    @Override // H1.W, H1.X
    public final void zzM(InterfaceC2403bq interfaceC2403bq) {
    }

    @Override // H1.W, H1.X
    public final synchronized void zzN(boolean z8) {
    }

    @Override // H1.W, H1.X
    public final synchronized void zzO(InterfaceC1756Ph interfaceC1756Ph) {
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
    }

    @Override // H1.W, H1.X
    public final synchronized void zzX() {
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // H1.W, H1.X
    public final synchronized boolean zzZ() {
        return this.f23651e.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1503Jd
    public final void zza() {
        d(3);
    }

    @Override // H1.W, H1.X
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0024  */
    @Override // H1.W, H1.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(H1.Y1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC3872oi.zzd     // Catch: java.lang.Throwable -> L26
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
            goto L8a
        L28:
            L1.a r2 = r5.f23653g     // Catch: java.lang.Throwable -> L26
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
            android.content.Context r0 = r5.f23648b     // Catch: java.lang.Throwable -> L26
            boolean r0 = K1.K0.zzH(r0)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L67
            H1.d0 r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L55
            goto L67
        L55:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            L1.n.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.p80 r6 = r5.f23652f     // Catch: java.lang.Throwable -> L26
            r0 = 4
            r2 = 0
            H1.f1 r0 = com.google.android.gms.internal.ads.AbstractC4542ub0.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.zzdB(r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r1
        L67:
            boolean r0 = r5.zzZ()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L6f
            monitor-exit(r5)
            return r1
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            r5.f23649c = r0     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.v80 r0 = new com.google.android.gms.internal.ads.v80     // Catch: java.lang.Throwable -> L26
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.r80 r1 = r5.f23651e     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r5.f23650d     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.w80 r3 = new com.google.android.gms.internal.ads.w80     // Catch: java.lang.Throwable -> L26
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC4837x80.zzab(H1.Y1):boolean");
    }

    @Override // H1.W, H1.X
    public final synchronized void zzac(C0545j0 c0545j0) {
    }

    @Override // H1.W, H1.X
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // J1.w
    public final void zzdH() {
    }

    @Override // J1.w
    public final void zzdk() {
    }

    @Override // J1.w
    public final void zzdq() {
    }

    @Override // J1.w
    public final synchronized void zzdr() {
        if (this.f23657k != null) {
            this.f23655i = G1.u.zzB().elapsedRealtime();
            int iZza = this.f23657k.zza();
            if (iZza > 0) {
                C4272sB c4272sB = new C4272sB(this.f23647a.zzC(), G1.u.zzB());
                this.f23656j = c4272sB;
                c4272sB.zzd(iZza, new Runnable() { // from class: com.google.android.gms.internal.ads.u80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzp();
                    }
                });
            }
        }
    }

    @Override // J1.w
    public final synchronized void zzdt() {
        FB fb = this.f23657k;
        if (fb != null) {
            fb.zze(G1.u.zzB().elapsedRealtime() - this.f23655i, 1);
        }
    }

    @Override // J1.w
    public final void zzdu(int i8) {
        if (i8 == 0) {
            throw null;
        }
        int i9 = i8 - 1;
        if (i9 == 0) {
            d(2);
            return;
        }
        if (i9 == 1) {
            d(4);
        } else if (i9 != 2) {
            d(6);
        } else {
            d(3);
        }
    }

    @Override // H1.W, H1.X
    public final synchronized H1.d2 zzg() {
        return null;
    }

    @Override // H1.W, H1.X
    public final H1.J zzi() {
        return null;
    }

    @Override // H1.W, H1.X
    public final InterfaceC0533f0 zzj() {
        return null;
    }

    @Override // H1.W, H1.X
    public final synchronized H1.S0 zzk() {
        return null;
    }

    @Override // H1.W, H1.X
    public final synchronized H1.V0 zzl() {
        return null;
    }

    @Override // H1.W, H1.X
    public final InterfaceC6172a zzn() {
        return null;
    }

    final /* synthetic */ void zzo() {
        d(5);
    }

    public final void zzp() {
        this.f23647a.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.t80
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo();
            }
        });
    }

    @Override // H1.W, H1.X
    public final synchronized String zzr() {
        return this.f23650d;
    }

    @Override // H1.W, H1.X
    public final synchronized String zzs() {
        return null;
    }

    @Override // H1.W, H1.X
    public final synchronized String zzt() {
        return null;
    }

    @Override // H1.W, H1.X
    public final synchronized void zzx() {
        AbstractC5683p.checkMainThread("destroy must be called on the main UI thread.");
        FB fb = this.f23657k;
        if (fb != null) {
            fb.zzb();
        }
    }

    @Override // H1.W, H1.X
    public final synchronized void zzz() {
        AbstractC5683p.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // H1.W, H1.X
    public final void zzC(H1.G g8) {
    }

    @Override // H1.W, H1.X
    public final void zzD(H1.J j8) {
    }

    @Override // H1.W, H1.X
    public final void zzE(InterfaceC0521b0 interfaceC0521b0) {
    }

    @Override // H1.W, H1.X
    public final void zzG(InterfaceC0533f0 interfaceC0533f0) {
    }

    @Override // H1.W, H1.X
    public final void zzJ(InterfaceC0554m0 interfaceC0554m0) {
    }

    @Override // H1.W, H1.X
    public final void zzK(H1.Z0 z02) {
    }

    @Override // H1.W, H1.X
    public final void zzP(H1.L0 l02) {
    }

    @Override // H1.W, H1.X
    public final void zzW(InterfaceC6172a interfaceC6172a) {
    }

    @Override // H1.W, H1.X
    public final void zzy(H1.Y1 y12, H1.M m8) {
    }
}
