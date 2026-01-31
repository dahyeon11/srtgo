package androidx.camera.core;

/* renamed from: androidx.camera.core.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0905u {
    public static final int ERROR_CAMERA_DISABLED = 5;
    public static final int ERROR_CAMERA_FATAL_ERROR = 6;
    public static final int ERROR_CAMERA_IN_USE = 2;
    public static final int ERROR_DO_NOT_DISTURB_MODE_ENABLED = 7;
    public static final int ERROR_MAX_CAMERAS_IN_USE = 1;
    public static final int ERROR_OTHER_RECOVERABLE_ERROR = 3;
    public static final int ERROR_STREAM_CONFIG = 4;

    /* renamed from: androidx.camera.core.u$a */
    public enum a {
        RECOVERABLE,
        CRITICAL
    }

    /* renamed from: androidx.camera.core.u$b */
    public static abstract class b {
        public static b create(int i8) {
            return create(i8, null);
        }

        public abstract Throwable getCause();

        public abstract int getCode();

        public a getType() {
            int code = getCode();
            return (code == 2 || code == 1 || code == 3) ? a.RECOVERABLE : a.CRITICAL;
        }

        public static b create(int i8, Throwable th) {
            return new C0878g(i8, th);
        }
    }

    /* renamed from: androidx.camera.core.u$c */
    public enum c {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC0905u create(c cVar) {
        return create(cVar, null);
    }

    public abstract b getError();

    public abstract c getType();

    public static AbstractC0905u create(c cVar, b bVar) {
        return new C0876f(cVar, bVar);
    }
}
