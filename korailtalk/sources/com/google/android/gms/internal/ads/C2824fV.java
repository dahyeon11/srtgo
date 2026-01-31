package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fV, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2824fV implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2019Vq f19189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2519cr f19190b;

    C2824fV(BinderC3281jV binderC3281jV, InterfaceC2019Vq interfaceC2019Vq, C2519cr c2519cr) {
        this.f19189a = interfaceC2019Vq;
        this.f19190b = c2519cr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        try {
            this.f19189a.zze(K1.D.zzb(th));
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue()) {
                this.f19189a.zzg(parcelFileDescriptor, this.f19190b);
            } else {
                this.f19189a.zzf(parcelFileDescriptor);
            }
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Service can't call client", e8);
        }
    }
}
