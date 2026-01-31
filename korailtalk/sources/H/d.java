package H;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.InterfaceC0897p0;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import s.AbstractC6202a;
import z.InterfaceC6564M;
import z.InterfaceC6573c0;
import z.r;

/* loaded from: classes.dex */
public final class d implements InterfaceC6573c0, i {

    /* renamed from: a, reason: collision with root package name */
    private final PreviewExtenderImpl f1517a;

    /* renamed from: b, reason: collision with root package name */
    private final RequestUpdateProcessorImpl f1518b;

    /* renamed from: c, reason: collision with root package name */
    private h f1519c = new h();

    public d(PreviewExtenderImpl previewExtenderImpl) {
        Z.h.checkArgument(previewExtenderImpl.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY, "AdaptingRequestUpdateProcess can only adapt extender with PROCESSOR_TYPE_REQUEST_UPDATE_ONLY ProcessorType.");
        this.f1517a = previewExtenderImpl;
        this.f1518b = previewExtenderImpl.getProcessor();
    }

    @Override // H.i
    public void close() {
        this.f1519c.b();
    }

    @Override // z.InterfaceC6573c0
    public InterfaceC6564M getCaptureStage() {
        if (!this.f1519c.c()) {
            return null;
        }
        try {
            return new b(this.f1517a.getCaptureStage());
        } finally {
            this.f1519c.a();
        }
    }

    @Override // z.InterfaceC6573c0
    public boolean process(InterfaceC0897p0 interfaceC0897p0) {
        boolean z8 = false;
        if (!this.f1519c.c()) {
            return false;
        }
        try {
            CaptureResult captureResult = AbstractC6202a.getCaptureResult(r.retrieveCameraCaptureResult(interfaceC0897p0));
            if (captureResult instanceof TotalCaptureResult) {
                if (this.f1518b.process((TotalCaptureResult) captureResult) != null) {
                    z8 = true;
                }
            }
            return z8;
        } finally {
            this.f1519c.a();
        }
    }
}
