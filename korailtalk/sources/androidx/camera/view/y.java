package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.B0;
import androidx.camera.core.g1;
import androidx.camera.view.l;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class y extends l {

    /* renamed from: e, reason: collision with root package name */
    TextureView f8021e;

    /* renamed from: f, reason: collision with root package name */
    SurfaceTexture f8022f;

    /* renamed from: g, reason: collision with root package name */
    C f8023g;

    /* renamed from: h, reason: collision with root package name */
    g1 f8024h;

    /* renamed from: i, reason: collision with root package name */
    boolean f8025i;

    /* renamed from: j, reason: collision with root package name */
    SurfaceTexture f8026j;

    /* renamed from: k, reason: collision with root package name */
    AtomicReference f8027k;

    /* renamed from: l, reason: collision with root package name */
    l.a f8028l;

    class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.y$a$a, reason: collision with other inner class name */
        class C0120a implements B.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f8030a;

            C0120a(SurfaceTexture surfaceTexture) {
                this.f8030a = surfaceTexture;
            }

            @Override // B.c
            public void onFailure(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }

            @Override // B.c
            public void onSuccess(g1.f fVar) {
                Z.h.checkState(fVar.getResultCode() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                B0.d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f8030a.release();
                y yVar = y.this;
                if (yVar.f8026j != null) {
                    yVar.f8026j = null;
                }
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
            B0.d("TextureViewImpl", "SurfaceTexture available. Size: " + i8 + "x" + i9);
            y yVar = y.this;
            yVar.f8022f = surfaceTexture;
            if (yVar.f8023g == null) {
                yVar.t();
                return;
            }
            Z.h.checkNotNull(yVar.f8024h);
            B0.d("TextureViewImpl", "Surface invalidated " + y.this.f8024h);
            y.this.f8024h.getDeferrableSurface().close();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            y yVar = y.this;
            yVar.f8022f = null;
            C c9 = yVar.f8023g;
            if (c9 == null) {
                B0.d("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            B.f.addCallback(c9, new C0120a(surfaceTexture), androidx.core.content.a.getMainExecutor(y.this.f8021e.getContext()));
            y.this.f8026j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
            B0.d("TextureViewImpl", "SurfaceTexture size changed: " + i8 + "x" + i9);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a aVar = (c.a) y.this.f8027k.getAndSet(null);
            if (aVar != null) {
                aVar.set(null);
            }
        }
    }

    y(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f8025i = false;
        this.f8027k = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(g1 g1Var) {
        g1 g1Var2 = this.f8024h;
        if (g1Var2 != null && g1Var2 == g1Var) {
            this.f8024h = null;
            this.f8023g = null;
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Surface surface, final c.a aVar) throws ExecutionException, InterruptedException {
        B0.d("TextureViewImpl", "Surface set on Preview.");
        g1 g1Var = this.f8024h;
        Executor executorDirectExecutor = A.a.directExecutor();
        Objects.requireNonNull(aVar);
        g1Var.provideSurface(surface, executorDirectExecutor, new Z.a() { // from class: androidx.camera.view.x
            @Override // Z.a
            public final void accept(Object obj) {
                aVar.set((g1.f) obj);
            }
        });
        return "provideSurface[request=" + this.f8024h + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Surface surface, C c9, g1 g1Var) {
        B0.d("TextureViewImpl", "Safe to release surface.");
        r();
        surface.release();
        if (this.f8023g == c9) {
            this.f8023g = null;
        }
        if (this.f8024h == g1Var) {
            this.f8024h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(c.a aVar) {
        this.f8027k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void r() {
        l.a aVar = this.f8028l;
        if (aVar != null) {
            aVar.onSurfaceNotInUse();
            this.f8028l = null;
        }
    }

    private void s() {
        if (!this.f8025i || this.f8026j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f8021e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f8026j;
        if (surfaceTexture != surfaceTexture2) {
            this.f8021e.setSurfaceTexture(surfaceTexture2);
            this.f8026j = null;
            this.f8025i = false;
        }
    }

    @Override // androidx.camera.view.l
    View b() {
        return this.f8021e;
    }

    @Override // androidx.camera.view.l
    Bitmap c() {
        TextureView textureView = this.f8021e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f8021e.getBitmap();
    }

    @Override // androidx.camera.view.l
    void d() {
        s();
    }

    @Override // androidx.camera.view.l
    void e() {
        this.f8025i = true;
    }

    @Override // androidx.camera.view.l
    void g(final g1 g1Var, l.a aVar) {
        this.f7992a = g1Var.getResolution();
        this.f8028l = aVar;
        initializePreview();
        g1 g1Var2 = this.f8024h;
        if (g1Var2 != null) {
            g1Var2.willNotProvideSurface();
        }
        this.f8024h = g1Var;
        g1Var.addRequestCancellationListener(androidx.core.content.a.getMainExecutor(this.f8021e.getContext()), new Runnable() { // from class: androidx.camera.view.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f8011a.n(g1Var);
            }
        });
        t();
    }

    @Override // androidx.camera.view.l
    C i() {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.view.w
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f8019a.q(aVar);
            }
        });
    }

    public void initializePreview() {
        Z.h.checkNotNull(this.f7993b);
        Z.h.checkNotNull(this.f7992a);
        TextureView textureView = new TextureView(this.f7993b.getContext());
        this.f8021e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f7992a.getWidth(), this.f7992a.getHeight()));
        this.f8021e.setSurfaceTextureListener(new a());
        this.f7993b.removeAllViews();
        this.f7993b.addView(this.f8021e);
    }

    void t() {
        SurfaceTexture surfaceTexture;
        Size size = this.f7992a;
        if (size == null || (surfaceTexture = this.f8022f) == null || this.f8024h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f7992a.getHeight());
        final Surface surface = new Surface(this.f8022f);
        final g1 g1Var = this.f8024h;
        final C future = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.view.u
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f8013a.o(surface, aVar);
            }
        });
        this.f8023g = future;
        future.addListener(new Runnable() { // from class: androidx.camera.view.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f8015a.p(surface, future, g1Var);
            }
        }, androidx.core.content.a.getMainExecutor(this.f8021e.getContext()));
        f();
    }
}
