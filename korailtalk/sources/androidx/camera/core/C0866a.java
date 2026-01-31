package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0902s0;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0866a implements InterfaceC0902s0 {

    /* renamed from: a, reason: collision with root package name */
    private final Image f7579a;

    /* renamed from: b, reason: collision with root package name */
    private final C0118a[] f7580b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0897p0 f7581c;

    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    private static final class C0118a implements InterfaceC0902s0.a {

        /* renamed from: a, reason: collision with root package name */
        private final Image.Plane f7582a;

        C0118a(Image.Plane plane) {
            this.f7582a = plane;
        }

        @Override // androidx.camera.core.InterfaceC0902s0.a
        public synchronized ByteBuffer getBuffer() {
            return this.f7582a.getBuffer();
        }

        @Override // androidx.camera.core.InterfaceC0902s0.a
        public synchronized int getPixelStride() {
            return this.f7582a.getPixelStride();
        }

        @Override // androidx.camera.core.InterfaceC0902s0.a
        public synchronized int getRowStride() {
            return this.f7582a.getRowStride();
        }
    }

    C0866a(Image image) {
        this.f7579a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f7580b = new C0118a[planes.length];
            for (int i8 = 0; i8 < planes.length; i8++) {
                this.f7580b[i8] = new C0118a(planes[i8]);
            }
        } else {
            this.f7580b = new C0118a[0];
        }
        this.f7581c = AbstractC0916z0.create(z.J0.emptyBundle(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.InterfaceC0902s0, java.lang.AutoCloseable
    public synchronized void close() {
        this.f7579a.close();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized Rect getCropRect() {
        return this.f7579a.getCropRect();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized int getFormat() {
        return this.f7579a.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized int getHeight() {
        return this.f7579a.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized Image getImage() {
        return this.f7579a;
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public InterfaceC0897p0 getImageInfo() {
        return this.f7581c;
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized InterfaceC0902s0.a[] getPlanes() {
        return this.f7580b;
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized int getWidth() {
        return this.f7579a.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized void setCropRect(Rect rect) {
        this.f7579a.setCropRect(rect);
    }
}
