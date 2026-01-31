package H;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.B0;
import androidx.camera.core.InterfaceC0902s0;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import com.google.common.util.concurrent.C;
import java.util.List;
import java.util.concurrent.ExecutionException;
import s.AbstractC6202a;
import z.InterfaceC6563L;
import z.InterfaceC6579f0;
import z.r;

/* loaded from: classes.dex */
public final class c implements InterfaceC6563L, i {

    /* renamed from: a, reason: collision with root package name */
    private final PreviewImageProcessorImpl f1515a;

    /* renamed from: b, reason: collision with root package name */
    private h f1516b = new h();

    public c(PreviewImageProcessorImpl previewImageProcessorImpl) {
        this.f1515a = previewImageProcessorImpl;
    }

    @Override // H.i
    public void close() {
        this.f1516b.b();
    }

    @Override // z.InterfaceC6563L
    public void onOutputSurface(Surface surface, int i8) {
        if (this.f1516b.c()) {
            try {
                this.f1515a.onOutputSurface(surface, i8);
                this.f1515a.onImageFormatUpdate(35);
            } finally {
                this.f1516b.a();
            }
        }
    }

    @Override // z.InterfaceC6563L
    public void onResolutionUpdate(Size size) {
        if (this.f1516b.c()) {
            try {
                this.f1515a.onResolutionUpdate(size);
            } finally {
                this.f1516b.a();
            }
        }
    }

    @Override // z.InterfaceC6563L
    public void process(InterfaceC6579f0 interfaceC6579f0) {
        List<Integer> captureIds = interfaceC6579f0.getCaptureIds();
        Z.h.checkArgument(captureIds.size() == 1, "Processing preview bundle must be 1, but found " + captureIds.size());
        C imageProxy = interfaceC6579f0.getImageProxy(captureIds.get(0).intValue());
        Z.h.checkArgument(imageProxy.isDone());
        try {
            InterfaceC0902s0 interfaceC0902s0 = (InterfaceC0902s0) imageProxy.get();
            Image image = interfaceC0902s0.getImage();
            CaptureResult captureResult = AbstractC6202a.getCaptureResult(r.retrieveCameraCaptureResult(interfaceC0902s0.getImageInfo()));
            TotalCaptureResult totalCaptureResult = captureResult instanceof TotalCaptureResult ? (TotalCaptureResult) captureResult : null;
            if (image != null && this.f1516b.c()) {
                try {
                    this.f1515a.process(image, totalCaptureResult);
                } finally {
                    this.f1516b.a();
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            B0.e("AdaptingPreviewProcesso", "Unable to retrieve ImageProxy from bundle");
        }
    }
}
