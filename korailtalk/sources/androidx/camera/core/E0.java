package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import z.AbstractC6586j;
import z.InterfaceC6581g0;
import z.InterfaceC6600q;

/* loaded from: classes.dex */
class E0 implements InterfaceC6581g0, L.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7396a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC6586j f7397b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6581g0.a f7398c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7399d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6581g0 f7400e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC6581g0.a f7401f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f7402g;

    /* renamed from: h, reason: collision with root package name */
    private final LongSparseArray f7403h;

    /* renamed from: i, reason: collision with root package name */
    private final LongSparseArray f7404i;

    /* renamed from: j, reason: collision with root package name */
    private int f7405j;

    /* renamed from: k, reason: collision with root package name */
    private final List f7406k;

    /* renamed from: l, reason: collision with root package name */
    private final List f7407l;

    class a extends AbstractC6586j {
        a() {
        }

        @Override // z.AbstractC6586j
        public void onCaptureCompleted(InterfaceC6600q interfaceC6600q) {
            super.onCaptureCompleted(interfaceC6600q);
            E0.this.l(interfaceC6600q);
        }
    }

    E0(int i8, int i9, int i10, int i11) {
        this(c(i8, i9, i10, i11));
    }

    private static InterfaceC6581g0 c(int i8, int i9, int i10, int i11) {
        return new C0872d(ImageReader.newInstance(i8, i9, i10, i11));
    }

    private void d(InterfaceC0902s0 interfaceC0902s0) {
        synchronized (this.f7396a) {
            try {
                int iIndexOf = this.f7406k.indexOf(interfaceC0902s0);
                if (iIndexOf >= 0) {
                    this.f7406k.remove(iIndexOf);
                    int i8 = this.f7405j;
                    if (iIndexOf <= i8) {
                        this.f7405j = i8 - 1;
                    }
                }
                this.f7407l.remove(interfaceC0902s0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e(V0 v02) {
        final InterfaceC6581g0.a aVar;
        Executor executor;
        synchronized (this.f7396a) {
            try {
                if (this.f7406k.size() < getMaxImages()) {
                    v02.a(this);
                    this.f7406k.add(v02);
                    aVar = this.f7401f;
                    executor = this.f7402g;
                } else {
                    B0.d("TAG", "Maximum image number reached.");
                    v02.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.D0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7393a.h(aVar);
                    }
                });
            } else {
                aVar.onImageAvailable(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(InterfaceC6581g0.a aVar) {
        aVar.onImageAvailable(this);
    }

    private void j() {
        synchronized (this.f7396a) {
            try {
                for (int size = this.f7403h.size() - 1; size >= 0; size--) {
                    InterfaceC0897p0 interfaceC0897p0 = (InterfaceC0897p0) this.f7403h.valueAt(size);
                    long timestamp = interfaceC0897p0.getTimestamp();
                    InterfaceC0902s0 interfaceC0902s0 = (InterfaceC0902s0) this.f7404i.get(timestamp);
                    if (interfaceC0902s0 != null) {
                        this.f7404i.remove(timestamp);
                        this.f7403h.removeAt(size);
                        e(new V0(interfaceC0902s0, interfaceC0897p0));
                    }
                }
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        synchronized (this.f7396a) {
            try {
                if (this.f7404i.size() != 0 && this.f7403h.size() != 0) {
                    long jKeyAt = this.f7404i.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f7403h.keyAt(0);
                    Z.h.checkArgument(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f7404i.size() - 1; size >= 0; size--) {
                            if (this.f7404i.keyAt(size) < jKeyAt2) {
                                ((InterfaceC0902s0) this.f7404i.valueAt(size)).close();
                                this.f7404i.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f7403h.size() - 1; size2 >= 0; size2--) {
                            if (this.f7403h.keyAt(size2) < jKeyAt) {
                                this.f7403h.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // z.InterfaceC6581g0
    public InterfaceC0902s0 acquireLatestImage() {
        synchronized (this.f7396a) {
            try {
                if (this.f7406k.isEmpty()) {
                    return null;
                }
                if (this.f7405j >= this.f7406k.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < this.f7406k.size() - 1; i8++) {
                    if (!this.f7407l.contains(this.f7406k.get(i8))) {
                        arrayList.add((InterfaceC0902s0) this.f7406k.get(i8));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0902s0) it.next()).close();
                }
                int size = this.f7406k.size();
                List list = this.f7406k;
                this.f7405j = size;
                InterfaceC0902s0 interfaceC0902s0 = (InterfaceC0902s0) list.get(size - 1);
                this.f7407l.add(interfaceC0902s0);
                return interfaceC0902s0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6581g0
    public InterfaceC0902s0 acquireNextImage() {
        synchronized (this.f7396a) {
            try {
                if (this.f7406k.isEmpty()) {
                    return null;
                }
                if (this.f7405j >= this.f7406k.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List list = this.f7406k;
                int i8 = this.f7405j;
                this.f7405j = i8 + 1;
                InterfaceC0902s0 interfaceC0902s0 = (InterfaceC0902s0) list.get(i8);
                this.f7407l.add(interfaceC0902s0);
                return interfaceC0902s0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6581g0
    public void clearOnImageAvailableListener() {
        synchronized (this.f7396a) {
            this.f7401f = null;
            this.f7402g = null;
        }
    }

    @Override // z.InterfaceC6581g0
    public void close() {
        synchronized (this.f7396a) {
            try {
                if (this.f7399d) {
                    return;
                }
                Iterator it = new ArrayList(this.f7406k).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0902s0) it.next()).close();
                }
                this.f7406k.clear();
                this.f7400e.close();
                this.f7399d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    AbstractC6586j f() {
        return this.f7397b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void i(InterfaceC6581g0 interfaceC6581g0) {
        InterfaceC0902s0 interfaceC0902s0AcquireNextImage;
        synchronized (this.f7396a) {
            if (this.f7399d) {
                return;
            }
            int i8 = 0;
            do {
                try {
                    interfaceC0902s0AcquireNextImage = interfaceC6581g0.acquireNextImage();
                    if (interfaceC0902s0AcquireNextImage != null) {
                        i8++;
                        this.f7404i.put(interfaceC0902s0AcquireNextImage.getImageInfo().getTimestamp(), interfaceC0902s0AcquireNextImage);
                        j();
                    }
                } catch (IllegalStateException e8) {
                    B0.d("MetadataImageReader", "Failed to acquire next image.", e8);
                    interfaceC0902s0AcquireNextImage = null;
                }
                if (interfaceC0902s0AcquireNextImage == null) {
                    break;
                }
            } while (i8 < interfaceC6581g0.getMaxImages());
        }
    }

    @Override // z.InterfaceC6581g0
    public int getHeight() {
        int height;
        synchronized (this.f7396a) {
            height = this.f7400e.getHeight();
        }
        return height;
    }

    @Override // z.InterfaceC6581g0
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f7396a) {
            imageFormat = this.f7400e.getImageFormat();
        }
        return imageFormat;
    }

    @Override // z.InterfaceC6581g0
    public int getMaxImages() {
        int maxImages;
        synchronized (this.f7396a) {
            maxImages = this.f7400e.getMaxImages();
        }
        return maxImages;
    }

    @Override // z.InterfaceC6581g0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f7396a) {
            surface = this.f7400e.getSurface();
        }
        return surface;
    }

    @Override // z.InterfaceC6581g0
    public int getWidth() {
        int width;
        synchronized (this.f7396a) {
            width = this.f7400e.getWidth();
        }
        return width;
    }

    void l(InterfaceC6600q interfaceC6600q) {
        synchronized (this.f7396a) {
            try {
                if (this.f7399d) {
                    return;
                }
                this.f7403h.put(interfaceC6600q.getTimestamp(), new C.b(interfaceC6600q));
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.L.a
    public void onImageClose(InterfaceC0902s0 interfaceC0902s0) {
        synchronized (this.f7396a) {
            d(interfaceC0902s0);
        }
    }

    @Override // z.InterfaceC6581g0
    public void setOnImageAvailableListener(InterfaceC6581g0.a aVar, Executor executor) {
        synchronized (this.f7396a) {
            this.f7401f = (InterfaceC6581g0.a) Z.h.checkNotNull(aVar);
            this.f7402g = (Executor) Z.h.checkNotNull(executor);
            this.f7400e.setOnImageAvailableListener(this.f7398c, executor);
        }
    }

    E0(InterfaceC6581g0 interfaceC6581g0) {
        this.f7396a = new Object();
        this.f7397b = new a();
        this.f7398c = new InterfaceC6581g0.a() { // from class: androidx.camera.core.C0
            @Override // z.InterfaceC6581g0.a
            public final void onImageAvailable(InterfaceC6581g0 interfaceC6581g02) {
                this.f7391a.i(interfaceC6581g02);
            }
        };
        this.f7399d = false;
        this.f7403h = new LongSparseArray();
        this.f7404i = new LongSparseArray();
        this.f7407l = new ArrayList();
        this.f7400e = interfaceC6581g0;
        this.f7405j = 0;
        this.f7406k = new ArrayList(getMaxImages());
    }
}
