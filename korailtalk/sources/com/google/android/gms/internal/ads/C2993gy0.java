package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.gy0 */
/* loaded from: classes2.dex */
class C2993gy0 extends AbstractC2878fy0 {

    /* renamed from: d */
    protected final byte[] f19725d;

    C2993gy0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f19725d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    byte a(int i8) {
        return this.f19725d[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected void c(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f19725d, i8, bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3677my0) || zzd() != ((AbstractC3677my0) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof C2993gy0)) {
            return obj.equals(this);
        }
        C2993gy0 c2993gy0 = (C2993gy0) obj;
        int iK = k();
        int iK2 = c2993gy0.k();
        if (iK == 0 || iK2 == 0 || iK == iK2) {
            return m(c2993gy0, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final int f(int i8, int i9, int i10) {
        return AbstractC3793nz0.a(i8, this.f19725d, n() + i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final int g(int i8, int i9, int i10) {
        int iN = n() + i9;
        return RA0.f(i8, this.f19725d, iN, i10 + iN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final String h(Charset charset) {
        return new String(this.f19725d, n(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    final void i(Yx0 yx0) {
        yx0.zza(this.f19725d, n(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2878fy0
    final boolean m(AbstractC3677my0 abstractC3677my0, int i8, int i9) {
        if (i9 > abstractC3677my0.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i9 + zzd());
        }
        int i10 = i8 + i9;
        if (i10 > abstractC3677my0.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + abstractC3677my0.zzd());
        }
        if (!(abstractC3677my0 instanceof C2993gy0)) {
            return abstractC3677my0.zzk(i8, i10).equals(zzk(0, i9));
        }
        C2993gy0 c2993gy0 = (C2993gy0) abstractC3677my0;
        byte[] bArr = this.f19725d;
        byte[] bArr2 = c2993gy0.f19725d;
        int iN = n() + i9;
        int iN2 = n();
        int iN3 = c2993gy0.n() + i8;
        while (iN2 < iN) {
            if (bArr[iN2] != bArr2[iN3]) {
                return false;
            }
            iN2++;
            iN3++;
        }
        return true;
    }

    protected int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public byte zza(int i8) {
        return this.f19725d[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public int zzd() {
        return this.f19725d.length;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final AbstractC3677my0 zzk(int i8, int i9) {
        int iJ = AbstractC3677my0.j(i8, i9, zzd());
        return iJ == 0 ? AbstractC3677my0.zzb : new C2534cy0(this.f19725d, n() + i8, iJ);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final AbstractC4816wy0 zzl() {
        return AbstractC4816wy0.a(this.f19725d, n(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.f19725d, n(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final boolean zzp() {
        int iN = n();
        return RA0.j(this.f19725d, iN, zzd() + iN);
    }
}
