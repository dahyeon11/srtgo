package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0997v0 {

    /* renamed from: a, reason: collision with root package name */
    private static int[] f9280a;

    /* renamed from: androidx.core.view.v0$a */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean z8) {
            return viewParent.onNestedFling(view, f8, f9, z8);
        }

        static boolean b(ViewParent viewParent, View view, float f8, float f9) {
            return viewParent.onNestedPreFling(view, f8, f9);
        }

        static void c(ViewParent viewParent, View view, int i8, int i9, int[] iArr) {
            viewParent.onNestedPreScroll(view, i8, i9, iArr);
        }

        static void d(ViewParent viewParent, View view, int i8, int i9, int i10, int i11) {
            viewParent.onNestedScroll(view, i8, i9, i10, i11);
        }

        static void e(ViewParent viewParent, View view, View view2, int i8) {
            viewParent.onNestedScrollAccepted(view, view2, i8);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i8) {
            return viewParent.onStartNestedScroll(view, view2, i8);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private static int[] a() {
        int[] iArr = f9280a;
        if (iArr == null) {
            f9280a = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f9280a;
    }

    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i8) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i8);
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f8, float f9, boolean z8) {
        try {
            return a.a(viewParent, view, f8, f9, z8);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e8);
            return false;
        }
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f8, float f9) {
        try {
            return a.b(viewParent, view, f8, f9);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e8);
            return false;
        }
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i8, int i9, int[] iArr) {
        onNestedPreScroll(viewParent, view, i8, i9, iArr, 0);
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i8, int i9, int i10, int i11) {
        onNestedScroll(viewParent, view, i8, i9, i10, i11, 0, a());
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i8) {
        onNestedScrollAccepted(viewParent, view, view2, i8, 0);
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i8) {
        return onStartNestedScroll(viewParent, view, view2, i8, 0);
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i8, int i9, int[] iArr, int i10) {
        if (viewParent instanceof S) {
            ((S) viewParent).onNestedPreScroll(view, i8, i9, iArr, i10);
            return;
        }
        if (i10 == 0) {
            try {
                a.c(viewParent, view, i8, i9, iArr);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e8);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i8, int i9) {
        if (viewParent instanceof S) {
            ((S) viewParent).onNestedScrollAccepted(view, view2, i8, i9);
            return;
        }
        if (i9 == 0) {
            try {
                a.e(viewParent, view, view2, i8);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e8);
            }
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i8, int i9) {
        if (viewParent instanceof S) {
            return ((S) viewParent).onStartNestedScroll(view, view2, i8, i9);
        }
        if (i9 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i8);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e8);
            return false;
        }
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view, int i8) {
        if (viewParent instanceof S) {
            ((S) viewParent).onStopNestedScroll(view, i8);
            return;
        }
        if (i8 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e8);
            }
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i8, int i9, int i10, int i11, int i12) {
        onNestedScroll(viewParent, view, i8, i9, i10, i11, i12, a());
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (viewParent instanceof T) {
            ((T) viewParent).onNestedScroll(view, i8, i9, i10, i11, i12, iArr);
            return;
        }
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
        if (viewParent instanceof S) {
            ((S) viewParent).onNestedScroll(view, i8, i9, i10, i11, i12);
            return;
        }
        if (i12 == 0) {
            try {
                a.d(viewParent, view, i8, i9, i10, i11);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e8);
            }
        }
    }
}
