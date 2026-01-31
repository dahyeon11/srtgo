package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2534cy0 extends C2993gy0 {

    /* renamed from: e, reason: collision with root package name */
    private final int f18497e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18498f;

    C2534cy0(byte[] bArr, int i8, int i9) {
        super(bArr);
        AbstractC3677my0.j(i8, i8 + i9, bArr.length);
        this.f18497e = i8;
        this.f18498f = i9;
    }

    @Override // com.google.android.gms.internal.ads.C2993gy0, com.google.android.gms.internal.ads.AbstractC3677my0
    final byte a(int i8) {
        return this.f19725d[this.f18497e + i8];
    }

    @Override // com.google.android.gms.internal.ads.C2993gy0, com.google.android.gms.internal.ads.AbstractC3677my0
    protected final void c(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f19725d, this.f18497e + i8, bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.C2993gy0
    protected final int n() {
        return this.f18497e;
    }

    @Override // com.google.android.gms.internal.ads.C2993gy0, com.google.android.gms.internal.ads.AbstractC3677my0
    public final byte zza(int i8) {
        AbstractC3677my0.l(i8, this.f18498f);
        return this.f19725d[this.f18497e + i8];
    }

    @Override // com.google.android.gms.internal.ads.C2993gy0, com.google.android.gms.internal.ads.AbstractC3677my0
    public final int zzd() {
        return this.f18498f;
    }
}
