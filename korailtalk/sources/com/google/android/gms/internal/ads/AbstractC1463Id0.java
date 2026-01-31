package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Id0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1463Id0 {
    public static void zza(MediaFormat mediaFormat, String str, int i8) {
        if (i8 != -1) {
            mediaFormat.setInteger(str, i8);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mediaFormat.setByteBuffer("csd-" + i8, ByteBuffer.wrap((byte[]) list.get(i8)));
        }
    }
}
