package androidx.core.view;

/* loaded from: classes.dex */
public interface O extends N {
    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ boolean dispatchNestedFling(float f8, float f9, boolean z8);

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ boolean dispatchNestedPreFling(float f8, float f9);

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2);

    @Override // androidx.core.view.N
    /* synthetic */ boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2, int i10);

    void dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2);

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr);

    @Override // androidx.core.view.N
    /* synthetic */ boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12);

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ boolean hasNestedScrollingParent();

    @Override // androidx.core.view.N
    /* synthetic */ boolean hasNestedScrollingParent(int i8);

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ boolean isNestedScrollingEnabled();

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ void setNestedScrollingEnabled(boolean z8);

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ boolean startNestedScroll(int i8);

    @Override // androidx.core.view.N
    /* synthetic */ boolean startNestedScroll(int i8, int i9);

    @Override // androidx.core.view.N, androidx.core.view.P
    /* synthetic */ void stopNestedScroll();

    @Override // androidx.core.view.N
    /* synthetic */ void stopNestedScroll(int i8);
}
