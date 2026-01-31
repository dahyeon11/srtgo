package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.v8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4608v8 {
    static String a(long j8) {
        return b("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j8));
    }

    private static SimpleDateFormat b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static long zza(String str) {
        try {
            return b("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e8) {
            if ("0".equals(str) || "-1".equals(str)) {
                C3241j8.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            C3241j8.zzc(e8, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static H7 zzb(V7 v72) throws NumberFormatException {
        boolean z8;
        long j8;
        long j9;
        long j10;
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = v72.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i8 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z8 = false;
            j8 = 0;
            j9 = 0;
            while (i8 < strArrSplit.length) {
                String strTrim = strArrSplit[i8].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j9 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j8 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z8 = true;
                }
                i8++;
            }
            i8 = 1;
        } else {
            z8 = false;
            j8 = 0;
            j9 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jZza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i8 != 0) {
            j11 = jCurrentTimeMillis + (j9 * 1000);
            j10 = z8 ? j11 : (j8 * 1000) + j11;
        } else {
            j10 = 0;
            if (jZza <= 0 || jZza2 < jZza) {
                j11 = 0;
            } else {
                j11 = jCurrentTimeMillis + (jZza2 - jZza);
                j10 = j11;
            }
        }
        H7 h72 = new H7();
        h72.zza = v72.zzb;
        h72.zzb = str5;
        h72.zzf = j11;
        h72.zze = j10;
        h72.zzc = jZza;
        h72.zzd = jZza3;
        h72.zzg = map;
        h72.zzh = v72.zzd;
        return h72;
    }
}
