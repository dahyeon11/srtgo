package androidx.core.view;

/* loaded from: classes.dex */
public interface N extends P {
    @Override // androidx.core.view.P
    /* synthetic */ boolean dispatchNestedFling(float f8, float f9, boolean z8);

    @Override // androidx.core.view.P
    /* synthetic */ boolean dispatchNestedPreFling(float f8, float f9);

    @Override // androidx.core.view.P
    /* synthetic */ boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2);

    boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2, int i10);

    @Override // androidx.core.view.P
    /* synthetic */ boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr);

    boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12);

    @Override // androidx.core.view.P
    /* synthetic */ boolean hasNestedScrollingParent();

    boolean hasNestedScrollingParent(int i8);

    @Override // androidx.core.view.P
    /* synthetic */ boolean isNestedScrollingEnabled();

    @Override // androidx.core.view.P
    /* synthetic */ void setNestedScrollingEnabled(boolean z8);

    @Override // androidx.core.view.P
    /* synthetic */ boolean startNestedScroll(int i8);

    boolean startNestedScroll(int i8, int i9);

    @Override // androidx.core.view.P
    /* synthetic */ void stopNestedScroll();

    void stopNestedScroll(int i8);
}
