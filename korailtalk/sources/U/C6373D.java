package u;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: u.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6373D {
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;

    /* renamed from: a, reason: collision with root package name */
    private final a f36955a;

    /* renamed from: u.D$a */
    interface a {
        void createCaptureSession(v.g gVar);

        CameraDevice unwrap();
    }

    /* renamed from: u.D$b */
    static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraDevice.StateCallback f36956a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f36957b;

        b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f36957b = executor;
            this.f36956a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(CameraDevice cameraDevice) {
            this.f36956a.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(CameraDevice cameraDevice) {
            this.f36956a.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(CameraDevice cameraDevice, int i8) {
            this.f36956a.onError(cameraDevice, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(CameraDevice cameraDevice) {
            this.f36956a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f36957b.execute(new Runnable() { // from class: u.E
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36958a.e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f36957b.execute(new Runnable() { // from class: u.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36963a.f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i8) {
            this.f36957b.execute(new Runnable() { // from class: u.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36960a.g(cameraDevice, i8);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f36957b.execute(new Runnable() { // from class: u.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36965a.h(cameraDevice);
                }
            });
        }
    }

    private C6373D(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36955a = new K(cameraDevice);
        } else {
            this.f36955a = J.e(cameraDevice, handler);
        }
    }

    public static C6373D toCameraDeviceCompat(CameraDevice cameraDevice) {
        return toCameraDeviceCompat(cameraDevice, androidx.camera.core.impl.utils.l.getInstance());
    }

    public void createCaptureSession(v.g gVar) {
        this.f36955a.createCaptureSession(gVar);
    }

    public CameraDevice toCameraDevice() {
        return this.f36955a.unwrap();
    }

    public static C6373D toCameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        return new C6373D(cameraDevice, handler);
    }
}
