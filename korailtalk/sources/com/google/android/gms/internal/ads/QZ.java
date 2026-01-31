package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class QZ implements InterfaceC3853oX {

    /* renamed from: a */
    private final Context f15822a;

    /* renamed from: b */
    private final Executor f15823b;

    /* renamed from: c */
    private final RO f15824c;

    public QZ(Context context, Executor executor, RO ro) {
        this.f15822a = context;
        this.f15823b = executor;
        this.f15824c = ro;
    }

    public static final void c(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) {
        try {
            ((C4087qb0) c3511lX.zzb).zzk(c1457Ia0.zza.zza.zzd, c4654va0.zzw.toString());
        } catch (Exception e8) {
            L1.n.zzk("Fail to load ad from adapter ".concat(String.valueOf(c3511lX.zza)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, final C3511lX c3511lX) {
        NO noZze = this.f15824c.zze(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new OO(new MK() { // from class: com.google.android.gms.internal.ads.MZ
            @Override // com.google.android.gms.internal.ads.MK
            public final void zza(boolean z8, Context context, MF mf) throws LK {
                C3511lX c3511lX2 = c3511lX;
                try {
                    ((C4087qb0) c3511lX2.zzb).zzv(z8);
                    ((C4087qb0) c3511lX2.zzb).zzA();
                } catch (C2112Ya0 e8) {
                    L1.n.zzk("Cannot show rewarded video.", e8);
                    throw new LK(e8.getCause());
                }
            }
        }));
        noZze.zzd().zzo(new C4840xA((C4087qb0) c3511lX.zzb), this.f15823b);
        C3144iG c3144iGZze = noZze.zze();
        C4850xF c4850xFZzb = noZze.zzb();
        ((BinderC3057hY) c3511lX.zzc).zzc(new PZ(this, noZze.zza(), c4850xFZzb, c3144iGZze, noZze.zzg()));
        return noZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        if (((C4087qb0) c3511lX.zzb).zzC()) {
            c(c1457Ia0, c4654va0, c3511lX);
            return;
        }
        ((BinderC3057hY) c3511lX.zzc).zzd(new OZ(this, c1457Ia0, c4654va0, c3511lX));
        Object obj = c3511lX.zzb;
        Context context = this.f15822a;
        C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
        ((C4087qb0) obj).zzh(context, c1825Ra0.zzd, null, (InterfaceC1201Br) c3511lX.zzc, c4654va0.zzw.toString());
    }
}
