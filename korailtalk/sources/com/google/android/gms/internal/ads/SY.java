package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class SY extends UY {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2302ax f16295a;

    /* renamed from: b, reason: collision with root package name */
    private final VK f16296b;

    /* renamed from: c, reason: collision with root package name */
    private final C2912gF f16297c;

    /* renamed from: d, reason: collision with root package name */
    private final C4742wI f16298d;

    /* renamed from: e, reason: collision with root package name */
    private final C2943gZ f16299e;

    /* renamed from: f, reason: collision with root package name */
    private final C3739nX f16300f;

    public SY(AbstractC2302ax abstractC2302ax, VK vk, C2912gF c2912gF, C4742wI c4742wI, C2943gZ c2943gZ, C3739nX c3739nX) {
        this.f16295a = abstractC2302ax;
        this.f16296b = vk;
        this.f16297c = c2912gF;
        this.f16298d = c4742wI;
        this.f16299e = c2943gZ;
        this.f16300f = c3739nX;
    }

    @Override // com.google.android.gms.internal.ads.UY
    protected final com.google.common.util.concurrent.C a(C1825Ra0 c1825Ra0, Bundle bundle, C4654va0 c4654va0, C1457Ia0 c1457Ia0) {
        C2912gF c2912gF = this.f16297c;
        c2912gF.zzi(c1825Ra0);
        c2912gF.zzf(bundle);
        c2912gF.zzg(new C2224aF(c1457Ia0, c4654va0, this.f16299e));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdA)).booleanValue()) {
            this.f16297c.zzd(this.f16300f);
        }
        AbstractC2302ax abstractC2302ax = this.f16295a;
        C2912gF c2912gF2 = this.f16297c;
        InterfaceC2236aL interfaceC2236aLZzh = abstractC2302ax.zzh();
        interfaceC2236aLZzh.zzf(c2912gF2.zzj());
        interfaceC2236aLZzh.zze(this.f16298d);
        interfaceC2236aLZzh.zzd(this.f16296b);
        interfaceC2236aLZzh.zzc(new JB(null));
        HD hdZza = interfaceC2236aLZzh.zzg().zza();
        return hdZza.zzi(hdZza.zzj());
    }
}
