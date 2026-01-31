package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.d1;
import t.o1;
import u.C6373D;
import u.C6387j;
import z.S;

/* loaded from: classes.dex */
class j1 extends d1.a implements d1, o1.b {

    /* renamed from: b */
    final C0 f36695b;

    /* renamed from: c */
    final Handler f36696c;

    /* renamed from: d */
    final Executor f36697d;

    /* renamed from: e */
    private final ScheduledExecutorService f36698e;

    /* renamed from: f */
    d1.a f36699f;

    /* renamed from: g */
    C6387j f36700g;

    /* renamed from: h */
    com.google.common.util.concurrent.C f36701h;

    /* renamed from: i */
    c.a f36702i;

    /* renamed from: j */
    private com.google.common.util.concurrent.C f36703j;

    /* renamed from: a */
    final Object f36694a = new Object();

    /* renamed from: k */
    private List f36704k = null;

    /* renamed from: l */
    private boolean f36705l = false;

    /* renamed from: m */
    private boolean f36706m = false;

    /* renamed from: n */
    private boolean f36707n = false;

    class a implements B.c {
        a() {
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            j1.this.finishClose();
            j1 j1Var = j1.this;
            j1Var.f36695b.j(j1Var);
        }

        @Override // B.c
        public void onSuccess(Void r12) {
        }
    }

    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            j1.this.f(cameraCaptureSession);
            j1 j1Var = j1.this;
            j1Var.onActive(j1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            j1.this.f(cameraCaptureSession);
            j1 j1Var = j1.this;
            j1Var.onCaptureQueueEmpty(j1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            j1.this.f(cameraCaptureSession);
            j1 j1Var = j1.this;
            j1Var.onClosed(j1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                j1.this.f(cameraCaptureSession);
                j1 j1Var = j1.this;
                j1Var.onConfigureFailed(j1Var);
                synchronized (j1.this.f36694a) {
                    Z.h.checkNotNull(j1.this.f36702i, "OpenCaptureSession completer should not null");
                    j1 j1Var2 = j1.this;
                    aVar = j1Var2.f36702i;
                    j1Var2.f36702i = null;
                }
                aVar.setException(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (j1.this.f36694a) {
                    Z.h.checkNotNull(j1.this.f36702i, "OpenCaptureSession completer should not null");
                    j1 j1Var3 = j1.this;
                    c.a aVar2 = j1Var3.f36702i;
                    j1Var3.f36702i = null;
                    aVar2.setException(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                j1.this.f(cameraCaptureSession);
                j1 j1Var = j1.this;
                j1Var.onConfigured(j1Var);
                synchronized (j1.this.f36694a) {
                    Z.h.checkNotNull(j1.this.f36702i, "OpenCaptureSession completer should not null");
                    j1 j1Var2 = j1.this;
                    aVar = j1Var2.f36702i;
                    j1Var2.f36702i = null;
                }
                aVar.set(null);
            } catch (Throwable th) {
                synchronized (j1.this.f36694a) {
                    Z.h.checkNotNull(j1.this.f36702i, "OpenCaptureSession completer should not null");
                    j1 j1Var3 = j1.this;
                    c.a aVar2 = j1Var3.f36702i;
                    j1Var3.f36702i = null;
                    aVar2.set(null);
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            j1.this.f(cameraCaptureSession);
            j1 j1Var = j1.this;
            j1Var.onReady(j1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            j1.this.f(cameraCaptureSession);
            j1 j1Var = j1.this;
            j1Var.onSurfacePrepared(j1Var, surface);
        }
    }

    j1(C0 c02, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f36695b = c02;
        this.f36696c = handler;
        this.f36697d = executor;
        this.f36698e = scheduledExecutorService;
    }

    public /* synthetic */ void i() {
        onSessionFinished(this);
    }

    public /* synthetic */ void j(d1 d1Var) {
        this.f36695b.h(this);
        onSessionFinished(d1Var);
        this.f36699f.onClosed(d1Var);
    }

    public /* synthetic */ void k(d1 d1Var) {
        this.f36699f.onSessionFinished(d1Var);
    }

    public /* synthetic */ Object l(List list, C6373D c6373d, v.g gVar, c.a aVar) {
        String str;
        synchronized (this.f36694a) {
            g(list);
            Z.h.checkState(this.f36702i == null, "The openCaptureSessionCompleter can only set once!");
            this.f36702i = aVar;
            c6373d.createCaptureSession(gVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public /* synthetic */ com.google.common.util.concurrent.C m(List list, List list2) {
        androidx.camera.core.B0.d("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        return list2.contains(null) ? B.f.immediateFailedFuture(new S.a("Surface closed", (z.S) list.get(list2.indexOf(null)))) : list2.isEmpty() ? B.f.immediateFailedFuture(new IllegalArgumentException("Unable to open capture session without surfaces")) : B.f.immediateFuture(list2);
    }

    @Override // t.d1
    public void abortCaptures() throws CameraAccessException {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        this.f36700g.toCameraCaptureSession().abortCaptures();
    }

    @Override // t.d1
    public int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.captureBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // t.d1
    public int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.captureSingleRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // t.d1
    public void close() {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        this.f36695b.i(this);
        this.f36700g.toCameraCaptureSession().close();
        getExecutor().execute(new Runnable() { // from class: t.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f36666a.i();
            }
        });
    }

    @Override // t.o1.b
    public v.g createSessionConfigurationCompat(int i8, List<v.b> list, d1.a aVar) {
        this.f36699f = aVar;
        return new v.g(i8, list, getExecutor(), new b());
    }

    void f(CameraCaptureSession cameraCaptureSession) {
        if (this.f36700g == null) {
            this.f36700g = C6387j.toCameraCaptureSessionCompat(cameraCaptureSession, this.f36696c);
        }
    }

    @Override // t.d1
    public void finishClose() {
        n();
    }

    void g(List list) {
        synchronized (this.f36694a) {
            n();
            z.X.incrementAll(list);
            this.f36704k = list;
        }
    }

    @Override // t.d1
    public CameraDevice getDevice() {
        Z.h.checkNotNull(this.f36700g);
        return this.f36700g.toCameraCaptureSession().getDevice();
    }

    @Override // t.o1.b
    public Executor getExecutor() {
        return this.f36697d;
    }

    @Override // t.d1
    public com.google.common.util.concurrent.C getSynchronizedBlocker(String str) {
        return B.f.immediateFuture(null);
    }

    boolean h() {
        boolean z8;
        synchronized (this.f36694a) {
            z8 = this.f36701h != null;
        }
        return z8;
    }

    void n() {
        synchronized (this.f36694a) {
            try {
                List list = this.f36704k;
                if (list != null) {
                    z.X.decrementAll(list);
                    this.f36704k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.d1.a
    public void onActive(d1 d1Var) {
        this.f36699f.onActive(d1Var);
    }

    @Override // t.d1.a
    public void onCaptureQueueEmpty(d1 d1Var) {
        this.f36699f.onCaptureQueueEmpty(d1Var);
    }

    @Override // t.d1.a
    public void onClosed(final d1 d1Var) {
        com.google.common.util.concurrent.C c9;
        synchronized (this.f36694a) {
            try {
                if (this.f36705l) {
                    c9 = null;
                } else {
                    this.f36705l = true;
                    Z.h.checkNotNull(this.f36701h, "Need to call openCaptureSession before using this API.");
                    c9 = this.f36701h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        finishClose();
        if (c9 != null) {
            c9.addListener(new Runnable() { // from class: t.f1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36671a.j(d1Var);
                }
            }, A.a.directExecutor());
        }
    }

    @Override // t.d1.a
    public void onConfigureFailed(d1 d1Var) {
        finishClose();
        this.f36695b.j(this);
        this.f36699f.onConfigureFailed(d1Var);
    }

    @Override // t.d1.a
    public void onConfigured(d1 d1Var) {
        this.f36695b.k(this);
        this.f36699f.onConfigured(d1Var);
    }

    @Override // t.d1.a
    public void onReady(d1 d1Var) {
        this.f36699f.onReady(d1Var);
    }

    @Override // t.d1.a
    void onSessionFinished(final d1 d1Var) {
        com.google.common.util.concurrent.C c9;
        synchronized (this.f36694a) {
            try {
                if (this.f36707n) {
                    c9 = null;
                } else {
                    this.f36707n = true;
                    Z.h.checkNotNull(this.f36701h, "Need to call openCaptureSession before using this API.");
                    c9 = this.f36701h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c9 != null) {
            c9.addListener(new Runnable() { // from class: t.i1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36688a.k(d1Var);
                }
            }, A.a.directExecutor());
        }
    }

    @Override // t.d1.a
    public void onSurfacePrepared(d1 d1Var, Surface surface) {
        this.f36699f.onSurfacePrepared(d1Var, surface);
    }

    @Override // t.o1.b
    public com.google.common.util.concurrent.C openCaptureSession(CameraDevice cameraDevice, final v.g gVar, final List<z.S> list) {
        synchronized (this.f36694a) {
            try {
                if (this.f36706m) {
                    return B.f.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                this.f36695b.l(this);
                final C6373D cameraDeviceCompat = C6373D.toCameraDeviceCompat(cameraDevice, this.f36696c);
                com.google.common.util.concurrent.C future = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.g1
                    @Override // androidx.concurrent.futures.c.InterfaceC0123c
                    public final Object attachCompleter(c.a aVar) {
                        return this.f36675a.l(list, cameraDeviceCompat, gVar, aVar);
                    }
                });
                this.f36701h = future;
                B.f.addCallback(future, new a(), A.a.directExecutor());
                return B.f.nonCancellationPropagating(this.f36701h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.d1
    public int setRepeatingBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.setRepeatingBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // t.d1
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.setSingleRepeatingRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // t.o1.b
    public com.google.common.util.concurrent.C startWithDeferrableSurface(final List<z.S> list, long j8) {
        synchronized (this.f36694a) {
            try {
                if (this.f36706m) {
                    return B.f.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                B.d dVarTransformAsync = B.d.from(z.X.surfaceListWithTimeout(list, false, j8, getExecutor(), this.f36698e)).transformAsync(new B.a() { // from class: t.h1
                    @Override // B.a
                    public final com.google.common.util.concurrent.C apply(Object obj) {
                        return this.f36681a.m(list, (List) obj);
                    }
                }, getExecutor());
                this.f36703j = dVarTransformAsync;
                return B.f.nonCancellationPropagating(dVarTransformAsync);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.o1.b
    public boolean stop() {
        boolean z8;
        try {
            synchronized (this.f36694a) {
                try {
                    if (!this.f36706m) {
                        com.google.common.util.concurrent.C c9 = this.f36703j;
                        c = c9 != null ? c9 : null;
                        this.f36706m = true;
                    }
                    z8 = !h();
                } finally {
                }
            }
            return z8;
        } finally {
            if (c != null) {
                c.cancel(true);
            }
        }
    }

    @Override // t.d1
    public void stopRepeating() throws CameraAccessException {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        this.f36700g.toCameraCaptureSession().stopRepeating();
    }

    @Override // t.d1
    public C6387j toCameraCaptureSessionCompat() {
        Z.h.checkNotNull(this.f36700g);
        return this.f36700g;
    }

    @Override // t.d1
    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // t.d1
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // t.d1
    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // t.d1
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Z.h.checkNotNull(this.f36700g, "Need to call openCaptureSession before using this API.");
        return this.f36700g.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // t.d1
    public d1.a getStateCallback() {
        return this;
    }
}
