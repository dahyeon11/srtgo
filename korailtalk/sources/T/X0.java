package t;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0889l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p.InterfaceC6046a;
import s.C6203b;
import y.l;
import z.AbstractC6586j;
import z.C0;
import z.C6562K;
import z.C6588k;
import z.D0;
import z.InterfaceC6600q;
import z.S;

/* loaded from: classes.dex */
final class X0 implements A0 {

    /* renamed from: r */
    private static List f36590r = new ArrayList();

    /* renamed from: s */
    private static int f36591s = 0;

    /* renamed from: a */
    private final z.D0 f36592a;

    /* renamed from: b */
    private final S f36593b;

    /* renamed from: c */
    final Executor f36594c;

    /* renamed from: d */
    private final ScheduledExecutorService f36595d;

    /* renamed from: g */
    private z.C0 f36598g;

    /* renamed from: h */
    private C6285k0 f36599h;

    /* renamed from: i */
    private z.C0 f36600i;

    /* renamed from: n */
    private final e f36605n;

    /* renamed from: q */
    private int f36608q;

    /* renamed from: f */
    private List f36597f = new ArrayList();

    /* renamed from: j */
    private boolean f36601j = false;

    /* renamed from: l */
    private volatile C6562K f36603l = null;

    /* renamed from: m */
    volatile boolean f36604m = false;

    /* renamed from: o */
    private y.l f36606o = new l.a().build();

    /* renamed from: p */
    private y.l f36607p = new l.a().build();

    /* renamed from: e */
    private final C6314z0 f36596e = new C6314z0();

    /* renamed from: k */
    private d f36602k = d.UNINITIALIZED;

    class a implements B.c {
        a() {
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            androidx.camera.core.B0.e("ProcessingCaptureSession", "open session failed ", th);
            X0.this.close();
        }

        @Override // B.c
        public void onSuccess(Void r12) {
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f36612a;

        static {
            int[] iArr = new int[d.values().length];
            f36612a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36612a[d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36612a[d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36612a[d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36612a[d.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    X0(z.D0 d02, S s8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f36608q = 0;
        this.f36592a = d02;
        this.f36593b = s8;
        this.f36594c = executor;
        this.f36595d = scheduledExecutorService;
        this.f36605n = new e(executor);
        int i8 = f36591s;
        f36591s = i8 + 1;
        this.f36608q = i8;
        androidx.camera.core.B0.d("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f36608q + ")");
    }

    private static void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC6586j> it2 = ((C6562K) it.next()).getCameraCaptureCallbacks().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureCancelled();
            }
        }
    }

    private static List f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z.S s8 = (z.S) it.next();
            Z.h.checkArgument(s8 instanceof z.E0, "Surface must be SessionProcessorSurface");
            arrayList.add((z.E0) s8);
        }
        return arrayList;
    }

    private boolean g(List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C6562K) it.next()).getTemplateType() != 2) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ void h() {
        z.X.decrementAll(this.f36597f);
    }

    public static /* synthetic */ void i(z.S s8) {
        f36590r.remove(s8);
    }

    public /* synthetic */ com.google.common.util.concurrent.C j(z.C0 c02, CameraDevice cameraDevice, o1 o1Var, List list) {
        androidx.camera.core.B0.d("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f36608q + ")");
        if (this.f36602k == d.CLOSED) {
            return B.f.immediateFailedFuture(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        z.w0 w0VarCreate = null;
        if (list.contains(null)) {
            return B.f.immediateFailedFuture(new S.a("Surface closed", c02.getSurfaces().get(list.indexOf(null))));
        }
        try {
            z.X.incrementAll(this.f36597f);
            z.w0 w0VarCreate2 = null;
            z.w0 w0VarCreate3 = null;
            for (int i8 = 0; i8 < c02.getSurfaces().size(); i8++) {
                z.S s8 = c02.getSurfaces().get(i8);
                if (Objects.equals(s8.getContainerClass(), androidx.camera.core.K0.class)) {
                    w0VarCreate = z.w0.create((Surface) s8.getSurface().get(), new Size(s8.getPrescribedSize().getWidth(), s8.getPrescribedSize().getHeight()), s8.getPrescribedStreamFormat());
                } else if (Objects.equals(s8.getContainerClass(), C0889l0.class)) {
                    w0VarCreate2 = z.w0.create((Surface) s8.getSurface().get(), new Size(s8.getPrescribedSize().getWidth(), s8.getPrescribedSize().getHeight()), s8.getPrescribedStreamFormat());
                } else if (Objects.equals(s8.getContainerClass(), androidx.camera.core.P.class)) {
                    w0VarCreate3 = z.w0.create((Surface) s8.getSurface().get(), new Size(s8.getPrescribedSize().getWidth(), s8.getPrescribedSize().getHeight()), s8.getPrescribedStreamFormat());
                }
            }
            this.f36602k = d.SESSION_INITIALIZED;
            androidx.camera.core.B0.w("ProcessingCaptureSession", "== initSession (id=" + this.f36608q + ")");
            z.C0 c0InitSession = this.f36592a.initSession(this.f36593b, w0VarCreate, w0VarCreate2, w0VarCreate3);
            this.f36600i = c0InitSession;
            c0InitSession.getSurfaces().get(0).getTerminationFuture().addListener(new Runnable() { // from class: t.V0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36555a.h();
                }
            }, A.a.directExecutor());
            for (final z.S s9 : this.f36600i.getSurfaces()) {
                f36590r.add(s9);
                s9.getTerminationFuture().addListener(new Runnable() { // from class: t.W0
                    @Override // java.lang.Runnable
                    public final void run() {
                        X0.i(s9);
                    }
                }, this.f36594c);
            }
            C0.f fVar = new C0.f();
            fVar.add(c02);
            fVar.clearSurfaces();
            fVar.add(this.f36600i);
            Z.h.checkArgument(fVar.isValid(), "Cannot transform the SessionConfig");
            com.google.common.util.concurrent.C cOpen = this.f36596e.open(fVar.build(), (CameraDevice) Z.h.checkNotNull(cameraDevice), o1Var);
            B.f.addCallback(cOpen, new a(), this.f36594c);
            return cOpen;
        } catch (S.a e8) {
            return B.f.immediateFailedFuture(e8);
        }
    }

    public /* synthetic */ Void k(Void r12) {
        l(this.f36596e);
        return null;
    }

    private void m(y.l lVar, y.l lVar2) {
        C6203b.a aVar = new C6203b.a();
        aVar.insertAllOptions(lVar);
        aVar.insertAllOptions(lVar2);
        this.f36592a.setParameters(aVar.build());
    }

    @Override // t.A0
    public void cancelIssuedCaptureRequests() {
        androidx.camera.core.B0.d("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f36608q + ")");
        if (this.f36603l != null) {
            Iterator<AbstractC6586j> it = this.f36603l.getCameraCaptureCallbacks().iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled();
            }
            this.f36603l = null;
        }
    }

    @Override // t.A0
    public void close() {
        androidx.camera.core.B0.d("ProcessingCaptureSession", "close (id=" + this.f36608q + ") state=" + this.f36602k);
        int i8 = c.f36612a[this.f36602k.ordinal()];
        if (i8 == 2) {
            this.f36592a.deInitSession();
        } else {
            if (i8 == 3) {
                this.f36592a.onCaptureSessionEnd();
                C6285k0 c6285k0 = this.f36599h;
                if (c6285k0 != null) {
                    c6285k0.close();
                }
                this.f36602k = d.ON_CAPTURE_SESSION_ENDED;
            } else if (i8 != 4) {
                if (i8 == 5) {
                    return;
                }
            }
            this.f36592a.deInitSession();
        }
        this.f36602k = d.CLOSED;
        this.f36596e.close();
    }

    @Override // t.A0
    public List<C6562K> getCaptureConfigs() {
        return this.f36603l != null ? Arrays.asList(this.f36603l) : Collections.emptyList();
    }

    @Override // t.A0
    public z.C0 getSessionConfig() {
        return this.f36598g;
    }

    @Override // t.A0
    public void issueCaptureRequests(List<C6562K> list) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1 || !g(list)) {
            e(list);
            return;
        }
        if (this.f36603l != null || this.f36604m) {
            e(list);
            return;
        }
        C6562K c6562k = list.get(0);
        androidx.camera.core.B0.d("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f36608q + ") + state =" + this.f36602k);
        int i8 = c.f36612a[this.f36602k.ordinal()];
        if (i8 == 1 || i8 == 2) {
            this.f36603l = c6562k;
            return;
        }
        if (i8 == 3) {
            this.f36604m = true;
            y.l lVarBuild = l.a.from(c6562k.getImplementationOptions()).build();
            this.f36607p = lVarBuild;
            m(this.f36606o, lVarBuild);
            this.f36592a.startCapture(new b(c6562k));
            return;
        }
        if (i8 == 4 || i8 == 5) {
            androidx.camera.core.B0.d("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f36602k);
            e(list);
        }
    }

    void l(C6314z0 c6314z0) {
        Z.h.checkArgument(this.f36602k == d.SESSION_INITIALIZED, "Invalid state state:" + this.f36602k);
        C6285k0 c6285k0 = new C6285k0(c6314z0, f(this.f36600i.getSurfaces()));
        this.f36599h = c6285k0;
        this.f36592a.onCaptureSessionStart(c6285k0);
        this.f36602k = d.ON_CAPTURE_SESSION_STARTED;
        z.C0 c02 = this.f36598g;
        if (c02 != null) {
            setSessionConfig(c02);
        }
        if (this.f36603l != null) {
            List<C6562K> listAsList = Arrays.asList(this.f36603l);
            this.f36603l = null;
            issueCaptureRequests(listAsList);
        }
    }

    @Override // t.A0
    public com.google.common.util.concurrent.C open(final z.C0 c02, final CameraDevice cameraDevice, final o1 o1Var) {
        Z.h.checkArgument(this.f36602k == d.UNINITIALIZED, "Invalid state state:" + this.f36602k);
        Z.h.checkArgument(c02.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        androidx.camera.core.B0.d("ProcessingCaptureSession", "open (id=" + this.f36608q + ")");
        List<z.S> surfaces = c02.getSurfaces();
        this.f36597f = surfaces;
        return B.d.from(z.X.surfaceListWithTimeout(surfaces, false, 5000L, this.f36594c, this.f36595d)).transformAsync(new B.a() { // from class: t.T0
            @Override // B.a
            public final com.google.common.util.concurrent.C apply(Object obj) {
                return this.f36548a.j(c02, cameraDevice, o1Var, (List) obj);
            }
        }, this.f36594c).transform(new InterfaceC6046a() { // from class: t.U0
            @Override // p.InterfaceC6046a
            public final Object apply(Object obj) {
                return this.f36553a.k((Void) obj);
            }
        }, this.f36594c);
    }

    @Override // t.A0
    public com.google.common.util.concurrent.C release(boolean z8) {
        Z.h.checkState(this.f36602k == d.CLOSED, "release() can only be called in CLOSED state");
        androidx.camera.core.B0.d("ProcessingCaptureSession", "release (id=" + this.f36608q + ")");
        return this.f36596e.release(z8);
    }

    @Override // t.A0
    public void setSessionConfig(z.C0 c02) {
        androidx.camera.core.B0.d("ProcessingCaptureSession", "setSessionConfig (id=" + this.f36608q + ")");
        this.f36598g = c02;
        if (c02 == null) {
            return;
        }
        this.f36605n.setCameraCaptureCallbacks(c02.getRepeatingCameraCaptureCallbacks());
        if (this.f36602k == d.ON_CAPTURE_SESSION_STARTED) {
            y.l lVarBuild = l.a.from(c02.getImplementationOptions()).build();
            this.f36606o = lVarBuild;
            m(lVarBuild, this.f36607p);
            if (this.f36601j) {
                return;
            }
            this.f36592a.startRepeating(this.f36605n);
            this.f36601j = true;
        }
    }

    class b implements D0.a {

        /* renamed from: a */
        final /* synthetic */ C6562K f36610a;

        b(C6562K c6562k) {
            this.f36610a = c6562k;
        }

        public /* synthetic */ void c(C6562K c6562k) {
            Iterator<AbstractC6586j> it = c6562k.getCameraCaptureCallbacks().iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(new C6588k(C6588k.a.ERROR));
            }
            X0.this.f36604m = false;
        }

        public /* synthetic */ void d(C6562K c6562k) {
            Iterator<AbstractC6586j> it = c6562k.getCameraCaptureCallbacks().iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(new InterfaceC6600q.a());
            }
            X0.this.f36604m = false;
        }

        @Override // z.D0.a
        public void onCaptureFailed(int i8) {
            Executor executor = X0.this.f36594c;
            final C6562K c6562k = this.f36610a;
            executor.execute(new Runnable() { // from class: t.Z0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36621a.c(c6562k);
                }
            });
        }

        @Override // z.D0.a
        public void onCaptureSequenceCompleted(int i8) {
            Executor executor = X0.this.f36594c;
            final C6562K c6562k = this.f36610a;
            executor.execute(new Runnable() { // from class: t.Y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36618a.d(c6562k);
                }
            });
        }

        @Override // z.D0.a
        public void onCaptureProcessStarted(int i8) {
        }

        @Override // z.D0.a
        public void onCaptureSequenceAborted(int i8) {
        }

        @Override // z.D0.a
        public void onCaptureStarted(int i8, long j8) {
        }
    }

    static class e implements D0.a {

        /* renamed from: a */
        private List f36614a = Collections.emptyList();

        /* renamed from: b */
        private final Executor f36615b;

        e(Executor executor) {
            this.f36615b = executor;
        }

        public /* synthetic */ void c() {
            Iterator it = this.f36614a.iterator();
            while (it.hasNext()) {
                ((AbstractC6586j) it.next()).onCaptureFailed(new C6588k(C6588k.a.ERROR));
            }
        }

        public /* synthetic */ void d() {
            Iterator it = this.f36614a.iterator();
            while (it.hasNext()) {
                ((AbstractC6586j) it.next()).onCaptureCompleted(InterfaceC6600q.a.create());
            }
        }

        @Override // z.D0.a
        public void onCaptureFailed(int i8) {
            this.f36615b.execute(new Runnable() { // from class: t.a1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36626a.c();
                }
            });
        }

        @Override // z.D0.a
        public void onCaptureSequenceCompleted(int i8) {
            this.f36615b.execute(new Runnable() { // from class: t.b1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36628a.d();
                }
            });
        }

        public void setCameraCaptureCallbacks(List<AbstractC6586j> list) {
            this.f36614a = list;
        }

        @Override // z.D0.a
        public void onCaptureProcessStarted(int i8) {
        }

        @Override // z.D0.a
        public void onCaptureSequenceAborted(int i8) {
        }

        @Override // z.D0.a
        public void onCaptureStarted(int i8, long j8) {
        }
    }
}
