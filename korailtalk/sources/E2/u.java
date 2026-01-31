package e2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30291a;

    /* renamed from: b, reason: collision with root package name */
    private int f30292b;

    /* renamed from: c, reason: collision with root package name */
    private int f30293c = 0;

    public u(Context context) {
        this.f30291a = context;
    }

    private final PackageInfo a(String str) {
        try {
            return q2.e.packageManager(this.f30291a).getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e8) {
            String strValueOf = String.valueOf(e8);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("Metadata", sb.toString());
            return null;
        }
    }

    public final synchronized int zza() {
        int i8 = this.f30293c;
        if (i8 != 0) {
            return i8;
        }
        PackageManager packageManager = this.f30291a.getPackageManager();
        if (q2.e.packageManager(this.f30291a).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!o2.n.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f30293c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f30293c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (o2.n.isAtLeastO()) {
            this.f30293c = 2;
        } else {
            this.f30293c = 1;
        }
        return this.f30293c;
    }

    public final synchronized int zzb() {
        PackageInfo packageInfoA;
        try {
            if (this.f30292b == 0 && (packageInfoA = a("com.google.android.gms")) != null) {
                this.f30292b = packageInfoA.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f30292b;
    }
}
