package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class VY extends UY {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2302ax f16864a;

    /* renamed from: b, reason: collision with root package name */
    private final C2912gF f16865b;

    /* renamed from: c, reason: collision with root package name */
    private final C4742wI f16866c;

    /* renamed from: d, reason: collision with root package name */
    private final C2943gZ f16867d;

    /* renamed from: e, reason: collision with root package name */
    private final C3739nX f16868e;

    VY(AbstractC2302ax abstractC2302ax, C2912gF c2912gF, C4742wI c4742wI, C2943gZ c2943gZ, C3739nX c3739nX) {
        this.f16864a = abstractC2302ax;
        this.f16865b = c2912gF;
        this.f16866c = c4742wI;
        this.f16867d = c2943gZ;
        this.f16868e = c3739nX;
    }

    @Override // com.google.android.gms.internal.ads.UY
    protected final com.google.common.util.concurrent.C a(C1825Ra0 c1825Ra0, Bundle bundle, C4654va0 c4654va0, C1457Ia0 c1457Ia0) {
        C2912gF c2912gF = this.f16865b;
        c2912gF.zzi(c1825Ra0);
        c2912gF.zzf(bundle);
        c2912gF.zzg(new C2224aF(c1457Ia0, c4654va0, this.f16867d));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdA)).booleanValue()) {
            this.f16865b.zzd(this.f16868e);
        }
        AbstractC2302ax abstractC2302ax = this.f16864a;
        C2912gF c2912gF2 = this.f16865b;
        InterfaceC4956yB interfaceC4956yBZzd = abstractC2302ax.zzd();
        interfaceC4956yBZzd.zzd(c2912gF2.zzj());
        interfaceC4956yBZzd.zzc(this.f16866c);
        HD hdZzb = interfaceC4956yBZzd.zze().zzb();
        return hdZzb.zzi(hdZzb.zzj());
    }
}
