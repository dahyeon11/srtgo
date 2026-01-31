package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;
import z.InterfaceC6581g0;

/* renamed from: androidx.camera.core.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0872d implements InterfaceC6581g0 {

    /* renamed from: a, reason: collision with root package name */
    private final ImageReader f7597a;

    C0872d(ImageReader imageReader) {
        this.f7597a = imageReader;
    }

    private boolean c(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(InterfaceC6581g0.a aVar) {
        aVar.onImageAvailable(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Executor executor, final InterfaceC6581g0.a aVar, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f7591a.d(aVar);
            }
        });
    }

    @Override // z.InterfaceC6581g0
    public synchronized InterfaceC0902s0 acquireLatestImage() {
        Image imageAcquireLatestImage;
        try {
            imageAcquireLatestImage = this.f7597a.acquireLatestImage();
        } catch (RuntimeException e8) {
            if (!c(e8)) {
                throw e8;
            }
            imageAcquireLatestImage = null;
        }
        if (imageAcquireLatestImage == null) {
            return null;
        }
        return new C0866a(imageAcquireLatestImage);
    }

    @Override // z.InterfaceC6581g0
    public synchronized InterfaceC0902s0 acquireNextImage() {
        Image imageAcquireNextImage;
        try {
            imageAcquireNextImage = this.f7597a.acquireNextImage();
        } catch (RuntimeException e8) {
            if (!c(e8)) {
                throw e8;
            }
            imageAcquireNextImage = null;
        }
        if (imageAcquireNextImage == null) {
            return null;
        }
        return new C0866a(imageAcquireNextImage);
    }

    @Override // z.InterfaceC6581g0
    public synchronized void clearOnImageAvailableListener() {
        this.f7597a.setOnImageAvailableListener(null, null);
    }

    @Override // z.InterfaceC6581g0
    public synchronized void close() {
        this.f7597a.close();
    }

    @Override // z.InterfaceC6581g0
    public synchronized int getHeight() {
        return this.f7597a.getHeight();
    }

    @Override // z.InterfaceC6581g0
    public synchronized int getImageFormat() {
        return this.f7597a.getImageFormat();
    }

    @Override // z.InterfaceC6581g0
    public synchronized int getMaxImages() {
        return this.f7597a.getMaxImages();
    }

    @Override // z.InterfaceC6581g0
    public synchronized Surface getSurface() {
        return this.f7597a.getSurface();
    }

    @Override // z.InterfaceC6581g0
    public synchronized int getWidth() {
        return this.f7597a.getWidth();
    }

    @Override // z.InterfaceC6581g0
    public synchronized void setOnImageAvailableListener(final InterfaceC6581g0.a aVar, final Executor executor) {
        this.f7597a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                this.f7586a.e(executor, aVar, imageReader);
            }
        }, androidx.camera.core.impl.utils.l.getInstance());
    }
}
