package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.yE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4963yE0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f23860a;

    /* renamed from: b, reason: collision with root package name */
    private final C4849xE0 f23861b;
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;

    public C4963yE0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f23860a = cryptoInfo;
        this.f23861b = AbstractC2281am0.zza >= 24 ? new C4849xE0(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.f23860a;
    }

    public final void zzb(int i8) {
        if (i8 == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.f23860a.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i8;
    }

    public final void zzc(int i8, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i9, int i10, int i11) {
        this.zzf = i8;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i9;
        this.zzg = i10;
        this.zzh = i11;
        MediaCodec.CryptoInfo cryptoInfo = this.f23860a;
        cryptoInfo.numSubSamples = i8;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i9;
        if (AbstractC2281am0.zza >= 24) {
            C4849xE0 c4849xE0 = this.f23861b;
            c4849xE0.getClass();
            C4849xE0.a(c4849xE0, i10, i11);
        }
    }
}
