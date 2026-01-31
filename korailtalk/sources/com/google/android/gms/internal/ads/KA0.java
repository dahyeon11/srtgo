package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class KA0 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f13758a;

    KA0(Unsafe unsafe) {
        this.f13758a = unsafe;
    }

    public abstract byte zza(long j8);

    public abstract double zzb(Object obj, long j8);

    public abstract float zzc(Object obj, long j8);

    public abstract void zzd(long j8, byte[] bArr, long j9, long j10);

    public abstract void zze(Object obj, long j8, boolean z8);

    public abstract void zzf(Object obj, long j8, byte b9);

    public abstract void zzg(Object obj, long j8, double d9);

    public abstract void zzh(Object obj, long j8, float f8);

    public abstract boolean zzi(Object obj, long j8);
}
