package D6;

import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    public static final String COOKIE_DOMAIN_NID = "https://nid.naver.com";

    public static String getAllNidCookie() {
        CookieManager cookieManager = CookieManager.getInstance();
        try {
            cookieManager.removeExpiredCookie();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return cookieManager.getCookie(COOKIE_DOMAIN_NID);
    }

    public static List<String> getCookieUpperSDK23(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            if ("Set-Cookie".equalsIgnoreCase(str)) {
                for (String str2 : map.get(str)) {
                    if (!str2.toString().trim().endsWith(";")) {
                        str2 = str2 + ";";
                    }
                    arrayList.add(str2);
                    if (!C6.a.isRealVersion()) {
                        C6.a.d("CookieUtil", "cookie:" + str2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void setCookie(String str, List<String> list) {
        CookieManager cookieManager = CookieManager.getInstance();
        if (!C6.a.isRealVersion()) {
            C6.a.i("CookieUtil", "setCookie url: " + str);
        }
        for (String str2 : list) {
            cookieManager.setCookie(str, str2);
            if (!C6.a.isRealVersion()) {
                C6.a.i("CookieUtil", "setCookie: " + str2);
            }
        }
        try {
            cookieManager.flush();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
