package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface AL0 {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i8);

    ByteBuffer zzg(int i8);

    void zzi();

    void zzj(int i8, int i9, int i10, long j8, int i11);

    void zzk(int i8, int i9, C4963yE0 c4963yE0, long j8, int i10);

    void zzl();

    void zzm(int i8, long j8);

    void zzn(int i8, boolean z8);

    void zzo(Surface surface);

    void zzp(Bundle bundle);

    void zzq(int i8);
}
