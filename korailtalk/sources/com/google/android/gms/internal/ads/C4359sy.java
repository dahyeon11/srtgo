package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.sy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4359sy implements G80 {

    /* renamed from: a, reason: collision with root package name */
    private final C2190Zx f22751a;

    /* renamed from: b, reason: collision with root package name */
    private Context f22752b;

    /* renamed from: c, reason: collision with root package name */
    private String f22753c;

    /* renamed from: d, reason: collision with root package name */
    private H1.d2 f22754d;

    /* synthetic */ C4359sy(C2190Zx c2190Zx, AbstractC4245ry abstractC4245ry) {
        this.f22751a = c2190Zx;
    }

    @Override // com.google.android.gms.internal.ads.G80
    public final /* synthetic */ G80 zza(H1.d2 d2Var) {
        d2Var.getClass();
        this.f22754d = d2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.G80
    public final /* synthetic */ G80 zzb(String str) {
        str.getClass();
        this.f22753c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.G80
    public final /* synthetic */ G80 zzc(Context context) {
        context.getClass();
        this.f22752b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.G80
    public final H80 zzd() {
        OD0.zzc(this.f22752b, Context.class);
        OD0.zzc(this.f22753c, String.class);
        OD0.zzc(this.f22754d, H1.d2.class);
        return new C4587uy(this.f22751a, this.f22752b, this.f22753c, this.f22754d, null);
    }
}
