package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ED0 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private PD0 f12795a;

    public static void zza(PD0 pd0, PD0 pd02) {
        ED0 ed0 = (ED0) pd0;
        if (ed0.f12795a != null) {
            throw new IllegalStateException();
        }
        ed0.f12795a = pd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final Object zzb() {
        PD0 pd0 = this.f12795a;
        if (pd0 != null) {
            return pd0.zzb();
        }
        throw new IllegalStateException();
    }
}
