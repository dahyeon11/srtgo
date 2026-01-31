package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.eT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2707eT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18771a;

    public C2707eT(XD0 xd0) {
        this.f18771a = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.f18771a.zzb()).getApplicationInfo();
        OD0.zzb(applicationInfo);
        return applicationInfo;
    }
}
