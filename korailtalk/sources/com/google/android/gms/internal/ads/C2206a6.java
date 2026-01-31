package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2206a6 implements Comparable {
    public final int zza;
    public final U5 zzb;

    public C2206a6(int i8, U5 u52) {
        this.zza = i8;
        this.zzb = u52;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((C2206a6) obj).zza);
    }
}
