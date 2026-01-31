package com.google.android.gms.internal.ads;

import K1.C0666v;
import android.content.Context;

/* loaded from: classes2.dex */
public final class SE implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16214a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16215b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16216c;

    public SE(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f16214a = xd0;
        this.f16215b = xd02;
        this.f16216c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f16214a.zzb();
        final L1.a aVarZza = ((C4357sx) this.f16215b).zza();
        final C1825Ra0 c1825Ra0Zza = ((C4053qF) this.f16216c).zza();
        return new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.RE
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                C4654va0 c4654va0 = (C4654va0) obj;
                C0666v c0666v = new C0666v(context);
                c0666v.zzp(c4654va0.zzC);
                c0666v.zzq(c4654va0.zzD.toString());
                c0666v.zzo(aVarZza.afmaVersion);
                c0666v.zzn(c1825Ra0Zza.zzf);
                return c0666v;
            }
        };
    }
}
