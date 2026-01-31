package com.google.gson.internal;

import Q7.X;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class j {
    private static String a(int i8) {
        if (i8 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i8 == 1) {
            return "MMMM d, y";
        }
        if (i8 == 2) {
            return "MMM d, y";
        }
        if (i8 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i8);
    }

    private static String b(int i8) {
        if (i8 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i8 == 1) {
            return "MMMM d, yyyy";
        }
        if (i8 == 2) {
            return "MMM d, yyyy";
        }
        if (i8 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i8);
    }

    private static String c(int i8) {
        if (i8 == 0 || i8 == 1) {
            return "h:mm:ss a z";
        }
        if (i8 == 2) {
            return "h:mm:ss a";
        }
        if (i8 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i8);
    }

    public static DateFormat getUSDateFormat(int i8) {
        return new SimpleDateFormat(a(i8), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i8, int i9) {
        return new SimpleDateFormat(b(i8) + X.SPACE + c(i9), Locale.US);
    }
}
