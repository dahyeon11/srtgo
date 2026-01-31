package androidx.core.view;

import a0.C0823b;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.C0923a;
import androidx.core.view.C0950d1;
import androidx.core.view.D0;
import androidx.core.view.accessibility.H;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: androidx.core.view.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC0985p0 {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;

    /* renamed from: a */
    private static WeakHashMap f9247a = null;

    /* renamed from: b */
    private static Method f9248b = null;

    /* renamed from: c */
    private static Field f9249c = null;

    /* renamed from: d */
    private static boolean f9250d = false;

    /* renamed from: e */
    private static final int[] f9251e = {U.e.accessibility_custom_action_0, U.e.accessibility_custom_action_1, U.e.accessibility_custom_action_2, U.e.accessibility_custom_action_3, U.e.accessibility_custom_action_4, U.e.accessibility_custom_action_5, U.e.accessibility_custom_action_6, U.e.accessibility_custom_action_7, U.e.accessibility_custom_action_8, U.e.accessibility_custom_action_9, U.e.accessibility_custom_action_10, U.e.accessibility_custom_action_11, U.e.accessibility_custom_action_12, U.e.accessibility_custom_action_13, U.e.accessibility_custom_action_14, U.e.accessibility_custom_action_15, U.e.accessibility_custom_action_16, U.e.accessibility_custom_action_17, U.e.accessibility_custom_action_18, U.e.accessibility_custom_action_19, U.e.accessibility_custom_action_20, U.e.accessibility_custom_action_21, U.e.accessibility_custom_action_22, U.e.accessibility_custom_action_23, U.e.accessibility_custom_action_24, U.e.accessibility_custom_action_25, U.e.accessibility_custom_action_26, U.e.accessibility_custom_action_27, U.e.accessibility_custom_action_28, U.e.accessibility_custom_action_29, U.e.accessibility_custom_action_30, U.e.accessibility_custom_action_31};

    /* renamed from: f */
    private static final Y f9252f = new Y() { // from class: androidx.core.view.o0
        @Override // androidx.core.view.Y
        public final C0951e onReceiveContent(C0951e c0951e) {
            return AbstractC0985p0.l(c0951e);
        }
    };

    /* renamed from: g */
    private static final e f9253g = new e();

    /* renamed from: androidx.core.view.p0$a */
    class a extends f {
        a(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(l.d(view));
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            l.i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.p0$b */
    class b extends f {
        b(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: h */
        public CharSequence c(View view) {
            return l.b(view);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.p0$c */
    class c extends f {
        c(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: h */
        public CharSequence c(View view) {
            return n.b(view);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            n.e(view, charSequence);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.p0$d */
    class d extends f {
        d(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.AbstractC0985p0.f
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.p0$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final WeakHashMap f9254a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z8 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z8) {
                AbstractC0985p0.m(view, z8 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z8));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f9254a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f9254a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f9254a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.p0$f */
    static abstract class f {

        /* renamed from: a */
        private final int f9255a;

        /* renamed from: b */
        private final Class f9256b;

        /* renamed from: c */
        private final int f9257c;

        /* renamed from: d */
        private final int f9258d;

        f(int i8, Class cls, int i9) {
            this(i8, cls, 0, i9);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f9257c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f9255a);
            if (this.f9256b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC0985p0.f(view);
                view.setTag(this.f9255a, obj);
                AbstractC0985p0.m(view, this.f9258d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i8, Class cls, int i9, int i10) {
            this.f9255a = i8;
            this.f9256b = cls;
            this.f9258d = i9;
            this.f9257c = i10;
        }
    }

    /* renamed from: androidx.core.view.p0$g */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.p0$h */
    private static class h {

        /* renamed from: androidx.core.view.p0$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0950d1 f9259a = null;

            /* renamed from: b */
            final /* synthetic */ View f9260b;

            /* renamed from: c */
            final /* synthetic */ W f9261c;

            a(View view, W w8) {
                this.f9260b = view;
                this.f9261c = w8;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0950d1 windowInsetsCompat = C0950d1.toWindowInsetsCompat(windowInsets, view);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 < 30) {
                    h.a(windowInsets, this.f9260b);
                    if (windowInsetsCompat.equals(this.f9259a)) {
                        return this.f9261c.onApplyWindowInsets(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f9259a = windowInsetsCompat;
                C0950d1 c0950d1OnApplyWindowInsets = this.f9261c.onApplyWindowInsets(view, windowInsetsCompat);
                if (i8 >= 30) {
                    return c0950d1OnApplyWindowInsets.toWindowInsets();
                }
                AbstractC0985p0.requestApplyInsets(view);
                return c0950d1OnApplyWindowInsets.toWindowInsets();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(U.e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C0950d1 b(View view, C0950d1 c0950d1, Rect rect) {
            WindowInsets windowInsets = c0950d1.toWindowInsets();
            if (windowInsets != null) {
                return C0950d1.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return c0950d1;
        }

        static boolean c(View view, float f8, float f9, boolean z8) {
            return view.dispatchNestedFling(f8, f9, z8);
        }

        static boolean d(View view, float f8, float f9) {
            return view.dispatchNestedPreFling(f8, f9);
        }

        static boolean e(View view, int i8, int i9, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i8, i9, iArr, iArr2);
        }

        static boolean f(View view, int i8, int i9, int i10, int i11, int[] iArr) {
            return view.dispatchNestedScroll(i8, i9, i10, i11, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static C0950d1 getRootWindowInsets(View view) {
            return C0950d1.a.getRootWindowInsets(view);
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        static String j(View view) {
            return view.getTransitionName();
        }

        static float k(View view) {
            return view.getTranslationZ();
        }

        static float l(View view) {
            return view.getZ();
        }

        static boolean m(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean n(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean o(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void p(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void q(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void r(View view, float f8) {
            view.setElevation(f8);
        }

        static void s(View view, boolean z8) {
            view.setNestedScrollingEnabled(z8);
        }

        static void t(View view, W w8) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(U.e.tag_on_apply_window_listener, w8);
            }
            if (w8 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(U.e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, w8));
            }
        }

        static void u(View view, String str) {
            view.setTransitionName(str);
        }

        static void v(View view, float f8) {
            view.setTranslationZ(f8);
        }

        static void w(View view, float f8) {
            view.setZ(f8);
        }

        static boolean x(View view, int i8) {
            return view.startNestedScroll(i8);
        }

        static void y(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.p0$i */
    private static class i {
        static int a(View view) {
            return view.getScrollIndicators();
        }

        static void b(View view, int i8) {
            view.setScrollIndicators(i8);
        }

        static void c(View view, int i8, int i9) {
            view.setScrollIndicators(i8, i9);
        }

        public static C0950d1 getRootWindowInsets(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0950d1 windowInsetsCompat = C0950d1.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.e(windowInsetsCompat);
            windowInsetsCompat.a(view.getRootView());
            return windowInsetsCompat;
        }
    }

    /* renamed from: androidx.core.view.p0$j */
    static class j {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i8) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i8);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: androidx.core.view.p0$k */
    static class k {
        static void a(View view, Collection<View> collection, int i8) {
            view.addKeyboardNavigationClusters(collection, i8);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }

        static View h(View view, View view2, int i8) {
            return view.keyboardNavigationClusterSearch(view2, i8);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z8) {
            view.setFocusedByDefault(z8);
        }

        static void l(View view, int i8) {
            view.setImportantForAutofill(i8);
        }

        static void m(View view, boolean z8) {
            view.setKeyboardNavigationCluster(z8);
        }

        static void n(View view, int i8) {
            view.setNextClusterForwardId(i8);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.p0$l */
    static class l {
        static void a(View view, final q qVar) {
            O.h hVar = (O.h) view.getTag(U.e.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new O.h();
                view.setTag(U.e.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(qVar) { // from class: androidx.core.view.q0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            hVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            O.h hVar = (O.h) view.getTag(U.e.tag_unhandled_key_listeners);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i8) {
            return (T) view.requireViewById(i8);
        }

        static void g(View view, boolean z8) {
            view.setAccessibilityHeading(z8);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z8) {
            view.setScreenReaderFocusable(z8);
        }

        public static void setAutofillId(View view, C0823b c0823b) {
            view.setAutofillId(c0823b == null ? null : c0823b.toAutofillId());
        }
    }

    /* renamed from: androidx.core.view.p0$m */
    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i8, i9);
        }

        static void e(View view, androidx.core.view.contentcapture.b bVar) {
            view.setContentCaptureSession(bVar == null ? null : bVar.toContentCaptureSession());
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.p0$n */
    private static class n {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        static void d(View view, int i8) {
            view.setImportantForContentCapture(i8);
        }

        static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        public static H1 getWindowInsetsController(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return H1.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.p0$o */
    private static final class o {
        public static String[] getReceiveContentMimeTypes(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0951e performReceiveContent(View view, C0951e c0951e) {
            ContentInfo contentInfo = c0951e.toContentInfo();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfo);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfo ? c0951e : C0951e.toContentInfoCompat(contentInfoPerformReceiveContent);
        }

        public static void setOnReceiveContentListener(View view, String[] strArr, X x8) {
            if (x8 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(x8));
            }
        }
    }

    /* renamed from: androidx.core.view.p0$p */
    private static final class p implements OnReceiveContentListener {

        /* renamed from: a */
        private final X f9262a;

        p(X x8) {
            this.f9262a = x8;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0951e contentInfoCompat = C0951e.toContentInfoCompat(contentInfo);
            C0951e c0951eOnReceiveContent = this.f9262a.onReceiveContent(view, contentInfoCompat);
            if (c0951eOnReceiveContent == null) {
                return null;
            }
            return c0951eOnReceiveContent == contentInfoCompat ? contentInfo : c0951eOnReceiveContent.toContentInfo();
        }
    }

    /* renamed from: androidx.core.view.p0$q */
    public interface q {
    }

    /* renamed from: androidx.core.view.p0$r */
    static class r {

        /* renamed from: d */
        private static final ArrayList f9263d = new ArrayList();

        /* renamed from: a */
        private WeakHashMap f9264a = null;

        /* renamed from: b */
        private SparseArray f9265b = null;

        /* renamed from: c */
        private WeakReference f9266c = null;

        r() {
        }

        static r a(View view) {
            r rVar = (r) view.getTag(U.e.tag_unhandled_key_event_manager);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(U.e.tag_unhandled_key_event_manager, rVar2);
            return rVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f9264a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f9265b == null) {
                this.f9265b = new SparseArray();
            }
            return this.f9265b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(U.e.tag_unhandled_key_listeners);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.f.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f9264a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f9263d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f9264a == null) {
                        this.f9264a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f9263d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f9264a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f9264a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static void h(View view) {
            ArrayList arrayList = f9263d;
            synchronized (arrayList) {
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == view) {
                            return;
                        }
                    }
                    f9263d.add(new WeakReference(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static void i(View view) {
            synchronized (f9263d) {
                int i8 = 0;
                while (true) {
                    try {
                        ArrayList arrayList = f9263d;
                        if (i8 >= arrayList.size()) {
                            return;
                        }
                        if (((WeakReference) arrayList.get(i8)).get() == view) {
                            arrayList.remove(i8);
                            return;
                        }
                        i8++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f9266c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f9266c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int addAccessibilityAction(View view, CharSequence charSequence, androidx.core.view.accessibility.O o8) {
        int iJ = j(view, charSequence);
        if (iJ != -1) {
            c(view, new H.a(iJ, charSequence, o8));
        }
        return iJ;
    }

    public static void addKeyboardNavigationClusters(View view, Collection<View> collection, int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.a(view, collection, i8);
        }
    }

    public static void addOnUnhandledKeyEventListener(View view, q qVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.a(view, qVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(U.e.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(U.e.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(qVar);
        if (arrayList.size() == 1) {
            r.h(view);
        }
    }

    @Deprecated
    public static C1001x0 animate(View view) {
        if (f9247a == null) {
            f9247a = new WeakHashMap();
        }
        C1001x0 c1001x0 = (C1001x0) f9247a.get(view);
        if (c1001x0 != null) {
            return c1001x0;
        }
        C1001x0 c1001x02 = new C1001x0(view);
        f9247a.put(view, c1001x02);
        return c1001x02;
    }

    private static f b() {
        return new d(U.e.tag_accessibility_heading, Boolean.class, 28);
    }

    private static void c(View view, H.a aVar) {
        f(view);
        o(aVar.getId(), view);
        i(view).add(aVar);
        m(view, 0);
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i8) {
        return view.canScrollHorizontally(i8);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i8) {
        return view.canScrollVertically(i8);
    }

    public static void cancelDragAndDrop(View view) {
        j.a(view);
    }

    @Deprecated
    public static int combineMeasuredStates(int i8, int i9) {
        return View.combineMeasuredStates(i8, i9);
    }

    public static C0950d1 computeSystemWindowInsets(View view, C0950d1 c0950d1, Rect rect) {
        return h.b(view, c0950d1, rect);
    }

    static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    public static C0950d1 dispatchApplyWindowInsets(View view, C0950d1 c0950d1) {
        WindowInsets windowInsets = c0950d1.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsets);
            if (!windowInsetsA.equals(windowInsets)) {
                return C0950d1.toWindowInsetsCompat(windowInsetsA, view);
            }
        }
        return c0950d1;
    }

    public static void dispatchFinishTemporaryDetach(View view) {
        j.b(view);
    }

    public static boolean dispatchNestedFling(View view, float f8, float f9, boolean z8) {
        return h.c(view, f8, f9, z8);
    }

    public static boolean dispatchNestedPreFling(View view, float f8, float f9) {
        return h.d(view, f8, f9);
    }

    public static boolean dispatchNestedPreScroll(View view, int i8, int i9, int[] iArr, int[] iArr2) {
        return h.e(view, i8, i9, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(View view, int i8, int i9, int i10, int i11, int[] iArr) {
        return h.f(view, i8, i9, i10, i11, iArr);
    }

    public static void dispatchStartTemporaryDetach(View view) {
        j.c(view);
    }

    static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    public static void enableAccessibleClickableSpanSupport(View view) {
        f(view);
    }

    static void f(View view) {
        C0923a accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new C0923a();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    private static View.AccessibilityDelegate g(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : h(view);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    public static C0923a getAccessibilityDelegate(View view) {
        View.AccessibilityDelegate accessibilityDelegateG = g(view);
        if (accessibilityDelegateG == null) {
            return null;
        }
        return accessibilityDelegateG instanceof C0923a.C0142a ? ((C0923a.C0142a) accessibilityDelegateG).f9151a : new C0923a(accessibilityDelegateG);
    }

    @Deprecated
    public static int getAccessibilityLiveRegion(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static androidx.core.view.accessibility.M getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.M(accessibilityNodeProvider);
        }
        return null;
    }

    public static CharSequence getAccessibilityPaneTitle(View view) {
        return (CharSequence) n().e(view);
    }

    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    public static C0823b getAutofillId(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0823b.toAutofillIdCompat(k.getAutofillId(view));
        }
        return null;
    }

    public static ColorStateList getBackgroundTintList(View view) {
        return h.g(view);
    }

    public static PorterDuff.Mode getBackgroundTintMode(View view) {
        return h.h(view);
    }

    @Deprecated
    public static Rect getClipBounds(View view) {
        return view.getClipBounds();
    }

    public static androidx.core.view.contentcapture.b getContentCaptureSession(View view) {
        ContentCaptureSession contentCaptureSessionB;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionB = m.b(view)) == null) {
            return null;
        }
        return androidx.core.view.contentcapture.b.toContentCaptureSessionCompat(contentCaptureSessionB, view);
    }

    @Deprecated
    public static Display getDisplay(View view) {
        return view.getDisplay();
    }

    public static float getElevation(View view) {
        return h.i(view);
    }

    @Deprecated
    public static boolean getFitsSystemWindows(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    public static int getImportantForAutofill(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.b(view);
        }
        return 0;
    }

    public static int getImportantForContentCapture(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.a(view);
        }
        return 0;
    }

    @Deprecated
    public static int getLabelFor(View view) {
        return view.getLabelFor();
    }

    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static int getLayoutDirection(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int getMinimumHeight(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int getMinimumWidth(View view) {
        return view.getMinimumWidth();
    }

    public static int getNextClusterForwardId(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return -1;
    }

    public static String[] getOnReceiveContentMimeTypes(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.getReceiveContentMimeTypes(view) : (String[]) view.getTag(U.e.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @Deprecated
    public static int getPaddingEnd(View view) {
        return view.getPaddingEnd();
    }

    @Deprecated
    public static int getPaddingStart(View view) {
        return view.getPaddingStart();
    }

    @Deprecated
    public static ViewParent getParentForAccessibility(View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    public static C0950d1 getRootWindowInsets(View view) {
        return i.getRootWindowInsets(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static int getScrollIndicators(View view) {
        return i.a(view);
    }

    public static CharSequence getStateDescription(View view) {
        return (CharSequence) r().e(view);
    }

    public static List<Rect> getSystemGestureExclusionRects(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.c(view) : Collections.emptyList();
    }

    public static String getTransitionName(View view) {
        return h.j(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getTranslationZ(View view) {
        return h.k(view);
    }

    @Deprecated
    public static H1 getWindowInsetsController(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.getWindowInsetsController(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C0.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static float getZ(View view) {
        return h.l(view);
    }

    private static View.AccessibilityDelegate h(View view) {
        if (f9250d) {
            return null;
        }
        if (f9249c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f9249c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f9250d = true;
                return null;
            }
        }
        try {
            Object obj = f9249c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f9250d = true;
            return null;
        }
    }

    public static boolean hasAccessibilityDelegate(View view) {
        return g(view) != null;
    }

    public static boolean hasExplicitFocusable(View view) {
        return Build.VERSION.SDK_INT >= 26 ? k.d(view) : view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(View view) {
        return h.m(view);
    }

    @Deprecated
    public static boolean hasOnClickListeners(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean hasOverlappingRendering(View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean hasTransientState(View view) {
        return view.hasTransientState();
    }

    private static List i(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(U.e.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(U.e.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static boolean isAccessibilityHeading(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    @Deprecated
    public static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.e(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(View view) {
        return h.n(view);
    }

    public static boolean isImportantForAutofill(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.f(view);
        }
        return true;
    }

    public static boolean isImportantForContentCapture(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isInLayout(View view) {
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.g(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isLaidOut(View view) {
        return view.isLaidOut();
    }

    @Deprecated
    public static boolean isLayoutDirectionResolved(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(View view) {
        return h.o(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static boolean isPaddingRelative(View view) {
        return view.isPaddingRelative();
    }

    public static boolean isScreenReaderFocusable(View view) {
        Boolean bool = (Boolean) p().e(view);
        return bool != null && bool.booleanValue();
    }

    private static int j(View view, CharSequence charSequence) {
        List listI = i(view);
        for (int i8 = 0; i8 < listI.size(); i8++) {
            if (TextUtils.equals(charSequence, ((H.a) listI.get(i8)).getLabel())) {
                return ((H.a) listI.get(i8)).getId();
            }
        }
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int[] iArr = f9251e;
            if (i10 >= iArr.length || i9 != -1) {
                break;
            }
            int i11 = iArr[i10];
            boolean z8 = true;
            for (int i12 = 0; i12 < listI.size(); i12++) {
                z8 &= ((H.a) listI.get(i12)).getId() != i11;
            }
            if (z8) {
                i9 = i11;
            }
            i10++;
        }
        return i9;
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Y k(View view) {
        return view instanceof Y ? (Y) view : f9252f;
    }

    public static View keyboardNavigationClusterSearch(View view, View view2, int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.h(view, view2, i8);
        }
        return null;
    }

    public static /* synthetic */ C0951e l(C0951e c0951e) {
        return c0951e;
    }

    static void m(View view, int i8) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z8 = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z8) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z8 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i8);
                if (z8) {
                    accessibilityEventObtain.getText().add(getAccessibilityPaneTitle(view));
                    q(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i8 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i8);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i8);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e8);
                }
            }
        }
    }

    private static f n() {
        return new b(U.e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    private static void o(int i8, View view) {
        List listI = i(view);
        for (int i9 = 0; i9 < listI.size(); i9++) {
            if (((H.a) listI.get(i9)).getId() == i8) {
                listI.remove(i9);
                return;
            }
        }
    }

    public static void offsetLeftAndRight(View view, int i8) {
        view.offsetLeftAndRight(i8);
    }

    public static void offsetTopAndBottom(View view, int i8) {
        view.offsetTopAndBottom(i8);
    }

    public static C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
        WindowInsets windowInsets = c0950d1.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsets);
            if (!windowInsetsB.equals(windowInsets)) {
                return C0950d1.toWindowInsetsCompat(windowInsetsB, view);
            }
        }
        return c0950d1;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.H h8) {
        view.onInitializeAccessibilityNodeInfo(h8.unwrap());
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    private static f p() {
        return new a(U.e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    @Deprecated
    public static boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
        return view.performAccessibilityAction(i8, bundle);
    }

    public static boolean performHapticFeedback(View view, int i8) {
        int iA = B.a(i8);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA);
    }

    public static C0951e performReceiveContent(View view, C0951e c0951e) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(c0951e);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.performReceiveContent(view, c0951e);
        }
        X x8 = (X) view.getTag(U.e.tag_on_receive_content_listener);
        if (x8 == null) {
            return k(view).onReceiveContent(c0951e);
        }
        C0951e c0951eOnReceiveContent = x8.onReceiveContent(view, c0951e);
        if (c0951eOnReceiveContent == null) {
            return null;
        }
        return k(view).onReceiveContent(c0951eOnReceiveContent);
    }

    @Deprecated
    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Deprecated
    public static void postOnAnimationDelayed(View view, Runnable runnable, long j8) {
        view.postOnAnimationDelayed(runnable, j8);
    }

    private static void q(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private static f r() {
        return new c(U.e.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void removeAccessibilityAction(View view, int i8) {
        o(i8, view);
        m(view, 0);
    }

    public static void removeOnUnhandledKeyEventListener(View view, q qVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.e(view, qVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(U.e.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(qVar);
            if (arrayList.size() == 0) {
                r.i(view);
            }
        }
    }

    public static void replaceAccessibilityAction(View view, H.a aVar, CharSequence charSequence, androidx.core.view.accessibility.O o8) {
        if (o8 == null && charSequence == null) {
            removeAccessibilityAction(view, aVar.getId());
        } else {
            c(view, aVar.createReplacementAction(charSequence, o8));
        }
    }

    public static void requestApplyInsets(View view) {
        g.c(view);
    }

    public static <T extends View> T requireViewById(View view, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) l.f(view, i8);
        }
        T t8 = (T) view.findViewById(i8);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i8, int i9, int i10) {
        return View.resolveSizeAndState(i8, i9, i10);
    }

    public static boolean restoreDefaultFocus(View view) {
        return Build.VERSION.SDK_INT >= 26 ? k.i(view) : view.requestFocus();
    }

    public static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i8, i9);
        }
    }

    public static void setAccessibilityDelegate(View view, C0923a c0923a) {
        if (c0923a == null && (g(view) instanceof C0923a.C0142a)) {
            c0923a = new C0923a();
        }
        q(view);
        view.setAccessibilityDelegate(c0923a == null ? null : c0923a.b());
    }

    public static void setAccessibilityHeading(View view, boolean z8) {
        b().f(view, Boolean.valueOf(z8));
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(View view, int i8) {
        view.setAccessibilityLiveRegion(i8);
    }

    public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
        n().f(view, charSequence);
        if (charSequence != null) {
            f9253g.a(view);
        } else {
            f9253g.d(view);
        }
    }

    @Deprecated
    public static void setActivated(View view, boolean z8) {
        view.setActivated(z8);
    }

    @Deprecated
    public static void setAlpha(View view, float f8) {
        view.setAlpha(f8);
    }

    public static void setAutofillHints(View view, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.j(view, strArr);
        }
    }

    public static void setAutofillId(View view, C0823b c0823b) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.setAutofillId(view, c0823b);
        }
    }

    @Deprecated
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setBackgroundTintList(View view, ColorStateList colorStateList) {
        h.p(view, colorStateList);
    }

    public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
        h.q(view, mode);
    }

    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z8) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f9248b == null) {
            try {
                f9248b = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e8) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e8);
            }
            f9248b.setAccessible(true);
        }
        try {
            f9248b.invoke(viewGroup, Boolean.valueOf(z8));
        } catch (IllegalAccessException e9) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e9);
        } catch (IllegalArgumentException e10) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e10);
        } catch (InvocationTargetException e11) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e11);
        }
    }

    @Deprecated
    public static void setClipBounds(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void setContentCaptureSession(View view, androidx.core.view.contentcapture.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.e(view, bVar);
        }
    }

    public static void setElevation(View view, float f8) {
        h.r(view, f8);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z8) {
        view.setFitsSystemWindows(z8);
    }

    public static void setFocusedByDefault(View view, boolean z8) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.k(view, z8);
        }
    }

    @Deprecated
    public static void setHasTransientState(View view, boolean z8) {
        view.setHasTransientState(z8);
    }

    @Deprecated
    public static void setImportantForAccessibility(View view, int i8) {
        view.setImportantForAccessibility(i8);
    }

    public static void setImportantForAutofill(View view, int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.l(view, i8);
        }
    }

    public static void setImportantForContentCapture(View view, int i8) {
        if (Build.VERSION.SDK_INT >= 30) {
            n.d(view, i8);
        }
    }

    public static void setKeyboardNavigationCluster(View view, boolean z8) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, z8);
        }
    }

    @Deprecated
    public static void setLabelFor(View view, int i8) {
        view.setLabelFor(i8);
    }

    @Deprecated
    public static void setLayerPaint(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i8, Paint paint) {
        view.setLayerType(i8, paint);
    }

    @Deprecated
    public static void setLayoutDirection(View view, int i8) {
        view.setLayoutDirection(i8);
    }

    public static void setNestedScrollingEnabled(View view, boolean z8) {
        h.s(view, z8);
    }

    public static void setNextClusterForwardId(View view, int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.n(view, i8);
        }
    }

    public static void setOnApplyWindowInsetsListener(View view, W w8) {
        h.t(view, w8);
    }

    public static void setOnReceiveContentListener(View view, String[] strArr, X x8) {
        if (Build.VERSION.SDK_INT >= 31) {
            o.setOnReceiveContentListener(view, strArr, x8);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z8 = false;
        if (x8 != null) {
            Z.h.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (strArr[i8].startsWith("*")) {
                    z8 = true;
                    break;
                }
                i8++;
            }
            Z.h.checkArgument(!z8, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(U.e.tag_on_receive_content_mime_types, strArr);
        view.setTag(U.e.tag_on_receive_content_listener, x8);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i8) {
        view.setOverScrollMode(i8);
    }

    @Deprecated
    public static void setPaddingRelative(View view, int i8, int i9, int i10, int i11) {
        view.setPaddingRelative(i8, i9, i10, i11);
    }

    @Deprecated
    public static void setPivotX(View view, float f8) {
        view.setPivotX(f8);
    }

    @Deprecated
    public static void setPivotY(View view, float f8) {
        view.setPivotY(f8);
    }

    public static void setPointerIcon(View view, C0924a0 c0924a0) {
        j.d(view, (PointerIcon) (c0924a0 != null ? c0924a0.getPointerIcon() : null));
    }

    @Deprecated
    public static void setRotation(View view, float f8) {
        view.setRotation(f8);
    }

    @Deprecated
    public static void setRotationX(View view, float f8) {
        view.setRotationX(f8);
    }

    @Deprecated
    public static void setRotationY(View view, float f8) {
        view.setRotationY(f8);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z8) {
        view.setSaveFromParentEnabled(z8);
    }

    @Deprecated
    public static void setScaleX(View view, float f8) {
        view.setScaleX(f8);
    }

    @Deprecated
    public static void setScaleY(View view, float f8) {
        view.setScaleY(f8);
    }

    public static void setScreenReaderFocusable(View view, boolean z8) {
        p().f(view, Boolean.valueOf(z8));
    }

    public static void setScrollIndicators(View view, int i8) {
        i.b(view, i8);
    }

    public static void setStateDescription(View view, CharSequence charSequence) {
        r().f(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(View view, List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.f(view, list);
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.o(view, charSequence);
        }
    }

    public static void setTransitionName(View view, String str) {
        h.u(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f8) {
        view.setTranslationX(f8);
    }

    @Deprecated
    public static void setTranslationY(View view, float f8) {
        view.setTranslationY(f8);
    }

    public static void setTranslationZ(View view, float f8) {
        h.v(view, f8);
    }

    public static void setWindowInsetsAnimationCallback(View view, D0.b bVar) {
        D0.a(view, bVar);
    }

    @Deprecated
    public static void setX(View view, float f8) {
        view.setX(f8);
    }

    @Deprecated
    public static void setY(View view, float f8) {
        view.setY(f8);
    }

    public static void setZ(View view, float f8) {
        h.w(view, f8);
    }

    public static boolean startDragAndDrop(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i8) {
        return j.e(view, clipData, dragShadowBuilder, obj, i8);
    }

    public static boolean startNestedScroll(View view, int i8) {
        return h.x(view, i8);
    }

    public static void stopNestedScroll(View view) {
        h.y(view);
    }

    public static void updateDragShadow(View view, View.DragShadowBuilder dragShadowBuilder) {
        j.f(view, dragShadowBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(View view, int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        if (view instanceof N) {
            return ((N) view).dispatchNestedPreScroll(i8, i9, iArr, iArr2, i10);
        }
        if (i10 == 0) {
            return dispatchNestedPreScroll(view, i8, i9, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(View view, int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        if (view instanceof O) {
            ((O) view).dispatchNestedScroll(i8, i9, i10, i11, iArr, i12, iArr2);
        } else {
            dispatchNestedScroll(view, i8, i9, i10, i11, iArr, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(View view, int i8) {
        if (view instanceof N) {
            ((N) view).hasNestedScrollingParent(i8);
            return false;
        }
        if (i8 == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    @Deprecated
    public static void postInvalidateOnAnimation(View view, int i8, int i9, int i10, int i11) {
        view.postInvalidateOnAnimation(i8, i9, i10, i11);
    }

    public static void setScrollIndicators(View view, int i8, int i9) {
        i.c(view, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(View view, int i8, int i9) {
        if (view instanceof N) {
            return ((N) view).startNestedScroll(i8, i9);
        }
        if (i9 == 0) {
            return startNestedScroll(view, i8);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(View view, int i8) {
        if (view instanceof N) {
            ((N) view).stopNestedScroll(i8);
        } else if (i8 == 0) {
            stopNestedScroll(view);
        }
    }

    public static boolean performHapticFeedback(View view, int i8, int i9) {
        int iA = B.a(i8);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(View view, int i8, int i9, int i10, int i11, int[] iArr, int i12) {
        if (view instanceof N) {
            return ((N) view).dispatchNestedScroll(i8, i9, i10, i11, iArr, i12);
        }
        if (i12 == 0) {
            return dispatchNestedScroll(view, i8, i9, i10, i11, iArr);
        }
        return false;
    }
}
