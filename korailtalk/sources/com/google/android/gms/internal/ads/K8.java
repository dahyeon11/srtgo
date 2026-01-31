package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class K8 {
    public static double zza(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << AbstractC5358c.CAN) & (-16777216)) | ((r0[1] << AbstractC5358c.DLE) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << AbstractC5358c.CAN) & (-16777216)) | ((r0[1] << AbstractC5358c.DLE) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static int zzc(byte b9) {
        return b9 < 0 ? b9 + 256 : b9;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j8 = byteBuffer.getInt();
        return j8 < 0 ? j8 + 4294967296L : j8;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long jZze = zze(byteBuffer) << 32;
        if (jZze >= 0) {
            return jZze + zze(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
