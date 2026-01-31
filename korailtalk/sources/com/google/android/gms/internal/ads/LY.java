package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class LY implements InterfaceC3853oX {

    /* renamed from: a */
    private final Context f14298a;

    /* renamed from: b */
    private final AbstractC2351bL f14299b;

    /* renamed from: c */
    private InterfaceC3087ho f14300c;

    /* renamed from: d */
    private final L1.a f14301d;

    public LY(Context context, AbstractC2351bL abstractC2351bL, L1.a aVar) {
        this.f14298a = context;
        this.f14299b = abstractC2351bL;
        this.f14301d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C3399kZ {
        if (!c1457Ia0.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new C3399kZ(2, "Unified must be used for RTB.");
        }
        SL slZzt = SL.zzt(this.f14300c);
        C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
        if (!c1825Ra0.zzg.contains(Integer.toString(slZzt.zzc()))) {
            throw new C3399kZ(1, "No corresponding native ad listener");
        }
        UL ulZze = this.f14299b.zze(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new C2811fM(slZzt), new XM(null, null, this.f14300c));
        ((BinderC2942gY) c3511lX.zzc).zzc(ulZze.zzj());
        return ulZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        try {
            ((InterfaceC1852Ro) c3511lX.zzb).zzq(c4654va0.zzaa);
            if (this.f14301d.clientJarVersion < ((Integer) H1.C.zzc().zza(AbstractC4439th.zzbI)).intValue()) {
                ((InterfaceC1852Ro) c3511lX.zzb).zzm(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f14298a), new KY(this, c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc);
            } else {
                ((InterfaceC1852Ro) c3511lX.zzb).zzn(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f14298a), new KY(this, c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc, c1457Ia0.zza.zza.zzi);
            }
        } catch (RemoteException e8) {
            throw new C2112Ya0(e8);
        }
    }
}
