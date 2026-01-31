package androidx.core.view;

import android.view.View;

/* loaded from: classes.dex */
public interface T extends S {
    /* synthetic */ int getNestedScrollAxes();

    /* synthetic */ boolean onNestedFling(View view, float f8, float f9, boolean z8);

    /* synthetic */ boolean onNestedPreFling(View view, float f8, float f9);

    /* synthetic */ void onNestedPreScroll(View view, int i8, int i9, int[] iArr);

    /* synthetic */ void onNestedPreScroll(View view, int i8, int i9, int[] iArr, int i10);

    /* synthetic */ void onNestedScroll(View view, int i8, int i9, int i10, int i11);

    /* synthetic */ void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12);

    void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr);

    /* synthetic */ void onNestedScrollAccepted(View view, View view2, int i8);

    /* synthetic */ void onNestedScrollAccepted(View view, View view2, int i8, int i9);

    /* synthetic */ boolean onStartNestedScroll(View view, View view2, int i8);

    /* synthetic */ boolean onStartNestedScroll(View view, View view2, int i8, int i9);

    /* synthetic */ void onStopNestedScroll(View view);

    /* synthetic */ void onStopNestedScroll(View view, int i8);
}
