package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f25683a;

    /* renamed from: b, reason: collision with root package name */
    final Context f25684b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f25685c = new O.a();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f25686d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f25687a;

        /* renamed from: b, reason: collision with root package name */
        final String f25688b;

        /* renamed from: c, reason: collision with root package name */
        final long f25689c;

        private a(String str, String str2, long j8) {
            this.f25687a = str;
            this.f25688b = str2;
            this.f25689c = j8;
        }

        static String a(String str, String str2, long j8) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j8);
                return jSONObject.toString();
            } catch (JSONException e8) {
                String strValueOf = String.valueOf(e8);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        static String b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f25687a;
        }

        static a d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e8) {
                String strValueOf = String.valueOf(e8);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        boolean c(String str) {
            return System.currentTimeMillis() > this.f25689c + f25686d || !str.equals(this.f25688b);
        }
    }

    public x(Context context) {
        this.f25684b = context;
        this.f25683a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    private void a(String str) {
        File file = new File(androidx.core.content.a.getNoBackupFilesDir(this.f25684b), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            deleteAll();
            FirebaseInstanceId.getInstance().u();
        } catch (IOException e8) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e8.getMessage());
                if (strValueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(strValueOf);
                }
            }
        }
    }

    static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private long d(String str) {
        String string = this.f25683a.getString(b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private long e(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f25683a.contains(b(str, "cre"))) {
            return d(str);
        }
        SharedPreferences.Editor editorEdit = this.f25683a.edit();
        editorEdit.putString(b(str, "cre"), String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        return jCurrentTimeMillis;
    }

    public synchronized void deleteAll() {
        this.f25685c.clear();
        this.f25683a.edit().clear().commit();
    }

    public synchronized void deleteToken(String str, String str2, String str3) {
        String strC = c(str, str2, str3);
        SharedPreferences.Editor editorEdit = this.f25683a.edit();
        editorEdit.remove(strC);
        editorEdit.commit();
    }

    public synchronized long getCreationTime(String str) {
        Long l8 = (Long) this.f25685c.get(str);
        if (l8 != null) {
            return l8.longValue();
        }
        return d(str);
    }

    public synchronized a getToken(String str, String str2, String str3) {
        return a.d(this.f25683a.getString(c(str, str2, str3), null));
    }

    public synchronized boolean isEmpty() {
        return this.f25683a.getAll().isEmpty();
    }

    public synchronized void saveToken(String str, String str2, String str3, String str4, String str5) {
        String strA = a.a(str4, str5, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f25683a.edit();
        editorEdit.putString(c(str, str2, str3), strA);
        editorEdit.commit();
    }

    public synchronized long setCreationTime(String str) {
        long jE;
        jE = e(str);
        this.f25685c.put(str, Long.valueOf(jE));
        return jE;
    }
}
