package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.L;
import java.util.concurrent.Executor;
import z.InterfaceC6581g0;

/* loaded from: classes.dex */
class U0 implements InterfaceC6581g0 {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6581g0 f7545d;

    /* renamed from: e, reason: collision with root package name */
    private final Surface f7546e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f7542a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private int f7543b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7544c = false;

    /* renamed from: f, reason: collision with root package name */
    private final L.a f7547f = new L.a() { // from class: androidx.camera.core.T0
        @Override // androidx.camera.core.L.a
        public final void onImageClose(InterfaceC0902s0 interfaceC0902s0) {
            this.f7539a.c(interfaceC0902s0);
        }
    };

    U0(InterfaceC6581g0 interfaceC6581g0) {
        this.f7545d = interfaceC6581g0;
        this.f7546e = interfaceC6581g0.getSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(InterfaceC0902s0 interfaceC0902s0) {
        synchronized (this.f7542a) {
            try {
                int i8 = this.f7543b - 1;
                this.f7543b = i8;
                if (this.f7544c && i8 == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(InterfaceC6581g0.a aVar, InterfaceC6581g0 interfaceC6581g0) {
        aVar.onImageAvailable(this);
    }

    private InterfaceC0902s0 f(InterfaceC0902s0 interfaceC0902s0) {
        if (interfaceC0902s0 == null) {
            return null;
        }
        this.f7543b++;
        X0 x02 = new X0(interfaceC0902s0);
        x02.a(this.f7547f);
        return x02;
    }

    @Override // z.InterfaceC6581g0
    public InterfaceC0902s0 acquireLatestImage() {
        InterfaceC0902s0 interfaceC0902s0F;
        synchronized (this.f7542a) {
            interfaceC0902s0F = f(this.f7545d.acquireLatestImage());
        }
        return interfaceC0902s0F;
    }

    @Override // z.InterfaceC6581g0
    public InterfaceC0902s0 acquireNextImage() {
        InterfaceC0902s0 interfaceC0902s0F;
        synchronized (this.f7542a) {
            interfaceC0902s0F = f(this.f7545d.acquireNextImage());
        }
        return interfaceC0902s0F;
    }

    @Override // z.InterfaceC6581g0
    public void clearOnImageAvailableListener() {
        synchronized (this.f7542a) {
            this.f7545d.clearOnImageAvailableListener();
        }
    }

    @Override // z.InterfaceC6581g0
    public void close() {
        synchronized (this.f7542a) {
            try {
                Surface surface = this.f7546e;
                if (surface != null) {
                    surface.release();
                }
                this.f7545d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void e() {
        synchronized (this.f7542a) {
            try {
                this.f7544c = true;
                this.f7545d.clearOnImageAvailableListener();
                if (this.f7543b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6581g0
    public int getHeight() {
        int height;
        synchronized (this.f7542a) {
            height = this.f7545d.getHeight();
        }
        return height;
    }

    @Override // z.InterfaceC6581g0
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f7542a) {
            imageFormat = this.f7545d.getImageFormat();
        }
        return imageFormat;
    }

    @Override // z.InterfaceC6581g0
    public int getMaxImages() {
        int maxImages;
        synchronized (this.f7542a) {
            maxImages = this.f7545d.getMaxImages();
        }
        return maxImages;
    }

    @Override // z.InterfaceC6581g0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f7542a) {
            surface = this.f7545d.getSurface();
        }
        return surface;
    }

    @Override // z.InterfaceC6581g0
    public int getWidth() {
        int width;
        synchronized (this.f7542a) {
            width = this.f7545d.getWidth();
        }
        return width;
    }

    @Override // z.InterfaceC6581g0
    public void setOnImageAvailableListener(final InterfaceC6581g0.a aVar, Executor executor) {
        synchronized (this.f7542a) {
            this.f7545d.setOnImageAvailableListener(new InterfaceC6581g0.a() { // from class: androidx.camera.core.S0
                @Override // z.InterfaceC6581g0.a
                public final void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
                    this.f7517a.d(aVar, interfaceC6581g0);
                }
            }, executor);
        }
    }
}
