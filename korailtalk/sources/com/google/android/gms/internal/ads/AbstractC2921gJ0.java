package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.gJ0 */
/* loaded from: classes2.dex */
abstract class AbstractC2921gJ0 {
    public static int zza(int i8, int i9, C3940pF0 c3940pF0) {
        for (int i10 = 10; i10 > 0; i10--) {
            int iZzh = AbstractC2281am0.zzh(i10);
            if (iZzh != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i9).setChannelMask(iZzh).build(), c3940pF0.zza().zza)) {
                return i10;
            }
        }
        return 0;
    }

    public static AbstractC2394bl0 zzb(C3940pF0 c3940pF0) {
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        AbstractC3311jm0 it = C4289sJ0.f22618d.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (AbstractC2281am0.zza >= AbstractC2281am0.zzg(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c3940pF0.zza().zza)) {
                c2091Xk0.zzf(num);
            }
        }
        c2091Xk0.zzf(2);
        return c2091Xk0.zzi();
    }
}
