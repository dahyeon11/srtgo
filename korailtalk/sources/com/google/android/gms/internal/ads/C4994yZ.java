package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.yZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4994yZ implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23965a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23966b;

    public C4994yZ(XD0 xd0, XD0 xd02) {
        this.f23965a = xd0;
        this.f23966b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C4880xZ zzb() {
        return new C4880xZ((Context) this.f23965a.zzb(), (RO) this.f23966b.zzb());
    }
}
