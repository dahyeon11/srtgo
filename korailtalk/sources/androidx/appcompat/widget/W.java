package androidx.appcompat.widget;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import j.C5809a;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: c, reason: collision with root package name */
    private static Class f6983c;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6981a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6982b = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    static {
        try {
            f6983c = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    static void a(Drawable drawable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean canSafelyMutateDrawable(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof androidx.core.graphics.drawable.c) {
                return canSafelyMutateDrawable(((androidx.core.graphics.drawable.c) drawable).b());
            }
            if (drawable instanceof C5809a) {
                return canSafelyMutateDrawable(((C5809a) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return canSafelyMutateDrawable(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!canSafelyMutateDrawable(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable r11) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L28
            android.graphics.Insets r11 = androidx.appcompat.widget.Q.a(r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = androidx.appcompat.widget.S.a(r11)
            r0.left = r1
            int r1 = androidx.appcompat.widget.T.a(r11)
            r0.right = r1
            int r1 = androidx.appcompat.widget.U.a(r11)
            r0.top = r1
            int r11 = androidx.appcompat.widget.V.a(r11)
            r0.bottom = r11
            return r0
        L28:
            java.lang.Class r0 = androidx.appcompat.widget.W.f6983c
            if (r0 == 0) goto Lba
            android.graphics.drawable.Drawable r11 = androidx.core.graphics.drawable.a.unwrap(r11)     // Catch: java.lang.Exception -> Lb3
            java.lang.Class r0 = r11.getClass()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r11 = r0.invoke(r11, r2)     // Catch: java.lang.Exception -> Lb3
            if (r11 == 0) goto Lba
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lb3
            r0.<init>()     // Catch: java.lang.Exception -> Lb3
            java.lang.Class r1 = androidx.appcompat.widget.W.f6983c     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch: java.lang.Exception -> Lb3
            int r2 = r1.length     // Catch: java.lang.Exception -> Lb3
            r3 = 0
            r4 = r3
        L4f:
            if (r4 >= r2) goto Lb2
            r5 = r1[r4]     // Catch: java.lang.Exception -> Lb3
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> Lb3
            int r7 = r6.hashCode()     // Catch: java.lang.Exception -> Lb3
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r7) {
                case -1383228885: goto L80;
                case 115029: goto L76;
                case 3317767: goto L6c;
                case 108511772: goto L62;
                default: goto L61;
            }     // Catch: java.lang.Exception -> Lb3
        L61:
            goto L8a
        L62:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb3
            if (r6 == 0) goto L8a
            r6 = r9
            goto L8b
        L6c:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb3
            if (r6 == 0) goto L8a
            r6 = r3
            goto L8b
        L76:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb3
            if (r6 == 0) goto L8a
            r6 = r10
            goto L8b
        L80:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb3
            if (r6 == 0) goto L8a
            r6 = r8
            goto L8b
        L8a:
            r6 = -1
        L8b:
            if (r6 == 0) goto La9
            if (r6 == r10) goto La2
            if (r6 == r9) goto L9b
            if (r6 == r8) goto L94
            goto Laf
        L94:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb3
            r0.bottom = r5     // Catch: java.lang.Exception -> Lb3
            goto Laf
        L9b:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb3
            r0.right = r5     // Catch: java.lang.Exception -> Lb3
            goto Laf
        La2:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb3
            r0.top = r5     // Catch: java.lang.Exception -> Lb3
            goto Laf
        La9:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb3
            r0.left = r5     // Catch: java.lang.Exception -> Lb3
        Laf:
            int r4 = r4 + 1
            goto L4f
        Lb2:
            return r0
        Lb3:
            java.lang.String r11 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r11, r0)
        Lba:
            android.graphics.Rect r11 = androidx.appcompat.widget.W.INSETS_NONE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.W.getOpticalBounds(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    public static PorterDuff.Mode parseTintMode(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
