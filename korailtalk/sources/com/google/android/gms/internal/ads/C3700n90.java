package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.n90 */
/* loaded from: classes2.dex */
public final class C3700n90 implements GD0 {

    /* renamed from: a */
    private final XD0 f21211a;

    /* renamed from: b */
    private final XD0 f21212b;

    /* renamed from: c */
    private final XD0 f21213c;

    public C3700n90(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f21211a = xd0;
        this.f21212b = xd02;
        this.f21213c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza */
    public final InterfaceC3358k90 zzb() {
        Context context = (Context) this.f21211a.zzb();
        C1213Cb0 c1213Cb0 = (C1213Cb0) this.f21212b.zzb();
        C1991Vb0 c1991Vb0 = (C1991Vb0) this.f21213c.zzb();
        C2867ft c2867ftZzh = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgA)).booleanValue() ? G1.u.zzo().zzi().zzh() : G1.u.zzo().zzi().zzi();
        boolean z8 = false;
        if (c2867ftZzh != null && c2867ftZzh.zzh()) {
            z8 = true;
        }
        if (((Integer) H1.C.zzc().zza(AbstractC4439th.zzgC)).intValue() > 0) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgz)).booleanValue() || z8) {
                C1950Ub0 c1950Ub0Zza = c1991Vb0.zza(EnumC1582Lb0.Rewarded, context, c1213Cb0, new N80(new K80()));
                C2213a90 c2213a90 = new C2213a90(new Y80());
                InterfaceC1418Hb0 interfaceC1418Hb0 = c1950Ub0Zza.zza;
                InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
                return new P80(c2213a90, new V80(interfaceC1418Hb0, interfaceExecutorServiceC1974Un0), c1950Ub0Zza.zzb, c1950Ub0Zza.zza.zza().zzf, interfaceExecutorServiceC1974Un0);
            }
        }
        return new Y80();
    }
}
