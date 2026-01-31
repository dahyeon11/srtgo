package f2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.kakao.sdk.user.Constants;

/* renamed from: f2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5398h {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = AbstractC5402l.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: a, reason: collision with root package name */
    private static final C5398h f30572a = new C5398h();

    C5398h() {
    }

    public static C5398h getInstance() {
        return f30572a;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        AbstractC5402l.cancelAvailabilityErrorNotifications(context);
    }

    public int getApkVersion(Context context) {
        return AbstractC5402l.getApkVersion(context);
    }

    public int getClientVersion(Context context) {
        return AbstractC5402l.getClientVersion(context);
    }

    @Deprecated
    public Intent getErrorResolutionIntent(int i8) {
        return getErrorResolutionIntent(null, i8, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i8, int i9) {
        return getErrorResolutionPendingIntent(context, i8, i9, null);
    }

    public String getErrorString(int i8) {
        return AbstractC5402l.getErrorString(i8);
    }

    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i8) {
        return AbstractC5402l.isPlayServicesPossiblyUpdating(context, i8);
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int i8) {
        return AbstractC5402l.isPlayStorePossiblyUpdating(context, i8);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return AbstractC5402l.a(context, str);
    }

    public boolean isUserResolvableError(int i8) {
        return AbstractC5402l.isUserRecoverableError(i8);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int i8) {
        AbstractC5402l.ensurePlayServicesAvailable(context, i8);
    }

    public Intent getErrorResolutionIntent(Context context, int i8, String str) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && o2.j.isWearableWithoutPlayStore(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append(g5.e.STATE_NAME_NONE);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(g5.e.STATE_NAME_NONE);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(g5.e.STATE_NAME_NONE);
        if (context != null) {
            try {
                sb.append(q2.e.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(Constants.ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i8, int i9, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i8, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i9, errorResolutionIntent, z2.o.zza | 134217728);
    }

    public int isGooglePlayServicesAvailable(Context context, int i8) {
        int iIsGooglePlayServicesAvailable = AbstractC5402l.isGooglePlayServicesAvailable(context, i8);
        if (AbstractC5402l.isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable)) {
            return 18;
        }
        return iIsGooglePlayServicesAvailable;
    }
}
