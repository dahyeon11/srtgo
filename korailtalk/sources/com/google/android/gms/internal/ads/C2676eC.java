package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.eC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2676eC implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final TB f18738a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18739b;

    public C2676eC(TB tb, XD0 xd0) {
        this.f18738a = tb;
        this.f18739b = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C4630vJ((NC) this.f18739b.zzb(), AbstractC4805wt.zzf));
        OD0.zzb(setSingleton);
        return setSingleton;
    }
}
