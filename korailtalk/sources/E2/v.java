package e2;

import android.os.Bundle;

/* loaded from: classes.dex */
final class v extends t {
    v(int i8, int i9, Bundle bundle) {
        super(i8, 1, bundle);
    }

    @Override // e2.t
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    @Override // e2.t
    final boolean d() {
        return false;
    }
}
