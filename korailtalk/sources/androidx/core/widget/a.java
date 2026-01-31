package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC0985p0;
import com.google.firebase.iid.w;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    private static final int f9320r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    final View f9323c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f9324d;

    /* renamed from: g, reason: collision with root package name */
    private int f9327g;

    /* renamed from: h, reason: collision with root package name */
    private int f9328h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9332l;

    /* renamed from: m, reason: collision with root package name */
    boolean f9333m;

    /* renamed from: n, reason: collision with root package name */
    boolean f9334n;

    /* renamed from: o, reason: collision with root package name */
    boolean f9335o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f9336p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f9337q;

    /* renamed from: a, reason: collision with root package name */
    final C0147a f9321a = new C0147a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f9322b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f9325e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f9326f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private float[] f9329i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f9330j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f9331k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0147a {

        /* renamed from: a, reason: collision with root package name */
        private int f9338a;

        /* renamed from: b, reason: collision with root package name */
        private int f9339b;

        /* renamed from: c, reason: collision with root package name */
        private float f9340c;

        /* renamed from: d, reason: collision with root package name */
        private float f9341d;

        /* renamed from: j, reason: collision with root package name */
        private float f9347j;

        /* renamed from: k, reason: collision with root package name */
        private int f9348k;

        /* renamed from: e, reason: collision with root package name */
        private long f9342e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f9346i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f9343f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f9344g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f9345h = 0;

        C0147a() {
        }

        private float a(long j8) {
            if (j8 < this.f9342e) {
                return 0.0f;
            }
            long j9 = this.f9346i;
            if (j9 < 0 || j8 < j9) {
                return a.c((j8 - r0) / this.f9338a, 0.0f, 1.0f) * 0.5f;
            }
            float f8 = this.f9347j;
            return (1.0f - f8) + (f8 * a.c((j8 - j9) / this.f9348k, 0.0f, 1.0f));
        }

        private float b(float f8) {
            return ((-4.0f) * f8 * f8) + (f8 * 4.0f);
        }

        public void computeScrollDelta() {
            if (this.f9343f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fB = b(a(jCurrentAnimationTimeMillis));
            long j8 = jCurrentAnimationTimeMillis - this.f9343f;
            this.f9343f = jCurrentAnimationTimeMillis;
            float f8 = j8 * fB;
            this.f9344g = (int) (this.f9340c * f8);
            this.f9345h = (int) (f8 * this.f9341d);
        }

        public int getDeltaX() {
            return this.f9344g;
        }

        public int getDeltaY() {
            return this.f9345h;
        }

        public int getHorizontalDirection() {
            float f8 = this.f9340c;
            return (int) (f8 / Math.abs(f8));
        }

        public int getVerticalDirection() {
            float f8 = this.f9341d;
            return (int) (f8 / Math.abs(f8));
        }

        public boolean isFinished() {
            return this.f9346i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9346i + ((long) this.f9348k);
        }

        public void requestStop() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9348k = a.d((int) (jCurrentAnimationTimeMillis - this.f9342e), 0, this.f9339b);
            this.f9347j = a(jCurrentAnimationTimeMillis);
            this.f9346i = jCurrentAnimationTimeMillis;
        }

        public void setRampDownDuration(int i8) {
            this.f9339b = i8;
        }

        public void setRampUpDuration(int i8) {
            this.f9338a = i8;
        }

        public void setTargetVelocity(float f8, float f9) {
            this.f9340c = f8;
            this.f9341d = f9;
        }

        public void start() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9342e = jCurrentAnimationTimeMillis;
            this.f9346i = -1L;
            this.f9343f = jCurrentAnimationTimeMillis;
            this.f9347j = 0.5f;
            this.f9344g = 0;
            this.f9345h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f9335o) {
                if (aVar.f9333m) {
                    aVar.f9333m = false;
                    aVar.f9321a.start();
                }
                C0147a c0147a = a.this.f9321a;
                if (c0147a.isFinished() || !a.this.h()) {
                    a.this.f9335o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f9334n) {
                    aVar2.f9334n = false;
                    aVar2.a();
                }
                c0147a.computeScrollDelta();
                a.this.scrollTargetBy(c0147a.getDeltaX(), c0147a.getDeltaY());
                AbstractC0985p0.postOnAnimation(a.this.f9323c, this);
            }
        }
    }

    public a(View view) {
        this.f9323c = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = (int) ((1575.0f * f8) + 0.5f);
        setMaximumVelocity(f9, f9);
        float f10 = (int) ((f8 * 315.0f) + 0.5f);
        setMinimumVelocity(f10, f10);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(f9320r);
        setRampUpDuration(w.ERROR_UNKNOWN);
        setRampDownDuration(w.ERROR_UNKNOWN);
    }

    private float b(int i8, float f8, float f9, float f10) {
        float f11 = f(this.f9325e[i8], f9, this.f9326f[i8], f8);
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f9329i[i8];
        float f13 = this.f9330j[i8];
        float f14 = this.f9331k[i8];
        float f15 = f12 * f10;
        return f11 > 0.0f ? c(f11 * f15, f13, f14) : -c((-f11) * f15, f13, f14);
    }

    static float c(float f8, float f9, float f10) {
        return f8 > f10 ? f10 : f8 < f9 ? f9 : f8;
    }

    static int d(int i8, int i9, int i10) {
        return i8 > i10 ? i10 : i8 < i9 ? i9 : i8;
    }

    private float e(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int i8 = this.f9327g;
        if (i8 == 0 || i8 == 1) {
            if (f8 < f9) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f9);
                }
                if (this.f9335o && i8 == 1) {
                    return 1.0f;
                }
            }
        } else if (i8 == 2 && f8 < 0.0f) {
            return f8 / (-f9);
        }
        return 0.0f;
    }

    private float f(float f8, float f9, float f10, float f11) {
        float interpolation;
        float fC = c(f8 * f9, 0.0f, f10);
        float fE = e(f9 - f11, fC) - e(f11, fC);
        if (fE < 0.0f) {
            interpolation = -this.f9322b.getInterpolation(-fE);
        } else {
            if (fE <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f9322b.getInterpolation(fE);
        }
        return c(interpolation, -1.0f, 1.0f);
    }

    private void g() {
        if (this.f9333m) {
            this.f9335o = false;
        } else {
            this.f9321a.requestStop();
        }
    }

    private void i() {
        int i8;
        if (this.f9324d == null) {
            this.f9324d = new b();
        }
        this.f9335o = true;
        this.f9333m = true;
        if (this.f9332l || (i8 = this.f9328h) <= 0) {
            this.f9324d.run();
        } else {
            AbstractC0985p0.postOnAnimationDelayed(this.f9323c, this.f9324d, i8);
        }
        this.f9332l = true;
    }

    void a() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f9323c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract boolean canTargetScrollHorizontally(int i8);

    public abstract boolean canTargetScrollVertically(int i8);

    boolean h() {
        C0147a c0147a = this.f9321a;
        int verticalDirection = c0147a.getVerticalDirection();
        int horizontalDirection = c0147a.getHorizontalDirection();
        return (verticalDirection != 0 && canTargetScrollVertically(verticalDirection)) || (horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection));
    }

    public boolean isEnabled() {
        return this.f9336p;
    }

    public boolean isExclusive() {
        return this.f9337q;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f9336p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.g()
            goto L58
        L1a:
            r5.f9334n = r2
            r5.f9332l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f9323c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.b(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f9323c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.b(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f9321a
            r7.setTargetVelocity(r0, r6)
            boolean r6 = r5.f9335o
            if (r6 != 0) goto L58
            boolean r6 = r5.h()
            if (r6 == 0) goto L58
            r5.i()
        L58:
            boolean r6 = r5.f9337q
            if (r6 == 0) goto L61
            boolean r6 = r5.f9335o
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void scrollTargetBy(int i8, int i9);

    public a setActivationDelay(int i8) {
        this.f9328h = i8;
        return this;
    }

    public a setEdgeType(int i8) {
        this.f9327g = i8;
        return this;
    }

    public a setEnabled(boolean z8) {
        if (this.f9336p && !z8) {
            g();
        }
        this.f9336p = z8;
        return this;
    }

    public a setExclusive(boolean z8) {
        this.f9337q = z8;
        return this;
    }

    public a setMaximumEdges(float f8, float f9) {
        float[] fArr = this.f9326f;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a setMaximumVelocity(float f8, float f9) {
        float[] fArr = this.f9331k;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public a setMinimumVelocity(float f8, float f9) {
        float[] fArr = this.f9330j;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public a setRampDownDuration(int i8) {
        this.f9321a.setRampDownDuration(i8);
        return this;
    }

    public a setRampUpDuration(int i8) {
        this.f9321a.setRampUpDuration(i8);
        return this;
    }

    public a setRelativeEdges(float f8, float f9) {
        float[] fArr = this.f9325e;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a setRelativeVelocity(float f8, float f9) {
        float[] fArr = this.f9329i;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }
}
