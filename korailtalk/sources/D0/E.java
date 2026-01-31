package D0;

import android.view.View;

/* loaded from: classes.dex */
abstract class E extends O {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f720f = true;

    E() {
    }

    @Override // D0.O
    public float getTransitionAlpha(View view) {
        if (f720f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f720f = false;
            }
        }
        return view.getAlpha();
    }

    @Override // D0.O
    public void setTransitionAlpha(View view, float f8) {
        if (f720f) {
            try {
                view.setTransitionAlpha(f8);
                return;
            } catch (NoSuchMethodError unused) {
                f720f = false;
            }
        }
        view.setAlpha(f8);
    }

    @Override // D0.O
    public void clearNonTransitionAlpha(View view) {
    }

    @Override // D0.O
    public void saveNonTransitionAlpha(View view) {
    }
}
