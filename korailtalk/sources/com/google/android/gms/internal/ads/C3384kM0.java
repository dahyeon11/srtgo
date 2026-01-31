package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.kM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3384kM0 implements AL0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f20396a;

    /* synthetic */ C3384kM0(MediaCodec mediaCodec, AbstractC3270jM0 abstractC3270jM0) {
        this.f20396a = mediaCodec;
        int i8 = AbstractC2281am0.zza;
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final int zza() {
        return this.f20396a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f20396a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                int i8 = AbstractC2281am0.zza;
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final MediaFormat zzc() {
        return this.f20396a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final ByteBuffer zzf(int i8) {
        int i9 = AbstractC2281am0.zza;
        return this.f20396a.getInputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final ByteBuffer zzg(int i8) {
        int i9 = AbstractC2281am0.zza;
        return this.f20396a.getOutputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzi() {
        this.f20396a.flush();
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzj(int i8, int i9, int i10, long j8, int i11) throws MediaCodec.CryptoException {
        this.f20396a.queueInputBuffer(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzk(int i8, int i9, C4963yE0 c4963yE0, long j8, int i10) throws MediaCodec.CryptoException {
        this.f20396a.queueSecureInputBuffer(i8, 0, c4963yE0.zza(), j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzl() {
        this.f20396a.release();
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzm(int i8, long j8) {
        this.f20396a.releaseOutputBuffer(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzn(int i8, boolean z8) {
        this.f20396a.releaseOutputBuffer(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzo(Surface surface) {
        this.f20396a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzp(Bundle bundle) {
        this.f20396a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzq(int i8) {
        this.f20396a.setVideoScalingMode(i8);
    }
}
