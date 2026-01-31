package androidx.core.view;

import android.view.View;

/* loaded from: classes.dex */
public interface U {
    int getNestedScrollAxes();

    boolean onNestedFling(View view, float f8, float f9, boolean z8);

    boolean onNestedPreFling(View view, float f8, float f9);

    void onNestedPreScroll(View view, int i8, int i9, int[] iArr);

    void onNestedScroll(View view, int i8, int i9, int i10, int i11);

    void onNestedScrollAccepted(View view, View view2, int i8);

    boolean onStartNestedScroll(View view, View view2, int i8);

    void onStopNestedScroll(View view);
}
