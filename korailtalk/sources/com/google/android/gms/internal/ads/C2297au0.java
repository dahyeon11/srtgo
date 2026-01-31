package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.au0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2297au0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f18049a;

    /* renamed from: b, reason: collision with root package name */
    private int f18050b;

    /* renamed from: c, reason: collision with root package name */
    private int f18051c;

    /* renamed from: d, reason: collision with root package name */
    private int f18052d = 0;

    public C2297au0(byte[] bArr, int i8, int i9) {
        this.f18049a = bArr;
        this.f18051c = i8;
        this.f18050b = i9;
        b();
    }

    private final int a() {
        int i8 = 0;
        while (!zzf()) {
            i8++;
        }
        return ((1 << i8) - 1) + (i8 > 0 ? zza(i8) : 0);
    }

    private final void b() {
        int i8;
        int i9 = this.f18051c;
        boolean z8 = false;
        if (i9 >= 0 && (i9 < (i8 = this.f18050b) || (i9 == i8 && this.f18052d == 0))) {
            z8 = true;
        }
        F10.zzf(z8);
    }

    private final boolean c(int i8) {
        if (i8 < 2 || i8 >= this.f18050b) {
            return false;
        }
        byte[] bArr = this.f18049a;
        return bArr[i8] == 3 && bArr[i8 + (-2)] == 0 && bArr[i8 + (-1)] == 0;
    }

    public final int zza(int i8) {
        int i9;
        this.f18052d += i8;
        int i10 = 0;
        while (true) {
            i9 = this.f18052d;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.f18052d = i11;
            byte[] bArr = this.f18049a;
            int i12 = this.f18051c;
            i10 |= (bArr[i12] & 255) << i11;
            if (true != c(i12 + 1)) {
                i = 1;
            }
            this.f18051c = i12 + i;
        }
        byte[] bArr2 = this.f18049a;
        int i13 = this.f18051c;
        int i14 = i10 | ((bArr2[i13] & 255) >> (8 - i9));
        int i15 = 32 - i8;
        if (i9 == 8) {
            this.f18052d = 0;
            this.f18051c = i13 + (true != c(i13 + 1) ? 1 : 2);
        }
        int i16 = ((-1) >>> i15) & i14;
        b();
        return i16;
    }

    public final int zzb() {
        int iA = a();
        return (iA % 2 == 0 ? -1 : 1) * ((iA + 1) / 2);
    }

    public final int zzc() {
        return a();
    }

    public final void zzd() {
        int i8 = this.f18052d + 1;
        this.f18052d = i8;
        if (i8 == 8) {
            this.f18052d = 0;
            int i9 = this.f18051c;
            this.f18051c = i9 + (true == c(i9 + 1) ? 2 : 1);
        }
        b();
    }

    public final void zze(int i8) {
        int i9 = this.f18051c;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        this.f18051c = i11;
        int i12 = this.f18052d + (i8 - (i10 * 8));
        this.f18052d = i12;
        if (i12 > 7) {
            this.f18051c = i11 + 1;
            this.f18052d = i12 - 8;
        }
        while (true) {
            i9++;
            if (i9 > this.f18051c) {
                b();
                return;
            } else if (c(i9)) {
                this.f18051c++;
                i9 += 2;
            }
        }
    }

    public final boolean zzf() {
        int i8 = this.f18049a[this.f18051c] & (128 >> this.f18052d);
        zzd();
        return i8 != 0;
    }
}
