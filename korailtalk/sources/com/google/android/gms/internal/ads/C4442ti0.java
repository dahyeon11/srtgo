package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ti0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4442ti0 extends AbstractC1636Mi0 {

    /* renamed from: a, reason: collision with root package name */
    private String f22908a;

    /* renamed from: b, reason: collision with root package name */
    private String f22909b;

    C4442ti0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1636Mi0
    public final AbstractC1636Mi0 zza(String str) {
        this.f22909b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1636Mi0
    public final AbstractC1636Mi0 zzb(String str) {
        this.f22908a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1636Mi0
    public final AbstractC1677Ni0 zzc() {
        return new C4670vi0(this.f22908a, this.f22909b, null);
    }
}
