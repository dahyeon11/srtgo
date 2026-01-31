package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.cZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2484cZ extends UY {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2302ax f18318a;

    /* renamed from: b, reason: collision with root package name */
    private final C2912gF f18319b;

    /* renamed from: c, reason: collision with root package name */
    private final C4742wI f18320c;

    /* renamed from: d, reason: collision with root package name */
    private final C2943gZ f18321d;

    /* renamed from: e, reason: collision with root package name */
    private final C1498Ja0 f18322e;

    /* renamed from: f, reason: collision with root package name */
    private final C3739nX f18323f;

    public C2484cZ(AbstractC2302ax abstractC2302ax, C2912gF c2912gF, C4742wI c4742wI, C1498Ja0 c1498Ja0, C2943gZ c2943gZ, C3739nX c3739nX) {
        this.f18318a = abstractC2302ax;
        this.f18319b = c2912gF;
        this.f18320c = c4742wI;
        this.f18322e = c1498Ja0;
        this.f18321d = c2943gZ;
        this.f18323f = c3739nX;
    }

    @Override // com.google.android.gms.internal.ads.UY
    protected final com.google.common.util.concurrent.C a(C1825Ra0 c1825Ra0, Bundle bundle, C4654va0 c4654va0, C1457Ia0 c1457Ia0) {
        C1498Ja0 c1498Ja0;
        C2912gF c2912gF = this.f18319b;
        c2912gF.zzi(c1825Ra0);
        c2912gF.zzf(bundle);
        c2912gF.zzg(new C2224aF(c1457Ia0, c4654va0, this.f18321d));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdz)).booleanValue() && (c1498Ja0 = this.f18322e) != null) {
            this.f18319b.zzh(c1498Ja0);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdA)).booleanValue()) {
            this.f18319b.zzd(this.f18323f);
        }
        AbstractC2302ax abstractC2302ax = this.f18318a;
        C2912gF c2912gF2 = this.f18319b;
        QO qoZzi = abstractC2302ax.zzi();
        qoZzi.zzd(c2912gF2.zzj());
        qoZzi.zzc(this.f18320c);
        HD hdZzb = qoZzi.zze().zzb();
        return hdZzb.zzi(hdZzb.zzj());
    }
}
