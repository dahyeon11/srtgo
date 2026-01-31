package ai.maum.m2u.cdk.listeners;

import Q7.C0709m;
import ai.maum.m2u.cdk.utils.LogUtil;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ScreenLockReceiver extends BroadcastReceiver {
    private static final String TAG = IncomingCallReceiver.class.getSimpleName();
    private final ScreenLockListener listener;

    public ScreenLockReceiver(ScreenLockListener screenLockListener) {
        this.listener = screenLockListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            LogUtil.d(TAG, "Screen ON");
            this.listener.onScreenLockChanged(C0709m.ON);
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            LogUtil.d(TAG, "Screen OFF");
            this.listener.onScreenLockChanged(C0709m.OFF);
        } else if ("android.intent.action.USER_PRESENT".equals(action)) {
            LogUtil.d(TAG, "Screen unlocked");
            this.listener.onScreenLockChanged("unlocked");
        }
    }
}
