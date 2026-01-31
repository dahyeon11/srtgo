package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Is */
/* loaded from: classes2.dex */
public abstract class AbstractC1489Is {
    static Uri a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i8 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i8) + str2 + SimpleComparison.EQUAL_TO_OPERATION + str3 + "&" + str.substring(i8));
    }

    private static String b(String str, Context context) {
        String strZzd = G1.u.zzn().zzd(context);
        String strZzb = G1.u.zzn().zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzd)) {
            str = a(str, "gmp_app_id", strZzd).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzb)) ? str : a(str, "fbs_aiid", strZzb).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!G1.u.zzn().zzp(context)) {
            return uri.toString();
        }
        String strZza = G1.u.zzn().zza(context);
        if (strZza == null) {
            return uri.toString();
        }
        String str = (String) H1.C.zzc().zza(AbstractC4439th.zzaf);
        String string = uri.toString();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzae)).booleanValue() && string.contains(str)) {
            G1.u.zzn().zzj(context, strZza, (Map) map.get("_ac"));
            return b(string, context).replace(str, strZza);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzad)).booleanValue()) {
            return string;
        }
        String string2 = a(b(string, context), "fbs_aeid", strZza).toString();
        G1.u.zzn().zzj(context, strZza, (Map) map.get("_ac"));
        return string2;
    }

    public static String zzc(String str, Context context, boolean z8, Map map) {
        String strZza;
        if ((((Boolean) H1.C.zzc().zza(AbstractC4439th.zzam)).booleanValue() && !z8) || !G1.u.zzn().zzp(context) || TextUtils.isEmpty(str) || (strZza = G1.u.zzn().zza(context)) == null) {
            return str;
        }
        String str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzaf);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzae)).booleanValue() && str.contains(str2)) {
            if (G1.u.zzp().zzi(str)) {
                G1.u.zzn().zzj(context, strZza, (Map) map.get("_ac"));
                return b(str, context).replace(str2, strZza);
            }
            if (!G1.u.zzp().zzj(str)) {
                return str;
            }
            G1.u.zzn().zzk(context, strZza, (Map) map.get("_ai"));
            return b(str, context).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzad)).booleanValue()) {
            return str;
        }
        if (G1.u.zzp().zzi(str)) {
            G1.u.zzn().zzj(context, strZza, (Map) map.get("_ac"));
            return a(b(str, context), "fbs_aeid", strZza).toString();
        }
        if (!G1.u.zzp().zzj(str)) {
            return str;
        }
        G1.u.zzn().zzk(context, strZza, (Map) map.get("_ai"));
        return a(b(str, context), "fbs_aeid", strZza).toString();
    }
}
