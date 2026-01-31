package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class NL0 extends Exception {
    public final String zza;
    public final boolean zzb;
    public final DL0 zzc;
    public final String zzd;
    public final NL0 zze;

    public NL0(Q5 q52, Throwable th, boolean z8, int i8) {
        this("Decoder init failed: [" + i8 + "], " + q52.toString(), th, q52.zzn, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i8), null);
    }

    static /* bridge */ /* synthetic */ NL0 a(NL0 nl0, NL0 nl02) {
        return new NL0(nl0.getMessage(), nl0.getCause(), nl0.zza, false, nl0.zzc, nl0.zzd, nl02);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NL0(Q5 q52, Throwable th, boolean z8, DL0 dl0) {
        String str = "Decoder init failed: " + dl0.zza + ", " + q52.toString();
        String str2 = q52.zzn;
        int i8 = AbstractC2281am0.zza;
        this(str, th, str2, false, dl0, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private NL0(String str, Throwable th, String str2, boolean z8, DL0 dl0, String str3, NL0 nl0) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = dl0;
        this.zzd = str3;
        this.zze = nl0;
    }
}
