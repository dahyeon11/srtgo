package h7;

import j7.l;
import j7.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class g {
    public static final f Random(int i8) {
        return new h(i8, i8 >> 31);
    }

    public static final String boundsErrorMessage(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void checkRangeBounds(int i8, int i9) {
        if (i9 <= i8) {
            throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(i8), Integer.valueOf(i9)).toString());
        }
    }

    public static final int fastLog2(int i8) {
        return 31 - Integer.numberOfLeadingZeros(i8);
    }

    public static final int nextInt(f fVar, l range) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Integer.MAX_VALUE ? fVar.nextInt(range.getFirst(), range.getLast() + 1) : range.getFirst() > Integer.MIN_VALUE ? fVar.nextInt(range.getFirst() - 1, range.getLast()) + 1 : fVar.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final long nextLong(f fVar, o range) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Long.MAX_VALUE ? fVar.nextLong(range.getFirst(), range.getLast() + 1) : range.getFirst() > Long.MIN_VALUE ? fVar.nextLong(range.getFirst() - 1, range.getLast()) + 1 : fVar.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int takeUpperBits(int i8, int i9) {
        return (i8 >>> (32 - i9)) & ((-i9) >> 31);
    }

    public static final f Random(long j8) {
        return new h((int) j8, (int) (j8 >> 32));
    }

    public static final void checkRangeBounds(long j8, long j9) {
        if (j9 <= j8) {
            throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(j8), Long.valueOf(j9)).toString());
        }
    }

    public static final void checkRangeBounds(double d9, double d10) {
        if (d10 <= d9) {
            throw new IllegalArgumentException(boundsErrorMessage(Double.valueOf(d9), Double.valueOf(d10)).toString());
        }
    }
}
