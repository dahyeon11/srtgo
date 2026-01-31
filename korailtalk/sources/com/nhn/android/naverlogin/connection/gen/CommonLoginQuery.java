package com.nhn.android.naverlogin.connection.gen;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class CommonLoginQuery {
    protected final String kUrlRequestLoginKey = "https://nid.naver.com/nidlogin.login?";
    protected final String kUrlRequestLogout = "https://nid.naver.com/nidlogin.logout?";

    private static String a(String str) {
        return str == null ? "" : URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
    }

    protected String getQueryParameter(Map<String, String> map) {
        Set<String> setKeySet = map.keySet();
        StringBuilder sb = new StringBuilder("");
        for (String str : setKeySet) {
            String str2 = map.get(str);
            if (str != null && str2 != null) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(str);
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                try {
                    sb.append(a(str2));
                } catch (UnsupportedEncodingException unused) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }
}
