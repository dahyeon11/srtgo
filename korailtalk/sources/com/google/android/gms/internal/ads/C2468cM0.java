package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.cM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2468cM0 implements ZL0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18298a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f18299b;

    public C2468cM0(boolean z8, boolean z9) {
        int i8 = 1;
        if (!z8 && !z9) {
            i8 = 0;
        }
        this.f18298a = i8;
    }

    private final void a() {
        if (this.f18299b == null) {
            this.f18299b = new MediaCodecList(this.f18298a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final int zza() {
        a();
        return this.f18299b.length;
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final MediaCodecInfo zzb(int i8) {
        a();
        return this.f18299b[i8];
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final boolean zze() {
        return true;
    }
}
