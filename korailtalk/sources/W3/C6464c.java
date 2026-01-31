package w3;

import ai.maum.m2u.cdk.grpclib.constants.BaseConst;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.firebase.installations.i;
import com.kakao.sdk.user.Constants;
import i2.AbstractC5683p;
import io.grpc.internal.U;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o2.C6029a;
import o2.k;
import org.json.JSONException;
import org.json.JSONObject;
import s3.InterfaceC6215c;
import w3.AbstractC6465d;
import w3.AbstractC6466e;
import y3.h;

/* renamed from: w3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6464c {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f37407d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f37408e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f37409a;

    /* renamed from: b, reason: collision with root package name */
    private final h f37410b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6215c f37411c;

    public C6464c(Context context, h hVar, InterfaceC6215c interfaceC6215c) {
        this.f37409a = context;
        this.f37410b = hVar;
        this.f37411c = interfaceC6215c;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(Constants.APPID, str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.3");
            return jSONObject;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static JSONObject c() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private String d() {
        try {
            Context context = this.f37409a;
            byte[] packageCertificateHashBytes = C6029a.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return k.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f37409a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("ContentValues", "No such package: " + this.f37409a.getPackageName(), e8);
            return null;
        }
    }

    private URL e(String str) throws i {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e8) {
            throw new i(e8.getMessage(), i.a.UNAVAILABLE);
        }
    }

    private static byte[] f(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void g() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void h(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        String strL = l(httpURLConnection);
        if (TextUtils.isEmpty(strL)) {
            return;
        }
        Log.w("Firebase-Installations", strL);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection i(URL url, String str) throws i {
        InterfaceC6215c.a heartBeatCode;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f37409a.getPackageName());
            InterfaceC6215c interfaceC6215c = this.f37411c;
            if (interfaceC6215c != null && this.f37410b != null && (heartBeatCode = interfaceC6215c.getHeartBeatCode("fire-installations-id")) != InterfaceC6215c.a.NONE) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f37410b.getUserAgent());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(heartBeatCode.getCode()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", d());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
    }

    static long j(String str) {
        AbstractC5683p.checkArgument(f37407d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private AbstractC6465d k(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f37408e));
        AbstractC6466e.a aVarBuilder = AbstractC6466e.builder();
        AbstractC6465d.a aVarBuilder2 = AbstractC6465d.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarBuilder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarBuilder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarBuilder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals(BaseConst.MapKeys.AUTH_TOKEN)) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarBuilder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarBuilder.setTokenExpirationTimestamp(j(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarBuilder2.setAuthToken(aVarBuilder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarBuilder2.setResponseCode(AbstractC6465d.b.OK).build();
    }

    private static String l(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f37408e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    private AbstractC6466e m(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f37408e));
        AbstractC6466e.a aVarBuilder = AbstractC6466e.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarBuilder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarBuilder.setTokenExpirationTimestamp(j(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarBuilder.setResponseCode(AbstractC6466e.b.OK).build();
    }

    private void n(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        p(httpURLConnection, f(b(str, str2)));
    }

    private void o(HttpURLConnection httpURLConnection) throws IOException {
        p(httpURLConnection, f(c()));
    }

    private static void p(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC6465d createFirebaseInstallation(String str, String str2, String str3, String str4, String str5) throws i {
        int responseCode;
        URL urlE = e(String.format("projects/%s/installations", str3));
        int i8 = 0;
        while (i8 <= 1) {
            HttpURLConnection httpURLConnectionI = i(urlE, str);
            try {
                httpURLConnectionI.setRequestMethod(U.HTTP_METHOD);
                httpURLConnectionI.setDoOutput(true);
                if (str5 != null) {
                    httpURLConnectionI.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                n(httpURLConnectionI, str2, str4);
                responseCode = httpURLConnectionI.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionI.disconnect();
                throw th;
            }
            if (responseCode == 200) {
                AbstractC6465d abstractC6465dK = k(httpURLConnectionI);
                httpURLConnectionI.disconnect();
                return abstractC6465dK;
            }
            h(httpURLConnectionI, str4, str, str3);
            if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                g();
                AbstractC6465d abstractC6465dBuild = AbstractC6465d.builder().setResponseCode(AbstractC6465d.b.BAD_CONFIG).build();
                httpURLConnectionI.disconnect();
                return abstractC6465dBuild;
            }
            i8++;
            httpURLConnectionI.disconnect();
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public void deleteFirebaseInstallation(String str, String str2, String str3, String str4) throws i {
        int responseCode;
        URL urlE = e(String.format("projects/%s/installations/%s", str3, str2));
        int i8 = 0;
        while (i8 <= 1) {
            HttpURLConnection httpURLConnectionI = i(urlE, str);
            try {
                httpURLConnectionI.setRequestMethod("DELETE");
                httpURLConnectionI.addRequestProperty(com.kakao.sdk.common.Constants.AUTHORIZATION, "FIS_v2 " + str4);
                responseCode = httpURLConnectionI.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionI.disconnect();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                h(httpURLConnectionI, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    g();
                    throw new i("Bad config while trying to delete FID", i.a.BAD_CONFIG);
                }
                i8++;
                httpURLConnectionI.disconnect();
            }
            httpURLConnectionI.disconnect();
            return;
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public AbstractC6466e generateAuthToken(String str, String str2, String str3, String str4) throws i {
        int responseCode;
        URL urlE = e(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        int i8 = 0;
        while (i8 <= 1) {
            HttpURLConnection httpURLConnectionI = i(urlE, str);
            try {
                httpURLConnectionI.setRequestMethod(U.HTTP_METHOD);
                httpURLConnectionI.addRequestProperty(com.kakao.sdk.common.Constants.AUTHORIZATION, "FIS_v2 " + str4);
                o(httpURLConnectionI);
                responseCode = httpURLConnectionI.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionI.disconnect();
                throw th;
            }
            if (responseCode == 200) {
                AbstractC6466e abstractC6466eM = m(httpURLConnectionI);
                httpURLConnectionI.disconnect();
                return abstractC6466eM;
            }
            h(httpURLConnectionI, null, str, str3);
            if (responseCode != 401 && responseCode != 404) {
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    g();
                    AbstractC6466e abstractC6466eBuild = AbstractC6466e.builder().setResponseCode(AbstractC6466e.b.BAD_CONFIG).build();
                    httpURLConnectionI.disconnect();
                    return abstractC6466eBuild;
                }
                i8++;
                httpURLConnectionI.disconnect();
            }
            AbstractC6466e abstractC6466eBuild2 = AbstractC6466e.builder().setResponseCode(AbstractC6466e.b.AUTH_ERROR).build();
            httpURLConnectionI.disconnect();
            return abstractC6466eBuild2;
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }
}
