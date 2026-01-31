package p1;

/* loaded from: classes.dex */
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static g fatalError() {
        return new C6050b(a.FATAL_ERROR, -1L);
    }

    public static g ok(long j8) {
        return new C6050b(a.OK, j8);
    }

    public static g transientError() {
        return new C6050b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long getNextRequestWaitMillis();

    public abstract a getStatus();
}
