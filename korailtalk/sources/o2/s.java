package o2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import f2.C5403m;

/* loaded from: classes.dex */
public abstract class s {
    public static boolean isGooglePlayServicesUid(Context context, int i8) throws PackageManager.NameNotFoundException {
        if (!uidHasPackageName(context, i8, "com.google.android.gms")) {
            return false;
        }
        try {
            return C5403m.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    public static boolean uidHasPackageName(Context context, int i8, String str) {
        return q2.e.packageManager(context).zza(i8, str);
    }
}
