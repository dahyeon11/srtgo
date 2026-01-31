package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class RU extends AbstractBinderC1855Rq {

    /* renamed from: a */
    final /* synthetic */ TU f16120a;

    protected RU(TU tu) {
        this.f16120a = tu;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1855Rq, com.google.android.gms.internal.ads.InterfaceC1896Sq
    public final void zze(K1.D d9) {
        this.f16120a.f16480a.zzd(d9.zza());
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1855Rq, com.google.android.gms.internal.ads.InterfaceC1896Sq
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.f16120a.f16480a.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
