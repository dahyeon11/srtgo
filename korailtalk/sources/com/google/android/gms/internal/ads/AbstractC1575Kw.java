package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Kw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1575Kw {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f13872a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f13873b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(C4654va0 c4654va0) throws JSONException {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && c4654va0.zzU && c4654va0.zzW.zzb() && c4654va0.zzb != 4) {
            ZW zw = c4654va0.zzW.zzc() == 1 ? ZW.VIDEO : ZW.HTML_DISPLAY;
            String str = c4654va0.zzam;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("creativeType", zw.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e8) {
                L1.n.zzk("Unable to build OMID ENV JSON", e8);
            }
        }
        return null;
    }

    public static String zzb(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f13872a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f13873b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
