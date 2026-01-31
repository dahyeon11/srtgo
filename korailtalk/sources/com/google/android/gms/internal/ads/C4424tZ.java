package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4424tZ implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22883a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f22884b;

    /* renamed from: c, reason: collision with root package name */
    private final RO f22885c;

    public C4424tZ(Context context, Executor executor, RO ro) {
        this.f22883a = context;
        this.f22884b = executor;
        this.f22885c = ro;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, final C3511lX c3511lX) {
        NO noZze = this.f22885c.zze(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new OO(new MK() { // from class: com.google.android.gms.internal.ads.sZ
            @Override // com.google.android.gms.internal.ads.MK
            public final void zza(boolean z8, Context context, MF mf) throws LK {
                C3511lX c3511lX2 = c3511lX;
                try {
                    ((C4087qb0) c3511lX2.zzb).zzv(z8);
                    ((C4087qb0) c3511lX2.zzb).zzz(context);
                } catch (C2112Ya0 e8) {
                    throw new LK(e8.getCause());
                }
            }
        }));
        noZze.zzd().zzo(new C4840xA((C4087qb0) c3511lX.zzb), this.f22884b);
        ((BinderC2942gY) c3511lX.zzc).zzc(noZze.zzn());
        return noZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) {
        try {
            C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
            if (c1825Ra0.zzo.zza == 3) {
                ((C4087qb0) c3511lX.zzb).zzr(this.f22883a, c1825Ra0.zzd, c4654va0.zzw.toString(), (InterfaceC2096Xn) c3511lX.zzc);
            } else {
                ((C4087qb0) c3511lX.zzb).zzq(this.f22883a, c1825Ra0.zzd, c4654va0.zzw.toString(), (InterfaceC2096Xn) c3511lX.zzc);
            }
        } catch (Exception e8) {
            L1.n.zzk("Fail to load ad from adapter ".concat(String.valueOf(c3511lX.zza)), e8);
        }
    }
}
