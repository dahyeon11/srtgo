package androidx.core.view;

import android.view.View;

/* loaded from: classes.dex */
public interface S extends U {
    /* synthetic */ int getNestedScrollAxes();

    /* synthetic */ boolean onNestedFling(View view, float f8, float f9, boolean z8);

    /* synthetic */ boolean onNestedPreFling(View view, float f8, float f9);

    /* synthetic */ void onNestedPreScroll(View view, int i8, int i9, int[] iArr);

    void onNestedPreScroll(View view, int i8, int i9, int[] iArr, int i10);

    /* synthetic */ void onNestedScroll(View view, int i8, int i9, int i10, int i11);

    void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12);

    /* synthetic */ void onNestedScrollAccepted(View view, View view2, int i8);

    void onNestedScrollAccepted(View view, View view2, int i8, int i9);

    /* synthetic */ boolean onStartNestedScroll(View view, View view2, int i8);

    boolean onStartNestedScroll(View view, View view2, int i8, int i9);

    /* synthetic */ void onStopNestedScroll(View view);

    void onStopNestedScroll(View view, int i8);
}
