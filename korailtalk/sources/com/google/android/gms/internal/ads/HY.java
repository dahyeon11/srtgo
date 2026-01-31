package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class HY implements InterfaceC3853oX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13325a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2351bL f13326b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f13327c;

    public HY(Context context, AbstractC2351bL abstractC2351bL, Executor executor) {
        this.f13325a = context;
        this.f13326b = abstractC2351bL;
        this.f13327c = executor;
    }

    private static final boolean a(C1457Ia0 c1457Ia0, int i8) {
        return c1457Ia0.zza.zza.zzg.contains(Integer.toString(i8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final /* bridge */ /* synthetic */ Object zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws C2112Ya0, C3399kZ {
        SL slZzah;
        C2513co c2513coZzD = ((C4087qb0) c3511lX.zzb).zzD();
        C2742eo c2742eoZzE = ((C4087qb0) c3511lX.zzb).zzE();
        InterfaceC3087ho interfaceC3087hoZzd = ((C4087qb0) c3511lX.zzb).zzd();
        if (interfaceC3087hoZzd != null && a(c1457Ia0, 6)) {
            slZzah = SL.zzt(interfaceC3087hoZzd);
        } else if (c2513coZzD != null && a(c1457Ia0, 6)) {
            slZzah = SL.zzai(c2513coZzD);
        } else if (c2513coZzD != null && a(c1457Ia0, 2)) {
            slZzah = SL.zzag(c2513coZzD);
        } else if (c2742eoZzE != null && a(c1457Ia0, 6)) {
            slZzah = SL.zzaj(c2742eoZzE);
        } else {
            if (c2742eoZzE == null || !a(c1457Ia0, 1)) {
                throw new C3399kZ(1, "No native ad mappers");
            }
            slZzah = SL.zzah(c2742eoZzE);
        }
        C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
        if (!c1825Ra0.zzg.contains(Integer.toString(slZzah.zzc()))) {
            throw new C3399kZ(1, "No corresponding native ad listener");
        }
        UL ulZze = this.f13326b.zze(new C3935pD(c1457Ia0, c4654va0, c3511lX.zza), new C2811fM(slZzah), new XM(c2742eoZzE, c2513coZzD, interfaceC3087hoZzd));
        ((BinderC2942gY) c3511lX.zzc).zzc(ulZze.zzk());
        ulZze.zzd().zzo(new C4840xA((C4087qb0) c3511lX.zzb), this.f13327c);
        return ulZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3853oX
    public final void zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) throws JSONException, C2112Ya0, IOException {
        C4087qb0 c4087qb0 = (C4087qb0) c3511lX.zzb;
        C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
        String string = c4654va0.zzw.toString();
        String strZzm = K1.Z.zzm(c4654va0.zzt);
        InterfaceC2096Xn interfaceC2096Xn = (InterfaceC2096Xn) c3511lX.zzc;
        C1825Ra0 c1825Ra02 = c1457Ia0.zza.zza;
        c4087qb0.zzp(this.f13325a, c1825Ra0.zzd, string, strZzm, interfaceC2096Xn, c1825Ra02.zzi, c1825Ra02.zzg);
    }
}
