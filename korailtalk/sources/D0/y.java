package D0;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f893a = true;

    static w a(ViewGroup viewGroup) {
        return new v(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z8) {
        if (f893a) {
            try {
                viewGroup.suppressLayout(z8);
            } catch (NoSuchMethodError unused) {
                f893a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z8) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z8);
        } else {
            b(viewGroup, z8);
        }
    }
}
