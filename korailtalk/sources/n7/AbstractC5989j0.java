package n7;

/* renamed from: n7.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5989j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final s7.K f34340a = new s7.K("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final s7.K f34341b = new s7.K("CLOSED_EMPTY");

    public static final long delayNanosToMillis(long j8) {
        return j8 / 1000000;
    }

    public static final long delayToNanos(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        if (j8 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j8;
    }
}
