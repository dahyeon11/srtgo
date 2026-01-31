package D6;

import Q7.X;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginDefine;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f948a = new b();

    private b() {
    }

    public static String getApplicationName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0));
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return "NAVER";
        }
    }

    public static b getBaseInstance() {
        return f948a;
    }

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }

    public static String getPrimaryNaverOAuth2ndAppPackageName(Context context) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(OAuthLoginDefine.ACTION_OAUTH_LOGIN_2NDAPP), 128);
            String str = new String[]{"com.nhn.android.appstore"}[0];
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (!C6.a.isRealVersion()) {
                    C6.a.d("DeviceAppInfo", "package name:" + resolveInfo.activityInfo.packageName + ", " + resolveInfo.activityInfo.name);
                }
                if (resolveInfo.activityInfo.packageName.equals(str)) {
                    return resolveInfo.activityInfo.packageName;
                }
            }
            if (C6.a.isRealVersion()) {
                return null;
            }
            C6.a.d("DeviceAppInfo", "no app assinged in order-list. package name:" + listQueryIntentActivities.get(0).activityInfo.packageName + ", " + listQueryIntentActivities.get(0).activityInfo.name);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUserAgent(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager;
        String packageName;
        String str;
        String str2 = "Android/" + Build.VERSION.RELEASE;
        String str3 = "Model/" + Build.MODEL;
        StringBuilder sb = new StringBuilder();
        String str4 = "";
        sb.append(str2.replaceAll("\\s", ""));
        sb.append(X.SPACE);
        sb.append(str3.replaceAll("\\s", ""));
        String string = sb.toString();
        try {
            try {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 448);
                if (packageInfo.applicationInfo.loadDescription(packageManager) != null) {
                    str = ",appId:" + ((Object) packageInfo.applicationInfo.loadDescription(packageManager));
                } else {
                    str = "";
                }
                return string + X.SPACE + String.format("%s/%s(%d,uid:%d%s)", packageName, packageInfo.versionName, Integer.valueOf(packageInfo.versionCode), Integer.valueOf(packageInfo.applicationInfo.uid), str).replaceAll("\\s", "") + X.SPACE + ("OAuthLoginMod/" + OAuthLogin.getVersion()).replaceAll("\\s", "");
            } catch (PackageManager.NameNotFoundException unused2) {
                str4 = packageName;
                C6.a.e("DeviceAppInfo", "not installed app : " + str4);
                return string;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            return string;
        }
    }

    public static boolean isAppExist(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (context.getPackageManager().getLaunchIntentForPackage(str) != null) {
                return true;
            }
            C6.a.i("DeviceAppInfo", str + " is not installed.");
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean isIntentFilterExist(Context context, String str, String str2) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent(str2), 128)) {
            if (!C6.a.isRealVersion()) {
                C6.a.d("DeviceAppInfo", "intent filter name:" + str2);
                C6.a.d("DeviceAppInfo", "package name:" + resolveInfo.activityInfo.packageName + ", " + resolveInfo.activityInfo.name);
            }
            if (str.equalsIgnoreCase(resolveInfo.activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public String getLocaleString(Context context) {
        String str = "ko_KR";
        try {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            String string = locale.toString();
            try {
                if (TextUtils.isEmpty(string)) {
                    return "ko_KR";
                }
                if (string.equalsIgnoreCase(URLEncoder.encode(string, "utf-8"))) {
                    return string;
                }
                return locale.getLanguage() + "_" + locale.getCountry();
            } catch (Exception unused) {
                str = string;
                return str;
            }
        } catch (Exception unused2) {
        }
    }

    public boolean isKorean(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().startsWith("ko");
    }

    public static boolean isIntentFilterExist(Context context, String str) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(new Intent(str), 128).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ResolveInfo next = it.next();
        if (C6.a.isRealVersion()) {
            return true;
        }
        C6.a.d("DeviceAppInfo", "intent filter name:" + str);
        C6.a.d("DeviceAppInfo", "package name:" + next.activityInfo.packageName + ", " + next.activityInfo.name);
        return true;
    }
}
