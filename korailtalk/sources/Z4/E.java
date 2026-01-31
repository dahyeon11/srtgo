package z4;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.AbstractC0918b;

/* loaded from: classes.dex */
public class E {
    public static int REQUEST_PERMISSION = 0;
    public static int REQUEST_PERMISSION_30 = 30;
    public static int REQUEST_PERMISSION_33 = 33;

    public static boolean checkDefined(Activity activity, String str) {
        t.e("checkDefined permission : " + str + ", " + checkPermission(activity, str) + ", " + AbstractC0918b.shouldShowRequestPermissionRationale(activity, str));
        return checkPermission(activity, str) == -1 && AbstractC0918b.shouldShowRequestPermissionRationale(activity, str);
    }

    public static int checkPermission(Context context, String str) {
        return androidx.core.content.a.checkSelfPermission(context, str);
    }

    public static boolean doNotAskAgain(Activity activity, String str, String str2) {
        t.e("doNotAskAgain permission : " + str + ", " + checkPermission(activity, str) + ", " + AbstractC0918b.shouldShowRequestPermissionRationale(activity, str) + ", " + H.getBoolean(activity, str2));
        return androidx.core.content.a.checkSelfPermission(activity, str) == -1 && !AbstractC0918b.shouldShowRequestPermissionRationale(activity, str) && H.getBoolean(activity, str2);
    }

    public static boolean doNotShowAgainRequiredPermissions(Activity activity) {
        int i8 = Build.VERSION.SDK_INT;
        return i8 >= 33 ? doNotAskAgain(activity, "android.permission.READ_MEDIA_IMAGES", "REQUIRED_PERMISSIONS") : i8 < 30 ? doNotAskAgain(activity, "android.permission.READ_EXTERNAL_STORAGE", "REQUIRED_PERMISSIONS") || doNotAskAgain(activity, "android.permission.WRITE_EXTERNAL_STORAGE", "REQUIRED_PERMISSIONS") : checkPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public static boolean grantRequiredPermissions(Activity activity) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            if (checkPermission(activity, "android.permission.READ_MEDIA_IMAGES") != 0) {
                return false;
            }
        } else if (i8 >= 30) {
            if (checkPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                return false;
            }
        } else if (checkPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0 || checkPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    public static boolean grantedAccessBackgroundLocation(Context context) {
        return Build.VERSION.SDK_INT < 29 || checkPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
    }

    public static boolean grantedLocationPermissions(Activity activity) {
        return checkPermission(activity, "android.permission.ACCESS_COARSE_LOCATION") == 0 && checkPermission(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static String[] requestPermissions() {
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.POST_NOTIFICATIONS"};
    }

    public static String[] requestRequiredPermissions() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : i8 >= 30 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }
}
