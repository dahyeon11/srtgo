package a3;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class h {
    static d a(int i8) {
        return i8 != 0 ? i8 != 1 ? b() : new e() : new j();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void setElevation(View view, float f8) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).setElevation(f8);
        }
    }

    public static void setParentAbsoluteElevation(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            setParentAbsoluteElevation(view, (g) background);
        }
    }

    public static void setParentAbsoluteElevation(View view, g gVar) {
        if (gVar.isElevationOverlayEnabled()) {
            gVar.setParentAbsoluteElevation(com.google.android.material.internal.o.getParentAbsoluteElevation(view));
        }
    }
}
