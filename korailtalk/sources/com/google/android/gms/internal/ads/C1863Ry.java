package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ry, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1863Ry implements InterfaceC4953y90 {

    /* renamed from: a, reason: collision with root package name */
    private final C2190Zx f16163a;

    /* renamed from: b, reason: collision with root package name */
    private Context f16164b;

    /* renamed from: c, reason: collision with root package name */
    private String f16165c;

    /* renamed from: d, reason: collision with root package name */
    private H1.d2 f16166d;

    /* synthetic */ C1863Ry(C2190Zx c2190Zx, AbstractC1822Qy abstractC1822Qy) {
        this.f16163a = c2190Zx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4953y90
    public final /* synthetic */ InterfaceC4953y90 zza(H1.d2 d2Var) {
        d2Var.getClass();
        this.f16166d = d2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4953y90
    public final /* synthetic */ InterfaceC4953y90 zzb(String str) {
        str.getClass();
        this.f16165c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4953y90
    public final /* synthetic */ InterfaceC4953y90 zzc(Context context) {
        context.getClass();
        this.f16164b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4953y90
    public final InterfaceC5067z90 zzd() {
        OD0.zzc(this.f16164b, Context.class);
        OD0.zzc(this.f16165c, String.class);
        OD0.zzc(this.f16166d, H1.d2.class);
        return new C1945Ty(this.f16163a, this.f16164b, this.f16165c, this.f16166d, null);
    }
}
