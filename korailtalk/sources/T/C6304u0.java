package t;

import android.hardware.camera2.CameraCaptureSession;
import z.AbstractC6586j;

/* renamed from: t.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6304u0 extends AbstractC6586j {

    /* renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f36782a;

    private C6304u0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f36782a = captureCallback;
    }

    static C6304u0 a(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C6304u0(captureCallback);
    }

    CameraCaptureSession.CaptureCallback b() {
        return this.f36782a;
    }
}
