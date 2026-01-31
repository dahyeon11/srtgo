package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.os.RemoteException;
import y1.EnumC6522c;

/* renamed from: com.google.android.gms.internal.ads.xZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4880xZ implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23745a;

    /* renamed from: b, reason: collision with root package name */
    private final RO f23746b;

    public C4880xZ(Context context, RO ro) {
        this.f23745a = context;
        this.f23746b = ro;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) {
        C3968pY c3968pY = new C3968pY(c4654va0, (InterfaceC1852Ro) c3511lX.zzb, EnumC6522c.REWARDED);
        NO noZze = this.f23746b.zze(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new OO(c3968pY));
        c3968pY.zzb(noZze.zzc());
        ((BinderC2942gY) c3511lX.zzc).zzc(noZze.zzo());
        return noZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) {
        try {
            ((InterfaceC1852Ro) c3511lX.zzb).zzq(c4654va0.zzaa);
            if (c1457Ia0.zza.zza.zzo.zza == 3) {
                ((InterfaceC1852Ro) c3511lX.zzb).zzo(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f23745a), new BinderC4766wZ(this, c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc);
            } else {
                ((InterfaceC1852Ro) c3511lX.zzb).zzp(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f23745a), new BinderC4766wZ(this, c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc);
            }
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Remote exception loading a rewarded RTB ad", e8);
        }
    }
}
