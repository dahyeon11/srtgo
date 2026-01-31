package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f9138a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f9139b;

    /* renamed from: c, reason: collision with root package name */
    private final View f9140c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9141d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f9142e;

    public Q(View view) {
        this.f9140c = view;
    }

    private boolean a(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent viewParentB;
        int i13;
        int i14;
        int[] iArr3;
        if (!isNestedScrollingEnabled() || (viewParentB = b(i12)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f9140c.getLocationInWindow(iArr);
            i13 = iArr[0];
            i14 = iArr[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            int[] iArrC = c();
            iArrC[0] = 0;
            iArrC[1] = 0;
            iArr3 = iArrC;
        } else {
            iArr3 = iArr2;
        }
        AbstractC0997v0.onNestedScroll(viewParentB, this.f9140c, i8, i9, i10, i11, i12, iArr3);
        if (iArr != null) {
            this.f9140c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        return true;
    }

    private ViewParent b(int i8) {
        if (i8 == 0) {
            return this.f9138a;
        }
        if (i8 != 1) {
            return null;
        }
        return this.f9139b;
    }

    private int[] c() {
        if (this.f9142e == null) {
            this.f9142e = new int[2];
        }
        return this.f9142e;
    }

    private void d(int i8, ViewParent viewParent) {
        if (i8 == 0) {
            this.f9138a = viewParent;
        } else {
            if (i8 != 1) {
                return;
            }
            this.f9139b = viewParent;
        }
    }

    public boolean dispatchNestedFling(float f8, float f9, boolean z8) {
        ViewParent viewParentB;
        if (!isNestedScrollingEnabled() || (viewParentB = b(0)) == null) {
            return false;
        }
        return AbstractC0997v0.onNestedFling(viewParentB, this.f9140c, f8, f9, z8);
    }

    public boolean dispatchNestedPreFling(float f8, float f9) {
        ViewParent viewParentB;
        if (!isNestedScrollingEnabled() || (viewParentB = b(0)) == null) {
            return false;
        }
        return AbstractC0997v0.onNestedPreFling(viewParentB, this.f9140c, f8, f9);
    }

    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i8, i9, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return a(i8, i9, i10, i11, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f9141d;
    }

    public void onDetachedFromWindow() {
        AbstractC0985p0.stopNestedScroll(this.f9140c);
    }

    public void onStopNestedScroll(View view) {
        AbstractC0985p0.stopNestedScroll(this.f9140c);
    }

    public void setNestedScrollingEnabled(boolean z8) {
        if (this.f9141d) {
            AbstractC0985p0.stopNestedScroll(this.f9140c);
        }
        this.f9141d = z8;
    }

    public boolean startNestedScroll(int i8) {
        return startNestedScroll(i8, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        ViewParent viewParentB;
        int i11;
        int i12;
        if (!isNestedScrollingEnabled() || (viewParentB = b(i10)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f9140c.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            iArr = c();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        AbstractC0997v0.onNestedPreScroll(viewParentB, this.f9140c, i8, i9, iArr, i10);
        if (iArr2 != null) {
            this.f9140c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12) {
        return a(i8, i9, i10, i11, iArr, i12, null);
    }

    public boolean hasNestedScrollingParent(int i8) {
        return b(i8) != null;
    }

    public boolean startNestedScroll(int i8, int i9) {
        if (hasNestedScrollingParent(i9)) {
            return true;
        }
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        View view = this.f9140c;
        for (ViewParent parent = this.f9140c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC0997v0.onStartNestedScroll(parent, view, this.f9140c, i8, i9)) {
                d(i9, parent);
                AbstractC0997v0.onNestedScrollAccepted(parent, view, this.f9140c, i8, i9);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void stopNestedScroll(int i8) {
        ViewParent viewParentB = b(i8);
        if (viewParentB != null) {
            AbstractC0997v0.onStopNestedScroll(viewParentB, this.f9140c, i8);
            d(i8, null);
        }
    }

    public void dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        a(i8, i9, i10, i11, iArr, i12, iArr2);
    }
}
