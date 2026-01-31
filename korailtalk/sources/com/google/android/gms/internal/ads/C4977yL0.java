package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.yL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4977yL0 {
    public final DL0 zza;
    public final MediaFormat zzb;
    public final Q5 zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private C4977yL0(DL0 dl0, MediaFormat mediaFormat, Q5 q52, Surface surface, MediaCrypto mediaCrypto, int i8) {
        this.zza = dl0;
        this.zzb = mediaFormat;
        this.zzc = q52;
        this.zzd = surface;
    }

    public static C4977yL0 zza(DL0 dl0, MediaFormat mediaFormat, Q5 q52, MediaCrypto mediaCrypto) {
        return new C4977yL0(dl0, mediaFormat, q52, null, null, 0);
    }

    public static C4977yL0 zzb(DL0 dl0, MediaFormat mediaFormat, Q5 q52, Surface surface, MediaCrypto mediaCrypto) {
        return new C4977yL0(dl0, mediaFormat, q52, surface, null, 0);
    }
}
