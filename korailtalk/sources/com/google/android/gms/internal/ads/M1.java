package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14521a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14522b;

    /* renamed from: c, reason: collision with root package name */
    private int f14523c;

    /* renamed from: d, reason: collision with root package name */
    private int f14524d;

    public M1(byte[] bArr) {
        this.f14521a = bArr;
        this.f14522b = bArr.length;
    }

    public final int zza() {
        return (this.f14523c * 8) + this.f14524d;
    }

    public final int zzb(int i8) {
        int i9 = this.f14523c;
        int i10 = 8 - this.f14524d;
        int i11 = i9 + 1;
        byte[] bArr = this.f14521a;
        int iMin = Math.min(i8, i10);
        int i12 = ((bArr[i9] & 255) >> this.f14524d) & (255 >> (8 - iMin));
        while (iMin < i8) {
            i12 |= (this.f14521a[i11] & 255) << iMin;
            iMin += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i8));
        zzc(i8);
        return i13;
    }

    public final void zzc(int i8) {
        int i9;
        int i10 = i8 / 8;
        int i11 = this.f14523c + i10;
        this.f14523c = i11;
        int i12 = this.f14524d + (i8 - (i10 * 8));
        this.f14524d = i12;
        if (i12 > 7) {
            i11++;
            this.f14523c = i11;
            i12 -= 8;
            this.f14524d = i12;
        }
        boolean z8 = false;
        if (i11 >= 0 && (i11 < (i9 = this.f14522b) || (i11 == i9 && i12 == 0))) {
            z8 = true;
        }
        F10.zzf(z8);
    }

    public final boolean zzd() {
        int i8 = (this.f14521a[this.f14523c] & 255) >> this.f14524d;
        zzc(1);
        return 1 == (i8 & 1);
    }
}
