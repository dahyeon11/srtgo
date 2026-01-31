package L1;

import android.util.JsonWriter;
import com.kakao.sdk.auth.Constants;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o2.C6031c;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3017c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f3018d = false;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List f3021a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3016b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final o2.f f3019e = o2.i.getInstance();

    /* renamed from: f, reason: collision with root package name */
    private static final Set f3020f = new HashSet(Arrays.asList(new String[0]));

    public m() {
        throw null;
    }

    static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        h(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C6031c.encode(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i8, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(Constants.CODE).value(i8);
        jsonWriter.endObject();
        h(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static synchronized void c(String str) {
        try {
            n.zzi("GMA Debug BEGIN");
            int i8 = 0;
            while (i8 < str.length()) {
                int i9 = i8 + 4000;
                n.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i8, Math.min(i9, str.length())))));
                i8 = i9;
            }
            n.zzi("GMA Debug FINISH");
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void d(String str, l lVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f3019e.currentTimeMillis());
            jsonWriter.name(androidx.core.app.r.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f3021a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            lVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e8) {
            n.zzh("unable to log", e8);
        }
        c(stringWriter.toString());
    }

    private final void e(final String str) throws IOException {
        d("onNetworkRequestError", new l() { // from class: L1.j
            @Override // L1.l
            public final void zza(JsonWriter jsonWriter) throws IOException {
                int i8 = m.zza;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name(Constants.ERROR_DESCRIPTION).value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void f(final String str, final String str2, final Map map, final byte[] bArr) throws IOException {
        d("onNetworkRequest", new l() { // from class: L1.h
            @Override // L1.l
            public final void zza(JsonWriter jsonWriter) throws IOException {
                m.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void g(final Map map, final int i8) throws IOException {
        d("onNetworkResponse", new l() { // from class: L1.k
            @Override // L1.l
            public final void zza(JsonWriter jsonWriter) throws IOException {
                m.b(i8, map, jsonWriter);
            }
        });
    }

    private static void h(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f3020f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        n.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static void zzi() {
        synchronized (f3016b) {
            f3017c = false;
            f3018d = false;
            n.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z8) {
        synchronized (f3016b) {
            f3017c = true;
            f3018d = z8;
        }
    }

    public static boolean zzk() {
        boolean z8;
        synchronized (f3016b) {
            try {
                z8 = false;
                if (f3017c && f3018d) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    public static boolean zzl() {
        boolean z8;
        synchronized (f3016b) {
            z8 = f3017c;
        }
        return z8;
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (zzk()) {
            f(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) throws IOException {
        if (zzk()) {
            f(str, "GET", map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i8) throws IOException {
        if (zzk()) {
            String responseMessage = null;
            g(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i8);
            if (i8 < 200 || i8 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e8) {
                    n.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e8.getMessage())));
                }
                e(responseMessage);
            }
        }
    }

    public final void zzf(Map map, int i8) throws IOException {
        if (zzk()) {
            g(map, i8);
            if (i8 < 200 || i8 >= 300) {
                e(null);
            }
        }
    }

    public final void zzg(String str) throws IOException {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) throws IOException {
        d("onNetworkResponseBody", new l() { // from class: L1.i
            @Override // L1.l
            public final void zza(JsonWriter jsonWriter) throws IOException {
                int i8 = m.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncode = C6031c.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncode);
                } else {
                    String strZzf = g.zzf(strEncode);
                    if (strZzf != null) {
                        jsonWriter.name("bodydigest").value(strZzf);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public m(String str) {
        this.f3021a = !zzk() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
