package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.cL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2465cL implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18290a;

    public C2465cL(XD0 xd0) {
        this.f18290a = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((ZK) this.f18290a).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        OD0.zzb(setSingleton);
        return setSingleton;
    }
}
