package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.iy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3220iy implements Q70 {

    /* renamed from: a, reason: collision with root package name */
    private final C2190Zx f20038a;

    /* renamed from: b, reason: collision with root package name */
    private Context f20039b;

    /* renamed from: c, reason: collision with root package name */
    private String f20040c;

    /* synthetic */ C3220iy(C2190Zx c2190Zx, AbstractC3107hy abstractC3107hy) {
        this.f20038a = c2190Zx;
    }

    @Override // com.google.android.gms.internal.ads.Q70
    public final /* synthetic */ Q70 zza(String str) {
        str.getClass();
        this.f20040c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Q70
    public final /* synthetic */ Q70 zzb(Context context) {
        context.getClass();
        this.f20039b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Q70
    public final R70 zzc() {
        OD0.zzc(this.f20039b, Context.class);
        OD0.zzc(this.f20040c, String.class);
        return new C3448ky(this.f20038a, this.f20039b, this.f20040c, null);
    }
}
