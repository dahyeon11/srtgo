package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private int f9143a;

    /* renamed from: b, reason: collision with root package name */
    private int f9144b;

    public V(ViewGroup viewGroup) {
    }

    public int getNestedScrollAxes() {
        return this.f9143a | this.f9144b;
    }

    public void onNestedScrollAccepted(View view, View view2, int i8) {
        onNestedScrollAccepted(view, view2, i8, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i8, int i9) {
        if (i9 == 1) {
            this.f9144b = i8;
        } else {
            this.f9143a = i8;
        }
    }

    public void onStopNestedScroll(View view, int i8) {
        if (i8 == 1) {
            this.f9144b = 0;
        } else {
            this.f9143a = 0;
        }
    }
}
