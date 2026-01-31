package D0;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class M extends K {

    /* renamed from: k, reason: collision with root package name */
    private static boolean f725k = true;

    M() {
    }

    @Override // D0.O
    public void setTransitionVisibility(View view, int i8) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i8);
        } else if (f725k) {
            try {
                view.setTransitionVisibility(i8);
            } catch (NoSuchMethodError unused) {
                f725k = false;
            }
        }
    }
}
