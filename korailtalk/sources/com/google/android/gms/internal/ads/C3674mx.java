package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3674mx implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f21042a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f21043b;

    public C3674mx(XD0 xd0, XD0 xd02) {
        this.f21042a = xd0;
        this.f21043b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        TR tr = (TR) this.f21042a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setSingleton = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbE)).booleanValue() ? Collections.singleton(new C4630vJ(tr, interfaceExecutorServiceC1974Un0)) : Collections.emptySet();
        OD0.zzb(setSingleton);
        return setSingleton;
    }
}
