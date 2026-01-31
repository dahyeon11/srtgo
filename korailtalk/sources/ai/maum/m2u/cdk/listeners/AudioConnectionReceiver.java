package ai.maum.m2u.cdk.listeners;

import ai.maum.m2u.cdk.utils.LogUtil;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class AudioConnectionReceiver extends BroadcastReceiver {
    private static final String TAG = "AudioConnectionReceiver";
    private final AudioConnectionListener listener;

    public AudioConnectionReceiver(AudioConnectionListener audioConnectionListener) {
        this.listener = audioConnectionListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        String action = intent.getAction();
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            boolean z8 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 2;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (z8) {
                LogUtil.d(TAG, "Bluetooth Connected");
                this.listener.onBluetoothConnected(bluetoothDevice);
                return;
            } else {
                LogUtil.d(TAG, "Bluetooth Disconnected");
                this.listener.onBluetoothDisconnected(bluetoothDevice);
                return;
            }
        }
        if ("android.intent.action.HEADSET_PLUG".equals(action)) {
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 0) {
                LogUtil.d(TAG, "Headset Connected");
                this.listener.onWiredSpeakerDisconnected();
            } else if (intExtra != 1) {
                LogUtil.d(TAG, "Unknown Headset");
            } else {
                LogUtil.d(TAG, "Headset Disconnected");
                this.listener.onWiredSpeakerConnected();
            }
        }
    }
}
