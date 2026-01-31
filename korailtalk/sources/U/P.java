package u;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final b f36975a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f36976b = new ArrayMap(4);

    static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f36977a;

        /* renamed from: b, reason: collision with root package name */
        final CameraManager.AvailabilityCallback f36978b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f36979c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private boolean f36980d = false;

        a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f36977a = executor;
            this.f36978b = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            AbstractC6385h.onCameraAccessPrioritiesChanged(this.f36978b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(String str) {
            this.f36978b.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str) {
            this.f36978b.onCameraUnavailable(str);
        }

        void g() {
            synchronized (this.f36979c) {
                this.f36980d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f36979c) {
                try {
                    if (!this.f36980d) {
                        this.f36977a.execute(new Runnable() { // from class: u.N
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f36972a.d();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f36979c) {
                try {
                    if (!this.f36980d) {
                        this.f36977a.execute(new Runnable() { // from class: u.M
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f36970a.e(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f36979c) {
                try {
                    if (!this.f36980d) {
                        this.f36977a.execute(new Runnable() { // from class: u.O
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f36973a.f(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        static b from(Context context, Handler handler) {
            int i8 = Build.VERSION.SDK_INT;
            return i8 >= 29 ? new S(context) : i8 >= 28 ? Q.b(context) : T.a(context, handler);
        }

        CameraCharacteristics getCameraCharacteristics(String str);

        String[] getCameraIdList();

        CameraManager getCameraManager();

        void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private P(b bVar) {
        this.f36975a = bVar;
    }

    public static P from(Context context) {
        return from(context, androidx.camera.core.impl.utils.l.getInstance());
    }

    public C6372C getCameraCharacteristicsCompat(String str) {
        C6372C cameraCharacteristicsCompat;
        synchronized (this.f36976b) {
            cameraCharacteristicsCompat = (C6372C) this.f36976b.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = C6372C.toCameraCharacteristicsCompat(this.f36975a.getCameraCharacteristics(str));
                    this.f36976b.put(str, cameraCharacteristicsCompat);
                } catch (AssertionError e8) {
                    throw new C6386i(C6386i.CAMERA_CHARACTERISTICS_CREATION_ERROR, e8.getMessage(), e8);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    public String[] getCameraIdList() {
        return this.f36975a.getCameraIdList();
    }

    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f36975a.openCamera(str, executor, stateCallback);
    }

    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f36975a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f36975a.unregisterAvailabilityCallback(availabilityCallback);
    }

    public CameraManager unwrap() {
        return this.f36975a.getCameraManager();
    }

    public static P from(Context context, Handler handler) {
        return new P(b.from(context, handler));
    }

    public static P from(b bVar) {
        return new P(bVar);
    }
}
