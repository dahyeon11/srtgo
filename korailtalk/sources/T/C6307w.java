package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import s.C6203b;
import u.C6372C;
import x.C6480a;
import y.l;
import z.AbstractC6586j;
import z.C0;
import z.C6562K;
import z.C6588k;
import z.InterfaceC6565N;
import z.InterfaceC6600q;
import z.InterfaceC6605w;

/* renamed from: t.w */
/* loaded from: classes.dex */
public class C6307w implements InterfaceC6605w {

    /* renamed from: a */
    final b f36788a;

    /* renamed from: b */
    final Executor f36789b;

    /* renamed from: c */
    private final Object f36790c = new Object();

    /* renamed from: d */
    private final C6372C f36791d;

    /* renamed from: e */
    private final InterfaceC6605w.c f36792e;

    /* renamed from: f */
    private final C0.b f36793f;

    /* renamed from: g */
    private final P0 f36794g;

    /* renamed from: h */
    private final y1 f36795h;

    /* renamed from: i */
    private final t1 f36796i;

    /* renamed from: j */
    private final I0 f36797j;

    /* renamed from: k */
    private final y.i f36798k;

    /* renamed from: l */
    private final X f36799l;

    /* renamed from: m */
    private int f36800m;

    /* renamed from: n */
    private volatile boolean f36801n;

    /* renamed from: o */
    private volatile int f36802o;

    /* renamed from: p */
    private final C6480a f36803p;

    /* renamed from: q */
    private final x.b f36804q;

    /* renamed from: r */
    private final AtomicLong f36805r;

    /* renamed from: s */
    private volatile com.google.common.util.concurrent.C f36806s;

    /* renamed from: t */
    private int f36807t;

    /* renamed from: u */
    private long f36808u;

    /* renamed from: v */
    private final a f36809v;

    /* renamed from: t.w$a */
    static final class a extends AbstractC6586j {

        /* renamed from: a */
        Set f36810a = new HashSet();

        /* renamed from: b */
        Map f36811b = new ArrayMap();

        a() {
        }

        void d(Executor executor, AbstractC6586j abstractC6586j) {
            this.f36810a.add(abstractC6586j);
            this.f36811b.put(abstractC6586j, executor);
        }

        void h(AbstractC6586j abstractC6586j) {
            this.f36810a.remove(abstractC6586j);
            this.f36811b.remove(abstractC6586j);
        }

        @Override // z.AbstractC6586j
        public void onCaptureCancelled() {
            for (final AbstractC6586j abstractC6586j : this.f36810a) {
                try {
                    ((Executor) this.f36811b.get(abstractC6586j)).execute(new Runnable() { // from class: t.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC6586j.onCaptureCancelled();
                        }
                    });
                } catch (RejectedExecutionException e8) {
                    androidx.camera.core.B0.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e8);
                }
            }
        }

        @Override // z.AbstractC6586j
        public void onCaptureCompleted(final InterfaceC6600q interfaceC6600q) {
            for (final AbstractC6586j abstractC6586j : this.f36810a) {
                try {
                    ((Executor) this.f36811b.get(abstractC6586j)).execute(new Runnable() { // from class: t.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC6586j.onCaptureCompleted(interfaceC6600q);
                        }
                    });
                } catch (RejectedExecutionException e8) {
                    androidx.camera.core.B0.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e8);
                }
            }
        }

        @Override // z.AbstractC6586j
        public void onCaptureFailed(final C6588k c6588k) {
            for (final AbstractC6586j abstractC6586j : this.f36810a) {
                try {
                    ((Executor) this.f36811b.get(abstractC6586j)).execute(new Runnable() { // from class: t.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC6586j.onCaptureFailed(c6588k);
                        }
                    });
                } catch (RejectedExecutionException e8) {
                    androidx.camera.core.B0.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e8);
                }
            }
        }
    }

    /* renamed from: t.w$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set f36812a = new HashSet();

        /* renamed from: b */
        private final Executor f36813b;

        b(Executor executor) {
            this.f36813b = executor;
        }

        public /* synthetic */ void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f36812a) {
                if (cVar.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f36812a.removeAll(hashSet);
        }

        void b(c cVar) {
            this.f36812a.add(cVar);
        }

        void d(c cVar) {
            this.f36812a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f36813b.execute(new Runnable() { // from class: t.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36818a.c(totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: t.w$c */
    public interface c {
        boolean onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    C6307w(C6372C c6372c, ScheduledExecutorService scheduledExecutorService, Executor executor, InterfaceC6605w.c cVar, z.z0 z0Var) {
        C0.b bVar = new C0.b();
        this.f36793f = bVar;
        this.f36800m = 0;
        this.f36801n = false;
        this.f36802o = 2;
        this.f36804q = new x.b();
        this.f36805r = new AtomicLong(0L);
        this.f36806s = B.f.immediateFuture(null);
        this.f36807t = 1;
        this.f36808u = 0L;
        a aVar = new a();
        this.f36809v = aVar;
        this.f36791d = c6372c;
        this.f36792e = cVar;
        this.f36789b = executor;
        b bVar2 = new b(executor);
        this.f36788a = bVar2;
        bVar.setTemplateType(this.f36807t);
        bVar.addRepeatingCameraCaptureCallback(C6304u0.a(bVar2));
        bVar.addRepeatingCameraCaptureCallback(aVar);
        this.f36797j = new I0(this, c6372c, executor);
        this.f36794g = new P0(this, scheduledExecutorService, executor, z0Var);
        this.f36795h = new y1(this, c6372c, executor);
        this.f36796i = new t1(this, c6372c, executor);
        this.f36803p = new C6480a(z0Var);
        this.f36798k = new y.i(this, executor);
        this.f36799l = new X(this, c6372c, z0Var, executor);
        executor.execute(new Runnable() { // from class: t.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f36756a.C();
            }
        });
    }

    public /* synthetic */ void A(Executor executor, AbstractC6586j abstractC6586j) {
        this.f36809v.d(executor, abstractC6586j);
    }

    public /* synthetic */ void C() {
        k(this.f36798k.getCaptureRequestListener());
    }

    public /* synthetic */ void D(AbstractC6586j abstractC6586j) {
        this.f36809v.h(abstractC6586j);
    }

    public /* synthetic */ com.google.common.util.concurrent.C E(List list, int i8, int i9, int i10, Void r52) {
        return this.f36799l.submitStillCaptures(list, i8, i9, i10);
    }

    public /* synthetic */ void F(c.a aVar) {
        B.f.propagate(R(Q()), aVar);
    }

    public /* synthetic */ Object G(final c.a aVar) {
        this.f36789b.execute(new Runnable() { // from class: t.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f36759a.F(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static /* synthetic */ boolean H(long j8, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!x(totalCaptureResult, j8)) {
            return false;
        }
        aVar.set(null);
        return true;
    }

    public /* synthetic */ Object I(final long j8, final c.a aVar) {
        k(new c() { // from class: t.j
            @Override // t.C6307w.c
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return C6307w.H(j8, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j8;
    }

    private com.google.common.util.concurrent.C R(final long j8) {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.s
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36765a.I(j8, aVar);
            }
        });
    }

    private int s(int i8) {
        int[] iArr = (int[]) this.f36791d.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i8, iArr) ? i8 : w(1, iArr) ? 1 : 0;
    }

    private boolean v() {
        return t() > 0;
    }

    private boolean w(int i8, int[] iArr) {
        for (int i9 : iArr) {
            if (i8 == i9) {
                return true;
            }
        }
        return false;
    }

    static boolean x(TotalCaptureResult totalCaptureResult, long j8) {
        Long l8;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof z.J0) && (l8 = (Long) ((z.J0) tag).getTag("CameraControlSessionUpdateId")) != null && l8.longValue() >= j8;
    }

    void J(c cVar) {
        this.f36788a.d(cVar);
    }

    void K(final AbstractC6586j abstractC6586j) {
        this.f36789b.execute(new Runnable() { // from class: t.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f36723a.D(abstractC6586j);
            }
        });
    }

    void L() {
        N(1);
    }

    void M(boolean z8) {
        this.f36794g.w(z8);
        this.f36795h.o(z8);
        this.f36796i.j(z8);
        this.f36797j.j(z8);
        this.f36798k.setActive(z8);
    }

    void N(int i8) {
        this.f36807t = i8;
        this.f36794g.x(i8);
        this.f36799l.setTemplate(this.f36807t);
    }

    void O(List list) {
        this.f36792e.onCameraControlCaptureRequests(list);
    }

    com.google.common.util.concurrent.C P() {
        return B.f.nonCancellationPropagating(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.n
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36731a.G(aVar);
            }
        }));
    }

    long Q() {
        this.f36808u = this.f36805r.getAndIncrement();
        this.f36792e.onCameraControlUpdateSessionConfig();
        return this.f36808u;
    }

    @Override // z.InterfaceC6605w
    public void addInteropConfig(InterfaceC6565N interfaceC6565N) {
        this.f36798k.addCaptureRequestOptions(l.a.from(interfaceC6565N).build()).addListener(new Runnable() { // from class: t.l
            @Override // java.lang.Runnable
            public final void run() {
                C6307w.z();
            }
        }, A.a.directExecutor());
    }

    @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
    public com.google.common.util.concurrent.C cancelFocusAndMetering() {
        return !v() ? B.f.immediateFailedFuture(new InterfaceC0892n.a("Camera is not active.")) : B.f.nonCancellationPropagating(this.f36794g.h());
    }

    @Override // z.InterfaceC6605w
    public void clearInteropConfig() {
        this.f36798k.clearCaptureRequestOptions().addListener(new Runnable() { // from class: t.p
            @Override // java.lang.Runnable
            public final void run() {
                C6307w.B();
            }
        }, A.a.directExecutor());
    }

    @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
    public com.google.common.util.concurrent.C enableTorch(boolean z8) {
        return !v() ? B.f.immediateFailedFuture(new InterfaceC0892n.a("Camera is not active.")) : B.f.nonCancellationPropagating(this.f36796i.d(z8));
    }

    public y.i getCamera2CameraControl() {
        return this.f36798k;
    }

    public I0 getExposureControl() {
        return this.f36797j;
    }

    @Override // z.InterfaceC6605w
    public int getFlashMode() {
        return this.f36802o;
    }

    public P0 getFocusMeteringControl() {
        return this.f36794g;
    }

    @Override // z.InterfaceC6605w
    public InterfaceC6565N getInteropConfig() {
        return this.f36798k.getCamera2ImplConfig();
    }

    @Override // z.InterfaceC6605w
    public Rect getSensorRect() {
        return (Rect) Z.h.checkNotNull((Rect) this.f36791d.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // z.InterfaceC6605w
    public z.C0 getSessionConfig() {
        this.f36793f.setTemplateType(this.f36807t);
        this.f36793f.setImplementationOptions(p());
        Object captureRequestTag = this.f36798k.getCamera2ImplConfig().getCaptureRequestTag(null);
        if (captureRequestTag != null && (captureRequestTag instanceof Integer)) {
            this.f36793f.addTag(y.i.TAG_KEY, captureRequestTag);
        }
        this.f36793f.addTag("CameraControlSessionUpdateId", Long.valueOf(this.f36808u));
        return this.f36793f.build();
    }

    public t1 getTorchControl() {
        return this.f36796i;
    }

    public y1 getZoomControl() {
        return this.f36795h;
    }

    void k(c cVar) {
        this.f36788a.b(cVar);
    }

    void l(final Executor executor, final AbstractC6586j abstractC6586j) {
        this.f36789b.execute(new Runnable() { // from class: t.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f36710a.A(executor, abstractC6586j);
            }
        });
    }

    void m() {
        synchronized (this.f36790c) {
            try {
                int i8 = this.f36800m;
                if (i8 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f36800m = i8 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void n(boolean z8) {
        this.f36801n = z8;
        if (!z8) {
            C6562K.a aVar = new C6562K.a();
            aVar.setTemplateType(this.f36807t);
            aVar.setUseRepeatingSurface(true);
            C6203b.a aVar2 = new C6203b.a();
            aVar2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(q(1)));
            aVar2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            aVar.addImplementationOptions(aVar2.build());
            O(Collections.singletonList(aVar.build()));
        }
        Q();
    }

    Rect o() {
        return this.f36795h.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[LOOP:0: B:30:0x006a->B:32:0x0070, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    z.InterfaceC6565N p() {
        /*
            r7 = this;
            s.b$a r0 = new s.b$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r3)
            t.P0 r1 = r7.f36794g
            r1.f(r0)
            x.a r1 = r7.f36803p
            r1.addAeFpsRangeOptions(r0)
            t.y1 r1 = r7.f36795h
            r1.e(r0)
            boolean r1 = r7.f36801n
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setCaptureRequestOption(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f36802o
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = r2
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            x.b r1 = r7.f36804q
            int r1 = r1.getCorrectedAeMode(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.q(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setCaptureRequestOption(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.s(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r2)
            t.I0 r1 = r7.f36797j
            r1.k(r0)
            y.i r1 = r7.f36798k
            s.b r1 = r1.getCamera2ImplConfig()
            java.util.Set r2 = r1.listOptions()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            z.N$a r3 = (z.InterfaceC6565N.a) r3
            z.q0 r4 = r0.getMutableConfig()
            z.N$c r5 = z.InterfaceC6565N.c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.retrieveOption(r3)
            r4.insertOption(r3, r5, r6)
            goto L6a
        L84:
            s.b r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6307w.p():z.N");
    }

    int q(int i8) {
        int[] iArr = (int[]) this.f36791d.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i8, iArr) ? i8 : w(1, iArr) ? 1 : 0;
    }

    int r(int i8) {
        int[] iArr = (int[]) this.f36791d.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i8, iArr)) {
            return i8;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
    public com.google.common.util.concurrent.C setExposureCompensationIndex(int i8) {
        return !v() ? B.f.immediateFailedFuture(new InterfaceC0892n.a("Camera is not active.")) : this.f36797j.l(i8);
    }

    @Override // z.InterfaceC6605w
    public void setFlashMode(int i8) {
        if (!v()) {
            androidx.camera.core.B0.w("Camera2CameraControlImp", "Camera is not active.");
        } else {
            this.f36802o = i8;
            this.f36806s = P();
        }
    }

    @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
    public com.google.common.util.concurrent.C setLinearZoom(float f8) {
        return !v() ? B.f.immediateFailedFuture(new InterfaceC0892n.a("Camera is not active.")) : B.f.nonCancellationPropagating(this.f36795h.p(f8));
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.f36794g.setPreviewAspectRatio(rational);
    }

    @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
    public com.google.common.util.concurrent.C setZoomRatio(float f8) {
        return !v() ? B.f.immediateFailedFuture(new InterfaceC0892n.a("Camera is not active.")) : B.f.nonCancellationPropagating(this.f36795h.q(f8));
    }

    @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
    public com.google.common.util.concurrent.C startFocusAndMetering(androidx.camera.core.J j8) {
        return !v() ? B.f.immediateFailedFuture(new InterfaceC0892n.a("Camera is not active.")) : B.f.nonCancellationPropagating(this.f36794g.z(j8));
    }

    @Override // z.InterfaceC6605w
    public com.google.common.util.concurrent.C submitStillCaptureRequests(final List<C6562K> list, final int i8, final int i9) {
        if (v()) {
            final int flashMode = getFlashMode();
            return B.d.from(this.f36806s).transformAsync(new B.a() { // from class: t.i
                @Override // B.a
                public final com.google.common.util.concurrent.C apply(Object obj) {
                    return this.f36683a.E(list, i8, flashMode, i9, (Void) obj);
                }
            }, this.f36789b);
        }
        androidx.camera.core.B0.w("Camera2CameraControlImp", "Camera is not active.");
        return B.f.immediateFailedFuture(new InterfaceC0892n.a("Camera is not active."));
    }

    int t() {
        int i8;
        synchronized (this.f36790c) {
            i8 = this.f36800m;
        }
        return i8;
    }

    void u() {
        synchronized (this.f36790c) {
            this.f36800m++;
        }
    }

    public void updateSessionConfig() {
        this.f36789b.execute(new Runnable() { // from class: t.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f36744a.Q();
            }
        });
    }

    boolean y() {
        return this.f36801n;
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void z() {
    }
}
