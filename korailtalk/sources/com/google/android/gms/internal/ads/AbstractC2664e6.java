package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2664e6 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f18728a = Pattern.compile("^NOTE([ \t].*)?$");

    public static float zza(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long zzb(String str) {
        int i8 = AbstractC2281am0.zza;
        String[] strArrSplit = str.split("\\.", 2);
        long j8 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j8 = (j8 * 60) + Long.parseLong(str2);
        }
        long j9 = j8 * 1000;
        if (strArrSplit.length == 2) {
            j9 += Long.parseLong(strArrSplit[1]);
        }
        return j9 * 1000;
    }
}
