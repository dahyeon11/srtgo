package com.h2osystech.smartalimi.servicealimi;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class RestartReceiver extends BroadcastReceiver {
    public static final String ACTION_RESTART_SERVICE = "RestartReceiver.serviceRestart";
    final String TAG = "RestartReceiver";

    public boolean isServiceRunningCheck(Context context, String str) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION_RESTART_SERVICE)) {
            if (Build.VERSION.SDK_INT >= 26) {
                LogFile.log("RestartReceiver", 1, "Polling Proc Oreo ...." + MessageManager.class.getName());
                if (!isServiceRunningCheck(context, MessageManager.class.getName())) {
                    return;
                }
            }
            Intent intent2 = new Intent(context, (Class<?>) MessageManager.class);
            intent2.setType(BuildConfig.FLAVOR + Const.SERVICE_START_INTENTNAME);
            intent2.putExtra(Const.SERVICE_START_INTENTNAME, 2);
            LogFile.log("RestartReceiver", 4, "Alarm Start Receiver intentName[" + Const.SERVICE_START_INTENTNAME + "][" + BuildConfig.FLAVOR + "][2]");
            context.startService(intent2);
        }
    }
}
