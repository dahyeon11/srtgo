package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.oE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3824oE0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f21439a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21440b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str, String str2) throws NumberFormatException {
        long j8 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j8 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AbstractC2834fc0.zzc("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j8;
        }
        Matcher matcher = f21439a.matcher(str2);
        if (!matcher.matches()) {
            return j8;
        }
        try {
            String strGroup = matcher.group(2);
            if (strGroup == null) {
                throw null;
            }
            long j9 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            if (strGroup2 == null) {
                throw null;
            }
            long j10 = (j9 - Long.parseLong(strGroup2)) + 1;
            if (j8 < 0) {
                return j10;
            }
            if (j8 == j10) {
                return j8;
            }
            AbstractC2834fc0.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j8, j10);
        } catch (NumberFormatException unused2) {
            AbstractC2834fc0.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j8;
        }
    }

    public static long zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f21440b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}
