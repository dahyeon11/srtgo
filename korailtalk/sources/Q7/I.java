package Q7;

/* loaded from: classes3.dex */
public final class I extends J {
    private I(Long l8, Long l9) {
        super(l8, l9, null);
    }

    public static I of(long j8, long j9) {
        return of(Long.valueOf(j8), Long.valueOf(j9));
    }

    public static I of(Long l8, Long l9) {
        return new I(l8, l9);
    }
}
