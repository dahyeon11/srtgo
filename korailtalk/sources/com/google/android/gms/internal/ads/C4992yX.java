package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4992yX implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23962a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5070zB f23963b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f23964c;

    C4992yX(Context context, AbstractC5070zB abstractC5070zB, Executor executor) {
        this.f23962a = context;
        this.f23963b = abstractC5070zB;
        this.f23964c = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, final C3511lX c3511lX) {
        AbstractC4728wB abstractC4728wBZza = this.f23963b.zza(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new C2922gK(new MK() { // from class: com.google.android.gms.internal.ads.wX
            @Override // com.google.android.gms.internal.ads.MK
            public final void zza(boolean z8, Context context, MF mf) throws LK {
                C3511lX c3511lX2 = c3511lX;
                try {
                    ((C4087qb0) c3511lX2.zzb).zzv(z8);
                    ((C4087qb0) c3511lX2.zzb).zzw(context);
                } catch (C2112Ya0 e8) {
                    throw new LK(e8.getCause());
                }
            }
        }, null), new C4842xB(c4654va0.zzab));
        abstractC4728wBZza.zzd().zzo(new C4840xA((C4087qb0) c3511lX.zzb), this.f23964c);
        ((BinderC2942gY) c3511lX.zzc).zzc(abstractC4728wBZza.zzk());
        return abstractC4728wBZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0 {
        C4087qb0 c4087qb0 = (C4087qb0) c3511lX.zzb;
        C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
        c4087qb0.zzl(this.f23962a, c1825Ra0.zzd, c4654va0.zzw.toString(), (InterfaceC2096Xn) c3511lX.zzc);
    }
}
