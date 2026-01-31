package I2;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import h2.InterfaceC5589f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class Q extends LifecycleCallback {

    /* renamed from: b, reason: collision with root package name */
    private final List f2013b;

    private Q(InterfaceC5589f interfaceC5589f) {
        super(interfaceC5589f);
        this.f2013b = new ArrayList();
        this.f11930a.addCallback("TaskOnStopCallback", this);
    }

    public static Q zza(Activity activity) {
        Q q8;
        InterfaceC5589f fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            try {
                q8 = (Q) fragment.getCallbackOrNull("TaskOnStopCallback", Q.class);
                if (q8 == null) {
                    q8 = new Q(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q8;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.f2013b) {
            try {
                Iterator it = this.f2013b.iterator();
                while (it.hasNext()) {
                    L l8 = (L) ((WeakReference) it.next()).get();
                    if (l8 != null) {
                        l8.zzc();
                    }
                }
                this.f2013b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(L l8) {
        synchronized (this.f2013b) {
            this.f2013b.add(new WeakReference(l8));
        }
    }
}
