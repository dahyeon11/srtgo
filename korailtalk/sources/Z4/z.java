package z4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class z {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37908a;

        static {
            int[] iArr = new int[K4.a.values().length];
            f37908a = iArr;
            try {
                iArr[K4.a.REAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37908a[K4.a.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37908a[K4.a.STAGING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String getMultiLangWebHost() {
        int i8 = a.f37908a[r4.g.SERVER_TYPE.ordinal()];
        return (i8 == 1 || i8 == 3) ? "https://www.korail.com" : "https://dev5.letskorail.com";
    }

    public static String getPushAddress() {
        int i8 = a.f37908a[r4.g.SERVER_TYPE.ordinal()];
        return i8 != 1 ? (i8 == 2 || i8 == 3) ? r4.g.PUSH_STAGING : r4.g.PUSH_DEV : "smart.letskorail.com";
    }

    public static String getSSLHost() {
        int i8 = a.f37908a[r4.g.SERVER_TYPE.ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? "https://mobiledev.letskorail.com" : "https://dev2.letskorail.com" : "https://dev3.letskorail.com" : "https://smart.letskorail.com";
    }

    public static String getWebHost() {
        int i8 = a.f37908a[r4.g.SERVER_TYPE.ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? "https://mobiledev.letskorail.com" : "https://dev2.letskorail.com" : "https://dev3.letskorail.com" : "https://smart.letskorail.com";
    }

    public static String getWebUrl(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!N.isNull(str2)) {
            sb.append("?");
            sb.append(str2);
        }
        t.e(sb.toString());
        return sb.toString();
    }

    public static boolean isNetworkAvailable(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    public static boolean isNetworkOn(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return !C6630d.isNull(activeNetworkInfo) && activeNetworkInfo.isConnectedOrConnecting();
    }
}
