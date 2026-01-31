package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
abstract class b extends d {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f24305d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f24306e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24307f;

    /* renamed from: g, reason: collision with root package name */
    private int f24308g;

    /* renamed from: h, reason: collision with root package name */
    private int f24309h;

    /* renamed from: i, reason: collision with root package name */
    private int f24310i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f24311j;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f24312a;

        /* renamed from: b, reason: collision with root package name */
        private final View f24313b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f24312a = coordinatorLayout;
            this.f24313b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f24313b == null || (overScroller = b.this.f24306e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                b.this.h(this.f24312a, this.f24313b);
                return;
            }
            b bVar = b.this;
            bVar.j(this.f24312a, this.f24313b, bVar.f24306e.getCurrY());
            AbstractC0985p0.postOnAnimation(this.f24313b, this);
        }
    }

    public b() {
        this.f24308g = -1;
        this.f24310i = -1;
    }

    private void c() {
        if (this.f24311j == null) {
            this.f24311j = VelocityTracker.obtain();
        }
    }

    boolean b(View view) {
        return false;
    }

    final boolean d(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, float f8) {
        Runnable runnable = this.f24305d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f24305d = null;
        }
        if (this.f24306e == null) {
            this.f24306e = new OverScroller(view.getContext());
        }
        this.f24306e.fling(0, getTopAndBottomOffset(), 0, Math.round(f8), 0, 0, i8, i9);
        if (!this.f24306e.computeScrollOffset()) {
            h(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f24305d = aVar;
        AbstractC0985p0.postOnAnimation(view, aVar);
        return true;
    }

    int e(View view) {
        return -view.getHeight();
    }

    int f(View view) {
        return view.getHeight();
    }

    int g() {
        return getTopAndBottomOffset();
    }

    void h(CoordinatorLayout coordinatorLayout, View view) {
    }

    final int i(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
        return k(coordinatorLayout, view, g() - i8, i9, i10);
    }

    int j(CoordinatorLayout coordinatorLayout, View view, int i8) {
        return k(coordinatorLayout, view, i8, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int k(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i9 == 0 || topAndBottomOffset < i9 || topAndBottomOffset > i10 || topAndBottomOffset == (iClamp = X.a.clamp(i8, i9, i10))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f24310i < 0) {
            this.f24310i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f24307f) {
            int i8 = this.f24308g;
            if (i8 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i8)) == -1) {
                return false;
            }
            int y8 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y8 - this.f24309h) > this.f24310i) {
                this.f24309h = y8;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f24308g = -1;
            int x8 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            boolean z8 = b(view) && coordinatorLayout.isPointInChildBounds(view, x8, y9);
            this.f24307f = z8;
            if (z8) {
                this.f24309h = y9;
                this.f24308g = motionEvent.getPointerId(0);
                c();
                OverScroller overScroller = this.f24306e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f24306e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f24311j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f24308g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f24309h = r12
            goto L4c
        L2d:
            int r0 = r11.f24308g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f24309h
            int r7 = r1 - r0
            r11.f24309h = r0
            int r8 = r11.e(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.i(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f24311j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f24311j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f24311j
            int r4 = r11.f24308g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.f(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.d(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f24307f = r3
            r11.f24308g = r1
            android.view.VelocityTracker r13 = r11.f24311j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f24311j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f24311j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f24307f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.b.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24308g = -1;
        this.f24310i = -1;
    }
}
