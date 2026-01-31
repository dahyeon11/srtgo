package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Hy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1454Hy implements InterfaceC4644vR {

    /* renamed from: a, reason: collision with root package name */
    private final C2190Zx f13374a;

    /* renamed from: b, reason: collision with root package name */
    private Context f13375b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5131zl f13376c;

    /* synthetic */ C1454Hy(C2190Zx c2190Zx, AbstractC1413Gy abstractC1413Gy) {
        this.f13374a = c2190Zx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4644vR
    public final /* synthetic */ InterfaceC4644vR zza(InterfaceC5131zl interfaceC5131zl) {
        interfaceC5131zl.getClass();
        this.f13376c = interfaceC5131zl;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4644vR
    public final /* synthetic */ InterfaceC4644vR zzb(Context context) {
        context.getClass();
        this.f13375b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4644vR
    public final InterfaceC4758wR zzc() {
        OD0.zzc(this.f13375b, Context.class);
        OD0.zzc(this.f13376c, InterfaceC5131zl.class);
        return new C1536Jy(this.f13374a, this.f13375b, this.f13376c, null);
    }
}
