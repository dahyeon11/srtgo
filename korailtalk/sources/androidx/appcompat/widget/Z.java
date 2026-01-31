package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class Z implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f7000a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7001b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7002c;

    /* renamed from: d, reason: collision with root package name */
    final View f7003d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f7004e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f7005f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7006g;

    /* renamed from: h, reason: collision with root package name */
    private int f7007h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f7008i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = Z.this.f7003d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.b();
        }
    }

    public Z(View view) {
        this.f7003d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7000a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7001b = tapTimeout;
        this.f7002c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f7005f;
        if (runnable != null) {
            this.f7003d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f7004e;
        if (runnable2 != null) {
            this.f7003d.removeCallbacks(runnable2);
        }
    }

    private boolean c(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        X x8;
        View view = this.f7003d;
        m.e popup = getPopup();
        if (popup == null || !popup.isShowing() || (x8 = (X) popup.getListView()) == null || !x8.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        f(view, motionEventObtainNoHistory);
        g(x8, motionEventObtainNoHistory);
        boolean zOnForwardedEvent = x8.onForwardedEvent(motionEventObtainNoHistory, this.f7007h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zOnForwardedEvent && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f7003d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f7007h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f7000a
            boolean r6 = e(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f7007h = r6
            java.lang.Runnable r6 = r5.f7004e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.Z$a r6 = new androidx.appcompat.widget.Z$a
            r6.<init>()
            r5.f7004e = r6
        L52:
            java.lang.Runnable r6 = r5.f7004e
            int r1 = r5.f7001b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f7005f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.Z$b r6 = new androidx.appcompat.widget.Z$b
            r6.<init>()
            r5.f7005f = r6
        L65:
            java.lang.Runnable r6 = r5.f7005f
            int r1 = r5.f7002c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Z.d(android.view.MotionEvent):boolean");
    }

    private static boolean e(View view, float f8, float f9, float f10) {
        float f11 = -f10;
        return f8 >= f11 && f9 >= f11 && f8 < ((float) (view.getRight() - view.getLeft())) + f10 && f9 < ((float) (view.getBottom() - view.getTop())) + f10;
    }

    private boolean f(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f7008i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean g(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f7008i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    void b() {
        a();
        View view = this.f7003d;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f7006g = true;
        }
    }

    public abstract m.e getPopup();

    protected boolean onForwardingStarted() {
        m.e popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    protected boolean onForwardingStopped() {
        m.e popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z8;
        boolean z9 = this.f7006g;
        if (z9) {
            z8 = c(motionEvent) || !onForwardingStopped();
        } else {
            z8 = d(motionEvent) && onForwardingStarted();
            if (z8) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f7003d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f7006g = z8;
        return z8 || z9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f7006g = false;
        this.f7007h = -1;
        Runnable runnable = this.f7004e;
        if (runnable != null) {
            this.f7003d.removeCallbacks(runnable);
        }
    }
}
