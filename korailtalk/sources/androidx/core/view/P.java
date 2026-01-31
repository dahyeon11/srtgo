package androidx.core.view;

/* loaded from: classes.dex */
public interface P {
    boolean dispatchNestedFling(float f8, float f9, boolean z8);

    boolean dispatchNestedPreFling(float f8, float f9);

    boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z8);

    boolean startNestedScroll(int i8);

    void stopNestedScroll();
}
