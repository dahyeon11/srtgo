package d0;

import O.i;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.AbstractC0997v0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.AbstractC0927b;
import androidx.core.view.accessibility.H;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.N;
import d0.AbstractC5300b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5299a extends C0923a {
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    private static final Rect f29935n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    private static final AbstractC5300b.a f29936o = new C0270a();

    /* renamed from: p, reason: collision with root package name */
    private static final AbstractC5300b.InterfaceC0271b f29937p = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f29942h;

    /* renamed from: i, reason: collision with root package name */
    private final View f29943i;

    /* renamed from: j, reason: collision with root package name */
    private c f29944j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f29938d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f29939e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f29940f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f29941g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f29945k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f29946l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f29947m = Integer.MIN_VALUE;

    /* renamed from: d0.a$a, reason: collision with other inner class name */
    static class C0270a implements AbstractC5300b.a {
        C0270a() {
        }

        @Override // d0.AbstractC5300b.a
        public void obtainBounds(H h8, Rect rect) {
            h8.getBoundsInParent(rect);
        }
    }

    /* renamed from: d0.a$b */
    static class b implements AbstractC5300b.InterfaceC0271b {
        b() {
        }

        @Override // d0.AbstractC5300b.InterfaceC0271b
        public H get(i iVar, int i8) {
            return (H) iVar.valueAt(i8);
        }

        @Override // d0.AbstractC5300b.InterfaceC0271b
        public int size(i iVar) {
            return iVar.size();
        }
    }

    /* renamed from: d0.a$c */
    private class c extends M {
        c() {
        }

        @Override // androidx.core.view.accessibility.M
        public H createAccessibilityNodeInfo(int i8) {
            return H.obtain(AbstractC5299a.this.t(i8));
        }

        @Override // androidx.core.view.accessibility.M
        public H findFocus(int i8) {
            int i9 = i8 == 2 ? AbstractC5299a.this.f29945k : AbstractC5299a.this.f29946l;
            if (i9 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i9);
        }

        @Override // androidx.core.view.accessibility.M
        public boolean performAction(int i8, int i9, Bundle bundle) {
            return AbstractC5299a.this.A(i8, i9, bundle);
        }
    }

    public AbstractC5299a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f29943i = view;
        this.f29942h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC0985p0.getImportantForAccessibility(view) == 0) {
            AbstractC0985p0.setImportantForAccessibility(view, 1);
        }
    }

    private boolean B(int i8, int i9, Bundle bundle) {
        return i9 != 1 ? i9 != 2 ? i9 != 64 ? i9 != 128 ? u(i8, i9, bundle) : e(i8) : D(i8) : clearKeyboardFocusForVirtualView(i8) : requestKeyboardFocusForVirtualView(i8);
    }

    private boolean C(int i8, Bundle bundle) {
        return AbstractC0985p0.performAccessibilityAction(this.f29943i, i8, bundle);
    }

    private boolean D(int i8) {
        int i9;
        if (!this.f29942h.isEnabled() || !this.f29942h.isTouchExplorationEnabled() || (i9 = this.f29945k) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            e(i9);
        }
        this.f29945k = i8;
        this.f29943i.invalidate();
        sendEventForVirtualView(i8, 32768);
        return true;
    }

    private void E(int i8) {
        int i9 = this.f29947m;
        if (i9 == i8) {
            return;
        }
        this.f29947m = i8;
        sendEventForVirtualView(i8, 128);
        sendEventForVirtualView(i9, 256);
    }

    private boolean e(int i8) {
        if (this.f29945k != i8) {
            return false;
        }
        this.f29945k = Integer.MIN_VALUE;
        this.f29943i.invalidate();
        sendEventForVirtualView(i8, 65536);
        return true;
    }

    private boolean f() {
        int i8 = this.f29946l;
        return i8 != Integer.MIN_VALUE && u(i8, 16, null);
    }

    private AccessibilityEvent g(int i8, int i9) {
        return i8 != -1 ? h(i8, i9) : i(i9);
    }

    private AccessibilityEvent h(int i8, int i9) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i9);
        H hT = t(i8);
        accessibilityEventObtain.getText().add(hT.getText());
        accessibilityEventObtain.setContentDescription(hT.getContentDescription());
        accessibilityEventObtain.setScrollable(hT.isScrollable());
        accessibilityEventObtain.setPassword(hT.isPassword());
        accessibilityEventObtain.setEnabled(hT.isEnabled());
        accessibilityEventObtain.setChecked(hT.isChecked());
        w(i8, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(hT.getClassName());
        N.setSource(accessibilityEventObtain, this.f29943i, i8);
        accessibilityEventObtain.setPackageName(this.f29943i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent i(int i8) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i8);
        this.f29943i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private H j(int i8) {
        H hObtain = H.obtain();
        hObtain.setEnabled(true);
        hObtain.setFocusable(true);
        hObtain.setClassName("android.view.View");
        Rect rect = f29935n;
        hObtain.setBoundsInParent(rect);
        hObtain.setBoundsInScreen(rect);
        hObtain.setParent(this.f29943i);
        y(i8, hObtain);
        if (hObtain.getText() == null && hObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        hObtain.getBoundsInParent(this.f29939e);
        if (this.f29939e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = hObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        hObtain.setPackageName(this.f29943i.getContext().getPackageName());
        hObtain.setSource(this.f29943i, i8);
        if (this.f29945k == i8) {
            hObtain.setAccessibilityFocused(true);
            hObtain.addAction(128);
        } else {
            hObtain.setAccessibilityFocused(false);
            hObtain.addAction(64);
        }
        boolean z8 = this.f29946l == i8;
        if (z8) {
            hObtain.addAction(2);
        } else if (hObtain.isFocusable()) {
            hObtain.addAction(1);
        }
        hObtain.setFocused(z8);
        this.f29943i.getLocationOnScreen(this.f29941g);
        hObtain.getBoundsInScreen(this.f29938d);
        if (this.f29938d.equals(rect)) {
            hObtain.getBoundsInParent(this.f29938d);
            if (hObtain.mParentVirtualDescendantId != -1) {
                H hObtain2 = H.obtain();
                for (int i9 = hObtain.mParentVirtualDescendantId; i9 != -1; i9 = hObtain2.mParentVirtualDescendantId) {
                    hObtain2.setParent(this.f29943i, -1);
                    hObtain2.setBoundsInParent(f29935n);
                    y(i9, hObtain2);
                    hObtain2.getBoundsInParent(this.f29939e);
                    Rect rect2 = this.f29938d;
                    Rect rect3 = this.f29939e;
                    rect2.offset(rect3.left, rect3.top);
                }
                hObtain2.recycle();
            }
            this.f29938d.offset(this.f29941g[0] - this.f29943i.getScrollX(), this.f29941g[1] - this.f29943i.getScrollY());
        }
        if (this.f29943i.getLocalVisibleRect(this.f29940f)) {
            this.f29940f.offset(this.f29941g[0] - this.f29943i.getScrollX(), this.f29941g[1] - this.f29943i.getScrollY());
            if (this.f29938d.intersect(this.f29940f)) {
                hObtain.setBoundsInScreen(this.f29938d);
                if (q(this.f29938d)) {
                    hObtain.setVisibleToUser(true);
                }
            }
        }
        return hObtain;
    }

    private H k() {
        H hObtain = H.obtain(this.f29943i);
        AbstractC0985p0.onInitializeAccessibilityNodeInfo(this.f29943i, hObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (hObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            hObtain.addChild(this.f29943i, ((Integer) arrayList.get(i8)).intValue());
        }
        return hObtain;
    }

    private i l() {
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        i iVar = new i();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            iVar.put(i8, j(i8));
        }
        return iVar;
    }

    private void m(int i8, Rect rect) {
        t(i8).getBoundsInParent(rect);
    }

    private static Rect p(View view, int i8, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i8 == 17) {
            rect.set(width, 0, width, height);
        } else if (i8 == 33) {
            rect.set(0, height, width, height);
        } else if (i8 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean q(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f29943i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f29943i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int r(int i8) {
        if (i8 == 19) {
            return 33;
        }
        if (i8 != 21) {
            return i8 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean s(int i8, Rect rect) {
        H h8;
        i iVarL = l();
        int i9 = this.f29946l;
        H h9 = i9 == Integer.MIN_VALUE ? null : (H) iVarL.get(i9);
        if (i8 == 1 || i8 == 2) {
            h8 = (H) AbstractC5300b.findNextFocusInRelativeDirection(iVarL, f29937p, f29936o, h9, i8, AbstractC0985p0.getLayoutDirection(this.f29943i) == 1, false);
        } else {
            if (i8 != 17 && i8 != 33 && i8 != 66 && i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i10 = this.f29946l;
            if (i10 != Integer.MIN_VALUE) {
                m(i10, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                p(this.f29943i, i8, rect2);
            }
            h8 = (H) AbstractC5300b.findNextFocusInAbsoluteDirection(iVarL, f29937p, f29936o, h9, rect2, i8);
        }
        return requestKeyboardFocusForVirtualView(h8 != null ? iVarL.keyAt(iVarL.indexOfValue(h8)) : Integer.MIN_VALUE);
    }

    boolean A(int i8, int i9, Bundle bundle) {
        return i8 != -1 ? B(i8, i9, bundle) : C(i9, bundle);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i8) {
        if (this.f29946l != i8) {
            return false;
        }
        this.f29946l = Integer.MIN_VALUE;
        z(i8, false);
        sendEventForVirtualView(i8, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f29942h.isEnabled() || !this.f29942h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            E(iN);
            return iN != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f29947m == Integer.MIN_VALUE) {
            return false;
        }
        E(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i8 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return s(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return s(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iR = r(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z8 = false;
                    while (i8 < repeatCount && s(iR, null)) {
                        i8++;
                        z8 = true;
                    }
                    return z8;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        f();
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f29945k;
    }

    @Override // androidx.core.view.C0923a
    public M getAccessibilityNodeProvider(View view) {
        if (this.f29944j == null) {
            this.f29944j = new c();
        }
        return this.f29944j;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.f29946l;
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i8) {
        invalidateVirtualView(i8, 0);
    }

    protected abstract int n(float f8, float f9);

    protected abstract void o(List list);

    public final void onFocusChanged(boolean z8, int i8, Rect rect) {
        int i9 = this.f29946l;
        if (i9 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i9);
        }
        if (z8) {
            s(i8, rect);
        }
    }

    @Override // androidx.core.view.C0923a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        v(accessibilityEvent);
    }

    @Override // androidx.core.view.C0923a
    public void onInitializeAccessibilityNodeInfo(View view, H h8) {
        super.onInitializeAccessibilityNodeInfo(view, h8);
        x(h8);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i8) {
        int i9;
        if ((!this.f29943i.isFocused() && !this.f29943i.requestFocus()) || (i9 = this.f29946l) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i9);
        }
        this.f29946l = i8;
        z(i8, true);
        sendEventForVirtualView(i8, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i8, int i9) {
        ViewParent parent;
        if (i8 == Integer.MIN_VALUE || !this.f29942h.isEnabled() || (parent = this.f29943i.getParent()) == null) {
            return false;
        }
        return AbstractC0997v0.requestSendAccessibilityEvent(parent, this.f29943i, g(i8, i9));
    }

    H t(int i8) {
        return i8 == -1 ? k() : j(i8);
    }

    protected abstract boolean u(int i8, int i9, Bundle bundle);

    protected abstract void y(int i8, H h8);

    public final void invalidateVirtualView(int i8, int i9) {
        ViewParent parent;
        if (i8 == Integer.MIN_VALUE || !this.f29942h.isEnabled() || (parent = this.f29943i.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventG = g(i8, 2048);
        AbstractC0927b.setContentChangeTypes(accessibilityEventG, i9);
        AbstractC0997v0.requestSendAccessibilityEvent(parent, this.f29943i, accessibilityEventG);
    }

    protected void v(AccessibilityEvent accessibilityEvent) {
    }

    protected void x(H h8) {
    }

    protected void w(int i8, AccessibilityEvent accessibilityEvent) {
    }

    protected void z(int i8, boolean z8) {
    }
}
