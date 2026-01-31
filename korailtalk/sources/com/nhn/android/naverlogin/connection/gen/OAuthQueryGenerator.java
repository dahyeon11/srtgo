package com.nhn.android.naverlogin.connection.gen;

import Q7.C0709m;
import com.kakao.sdk.auth.Constants;
import com.nhn.android.naverlogin.OAuthLoginDefine;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class OAuthQueryGenerator extends CommonLoginQuery {
    private Map b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashMap map = new HashMap();
        map.put(Constants.CLIENT_ID, str);
        map.put("inapp_view", str6);
        map.put(Constants.RESPONSE_TYPE, Constants.CODE);
        map.put("oauth_os", "android");
        map.put("version", "android-" + str7);
        if (str5 != null) {
            map.put("network", str5);
        }
        map.put("locale", str4);
        map.put(Constants.REDIRECT_URI, str3);
        map.put("state", str2);
        return map;
    }

    public String generateRequestAccessTokenUrl(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap map = new HashMap();
        map.put(Constants.CLIENT_ID, str);
        map.put("client_secret", str2);
        map.put(Constants.GRANT_TYPE, Constants.AUTHORIZATION_CODE);
        map.put("state", str3);
        map.put(Constants.CODE, str4);
        map.put("oauth_os", "android");
        map.put("version", "android-" + str6);
        map.put("locale", str5);
        return String.format("%s%s", "https://nid.naver.com/oauth2.0/token?", getQueryParameter(map));
    }

    public String generateRequestCustomTabAuthorizationUrl(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s%s", "https://nid.naver.com/oauth2.0/authorize?", getQueryParameter(b(str, str2, str3, str4, str5, "custom_tab", str6)));
    }

    public String generateRequestDeleteAccessTokenUrl(String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put(Constants.CLIENT_ID, str);
        map.put("client_secret", str2);
        map.put(Constants.GRANT_TYPE, "delete");
        map.put(Constants.ACCESS_TOKEN, str3);
        map.put("service_provider", "NAVER");
        map.put("oauth_os", "android");
        map.put("version", "android-" + str5);
        map.put("locale", str4);
        return String.format("%s%s", "https://nid.naver.com/oauth2.0/token?", getQueryParameter(map));
    }

    public String generateRequestRefreshAccessTokenUrl(String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put(Constants.CLIENT_ID, str);
        map.put("client_secret", str2);
        map.put(Constants.GRANT_TYPE, Constants.REFRESH_TOKEN);
        map.put(Constants.REFRESH_TOKEN, str3);
        map.put("oauth_os", "android");
        map.put("version", "android-" + str5);
        map.put("locale", str4);
        return String.format("%s%s", "https://nid.naver.com/oauth2.0/token?", getQueryParameter(map));
    }

    public String generateRequestWebViewAuthorizationUrl(String str, String str2, String str3, String str4) {
        return generateRequestWebViewAuthorizationUrl(str, str2, str3, str4, null, OAuthLoginDefine.VERSION);
    }

    public String generateRequestWebViewAuthorizationUrl(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s%s", "https://nid.naver.com/oauth2.0/authorize?", getQueryParameter(b(str, str2, str3, str4, str5, C0709m.TRUE, str6)));
    }
}
