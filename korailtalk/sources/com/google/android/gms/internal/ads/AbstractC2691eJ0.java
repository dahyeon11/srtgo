package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.eJ0 */
/* loaded from: classes2.dex */
abstract class AbstractC2691eJ0 {
    private static AbstractC2967gl0 a() {
        C2852fl0 c2852fl0 = new C2852fl0();
        c2852fl0.zzg(8, 7);
        int i8 = AbstractC2281am0.zza;
        if (i8 >= 31) {
            c2852fl0.zzg(26, 27);
        }
        if (i8 >= 33) {
            c2852fl0.zzf(30);
        }
        return c2852fl0.zzi();
    }

    public static boolean zza(AudioManager audioManager, AJ0 aj0) {
        AudioDeviceInfo[] devices;
        if (aj0 == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{aj0.zza};
        }
        AbstractC2967gl0 abstractC2967gl0A = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC2967gl0A.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
