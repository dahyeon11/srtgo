package ai.maum.m2u.cdk.listeners;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes.dex */
public interface AudioConnectionListener {
    void onBluetoothConnected(BluetoothDevice bluetoothDevice);

    void onBluetoothDisconnected(BluetoothDevice bluetoothDevice);

    void onWiredSpeakerConnected();

    void onWiredSpeakerDisconnected();
}
