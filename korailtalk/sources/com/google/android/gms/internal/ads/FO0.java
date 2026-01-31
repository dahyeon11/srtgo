package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class FO0 {

    /* renamed from: a */
    private final Spatializer f13014a;

    /* renamed from: b */
    private final boolean f13015b;

    /* renamed from: c */
    private Handler f13016c;

    /* renamed from: d */
    private Spatializer$OnSpatializerStateChangedListener f13017d;

    private FO0(Spatializer spatializer) {
        this.f13014a = spatializer;
        this.f13015b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static FO0 zza(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new FO0(audioManager.getSpatializer());
    }

    public final void zzb(NO0 no0, Looper looper) {
        if (this.f13017d == null && this.f13016c == null) {
            this.f13017d = new C4869xO0(this, no0);
            final Handler handler = new Handler(looper);
            this.f13016c = handler;
            Spatializer spatializer = this.f13014a;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.wO0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f13017d);
        }
    }

    public final void zzc() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f13017d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.f13016c == null) {
            return;
        }
        this.f13014a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        Handler handler = this.f13016c;
        int i8 = AbstractC2281am0.zza;
        handler.removeCallbacksAndMessages(null);
        this.f13016c = null;
        this.f13017d = null;
    }

    public final boolean zzd(C3940pF0 c3940pF0, Q5 q52) throws IllegalArgumentException {
        int iZzh = AbstractC2281am0.zzh(("audio/eac3-joc".equals(q52.zzn) && q52.zzA == 16) ? 12 : q52.zzA);
        if (iZzh == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzh);
        int i8 = q52.zzB;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        return this.f13014a.canBeSpatialized(c3940pF0.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.f13014a.isAvailable();
    }

    public final boolean zzf() {
        return this.f13014a.isEnabled();
    }

    public final boolean zzg() {
        return this.f13015b;
    }
}
