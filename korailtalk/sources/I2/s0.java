package i2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s0 implements ServiceConnection, w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f31853a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f31854b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31855c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f31856d;

    /* renamed from: e, reason: collision with root package name */
    private final q0 f31857e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f31858f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ v0 f31859g;

    public s0(v0 v0Var, q0 q0Var) {
        this.f31859g = v0Var;
        this.f31857e = q0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f31859g.f31863f) {
            try {
                this.f31859g.f31865h.removeMessages(1, this.f31857e);
                this.f31856d = iBinder;
                this.f31858f = componentName;
                Iterator it = this.f31853a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f31854b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f31859g.f31863f) {
            try {
                this.f31859g.f31865h.removeMessages(1, this.f31857e);
                this.f31856d = null;
                this.f31858f = componentName;
                Iterator it = this.f31853a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f31854b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        return this.f31854b;
    }

    public final ComponentName zzb() {
        return this.f31858f;
    }

    public final IBinder zzc() {
        return this.f31856d;
    }

    public final void zzd(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f31853a.put(serviceConnection, serviceConnection2);
    }

    public final void zze(String str, Executor executor) {
        this.f31854b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (o2.n.isAtLeastS()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            v0 v0Var = this.f31859g;
            boolean zZza = v0Var.f31867j.zza(v0Var.f31864g, str, this.f31857e.zzb(v0Var.f31864g), this, 4225, executor);
            this.f31855c = zZza;
            if (zZza) {
                this.f31859g.f31865h.sendMessageDelayed(this.f31859g.f31865h.obtainMessage(1, this.f31857e), this.f31859g.f31869l);
            } else {
                this.f31854b = 2;
                try {
                    v0 v0Var2 = this.f31859g;
                    v0Var2.f31867j.unbindService(v0Var2.f31864g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void zzf(ServiceConnection serviceConnection, String str) {
        this.f31853a.remove(serviceConnection);
    }

    public final void zzg(String str) {
        this.f31859g.f31865h.removeMessages(1, this.f31857e);
        v0 v0Var = this.f31859g;
        v0Var.f31867j.unbindService(v0Var.f31864g, this);
        this.f31855c = false;
        this.f31854b = 2;
    }

    public final boolean zzh(ServiceConnection serviceConnection) {
        return this.f31853a.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.f31853a.isEmpty();
    }

    public final boolean zzj() {
        return this.f31855c;
    }
}
