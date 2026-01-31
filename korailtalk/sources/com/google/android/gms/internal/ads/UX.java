package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class UX implements InterfaceC3853oX {

    /* renamed from: a */
    private final Context f16667a;

    /* renamed from: b */
    private final AbstractC3819oC f16668b;

    /* renamed from: c */
    private View f16669c;

    /* renamed from: d */
    private InterfaceC2284ao f16670d;

    public UX(Context context, AbstractC3819oC abstractC3819oC) {
        this.f16667a = context;
        this.f16668b = abstractC3819oC;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(View view, C4654va0 c4654va0, Object obj) {
        return AbstractC1483In0.zzh(KC.zza(this.f16667a, view, c4654va0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, final C4654va0 c4654va0, final C3511lX c3511lX) throws C2112Ya0 {
        final View view;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhU)).booleanValue() && c4654va0.zzah) {
            try {
                view = (View) r2.b.unwrap(this.f16670d.zze());
                boolean zZzf = this.f16670d.zzf();
                if (view == null) {
                    throw new C2112Ya0(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.RX
                            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                            public final com.google.common.util.concurrent.C zza(Object obj) {
                                return this.zza.a(view, c4654va0, obj);
                            }
                        }, AbstractC4805wt.zze).get();
                    } catch (InterruptedException | ExecutionException e8) {
                        throw new C2112Ya0(e8);
                    }
                }
            } catch (RemoteException e9) {
                throw new C2112Ya0(e9);
            }
        } else {
            view = this.f16669c;
        }
        NB nbZza = this.f16668b.zza(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new TB(view, null, new WC() { // from class: com.google.android.gms.internal.ads.QX
            @Override // com.google.android.gms.internal.ads.WC
            public final H1.V0 zza() throws C2112Ya0 {
                try {
                    return ((InterfaceC1852Ro) c3511lX.zzb).zze();
                } catch (RemoteException e10) {
                    throw new C2112Ya0(e10);
                }
            }
        }, (C4768wa0) c4654va0.zzv.get(0)));
        nbZza.zzg().zza(view);
        ((BinderC2942gY) c3511lX.zzc).zzc(nbZza.zzj());
        return nbZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        try {
            ((InterfaceC1852Ro) c3511lX.zzb).zzq(c4654va0.zzaa);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhU)).booleanValue() && c4654va0.zzah) {
                ((InterfaceC1852Ro) c3511lX.zzb).zzk(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f16667a), new TX(this, c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc, c1457Ia0.zza.zza.zze);
            } else {
                ((InterfaceC1852Ro) c3511lX.zzb).zzj(c4654va0.zzV, c4654va0.zzw.toString(), c1457Ia0.zza.zza.zzd, r2.b.wrap(this.f16667a), new TX(this, c3511lX, null), (InterfaceC2096Xn) c3511lX.zzc, c1457Ia0.zza.zza.zze);
            }
        } catch (RemoteException e8) {
            throw new C2112Ya0(e8);
        }
    }
}
