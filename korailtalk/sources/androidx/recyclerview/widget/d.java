package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.AbstractC0985p0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.iid.w;
import f2.C5392b;

/* loaded from: classes.dex */
class d extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f10546D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f10547E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f10548A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f10549B;

    /* renamed from: C, reason: collision with root package name */
    private final RecyclerView.u f10550C;

    /* renamed from: a, reason: collision with root package name */
    private final int f10551a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10552b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f10553c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f10554d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10555e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10556f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f10557g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f10558h;

    /* renamed from: i, reason: collision with root package name */
    private final int f10559i;

    /* renamed from: j, reason: collision with root package name */
    private final int f10560j;

    /* renamed from: k, reason: collision with root package name */
    int f10561k;

    /* renamed from: l, reason: collision with root package name */
    int f10562l;

    /* renamed from: m, reason: collision with root package name */
    float f10563m;

    /* renamed from: n, reason: collision with root package name */
    int f10564n;

    /* renamed from: o, reason: collision with root package name */
    int f10565o;

    /* renamed from: p, reason: collision with root package name */
    float f10566p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f10569s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f10576z;

    /* renamed from: q, reason: collision with root package name */
    private int f10567q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f10568r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10570t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10571u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f10572v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f10573w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f10574x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f10575y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.g(w.ERROR_UNKNOWN);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            d.this.q(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10579a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10579a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10579a) {
                this.f10579a = false;
                return;
            }
            if (((Float) d.this.f10576z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f10548A = 0;
                dVar.o(0);
            } else {
                d dVar2 = d.this;
                dVar2.f10548A = 2;
                dVar2.l();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0164d implements ValueAnimator.AnimatorUpdateListener {
        C0164d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f10553c.setAlpha(iFloatValue);
            d.this.f10554d.setAlpha(iFloatValue);
            d.this.l();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i8, int i9, int i10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10576z = valueAnimatorOfFloat;
        this.f10548A = 0;
        this.f10549B = new a();
        this.f10550C = new b();
        this.f10553c = stateListDrawable;
        this.f10554d = drawable;
        this.f10557g = stateListDrawable2;
        this.f10558h = drawable2;
        this.f10555e = Math.max(i8, stateListDrawable.getIntrinsicWidth());
        this.f10556f = Math.max(i8, drawable.getIntrinsicWidth());
        this.f10559i = Math.max(i8, stateListDrawable2.getIntrinsicWidth());
        this.f10560j = Math.max(i8, drawable2.getIntrinsicWidth());
        this.f10551a = i9;
        this.f10552b = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0164d());
        attachToRecyclerView(recyclerView);
    }

    private void a() {
        this.f10569s.removeCallbacks(this.f10549B);
    }

    private void b() {
        this.f10569s.removeItemDecoration(this);
        this.f10569s.removeOnItemTouchListener(this);
        this.f10569s.removeOnScrollListener(this.f10550C);
        a();
    }

    private void c(Canvas canvas) {
        int i8 = this.f10568r;
        int i9 = this.f10559i;
        int i10 = this.f10565o;
        int i11 = this.f10564n;
        this.f10557g.setBounds(0, 0, i11, i9);
        this.f10558h.setBounds(0, 0, this.f10567q, this.f10560j);
        canvas.translate(0.0f, i8 - i9);
        this.f10558h.draw(canvas);
        canvas.translate(i10 - (i11 / 2), 0.0f);
        this.f10557g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void d(Canvas canvas) {
        int i8 = this.f10567q;
        int i9 = this.f10555e;
        int i10 = i8 - i9;
        int i11 = this.f10562l;
        int i12 = this.f10561k;
        int i13 = i11 - (i12 / 2);
        this.f10553c.setBounds(0, 0, i9, i12);
        this.f10554d.setBounds(0, 0, this.f10556f, this.f10568r);
        if (!i()) {
            canvas.translate(i10, 0.0f);
            this.f10554d.draw(canvas);
            canvas.translate(0.0f, i13);
            this.f10553c.draw(canvas);
            canvas.translate(-i10, -i13);
            return;
        }
        this.f10554d.draw(canvas);
        canvas.translate(this.f10555e, i13);
        canvas.scale(-1.0f, 1.0f);
        this.f10553c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f10555e, -i13);
    }

    private int[] e() {
        int[] iArr = this.f10575y;
        int i8 = this.f10552b;
        iArr[0] = i8;
        iArr[1] = this.f10567q - i8;
        return iArr;
    }

    private int[] f() {
        int[] iArr = this.f10574x;
        int i8 = this.f10552b;
        iArr[0] = i8;
        iArr[1] = this.f10568r - i8;
        return iArr;
    }

    private void h(float f8) {
        int[] iArrE = e();
        float fMax = Math.max(iArrE[0], Math.min(iArrE[1], f8));
        if (Math.abs(this.f10565o - fMax) < 2.0f) {
            return;
        }
        int iN = n(this.f10566p, fMax, iArrE, this.f10569s.computeHorizontalScrollRange(), this.f10569s.computeHorizontalScrollOffset(), this.f10567q);
        if (iN != 0) {
            this.f10569s.scrollBy(iN, 0);
        }
        this.f10566p = fMax;
    }

    private boolean i() {
        return AbstractC0985p0.getLayoutDirection(this.f10569s) == 1;
    }

    private void m(int i8) {
        a();
        this.f10569s.postDelayed(this.f10549B, i8);
    }

    private int n(float f8, float f9, int[] iArr, int i8, int i9, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 == 0) {
            return 0;
        }
        int i12 = i8 - i10;
        int i13 = (int) (((f9 - f8) / i11) * i12);
        int i14 = i9 + i13;
        if (i14 >= i12 || i14 < 0) {
            return 0;
        }
        return i13;
    }

    private void p() {
        this.f10569s.addItemDecoration(this);
        this.f10569s.addOnItemTouchListener(this);
        this.f10569s.addOnScrollListener(this.f10550C);
    }

    private void r(float f8) {
        int[] iArrF = f();
        float fMax = Math.max(iArrF[0], Math.min(iArrF[1], f8));
        if (Math.abs(this.f10562l - fMax) < 2.0f) {
            return;
        }
        int iN = n(this.f10563m, fMax, iArrF, this.f10569s.computeVerticalScrollRange(), this.f10569s.computeVerticalScrollOffset(), this.f10568r);
        if (iN != 0) {
            this.f10569s.scrollBy(0, iN);
        }
        this.f10563m = fMax;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10569s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            b();
        }
        this.f10569s = recyclerView;
        if (recyclerView != null) {
            p();
        }
    }

    void g(int i8) {
        int i9 = this.f10548A;
        if (i9 == 1) {
            this.f10576z.cancel();
        } else if (i9 != 2) {
            return;
        }
        this.f10548A = 3;
        ValueAnimator valueAnimator = this.f10576z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f10576z.setDuration(i8);
        this.f10576z.start();
    }

    public boolean isDragging() {
        return this.f10572v == 2;
    }

    boolean j(float f8, float f9) {
        if (f9 >= this.f10568r - this.f10559i) {
            int i8 = this.f10565o;
            int i9 = this.f10564n;
            if (f8 >= i8 - (i9 / 2) && f8 <= i8 + (i9 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean k(float f8, float f9) {
        if (!i() ? f8 >= this.f10567q - this.f10555e : f8 <= this.f10555e) {
            int i8 = this.f10562l;
            int i9 = this.f10561k;
            if (f9 >= i8 - (i9 / 2) && f9 <= i8 + (i9 / 2)) {
                return true;
            }
        }
        return false;
    }

    void l() {
        this.f10569s.invalidate();
    }

    void o(int i8) {
        if (i8 == 2 && this.f10572v != 2) {
            this.f10553c.setState(f10546D);
            a();
        }
        if (i8 == 0) {
            l();
        } else {
            show();
        }
        if (this.f10572v == 2 && i8 != 2) {
            this.f10553c.setState(f10547E);
            m(1200);
        } else if (i8 == 1) {
            m(C5392b.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f10572v = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b9) {
        if (this.f10567q != this.f10569s.getWidth() || this.f10568r != this.f10569s.getHeight()) {
            this.f10567q = this.f10569s.getWidth();
            this.f10568r = this.f10569s.getHeight();
            o(0);
        } else if (this.f10548A != 0) {
            if (this.f10570t) {
                d(canvas);
            }
            if (this.f10571u) {
                c(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i8 = this.f10572v;
        if (i8 == 1) {
            boolean zK = k(motionEvent.getX(), motionEvent.getY());
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zK && !zJ) {
                return false;
            }
            if (zJ) {
                this.f10573w = 1;
                this.f10566p = (int) motionEvent.getX();
            } else if (zK) {
                this.f10573w = 2;
                this.f10563m = (int) motionEvent.getY();
            }
            o(2);
        } else if (i8 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onRequestDisallowInterceptTouchEvent(boolean z8) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f10572v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zK = k(motionEvent.getX(), motionEvent.getY());
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            if (zK || zJ) {
                if (zJ) {
                    this.f10573w = 1;
                    this.f10566p = (int) motionEvent.getX();
                } else if (zK) {
                    this.f10573w = 2;
                    this.f10563m = (int) motionEvent.getY();
                }
                o(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10572v == 2) {
            this.f10563m = 0.0f;
            this.f10566p = 0.0f;
            o(1);
            this.f10573w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10572v == 2) {
            show();
            if (this.f10573w == 1) {
                h(motionEvent.getX());
            }
            if (this.f10573w == 2) {
                r(motionEvent.getY());
            }
        }
    }

    void q(int i8, int i9) {
        int iComputeVerticalScrollRange = this.f10569s.computeVerticalScrollRange();
        int i10 = this.f10568r;
        this.f10570t = iComputeVerticalScrollRange - i10 > 0 && i10 >= this.f10551a;
        int iComputeHorizontalScrollRange = this.f10569s.computeHorizontalScrollRange();
        int i11 = this.f10567q;
        boolean z8 = iComputeHorizontalScrollRange - i11 > 0 && i11 >= this.f10551a;
        this.f10571u = z8;
        boolean z9 = this.f10570t;
        if (!z9 && !z8) {
            if (this.f10572v != 0) {
                o(0);
                return;
            }
            return;
        }
        if (z9) {
            float f8 = i10;
            this.f10562l = (int) ((f8 * (i9 + (f8 / 2.0f))) / iComputeVerticalScrollRange);
            this.f10561k = Math.min(i10, (i10 * i10) / iComputeVerticalScrollRange);
        }
        if (this.f10571u) {
            float f9 = i11;
            this.f10565o = (int) ((f9 * (i8 + (f9 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f10564n = Math.min(i11, (i11 * i11) / iComputeHorizontalScrollRange);
        }
        int i12 = this.f10572v;
        if (i12 == 0 || i12 == 1) {
            o(1);
        }
    }

    public void show() {
        int i8 = this.f10548A;
        if (i8 != 0) {
            if (i8 != 3) {
                return;
            } else {
                this.f10576z.cancel();
            }
        }
        this.f10548A = 1;
        ValueAnimator valueAnimator = this.f10576z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f10576z.setDuration(500L);
        this.f10576z.setStartDelay(0L);
        this.f10576z.start();
    }
}
