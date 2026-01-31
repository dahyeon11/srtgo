package androidx.camera.core;

/* renamed from: androidx.camera.core.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0907v extends Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f7863a;

    public C0907v(int i8) {
        this.f7863a = i8;
    }

    public int getReason() {
        return this.f7863a;
    }

    public C0907v(int i8, String str) {
        super(str);
        this.f7863a = i8;
    }

    public C0907v(int i8, String str, Throwable th) {
        super(str, th);
        this.f7863a = i8;
    }

    public C0907v(int i8, Throwable th) {
        super(th);
        this.f7863a = i8;
    }
}
