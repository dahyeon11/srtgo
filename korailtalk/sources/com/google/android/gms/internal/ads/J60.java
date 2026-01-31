package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class J60 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13584a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13585b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13586c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f13587d;

    public J60(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f13584a = xd0;
        this.f13585b = xd02;
        this.f13586c = xd03;
        this.f13587d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f13585b).zza();
        String strZza = ((C4607v70) this.f13586c).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new H60(null, contextZza, strZza, interfaceExecutorServiceC1974Un0);
    }
}
