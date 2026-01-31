package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class XY extends UY {

    /* renamed from: a */
    private final AbstractC2302ax f17252a;

    /* renamed from: b */
    private final C2912gF f17253b;

    /* renamed from: c */
    private final C3796o00 f17254c;

    /* renamed from: d */
    private final C4742wI f17255d;

    /* renamed from: e */
    private final VK f17256e;

    /* renamed from: f */
    private final SG f17257f;

    /* renamed from: g */
    private final ViewGroup f17258g;

    /* renamed from: h */
    private final C2345bI f17259h;

    /* renamed from: i */
    private final C2943gZ f17260i;

    /* renamed from: j */
    private final C3739nX f17261j;

    public XY(AbstractC2302ax abstractC2302ax, C2912gF c2912gF, C3796o00 c3796o00, C4742wI c4742wI, VK vk, SG sg, ViewGroup viewGroup, C2345bI c2345bI, C2943gZ c2943gZ, C3739nX c3739nX) {
        this.f17252a = abstractC2302ax;
        this.f17253b = c2912gF;
        this.f17254c = c3796o00;
        this.f17255d = c4742wI;
        this.f17256e = vk;
        this.f17257f = sg;
        this.f17258g = viewGroup;
        this.f17259h = c2345bI;
        this.f17260i = c2943gZ;
        this.f17261j = c3739nX;
    }

    @Override // com.google.android.gms.internal.ads.UY
    protected final com.google.common.util.concurrent.C a(C1825Ra0 c1825Ra0, Bundle bundle, C4654va0 c4654va0, C1457Ia0 c1457Ia0) {
        C2912gF c2912gF = this.f17253b;
        c2912gF.zzi(c1825Ra0);
        c2912gF.zzf(bundle);
        c2912gF.zzg(new C2224aF(c1457Ia0, c4654va0, this.f17260i));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdA)).booleanValue()) {
            this.f17253b.zzd(this.f17261j);
        }
        AbstractC2302ax abstractC2302ax = this.f17252a;
        C2912gF c2912gF2 = this.f17253b;
        InterfaceC3705nC interfaceC3705nCZze = abstractC2302ax.zze();
        interfaceC3705nCZze.zzi(c2912gF2.zzj());
        interfaceC3705nCZze.zzf(this.f17255d);
        interfaceC3705nCZze.zze(this.f17254c);
        interfaceC3705nCZze.zzd(this.f17256e);
        interfaceC3705nCZze.zzg(new QC(this.f17257f, this.f17259h));
        interfaceC3705nCZze.zzc(new JB(this.f17258g));
        HD hdZzd = interfaceC3705nCZze.zzh().zzd();
        return hdZzd.zzi(hdZzd.zzj());
    }
}
