package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class DX implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12691a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12692b;

    public DX(XD0 xd0, XD0 xd02) {
        this.f12691a = xd0;
        this.f12692b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final CX zzb() {
        return new CX((Context) this.f12691a.zzb(), (AbstractC5070zB) this.f12692b.zzb());
    }
}
