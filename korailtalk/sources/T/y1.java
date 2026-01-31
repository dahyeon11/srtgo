package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import s.C6203b;
import t.C6307w;
import u.C6372C;

/* loaded from: classes.dex */
final class y1 {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    private final C6307w f36832a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f36833b;

    /* renamed from: c, reason: collision with root package name */
    private final z1 f36834c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.t f36835d;

    /* renamed from: e, reason: collision with root package name */
    final b f36836e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36837f = false;

    /* renamed from: g, reason: collision with root package name */
    private C6307w.c f36838g = new a();

    class a implements C6307w.c {
        a() {
        }

        @Override // t.C6307w.c
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            y1.this.f36836e.onCaptureResult(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void addRequestOption(C6203b.a aVar);

        Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(TotalCaptureResult totalCaptureResult);

        void resetZoom();

        void setZoomRatio(float f8, c.a aVar);
    }

    y1(C6307w c6307w, C6372C c6372c, Executor executor) {
        this.f36832a = c6307w;
        this.f36833b = executor;
        b bVarF = f(c6372c);
        this.f36836e = bVarF;
        z1 z1Var = new z1(bVarF.getMaxZoom(), bVarF.getMinZoom());
        this.f36834c = z1Var;
        z1Var.d(1.0f);
        this.f36835d = new androidx.lifecycle.t(C.f.create(z1Var));
        c6307w.k(this.f36838g);
    }

    private static b f(C6372C c6372c) {
        return j(c6372c) ? new C6268c(c6372c) : new D0(c6372c);
    }

    static androidx.camera.core.u1 h(C6372C c6372c) {
        b bVarF = f(c6372c);
        z1 z1Var = new z1(bVarF.getMaxZoom(), bVarF.getMinZoom());
        z1Var.d(1.0f);
        return C.f.create(z1Var);
    }

    private static boolean j(C6372C c6372c) {
        return Build.VERSION.SDK_INT >= 30 && c6372c.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object l(final androidx.camera.core.u1 u1Var, final c.a aVar) {
        this.f36833b.execute(new Runnable() { // from class: t.x1
            @Override // java.lang.Runnable
            public final void run() {
                this.f36821a.k(aVar, u1Var);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(final androidx.camera.core.u1 u1Var, final c.a aVar) {
        this.f36833b.execute(new Runnable() { // from class: t.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.f36815a.m(aVar, u1Var);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m(c.a aVar, androidx.camera.core.u1 u1Var) {
        androidx.camera.core.u1 u1VarCreate;
        if (this.f36837f) {
            s(u1Var);
            this.f36836e.setZoomRatio(u1Var.getZoomRatio(), aVar);
            this.f36832a.Q();
        } else {
            synchronized (this.f36834c) {
                this.f36834c.d(1.0f);
                u1VarCreate = C.f.create(this.f36834c);
            }
            s(u1VarCreate);
            aVar.setException(new InterfaceC0892n.a("Camera is not active."));
        }
    }

    private void s(androidx.camera.core.u1 u1Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f36835d.setValue(u1Var);
        } else {
            this.f36835d.postValue(u1Var);
        }
    }

    void e(C6203b.a aVar) {
        this.f36836e.addRequestOption(aVar);
    }

    Rect g() {
        return this.f36836e.getCropSensorRegion();
    }

    LiveData i() {
        return this.f36835d;
    }

    void o(boolean z8) {
        androidx.camera.core.u1 u1VarCreate;
        if (this.f36837f == z8) {
            return;
        }
        this.f36837f = z8;
        if (z8) {
            return;
        }
        synchronized (this.f36834c) {
            this.f36834c.d(1.0f);
            u1VarCreate = C.f.create(this.f36834c);
        }
        s(u1VarCreate);
        this.f36836e.resetZoom();
        this.f36832a.Q();
    }

    com.google.common.util.concurrent.C p(float f8) {
        final androidx.camera.core.u1 u1VarCreate;
        synchronized (this.f36834c) {
            try {
                this.f36834c.c(f8);
                u1VarCreate = C.f.create(this.f36834c);
            } catch (IllegalArgumentException e8) {
                return B.f.immediateFailedFuture(e8);
            }
        }
        s(u1VarCreate);
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.v1
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36786a.l(u1VarCreate, aVar);
            }
        });
    }

    com.google.common.util.concurrent.C q(float f8) {
        final androidx.camera.core.u1 u1VarCreate;
        synchronized (this.f36834c) {
            try {
                this.f36834c.d(f8);
                u1VarCreate = C.f.create(this.f36834c);
            } catch (IllegalArgumentException e8) {
                return B.f.immediateFailedFuture(e8);
            }
        }
        s(u1VarCreate);
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.u1
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36783a.n(u1VarCreate, aVar);
            }
        });
    }
}
