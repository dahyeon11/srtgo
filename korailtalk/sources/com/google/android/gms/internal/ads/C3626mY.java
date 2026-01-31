package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import J1.InterfaceC0619b;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.mY */
/* loaded from: classes2.dex */
final class C3626mY implements MK {

    /* renamed from: a */
    private final Context f20926a;

    /* renamed from: b */
    private final L1.a f20927b;

    /* renamed from: c */
    private final com.google.common.util.concurrent.C f20928c;

    /* renamed from: d */
    private final C4654va0 f20929d;

    /* renamed from: e */
    private final InterfaceC2065Wv f20930e;

    /* renamed from: f */
    private final C1825Ra0 f20931f;

    /* renamed from: g */
    private final C2622dl f20932g;

    /* renamed from: h */
    private final boolean f20933h;

    /* renamed from: i */
    private final GW f20934i;

    C3626mY(Context context, L1.a aVar, com.google.common.util.concurrent.C c9, C4654va0 c4654va0, InterfaceC2065Wv interfaceC2065Wv, C1825Ra0 c1825Ra0, boolean z8, C2622dl c2622dl, GW gw) {
        this.f20926a = context;
        this.f20927b = aVar;
        this.f20928c = c9;
        this.f20929d = c4654va0;
        this.f20930e = interfaceC2065Wv;
        this.f20931f = c1825Ra0;
        this.f20932g = c2622dl;
        this.f20933h = z8;
        this.f20934i = gw;
    }

    @Override // com.google.android.gms.internal.ads.MK
    public final void zza(boolean z8, Context context, MF mf) {
        AbstractC2578dK abstractC2578dK = (AbstractC2578dK) AbstractC1483In0.zzq(this.f20928c);
        this.f20930e.zzaq(true);
        boolean zZze = this.f20933h ? this.f20932g.zze(false) : false;
        G1.u.zzp();
        G1.k kVar = new G1.k(zZze, K1.K0.zzI(this.f20926a), this.f20933h ? this.f20932g.zzd() : false, this.f20933h ? this.f20932g.zza() : 0.0f, -1, z8, this.f20929d.zzP, false);
        if (mf != null) {
            mf.zzf();
        }
        G1.u.zzi();
        BK bkZzh = abstractC2578dK.zzh();
        InterfaceC2065Wv interfaceC2065Wv = this.f20930e;
        C4654va0 c4654va0 = this.f20929d;
        L1.a aVar = this.f20927b;
        int i8 = c4654va0.zzR;
        String str = c4654va0.zzC;
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        J1.v.zza(context, new AdOverlayInfoParcel((InterfaceC0517a) null, bkZzh, (InterfaceC0619b) null, interfaceC2065Wv, i8, aVar, str, kVar, c1129Aa0.zzb, c1129Aa0.zza, this.f20931f.zzf, mf, c4654va0.zzaj ? this.f20934i : null), true);
    }
}
