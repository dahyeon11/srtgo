package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qd */
/* loaded from: classes2.dex */
public final class C4090qd {

    /* renamed from: a */
    private final Object f21964a = new Object();

    /* renamed from: b */
    private C3862od f21965b = null;

    /* renamed from: c */
    private boolean f21966c = false;

    public final Activity zza() {
        synchronized (this.f21964a) {
            try {
                C3862od c3862od = this.f21965b;
                if (c3862od == null) {
                    return null;
                }
                return c3862od.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zzb() {
        synchronized (this.f21964a) {
            try {
                C3862od c3862od = this.f21965b;
                if (c3862od == null) {
                    return null;
                }
                return c3862od.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(InterfaceC3976pd interfaceC3976pd) {
        synchronized (this.f21964a) {
            try {
                if (this.f21965b == null) {
                    this.f21965b = new C3862od();
                }
                this.f21965b.zzf(interfaceC3976pd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Context context) {
        synchronized (this.f21964a) {
            try {
                if (!this.f21966c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        L1.n.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.f21965b == null) {
                        this.f21965b = new C3862od();
                    }
                    this.f21965b.zzg(application, context);
                    this.f21966c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(InterfaceC3976pd interfaceC3976pd) {
        synchronized (this.f21964a) {
            try {
                C3862od c3862od = this.f21965b;
                if (c3862od == null) {
                    return;
                }
                c3862od.zzh(interfaceC3976pd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
