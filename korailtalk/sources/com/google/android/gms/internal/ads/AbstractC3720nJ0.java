package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3720nJ0 {
    public static C4289sJ0 zza(AudioManager audioManager, C3940pF0 c3940pF0) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c3940pF0.zza().zza);
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC1235Cm0.zzf(12)));
        for (int i8 = 0; i8 < directProfilesForAttributes.size(); i8++) {
            AudioProfile audioProfileA = AbstractC3264jJ0.a(directProfilesForAttributes.get(i8));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (AbstractC2281am0.zzK(format) || C4289sJ0.f22618d.containsKey(Integer.valueOf(format))) {
                    Integer numValueOf = Integer.valueOf(format);
                    if (map.containsKey(numValueOf)) {
                        Set set = (Set) map.get(numValueOf);
                        set.getClass();
                        set.addAll(AbstractC1235Cm0.zzf(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(numValueOf, new HashSet(AbstractC1235Cm0.zzf(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        for (Map.Entry entry : map.entrySet()) {
            c2091Xk0.zzf(new C3834oJ0(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C4289sJ0(c2091Xk0.zzi());
    }

    public static AJ0 zzb(AudioManager audioManager, C3940pF0 c3940pF0) {
        if (audioManager == null) {
            throw null;
        }
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c3940pF0.zza().zza);
        if (!audioDevicesForAttributes.isEmpty()) {
            return new AJ0((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        }
        return null;
    }
}
