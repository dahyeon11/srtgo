package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public class CL0 extends C5077zE0 {
    public final DL0 zza;
    public final String zzb;

    public CL0(Throwable th, DL0 dl0) {
        super("Decoder failed: ".concat(String.valueOf(dl0 == null ? null : dl0.zza)), th);
        this.zza = dl0;
        int i8 = AbstractC2281am0.zza;
        this.zzb = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
    }
}
