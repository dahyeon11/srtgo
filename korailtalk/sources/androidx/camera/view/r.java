package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.B0;
import androidx.camera.core.g1;
import androidx.camera.view.l;
import com.google.common.util.concurrent.C;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class r extends l {

    /* renamed from: e, reason: collision with root package name */
    SurfaceView f8002e;

    /* renamed from: f, reason: collision with root package name */
    final b f8003f;

    /* renamed from: g, reason: collision with root package name */
    private l.a f8004g;

    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    class b implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        private Size f8005a;

        /* renamed from: b, reason: collision with root package name */
        private g1 f8006b;

        /* renamed from: c, reason: collision with root package name */
        private Size f8007c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8008d = false;

        b() {
        }

        private boolean b() {
            Size size;
            return (this.f8008d || this.f8006b == null || (size = this.f8005a) == null || !size.equals(this.f8007c)) ? false : true;
        }

        private void c() {
            if (this.f8006b != null) {
                B0.d("SurfaceViewImpl", "Request canceled: " + this.f8006b);
                this.f8006b.willNotProvideSurface();
            }
        }

        private void d() {
            if (this.f8006b != null) {
                B0.d("SurfaceViewImpl", "Surface invalidated " + this.f8006b);
                this.f8006b.getDeferrableSurface().close();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(g1.f fVar) {
            B0.d("SurfaceViewImpl", "Safe to release surface.");
            r.this.n();
        }

        private boolean g() throws ExecutionException, InterruptedException {
            Surface surface = r.this.f8002e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            B0.d("SurfaceViewImpl", "Surface set on Preview.");
            this.f8006b.provideSurface(surface, androidx.core.content.a.getMainExecutor(r.this.f8002e.getContext()), new Z.a() { // from class: androidx.camera.view.s
                @Override // Z.a
                public final void accept(Object obj) {
                    this.f8010a.e((g1.f) obj);
                }
            });
            this.f8008d = true;
            r.this.f();
            return true;
        }

        void f(g1 g1Var) {
            c();
            this.f8006b = g1Var;
            Size resolution = g1Var.getResolution();
            this.f8005a = resolution;
            this.f8008d = false;
            if (g()) {
                return;
            }
            B0.d("SurfaceViewImpl", "Wait for new Surface creation.");
            r.this.f8002e.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) throws ExecutionException, InterruptedException {
            B0.d("SurfaceViewImpl", "Surface changed. Size: " + i9 + "x" + i10);
            this.f8007c = new Size(i9, i10);
            g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            B0.d("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            B0.d("SurfaceViewImpl", "Surface destroyed.");
            if (this.f8008d) {
                d();
            } else {
                c();
            }
            this.f8008d = false;
            this.f8006b = null;
            this.f8007c = null;
            this.f8005a = null;
        }
    }

    r(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f8003f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(int i8) {
        if (i8 == 0) {
            B0.d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        B0.e("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(g1 g1Var) {
        this.f8003f.f(g1Var);
    }

    @Override // androidx.camera.view.l
    View b() {
        return this.f8002e;
    }

    @Override // androidx.camera.view.l
    Bitmap c() {
        SurfaceView surfaceView = this.f8002e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f8002e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f8002e.getWidth(), this.f8002e.getHeight(), Bitmap.Config.ARGB_8888);
        a.a(this.f8002e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.q
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i8) {
                r.l(i8);
            }
        }, this.f8002e.getHandler());
        return bitmapCreateBitmap;
    }

    @Override // androidx.camera.view.l
    void d() {
    }

    @Override // androidx.camera.view.l
    void e() {
    }

    @Override // androidx.camera.view.l
    void g(final g1 g1Var, l.a aVar) {
        this.f7992a = g1Var.getResolution();
        this.f8004g = aVar;
        initializePreview();
        g1Var.addRequestCancellationListener(androidx.core.content.a.getMainExecutor(this.f8002e.getContext()), new Runnable() { // from class: androidx.camera.view.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f7999a.n();
            }
        });
        this.f8002e.post(new Runnable() { // from class: androidx.camera.view.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f8000a.m(g1Var);
            }
        });
    }

    @Override // androidx.camera.view.l
    C i() {
        return B.f.immediateFuture(null);
    }

    void initializePreview() {
        Z.h.checkNotNull(this.f7993b);
        Z.h.checkNotNull(this.f7992a);
        SurfaceView surfaceView = new SurfaceView(this.f7993b.getContext());
        this.f8002e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f7992a.getWidth(), this.f7992a.getHeight()));
        this.f7993b.removeAllViews();
        this.f7993b.addView(this.f8002e);
        this.f8002e.getHolder().addCallback(this.f8003f);
    }

    void n() {
        l.a aVar = this.f8004g;
        if (aVar != null) {
            aVar.onSurfaceNotInUse();
            this.f8004g = null;
        }
    }
}
