package ai.maum.m2u.cdk.listeners;

import ai.maum.m2u.cdk.utils.LogUtil;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class IncomingCallReceiver extends BroadcastReceiver {
    private static final String TAG = "IncomingCallReceiver";
    private final IncomingCallListener listener;

    public IncomingCallReceiver(IncomingCallListener incomingCallListener) {
        this.listener = incomingCallListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        String stringExtra = intent.getStringExtra("state");
        this.listener.onNotifyCallStatus(stringExtra);
        LogUtil.i(TAG, "onCallStateChanged: " + stringExtra);
    }
}
