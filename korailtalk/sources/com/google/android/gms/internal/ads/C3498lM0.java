package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.lM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3498lM0 implements BL0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f20653a;

    public C3498lM0(MediaCodec mediaCodec) {
        this.f20653a = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzd(int i8, int i9, int i10, long j8, int i11) throws MediaCodec.CryptoException {
        this.f20653a.queueInputBuffer(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zze(int i8, int i9, C4963yE0 c4963yE0, long j8, int i10) throws MediaCodec.CryptoException {
        this.f20653a.queueSecureInputBuffer(i8, 0, c4963yE0.zza(), j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzf(Bundle bundle) {
        this.f20653a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzh() {
    }
}
