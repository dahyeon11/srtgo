package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.vK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4632vK implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23199a;

    public C4632vK(XD0 xd0) {
        this.f23199a = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C4630vJ((PK) this.f23199a.zzb(), AbstractC4805wt.zzf));
        OD0.zzb(setSingleton);
        return setSingleton;
    }
}
