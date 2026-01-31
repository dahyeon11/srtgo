package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2904gB implements InterfaceC1992Vc, WF, J1.w, VF {

    /* renamed from: a, reason: collision with root package name */
    private final C2216aB f19312a;

    /* renamed from: b, reason: collision with root package name */
    private final C2331bB f19313b;

    /* renamed from: d, reason: collision with root package name */
    private final C1359Fn f19315d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f19316e;

    /* renamed from: f, reason: collision with root package name */
    private final o2.f f19317f;

    /* renamed from: c, reason: collision with root package name */
    private final Set f19314c = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f19318g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final C2674eB f19319h = new C2674eB();

    /* renamed from: i, reason: collision with root package name */
    private boolean f19320i = false;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f19321j = new WeakReference(this);

    public C2904gB(C1236Cn c1236Cn, C2331bB c2331bB, Executor executor, C2216aB c2216aB, o2.f fVar) {
        this.f19312a = c2216aB;
        InterfaceC3768nn interfaceC3768nn = AbstractC4110qn.zza;
        this.f19315d = c1236Cn.zza("google.afma.activeView.handleUpdate", interfaceC3768nn, interfaceC3768nn);
        this.f19313b = c2331bB;
        this.f19316e = executor;
        this.f19317f = fVar;
    }

    private final void a() {
        Iterator it = this.f19314c.iterator();
        while (it.hasNext()) {
            this.f19312a.zzf((InterfaceC2065Wv) it.next());
        }
        this.f19312a.zze();
    }

    @Override // J1.w
    public final synchronized void zzdH() {
        this.f19319h.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final synchronized void zzdj(Context context) {
        this.f19319h.zze = "u";
        zzg();
        a();
        this.f19320i = true;
    }

    @Override // J1.w
    public final synchronized void zzdk() {
        this.f19319h.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final synchronized void zzdl(Context context) {
        this.f19319h.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final synchronized void zzdm(Context context) {
        this.f19319h.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final synchronized void zzdp(C1951Uc c1951Uc) {
        C2674eB c2674eB = this.f19319h;
        c2674eB.zza = c1951Uc.zzj;
        c2674eB.zzf = c1951Uc;
        zzg();
    }

    @Override // J1.w
    public final void zzdq() {
    }

    @Override // J1.w
    public final void zzdr() {
    }

    @Override // J1.w
    public final void zzdt() {
    }

    @Override // J1.w
    public final void zzdu(int i8) {
    }

    public final synchronized void zzg() {
        try {
            if (this.f19321j.get() == null) {
                zzj();
                return;
            }
            if (this.f19320i || !this.f19318g.get()) {
                return;
            }
            try {
                this.f19319h.zzd = this.f19317f.elapsedRealtime();
                final JSONObject jSONObjectZzb = this.f19313b.zzb(this.f19319h);
                for (final InterfaceC2065Wv interfaceC2065Wv : this.f19314c) {
                    this.f19316e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dB
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC2065Wv.zzl("AFMA_updateActiveView", jSONObjectZzb);
                        }
                    });
                }
                AbstractC5147zt.zzb(this.f19315d.zzb(jSONObjectZzb), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e8) {
                AbstractC0667v0.zzb("Failed to call ActiveViewJS", e8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzh(InterfaceC2065Wv interfaceC2065Wv) {
        this.f19314c.add(interfaceC2065Wv);
        this.f19312a.zzd(interfaceC2065Wv);
    }

    public final void zzi(Object obj) {
        this.f19321j = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        a();
        this.f19320i = true;
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final synchronized void zzr() {
        if (this.f19318g.compareAndSet(false, true)) {
            this.f19312a.zzc(this);
            zzg();
        }
    }
}
