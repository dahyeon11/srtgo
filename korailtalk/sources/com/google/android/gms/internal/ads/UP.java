package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class UP implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16658a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16659b;

    public UP(XD0 xd0, XD0 xd02) {
        this.f16658a = xd0;
        this.f16659b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setSingleton = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeT)).booleanValue() ? Collections.singleton(new C4630vJ(((C3846oQ) this.f16659b).zzb(), interfaceExecutorServiceC1974Un0)) : Collections.emptySet();
        OD0.zzb(setSingleton);
        return setSingleton;
    }
}
