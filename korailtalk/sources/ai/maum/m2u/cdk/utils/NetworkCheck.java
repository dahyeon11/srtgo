package ai.maum.m2u.cdk.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/* loaded from: classes.dex */
public class NetworkCheck {
    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                return true;
            }
            Toast.makeText((Activity) context, "Network connection failure.", 1).show();
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
