package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.rY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4195rY implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22483a;

    /* renamed from: b, reason: collision with root package name */
    private final EK f22484b;

    /* renamed from: c, reason: collision with root package name */
    private final L1.a f22485c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f22486d;

    public C4195rY(Context context, L1.a aVar, EK ek, Executor executor) {
        this.f22483a = context;
        this.f22485c = aVar;
        this.f22484b = ek;
        this.f22486d = executor;
    }

    final /* synthetic */ void a(C3511lX c3511lX, boolean z8, Context context, MF mf) throws LK {
        try {
            ((C4087qb0) c3511lX.zzb).zzv(z8);
            if (this.f22485c.clientJarVersion < ((Integer) H1.C.zzc().zza(AbstractC4439th.zzaI)).intValue()) {
                ((C4087qb0) c3511lX.zzb).zzx();
            } else {
                ((C4087qb0) c3511lX.zzb).zzy(context);
            }
        } catch (C2112Ya0 e8) {
            L1.n.zzi("Cannot show interstitial.");
            throw new LK(e8.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, final C3511lX c3511lX) {
        AbstractC2578dK abstractC2578dKZze = this.f22484b.zze(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new C2922gK(new MK() { // from class: com.google.android.gms.internal.ads.qY
            @Override // com.google.android.gms.internal.ads.MK
            public final void zza(boolean z8, Context context, MF mf) throws LK {
                this.zza.a(c3511lX, z8, context, mf);
            }
        }, null));
        abstractC2578dKZze.zzd().zzo(new C4840xA((C4087qb0) c3511lX.zzb), this.f22486d);
        ((BinderC2942gY) c3511lX.zzc).zzc(abstractC2578dKZze.zzk());
        return abstractC2578dKZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws JSONException, C2112Ya0, IOException {
        C4087qb0 c4087qb0 = (C4087qb0) c3511lX.zzb;
        C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
        c4087qb0.zzo(this.f22483a, c1825Ra0.zzd, c4654va0.zzw.toString(), K1.Z.zzm(c4654va0.zzt), (InterfaceC2096Xn) c3511lX.zzc);
    }
}
