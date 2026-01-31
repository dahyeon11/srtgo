package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.P;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import z.InterfaceC6581g0;

/* loaded from: classes.dex */
abstract class T implements InterfaceC6581g0.a {

    /* renamed from: t, reason: collision with root package name */
    private static final RectF f7519t = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    private P.a f7520a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f7521b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f7522c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f7524e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f7525f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f7526g;

    /* renamed from: h, reason: collision with root package name */
    private U0 f7527h;

    /* renamed from: i, reason: collision with root package name */
    private ImageWriter f7528i;

    /* renamed from: n, reason: collision with root package name */
    ByteBuffer f7533n;

    /* renamed from: o, reason: collision with root package name */
    ByteBuffer f7534o;

    /* renamed from: p, reason: collision with root package name */
    ByteBuffer f7535p;

    /* renamed from: q, reason: collision with root package name */
    ByteBuffer f7536q;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f7523d = 1;

    /* renamed from: j, reason: collision with root package name */
    private Rect f7529j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private Rect f7530k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    private Matrix f7531l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private Matrix f7532m = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    private final Object f7537r = new Object();

    /* renamed from: s, reason: collision with root package name */
    protected boolean f7538s = true;

    T() {
    }

    private void g(InterfaceC0902s0 interfaceC0902s0) {
        if (this.f7523d != 1) {
            if (this.f7523d == 2 && this.f7533n == null) {
                this.f7533n = ByteBuffer.allocateDirect(interfaceC0902s0.getWidth() * interfaceC0902s0.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f7534o == null) {
            this.f7534o = ByteBuffer.allocateDirect(interfaceC0902s0.getWidth() * interfaceC0902s0.getHeight());
        }
        this.f7534o.position(0);
        if (this.f7535p == null) {
            this.f7535p = ByteBuffer.allocateDirect((interfaceC0902s0.getWidth() * interfaceC0902s0.getHeight()) / 4);
        }
        this.f7535p.position(0);
        if (this.f7536q == null) {
            this.f7536q = ByteBuffer.allocateDirect((interfaceC0902s0.getWidth() * interfaceC0902s0.getHeight()) / 4);
        }
        this.f7536q.position(0);
    }

    private static U0 h(int i8, int i9, int i10, int i11, int i12) {
        boolean z8 = i10 == 90 || i10 == 270;
        int i13 = z8 ? i9 : i8;
        if (!z8) {
            i8 = i9;
        }
        return new U0(AbstractC0906u0.a(i13, i8, i11, i12));
    }

    static Matrix j(int i8, int i9, int i10, int i11, int i12) {
        Matrix matrix = new Matrix();
        if (i12 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i8, i9), f7519t, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i12);
            matrix.postConcat(k(new RectF(0.0f, 0.0f, i10, i11)));
        }
        return matrix;
    }

    private static Matrix k(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f7519t, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(InterfaceC0902s0 interfaceC0902s0, Matrix matrix, InterfaceC0902s0 interfaceC0902s02, Rect rect, P.a aVar, c.a aVar2) {
        if (!this.f7538s) {
            aVar2.setException(new androidx.core.os.n("ImageAnalysis is detached"));
            return;
        }
        V0 v02 = new V0(interfaceC0902s02, AbstractC0916z0.create(interfaceC0902s0.getImageInfo().getTagBundle(), interfaceC0902s0.getImageInfo().getTimestamp(), this.f7524e ? 0 : this.f7521b, matrix));
        v02.setCropRect(rect);
        aVar.analyze(v02);
        aVar2.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Executor executor, final InterfaceC0902s0 interfaceC0902s0, final Matrix matrix, final InterfaceC0902s0 interfaceC0902s02, final Rect rect, final P.a aVar, final c.a aVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.S
            @Override // java.lang.Runnable
            public final void run() {
                this.f7510a.m(interfaceC0902s0, matrix, interfaceC0902s02, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void p(int i8, int i9, int i10, int i11) {
        Matrix matrixJ = j(i8, i9, i10, i11, this.f7521b);
        this.f7530k = l(this.f7529j, matrixJ);
        this.f7532m.setConcat(this.f7531l, matrixJ);
    }

    private void q(InterfaceC0902s0 interfaceC0902s0, int i8) {
        U0 u02 = this.f7527h;
        if (u02 == null) {
            return;
        }
        u02.e();
        this.f7527h = h(interfaceC0902s0.getWidth(), interfaceC0902s0.getHeight(), i8, this.f7527h.getImageFormat(), this.f7527h.getMaxImages());
        if (this.f7523d == 1) {
            ImageWriter imageWriter = this.f7528i;
            if (imageWriter != null) {
                D.a.close(imageWriter);
            }
            this.f7528i = D.a.newInstance(this.f7527h.getSurface(), this.f7527h.getMaxImages());
        }
    }

    abstract InterfaceC0902s0 c(InterfaceC6581g0 interfaceC6581g0);

    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    com.google.common.util.concurrent.C d(final androidx.camera.core.InterfaceC0902s0 r15) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.T.d(androidx.camera.core.s0):com.google.common.util.concurrent.C");
    }

    void e() {
        this.f7538s = true;
    }

    abstract void f();

    void i() {
        this.f7538s = false;
        f();
    }

    abstract void o(InterfaceC0902s0 interfaceC0902s0);

    @Override // z.InterfaceC6581g0.a
    public void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
        try {
            InterfaceC0902s0 interfaceC0902s0C = c(interfaceC6581g0);
            if (interfaceC0902s0C != null) {
                o(interfaceC0902s0C);
            }
        } catch (IllegalStateException e8) {
            B0.e("ImageAnalysisAnalyzer", "Failed to acquire image.", e8);
        }
    }

    void r(Executor executor, P.a aVar) {
        synchronized (this.f7537r) {
            if (aVar == null) {
                try {
                    f();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7520a = aVar;
            this.f7526g = executor;
        }
    }

    void s(boolean z8) {
        this.f7525f = z8;
    }

    void t(int i8) {
        this.f7523d = i8;
    }

    void u(boolean z8) {
        this.f7524e = z8;
    }

    void v(U0 u02) {
        synchronized (this.f7537r) {
            this.f7527h = u02;
        }
    }

    void w(int i8) {
        this.f7521b = i8;
    }

    void x(Matrix matrix) {
        synchronized (this.f7537r) {
            this.f7531l = matrix;
            this.f7532m = new Matrix(this.f7531l);
        }
    }

    void y(Rect rect) {
        synchronized (this.f7537r) {
            this.f7529j = rect;
            this.f7530k = new Rect(this.f7529j);
        }
    }
}
