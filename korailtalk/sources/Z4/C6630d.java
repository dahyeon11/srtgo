package z4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.Formatter;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.kakao.sdk.common.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;
import n4.AbstractC5959j;
import n4.C5950a;
import r4.C6174a;

/* renamed from: z4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6630d {
    private static Intent a(Context context, Intent intent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Stack stack = new Stack();
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "", null)), 0)) {
            t.e(resolveInfo.activityInfo.packageName);
            Intent intent2 = new Intent(intent);
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            stack.add(intent2);
        }
        if (stack.isEmpty()) {
            return Intent.createChooser(intent, "Send Email");
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) stack.remove(0), "Send Email");
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) stack.toArray(new Parcelable[0]));
        return intentCreateChooser;
    }

    public static void callPhone(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static boolean equalsBundles(Bundle bundle, Bundle bundle2) {
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static long getVersionCode(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode() : r1.versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return -1L;
        }
    }

    public static String getVersionName() {
        return C5950a.VERSION_NAME;
    }

    public static boolean isAccessibilityEnable(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean isAppUpdate(String str, String str2) {
        return isMajorUpdate(str, str2) || isMinorUpdate(str, str2);
    }

    public static boolean isMajorUpdate(String str, String str2) {
        return Integer.parseInt(str2.split("\\.")[0]) > Integer.parseInt(str.split("\\.")[0]);
    }

    public static boolean isMinorUpdate(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        strArrSplit[2] = String.format(com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(Integer.parseInt(strArrSplit[2])));
        strArrSplit2[2] = String.format(com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(Integer.parseInt(strArrSplit2[2])));
        return AbstractC6629c.a(".", strArrSplit).compareTo(AbstractC6629c.a(".", strArrSplit2)) < 0;
    }

    public static boolean isNotNull(Object obj) {
        return !isNull(obj);
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isOnlyNumberString(String str) {
        String string = str.toString();
        int i8 = 0;
        while (i8 < 10) {
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append("");
            sb.append(i8);
            String[] strArrSplit = string.split(sb.toString());
            for (String str3 : strArrSplit) {
                str2 = str2 + str3;
            }
            i8++;
            string = str2;
        }
        return string.length() <= 0;
    }

    public static boolean isShouldOverrideUrlLoading(Activity activity, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        t.d("uri - : " + uri + ", scheme : " + scheme + ", authority : " + uri.getAuthority());
        if (str.startsWith("javascript") || str.startsWith("about:blank") || "http".equals(scheme) || Constants.SCHEME.equals(scheme)) {
            return false;
        }
        if ("tel".equals(scheme)) {
            callPhone(activity, str);
        } else if ("market".equals(scheme)) {
            G.moveToGooglePlayByWeb(activity, str);
        } else if ("intent".equals(scheme)) {
            G.playApp(activity, str);
        } else if (activity.getApplicationContext().getString(AbstractC5959j.korailtalk_scheme).equals(uri.getScheme()) && "stnLeadNavi".equals(uri.getAuthority())) {
            G.playApp(activity, G.getIntentScheme(activity.getApplicationContext().getString(AbstractC5959j.station_guide_scheme, "0", uri.getQueryParameter("stnCd")), "com.korail.futuretech.userservice"));
        }
        return true;
    }

    public static void moveToOutSideBrowser(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, "앱 설치를 실패 하였습니다.", 1).show();
        }
    }

    public static void printBundleData(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!isNotNull(bundle)) {
            t.e("bundle is null");
            return;
        }
        t.e("-------------printBundleData start-----------------");
        for (String str : bundle.keySet()) {
            t.e("key : " + str + ", value : " + bundle.get(str));
        }
        t.e("-------------printBundleData end-----------------");
    }

    public static void printByte(Context context, long j8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t.e("formatFileSize = " + Formatter.formatFileSize(context, j8));
    }

    public static void printHashData(HashMap<String, String> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!isNotNull(map)) {
            t.e("bundle is null");
            return;
        }
        t.e("-------------printBundleData start-----------------");
        for (String str : map.keySet()) {
            t.e("key : " + str + " value : " + map.get(str));
        }
        t.e("-------------printBundleData end-----------------");
    }

    public static void runApplicationDetailSetting(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivityForResult(intent, 110);
    }

    public static void runLocationSourceSettings(Activity activity) {
        activity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 111);
    }

    public static void sendReceiptMail(Activity activity, File file, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.EMAIL", new String[0]);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(activity, C6174a.FILE_PROVIDER_AUTHORITIES, file));
        try {
            activity.startActivity(a(activity, intent));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, "이메일 기능을 활성화해주세요.", 0).show();
        }
    }

    public static void syncRailPlus(Context context) {
        Intent intent = new Intent();
        intent.setAction("korail.mobilerailplus.syncreload");
        context.sendBroadcast(intent);
    }
}
