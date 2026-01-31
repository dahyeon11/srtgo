package D0;

import android.view.View;

/* loaded from: classes.dex */
abstract class K extends I {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f724j = true;

    K() {
    }

    @Override // D0.O
    public void setLeftTopRightBottom(View view, int i8, int i9, int i10, int i11) {
        if (f724j) {
            try {
                view.setLeftTopRightBottom(i8, i9, i10, i11);
            } catch (NoSuchMethodError unused) {
                f724j = false;
            }
        }
    }
}
