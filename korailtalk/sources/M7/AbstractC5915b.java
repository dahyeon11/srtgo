package m7;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5915b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f34125a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f34126b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; i8++) {
            threadLocalArr[i8] = new ThreadLocal();
        }
        f34126b = threadLocalArr;
    }

    private static final DecimalFormat a(int i8) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i8 > 0) {
            decimalFormat.setMinimumFractionDigits(i8);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final String formatToExactDecimals(double d9, int i8) {
        DecimalFormat decimalFormatA;
        ThreadLocal[] threadLocalArr = f34126b;
        if (i8 < threadLocalArr.length) {
            ThreadLocal threadLocal = threadLocalArr[i8];
            Object objA = threadLocal.get();
            if (objA == null) {
                objA = a(i8);
                threadLocal.set(objA);
            } else {
                Intrinsics.checkNotNull(objA);
            }
            decimalFormatA = (DecimalFormat) objA;
        } else {
            decimalFormatA = a(i8);
        }
        String str = decimalFormatA.format(d9);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String formatUpToDecimals(double d9, int i8) {
        DecimalFormat decimalFormatA = a(0);
        decimalFormatA.setMaximumFractionDigits(i8);
        String str = decimalFormatA.format(d9);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final boolean getDurationAssertionsEnabled() {
        return f34125a;
    }
}
