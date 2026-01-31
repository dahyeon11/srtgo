package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a */
    private final g f10975a;

    /* renamed from: b */
    private final e f10976b;

    /* renamed from: c */
    private final RecyclerView f10977c;

    /* renamed from: d */
    private VelocityTracker f10978d;

    /* renamed from: e */
    private int f10979e;

    /* renamed from: f */
    private float f10980f;

    /* renamed from: g */
    private int f10981g;

    /* renamed from: h */
    private long f10982h;

    c(g gVar, e eVar, RecyclerView recyclerView) {
        this.f10975a = gVar;
        this.f10976b = eVar;
        this.f10977c = recyclerView;
    }

    private void a(long j8, int i8, float f8, float f9) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f10982h, j8, i8, f8, f9, 0);
        this.f10978d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void c() {
        VelocityTracker velocityTracker = this.f10978d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.f10978d = VelocityTracker.obtain();
            this.f10979e = ViewConfiguration.get(this.f10975a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    boolean b() {
        if (this.f10976b.g()) {
            return false;
        }
        this.f10981g = 0;
        this.f10980f = 0;
        this.f10982h = SystemClock.uptimeMillis();
        c();
        this.f10976b.k();
        if (!this.f10976b.i()) {
            this.f10977c.stopScroll();
        }
        a(this.f10982h, 0, 0.0f, 0.0f);
        return true;
    }

    boolean d() {
        if (!this.f10976b.h()) {
            return false;
        }
        this.f10976b.m();
        VelocityTracker velocityTracker = this.f10978d;
        velocityTracker.computeCurrentVelocity(1000, this.f10979e);
        if (this.f10977c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f10975a.h();
        return true;
    }

    boolean e(float f8) {
        if (!this.f10976b.h()) {
            return false;
        }
        float f9 = this.f10980f - f8;
        this.f10980f = f9;
        int iRound = Math.round(f9 - this.f10981g);
        this.f10981g += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z8 = this.f10975a.getOrientation() == 0;
        int i8 = z8 ? iRound : 0;
        int i9 = z8 ? 0 : iRound;
        float f10 = z8 ? this.f10980f : 0.0f;
        float f11 = z8 ? 0.0f : this.f10980f;
        this.f10977c.scrollBy(i8, i9);
        a(jUptimeMillis, 2, f10, f11);
        return true;
    }

    boolean f() {
        return this.f10976b.h();
    }
}
