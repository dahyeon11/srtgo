package i2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class u0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v0 f31862a;

    /* synthetic */ u0(v0 v0Var, t0 t0Var) {
        this.f31862a = v0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            synchronized (this.f31862a.f31863f) {
                try {
                    q0 q0Var = (q0) message.obj;
                    s0 s0Var = (s0) this.f31862a.f31863f.get(q0Var);
                    if (s0Var != null && s0Var.zzi()) {
                        if (s0Var.zzj()) {
                            s0Var.zzg("GmsClientSupervisor");
                        }
                        this.f31862a.f31863f.remove(q0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i8 != 1) {
            return false;
        }
        synchronized (this.f31862a.f31863f) {
            try {
                q0 q0Var2 = (q0) message.obj;
                s0 s0Var2 = (s0) this.f31862a.f31863f.get(q0Var2);
                if (s0Var2 != null && s0Var2.zza() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(q0Var2), new Exception());
                    ComponentName componentNameZzb = s0Var2.zzb();
                    if (componentNameZzb == null) {
                        componentNameZzb = q0Var2.zza();
                    }
                    if (componentNameZzb == null) {
                        String strZzc = q0Var2.zzc();
                        AbstractC5683p.checkNotNull(strZzc);
                        componentNameZzb = new ComponentName(strZzc, "unknown");
                    }
                    s0Var2.onServiceDisconnected(componentNameZzb);
                }
            } finally {
            }
        }
        return true;
    }
}
