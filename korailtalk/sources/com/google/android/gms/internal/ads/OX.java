package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import y1.AbstractC6517D;

/* loaded from: classes2.dex */
public final class OX implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15121a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3819oC f15122b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f15123c;

    public OX(Context context, AbstractC3819oC abstractC3819oC, Executor executor) {
        this.f15121a = context;
        this.f15122b = abstractC3819oC;
        this.f15123c = executor;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(View view, C4654va0 c4654va0, Object obj) {
        return AbstractC1483In0.zzh(KC.zza(this.f15121a, view, c4654va0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, final C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        final View viewZza;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhU)).booleanValue() && c4654va0.zzah) {
            InterfaceC2284ao interfaceC2284aoZzc = ((C4087qb0) c3511lX.zzb).zzc();
            if (interfaceC2284aoZzc == null) {
                L1.n.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new C2112Ya0(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) r2.b.unwrap(interfaceC2284aoZzc.zze());
                boolean zZzf = interfaceC2284aoZzc.zzf();
                if (viewZza == null) {
                    throw new C2112Ya0(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.MX
                            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                            public final com.google.common.util.concurrent.C zza(Object obj) {
                                return this.zza.a(viewZza, c4654va0, obj);
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
            viewZza = ((C4087qb0) c3511lX.zzb).zza();
        }
        AbstractC3819oC abstractC3819oC = this.f15122b;
        C3935pD c3935pD = new C3935pD(c1457Ia0, c4654va0, c3511lX.zza);
        final C4087qb0 c4087qb0 = (C4087qb0) c3511lX.zzb;
        Objects.requireNonNull(c4087qb0);
        NB nbZza = abstractC3819oC.zza(c3935pD, new TB(viewZza, null, new WC() { // from class: com.google.android.gms.internal.ads.NX
            @Override // com.google.android.gms.internal.ads.WC
            public final H1.V0 zza() {
                return c4087qb0.zzb();
            }
        }, (C4768wa0) c4654va0.zzv.get(0)));
        nbZza.zzg().zza(viewZza);
        nbZza.zzd().zzo(new C4840xA((C4087qb0) c3511lX.zzb), this.f15123c);
        ((BinderC2942gY) c3511lX.zzc).zzc(nbZza.zzk());
        return nbZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        H1.d2 d2Var;
        H1.d2 d2Var2 = c1457Ia0.zza.zza.zze;
        if (d2Var2.zzn) {
            d2Var = new H1.d2(this.f15121a, AbstractC6517D.zzd(d2Var2.zze, d2Var2.zzb));
        } else {
            d2Var = (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhU)).booleanValue() && c4654va0.zzah) ? new H1.d2(this.f15121a, AbstractC6517D.zze(d2Var2.zze, d2Var2.zzb)) : AbstractC2071Xa0.zza(this.f15121a, c4654va0.zzv);
        }
        H1.d2 d2Var3 = d2Var;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhU)).booleanValue() && c4654va0.zzah) {
            Object obj = c3511lX.zzb;
            ((C4087qb0) obj).zzn(this.f15121a, d2Var3, c1457Ia0.zza.zza.zzd, c4654va0.zzw.toString(), K1.Z.zzm(c4654va0.zzt), (InterfaceC2096Xn) c3511lX.zzc);
            return;
        }
        Object obj2 = c3511lX.zzb;
        ((C4087qb0) obj2).zzm(this.f15121a, d2Var3, c1457Ia0.zza.zza.zzd, c4654va0.zzw.toString(), K1.Z.zzm(c4654va0.zzt), (InterfaceC2096Xn) c3511lX.zzc);
    }
}
