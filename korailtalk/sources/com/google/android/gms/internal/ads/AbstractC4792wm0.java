package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4792wm0 {
    static long a(String str, long j8) {
        if (j8 >= 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be >= 0");
    }

    static void b(boolean z8) {
        if (!z8) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
