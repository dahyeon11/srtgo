package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ZY extends UY {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2302ax f17579a;

    /* renamed from: b, reason: collision with root package name */
    private final C2912gF f17580b;

    /* renamed from: c, reason: collision with root package name */
    private final C3796o00 f17581c;

    /* renamed from: d, reason: collision with root package name */
    private final C4742wI f17582d;

    /* renamed from: e, reason: collision with root package name */
    private final C2943gZ f17583e;

    /* renamed from: f, reason: collision with root package name */
    private final C3739nX f17584f;

    public ZY(AbstractC2302ax abstractC2302ax, C2912gF c2912gF, C3796o00 c3796o00, C4742wI c4742wI, C2943gZ c2943gZ, C3739nX c3739nX) {
        this.f17579a = abstractC2302ax;
        this.f17580b = c2912gF;
        this.f17581c = c3796o00;
        this.f17582d = c4742wI;
        this.f17583e = c2943gZ;
        this.f17584f = c3739nX;
    }

    @Override // com.google.android.gms.internal.ads.UY
    protected final com.google.common.util.concurrent.C a(C1825Ra0 c1825Ra0, Bundle bundle, C4654va0 c4654va0, C1457Ia0 c1457Ia0) {
        C2912gF c2912gF = this.f17580b;
        c2912gF.zzi(c1825Ra0);
        c2912gF.zzf(bundle);
        c2912gF.zzg(new C2224aF(c1457Ia0, c4654va0, this.f17583e));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdA)).booleanValue()) {
            this.f17580b.zzd(this.f17584f);
        }
        AbstractC2302ax abstractC2302ax = this.f17579a;
        C2912gF c2912gF2 = this.f17580b;
        DK dkZzg = abstractC2302ax.zzg();
        dkZzg.zze(c2912gF2.zzj());
        dkZzg.zzd(this.f17582d);
        dkZzg.zzc(this.f17581c);
        HD hdZza = dkZzg.zzf().zza();
        return hdZza.zzi(hdZza.zzj());
    }
}
