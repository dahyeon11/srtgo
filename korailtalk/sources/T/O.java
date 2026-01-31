package t;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC0905u;
import androidx.camera.core.C0907v;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import t.o1;
import u.AbstractC6378a;
import u.C6386i;
import z.AbstractC6604v;
import z.C0;
import z.C6558G;
import z.C6562K;
import z.C6583h0;
import z.C6597o0;
import z.InterfaceC6552A;
import z.InterfaceC6553B;
import z.InterfaceC6601s;
import z.InterfaceC6605w;
import z.S;

/* loaded from: classes.dex */
final class O implements InterfaceC6553B {

    /* renamed from: A, reason: collision with root package name */
    private z.D0 f36448A;

    /* renamed from: B, reason: collision with root package name */
    boolean f36449B;

    /* renamed from: a, reason: collision with root package name */
    private final z.M0 f36450a;

    /* renamed from: b, reason: collision with root package name */
    private final u.P f36451b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36452c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f36453d;

    /* renamed from: e, reason: collision with root package name */
    volatile f f36454e = f.INITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    private final C6597o0 f36455f;

    /* renamed from: g, reason: collision with root package name */
    private final C6298r0 f36456g;

    /* renamed from: h, reason: collision with root package name */
    private final C6307w f36457h;

    /* renamed from: i, reason: collision with root package name */
    private final g f36458i;

    /* renamed from: j, reason: collision with root package name */
    final S f36459j;

    /* renamed from: k, reason: collision with root package name */
    CameraDevice f36460k;

    /* renamed from: l, reason: collision with root package name */
    int f36461l;

    /* renamed from: m, reason: collision with root package name */
    A0 f36462m;

    /* renamed from: n, reason: collision with root package name */
    final AtomicInteger f36463n;

    /* renamed from: o, reason: collision with root package name */
    com.google.common.util.concurrent.C f36464o;

    /* renamed from: p, reason: collision with root package name */
    c.a f36465p;

    /* renamed from: q, reason: collision with root package name */
    final Map f36466q;

    /* renamed from: r, reason: collision with root package name */
    private final d f36467r;

    /* renamed from: s, reason: collision with root package name */
    private final C6558G f36468s;

    /* renamed from: t, reason: collision with root package name */
    final Set f36469t;

    /* renamed from: u, reason: collision with root package name */
    private S0 f36470u;

    /* renamed from: v, reason: collision with root package name */
    private final C0 f36471v;

    /* renamed from: w, reason: collision with root package name */
    private final o1.a f36472w;

    /* renamed from: x, reason: collision with root package name */
    private final Set f36473x;

    /* renamed from: y, reason: collision with root package name */
    private InterfaceC6601s f36474y;

    /* renamed from: z, reason: collision with root package name */
    final Object f36475z;

    class a implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A0 f36476a;

        a(A0 a02) {
            this.f36476a = a02;
        }

        @Override // B.c
        public void onSuccess(Void r22) {
            CameraDevice cameraDevice;
            O.this.f36466q.remove(this.f36476a);
            int i8 = c.f36479a[O.this.f36454e.ordinal()];
            if (i8 != 3) {
                if (i8 != 6) {
                    if (i8 != 7) {
                        return;
                    }
                } else if (O.this.f36461l == 0) {
                    return;
                }
            }
            if (!O.this.E() || (cameraDevice = O.this.f36460k) == null) {
                return;
            }
            AbstractC6378a.close(cameraDevice);
            O.this.f36460k = null;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
        }
    }

    class b implements B.c {
        b() {
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            if (th instanceof S.a) {
                z.C0 c0Y = O.this.y(((S.a) th).getDeferrableSurface());
                if (c0Y != null) {
                    O.this.Y(c0Y);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                O.this.w("Unable to configure camera cancelled");
                return;
            }
            f fVar = O.this.f36454e;
            f fVar2 = f.OPENED;
            if (fVar == fVar2) {
                O.this.f0(fVar2, AbstractC0905u.b.create(4, th));
            }
            if (th instanceof CameraAccessException) {
                O.this.w("Unable to configure camera due to " + th.getMessage());
                return;
            }
            if (th instanceof TimeoutException) {
                androidx.camera.core.B0.e("Camera2CameraImpl", "Unable to configure camera " + O.this.f36459j.getCameraId() + ", timeout!");
            }
        }

        @Override // B.c
        public void onSuccess(Void r12) {
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36479a;

        static {
            int[] iArr = new int[f.values().length];
            f36479a = iArr;
            try {
                iArr[f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36479a[f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36479a[f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36479a[f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36479a[f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36479a[f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36479a[f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36479a[f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    final class d extends CameraManager.AvailabilityCallback implements C6558G.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f36480a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36481b = true;

        d(String str) {
            this.f36480a = str;
        }

        boolean a() {
            return this.f36481b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f36480a.equals(str)) {
                this.f36481b = true;
                if (O.this.f36454e == f.PENDING_OPEN) {
                    O.this.m0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f36480a.equals(str)) {
                this.f36481b = false;
            }
        }

        @Override // z.C6558G.b
        public void onOpenAvailable() {
            if (O.this.f36454e == f.PENDING_OPEN) {
                O.this.m0(false);
            }
        }
    }

    final class e implements InterfaceC6605w.c {
        e() {
        }

        @Override // z.InterfaceC6605w.c
        public void onCameraControlCaptureRequests(List<C6562K> list) {
            O.this.h0((List) Z.h.checkNotNull(list));
        }

        @Override // z.InterfaceC6605w.c
        public void onCameraControlUpdateSessionConfig() {
            O.this.n0();
        }
    }

    enum f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    final class g extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f36485a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f36486b;

        /* renamed from: c, reason: collision with root package name */
        private b f36487c;

        /* renamed from: d, reason: collision with root package name */
        ScheduledFuture f36488d;

        /* renamed from: e, reason: collision with root package name */
        private final a f36489e = new a();

        class a {

            /* renamed from: a, reason: collision with root package name */
            private long f36491a = -1;

            a() {
            }

            boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f36491a == -1) {
                    this.f36491a = jUptimeMillis;
                }
                return jUptimeMillis - this.f36491a;
            }

            int c() {
                if (!g.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                if (jB <= H0.q.MIN_PERIODIC_FLEX_MILLIS) {
                    return Z1.b.CREDENTIAL_PICKER_REQUEST_CODE;
                }
                return 4000;
            }

            int d() {
                return !g.this.f() ? 10000 : 1800000;
            }

            void e() {
                this.f36491a = -1L;
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private Executor f36493a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f36494b = false;

            b(Executor executor) {
                this.f36493a = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void c() {
                if (this.f36494b) {
                    return;
                }
                Z.h.checkState(O.this.f36454e == f.REOPENING);
                if (g.this.f()) {
                    O.this.l0(true);
                } else {
                    O.this.m0(true);
                }
            }

            void b() {
                this.f36494b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f36493a.execute(new Runnable() { // from class: t.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36498a.c();
                    }
                });
            }
        }

        g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f36485a = executor;
            this.f36486b = scheduledExecutorService;
        }

        private void b(CameraDevice cameraDevice, int i8) {
            Z.h.checkState(O.this.f36454e == f.OPENING || O.this.f36454e == f.OPENED || O.this.f36454e == f.REOPENING, "Attempt to handle open error from non open state: " + O.this.f36454e);
            if (i8 == 1 || i8 == 2 || i8 == 4) {
                androidx.camera.core.B0.d("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), O.A(i8)));
                c(i8);
                return;
            }
            androidx.camera.core.B0.e("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + O.A(i8) + " closing camera.");
            O.this.f0(f.CLOSING, AbstractC0905u.b.create(i8 == 3 ? 5 : 6));
            O.this.s(false);
        }

        private void c(int i8) {
            int i9 = 1;
            Z.h.checkState(O.this.f36461l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i8 == 1) {
                i9 = 2;
            } else if (i8 != 2) {
                i9 = 3;
            }
            O.this.f0(f.REOPENING, AbstractC0905u.b.create(i9));
            O.this.s(false);
        }

        boolean a() {
            if (this.f36488d == null) {
                return false;
            }
            O.this.w("Cancelling scheduled re-open: " + this.f36487c);
            this.f36487c.b();
            this.f36487c = null;
            this.f36488d.cancel(false);
            this.f36488d = null;
            return true;
        }

        void d() {
            this.f36489e.e();
        }

        void e() {
            Z.h.checkState(this.f36487c == null);
            Z.h.checkState(this.f36488d == null);
            if (!this.f36489e.a()) {
                androidx.camera.core.B0.e("Camera2CameraImpl", "Camera reopening attempted for " + this.f36489e.d() + "ms without success.");
                O.this.g0(f.PENDING_OPEN, null, false);
                return;
            }
            this.f36487c = new b(this.f36485a);
            O.this.w("Attempting camera re-open in " + this.f36489e.c() + "ms: " + this.f36487c + " activeResuming = " + O.this.f36449B);
            this.f36488d = this.f36486b.schedule(this.f36487c, (long) this.f36489e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            int i8;
            O o8 = O.this;
            return (!o8.f36449B || (i8 = o8.f36461l) == 4 || i8 == 2) ? false : true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            O.this.w("CameraDevice.onClosed()");
            Z.h.checkState(O.this.f36460k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i8 = c.f36479a[O.this.f36454e.ordinal()];
            if (i8 != 3) {
                if (i8 == 6) {
                    O o8 = O.this;
                    if (o8.f36461l == 0) {
                        o8.m0(false);
                        return;
                    }
                    o8.w("Camera closed due to error: " + O.A(O.this.f36461l));
                    e();
                    return;
                }
                if (i8 != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + O.this.f36454e);
                }
            }
            Z.h.checkState(O.this.E());
            O.this.z();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            O.this.w("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i8) {
            O o8 = O.this;
            o8.f36460k = cameraDevice;
            o8.f36461l = i8;
            int i9 = c.f36479a[o8.f36454e.ordinal()];
            if (i9 != 3) {
                if (i9 == 4 || i9 == 5 || i9 == 6) {
                    androidx.camera.core.B0.d("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), O.A(i8), O.this.f36454e.name()));
                    b(cameraDevice, i8);
                    return;
                } else if (i9 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + O.this.f36454e);
                }
            }
            androidx.camera.core.B0.e("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), O.A(i8), O.this.f36454e.name()));
            O.this.s(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            O.this.w("CameraDevice.onOpened()");
            O o8 = O.this;
            o8.f36460k = cameraDevice;
            o8.f36461l = 0;
            d();
            int i8 = c.f36479a[O.this.f36454e.ordinal()];
            if (i8 != 3) {
                if (i8 == 5 || i8 == 6) {
                    O.this.e0(f.OPENED);
                    O.this.W();
                    return;
                } else if (i8 != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + O.this.f36454e);
                }
            }
            Z.h.checkState(O.this.E());
            O.this.f36460k.close();
            O.this.f36460k = null;
        }
    }

    static abstract class h {
        h() {
        }

        static h a(String str, Class cls, z.C0 c02, Size size) {
            return new C6270d(str, cls, c02, size);
        }

        static h b(androidx.camera.core.h1 h1Var) {
            return a(O.C(h1Var), h1Var.getClass(), h1Var.getSessionConfig(), h1Var.getAttachedSurfaceResolution());
        }

        abstract z.C0 c();

        abstract Size d();

        abstract String e();

        abstract Class f();
    }

    O(u.P p8, String str, S s8, C6558G c6558g, Executor executor, Handler handler) throws C0907v {
        C6597o0 c6597o0 = new C6597o0();
        this.f36455f = c6597o0;
        this.f36461l = 0;
        this.f36463n = new AtomicInteger(0);
        this.f36466q = new LinkedHashMap();
        this.f36469t = new HashSet();
        this.f36473x = new HashSet();
        this.f36475z = new Object();
        this.f36449B = false;
        this.f36451b = p8;
        this.f36468s = c6558g;
        ScheduledExecutorService scheduledExecutorServiceNewHandlerExecutor = A.a.newHandlerExecutor(handler);
        this.f36453d = scheduledExecutorServiceNewHandlerExecutor;
        Executor executorNewSequentialExecutor = A.a.newSequentialExecutor(executor);
        this.f36452c = executorNewSequentialExecutor;
        this.f36458i = new g(executorNewSequentialExecutor, scheduledExecutorServiceNewHandlerExecutor);
        this.f36450a = new z.M0(str);
        c6597o0.postValue(InterfaceC6553B.a.CLOSED);
        C6298r0 c6298r0 = new C6298r0(c6558g);
        this.f36456g = c6298r0;
        C0 c02 = new C0(executorNewSequentialExecutor);
        this.f36471v = c02;
        this.f36462m = S();
        try {
            C6307w c6307w = new C6307w(p8.getCameraCharacteristicsCompat(str), scheduledExecutorServiceNewHandlerExecutor, executorNewSequentialExecutor, new e(), s8.getCameraQuirks());
            this.f36457h = c6307w;
            this.f36459j = s8;
            s8.e(c6307w);
            s8.h(c6298r0.getStateLiveData());
            this.f36472w = new o1.a(executorNewSequentialExecutor, scheduledExecutorServiceNewHandlerExecutor, handler, c02, s8.d());
            d dVar = new d(str);
            this.f36467r = dVar;
            c6558g.registerCamera(this, executorNewSequentialExecutor, dVar);
            p8.registerAvailabilityCallback(executorNewSequentialExecutor, dVar);
        } catch (C6386i e8) {
            throw AbstractC6300s0.createFrom(e8);
        }
    }

    static String A(int i8) {
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    private com.google.common.util.concurrent.C B() {
        if (this.f36464o == null) {
            if (this.f36454e != f.RELEASED) {
                this.f36464o = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.E
                    @Override // androidx.concurrent.futures.c.InterfaceC0123c
                    public final Object attachCompleter(c.a aVar) {
                        return this.f36397a.J(aVar);
                    }
                });
            } else {
                this.f36464o = B.f.immediateFuture(null);
            }
        }
        return this.f36464o;
    }

    static String C(androidx.camera.core.h1 h1Var) {
        return h1Var.getName() + h1Var.hashCode();
    }

    private boolean D() {
        return ((S) getCameraInfoInternal()).d() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(List list) {
        try {
            j0(list);
        } finally {
            this.f36457h.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object J(c.a aVar) {
        Z.h.checkState(this.f36465p == null, "Camera can only be released once, so release completer should be null on creation.");
        this.f36465p = aVar;
        return "Release[camera=" + this + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(String str, z.C0 c02) {
        w("Use case " + str + " ACTIVE");
        this.f36450a.setUseCaseActive(str, c02);
        this.f36450a.updateUseCase(str, c02);
        n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(String str) {
        w("Use case " + str + " INACTIVE");
        this.f36450a.setUseCaseInactive(str);
        n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(String str, z.C0 c02) {
        w("Use case " + str + " RESET");
        this.f36450a.updateUseCase(str, c02);
        d0(false);
        n0();
        if (this.f36454e == f.OPENED) {
            W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(String str, z.C0 c02) {
        w("Use case " + str + " UPDATED");
        this.f36450a.updateUseCase(str, c02);
        n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(C0.c cVar, z.C0 c02) {
        cVar.onError(c02, C0.e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(c.a aVar) {
        B.f.propagate(Z(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object Q(final c.a aVar) {
        this.f36452c.execute(new Runnable() { // from class: t.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f36391a.P(aVar);
            }
        });
        return "Release[request=" + this.f36463n.getAndIncrement() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(boolean z8) {
        this.f36449B = z8;
        if (z8) {
            if (this.f36454e == f.PENDING_OPEN || this.f36454e == f.REOPENING) {
                l0(false);
            }
        }
    }

    private A0 S() {
        synchronized (this.f36475z) {
            try {
                if (this.f36448A == null) {
                    return new C6314z0();
                }
                return new X0(this.f36448A, this.f36459j, this.f36452c, this.f36453d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void T(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.h1 h1Var = (androidx.camera.core.h1) it.next();
            String strC = C(h1Var);
            if (!this.f36473x.contains(strC)) {
                this.f36473x.add(strC);
                h1Var.onStateAttached();
            }
        }
    }

    private void U(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.h1 h1Var = (androidx.camera.core.h1) it.next();
            String strC = C(h1Var);
            if (this.f36473x.contains(strC)) {
                h1Var.onStateDetached();
                this.f36473x.remove(strC);
            }
        }
    }

    private void V(boolean z8) {
        if (!z8) {
            this.f36458i.d();
        }
        this.f36458i.a();
        w("Opening camera.");
        e0(f.OPENING);
        try {
            this.f36451b.openCamera(this.f36459j.getCameraId(), this.f36452c, v());
        } catch (SecurityException e8) {
            w("Unable to open camera due to " + e8.getMessage());
            e0(f.REOPENING);
            this.f36458i.e();
        } catch (C6386i e9) {
            w("Unable to open camera due to " + e9.getMessage());
            if (e9.getReason() != 10001) {
                return;
            }
            f0(f.INITIALIZED, AbstractC0905u.b.create(7, e9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        int i8 = c.f36479a[this.f36454e.ordinal()];
        if (i8 == 1 || i8 == 2) {
            l0(false);
            return;
        }
        if (i8 != 3) {
            w("open() ignored due to being in state: " + this.f36454e);
            return;
        }
        e0(f.REOPENING);
        if (E() || this.f36461l != 0) {
            return;
        }
        Z.h.checkState(this.f36460k != null, "Camera Device should be open if session close is not complete");
        e0(f.OPENED);
        W();
    }

    private com.google.common.util.concurrent.C Z() {
        com.google.common.util.concurrent.C cB = B();
        switch (c.f36479a[this.f36454e.ordinal()]) {
            case 1:
            case 2:
                Z.h.checkState(this.f36460k == null);
                e0(f.RELEASING);
                Z.h.checkState(E());
                z();
                return cB;
            case 3:
            case 5:
            case 6:
            case 7:
                boolean zA = this.f36458i.a();
                e0(f.RELEASING);
                if (zA) {
                    Z.h.checkState(E());
                    z();
                }
                return cB;
            case 4:
                e0(f.RELEASING);
                s(false);
                return cB;
            default:
                w("release() ignored due to being in state: " + this.f36454e);
                return cB;
        }
    }

    private void c0() {
        if (this.f36470u != null) {
            this.f36450a.setUseCaseDetached(this.f36470u.d() + this.f36470u.hashCode());
            this.f36450a.setUseCaseInactive(this.f36470u.d() + this.f36470u.hashCode());
            this.f36470u.b();
            this.f36470u = null;
        }
    }

    private Collection i0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h.b((androidx.camera.core.h1) it.next()));
        }
        return arrayList;
    }

    private void j0(Collection collection) {
        Size sizeD;
        boolean zIsEmpty = this.f36450a.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!this.f36450a.isUseCaseAttached(hVar.e())) {
                this.f36450a.setUseCaseAttached(hVar.e(), hVar.c());
                arrayList.add(hVar.e());
                if (hVar.f() == androidx.camera.core.K0.class && (sizeD = hVar.d()) != null) {
                    rational = new Rational(sizeD.getWidth(), sizeD.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        w("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f36457h.M(true);
            this.f36457h.u();
        }
        q();
        n0();
        d0(false);
        if (this.f36454e == f.OPENED) {
            W();
        } else {
            X();
        }
        if (rational != null) {
            this.f36457h.setPreviewAspectRatio(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void I(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (this.f36450a.isUseCaseAttached(hVar.e())) {
                this.f36450a.removeUseCase(hVar.e());
                arrayList.add(hVar.e());
                if (hVar.f() == androidx.camera.core.K0.class) {
                    z8 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        w("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z8) {
            this.f36457h.setPreviewAspectRatio(null);
        }
        q();
        if (this.f36450a.getAttachedSessionConfigs().isEmpty()) {
            this.f36457h.m();
            d0(false);
            this.f36457h.M(false);
            this.f36462m = S();
            t();
            return;
        }
        n0();
        d0(false);
        if (this.f36454e == f.OPENED) {
            W();
        }
    }

    private void p() {
        if (this.f36470u != null) {
            this.f36450a.setUseCaseAttached(this.f36470u.d() + this.f36470u.hashCode(), this.f36470u.e());
            this.f36450a.setUseCaseActive(this.f36470u.d() + this.f36470u.hashCode(), this.f36470u.e());
        }
    }

    private void q() {
        z.C0 c0Build = this.f36450a.getAttachedBuilder().build();
        C6562K repeatingCaptureConfig = c0Build.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = c0Build.getSurfaces().size();
        if (c0Build.getSurfaces().isEmpty()) {
            return;
        }
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            if (this.f36470u == null) {
                this.f36470u = new S0(this.f36459j.getCameraCharacteristicsCompat());
            }
            p();
        } else {
            if (size2 == 1 && size == 1) {
                c0();
                return;
            }
            if (size >= 2) {
                c0();
                return;
            }
            androidx.camera.core.B0.d("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    private boolean r(C6562K.a aVar) {
        if (!aVar.getSurfaces().isEmpty()) {
            androidx.camera.core.B0.w("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<z.C0> it = this.f36450a.getActiveAndAttachedSessionConfigs().iterator();
        while (it.hasNext()) {
            List<z.S> surfaces = it.next().getRepeatingCaptureConfig().getSurfaces();
            if (!surfaces.isEmpty()) {
                Iterator<z.S> it2 = surfaces.iterator();
                while (it2.hasNext()) {
                    aVar.addSurface(it2.next());
                }
            }
        }
        if (!aVar.getSurfaces().isEmpty()) {
            return true;
        }
        androidx.camera.core.B0.w("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        w("Closing camera.");
        int i8 = c.f36479a[this.f36454e.ordinal()];
        if (i8 == 2) {
            Z.h.checkState(this.f36460k == null);
            e0(f.INITIALIZED);
            return;
        }
        if (i8 == 4) {
            e0(f.CLOSING);
            s(false);
            return;
        }
        if (i8 != 5 && i8 != 6) {
            w("close() ignored due to being in state: " + this.f36454e);
            return;
        }
        boolean zA = this.f36458i.a();
        e0(f.CLOSING);
        if (zA) {
            Z.h.checkState(E());
            z();
        }
    }

    private void u(boolean z8) {
        final C6314z0 c6314z0 = new C6314z0();
        this.f36469t.add(c6314z0);
        d0(z8);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: t.H
            @Override // java.lang.Runnable
            public final void run() {
                O.G(surface, surfaceTexture);
            }
        };
        C0.b bVar = new C0.b();
        final C6583h0 c6583h0 = new C6583h0(surface);
        bVar.addNonRepeatingSurface(c6583h0);
        bVar.setTemplateType(1);
        w("Start configAndClose.");
        c6314z0.open(bVar.build(), (CameraDevice) Z.h.checkNotNull(this.f36460k), this.f36472w.a()).addListener(new Runnable() { // from class: t.I
            @Override // java.lang.Runnable
            public final void run() {
                this.f36417a.H(c6314z0, c6583h0, runnable);
            }
        }, this.f36452c);
    }

    private CameraDevice.StateCallback v() {
        ArrayList arrayList = new ArrayList(this.f36450a.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.f36471v.c());
        arrayList.add(this.f36458i);
        return AbstractC6295p0.createComboCallback(arrayList);
    }

    private void x(String str, Throwable th) {
        androidx.camera.core.B0.d("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    boolean E() {
        return this.f36466q.isEmpty() && this.f36469t.isEmpty();
    }

    void W() {
        Z.h.checkState(this.f36454e == f.OPENED);
        C0.f attachedBuilder = this.f36450a.getAttachedBuilder();
        if (attachedBuilder.isValid()) {
            B.f.addCallback(this.f36462m.open(attachedBuilder.build(), (CameraDevice) Z.h.checkNotNull(this.f36460k), this.f36472w.a()), new b(), this.f36452c);
        } else {
            w("Unable to create capture session due to conflicting configurations");
        }
    }

    void Y(final z.C0 c02) {
        ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = A.a.mainThreadExecutor();
        List<C0.c> errorListeners = c02.getErrorListeners();
        if (errorListeners.isEmpty()) {
            return;
        }
        final C0.c cVar = errorListeners.get(0);
        x("Posting surface closed", new Throwable());
        scheduledExecutorServiceMainThreadExecutor.execute(new Runnable() { // from class: t.A
            @Override // java.lang.Runnable
            public final void run() {
                O.O(cVar, c02);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void H(C6314z0 c6314z0, z.S s8, Runnable runnable) {
        this.f36469t.remove(c6314z0);
        com.google.common.util.concurrent.C cB0 = b0(c6314z0, false);
        s8.close();
        B.f.successfulAsList(Arrays.asList(cB0, s8.getTerminationFuture())).addListener(runnable, A.a.directExecutor());
    }

    @Override // z.InterfaceC6553B
    public void attachUseCases(Collection<androidx.camera.core.h1> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f36457h.u();
        T(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(i0(arrayList));
        try {
            this.f36452c.execute(new Runnable() { // from class: t.J
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36427a.F(arrayList2);
                }
            });
        } catch (RejectedExecutionException e8) {
            x("Unable to attach use cases.", e8);
            this.f36457h.m();
        }
    }

    com.google.common.util.concurrent.C b0(A0 a02, boolean z8) {
        a02.close();
        com.google.common.util.concurrent.C cRelease = a02.release(z8);
        w("Releasing session in state " + this.f36454e.name());
        this.f36466q.put(a02, cRelease);
        B.f.addCallback(cRelease, new a(a02), A.a.directExecutor());
        return cRelease;
    }

    @Override // z.InterfaceC6553B
    public void close() {
        this.f36452c.execute(new Runnable() { // from class: t.G
            @Override // java.lang.Runnable
            public final void run() {
                this.f36409a.t();
            }
        });
    }

    void d0(boolean z8) {
        Z.h.checkState(this.f36462m != null);
        w("Resetting Capture Session");
        A0 a02 = this.f36462m;
        z.C0 sessionConfig = a02.getSessionConfig();
        List<C6562K> captureConfigs = a02.getCaptureConfigs();
        A0 a0S = S();
        this.f36462m = a0S;
        a0S.setSessionConfig(sessionConfig);
        this.f36462m.issueCaptureRequests(captureConfigs);
        b0(a02, z8);
    }

    @Override // z.InterfaceC6553B
    public void detachUseCases(Collection<androidx.camera.core.h1> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(i0(arrayList));
        U(new ArrayList(arrayList));
        this.f36452c.execute(new Runnable() { // from class: t.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f36379a.I(arrayList2);
            }
        });
    }

    void e0(f fVar) {
        f0(fVar, null);
    }

    void f0(f fVar, AbstractC0905u.b bVar) {
        g0(fVar, bVar, true);
    }

    void g0(f fVar, AbstractC0905u.b bVar, boolean z8) {
        InterfaceC6553B.a aVar;
        w("Transitioning camera internal state: " + this.f36454e + " --> " + fVar);
        this.f36454e = fVar;
        switch (c.f36479a[fVar.ordinal()]) {
            case 1:
                aVar = InterfaceC6553B.a.CLOSED;
                break;
            case 2:
                aVar = InterfaceC6553B.a.PENDING_OPEN;
                break;
            case 3:
                aVar = InterfaceC6553B.a.CLOSING;
                break;
            case 4:
                aVar = InterfaceC6553B.a.OPEN;
                break;
            case 5:
            case 6:
                aVar = InterfaceC6553B.a.OPENING;
                break;
            case 7:
                aVar = InterfaceC6553B.a.RELEASING;
                break;
            case 8:
                aVar = InterfaceC6553B.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f36468s.markCameraState(this, aVar, z8);
        this.f36455f.postValue(aVar);
        this.f36456g.updateState(aVar, bVar);
    }

    public d getCameraAvailability() {
        return this.f36467r;
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.InterfaceC0888l
    public /* bridge */ /* synthetic */ InterfaceC0892n getCameraControl() {
        return super.getCameraControl();
    }

    @Override // z.InterfaceC6553B
    public InterfaceC6605w getCameraControlInternal() {
        return this.f36457h;
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.InterfaceC0888l
    public /* bridge */ /* synthetic */ androidx.camera.core.r getCameraInfo() {
        return super.getCameraInfo();
    }

    @Override // z.InterfaceC6553B
    public InterfaceC6552A getCameraInfoInternal() {
        return this.f36459j;
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.InterfaceC0888l
    public /* bridge */ /* synthetic */ LinkedHashSet getCameraInternals() {
        return super.getCameraInternals();
    }

    @Override // z.InterfaceC6553B
    public z.t0 getCameraState() {
        return this.f36455f;
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.InterfaceC0888l
    public InterfaceC6601s getExtendedConfig() {
        return this.f36474y;
    }

    void h0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6562K c6562k = (C6562K) it.next();
            C6562K.a aVarFrom = C6562K.a.from(c6562k);
            if (!c6562k.getSurfaces().isEmpty() || !c6562k.isUseRepeatingSurface() || r(aVarFrom)) {
                arrayList.add(aVarFrom.build());
            }
        }
        w("Issue capture request");
        this.f36462m.issueCaptureRequests(arrayList);
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.InterfaceC0888l
    public /* bridge */ /* synthetic */ boolean isUseCasesCombinationSupported(androidx.camera.core.h1... h1VarArr) {
        return super.isUseCasesCombinationSupported(h1VarArr);
    }

    void l0(boolean z8) {
        w("Attempting to force open the camera.");
        if (this.f36468s.tryOpenCamera(this)) {
            V(z8);
        } else {
            w("No cameras available. Waiting for available camera before opening camera.");
            e0(f.PENDING_OPEN);
        }
    }

    void m0(boolean z8) {
        w("Attempting to open the camera.");
        if (this.f36467r.a() && this.f36468s.tryOpenCamera(this)) {
            V(z8);
        } else {
            w("No cameras available. Waiting for available camera before opening camera.");
            e0(f.PENDING_OPEN);
        }
    }

    void n0() {
        C0.f activeAndAttachedBuilder = this.f36450a.getActiveAndAttachedBuilder();
        if (!activeAndAttachedBuilder.isValid()) {
            this.f36457h.L();
            this.f36462m.setSessionConfig(this.f36457h.getSessionConfig());
            return;
        }
        this.f36457h.N(activeAndAttachedBuilder.build().getTemplateType());
        activeAndAttachedBuilder.add(this.f36457h.getSessionConfig());
        this.f36462m.setSessionConfig(activeAndAttachedBuilder.build());
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.h1.d
    public void onUseCaseActive(androidx.camera.core.h1 h1Var) {
        Z.h.checkNotNull(h1Var);
        final String strC = C(h1Var);
        final z.C0 sessionConfig = h1Var.getSessionConfig();
        this.f36452c.execute(new Runnable() { // from class: t.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f36441a.K(strC, sessionConfig);
            }
        });
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.h1.d
    public void onUseCaseInactive(androidx.camera.core.h1 h1Var) {
        Z.h.checkNotNull(h1Var);
        final String strC = C(h1Var);
        this.f36452c.execute(new Runnable() { // from class: t.L
            @Override // java.lang.Runnable
            public final void run() {
                this.f36436a.L(strC);
            }
        });
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.h1.d
    public void onUseCaseReset(androidx.camera.core.h1 h1Var) {
        Z.h.checkNotNull(h1Var);
        final String strC = C(h1Var);
        final z.C0 sessionConfig = h1Var.getSessionConfig();
        this.f36452c.execute(new Runnable() { // from class: t.F
            @Override // java.lang.Runnable
            public final void run() {
                this.f36404a.M(strC, sessionConfig);
            }
        });
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.h1.d
    public void onUseCaseUpdated(androidx.camera.core.h1 h1Var) {
        Z.h.checkNotNull(h1Var);
        final String strC = C(h1Var);
        final z.C0 sessionConfig = h1Var.getSessionConfig();
        this.f36452c.execute(new Runnable() { // from class: t.K
            @Override // java.lang.Runnable
            public final void run() {
                this.f36432a.N(strC, sessionConfig);
            }
        });
    }

    @Override // z.InterfaceC6553B
    public void open() {
        this.f36452c.execute(new Runnable() { // from class: t.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f36840a.X();
            }
        });
    }

    @Override // z.InterfaceC6553B
    public com.google.common.util.concurrent.C release() {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.N
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36445a.Q(aVar);
            }
        });
    }

    void s(boolean z8) {
        Z.h.checkState(this.f36454e == f.CLOSING || this.f36454e == f.RELEASING || (this.f36454e == f.REOPENING && this.f36461l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f36454e + " (error: " + A(this.f36461l) + ")");
        if (Build.VERSION.SDK_INT < 29 && D() && this.f36461l == 0) {
            u(z8);
        } else {
            d0(z8);
        }
        this.f36462m.cancelIssuedCaptureRequests();
    }

    @Override // z.InterfaceC6553B
    public void setActiveResumingMode(final boolean z8) {
        this.f36452c.execute(new Runnable() { // from class: t.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f36382a.R(z8);
            }
        });
    }

    @Override // z.InterfaceC6553B, androidx.camera.core.InterfaceC0888l
    public void setExtendedConfig(InterfaceC6601s interfaceC6601s) {
        if (interfaceC6601s == null) {
            interfaceC6601s = AbstractC6604v.emptyConfig();
        }
        z.D0 sessionProcessor = interfaceC6601s.getSessionProcessor(null);
        this.f36474y = interfaceC6601s;
        synchronized (this.f36475z) {
            this.f36448A = sessionProcessor;
        }
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f36459j.getCameraId());
    }

    void w(String str) {
        x(str, null);
    }

    z.C0 y(z.S s8) {
        for (z.C0 c02 : this.f36450a.getAttachedSessionConfigs()) {
            if (c02.getSurfaces().contains(s8)) {
                return c02;
            }
        }
        return null;
    }

    void z() {
        Z.h.checkState(this.f36454e == f.RELEASING || this.f36454e == f.CLOSING);
        Z.h.checkState(this.f36466q.isEmpty());
        this.f36460k = null;
        if (this.f36454e == f.CLOSING) {
            e0(f.INITIALIZED);
            return;
        }
        this.f36451b.unregisterAvailabilityCallback(this.f36467r);
        e0(f.RELEASED);
        c.a aVar = this.f36465p;
        if (aVar != null) {
            aVar.set(null);
            this.f36465p = null;
        }
    }
}
