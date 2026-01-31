package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2420bz {

    /* renamed from: a, reason: collision with root package name */
    private final J1 f18216a = new J1();

    public final C2420bz zza(int i8) {
        this.f18216a.zza(i8);
        return this;
    }

    public final C2420bz zzb(C2558dA c2558dA) {
        L2 l22 = c2558dA.f18537a;
        for (int i8 = 0; i8 < l22.zzb(); i8++) {
            this.f18216a.zza(l22.zza(i8));
        }
        return this;
    }

    public final C2420bz zzc(int... iArr) {
        for (int i8 = 0; i8 < 20; i8++) {
            this.f18216a.zza(iArr[i8]);
        }
        return this;
    }

    public final C2420bz zzd(int i8, boolean z8) {
        if (z8) {
            this.f18216a.zza(i8);
        }
        return this;
    }

    public final C2558dA zze() {
        return new C2558dA(this.f18216a.zzb(), null);
    }
}
