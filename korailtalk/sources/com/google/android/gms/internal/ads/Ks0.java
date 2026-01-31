package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class Ks0 {
    public static final Mx0 zza = Mx0.zzb(new byte[0]);

    public static final Mx0 zza(int i8) {
        return Mx0.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i8).array());
    }

    public static final Mx0 zzb(int i8) {
        return Mx0.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i8).array());
    }
}
