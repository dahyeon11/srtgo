package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5145zs {

    /* renamed from: a, reason: collision with root package name */
    private Context f24206a;

    /* renamed from: b, reason: collision with root package name */
    private o2.f f24207b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0671x0 f24208c;

    /* renamed from: d, reason: collision with root package name */
    private C1407Gs f24209d;

    /* synthetic */ C5145zs(AbstractC5031ys abstractC5031ys) {
    }

    public final C5145zs zza(InterfaceC0671x0 interfaceC0671x0) {
        this.f24208c = interfaceC0671x0;
        return this;
    }

    public final C5145zs zzb(Context context) {
        context.getClass();
        this.f24206a = context;
        return this;
    }

    public final C5145zs zzc(o2.f fVar) {
        fVar.getClass();
        this.f24207b = fVar;
        return this;
    }

    public final C5145zs zzd(C1407Gs c1407Gs) {
        this.f24209d = c1407Gs;
        return this;
    }

    public final AbstractC1448Hs zze() {
        OD0.zzc(this.f24206a, Context.class);
        OD0.zzc(this.f24207b, o2.f.class);
        OD0.zzc(this.f24208c, InterfaceC0671x0.class);
        OD0.zzc(this.f24209d, C1407Gs.class);
        return new C1202Bs(this.f24206a, this.f24207b, this.f24208c, this.f24209d, null);
    }
}
