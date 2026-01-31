package com.nhn.android.idp.common.connection;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.widget.Toast;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f29614a = false;

    static class a implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f29615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f29616b;

        a(Context context, d dVar) {
            this.f29615a = context;
            this.f29616b = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            boolean unused = b.f29614a = false;
            Context context = this.f29615a;
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            this.f29616b.onResult(true);
        }
    }

    /* renamed from: com.nhn.android.idp.common.connection.b$b, reason: collision with other inner class name */
    static class DialogInterfaceOnClickListenerC0263b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f29617a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f29618b;

        DialogInterfaceOnClickListenerC0263b(Context context, d dVar) {
            this.f29617a = context;
            this.f29618b = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            boolean unused = b.f29614a = false;
            Context context = this.f29617a;
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            this.f29618b.onResult(false);
        }
    }

    static class c implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f29619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f29620b;

        c(Context context, d dVar) {
            this.f29619a = context;
            this.f29620b = dVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            boolean unused = b.f29614a = false;
            Context context = this.f29619a;
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            this.f29620b.onResult(false);
        }
    }

    public interface d {
        void onResult(boolean z8);
    }

    private static boolean b(Context context, int i8) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    if (networkInfo != null && i8 == networkInfo.getType() && networkInfo.isConnected()) {
                        return true;
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return false;
    }

    public static boolean checkConnectivity(Context context, boolean z8, d dVar) {
        if (isDataConnected(context)) {
            return true;
        }
        if (z8) {
            if (dVar == null) {
                Toast.makeText(context, context.getString(E6.d.naveroauthlogin_string_network_state_not_available), 1).show();
                return false;
            }
            showRetry(context, dVar);
        }
        return false;
    }

    public static String getNetworkState(Context context) {
        return is3GConnected(context) ? "cell" : isWifiConnected(context) ? "wifi" : "other";
    }

    public static boolean is3GConnected(Context context) {
        return b(context, 0);
    }

    public static boolean isDataConnected(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null) {
                if (connectivityManager.getActiveNetworkInfo().isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return true;
        }
    }

    public static boolean isWifiConnected(Context context) {
        return b(context, 1);
    }

    public static void showRetry(Context context, d dVar) {
        if (f29614a || context == null) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        f29614a = true;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.ic_dialog_alert);
        builder.setMessage(context.getString(E6.d.naveroauthlogin_string_network_state_not_available));
        builder.setPositiveButton(context.getString(E6.d.retry), new a(context, dVar));
        builder.setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0263b(context, dVar));
        builder.setOnCancelListener(new c(context, dVar));
        try {
            builder.show();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
