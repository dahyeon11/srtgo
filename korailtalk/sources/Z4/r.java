package z4;

import android.content.Context;
import android.content.res.Resources;
import com.kakao.sdk.user.Constants;
import java.util.Locale;
import y1.C6521b;

/* loaded from: classes.dex */
public class r {
    private static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return Locale.CHINESE.getLanguage().equals(language) ? ("TW".equals(country) || "HK".equals(country) || "MO".equals(country)) ? "zht" : "zh" : "in".equals(language) ? Constants.ID : language;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[PHI: r0
  0x0031: PHI (r0v11 java.lang.String) = (r0v8 java.lang.String), (r0v9 java.lang.String), (r0v10 java.lang.String) binds: [B:12:0x002f, B:15:0x0039, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String convertLanguageToWebView(java.lang.String r2) {
        /*
            java.util.Locale r0 = java.util.Locale.CHINESE
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            java.lang.String r2 = "cn"
            goto L45
        Lf:
            java.util.Locale r0 = java.util.Locale.JAPANESE
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.String r2 = "jp"
            goto L45
        L1e:
            java.lang.String r0 = "zht"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L29
            java.lang.String r2 = "tw"
            goto L45
        L29:
            java.lang.String r0 = "vi"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L33
        L31:
            r2 = r0
            goto L45
        L33:
            java.lang.String r0 = "id"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L3c
            goto L31
        L3c:
            java.lang.String r0 = "th"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L45
            goto L31
        L45:
            java.lang.String r2 = r2.toUpperCase()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.convertLanguageToWebView(java.lang.String):java.lang.String");
    }

    public static String getLanguageType(Context context) {
        String string = H.getString(context, "IS_MULTI_LANGUAGE_TYPE");
        return (N.isNull(string) || string.equals(C6521b.UNDEFINED_DOMAIN)) ? getSystemLanguageType() : string;
    }

    public static String getSystemLanguageType() {
        String strA = a(Resources.getSystem().getConfiguration().getLocales().get(0));
        if (Locale.KOREAN.getLanguage().equals(strA)) {
            return strA;
        }
        Locale locale = Locale.ENGLISH;
        return (locale.getLanguage().equals(strA) || "zh".equals(strA) || "zht".equals(strA) || Locale.JAPANESE.getLanguage().equals(strA) || "vi".equals(strA) || Constants.ID.equals(strA) || "in".equals(strA) || "th".equals(strA)) ? strA : locale.getLanguage();
    }
}
