package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3533lj0 implements InterfaceC1229Cj0 {
    protected AbstractC3533lj0() {
    }

    public static AbstractC3533lj0 zzc(char c9) {
        return new C3192ij0(c9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229Cj0
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c9);
}
