package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import i2.AbstractC5670c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2608de {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledFuture f18650a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f18651b = new RunnableC2158Zd(this);

    /* renamed from: c, reason: collision with root package name */
    private final Object f18652c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private C2952ge f18653d;

    /* renamed from: e, reason: collision with root package name */
    private Context f18654e;

    /* renamed from: f, reason: collision with root package name */
    private C3408ke f18655f;

    static /* bridge */ /* synthetic */ void f(C2608de c2608de) {
        synchronized (c2608de.f18652c) {
            try {
                C2952ge c2952ge = c2608de.f18653d;
                if (c2952ge == null) {
                    return;
                }
                if (c2952ge.isConnected() || c2608de.f18653d.isConnecting()) {
                    c2608de.f18653d.disconnect();
                }
                c2608de.f18653d = null;
                c2608de.f18655f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        synchronized (this.f18652c) {
            try {
                if (this.f18654e != null && this.f18653d == null) {
                    C2952ge c2952geB = b(new C2379be(this), new C2493ce(this));
                    this.f18653d = c2952geB;
                    c2952geB.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    protected final synchronized C2952ge b(AbstractC5670c.a aVar, AbstractC5670c.b bVar) {
        return new C2952ge(this.f18654e, G1.u.zzt().zzb(), aVar, bVar);
    }

    public final long zza(C3067he c3067he) {
        synchronized (this.f18652c) {
            try {
                if (this.f18655f == null) {
                    return -2L;
                }
                if (this.f18653d.zzp()) {
                    try {
                        return this.f18655f.zze(c3067he);
                    } catch (RemoteException e8) {
                        L1.n.zzh("Unable to call into cache service.", e8);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2722ee zzb(C3067he c3067he) {
        synchronized (this.f18652c) {
            if (this.f18655f == null) {
                return new C2722ee();
            }
            try {
                if (this.f18653d.zzp()) {
                    return this.f18655f.zzg(c3067he);
                }
                return this.f18655f.zzf(c3067he);
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call into cache service.", e8);
                return new C2722ee();
            }
        }
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f18652c) {
            try {
                if (this.f18654e != null) {
                    return;
                }
                this.f18654e = context.getApplicationContext();
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzek)).booleanValue()) {
                    h();
                } else {
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzej)).booleanValue()) {
                        G1.u.zzb().zzc(new C2264ae(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzel)).booleanValue()) {
            synchronized (this.f18652c) {
                try {
                    h();
                    ScheduledFuture scheduledFuture = this.f18650a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f18650a = AbstractC4805wt.zzd.schedule(this.f18651b, ((Long) H1.C.zzc().zza(AbstractC4439th.zzem)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
