package u;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6386i extends Exception {
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int MAX_CAMERAS_IN_USE = 5;

    /* renamed from: a, reason: collision with root package name */
    private final int f36987a;

    /* renamed from: b, reason: collision with root package name */
    private final CameraAccessException f36988b;

    /* renamed from: c, reason: collision with root package name */
    static final Set f36985c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;

    /* renamed from: d, reason: collision with root package name */
    static final Set f36986d = Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(CAMERA_UNAVAILABLE_DO_NOT_DISTURB), Integer.valueOf(CAMERA_CHARACTERISTICS_CREATION_ERROR))));

    public C6386i(int i8) {
        super(b(i8));
        this.f36987a = i8;
        this.f36988b = f36985c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8) : null;
    }

    private static String a(int i8, String str) {
        return String.format("%s (%d): %s", c(i8), Integer.valueOf(i8), str);
    }

    private static String b(int i8) {
        if (i8 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i8 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i8 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i8 == 4) {
            return "The camera device is in use already";
        }
        if (i8 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i8 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i8 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    private static String c(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? i8 != 1000 ? i8 != 10001 ? i8 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static C6386i toCameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C6386i(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int getReason() {
        return this.f36987a;
    }

    public CameraAccessException toCameraAccessException() {
        return this.f36988b;
    }

    public C6386i(int i8, String str) {
        super(a(i8, str));
        this.f36987a = i8;
        this.f36988b = f36985c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8, str) : null;
    }

    public C6386i(int i8, String str, Throwable th) {
        super(a(i8, str), th);
        this.f36987a = i8;
        this.f36988b = f36985c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8, str, th) : null;
    }

    public C6386i(int i8, Throwable th) {
        super(b(i8), th);
        this.f36987a = i8;
        this.f36988b = f36985c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8, null, th) : null;
    }

    private C6386i(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f36987a = cameraAccessException.getReason();
        this.f36988b = cameraAccessException;
    }
}
