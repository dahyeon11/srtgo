package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.view.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002y {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f9287a;

    /* renamed from: androidx.core.view.y$a */
    static class a {
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* renamed from: androidx.core.view.y$b */
    static class b {
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* renamed from: androidx.core.view.y$c */
    static class c {
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public C1002y(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    private static DisplayCutout a(androidx.core.graphics.b bVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.b bVar2) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            return c.a(bVar.toPlatformInsets(), rect, rect2, rect3, rect4, bVar2.toPlatformInsets());
        }
        if (i8 >= 29) {
            return b.a(bVar.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i8 < 28) {
            return null;
        }
        Rect rect5 = new Rect(bVar.left, bVar.top, bVar.right, bVar.bottom);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return a.a(rect5, arrayList);
    }

    static C1002y c(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1002y(displayCutout);
    }

    DisplayCutout b() {
        return this.f9287a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1002y.class != obj.getClass()) {
            return false;
        }
        return Z.c.equals(this.f9287a, ((C1002y) obj).f9287a);
    }

    public List<Rect> getBoundingRects() {
        return Build.VERSION.SDK_INT >= 28 ? a.b(this.f9287a) : Collections.emptyList();
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f9287a);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f9287a);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f9287a);
        }
        return 0;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f9287a);
        }
        return 0;
    }

    public androidx.core.graphics.b getWaterfallInsets() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.b.toCompatInsets(c.b(this.f9287a)) : androidx.core.graphics.b.NONE;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f9287a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f9287a + "}";
    }

    public C1002y(androidx.core.graphics.b bVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.b bVar2) {
        this(a(bVar, rect, rect2, rect3, rect4, bVar2));
    }

    private C1002y(DisplayCutout displayCutout) {
        this.f9287a = displayCutout;
    }
}
