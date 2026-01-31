package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public class w {
    public static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;

    /* renamed from: e, reason: collision with root package name */
    private static w f25678e;

    /* renamed from: a, reason: collision with root package name */
    private String f25679a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f25680b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f25681c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f25682d = new ArrayDeque();

    private w() {
    }

    private int a(Context context, Intent intent) {
        String strD = d(context, intent);
        if (strD != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3) && strD.length() != 0) {
                "Restricting intent to a specific service: ".concat(strD);
            }
            intent.setClassName(context.getPackageName(), strD);
        }
        try {
            if ((c(context) ? z.startWakefulService(context, intent) : context.startService(intent)) != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return Map.MapException.StatusCode.ROUTER_DA_NOT_FOUND_VALUE;
        } catch (IllegalStateException e8) {
            String strValueOf = String.valueOf(e8);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(strValueOf);
            Log.e("FirebaseInstanceId", sb.toString());
            return Map.MapException.StatusCode.ROUTER_SESSION_INVALID_VALUE;
        } catch (SecurityException e9) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e9);
            return Map.MapException.StatusCode.ROUTER_SESSION_NOT_FOUND_VALUE;
        }
    }

    public static PendingIntent createMessagingPendingIntent(Context context, int i8, Intent intent, int i9) {
        return PendingIntent.getBroadcast(context, i8, e(context, ACTION_MESSAGING_EVENT, intent), i9);
    }

    private synchronized String d(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f25679a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        String strValueOf = String.valueOf(context.getPackageName());
                        String strValueOf2 = String.valueOf(serviceInfo.name);
                        this.f25679a = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                    } else {
                        this.f25679a = serviceInfo.name;
                    }
                    return this.f25679a;
                }
                String str3 = serviceInfo.packageName;
                String str4 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str3);
                sb.append("/");
                sb.append(str4);
                Log.e("FirebaseInstanceId", sb.toString());
                return null;
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static Intent e(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public static synchronized w getInstance() {
        try {
            if (f25678e == null) {
                f25678e = new w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25678e;
    }

    public static void setForTesting(w wVar) {
        f25678e = wVar;
    }

    public static void startMessagingServiceViaReceiver(Context context, Intent intent) {
        context.sendBroadcast(e(context, ACTION_MESSAGING_EVENT, intent));
    }

    public static Intent unwrapServiceIntent(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof Intent) {
            return (Intent) parcelableExtra;
        }
        return null;
    }

    boolean b(Context context) {
        if (this.f25681c == null) {
            this.f25681c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f25680b.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f25681c.booleanValue();
    }

    boolean c(Context context) {
        if (this.f25680b == null) {
            this.f25680b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f25680b.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f25680b.booleanValue();
    }

    public Intent getMessagingEvent() {
        return (Intent) this.f25682d.poll();
    }

    public int startMessagingService(Context context, Intent intent) {
        Log.isLoggable("FirebaseInstanceId", 3);
        this.f25682d.offer(intent);
        Intent intent2 = new Intent(ACTION_MESSAGING_EVENT);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
