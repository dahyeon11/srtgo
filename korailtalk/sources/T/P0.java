package t;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import s.C6203b;
import t.C6307w;
import z.AbstractC6586j;
import z.C6562K;
import z.C6588k;
import z.InterfaceC6600q;
import z.InterfaceC6605w;

/* loaded from: classes.dex */
class P0 {

    /* renamed from: u, reason: collision with root package name */
    private static final MeteringRectangle[] f36499u = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    private final C6307w f36500a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f36501b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f36502c;

    /* renamed from: f, reason: collision with root package name */
    private final x.i f36505f;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f36508i;

    /* renamed from: p, reason: collision with root package name */
    private MeteringRectangle[] f36515p;

    /* renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f36516q;

    /* renamed from: r, reason: collision with root package name */
    private MeteringRectangle[] f36517r;

    /* renamed from: s, reason: collision with root package name */
    c.a f36518s;

    /* renamed from: t, reason: collision with root package name */
    c.a f36519t;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f36503d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile Rational f36504e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36506g = false;

    /* renamed from: h, reason: collision with root package name */
    Integer f36507h = 0;

    /* renamed from: j, reason: collision with root package name */
    long f36509j = 0;

    /* renamed from: k, reason: collision with root package name */
    boolean f36510k = false;

    /* renamed from: l, reason: collision with root package name */
    boolean f36511l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f36512m = 1;

    /* renamed from: n, reason: collision with root package name */
    private C6307w.c f36513n = null;

    /* renamed from: o, reason: collision with root package name */
    private C6307w.c f36514o = null;

    class a extends AbstractC6586j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f36520a;

        a(c.a aVar) {
            this.f36520a = aVar;
        }

        @Override // z.AbstractC6586j
        public void onCaptureCancelled() {
            c.a aVar = this.f36520a;
            if (aVar != null) {
                aVar.setException(new InterfaceC0892n.a("Camera is closed"));
            }
        }

        @Override // z.AbstractC6586j
        public void onCaptureCompleted(InterfaceC6600q interfaceC6600q) {
            c.a aVar = this.f36520a;
            if (aVar != null) {
                aVar.set(interfaceC6600q);
            }
        }

        @Override // z.AbstractC6586j
        public void onCaptureFailed(C6588k c6588k) {
            c.a aVar = this.f36520a;
            if (aVar != null) {
                aVar.setException(new InterfaceC6605w.b(c6588k));
            }
        }
    }

    class b extends AbstractC6586j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f36522a;

        b(c.a aVar) {
            this.f36522a = aVar;
        }

        @Override // z.AbstractC6586j
        public void onCaptureCancelled() {
            c.a aVar = this.f36522a;
            if (aVar != null) {
                aVar.setException(new InterfaceC0892n.a("Camera is closed"));
            }
        }

        @Override // z.AbstractC6586j
        public void onCaptureCompleted(InterfaceC6600q interfaceC6600q) {
            c.a aVar = this.f36522a;
            if (aVar != null) {
                aVar.set(null);
            }
        }

        @Override // z.AbstractC6586j
        public void onCaptureFailed(C6588k c6588k) {
            c.a aVar = this.f36522a;
            if (aVar != null) {
                aVar.setException(new InterfaceC6605w.b(c6588k));
            }
        }
    }

    P0(C6307w c6307w, ScheduledExecutorService scheduledExecutorService, Executor executor, z.z0 z0Var) {
        MeteringRectangle[] meteringRectangleArr = f36499u;
        this.f36515p = meteringRectangleArr;
        this.f36516q = meteringRectangleArr;
        this.f36517r = meteringRectangleArr;
        this.f36518s = null;
        this.f36519t = null;
        this.f36500a = c6307w;
        this.f36501b = executor;
        this.f36502c = scheduledExecutorService;
        this.f36505f = new x.i(z0Var);
    }

    private void k() {
        c.a aVar = this.f36519t;
        if (aVar != null) {
            aVar.set(null);
            this.f36519t = null;
        }
    }

    private void l() {
        ScheduledFuture scheduledFuture = this.f36508i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f36508i = null;
        }
    }

    private void m(String str) {
        this.f36500a.J(this.f36513n);
        c.a aVar = this.f36518s;
        if (aVar != null) {
            aVar.setException(new InterfaceC0892n.a(str));
            this.f36518s = null;
        }
    }

    private void n(String str) {
        this.f36500a.J(this.f36514o);
        c.a aVar = this.f36519t;
        if (aVar != null) {
            aVar.setException(new InterfaceC0892n.a(str));
            this.f36519t = null;
        }
    }

    private Rational p() {
        if (this.f36504e != null) {
            return this.f36504e;
        }
        Rect rectO = this.f36500a.o();
        return new Rational(rectO.width(), rectO.height());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(final c.a aVar) {
        this.f36501b.execute(new Runnable() { // from class: t.N0
            @Override // java.lang.Runnable
            public final void run() {
                this.f36446a.r(aVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean t(int i8, long j8, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i8 || !C6307w.x(totalCaptureResult, j8)) {
            return false;
        }
        k();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object v(final androidx.camera.core.J j8, final c.a aVar) {
        this.f36501b.execute(new Runnable(aVar, j8) { // from class: t.O0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.a f36497b;

            @Override // java.lang.Runnable
            public final void run() {
                this.f36496a.u(this.f36497b, null);
            }
        });
        return "startFocusAndMetering";
    }

    private boolean y() {
        return this.f36515p.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(c.a aVar, androidx.camera.core.J j8) {
        if (!this.f36503d) {
            aVar.setException(new InterfaceC0892n.a("Camera is not active."));
        } else {
            this.f36500a.o();
            p();
            throw null;
        }
    }

    void B(c.a aVar) {
        if (!this.f36503d) {
            if (aVar != null) {
                aVar.setException(new InterfaceC0892n.a("Camera is not active."));
                return;
            }
            return;
        }
        C6562K.a aVar2 = new C6562K.a();
        aVar2.setTemplateType(this.f36512m);
        aVar2.setUseRepeatingSurface(true);
        C6203b.a aVar3 = new C6203b.a();
        aVar3.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.addImplementationOptions(aVar3.build());
        aVar2.addCameraCaptureCallback(new b(aVar));
        this.f36500a.O(Collections.singletonList(aVar2.build()));
    }

    void C(c.a aVar, boolean z8) {
        if (!this.f36503d) {
            if (aVar != null) {
                aVar.setException(new InterfaceC0892n.a("Camera is not active."));
                return;
            }
            return;
        }
        C6562K.a aVar2 = new C6562K.a();
        aVar2.setTemplateType(this.f36512m);
        aVar2.setUseRepeatingSurface(true);
        C6203b.a aVar3 = new C6203b.a();
        aVar3.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z8) {
            aVar3.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f36500a.q(1)));
        }
        aVar2.addImplementationOptions(aVar3.build());
        aVar2.addCameraCaptureCallback(new a(aVar));
        this.f36500a.O(Collections.singletonList(aVar2.build()));
    }

    void f(C6203b.a aVar) {
        aVar.setCaptureRequestOption(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f36500a.r(this.f36506g ? 1 : o())));
        MeteringRectangle[] meteringRectangleArr = this.f36515p;
        if (meteringRectangleArr.length != 0) {
            aVar.setCaptureRequestOption(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f36516q;
        if (meteringRectangleArr2.length != 0) {
            aVar.setCaptureRequestOption(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f36517r;
        if (meteringRectangleArr3.length != 0) {
            aVar.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    void g(boolean z8, boolean z9) {
        if (this.f36503d) {
            C6562K.a aVar = new C6562K.a();
            aVar.setUseRepeatingSurface(true);
            aVar.setTemplateType(this.f36512m);
            C6203b.a aVar2 = new C6203b.a();
            if (z8) {
                aVar2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z9) {
                aVar2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.addImplementationOptions(aVar2.build());
            this.f36500a.O(Collections.singletonList(aVar.build()));
        }
    }

    com.google.common.util.concurrent.C h() {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.M0
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36444a.s(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void r(c.a aVar) {
        n("Cancelled by another cancelFocusAndMetering()");
        m("Cancelled by cancelFocusAndMetering()");
        this.f36519t = aVar;
        l();
        if (y()) {
            g(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f36499u;
        this.f36515p = meteringRectangleArr;
        this.f36516q = meteringRectangleArr;
        this.f36517r = meteringRectangleArr;
        this.f36506g = false;
        final long jQ = this.f36500a.Q();
        if (this.f36519t != null) {
            final int iR = this.f36500a.r(o());
            C6307w.c cVar = new C6307w.c() { // from class: t.L0
                @Override // t.C6307w.c
                public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    return this.f36438a.t(iR, jQ, totalCaptureResult);
                }
            };
            this.f36514o = cVar;
            this.f36500a.k(cVar);
        }
    }

    void j() {
        r(null);
    }

    int o() {
        return this.f36512m != 3 ? 4 : 3;
    }

    boolean q(androidx.camera.core.J j8) {
        this.f36500a.o();
        p();
        throw null;
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.f36504e = rational;
    }

    void w(boolean z8) {
        if (z8 == this.f36503d) {
            return;
        }
        this.f36503d = z8;
        if (this.f36503d) {
            return;
        }
        j();
    }

    void x(int i8) {
        this.f36512m = i8;
    }

    com.google.common.util.concurrent.C z(final androidx.camera.core.J j8) {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c(j8) { // from class: t.K0
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36435a.v(null, aVar);
            }
        });
    }
}
