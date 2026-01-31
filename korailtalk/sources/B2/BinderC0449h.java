package B2;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: B2.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC0449h extends AbstractBinderC0454m {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f295a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private boolean f296b;

    public static final Object zze(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e8) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e8);
            throw e8;
        }
    }

    public final Bundle zzb(long j8) {
        Bundle bundle;
        synchronized (this.f295a) {
            if (!this.f296b) {
                try {
                    this.f295a.wait(j8);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f295a.get();
        }
        return bundle;
    }

    public final String zzc(long j8) {
        return (String) zze(zzb(j8), String.class);
    }

    @Override // B2.AbstractBinderC0454m, B2.InterfaceC0455n
    public final void zzd(Bundle bundle) {
        synchronized (this.f295a) {
            try {
                try {
                    this.f295a.set(bundle);
                    this.f296b = true;
                } finally {
                    this.f295a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
