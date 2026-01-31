package i2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class v0 extends AbstractC5675h {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f31863f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Context f31864g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f31865h;

    /* renamed from: i, reason: collision with root package name */
    private final u0 f31866i;

    /* renamed from: j, reason: collision with root package name */
    private final n2.b f31867j;

    /* renamed from: k, reason: collision with root package name */
    private final long f31868k;

    /* renamed from: l, reason: collision with root package name */
    private final long f31869l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Executor f31870m;

    v0(Context context, Looper looper, Executor executor) {
        u0 u0Var = new u0(this, null);
        this.f31866i = u0Var;
        this.f31864g = context.getApplicationContext();
        this.f31865h = new z2.t(looper, u0Var);
        this.f31867j = n2.b.getInstance();
        this.f31868k = 5000L;
        this.f31869l = H0.q.MIN_PERIODIC_FLEX_MILLIS;
        this.f31870m = executor;
    }

    @Override // i2.AbstractC5675h
    protected final void a(q0 q0Var, ServiceConnection serviceConnection, String str) {
        AbstractC5683p.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f31863f) {
            try {
                s0 s0Var = (s0) this.f31863f.get(q0Var);
                if (s0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + q0Var.toString());
                }
                if (!s0Var.zzh(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + q0Var.toString());
                }
                s0Var.zzf(serviceConnection, str);
                if (s0Var.zzi()) {
                    this.f31865h.sendMessageDelayed(this.f31865h.obtainMessage(0, q0Var), this.f31868k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i2.AbstractC5675h
    protected final boolean b(q0 q0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zZzj;
        AbstractC5683p.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f31863f) {
            try {
                s0 s0Var = (s0) this.f31863f.get(q0Var);
                if (executor == null) {
                    executor = this.f31870m;
                }
                if (s0Var == null) {
                    s0Var = new s0(this, q0Var);
                    s0Var.zzd(serviceConnection, serviceConnection, str);
                    s0Var.zze(str, executor);
                    this.f31863f.put(q0Var, s0Var);
                } else {
                    this.f31865h.removeMessages(0, q0Var);
                    if (s0Var.zzh(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + q0Var.toString());
                    }
                    s0Var.zzd(serviceConnection, serviceConnection, str);
                    int iZza = s0Var.zza();
                    if (iZza == 1) {
                        serviceConnection.onServiceConnected(s0Var.zzb(), s0Var.zzc());
                    } else if (iZza == 2) {
                        s0Var.zze(str, executor);
                    }
                }
                zZzj = s0Var.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zZzj;
    }

    final void h(Executor executor) {
        synchronized (this.f31863f) {
            this.f31870m = executor;
        }
    }

    final void i(Looper looper) {
        synchronized (this.f31863f) {
            this.f31865h = new z2.t(looper, this.f31866i);
        }
    }
}
