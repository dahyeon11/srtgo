package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import z.AbstractC6586j;
import z.C6588k;

/* renamed from: t.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6302t0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6586j f36772a;

    C6302t0(AbstractC6586j abstractC6586j) {
        if (abstractC6586j == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f36772a = abstractC6586j;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        z.J0 j0EmptyBundle;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            Z.h.checkArgument(tag instanceof z.J0, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            j0EmptyBundle = (z.J0) tag;
        } else {
            j0EmptyBundle = z.J0.emptyBundle();
        }
        this.f36772a.onCaptureCompleted(new C6278h(j0EmptyBundle, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f36772a.onCaptureFailed(new C6588k(C6588k.a.ERROR));
    }
}
