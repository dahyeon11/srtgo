package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class HT extends AbstractBinderC1978Uq {

    /* renamed from: a */
    final /* synthetic */ IT f13324a;

    protected HT(IT it) {
        this.f13324a = it;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1978Uq, com.google.android.gms.internal.ads.InterfaceC2019Vq
    public final void zze(K1.D d9) {
        this.f13324a.f13466a.zzd(d9.zza());
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1978Uq, com.google.android.gms.internal.ads.InterfaceC2019Vq
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        IT it = this.f13324a;
        it.f13466a.zzc(new ZT(autoCloseInputStream, it.f13470e));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1978Uq, com.google.android.gms.internal.ads.InterfaceC2019Vq
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, C2519cr c2519cr) {
        this.f13324a.f13466a.zzc(new ZT(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2519cr));
    }
}
