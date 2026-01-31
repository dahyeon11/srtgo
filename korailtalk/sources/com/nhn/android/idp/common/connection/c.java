package com.nhn.android.idp.common.connection;

import android.text.TextUtils;
import com.korail.talk.network.BaseResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f29621a = "ResponseData";
    public a mStat = a.SUCCESS;
    public int mStatusCode = -1;
    public String mContent = "";
    public String mErrorDetail = "";
    public List<String> mCookieList = new ArrayList();
    public String mXmlEncoding = "utf-8";

    public enum a {
        SUCCESS("SUCCESS", null),
        BUSY("BUSY", "BUSY"),
        CANCEL("CANCEL", "CANCEL"),
        URL_ERROR("URL_ERROR", "URL_ERROR"),
        CONNECTION_TIMEOUT("CONNECTION_TIMEOUT", "CONNECTION_TIMEOUT"),
        CONNECTION_FAIL("CONNECTION_FAIL", "CONNECTION_FAIL"),
        EXCEPTION_FAIL("EXCEPTION_FAIL", "EXCEPTION_FAIL"),
        NO_PEER_CERTIFICATE("NO_PEER_CERTIFICATE", "NO_PEER_CERTIFICATE"),
        FAIL(BaseResponse.FAIL, BaseResponse.FAIL);


        /* renamed from: a, reason: collision with root package name */
        private String f29623a;

        a(String str, String str2) {
            this.f29623a = str;
        }

        public String getValue() {
            return this.f29623a;
        }
    }

    private String a(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader;
        char[] cArr = new char[1024];
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        } catch (UnsupportedEncodingException unused) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int i8 = bufferedReader.read(cArr, 0, 1024);
                if (i8 <= 0) {
                    break;
                }
                sb.append(cArr, 0, i8);
            } catch (IOException e8) {
                setResultCode(a.EXCEPTION_FAIL, "getContent()-IOException:" + e8.getMessage());
            } catch (RuntimeException e9) {
                setResultCode(a.EXCEPTION_FAIL, "getContent()-RuntimeException:" + e9.getMessage());
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    public void setResponseData(int i8, String str, InputStream inputStream, List<String> list) {
        this.mStatusCode = i8;
        if (list != null) {
            this.mCookieList = list;
        }
        try {
            this.mXmlEncoding = str;
            this.mContent = a(inputStream, str);
        } catch (IllegalStateException e8) {
            setResultCode(a.EXCEPTION_FAIL, "setResponseData()-IllegalStateException:" + e8.getMessage());
        } catch (Exception e9) {
            setResultCode(a.EXCEPTION_FAIL, "setResponseData()-Exception:" + e9.getMessage());
        }
    }

    public void setResultCode(a aVar, String str) {
        this.mStat = aVar;
        this.mErrorDetail = str;
    }

    public String toString() {
        return "Statuscode:" + this.mStatusCode + ", Content:" + this.mContent + ", Cookie:" + TextUtils.join("|", this.mCookieList) + ", ErrorDetail:" + this.mErrorDetail;
    }
}
