package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Pi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1758Pi extends AbstractBinderC2389bj {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f15394a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f15395b;

    /* renamed from: c, reason: collision with root package name */
    private final double f15396c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15397d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15398e;

    public BinderC1758Pi(Drawable drawable, Uri uri, double d9, int i8, int i9) {
        this.f15394a = drawable;
        this.f15395b = uri;
        this.f15396c = d9;
        this.f15397d = i8;
        this.f15398e = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2389bj, com.google.android.gms.internal.ads.InterfaceC2503cj
    public final double zzb() {
        return this.f15396c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2389bj, com.google.android.gms.internal.ads.InterfaceC2503cj
    public final int zzc() {
        return this.f15398e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2389bj, com.google.android.gms.internal.ads.InterfaceC2503cj
    public final int zzd() {
        return this.f15397d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2389bj, com.google.android.gms.internal.ads.InterfaceC2503cj
    public final Uri zze() {
        return this.f15395b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2389bj, com.google.android.gms.internal.ads.InterfaceC2503cj
    public final InterfaceC6172a zzf() {
        return r2.b.wrap(this.f15394a);
    }
}
