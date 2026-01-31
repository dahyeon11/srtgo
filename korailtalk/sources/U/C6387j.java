package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6387j {

    /* renamed from: a, reason: collision with root package name */
    private final a f36989a;

    /* renamed from: u.j$a */
    interface a {
        int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        CameraCaptureSession unwrap();
    }

    /* renamed from: u.j$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f36990a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f36991b;

        b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f36991b = executor;
            this.f36990a = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j8) {
            AbstractC6380c.onCaptureBufferLost(this.f36990a, cameraCaptureSession, captureRequest, surface, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f36990a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f36990a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f36990a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession, int i8) {
            this.f36990a.onCaptureSequenceAborted(cameraCaptureSession, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession, int i8, long j8) {
            this.f36990a.onCaptureSequenceCompleted(cameraCaptureSession, i8, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j9) {
            this.f36990a.onCaptureStarted(cameraCaptureSession, captureRequest, j8, j9);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j8) {
            this.f36991b.execute(new Runnable() { // from class: u.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37015a.h(cameraCaptureSession, captureRequest, surface, j8);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f36991b.execute(new Runnable() { // from class: u.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36999a.i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f36991b.execute(new Runnable() { // from class: u.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37011a.j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f36991b.execute(new Runnable() { // from class: u.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37003a.k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i8) {
            this.f36991b.execute(new Runnable() { // from class: u.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37020a.l(cameraCaptureSession, i8);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i8, final long j8) {
            this.f36991b.execute(new Runnable() { // from class: u.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37007a.m(cameraCaptureSession, i8, j8);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j8, final long j9) {
            this.f36991b.execute(new Runnable() { // from class: u.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36994a.n(cameraCaptureSession, captureRequest, j8, j9);
                }
            });
        }
    }

    /* renamed from: u.j$c */
    static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f36992a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f36993b;

        c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f36993b = executor;
            this.f36992a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession) {
            this.f36992a.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession) {
            AbstractC6383f.onCaptureQueueEmpty(this.f36992a, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession) {
            this.f36992a.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession) {
            this.f36992a.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession) {
            this.f36992a.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession) {
            this.f36992a.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            AbstractC6379b.onSurfacePrepared(this.f36992a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f36993b.execute(new Runnable() { // from class: u.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37023a.h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f36993b.execute(new Runnable() { // from class: u.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37030a.i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f36993b.execute(new Runnable() { // from class: u.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37025a.j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f36993b.execute(new Runnable() { // from class: u.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37036a.k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f36993b.execute(new Runnable() { // from class: u.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37032a.l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f36993b.execute(new Runnable() { // from class: u.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37034a.m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f36993b.execute(new Runnable() { // from class: u.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37027a.n(cameraCaptureSession, surface);
                }
            });
        }
    }

    private C6387j(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36989a = new y(cameraCaptureSession);
        } else {
            this.f36989a = z.a(cameraCaptureSession, handler);
        }
    }

    public static C6387j toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        return toCameraCaptureSessionCompat(cameraCaptureSession, androidx.camera.core.impl.utils.l.getInstance());
    }

    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36989a.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36989a.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36989a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36989a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession toCameraCaptureSession() {
        return this.f36989a.unwrap();
    }

    public static C6387j toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C6387j(cameraCaptureSession, handler);
    }
}
