package e2;

import android.os.Bundle;

/* loaded from: classes.dex */
final class q extends t {
    q(int i8, int i9, Bundle bundle) {
        super(i8, 2, bundle);
    }

    @Override // e2.t
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            b(new s(4, "Invalid response to one way request"));
        }
    }

    @Override // e2.t
    final boolean d() {
        return true;
    }
}
