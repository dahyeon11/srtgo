package D0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class z implements A {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f894a;

    z(View view) {
        this.f894a = view.getOverlay();
    }

    @Override // D0.A
    public void add(Drawable drawable) {
        this.f894a.add(drawable);
    }

    @Override // D0.A
    public void remove(Drawable drawable) {
        this.f894a.remove(drawable);
    }
}
