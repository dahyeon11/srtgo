package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.bM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2354bM0 implements ZL0 {
    /* synthetic */ C2354bM0(AbstractC2239aM0 abstractC2239aM0) {
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final MediaCodecInfo zzb(int i8) {
        return MediaCodecList.getCodecInfoAt(i8);
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final boolean zze() {
        return false;
    }
}
