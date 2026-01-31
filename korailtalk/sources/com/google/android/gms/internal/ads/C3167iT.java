package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.gms.internal.ads.iT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3167iT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f19939a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19940b;

    public C3167iT(XD0 xd0, XD0 xd02) {
        this.f19939a = xd0;
        this.f19940b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return q2.e.packageManager((Context) this.f19939a.zzb()).getPackageInfo(((C2707eT) this.f19940b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
