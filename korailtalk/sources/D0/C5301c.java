package d0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.AbstractC0985p0;
import java.util.Arrays;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5301c {
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;

    /* renamed from: w, reason: collision with root package name */
    private static final Interpolator f29953w = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f29954a;

    /* renamed from: b, reason: collision with root package name */
    private int f29955b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f29957d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f29958e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f29959f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f29960g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f29961h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f29962i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f29963j;

    /* renamed from: k, reason: collision with root package name */
    private int f29964k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f29965l;

    /* renamed from: m, reason: collision with root package name */
    private float f29966m;

    /* renamed from: n, reason: collision with root package name */
    private float f29967n;

    /* renamed from: o, reason: collision with root package name */
    private int f29968o;

    /* renamed from: p, reason: collision with root package name */
    private int f29969p;

    /* renamed from: q, reason: collision with root package name */
    private OverScroller f29970q;

    /* renamed from: r, reason: collision with root package name */
    private final AbstractC0272c f29971r;

    /* renamed from: s, reason: collision with root package name */
    private View f29972s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f29973t;

    /* renamed from: u, reason: collision with root package name */
    private final ViewGroup f29974u;

    /* renamed from: c, reason: collision with root package name */
    private int f29956c = -1;

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f29975v = new b();

    /* renamed from: d0.c$a */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    }

    /* renamed from: d0.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5301c.this.t(0);
        }
    }

    private C5301c(Context context, ViewGroup viewGroup, AbstractC0272c abstractC0272c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0272c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f29974u = viewGroup;
        this.f29971r = abstractC0272c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f29968o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f29955b = viewConfiguration.getScaledTouchSlop();
        this.f29966m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f29967n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29970q = new OverScroller(context, f29953w);
    }

    private boolean a(float f8, float f9, int i8, int i9) {
        float fAbs = Math.abs(f8);
        float fAbs2 = Math.abs(f9);
        if ((this.f29961h[i8] & i9) != i9 || (this.f29969p & i9) == 0 || (this.f29963j[i8] & i9) == i9 || (this.f29962i[i8] & i9) == i9) {
            return false;
        }
        int i10 = this.f29955b;
        if (fAbs <= i10 && fAbs2 <= i10) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f29971r.onEdgeLock(i9)) {
            return (this.f29962i[i8] & i9) == 0 && fAbs > ((float) this.f29955b);
        }
        int[] iArr = this.f29963j;
        iArr[i8] = iArr[i8] | i9;
        return false;
    }

    private boolean b(View view, float f8, float f9) {
        if (view == null) {
            return false;
        }
        boolean z8 = this.f29971r.getViewHorizontalDragRange(view) > 0;
        boolean z9 = this.f29971r.getViewVerticalDragRange(view) > 0;
        if (!z8 || !z9) {
            return z8 ? Math.abs(f8) > ((float) this.f29955b) : z9 && Math.abs(f9) > ((float) this.f29955b);
        }
        float f10 = (f8 * f8) + (f9 * f9);
        int i8 = this.f29955b;
        return f10 > ((float) (i8 * i8));
    }

    private float c(float f8, float f9, float f10) {
        float fAbs = Math.abs(f8);
        if (fAbs < f9) {
            return 0.0f;
        }
        return fAbs > f10 ? f8 > 0.0f ? f10 : -f10 : f8;
    }

    public static C5301c create(ViewGroup viewGroup, AbstractC0272c abstractC0272c) {
        return new C5301c(viewGroup.getContext(), viewGroup, abstractC0272c);
    }

    private int d(int i8, int i9, int i10) {
        int iAbs = Math.abs(i8);
        if (iAbs < i9) {
            return 0;
        }
        return iAbs > i10 ? i8 > 0 ? i10 : -i10 : i8;
    }

    private void e() {
        float[] fArr = this.f29957d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f29958e, 0.0f);
        Arrays.fill(this.f29959f, 0.0f);
        Arrays.fill(this.f29960g, 0.0f);
        Arrays.fill(this.f29961h, 0);
        Arrays.fill(this.f29962i, 0);
        Arrays.fill(this.f29963j, 0);
        this.f29964k = 0;
    }

    private void f(int i8) {
        if (this.f29957d == null || !isPointerDown(i8)) {
            return;
        }
        this.f29957d[i8] = 0.0f;
        this.f29958e[i8] = 0.0f;
        this.f29959f[i8] = 0.0f;
        this.f29960g[i8] = 0.0f;
        this.f29961h[i8] = 0;
        this.f29962i[i8] = 0;
        this.f29963j[i8] = 0;
        this.f29964k = (~(1 << i8)) & this.f29964k;
    }

    private int g(int i8, int i9, int i10) {
        if (i8 == 0) {
            return 0;
        }
        int width = this.f29974u.getWidth();
        float f8 = width / 2;
        float fJ = f8 + (j(Math.min(1.0f, Math.abs(i8) / width)) * f8);
        int iAbs = Math.abs(i9);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fJ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i8) / i10) + 1.0f) * 256.0f), 600);
    }

    private int h(View view, int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        float f10;
        float f11;
        int iD = d(i10, (int) this.f29967n, (int) this.f29966m);
        int iD2 = d(i11, (int) this.f29967n, (int) this.f29966m);
        int iAbs = Math.abs(i8);
        int iAbs2 = Math.abs(i9);
        int iAbs3 = Math.abs(iD);
        int iAbs4 = Math.abs(iD2);
        int i12 = iAbs3 + iAbs4;
        int i13 = iAbs + iAbs2;
        if (iD != 0) {
            f8 = iAbs3;
            f9 = i12;
        } else {
            f8 = iAbs;
            f9 = i13;
        }
        float f12 = f8 / f9;
        if (iD2 != 0) {
            f10 = iAbs4;
            f11 = i12;
        } else {
            f10 = iAbs2;
            f11 = i13;
        }
        return (int) ((g(i8, iD, this.f29971r.getViewHorizontalDragRange(view)) * f12) + (g(i9, iD2, this.f29971r.getViewVerticalDragRange(view)) * (f10 / f11)));
    }

    private void i(float f8, float f9) {
        this.f29973t = true;
        this.f29971r.onViewReleased(this.f29972s, f8, f9);
        this.f29973t = false;
        if (this.f29954a == 1) {
            t(0);
        }
    }

    private float j(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    private void k(int i8, int i9, int i10, int i11) {
        int left = this.f29972s.getLeft();
        int top = this.f29972s.getTop();
        if (i10 != 0) {
            i8 = this.f29971r.clampViewPositionHorizontal(this.f29972s, i8, i10);
            AbstractC0985p0.offsetLeftAndRight(this.f29972s, i8 - left);
        }
        int i12 = i8;
        if (i11 != 0) {
            i9 = this.f29971r.clampViewPositionVertical(this.f29972s, i9, i11);
            AbstractC0985p0.offsetTopAndBottom(this.f29972s, i9 - top);
        }
        int i13 = i9;
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f29971r.onViewPositionChanged(this.f29972s, i12, i13, i12 - left, i13 - top);
    }

    private void l(int i8) {
        float[] fArr = this.f29957d;
        if (fArr == null || fArr.length <= i8) {
            int i9 = i8 + 1;
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[i9];
            float[] fArr4 = new float[i9];
            float[] fArr5 = new float[i9];
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f29958e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f29959f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f29960g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f29961h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f29962i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f29963j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f29957d = fArr2;
            this.f29958e = fArr3;
            this.f29959f = fArr4;
            this.f29960g = fArr5;
            this.f29961h = iArr;
            this.f29962i = iArr2;
            this.f29963j = iArr3;
        }
    }

    private boolean m(int i8, int i9, int i10, int i11) {
        int left = this.f29972s.getLeft();
        int top = this.f29972s.getTop();
        int i12 = i8 - left;
        int i13 = i9 - top;
        if (i12 == 0 && i13 == 0) {
            this.f29970q.abortAnimation();
            t(0);
            return false;
        }
        this.f29970q.startScroll(left, top, i12, i13, h(this.f29972s, i12, i13, i10, i11));
        t(2);
        return true;
    }

    private int n(int i8, int i9) {
        int i10 = i8 < this.f29974u.getLeft() + this.f29968o ? 1 : 0;
        if (i9 < this.f29974u.getTop() + this.f29968o) {
            i10 |= 4;
        }
        if (i8 > this.f29974u.getRight() - this.f29968o) {
            i10 |= 2;
        }
        return i9 > this.f29974u.getBottom() - this.f29968o ? i10 | 8 : i10;
    }

    private boolean o(int i8) {
        if (isPointerDown(i8)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i8 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void p() {
        this.f29965l.computeCurrentVelocity(1000, this.f29966m);
        i(c(this.f29965l.getXVelocity(this.f29956c), this.f29967n, this.f29966m), c(this.f29965l.getYVelocity(this.f29956c), this.f29967n, this.f29966m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [d0.c$c] */
    private void q(float f8, float f9, int i8) {
        boolean zA = a(f8, f9, i8, 1);
        boolean z8 = zA;
        if (a(f9, f8, i8, 4)) {
            z8 = (zA ? 1 : 0) | 4;
        }
        boolean z9 = z8;
        if (a(f8, f9, i8, 2)) {
            z9 = (z8 ? 1 : 0) | 2;
        }
        ?? r02 = z9;
        if (a(f9, f8, i8, 8)) {
            r02 = (z9 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f29962i;
            iArr[i8] = iArr[i8] | r02;
            this.f29971r.onEdgeDragStarted(r02, i8);
        }
    }

    private void r(float f8, float f9, int i8) {
        l(i8);
        float[] fArr = this.f29957d;
        this.f29959f[i8] = f8;
        fArr[i8] = f8;
        float[] fArr2 = this.f29958e;
        this.f29960g[i8] = f9;
        fArr2[i8] = f9;
        this.f29961h[i8] = n((int) f8, (int) f9);
        this.f29964k |= 1 << i8;
    }

    private void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int pointerId = motionEvent.getPointerId(i8);
            if (o(pointerId)) {
                float x8 = motionEvent.getX(i8);
                float y8 = motionEvent.getY(i8);
                this.f29959f[pointerId] = x8;
                this.f29960g[pointerId] = y8;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.f29954a == 2) {
            int currX = this.f29970q.getCurrX();
            int currY = this.f29970q.getCurrY();
            this.f29970q.abortAnimation();
            int currX2 = this.f29970q.getCurrX();
            int currY2 = this.f29970q.getCurrY();
            this.f29971r.onViewPositionChanged(this.f29972s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        t(0);
    }

    public void cancel() {
        this.f29956c = -1;
        e();
        VelocityTracker velocityTracker = this.f29965l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29965l = null;
        }
    }

    public void captureChildView(View view, int i8) {
        if (view.getParent() == this.f29974u) {
            this.f29972s = view;
            this.f29956c = i8;
            this.f29971r.onViewCaptured(view, i8);
            t(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f29974u + ")");
    }

    public boolean checkTouchSlop(int i8) {
        int length = this.f29957d.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (checkTouchSlop(i8, i9)) {
                return true;
            }
        }
        return false;
    }

    public boolean continueSettling(boolean z8) {
        if (this.f29954a == 2) {
            boolean zComputeScrollOffset = this.f29970q.computeScrollOffset();
            int currX = this.f29970q.getCurrX();
            int currY = this.f29970q.getCurrY();
            int left = currX - this.f29972s.getLeft();
            int top = currY - this.f29972s.getTop();
            if (left != 0) {
                AbstractC0985p0.offsetLeftAndRight(this.f29972s, left);
            }
            if (top != 0) {
                AbstractC0985p0.offsetTopAndBottom(this.f29972s, top);
            }
            if (left != 0 || top != 0) {
                this.f29971r.onViewPositionChanged(this.f29972s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f29970q.getFinalX() && currY == this.f29970q.getFinalY()) {
                this.f29970q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z8) {
                    this.f29974u.post(this.f29975v);
                } else {
                    t(0);
                }
            }
        }
        return this.f29954a == 2;
    }

    public View findTopChildUnder(int i8, int i9) {
        for (int childCount = this.f29974u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f29974u.getChildAt(this.f29971r.getOrderedChildIndex(childCount));
            if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && i9 >= childAt.getTop() && i9 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i8, int i9, int i10, int i11) {
        if (!this.f29973t) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f29970q.fling(this.f29972s.getLeft(), this.f29972s.getTop(), (int) this.f29965l.getXVelocity(this.f29956c), (int) this.f29965l.getYVelocity(this.f29956c), i8, i10, i9, i11);
        t(2);
    }

    public int getActivePointerId() {
        return this.f29956c;
    }

    public View getCapturedView() {
        return this.f29972s;
    }

    public int getEdgeSize() {
        return this.f29968o;
    }

    public float getMinVelocity() {
        return this.f29967n;
    }

    public int getTouchSlop() {
        return this.f29955b;
    }

    public int getViewDragState() {
        return this.f29954a;
    }

    public boolean isCapturedViewUnder(int i8, int i9) {
        return isViewUnder(this.f29972s, i8, i9);
    }

    public boolean isEdgeTouched(int i8) {
        int length = this.f29961h.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (isEdgeTouched(i8, i9)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i8) {
        return ((1 << i8) & this.f29964k) != 0;
    }

    public boolean isViewUnder(View view, int i8, int i9) {
        return view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom();
    }

    public void processTouchEvent(MotionEvent motionEvent) {
        int i8;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f29965l == null) {
            this.f29965l = VelocityTracker.obtain();
        }
        this.f29965l.addMovement(motionEvent);
        int i9 = 0;
        if (actionMasked == 0) {
            float x8 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewFindTopChildUnder = findTopChildUnder((int) x8, (int) y8);
            r(x8, y8, pointerId);
            u(viewFindTopChildUnder, pointerId);
            int i10 = this.f29961h[pointerId];
            int i11 = this.f29969p;
            if ((i10 & i11) != 0) {
                this.f29971r.onEdgeTouched(i10 & i11, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f29954a == 1) {
                p();
            }
            cancel();
            return;
        }
        if (actionMasked == 2) {
            if (this.f29954a == 1) {
                if (o(this.f29956c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f29956c);
                    float x9 = motionEvent.getX(iFindPointerIndex);
                    float y9 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f29959f;
                    int i12 = this.f29956c;
                    int i13 = (int) (x9 - fArr[i12]);
                    int i14 = (int) (y9 - this.f29960g[i12]);
                    k(this.f29972s.getLeft() + i13, this.f29972s.getTop() + i14, i13, i14);
                    s(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i9 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i9);
                if (o(pointerId2)) {
                    float x10 = motionEvent.getX(i9);
                    float y10 = motionEvent.getY(i9);
                    float f8 = x10 - this.f29957d[pointerId2];
                    float f9 = y10 - this.f29958e[pointerId2];
                    q(f8, f9, pointerId2);
                    if (this.f29954a != 1) {
                        View viewFindTopChildUnder2 = findTopChildUnder((int) x10, (int) y10);
                        if (b(viewFindTopChildUnder2, f8, f9) && u(viewFindTopChildUnder2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i9++;
            }
            s(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f29954a == 1) {
                i(0.0f, 0.0f);
            }
            cancel();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x11 = motionEvent.getX(actionIndex);
            float y11 = motionEvent.getY(actionIndex);
            r(x11, y11, pointerId3);
            if (this.f29954a != 0) {
                if (isCapturedViewUnder((int) x11, (int) y11)) {
                    u(this.f29972s, pointerId3);
                    return;
                }
                return;
            } else {
                u(findTopChildUnder((int) x11, (int) y11), pointerId3);
                int i15 = this.f29961h[pointerId3];
                int i16 = this.f29969p;
                if ((i15 & i16) != 0) {
                    this.f29971r.onEdgeTouched(i15 & i16, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f29954a == 1 && pointerId4 == this.f29956c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i9 >= pointerCount2) {
                    i8 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i9);
                if (pointerId5 != this.f29956c) {
                    View viewFindTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i9), (int) motionEvent.getY(i9));
                    View view = this.f29972s;
                    if (viewFindTopChildUnder3 == view && u(view, pointerId5)) {
                        i8 = this.f29956c;
                        break;
                    }
                }
                i9++;
            }
            if (i8 == -1) {
                p();
            }
        }
        f(pointerId4);
    }

    public void setEdgeTrackingEnabled(int i8) {
        this.f29969p = i8;
    }

    public void setMinVelocity(float f8) {
        this.f29967n = f8;
    }

    public boolean settleCapturedViewAt(int i8, int i9) {
        if (this.f29973t) {
            return m(i8, i9, (int) this.f29965l.getXVelocity(this.f29956c), (int) this.f29965l.getYVelocity(this.f29956c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C5301c.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(View view, int i8, int i9) {
        this.f29972s = view;
        this.f29956c = -1;
        boolean zM = m(i8, i9, 0, 0);
        if (!zM && this.f29954a == 0 && this.f29972s != null) {
            this.f29972s = null;
        }
        return zM;
    }

    void t(int i8) {
        this.f29974u.removeCallbacks(this.f29975v);
        if (this.f29954a != i8) {
            this.f29954a = i8;
            this.f29971r.onViewDragStateChanged(i8);
            if (this.f29954a == 0) {
                this.f29972s = null;
            }
        }
    }

    boolean u(View view, int i8) {
        if (view == this.f29972s && this.f29956c == i8) {
            return true;
        }
        if (view == null || !this.f29971r.tryCaptureView(view, i8)) {
            return false;
        }
        this.f29956c = i8;
        captureChildView(view, i8);
        return true;
    }

    public static C5301c create(ViewGroup viewGroup, float f8, AbstractC0272c abstractC0272c) {
        C5301c c5301cCreate = create(viewGroup, abstractC0272c);
        c5301cCreate.f29955b = (int) (c5301cCreate.f29955b * (1.0f / f8));
        return c5301cCreate;
    }

    public boolean checkTouchSlop(int i8, int i9) {
        if (!isPointerDown(i9)) {
            return false;
        }
        boolean z8 = (i8 & 1) == 1;
        boolean z9 = (i8 & 2) == 2;
        float f8 = this.f29959f[i9] - this.f29957d[i9];
        float f9 = this.f29960g[i9] - this.f29958e[i9];
        if (!z8 || !z9) {
            return z8 ? Math.abs(f8) > ((float) this.f29955b) : z9 && Math.abs(f9) > ((float) this.f29955b);
        }
        float f10 = (f8 * f8) + (f9 * f9);
        int i10 = this.f29955b;
        return f10 > ((float) (i10 * i10));
    }

    public boolean isEdgeTouched(int i8, int i9) {
        return isPointerDown(i9) && (i8 & this.f29961h[i9]) != 0;
    }

    /* renamed from: d0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0272c {
        public int clampViewPositionHorizontal(View view, int i8, int i9) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i8, int i9) {
            return 0;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public boolean onEdgeLock(int i8) {
            return false;
        }

        public abstract boolean tryCaptureView(View view, int i8);

        public int getOrderedChildIndex(int i8) {
            return i8;
        }

        public void onViewDragStateChanged(int i8) {
        }

        public void onEdgeDragStarted(int i8, int i9) {
        }

        public void onEdgeTouched(int i8, int i9) {
        }

        public void onViewCaptured(View view, int i8) {
        }

        public void onViewReleased(View view, float f8, float f9) {
        }

        public void onViewPositionChanged(View view, int i8, int i9, int i10, int i11) {
        }
    }
}
