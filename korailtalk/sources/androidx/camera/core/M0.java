package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import z.AbstractC6586j;
import z.InterfaceC6561J;
import z.InterfaceC6563L;
import z.InterfaceC6564M;
import z.InterfaceC6581g0;

/* loaded from: classes.dex */
class M0 implements InterfaceC6581g0 {

    /* renamed from: g, reason: collision with root package name */
    final E0 f7453g;

    /* renamed from: h, reason: collision with root package name */
    final InterfaceC6581g0 f7454h;

    /* renamed from: i, reason: collision with root package name */
    InterfaceC6581g0.a f7455i;

    /* renamed from: j, reason: collision with root package name */
    Executor f7456j;

    /* renamed from: k, reason: collision with root package name */
    c.a f7457k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.common.util.concurrent.C f7458l;

    /* renamed from: m, reason: collision with root package name */
    final Executor f7459m;

    /* renamed from: n, reason: collision with root package name */
    final InterfaceC6563L f7460n;

    /* renamed from: a, reason: collision with root package name */
    final Object f7447a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6581g0.a f7448b = new a();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6581g0.a f7449c = new b();

    /* renamed from: d, reason: collision with root package name */
    private B.c f7450d = new c();

    /* renamed from: e, reason: collision with root package name */
    boolean f7451e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f7452f = false;

    /* renamed from: o, reason: collision with root package name */
    private String f7461o = new String();

    /* renamed from: p, reason: collision with root package name */
    W0 f7462p = new W0(Collections.emptyList(), this.f7461o);

    /* renamed from: q, reason: collision with root package name */
    private final List f7463q = new ArrayList();

    class a implements InterfaceC6581g0.a {
        a() {
        }

        @Override // z.InterfaceC6581g0.a
        public void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
            M0.this.d(interfaceC6581g0);
        }
    }

    class b implements InterfaceC6581g0.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(InterfaceC6581g0.a aVar) {
            aVar.onImageAvailable(M0.this);
        }

        @Override // z.InterfaceC6581g0.a
        public void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
            final InterfaceC6581g0.a aVar;
            Executor executor;
            synchronized (M0.this.f7447a) {
                M0 m02 = M0.this;
                aVar = m02.f7455i;
                executor = m02.f7456j;
                m02.f7462p.c();
                M0.this.f();
            }
            if (aVar != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.N0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7474a.b(aVar);
                        }
                    });
                } else {
                    aVar.onImageAvailable(M0.this);
                }
            }
        }
    }

    class c implements B.c {
        c() {
        }

        @Override // B.c
        public void onFailure(Throwable th) {
        }

        @Override // B.c
        public void onSuccess(List<InterfaceC0902s0> list) {
            synchronized (M0.this.f7447a) {
                try {
                    M0 m02 = M0.this;
                    if (m02.f7451e) {
                        return;
                    }
                    m02.f7452f = true;
                    m02.f7460n.process(m02.f7462p);
                    synchronized (M0.this.f7447a) {
                        try {
                            M0 m03 = M0.this;
                            m03.f7452f = false;
                            if (m03.f7451e) {
                                m03.f7453g.close();
                                M0.this.f7462p.b();
                                M0.this.f7454h.close();
                                c.a aVar = M0.this.f7457k;
                                if (aVar != null) {
                                    aVar.set(null);
                                }
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        }
    }

    M0(d dVar) {
        if (dVar.f7467a.getMaxImages() < dVar.f7468b.getCaptureStages().size()) {
            throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
        }
        E0 e02 = dVar.f7467a;
        this.f7453g = e02;
        int width = e02.getWidth();
        int height = e02.getHeight();
        int i8 = dVar.f7470d;
        if (i8 == 256) {
            width = ((int) (width * height * 1.5f)) + 64000;
            height = 1;
        }
        C0872d c0872d = new C0872d(ImageReader.newInstance(width, height, i8, e02.getMaxImages()));
        this.f7454h = c0872d;
        this.f7459m = dVar.f7471e;
        InterfaceC6563L interfaceC6563L = dVar.f7469c;
        this.f7460n = interfaceC6563L;
        interfaceC6563L.onOutputSurface(c0872d.getSurface(), dVar.f7470d);
        interfaceC6563L.onResolutionUpdate(new Size(e02.getWidth(), e02.getHeight()));
        setCaptureBundle(dVar.f7468b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object e(c.a aVar) {
        synchronized (this.f7447a) {
            this.f7457k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    @Override // z.InterfaceC6581g0
    public InterfaceC0902s0 acquireLatestImage() {
        InterfaceC0902s0 interfaceC0902s0AcquireLatestImage;
        synchronized (this.f7447a) {
            interfaceC0902s0AcquireLatestImage = this.f7454h.acquireLatestImage();
        }
        return interfaceC0902s0AcquireLatestImage;
    }

    @Override // z.InterfaceC6581g0
    public InterfaceC0902s0 acquireNextImage() {
        InterfaceC0902s0 interfaceC0902s0AcquireNextImage;
        synchronized (this.f7447a) {
            interfaceC0902s0AcquireNextImage = this.f7454h.acquireNextImage();
        }
        return interfaceC0902s0AcquireNextImage;
    }

    AbstractC6586j b() {
        AbstractC6586j abstractC6586jF;
        synchronized (this.f7447a) {
            abstractC6586jF = this.f7453g.f();
        }
        return abstractC6586jF;
    }

    com.google.common.util.concurrent.C c() {
        com.google.common.util.concurrent.C cNonCancellationPropagating;
        synchronized (this.f7447a) {
            try {
                if (!this.f7451e || this.f7452f) {
                    if (this.f7458l == null) {
                        this.f7458l = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.L0
                            @Override // androidx.concurrent.futures.c.InterfaceC0123c
                            public final Object attachCompleter(c.a aVar) {
                                return this.f7445a.e(aVar);
                            }
                        });
                    }
                    cNonCancellationPropagating = B.f.nonCancellationPropagating(this.f7458l);
                } else {
                    cNonCancellationPropagating = B.f.immediateFuture(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cNonCancellationPropagating;
    }

    @Override // z.InterfaceC6581g0
    public void clearOnImageAvailableListener() {
        synchronized (this.f7447a) {
            try {
                this.f7455i = null;
                this.f7456j = null;
                this.f7453g.clearOnImageAvailableListener();
                this.f7454h.clearOnImageAvailableListener();
                if (!this.f7452f) {
                    this.f7462p.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6581g0
    public void close() {
        synchronized (this.f7447a) {
            try {
                if (this.f7451e) {
                    return;
                }
                this.f7454h.clearOnImageAvailableListener();
                if (!this.f7452f) {
                    this.f7453g.close();
                    this.f7462p.b();
                    this.f7454h.close();
                    c.a aVar = this.f7457k;
                    if (aVar != null) {
                        aVar.set(null);
                    }
                }
                this.f7451e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(InterfaceC6581g0 interfaceC6581g0) {
        synchronized (this.f7447a) {
            if (this.f7451e) {
                return;
            }
            try {
                InterfaceC0902s0 interfaceC0902s0AcquireNextImage = interfaceC6581g0.acquireNextImage();
                if (interfaceC0902s0AcquireNextImage != null) {
                    Integer num = (Integer) interfaceC0902s0AcquireNextImage.getImageInfo().getTagBundle().getTag(this.f7461o);
                    if (this.f7463q.contains(num)) {
                        this.f7462p.a(interfaceC0902s0AcquireNextImage);
                    } else {
                        B0.w("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                        interfaceC0902s0AcquireNextImage.close();
                    }
                }
            } catch (IllegalStateException e8) {
                B0.e("ProcessingImageReader", "Failed to acquire latest image.", e8);
            }
        }
    }

    void f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7463q.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f7462p.getImageProxy(((Integer) it.next()).intValue()));
        }
        B.f.addCallback(B.f.allAsList(arrayList), this.f7450d, this.f7459m);
    }

    @Override // z.InterfaceC6581g0
    public int getHeight() {
        int height;
        synchronized (this.f7447a) {
            height = this.f7453g.getHeight();
        }
        return height;
    }

    @Override // z.InterfaceC6581g0
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f7447a) {
            imageFormat = this.f7454h.getImageFormat();
        }
        return imageFormat;
    }

    @Override // z.InterfaceC6581g0
    public int getMaxImages() {
        int maxImages;
        synchronized (this.f7447a) {
            maxImages = this.f7453g.getMaxImages();
        }
        return maxImages;
    }

    @Override // z.InterfaceC6581g0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f7447a) {
            surface = this.f7453g.getSurface();
        }
        return surface;
    }

    public String getTagBundleKey() {
        return this.f7461o;
    }

    @Override // z.InterfaceC6581g0
    public int getWidth() {
        int width;
        synchronized (this.f7447a) {
            width = this.f7453g.getWidth();
        }
        return width;
    }

    public void setCaptureBundle(InterfaceC6561J interfaceC6561J) {
        synchronized (this.f7447a) {
            try {
                if (interfaceC6561J.getCaptureStages() != null) {
                    if (this.f7453g.getMaxImages() < interfaceC6561J.getCaptureStages().size()) {
                        throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                    }
                    this.f7463q.clear();
                    for (InterfaceC6564M interfaceC6564M : interfaceC6561J.getCaptureStages()) {
                        if (interfaceC6564M != null) {
                            this.f7463q.add(Integer.valueOf(interfaceC6564M.getId()));
                        }
                    }
                }
                String string = Integer.toString(interfaceC6561J.hashCode());
                this.f7461o = string;
                this.f7462p = new W0(this.f7463q, string);
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6581g0
    public void setOnImageAvailableListener(InterfaceC6581g0.a aVar, Executor executor) {
        synchronized (this.f7447a) {
            this.f7455i = (InterfaceC6581g0.a) Z.h.checkNotNull(aVar);
            this.f7456j = (Executor) Z.h.checkNotNull(executor);
            this.f7453g.setOnImageAvailableListener(this.f7448b, executor);
            this.f7454h.setOnImageAvailableListener(this.f7449c, executor);
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        protected final E0 f7467a;

        /* renamed from: b, reason: collision with root package name */
        protected final InterfaceC6561J f7468b;

        /* renamed from: c, reason: collision with root package name */
        protected final InterfaceC6563L f7469c;

        /* renamed from: d, reason: collision with root package name */
        protected int f7470d;

        /* renamed from: e, reason: collision with root package name */
        protected Executor f7471e;

        d(E0 e02, InterfaceC6561J interfaceC6561J, InterfaceC6563L interfaceC6563L) {
            this.f7471e = Executors.newSingleThreadExecutor();
            this.f7467a = e02;
            this.f7468b = interfaceC6561J;
            this.f7469c = interfaceC6563L;
            this.f7470d = e02.getImageFormat();
        }

        M0 a() {
            return new M0(this);
        }

        d b(int i8) {
            this.f7470d = i8;
            return this;
        }

        d c(Executor executor) {
            this.f7471e = executor;
            return this;
        }

        d(int i8, int i9, int i10, int i11, InterfaceC6561J interfaceC6561J, InterfaceC6563L interfaceC6563L) {
            this(new E0(i8, i9, i10, i11), interfaceC6561J, interfaceC6563L);
        }
    }
}
