package com.google.firebase.messaging;

import K1.S0;
import K1.T0;
import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.r;
import androidx.core.view.accessibility.AbstractC0927b;
import com.kakao.sdk.link.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5185b {
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f25789a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.b$a */
    public static class a {
        public final int id;
        public final r.m notificationBuilder;
        public final String tag;

        a(r.m mVar, String str, int i8) {
            this.notificationBuilder = mVar;
            this.tag = str;
            this.id = i8;
        }
    }

    private static PendingIntent a(Context context, y yVar, String str, PackageManager packageManager) {
        Intent intentE = e(str, yVar, packageManager);
        if (intentE == null) {
            return null;
        }
        intentE.addFlags(AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL);
        intentE.putExtras(yVar.paramsWithReservedKeysRemoved());
        PendingIntent activity = PendingIntent.getActivity(context, f(), intentE, 1073741824);
        return o(yVar) ? p(context, yVar, activity) : activity;
    }

    private static PendingIntent b(Context context, y yVar) {
        if (o(yVar)) {
            return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(yVar.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, f(), new Intent(com.google.firebase.iid.w.ACTION_MESSAGING_EVENT).setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    public static a createNotificationInfo(Context context, String str, y yVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) throws JSONException {
        r.m mVar = new r.m(context, str2);
        String possiblyLocalizedString = yVar.getPossiblyLocalizedString(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            mVar.setContentTitle(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = yVar.getPossiblyLocalizedString(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            mVar.setContentText(possiblyLocalizedString2);
            mVar.setStyle(new r.k().bigText(possiblyLocalizedString2));
        }
        mVar.setSmallIcon(k(packageManager, resources, str, yVar.getString("gcm.n.icon"), bundle));
        Uri uriL = l(str, yVar, resources);
        if (uriL != null) {
            mVar.setSound(uriL);
        }
        mVar.setContentIntent(a(context, yVar, str, packageManager));
        PendingIntent pendingIntentB = b(context, yVar);
        if (pendingIntentB != null) {
            mVar.setDeleteIntent(pendingIntentB);
        }
        Integer numG = g(context, yVar.getString("gcm.n.color"), bundle);
        if (numG != null) {
            mVar.setColor(numG.intValue());
        }
        mVar.setAutoCancel(!yVar.getBoolean("gcm.n.sticky"));
        mVar.setLocalOnly(yVar.getBoolean("gcm.n.local_only"));
        String string = yVar.getString("gcm.n.ticker");
        if (string != null) {
            mVar.setTicker(string);
        }
        Integer numD = yVar.d();
        if (numD != null) {
            mVar.setPriority(numD.intValue());
        }
        Integer numE = yVar.e();
        if (numE != null) {
            mVar.setVisibility(numE.intValue());
        }
        Integer numC = yVar.c();
        if (numC != null) {
            mVar.setNumber(numC.intValue());
        }
        Long l8 = yVar.getLong("gcm.n.event_time");
        if (l8 != null) {
            mVar.setShowWhen(true);
            mVar.setWhen(l8.longValue());
        }
        long[] vibrateTimings = yVar.getVibrateTimings();
        if (vibrateTimings != null) {
            mVar.setVibrate(vibrateTimings);
        }
        int[] iArrB = yVar.b();
        if (iArrB != null) {
            mVar.setLights(iArrB[0], iArrB[1], iArrB[2]);
        }
        mVar.setDefaults(h(yVar));
        return new a(mVar, m(yVar), 0);
    }

    static a d(Context context, y yVar) throws PackageManager.NameNotFoundException {
        Bundle bundleI = i(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context.getPackageName(), yVar, j(context, yVar.getNotificationChannelId(), bundleI), context.getResources(), context.getPackageManager(), bundleI);
    }

    private static Intent e(String str, y yVar, PackageManager packageManager) {
        String string = yVar.getString("gcm.n.click_action");
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = yVar.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w(AbstractC5186c.TAG, "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int f() {
        return f25789a.incrementAndGet();
    }

    private static Integer g(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w(AbstractC5186c.TAG, sb.toString());
            }
        }
        int i8 = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i8 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.a.getColor(context, i8));
        } catch (Resources.NotFoundException unused2) {
            Log.w(AbstractC5186c.TAG, "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int h(y yVar) {
        boolean z8 = yVar.getBoolean("gcm.n.default_sound");
        ?? r02 = z8;
        if (yVar.getBoolean("gcm.n.default_vibrate_timings")) {
            r02 = (z8 ? 1 : 0) | 2;
        }
        return yVar.getBoolean("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle i(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e8) {
            String strValueOf = String.valueOf(e8);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf);
            Log.w(AbstractC5186c.TAG, sb.toString());
        }
        return Bundle.EMPTY;
    }

    private static String j(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w(AbstractC5186c.TAG, sb.toString());
            }
            String string = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (TextUtils.isEmpty(string)) {
                Log.w(AbstractC5186c.TAG, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                Log.w(AbstractC5186c.TAG, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                T0.a();
                notificationManager.createNotificationChannel(S0.a(FCM_FALLBACK_NOTIFICATION_CHANNEL, context.getString(identifier), 3));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int k(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && n(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && n(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w(AbstractC5186c.TAG, sb.toString());
        }
        int i8 = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i8 == 0 || !n(resources, i8)) {
            try {
                i8 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e8) {
                String strValueOf = String.valueOf(e8);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(strValueOf);
                Log.w(AbstractC5186c.TAG, sb2.toString());
            }
        }
        return (i8 == 0 || !n(resources, i8)) ? R.drawable.sym_def_app_icon : i8;
    }

    private static Uri l(String str, y yVar, Resources resources) {
        String soundResourceName = yVar.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if (Constants.VALIDATION_DEFAULT.equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(soundResourceName).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(soundResourceName);
        return Uri.parse(sb.toString());
    }

    private static String m(y yVar) {
        String string = yVar.getString("gcm.n.tag");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(jUptimeMillis);
        return sb.toString();
    }

    private static boolean n(Resources resources, int i8) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC5184a.a(resources.getDrawable(i8, null))) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i8);
            Log.e(AbstractC5186c.TAG, sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i8);
            sb2.append(", treating it as an invalid icon");
            Log.e(AbstractC5186c.TAG, sb2.toString());
            return false;
        }
    }

    static boolean o(y yVar) {
        return yVar.getBoolean("google.c.a.e");
    }

    private static PendingIntent p(Context context, y yVar, PendingIntent pendingIntent) {
        return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(yVar.paramsForAnalyticsIntent()).putExtra("pending_intent", pendingIntent));
    }
}
