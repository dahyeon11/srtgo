package U2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final View f5025a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5026b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f5027c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f5025a = (View) bVar;
    }

    private void a() {
        ViewParent parent = this.f5025a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f5025a);
        }
    }

    public int getExpandedComponentIdHint() {
        return this.f5027c;
    }

    public boolean isExpanded() {
        return this.f5026b;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.f5026b = bundle.getBoolean("expanded", false);
        this.f5027c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f5026b) {
            a();
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f5026b);
        bundle.putInt("expandedComponentIdHint", this.f5027c);
        return bundle;
    }

    public boolean setExpanded(boolean z8) {
        if (this.f5026b == z8) {
            return false;
        }
        this.f5026b = z8;
        a();
        return true;
    }

    public void setExpandedComponentIdHint(int i8) {
        this.f5027c = i8;
    }
}
