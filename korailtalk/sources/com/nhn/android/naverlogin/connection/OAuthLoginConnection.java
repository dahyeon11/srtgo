package com.nhn.android.naverlogin.connection;

import D6.b;
import android.content.Context;
import com.nhn.android.idp.common.connection.a;
import com.nhn.android.idp.common.connection.c;
import com.nhn.android.naverlogin.OAuthLoginDefine;
import com.nhn.android.naverlogin.connection.gen.OAuthQueryGenerator;
import com.nhn.android.naverlogin.data.OAuthErrorCode;
import com.nhn.android.naverlogin.data.OAuthResponse;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OAuthLoginConnection extends a {
    private static OAuthResponse c(Context context, String str) throws JSONException {
        c cVarRequest = a.request(context, str, null, null);
        if (!cVarRequest.mStat.equals(c.a.SUCCESS)) {
            int i8 = cVarRequest.mStatusCode;
            return i8 == 503 ? new OAuthResponse(OAuthErrorCode.SERVER_ERROR_TEMPORARILY_UNAVAILABLE) : i8 == 500 ? new OAuthResponse(OAuthErrorCode.SERVER_ERROR_SERVER_ERROR) : (cVarRequest.mStat.equals(c.a.CONNECTION_TIMEOUT) || cVarRequest.mStat.equals(c.a.CONNECTION_FAIL)) ? new OAuthResponse(OAuthErrorCode.CLIENT_ERROR_CONNECTION_ERROR) : cVarRequest.mStat.equals(c.a.NO_PEER_CERTIFICATE) ? new OAuthResponse(OAuthErrorCode.CLIENT_ERROR_CERTIFICATION_ERROR) : new OAuthResponse(OAuthErrorCode.ERROR_NO_CATAGORIZED);
        }
        try {
            JSONObject jSONObject = new JSONObject(cVarRequest.mContent);
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginConnection", "len :" + jSONObject.length());
                C6.a.d("OAuthLoginConnection", "str :" + jSONObject.toString());
            }
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                map.put(next, string);
                if (!C6.a.isRealVersion()) {
                    C6.a.d("OAuthLoginConnection", "key:" + next + ",value:" + string);
                }
            }
            return new OAuthResponse(map);
        } catch (JSONException e8) {
            if (!C6.a.isRealVersion()) {
                C6.a.d("OAuthLoginConnection", "content:" + cVarRequest.mContent);
            }
            e8.printStackTrace();
            return new OAuthResponse(OAuthErrorCode.CLIENT_ERROR_PARSING_FAIL);
        }
    }

    public static OAuthResponse deleteToken(Context context, String str, String str2, String str3) {
        return c(context, new OAuthQueryGenerator().generateRequestDeleteAccessTokenUrl(str, str2, str3, b.getBaseInstance().getLocaleString(context), OAuthLoginDefine.VERSION));
    }

    public static OAuthResponse requestAccessToken(Context context, String str, String str2, String str3, String str4) {
        return c(context, new OAuthQueryGenerator().generateRequestAccessTokenUrl(str, str2, str3, str4, b.getBaseInstance().getLocaleString(context), OAuthLoginDefine.VERSION));
    }

    public static OAuthResponse requestRefreshToken(Context context, String str, String str2, String str3) {
        return c(context, new OAuthQueryGenerator().generateRequestRefreshAccessTokenUrl(str, str2, str3, b.getBaseInstance().getLocaleString(context), OAuthLoginDefine.VERSION));
    }

    public static c requestWithOAuthHeader(Context context, String str, String str2, String str3, String str4) {
        return a.request(context, str, null, null, str4, false);
    }
}
