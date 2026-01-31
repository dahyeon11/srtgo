package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.os.RemoteException;
import y1.EnumC6522c;

/* renamed from: com.google.android.gms.internal.ads.vY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4651vY implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23257a;

    /* renamed from: b, reason: collision with root package name */
    private final EK f23258b;

    public C4651vY(Context context, EK ek) {
        this.f23257a = context;
        this.f23258b = ek;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) {
        C3968pY c3968pY = new C3968pY(c4654va0, (InterfaceC1852Ro) c3511lX.zzb, EnumC6522c.INTERSTITIAL);
        AbstractC2578dK abstractC2578dKZze = this.f23258b.zze(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new C2922gK(c3968pY, null));
        c3968pY.zzb(abstractC2578dKZze.zzc());
        ((BinderC2942gY) c3511lX.zzc).zzc(abstractC2578dKZze.zzj());
        return abstractC2578dKZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        try {
            ((InterfaceC1852Ro) c3511lX.zzb).zzq(c4654va0.zzaa);
            ((InterfaceC1852Ro) c3511lX.zzb).zzl(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f23257a), new BinderC4537uY(this, c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc);
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Remote exception loading a interstitial RTB ad", e8);
            throw new C2112Ya0(e8);
        }
    }
}
