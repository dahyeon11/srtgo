package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25667a;

    /* renamed from: b, reason: collision with root package name */
    private String f25668b;

    /* renamed from: c, reason: collision with root package name */
    private String f25669c;

    /* renamed from: d, reason: collision with root package name */
    private int f25670d;

    /* renamed from: e, reason: collision with root package name */
    private int f25671e = 0;

    public r(Context context) {
        this.f25667a = context;
    }

    private PackageInfo a(String str) {
        try {
            return this.f25667a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e8) {
            String strValueOf = String.valueOf(e8);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    private synchronized void b() {
        PackageInfo packageInfoA = a(this.f25667a.getPackageName());
        if (packageInfoA != null) {
            this.f25668b = Integer.toString(packageInfoA.versionCode);
            this.f25669c = packageInfoA.versionName;
        }
    }

    public static String getDefaultSenderId(l3.c cVar) {
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

    public synchronized String getAppVersionCode() {
        try {
            if (this.f25668b == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25668b;
    }

    public synchronized String getAppVersionName() {
        try {
            if (this.f25669c == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25669c;
    }

    public synchronized int getGmsVersionCode() {
        PackageInfo packageInfoA;
        try {
            if (this.f25670d == 0 && (packageInfoA = a("com.google.android.gms")) != null) {
                this.f25670d = packageInfoA.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25670d;
    }

    public synchronized int getIidImplementation() {
        int i8 = this.f25671e;
        if (i8 != 0) {
            return i8;
        }
        PackageManager packageManager = this.f25667a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!o2.n.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f25671e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f25671e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (o2.n.isAtLeastO()) {
            this.f25671e = 2;
        } else {
            this.f25671e = 1;
        }
        return this.f25671e;
    }

    public boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }
}
