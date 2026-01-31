package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Gz0 implements Nz0 {

    /* renamed from: a, reason: collision with root package name */
    private final Nz0[] f13219a;

    Gz0(Nz0... nz0Arr) {
        this.f13219a = nz0Arr;
    }

    @Override // com.google.android.gms.internal.ads.Nz0
    public final Mz0 zzb(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            Nz0 nz0 = this.f13219a[i8];
            if (nz0.zzc(cls)) {
                return nz0.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.Nz0
    public final boolean zzc(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f13219a[i8].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
