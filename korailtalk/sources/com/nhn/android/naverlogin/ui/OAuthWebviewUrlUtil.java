package com.nhn.android.naverlogin.ui;

import C6.a;
import android.content.Context;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.kakao.sdk.auth.Constants;
import com.nhn.android.naverlogin.data.OAuthLoginData;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class OAuthWebviewUrlUtil {
    public static final String FINAL_URL = "http://nid.naver.com/com.nhn.login_global/inweb/finish";
    public static final String FINAL_URL_HTTPS = "https://nid.naver.com/com.nhn.login_global/inweb/finish";

    private static Map a(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("&");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(SimpleComparison.EQUAL_TO_OPERATION);
            if (strArrSplit2.length == 2) {
                map.put(strArrSplit2[0], strArrSplit2[1]);
            } else if (strArrSplit2.length == 1) {
                map.put(strArrSplit2[0], "");
            }
        }
        return map;
    }

    private static Map b(String str) {
        if (str.contains("?")) {
            str = str.split("\\?")[1];
        }
        return a(str);
    }

    public static String getDecodedString(String str) throws UnsupportedEncodingException {
        String strDecode;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            strDecode = URLDecoder.decode(str, "UTF-8");
        } catch (Exception unused) {
            strDecode = "";
        }
        return (TextUtils.isEmpty(strDecode) || strDecode.equalsIgnoreCase(str)) ? str : strDecode;
    }

    public static boolean isErrorResultNaverTokenInvalid(Context context, String str, String str2, OAuthLoginData oAuthLoginData) {
        Map mapB;
        try {
            if (TextUtils.isEmpty(str) || str.startsWith("https://nid.naver.com/")) {
                try {
                    mapB = a(new URL(str2).getQuery());
                } catch (Exception unused) {
                    mapB = b(str2);
                }
                return mapB != null && mapB.containsKey("error") && mapB.containsKey(Constants.ERROR_DESCRIPTION) && ((String) mapB.get("error")).equalsIgnoreCase("invalid_request") && ((String) mapB.get(Constants.ERROR_DESCRIPTION)).contains("token") && ((String) mapB.get(Constants.ERROR_DESCRIPTION)).contains("invalid");
            }
            if (a.isRealVersion()) {
                return false;
            }
            a.d("OAuthWebvewUrlUtil", "isErrorResultNaverTokenInvalid - pre url is not naver.com");
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean isFinalUrl(boolean z8, String str, String str2) {
        if (str2 == null) {
            return false;
        }
        if (str2.equalsIgnoreCase(FINAL_URL) || str2.equalsIgnoreCase(FINAL_URL_HTTPS) || str2.equalsIgnoreCase("http://m.naver.com/") || str2.equalsIgnoreCase("http://m.naver.com")) {
            return true;
        }
        if (true == z8 && str2.startsWith("https://nid.naver.com/nidlogin.login?svctype=262144")) {
            return true;
        }
        return !z8 && ((str.startsWith("https://nid.naver.com/mobile/user/help/sleepId.nhn?m=viewSleepId&token_help=") && str2.startsWith("https://nid.naver.com/nidlogin.login?svctype=262144")) || ((str.startsWith("https://nid.naver.com/mobile/user/global/idSafetyRelease.nhn?") && str2.startsWith("https://nid.naver.com/nidlogin.login?svctype=262144")) || (str.startsWith("https://nid.naver.com/mobile/user/help/idSafetyRelease.nhn?") && str2.startsWith("https://nid.naver.com/nidlogin.login?svctype=262144"))));
    }

    public static void processCallbackUrl(Context context, String str, OAuthLoginData oAuthLoginData) {
        Map mapB;
        try {
            mapB = a(new URL(str).getQuery());
        } catch (Exception unused) {
            mapB = b(str);
        }
        oAuthLoginData.setMiddleResult((String) mapB.get(Constants.CODE), (String) mapB.get("state"), (String) mapB.get("error"), getDecodedString((String) mapB.get(Constants.ERROR_DESCRIPTION)));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean returnWhenAuthorizationDone(android.content.Context r10, java.lang.String r11, java.lang.String r12, com.nhn.android.naverlogin.data.OAuthLoginData r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nhn.android.naverlogin.ui.OAuthWebviewUrlUtil.returnWhenAuthorizationDone(android.content.Context, java.lang.String, java.lang.String, com.nhn.android.naverlogin.data.OAuthLoginData):boolean");
    }
}
