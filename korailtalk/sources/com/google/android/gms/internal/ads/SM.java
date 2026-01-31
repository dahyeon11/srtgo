package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class SM implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TM f16270a;

    SM(TM tm) {
        this.f16270a = tm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfj)).booleanValue()) {
            G1.u.zzo().zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) list.get(0);
            if (interfaceC2065Wv != null) {
                this.f16270a.b(interfaceC2065Wv);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e8) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfj)).booleanValue()) {
                G1.u.zzo().zzw(e8, "omid native display exp");
            }
        }
    }
}
