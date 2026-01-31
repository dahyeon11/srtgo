package h2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class Z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f31414a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f31415b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a0 f31416c;

    Z(a0 a0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f31416c = a0Var;
        this.f31414a = lifecycleCallback;
        this.f31415b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        a0 a0Var = this.f31416c;
        if (a0Var.f31419c0 > 0) {
            LifecycleCallback lifecycleCallback = this.f31414a;
            if (a0Var.f31420d0 != null) {
                bundle = a0Var.f31420d0.getBundle(this.f31415b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f31416c.f31419c0 >= 2) {
            this.f31414a.onStart();
        }
        if (this.f31416c.f31419c0 >= 3) {
            this.f31414a.onResume();
        }
        if (this.f31416c.f31419c0 >= 4) {
            this.f31414a.onStop();
        }
        if (this.f31416c.f31419c0 >= 5) {
            this.f31414a.onDestroy();
        }
    }
}
