package D0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class v implements w {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f892a;

    v(ViewGroup viewGroup) {
        this.f892a = viewGroup.getOverlay();
    }

    @Override // D0.w, D0.A
    public void add(Drawable drawable) {
        this.f892a.add(drawable);
    }

    @Override // D0.w, D0.A
    public void remove(Drawable drawable) {
        this.f892a.remove(drawable);
    }

    @Override // D0.w
    public void add(View view) {
        this.f892a.add(view);
    }

    @Override // D0.w
    public void remove(View view) {
        this.f892a.remove(view);
    }
}
