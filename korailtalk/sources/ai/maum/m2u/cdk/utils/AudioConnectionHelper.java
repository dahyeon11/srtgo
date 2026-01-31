package ai.maum.m2u.cdk.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.core.content.a;

/* loaded from: classes.dex */
public class AudioConnectionHelper {
    private static final String TAG = "AudioConnectionHelper";

    public static void disableBluetoothSco(AudioManager audioManager) throws Throwable {
        if (audioManager != null) {
            audioManager.setMode(3);
            audioManager.setBluetoothScoOn(false);
            audioManager.stopBluetoothSco();
            audioManager.setSpeakerphoneOn(true);
            LogUtil.i(TAG, "Bluetooth SCO disabled");
        }
    }

    public static void enableBluetoothSco(AudioManager audioManager) throws Throwable {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (audioManager == null || defaultAdapter == null || !defaultAdapter.isEnabled()) {
            LogUtil.w(TAG, "Bluetooth Adapter is null or Bluetooth is off");
            return;
        }
        if (audioManager.isBluetoothScoOn()) {
            LogUtil.i(TAG, "Bluetooth SCO already enabled");
            return;
        }
        audioManager.setMode(3);
        audioManager.startBluetoothSco();
        audioManager.setBluetoothScoOn(true);
        audioManager.setSpeakerphoneOn(false);
    }

    private static String getDeviceTypeName(int i8) {
        if (i8 == 1) {
            return "Earpiece";
        }
        if (i8 == 2) {
            return "Main Speaker";
        }
        if (i8 == 3) {
            return "Wired Headset";
        }
        if (i8 == 4) {
            return "Wired Headphones";
        }
        if (i8 == 7) {
            return "Bluetooth (SCO)";
        }
        if (i8 == 8) {
            return "Bluetooth (A2DP)";
        }
        if (i8 == 9) {
            return "HDMI Audio";
        }
        if (i8 == 11) {
            return "USB Audio";
        }
        if (i8 == 22) {
            return "USB Headset";
        }
        if (i8 == 24) {
            return "Safe Mode Speaker";
        }
        return "Unknown Device (" + i8 + ")";
    }

    public static boolean hasAdditionalSpeakers(AudioManager audioManager) {
        if (audioManager == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            int type = audioDeviceInfo.getType();
            if (type != 2 && type != 1 && isWiredSpeaker(type)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBluetoothHeadsetConnected(Context context) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return ((Build.VERSION.SDK_INT < 31 && !"S".equals(Build.VERSION.CODENAME)) || a.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0) && defaultAdapter != null && defaultAdapter.isEnabled() && defaultAdapter.getProfileConnectionState(1) == 2;
    }

    private static boolean isWiredSpeaker(int i8) {
        return i8 == 3 || i8 == 4 || i8 == 22;
    }
}
