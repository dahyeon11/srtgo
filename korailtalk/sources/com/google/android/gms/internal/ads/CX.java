package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.os.RemoteException;
import y1.EnumC6522c;

/* loaded from: classes2.dex */
public final class CX implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12541a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5070zB f12542b;

    CX(Context context, AbstractC5070zB abstractC5070zB) {
        this.f12541a = context;
        this.f12542b = abstractC5070zB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) {
        C3968pY c3968pY = new C3968pY(c4654va0, (InterfaceC1852Ro) c3511lX.zzb, EnumC6522c.APP_OPEN_AD);
        AbstractC4728wB abstractC4728wBZza = this.f12542b.zza(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new C2922gK(c3968pY, null), new C4842xB(c4654va0.zzab));
        c3968pY.zzb(abstractC4728wBZza.zzc());
        ((BinderC2942gY) c3511lX.zzc).zzc(abstractC4728wBZza.zzj());
        return abstractC4728wBZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        try {
            ((InterfaceC1852Ro) c3511lX.zzb).zzq(c4654va0.zzaa);
            ((InterfaceC1852Ro) c3511lX.zzb).zzi(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f12541a), new BX(c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc);
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Remote exception loading an app open RTB ad", e8);
            throw new C2112Ya0(e8);
        }
    }
}
