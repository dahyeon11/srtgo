package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import z.InterfaceC6563L;
import z.InterfaceC6579f0;
import z.InterfaceC6581g0;

/* loaded from: classes.dex */
class G implements InterfaceC6563L {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6563L f7415a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6563L f7416b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f7417c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7418d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6581g0 f7419e = null;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0897p0 f7420f = null;

    G(InterfaceC6563L interfaceC6563L, int i8, InterfaceC6563L interfaceC6563L2, Executor executor) {
        this.f7415a = interfaceC6563L;
        this.f7416b = interfaceC6563L2;
        this.f7417c = executor;
        this.f7418d = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(InterfaceC6581g0 interfaceC6581g0) {
        final InterfaceC0902s0 interfaceC0902s0AcquireNextImage = interfaceC6581g0.acquireNextImage();
        try {
            this.f7417c.execute(new Runnable() { // from class: androidx.camera.core.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7409a.d(interfaceC0902s0AcquireNextImage);
                }
            });
        } catch (RejectedExecutionException unused) {
            B0.e("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
            interfaceC0902s0AcquireNextImage.close();
        }
    }

    void c() {
        InterfaceC6581g0 interfaceC6581g0 = this.f7419e;
        if (interfaceC6581g0 != null) {
            interfaceC6581g0.clearOnImageAvailableListener();
            this.f7419e.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(InterfaceC0902s0 interfaceC0902s0) {
        Size size = new Size(interfaceC0902s0.getWidth(), interfaceC0902s0.getHeight());
        Z.h.checkNotNull(this.f7420f);
        String next = this.f7420f.getTagBundle().listKeys().iterator().next();
        Integer num = (Integer) this.f7420f.getTagBundle().getTag(next);
        num.intValue();
        V0 v02 = new V0(interfaceC0902s0, size, this.f7420f);
        this.f7420f = null;
        W0 w02 = new W0(Collections.singletonList(num), next);
        w02.a(v02);
        this.f7416b.process(w02);
    }

    @Override // z.InterfaceC6563L
    public void onOutputSurface(Surface surface, int i8) {
        this.f7416b.onOutputSurface(surface, i8);
    }

    @Override // z.InterfaceC6563L
    public void onResolutionUpdate(Size size) {
        C0872d c0872d = new C0872d(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f7418d));
        this.f7419e = c0872d;
        this.f7415a.onOutputSurface(c0872d.getSurface(), 35);
        this.f7415a.onResolutionUpdate(size);
        this.f7416b.onResolutionUpdate(size);
        this.f7419e.setOnImageAvailableListener(new InterfaceC6581g0.a() { // from class: androidx.camera.core.E
            @Override // z.InterfaceC6581g0.a
            public final void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
                this.f7395a.e(interfaceC6581g0);
            }
        }, A.a.directExecutor());
    }

    @Override // z.InterfaceC6563L
    public void process(InterfaceC6579f0 interfaceC6579f0) {
        com.google.common.util.concurrent.C imageProxy = interfaceC6579f0.getImageProxy(interfaceC6579f0.getCaptureIds().get(0).intValue());
        Z.h.checkArgument(imageProxy.isDone());
        try {
            this.f7420f = ((InterfaceC0902s0) imageProxy.get()).getImageInfo();
            this.f7415a.process(interfaceC6579f0);
        } catch (InterruptedException | ExecutionException unused) {
            throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
        }
    }
}
