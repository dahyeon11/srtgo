package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2311b1 implements K1 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18076a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.K1
    public final /* synthetic */ int zzf(UL0 ul0, int i8, boolean z8) {
        return H1.zza(this, ul0, i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final int zzg(UL0 ul0, int i8, boolean z8, int i9) throws EOFException {
        int iZza = ul0.zza(this.f18076a, 0, Math.min(4096, i8));
        if (iZza != -1) {
            return iZza;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzl(Q5 q52) {
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final /* synthetic */ void zzq(C4099qh0 c4099qh0, int i8) {
        H1.zzb(this, c4099qh0, i8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzr(C4099qh0 c4099qh0, int i8, int i9) {
        c4099qh0.zzL(i8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzs(long j8, int i8, int i9, int i10, I1 i12) {
    }
}
