package com.h2osystech.smartalimi.servicealimi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;

/* loaded from: classes2.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {
    private static final String TAG = "NetworkStatusReceiver";
    private OnChangeNetworkStatusListener m_OnChangeNetworkStatusListener = null;

    public interface OnChangeNetworkStatusListener {
        void OnChanged(int i8);
    }

    public static int isOnline(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 0 && activeNetworkInfo.isConnectedOrConnecting() && activeNetworkInfo.isAvailable()) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnectedOrConnecting() && activeNetworkInfo.isAvailable()) {
                return 1;
            }
            if (activeNetworkInfo.isConnectedOrConnecting()) {
                if (activeNetworkInfo.isAvailable()) {
                    return 1;
                }
            }
            return -1;
        } catch (Exception unused) {
            LogFile.log(TAG, 2, "Check Network Error!!!!");
            return -1;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        OnChangeNetworkStatusListener onChangeNetworkStatusListener;
        intent.getAction();
        if (isOnline(context) != 1 && this.m_OnChangeNetworkStatusListener != null) {
            LogFile.log(TAG, 4, "Network DisConn try flag = ");
            this.m_OnChangeNetworkStatusListener.OnChanged(-1);
            return;
        }
        LogFile.log(TAG, 4, "Network Conn try");
        if (isOnline(context) == 1 && (onChangeNetworkStatusListener = this.m_OnChangeNetworkStatusListener) != null) {
            onChangeNetworkStatusListener.OnChanged(1);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: Build.VERSION_CODES.O ");
            sb.append(i8);
            AlimiInterface alimiInterface = new AlimiInterface(context);
            if (Const.getUserID().isEmpty() || Const.getGcmRegID().isEmpty()) {
                return;
            }
            alimiInterface.getNewMessageAndNoti(true);
        }
    }

    public void setOnChangeNetworkStatusListener(OnChangeNetworkStatusListener onChangeNetworkStatusListener) {
        this.m_OnChangeNetworkStatusListener = onChangeNetworkStatusListener;
    }
}
