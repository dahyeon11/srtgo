package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class DC extends MB {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC2006Vj f12648j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f12649k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f12650l;

    public DC(XC xc, InterfaceC2006Vj interfaceC2006Vj, Runnable runnable, Executor executor) {
        super(xc);
        this.f12648j = interfaceC2006Vj;
        this.f12649k = runnable;
        this.f12650l = executor;
    }

    static /* synthetic */ void a(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    final /* synthetic */ void b(Runnable runnable) {
        try {
            if (this.f12648j.zze(r2.b.wrap(runnable))) {
                return;
            }
            a(((BC) runnable).zza);
        } catch (RemoteException unused) {
            a(((BC) runnable).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final H1.V0 zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final C4768wa0 zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final C4768wa0 zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void zzj() {
        final BC bc = new BC(new AtomicReference(this.f12649k));
        this.f12650l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.CC
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b(bc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final void zzh(ViewGroup viewGroup, H1.d2 d2Var) {
    }
}
