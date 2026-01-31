package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import u.C6387j;

/* loaded from: classes.dex */
class z implements C6387j.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f37038a;

    /* renamed from: b, reason: collision with root package name */
    final Object f37039b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f37040a;

        a(Handler handler) {
            this.f37040a = handler;
        }
    }

    z(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f37038a = (CameraCaptureSession) Z.h.checkNotNull(cameraCaptureSession);
        this.f37039b = obj;
    }

    static C6387j.a a(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new z(cameraCaptureSession, new a(handler));
    }

    @Override // u.C6387j.a
    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.captureBurst(list, new C6387j.b(executor, captureCallback), ((a) this.f37039b).f37040a);
    }

    @Override // u.C6387j.a
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.capture(captureRequest, new C6387j.b(executor, captureCallback), ((a) this.f37039b).f37040a);
    }

    @Override // u.C6387j.a
    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.setRepeatingBurst(list, new C6387j.b(executor, captureCallback), ((a) this.f37039b).f37040a);
    }

    @Override // u.C6387j.a
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f37038a.setRepeatingRequest(captureRequest, new C6387j.b(executor, captureCallback), ((a) this.f37039b).f37040a);
    }

    @Override // u.C6387j.a
    public CameraCaptureSession unwrap() {
        return this.f37038a;
    }
}
