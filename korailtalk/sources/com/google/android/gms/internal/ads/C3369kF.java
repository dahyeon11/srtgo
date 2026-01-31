package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3369kF implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3142iF f20388a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20389b;

    public C3369kF(C3142iF c3142iF, XD0 xd0) {
        this.f20388a = c3142iF;
        this.f20389b = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = this.f20388a.a(((C2990gx) this.f20389b).zza());
        OD0.zzb(contextA);
        return contextA;
    }
}
