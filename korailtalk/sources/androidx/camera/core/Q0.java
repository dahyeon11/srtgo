package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ScheduledExecutorService;
import z.AbstractC6586j;
import z.InterfaceC6563L;
import z.InterfaceC6564M;
import z.InterfaceC6581g0;

/* loaded from: classes.dex */
final class Q0 extends z.S {

    /* renamed from: l, reason: collision with root package name */
    final Object f7497l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6581g0.a f7498m;

    /* renamed from: n, reason: collision with root package name */
    boolean f7499n;

    /* renamed from: o, reason: collision with root package name */
    private final Size f7500o;

    /* renamed from: p, reason: collision with root package name */
    final E0 f7501p;

    /* renamed from: q, reason: collision with root package name */
    final Surface f7502q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f7503r;

    /* renamed from: s, reason: collision with root package name */
    final InterfaceC6564M f7504s;

    /* renamed from: t, reason: collision with root package name */
    final InterfaceC6563L f7505t;

    /* renamed from: u, reason: collision with root package name */
    private final AbstractC6586j f7506u;

    /* renamed from: v, reason: collision with root package name */
    private final z.S f7507v;

    /* renamed from: w, reason: collision with root package name */
    private String f7508w;

    class a implements B.c {
        a() {
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            B0.e("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
        }

        @Override // B.c
        public void onSuccess(Surface surface) {
            synchronized (Q0.this.f7497l) {
                Q0.this.f7505t.onOutputSurface(surface, 1);
            }
        }
    }

    Q0(int i8, int i9, int i10, Handler handler, InterfaceC6564M interfaceC6564M, InterfaceC6563L interfaceC6563L, z.S s8, String str) {
        super(new Size(i8, i9), i10);
        this.f7497l = new Object();
        InterfaceC6581g0.a aVar = new InterfaceC6581g0.a() { // from class: androidx.camera.core.O0
            @Override // z.InterfaceC6581g0.a
            public final void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
                this.f7480a.j(interfaceC6581g0);
            }
        };
        this.f7498m = aVar;
        this.f7499n = false;
        Size size = new Size(i8, i9);
        this.f7500o = size;
        if (handler != null) {
            this.f7503r = handler;
        } else {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
            this.f7503r = new Handler(looperMyLooper);
        }
        ScheduledExecutorService scheduledExecutorServiceNewHandlerExecutor = A.a.newHandlerExecutor(this.f7503r);
        E0 e02 = new E0(i8, i9, i10, 2);
        this.f7501p = e02;
        e02.setOnImageAvailableListener(aVar, scheduledExecutorServiceNewHandlerExecutor);
        this.f7502q = e02.getSurface();
        this.f7506u = e02.f();
        this.f7505t = interfaceC6563L;
        interfaceC6563L.onResolutionUpdate(size);
        this.f7504s = interfaceC6564M;
        this.f7507v = s8;
        this.f7508w = str;
        B.f.addCallback(s8.getSurface(), new a(), A.a.directExecutor());
        getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.P0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7489a.k();
            }
        }, A.a.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(InterfaceC6581g0 interfaceC6581g0) {
        synchronized (this.f7497l) {
            i(interfaceC6581g0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this.f7497l) {
            try {
                if (this.f7499n) {
                    return;
                }
                this.f7501p.close();
                this.f7502q.release();
                this.f7507v.close();
                this.f7499n = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    AbstractC6586j h() {
        AbstractC6586j abstractC6586j;
        synchronized (this.f7497l) {
            try {
                if (this.f7499n) {
                    throw new IllegalStateException("ProcessingSurface already released!");
                }
                abstractC6586j = this.f7506u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC6586j;
    }

    void i(InterfaceC6581g0 interfaceC6581g0) {
        InterfaceC0902s0 interfaceC0902s0AcquireNextImage;
        if (this.f7499n) {
            return;
        }
        try {
            interfaceC0902s0AcquireNextImage = interfaceC6581g0.acquireNextImage();
        } catch (IllegalStateException e8) {
            B0.e("ProcessingSurfaceTextur", "Failed to acquire next image.", e8);
            interfaceC0902s0AcquireNextImage = null;
        }
        if (interfaceC0902s0AcquireNextImage == null) {
            return;
        }
        InterfaceC0897p0 imageInfo = interfaceC0902s0AcquireNextImage.getImageInfo();
        if (imageInfo == null) {
            interfaceC0902s0AcquireNextImage.close();
            return;
        }
        Integer num = (Integer) imageInfo.getTagBundle().getTag(this.f7508w);
        if (num == null) {
            interfaceC0902s0AcquireNextImage.close();
            return;
        }
        if (this.f7504s.getId() == num.intValue()) {
            z.F0 f02 = new z.F0(interfaceC0902s0AcquireNextImage, this.f7508w);
            this.f7505t.process(f02);
            f02.close();
        } else {
            B0.w("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
            interfaceC0902s0AcquireNextImage.close();
        }
    }

    @Override // z.S
    public com.google.common.util.concurrent.C provideSurface() {
        com.google.common.util.concurrent.C cImmediateFuture;
        synchronized (this.f7497l) {
            cImmediateFuture = B.f.immediateFuture(this.f7502q);
        }
        return cImmediateFuture;
    }
}
