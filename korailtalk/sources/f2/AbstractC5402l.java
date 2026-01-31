package f2;

import Q7.C0709m;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import i2.AbstractC5683p;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: f2.l */
/* loaded from: classes.dex */
public abstract class AbstractC5402l {
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    /* renamed from: b */
    private static boolean f30575b = false;

    /* renamed from: c */
    static boolean f30576c = false;

    /* renamed from: a */
    static final AtomicBoolean f30574a = new AtomicBoolean();

    /* renamed from: d */
    private static final AtomicBoolean f30577d = new AtomicBoolean();

    static boolean a(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (o2.n.isAtLeastLollipop()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (f30574a.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }

    public static void enableUsingApkIndependentContext() {
        f30577d.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i8) throws C5400j, C5399i {
        int iIsGooglePlayServicesAvailable = C5398h.getInstance().isGooglePlayServicesAvailable(context, i8);
        if (iIsGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = C5398h.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iIsGooglePlayServicesAvailable);
            if (errorResolutionIntent != null) {
                throw new C5400j(iIsGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
            }
            throw new C5399i(iIsGooglePlayServicesAvailable);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        AbstractC5683p.checkState(true);
        return o2.e.getClientVersion(context, context.getPackageName());
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i8, Context context, int i9) {
        return C5398h.getInstance().getErrorResolutionPendingIntent(context, i8, i9);
    }

    @Deprecated
    public static String getErrorString(int i8) {
        return C5392b.b(i8);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i8) {
        return C5398h.getInstance().getErrorResolutionIntent(null, i8, null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!f30576c) {
                try {
                    PackageInfo packageInfo = q2.e.packageManager(context).getPackageInfo("com.google.android.gms", 64);
                    C5403m.getInstance(context);
                    if (packageInfo == null || C5403m.zzb(packageInfo, false) || !C5403m.zzb(packageInfo, true)) {
                        f30575b = false;
                    } else {
                        f30575b = true;
                    }
                    f30576c = true;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
                    f30576c = true;
                }
            }
            return f30575b || !o2.j.isUserBuild();
        } catch (Throwable th) {
            f30576c = true;
            throw th;
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i8) {
        return o2.s.isGooglePlayServicesUid(context, i8);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i8) {
        if (i8 == 18) {
            return true;
        }
        if (i8 == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i8) {
        if (i8 == 9) {
            return a(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context context) {
        if (!o2.n.isAtLeastJellyBeanMR2()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        AbstractC5683p.checkNotNull(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && C0709m.TRUE.equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return o2.j.isSidewinder(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i8) {
        return i8 == 1 || i8 == 2 || i8 == 3 || i8 == 9;
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i8, String str) {
        return o2.s.uidHasPackageName(context, i8, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00b2  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int isGooglePlayServicesAvailable(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.AbstractC5402l.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }
}
