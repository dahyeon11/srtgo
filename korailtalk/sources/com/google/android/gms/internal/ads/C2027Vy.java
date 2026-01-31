package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Vy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2027Vy implements InterfaceC3857oa0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2190Zx f16912a;

    /* renamed from: b, reason: collision with root package name */
    private Context f16913b;

    /* renamed from: c, reason: collision with root package name */
    private String f16914c;

    /* synthetic */ C2027Vy(C2190Zx c2190Zx, AbstractC1986Uy abstractC1986Uy) {
        this.f16912a = c2190Zx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3857oa0
    public final /* synthetic */ InterfaceC3857oa0 zza(String str) {
        this.f16914c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3857oa0
    public final /* synthetic */ InterfaceC3857oa0 zzb(Context context) {
        context.getClass();
        this.f16913b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3857oa0
    public final InterfaceC3971pa0 zzc() {
        OD0.zzc(this.f16913b, Context.class);
        return new C2109Xy(this.f16912a, this.f16913b, this.f16914c, null);
    }
}
