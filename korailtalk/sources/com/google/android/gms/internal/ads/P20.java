package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class P20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f15190a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15191b;

    public P20(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context) {
        this.f15190a = interfaceExecutorServiceC1974Un0;
        this.f15191b = context;
    }

    final /* synthetic */ Q20 a() {
        int iZzj;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.f15191b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkV)).booleanValue()) {
            iZzj = G1.u.zzq().zzj(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iZzj = -1;
            streamMaxVolume = -1;
        }
        return new Q20(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iZzj, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), G1.u.zzr().zza(), G1.u.zzr().zze());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f15190a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.O20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
