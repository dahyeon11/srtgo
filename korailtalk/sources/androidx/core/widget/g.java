package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class g {

    static class a {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z8) {
            popupWindow.setOverlapAnchor(z8);
        }

        static void d(PopupWindow popupWindow, int i8) {
            popupWindow.setWindowLayoutType(i8);
        }
    }

    public static boolean getOverlapAnchor(PopupWindow popupWindow) {
        return a.a(popupWindow);
    }

    public static int getWindowLayoutType(PopupWindow popupWindow) {
        return a.b(popupWindow);
    }

    public static void setOverlapAnchor(PopupWindow popupWindow, boolean z8) {
        a.c(popupWindow, z8);
    }

    public static void setWindowLayoutType(PopupWindow popupWindow, int i8) {
        a.d(popupWindow, i8);
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view, int i8, int i9, int i10) {
        popupWindow.showAsDropDown(view, i8, i9, i10);
    }
}
