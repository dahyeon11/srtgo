package j7;

import Q7.C;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class t {
    public static final void checkStepIsPositive(boolean z8, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z8) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final <T extends Comparable<? super T>> g rangeTo(T t8, T that) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new i(t8, that);
    }

    public static final <T extends Comparable<? super T>> r rangeUntil(T t8, T that) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new h(t8, that);
    }

    public static final f rangeTo(double d9, double d10) {
        return new d(d9, d10);
    }

    public static final r rangeUntil(double d9, double d10) {
        return new p(d9, d10);
    }

    public static final f rangeTo(float f8, float f9) {
        return new e(f8, f9);
    }

    public static final r rangeUntil(float f8, float f9) {
        return new q(f8, f9);
    }
}
