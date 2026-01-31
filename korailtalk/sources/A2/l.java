package A2;

import m7.AbstractC5916c;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f64a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f65b = {1, 10, 100, 1000, 10000, 100000, AbstractC5916c.NANOS_IN_MILLIS, 10000000, 100000000, f1.j.SECOND_IN_NANOS};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f66c = {3, 31, Map.MapException.StatusCode.MAP_STREAM_ID_NOT_MATCH_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f67d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e, reason: collision with root package name */
    private static int[] f68e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int zza(int i8, int i9) {
        long j8 = i8 << 1;
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }
}
