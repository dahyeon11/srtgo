package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3748nd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3862od f21329a;

    RunnableC3748nd(C3862od c3862od) {
        this.f21329a = c3862od;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f21329a.f21517c) {
            C3862od c3862od = this.f21329a;
            if (c3862od.f21518d && c3862od.f21519e) {
                c3862od.f21518d = false;
                L1.n.zze("App went background");
                Iterator it = this.f21329a.f21520f.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC3976pd) it.next()).zza(false);
                    } catch (Exception e8) {
                        L1.n.zzh("", e8);
                    }
                }
            } else {
                L1.n.zze("App is still foreground");
            }
        }
    }
}
