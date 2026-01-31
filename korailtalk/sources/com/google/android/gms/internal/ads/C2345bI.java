package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2345bI implements YG {

    /* renamed from: a, reason: collision with root package name */
    private int f18108a = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzbh)).intValue();

    public final synchronized int zzc() {
        return this.f18108a;
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final synchronized void zzdo(C1457Ia0 c1457Ia0) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbi)).booleanValue()) {
            try {
                this.f18108a = c1457Ia0.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }
}
