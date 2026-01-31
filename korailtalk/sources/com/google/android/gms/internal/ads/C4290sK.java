package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4290sK implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2922gK f22621a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22622b;

    public C4290sK(C2922gK c2922gK, XD0 xd0) {
        this.f22621a = c2922gK;
        this.f22622b = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C4630vJ((VE) this.f22622b.zzb(), AbstractC4805wt.zzf));
        OD0.zzb(setSingleton);
        return setSingleton;
    }
}
