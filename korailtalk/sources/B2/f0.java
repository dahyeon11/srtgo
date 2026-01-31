package B2;

import android.app.Activity;
import android.os.Bundle;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class f0 extends c0 {

    /* renamed from: e */
    final /* synthetic */ Bundle f288e;

    /* renamed from: f */
    final /* synthetic */ Activity f289f;

    /* renamed from: g */
    final /* synthetic */ m0 f290g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(m0 m0Var, Bundle bundle, Activity activity) {
        super(m0Var.f308a, true);
        this.f290g = m0Var;
        this.f288e = bundle;
        this.f289f = activity;
    }

    @Override // B2.c0
    final void zza() {
        Bundle bundle;
        if (this.f288e != null) {
            bundle = new Bundle();
            if (this.f288e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f288e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f290g.f308a.f318i)).onActivityCreated(r2.b.wrap(this.f289f), bundle, this.f285b);
    }
}
