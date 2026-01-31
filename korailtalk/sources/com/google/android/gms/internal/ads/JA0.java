package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class JA0 extends KA0 {
    JA0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final byte zza(long j8) {
        return Memory.peekByte(j8);
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final double zzb(Object obj, long j8) {
        return Double.longBitsToDouble(this.f13758a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final float zzc(Object obj, long j8) {
        return Float.intBitsToFloat(this.f13758a.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final void zzd(long j8, byte[] bArr, long j9, long j10) {
        Memory.peekByteArray(j8, bArr, (int) j9, (int) j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.MA0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.MA0.t(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.MA0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.MA0.t(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.KA0
    public final void zze(Object obj, long j8, boolean z8) {
        if (MA0.f14551i) {
            MA0.s(obj, j8, z8);
        } else {
            MA0.t(obj, j8, z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final void zzf(Object obj, long j8, byte b9) {
        if (MA0.f14551i) {
            MA0.g(obj, j8, b9);
        } else {
            MA0.h(obj, j8, b9);
        }
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final void zzg(Object obj, long j8, double d9) {
        this.f13758a.putLong(obj, j8, Double.doubleToLongBits(d9));
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final void zzh(Object obj, long j8, float f8) {
        this.f13758a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.ads.KA0
    public final boolean zzi(Object obj, long j8) {
        return MA0.f14551i ? MA0.E(obj, j8) : MA0.F(obj, j8);
    }
}
