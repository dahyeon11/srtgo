package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0996v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9270a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0998w f9271b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9272c;

    /* renamed from: d, reason: collision with root package name */
    private final a f9273d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f9274e;

    /* renamed from: f, reason: collision with root package name */
    private float f9275f;

    /* renamed from: g, reason: collision with root package name */
    private int f9276g;

    /* renamed from: h, reason: collision with root package name */
    private int f9277h;

    /* renamed from: i, reason: collision with root package name */
    private int f9278i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f9279j;

    /* renamed from: androidx.core.view.v$a */
    interface a {
        float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8);
    }

    /* renamed from: androidx.core.view.v$b */
    interface b {
        void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i8);
    }

    public C0996v(Context context, InterfaceC0998w interfaceC0998w) {
        this(context, interfaceC0998w, new b() { // from class: androidx.core.view.t
            @Override // androidx.core.view.C0996v.b
            public final void calculateFlingVelocityThresholds(Context context2, int[] iArr, MotionEvent motionEvent, int i8) {
                C0996v.c(context2, iArr, motionEvent, i8);
            }
        }, new a() { // from class: androidx.core.view.u
            @Override // androidx.core.view.C0996v.a
            public final float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8) {
                return C0996v.f(velocityTracker, motionEvent, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC0993t0.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i8, motionEvent.getSource());
        iArr[1] = AbstractC0993t0.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i8, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i8) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f9277h == source && this.f9278i == deviceId && this.f9276g == i8) {
            return false;
        }
        this.f9272c.calculateFlingVelocityThresholds(this.f9270a, this.f9279j, motionEvent, i8);
        this.f9277h = source;
        this.f9278i = deviceId;
        this.f9276g = i8;
        return true;
    }

    private float e(MotionEvent motionEvent, int i8) {
        if (this.f9274e == null) {
            this.f9274e = VelocityTracker.obtain();
        }
        return this.f9273d.getCurrentVelocity(this.f9274e, motionEvent, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8) {
        AbstractC0976m0.addMovement(velocityTracker, motionEvent);
        AbstractC0976m0.computeCurrentVelocity(velocityTracker, 1000);
        return AbstractC0976m0.getAxisVelocity(velocityTracker, i8);
    }

    public void onMotionEvent(MotionEvent motionEvent, int i8) {
        boolean zD = d(motionEvent, i8);
        if (this.f9279j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f9274e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9274e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i8) * this.f9271b.getScaledScrollFactor();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f9275f) && fSignum != 0.0f)) {
            this.f9271b.stopDifferentialMotionFling();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f9279j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f9275f = this.f9271b.startDifferentialMotionFling(fMax) ? fMax : 0.0f;
    }

    C0996v(Context context, InterfaceC0998w interfaceC0998w, b bVar, a aVar) {
        this.f9276g = -1;
        this.f9277h = -1;
        this.f9278i = -1;
        this.f9279j = new int[]{Integer.MAX_VALUE, 0};
        this.f9270a = context;
        this.f9271b = interfaceC0998w;
        this.f9272c = bVar;
        this.f9273d = aVar;
    }
}
