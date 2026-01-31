package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0995u0 {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    /* renamed from: androidx.core.view.u0$a */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z8) {
            viewGroup.setTransitionGroup(z8);
        }
    }

    public static int getLayoutMode(ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int getNestedScrollAxes(ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void setLayoutMode(ViewGroup viewGroup, int i8) {
        viewGroup.setLayoutMode(i8);
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z8) {
        viewGroup.setMotionEventSplittingEnabled(z8);
    }

    public static void setTransitionGroup(ViewGroup viewGroup, boolean z8) {
        a.c(viewGroup, z8);
    }
}
