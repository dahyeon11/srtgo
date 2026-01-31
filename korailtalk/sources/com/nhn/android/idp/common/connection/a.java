package com.nhn.android.idp.common.connection;

import android.content.Context;
import com.kakao.sdk.common.Constants;
import com.nhn.android.idp.common.connection.c;
import com.nhn.android.naverlogin.OAuthLoginDefine;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* loaded from: classes.dex */
public class a {
    protected static boolean mCancel;
    protected static HttpURLConnection mHttpUrlConnection;

    private static HttpURLConnection a(String str, String str2, String str3, int i8) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setRequestProperty("User-Agent", str3);
        httpURLConnection.setReadTimeout(i8);
        httpURLConnection.setConnectTimeout(i8);
        httpURLConnection.setDoInput(true);
        if ("GET".equalsIgnoreCase(str)) {
            httpURLConnection.setDoOutput(false);
        } else {
            httpURLConnection.setDoOutput(true);
        }
        return httpURLConnection;
    }

    private static HttpsURLConnection b(String str, String str2, String str3, int i8) {
        return (HttpsURLConnection) a(str, str2, str3, i8);
    }

    public static void cancel() {
        mCancel = true;
        if (mHttpUrlConnection != null) {
            C6.a.e("CommonConnection", "cancel() https-connection shutdown");
            mHttpUrlConnection.disconnect();
            mHttpUrlConnection = null;
        }
    }

    public static HttpURLConnection getDefaultHttpConnection(String str, String str2, Context context, int i8) {
        return a(str, str2, D6.b.getUserAgent(context), i8);
    }

    public static HttpsURLConnection getDefaultHttpsConnection(String str, String str2, Context context, int i8) {
        return b(str, str2, D6.b.getUserAgent(context), i8);
    }

    public static boolean isBusy() {
        return mHttpUrlConnection != null;
    }

    public static c request(Context context, String str, String str2, String str3) {
        return request(context, str, str2, str3, false);
    }

    public static c request(Context context, String str, String str2, String str3, String str4) {
        return request(context, str, str2, str3, str4, false, OAuthLoginDefine.TIMEOUT);
    }

    public static c request(Context context, String str, String str2, String str3, boolean z8) {
        return request(context, str, str2, str3, null, z8, OAuthLoginDefine.TIMEOUT);
    }

    public static c request(Context context, String str, String str2, String str3, String str4, boolean z8) {
        return request(context, str, str2, str3, str4, z8, OAuthLoginDefine.TIMEOUT);
    }

    public static c request(Context context, String str, String str2, String str3, String str4, boolean z8, int i8) throws IOException {
        HttpsURLConnection defaultHttpsConnection;
        InputStream errorStream;
        InputStream errorStream2;
        c cVar = new c();
        List<String> arrayList = new ArrayList<>();
        synchronized (a.class) {
            if (!z8) {
                try {
                    if (mHttpUrlConnection != null) {
                        cVar.setResultCode(c.a.BUSY, "HttpClient already in use.");
                        return cVar;
                    }
                } catch (IOException e8) {
                    cVar.setResultCode(c.a.CONNECTION_FAIL, "connection open fail : " + e8.getMessage());
                    e8.printStackTrace();
                    return cVar;
                } catch (MalformedURLException e9) {
                    cVar.setResultCode(c.a.URL_ERROR, "malformedUrl : " + e9.getMessage());
                    e9.printStackTrace();
                    return cVar;
                } catch (Exception e10) {
                    cVar.setResultCode(c.a.EXCEPTION_FAIL, "unknown fail : " + e10.getMessage());
                    C6.a.e("CommonConnection", "exception step : connection establishing");
                    e10.printStackTrace();
                    return cVar;
                } finally {
                }
            }
            if (!C6.a.isRealVersion()) {
                C6.a.d("CommonConnection", "request url : " + str);
            }
            if (str != null && str.length() != 0) {
                if (z8) {
                    if (str3 != null && str3.length() > 0) {
                        defaultHttpsConnection = b("GET", str, str3, i8);
                    } else {
                        defaultHttpsConnection = getDefaultHttpsConnection("GET", str, context, i8);
                    }
                } else {
                    if (str3 != null && str3.length() > 0) {
                        mHttpUrlConnection = b("GET", str, str3, i8);
                    } else {
                        mHttpUrlConnection = getDefaultHttpsConnection("GET", str, context, i8);
                    }
                    defaultHttpsConnection = null;
                }
                mCancel = false;
                if (str2 != null && str2.length() != 0) {
                    C6.a.d("CommonConnection", "request() --- request with user Cookie!");
                    if (!C6.a.isRealVersion()) {
                        C6.a.d("CommonConnection", "request() --- " + str2);
                    }
                } else {
                    str2 = D6.a.getAllNidCookie();
                    C6.a.d("CommonConnection", "request() --- request with naverCookie!");
                    if (!C6.a.isRealVersion()) {
                        C6.a.d("CommonConnection", "request() --- " + str2);
                    }
                }
                try {
                    try {
                        if (z8) {
                            if (str2 != null && str2.length() > 0) {
                                defaultHttpsConnection.setRequestProperty("Cookie", str2);
                            }
                            if (str4 != null && str4.length() > 0) {
                                defaultHttpsConnection.setRequestProperty(Constants.AUTHORIZATION, str4);
                            }
                            int responseCode = defaultHttpsConnection.getResponseCode();
                            C6.a.i("CommonConnection", "response status code:" + responseCode);
                            arrayList = D6.a.getCookieUpperSDK23(defaultHttpsConnection.getHeaderFields());
                            String charsetFromContentTypeHeader = D6.c.getCharsetFromContentTypeHeader(defaultHttpsConnection.getHeaderFields());
                            try {
                                errorStream2 = defaultHttpsConnection.getInputStream();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                errorStream2 = defaultHttpsConnection.getErrorStream();
                            }
                            cVar.setResponseData(responseCode, charsetFromContentTypeHeader, errorStream2, arrayList);
                        } else {
                            if (str2 != null && str2.length() > 0) {
                                mHttpUrlConnection.setRequestProperty("Cookie", str2);
                            }
                            if (str4 != null && str4.length() > 0) {
                                mHttpUrlConnection.setRequestProperty(Constants.AUTHORIZATION, str4);
                            }
                            int responseCode2 = mHttpUrlConnection.getResponseCode();
                            C6.a.i("CommonConnection", "response status code:" + responseCode2);
                            arrayList = D6.a.getCookieUpperSDK23(mHttpUrlConnection.getHeaderFields());
                            String charsetFromContentTypeHeader2 = D6.c.getCharsetFromContentTypeHeader(mHttpUrlConnection.getHeaderFields());
                            try {
                                errorStream = mHttpUrlConnection.getInputStream();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                                errorStream = mHttpUrlConnection.getErrorStream();
                            }
                            cVar.setResponseData(responseCode2, charsetFromContentTypeHeader2, errorStream, arrayList);
                        }
                    } catch (SocketException e13) {
                        cVar.setResultCode(c.a.CONNECTION_FAIL, "SocketException : " + e13.getMessage());
                        e13.printStackTrace();
                    } catch (SocketTimeoutException e14) {
                        cVar.setResultCode(c.a.CONNECTION_TIMEOUT, "SocketTimeoutException : " + e14.getMessage());
                        e14.printStackTrace();
                    } catch (SSLHandshakeException e15) {
                        cVar.setResultCode(c.a.NO_PEER_CERTIFICATE, "SSLHandshakeException : " + e15.getMessage());
                        e15.printStackTrace();
                    } catch (SSLKeyException e16) {
                        cVar.setResultCode(c.a.NO_PEER_CERTIFICATE, "SSLKeyException : " + e16.getMessage());
                        e16.printStackTrace();
                    } catch (SSLPeerUnverifiedException e17) {
                        cVar.setResultCode(c.a.NO_PEER_CERTIFICATE, "SSLPeerUnverifiedException : " + e17.getMessage());
                        e17.printStackTrace();
                    } catch (SSLProtocolException e18) {
                        cVar.setResultCode(c.a.NO_PEER_CERTIFICATE, "SSLProtocolException : " + e18.getMessage());
                        e18.printStackTrace();
                    } catch (SSLException e19) {
                        cVar.setResultCode(c.a.NO_PEER_CERTIFICATE, "SSLException : " + e19.getMessage());
                        e19.printStackTrace();
                    } catch (IOException e20) {
                        cVar.setResultCode(c.a.EXCEPTION_FAIL, "IOException : " + e20.getMessage());
                        e20.printStackTrace();
                    }
                } catch (Exception e21) {
                    cVar.setResultCode(c.a.EXCEPTION_FAIL, "Exception : " + e21.getMessage());
                    e21.printStackTrace();
                }
                try {
                    try {
                        if (z8) {
                            defaultHttpsConnection.disconnect();
                        } else {
                            mHttpUrlConnection.disconnect();
                        }
                    } catch (Throwable th) {
                        if (!z8) {
                            mHttpUrlConnection = null;
                        }
                        throw th;
                    }
                } catch (Exception e22) {
                    C6.a.write(e22);
                    if (!z8) {
                    }
                }
                if (!z8) {
                    mHttpUrlConnection = null;
                }
                if (mCancel) {
                    c cVar2 = new c();
                    cVar2.setResultCode(c.a.CANCEL, "User cancel");
                    return cVar2;
                }
                try {
                    D6.a.setCookie(str, arrayList);
                } catch (Exception e23) {
                    cVar.setResultCode(c.a.FAIL, "setCookie() failed :" + e23.getMessage());
                    C6.a.write(e23);
                }
                return cVar;
            }
            cVar.setResultCode(c.a.URL_ERROR, "strRequestUrl is null");
            return cVar;
        }
    }
}
