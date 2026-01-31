package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.AbstractC0985p0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static Method f7312a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f7312a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f7312a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void computeFitSystemWindows(View view, Rect rect, Rect rect2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f7312a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean isLayoutRtl(View view) {
        return AbstractC0985p0.getLayoutDirection(view) == 1;
    }

    public static void makeOptionalFitsSystemWindows(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
