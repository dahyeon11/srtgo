package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ji0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3303ji0 extends AbstractC4784wi0 {

    /* renamed from: a, reason: collision with root package name */
    private String f20294a;

    /* renamed from: b, reason: collision with root package name */
    private String f20295b;

    C3303ji0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4784wi0
    public final AbstractC4784wi0 zza(String str) {
        this.f20295b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4784wi0
    public final AbstractC4784wi0 zzb(String str) {
        this.f20294a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4784wi0
    public final AbstractC4898xi0 zzc() {
        return new C3531li0(this.f20294a, this.f20295b, null);
    }
}
