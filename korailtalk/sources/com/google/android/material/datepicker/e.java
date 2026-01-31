package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
abstract class e {
    static String a(long j8) {
        return b(j8, Locale.getDefault());
    }

    static String b(long j8, Locale locale) {
        return s.b(locale).format(new Date(j8));
    }

    static String c(Context context, long j8) {
        return DateUtils.formatDateTime(context, j8 - TimeZone.getDefault().getOffset(j8), 36);
    }

    static String d(long j8) {
        return e(j8, Locale.getDefault());
    }

    static String e(long j8, Locale locale) {
        return s.k(locale).format(new Date(j8));
    }
}
