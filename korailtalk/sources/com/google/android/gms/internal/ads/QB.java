package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class QB implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f15738a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f15739b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f15740c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f15741d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f15742e;

    /* renamed from: f, reason: collision with root package name */
    private final XD0 f15743f;

    /* renamed from: g, reason: collision with root package name */
    private final XD0 f15744g;

    /* renamed from: h, reason: collision with root package name */
    private final XD0 f15745h;

    /* renamed from: i, reason: collision with root package name */
    private final XD0 f15746i;

    /* renamed from: j, reason: collision with root package name */
    private final XD0 f15747j;

    public QB(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08, XD0 xd09, XD0 xd010) {
        this.f15738a = xd0;
        this.f15739b = xd02;
        this.f15740c = xd03;
        this.f15741d = xd04;
        this.f15742e = xd05;
        this.f15743f = xd06;
        this.f15744g = xd07;
        this.f15745h = xd08;
        this.f15746i = xd09;
        this.f15747j = xd010;
    }

    public static PB zzc(XC xc, Context context, C4768wa0 c4768wa0, View view, InterfaceC2065Wv interfaceC2065Wv, WC wc, C2696eM c2696eM, FJ fj, AD0 ad0, Executor executor) {
        return new PB(xc, context, c4768wa0, view, interfaceC2065Wv, wc, c2696eM, fj, ad0, executor);
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final PB zzb() {
        return new PB(((C3367kE) this.f15738a).zzb(), (Context) this.f15739b.zzb(), ((WB) this.f15740c).zza(), ((VB) this.f15741d).zza(), ((C3249jC) this.f15742e).zza(), ((XB) this.f15743f).zza(), ((ZK) this.f15744g).zza(), (FJ) this.f15745h.zzb(), FD0.zza(SD0.zza(this.f15746i)), (Executor) this.f15747j.zzb());
    }
}
