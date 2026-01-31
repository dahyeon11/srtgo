package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3987pi0 extends AbstractC1514Ji0 {

    /* renamed from: a, reason: collision with root package name */
    private int f21798a;

    /* renamed from: b, reason: collision with root package name */
    private String f21799b;

    /* renamed from: c, reason: collision with root package name */
    private byte f21800c;

    C3987pi0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1514Ji0
    public final AbstractC1514Ji0 zza(String str) {
        this.f21799b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1514Ji0
    public final AbstractC1514Ji0 zzb(int i8) {
        this.f21798a = i8;
        this.f21800c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1514Ji0
    public final AbstractC1555Ki0 zzc() {
        if (this.f21800c == 1) {
            return new C4214ri0(this.f21798a, this.f21799b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
