package e2;

import I2.AbstractC0608l;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import y2.AbstractC6530a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e */
    private static h f30265e;

    /* renamed from: a */
    private final Context f30266a;

    /* renamed from: b */
    private final ScheduledExecutorService f30267b;

    /* renamed from: c */
    private i f30268c = new i(this);

    /* renamed from: d */
    private int f30269d = 1;

    private h(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f30267b = scheduledExecutorService;
        this.f30266a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i8;
        i8 = this.f30269d;
        this.f30269d = i8 + 1;
        return i8;
    }

    private final synchronized AbstractC0608l b(t tVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(tVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(strValueOf);
            }
            if (!this.f30268c.e(tVar)) {
                i iVar = new i(this);
                this.f30268c = iVar;
                iVar.e(tVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return tVar.f30288b.getTask();
    }

    public static synchronized h zza(Context context) {
        try {
            if (f30265e == null) {
                f30265e = new h(context, AbstractC6530a.zza().zza(1, new p2.b("MessengerIpcClient"), y2.f.zzb));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f30265e;
    }

    public final AbstractC0608l zzb(int i8, Bundle bundle) {
        return b(new v(a(), 1, bundle));
    }

    public final AbstractC0608l zza(int i8, Bundle bundle) {
        return b(new q(a(), 2, bundle));
    }
}
