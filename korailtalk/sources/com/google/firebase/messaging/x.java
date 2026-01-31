package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.AbstractC5186c;
import com.google.firebase.messaging.t;
import m1.AbstractC5905c;
import m1.C5904b;
import m3.InterfaceC5907a;
import o3.C6035c;
import o3.InterfaceC6033a;
import o3.InterfaceC6036d;
import q3.C6108c;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6033a f25820a = new C6108c().registerEncoder(t.b.class, (InterfaceC6036d) new t.c()).registerEncoder(t.class, (InterfaceC6036d) new t.a()).build();

    static boolean a() {
        Context applicationContext;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            l3.c.getInstance();
            applicationContext = l3.c.getInstance().getApplicationContext();
            sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    static String b(Intent intent) {
        return intent.getStringExtra(AbstractC5186c.a.COLLAPSE_KEY);
    }

    static String c(Intent intent) {
        return intent.getStringExtra("google.c.a.c_id");
    }

    static String d(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    static String e() {
        return FirebaseInstanceId.getInstance(l3.c.getInstance()).getId();
    }

    static String f(Intent intent) {
        return intent.getStringExtra("google.c.a.m_c");
    }

    static String g(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC5186c.a.MSGID);
        return stringExtra == null ? intent.getStringExtra(AbstractC5186c.a.MSGID_SERVER) : stringExtra;
    }

    static String h(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    private static int i(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    static String j(Intent intent) {
        return intent.getStringExtra("google.c.a.ts");
    }

    static String k(Intent intent) {
        return (intent.getExtras() == null || !y.isNotification(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    static String l(Intent intent) {
        return (intent.getExtras() == null || !y.isNotification(intent.getExtras())) ? "data" : "display";
    }

    public static void logNotificationDismiss(Intent intent) {
        u("_nd", intent);
    }

    public static void logNotificationForeground(Intent intent) {
        u("_nf", intent);
    }

    public static void logNotificationOpen(Intent intent) {
        w(intent);
        u("_no", intent);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            u("_nr", intent);
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            m1.g transportFactory = FirebaseMessaging.getTransportFactory();
            if (transportFactory != null) {
                t("MESSAGE_DELIVERED", intent, transportFactory.getTransport("FCM_CLIENT_EVENT_LOGGING", String.class, C5904b.of("json"), w.f25819a));
            } else {
                Log.e(AbstractC5186c.TAG, "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            }
        }
    }

    static String m() {
        return l3.c.getInstance().getApplicationContext().getPackageName();
    }

    static int n(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC5186c.a.DELIVERED_PRIORITY);
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra(AbstractC5186c.a.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            stringExtra = intent.getStringExtra(AbstractC5186c.a.PRIORITY_V19);
        }
        return i(stringExtra);
    }

    static String o() {
        l3.c cVar = l3.c.getInstance();
        String gcmSenderId = cVar.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = cVar.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    static String p(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC5186c.a.FROM);
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    static int q(Intent intent) {
        Object obj = intent.getExtras().get(AbstractC5186c.a.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            Log.w(AbstractC5186c.TAG, sb.toString());
            return 0;
        }
    }

    static String r(Intent intent) {
        if (intent.hasExtra("google.c.a.udt")) {
            return intent.getStringExtra("google.c.a.udt");
        }
        return null;
    }

    private static boolean s(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent == null || s(intent)) {
            return false;
        }
        return a();
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || s(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    private static void t(String str, Intent intent, m1.f fVar) {
        try {
            fVar.send(AbstractC5905c.ofTelemetry(f25820a.encode(new t.b(new t(str, intent)))));
        } catch (C6035c unused) {
        }
    }

    static void u(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String strC = c(intent);
        if (strC != null) {
            bundle.putString("_nmid", strC);
        }
        String strD = d(intent);
        if (strD != null) {
            bundle.putString("_nmn", strD);
        }
        String strH = h(intent);
        if (!TextUtils.isEmpty(strH)) {
            bundle.putString("label", strH);
        }
        String strF = f(intent);
        if (!TextUtils.isEmpty(strF)) {
            bundle.putString("message_channel", strF);
        }
        String strP = p(intent);
        if (strP != null) {
            bundle.putString("_nt", strP);
        }
        String strJ = j(intent);
        if (strJ != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(strJ));
            } catch (NumberFormatException e8) {
                Log.w(AbstractC5186c.TAG, "Error while parsing timestamp in GCM event", e8);
            }
        }
        String strR = r(intent);
        if (strR != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(strR));
            } catch (NumberFormatException e9) {
                Log.w(AbstractC5186c.TAG, "Error while parsing use_device_time in GCM event", e9);
            }
        }
        String strL = l(intent);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", strL);
        }
        if (Log.isLoggable(AbstractC5186c.TAG, 3)) {
            String strValueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + strValueOf.length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(strValueOf);
        }
        android.support.v4.media.session.f.a(l3.c.getInstance().get(InterfaceC5907a.class));
        Log.w(AbstractC5186c.TAG, "Unable to log event: analytics library is missing");
    }

    static void v(boolean z8) {
        l3.c.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z8).apply();
    }

    private static void w(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!"1".equals(intent.getStringExtra("google.c.a.tc"))) {
            Log.isLoggable(AbstractC5186c.TAG, 3);
            return;
        }
        android.support.v4.media.session.f.a(l3.c.getInstance().get(InterfaceC5907a.class));
        Log.isLoggable(AbstractC5186c.TAG, 3);
        Log.w(AbstractC5186c.TAG, "Unable to set user property for conversion tracking:  analytics library is missing");
    }
}
