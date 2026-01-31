package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sV */
/* loaded from: classes2.dex */
final class C4306sV implements InterfaceC1319En0 {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1896Sq f22656a;

    C4306sV(BinderC4534uV binderC4534uV, InterfaceC1896Sq interfaceC1896Sq) {
        this.f22656a = interfaceC1896Sq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        try {
            this.f22656a.zze(K1.D.zzb(th));
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Ad service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f22656a.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Ad service can't call client", e8);
        }
    }
}
