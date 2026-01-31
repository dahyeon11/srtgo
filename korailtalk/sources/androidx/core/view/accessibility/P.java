package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

/* loaded from: classes.dex */
public class P {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;

    /* renamed from: a, reason: collision with root package name */
    private final Object f9168a;

    private static class a {
        static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i8) {
            return accessibilityWindowInfo.getChild(i8);
        }

        static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    private static class b {
        static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    private static class c {
        static boolean a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    private static class d {
        static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    private static class e {
        static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        public static H getRoot(Object obj, int i8) {
            return H.l(((AccessibilityWindowInfo) obj).getRoot(i8));
        }
    }

    private static class f {
        static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long getTransitionTimeMillis(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public P() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9168a = d.a();
        } else {
            this.f9168a = null;
        }
    }

    private static String a(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    static P b(Object obj) {
        if (obj != null) {
            return new P(obj);
        }
        return null;
    }

    public static P obtain() {
        return b(a.l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof P)) {
            return false;
        }
        P p8 = (P) obj;
        Object obj2 = this.f9168a;
        return obj2 == null ? p8.f9168a == null : obj2.equals(p8.f9168a);
    }

    public H getAnchor() {
        return H.l(b.a((AccessibilityWindowInfo) this.f9168a));
    }

    public void getBoundsInScreen(Rect rect) {
        a.a((AccessibilityWindowInfo) this.f9168a, rect);
    }

    public P getChild(int i8) {
        return b(a.b((AccessibilityWindowInfo) this.f9168a, i8));
    }

    public int getChildCount() {
        return a.c((AccessibilityWindowInfo) this.f9168a);
    }

    public int getDisplayId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.a((AccessibilityWindowInfo) this.f9168a);
        }
        return 0;
    }

    public int getId() {
        return a.d((AccessibilityWindowInfo) this.f9168a);
    }

    public int getLayer() {
        return a.e((AccessibilityWindowInfo) this.f9168a);
    }

    public androidx.core.os.k getLocales() {
        return Build.VERSION.SDK_INT >= 34 ? androidx.core.os.k.wrap(f.a((AccessibilityWindowInfo) this.f9168a)) : androidx.core.os.k.getEmptyLocaleList();
    }

    public P getParent() {
        return b(a.f((AccessibilityWindowInfo) this.f9168a));
    }

    public void getRegionInScreen(Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.b((AccessibilityWindowInfo) this.f9168a, region);
            return;
        }
        Rect rect = new Rect();
        a.a((AccessibilityWindowInfo) this.f9168a, rect);
        region.set(rect);
    }

    public H getRoot() {
        return H.l(a.g((AccessibilityWindowInfo) this.f9168a));
    }

    public CharSequence getTitle() {
        return b.b((AccessibilityWindowInfo) this.f9168a);
    }

    public long getTransitionTimeMillis() {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.getTransitionTimeMillis((AccessibilityWindowInfo) this.f9168a);
        }
        return 0L;
    }

    public int getType() {
        return a.h((AccessibilityWindowInfo) this.f9168a);
    }

    public int hashCode() {
        Object obj = this.f9168a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return a.i((AccessibilityWindowInfo) this.f9168a);
    }

    public boolean isActive() {
        return a.j((AccessibilityWindowInfo) this.f9168a);
    }

    public boolean isFocused() {
        return a.k((AccessibilityWindowInfo) this.f9168a);
    }

    public boolean isInPictureInPictureMode() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a((AccessibilityWindowInfo) this.f9168a);
        }
        return false;
    }

    @Deprecated
    public void recycle() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(getId());
        sb.append(", type=");
        sb.append(a(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        sb.append(getParent() != null);
        sb.append(", hasChildren=");
        sb.append(getChildCount() > 0);
        sb.append(", transitionTime=");
        sb.append(getTransitionTimeMillis());
        sb.append(", locales=");
        sb.append(getLocales());
        sb.append(']');
        return sb.toString();
    }

    public AccessibilityWindowInfo unwrap() {
        return (AccessibilityWindowInfo) this.f9168a;
    }

    public static P obtain(P p8) {
        if (p8 == null) {
            return null;
        }
        return b(a.m((AccessibilityWindowInfo) p8.f9168a));
    }

    public H getRoot(int i8) {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.getRoot(this.f9168a, i8);
        }
        return getRoot();
    }

    private P(Object obj) {
        this.f9168a = obj;
    }
}
