package h2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f31407a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f31408b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y f31409c;

    X(Y y8, LifecycleCallback lifecycleCallback, String str) {
        this.f31409c = y8;
        this.f31407a = lifecycleCallback;
        this.f31408b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        Y y8 = this.f31409c;
        if (y8.f31412b > 0) {
            LifecycleCallback lifecycleCallback = this.f31407a;
            if (y8.f31413c != null) {
                bundle = y8.f31413c.getBundle(this.f31408b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f31409c.f31412b >= 2) {
            this.f31407a.onStart();
        }
        if (this.f31409c.f31412b >= 3) {
            this.f31407a.onResume();
        }
        if (this.f31409c.f31412b >= 4) {
            this.f31407a.onStop();
        }
        if (this.f31409c.f31412b >= 5) {
            this.f31407a.onDestroy();
        }
    }
}
