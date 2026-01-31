package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1755Pg0 {

    /* renamed from: a, reason: collision with root package name */
    private int f15389a;

    /* renamed from: b, reason: collision with root package name */
    private int f15390b;

    /* renamed from: c, reason: collision with root package name */
    private int f15391c;
    public byte[] zza;

    public C1755Pg0(byte[] bArr, int i8) {
        this.zza = bArr;
        this.f15391c = i8;
    }

    private final void a() {
        int i8;
        int i9 = this.f15389a;
        boolean z8 = false;
        if (i9 >= 0 && (i9 < (i8 = this.f15391c) || (i9 == i8 && this.f15390b == 0))) {
            z8 = true;
        }
        F10.zzf(z8);
    }

    public final int zza() {
        return ((this.f15391c - this.f15389a) * 8) - this.f15390b;
    }

    public final int zzb() {
        F10.zzf(this.f15390b == 0);
        return this.f15389a;
    }

    public final int zzc() {
        return (this.f15389a * 8) + this.f15390b;
    }

    public final int zzd(int i8) {
        int i9;
        if (i8 == 0) {
            return 0;
        }
        this.f15390b += i8;
        int i10 = 0;
        while (true) {
            i9 = this.f15390b;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.f15390b = i11;
            byte[] bArr = this.zza;
            int i12 = this.f15389a;
            this.f15389a = i12 + 1;
            i10 |= (bArr[i12] & 255) << i11;
        }
        byte[] bArr2 = this.zza;
        int i13 = this.f15389a;
        int i14 = i10 | ((bArr2[i13] & 255) >> (8 - i9));
        int i15 = 32 - i8;
        if (i9 == 8) {
            this.f15390b = 0;
            this.f15389a = i13 + 1;
        }
        int i16 = ((-1) >>> i15) & i14;
        a();
        return i16;
    }

    public final void zze() {
        if (this.f15390b == 0) {
            return;
        }
        this.f15390b = 0;
        this.f15389a++;
        a();
    }

    public final void zzf(int i8, int i9) {
        int iMin = Math.min(8 - this.f15390b, 14);
        int i10 = this.f15390b;
        int i11 = (8 - i10) - iMin;
        int i12 = androidx.core.view.M.ACTION_POINTER_INDEX_MASK >> i10;
        byte[] bArr = this.zza;
        int i13 = this.f15389a;
        byte b9 = (byte) ((i12 | ((1 << i11) - 1)) & bArr[i13]);
        bArr[i13] = b9;
        int i14 = 14 - iMin;
        int i15 = i8 & 16383;
        bArr[i13] = (byte) (b9 | ((i15 >>> i14) << i11));
        int i16 = i13 + 1;
        while (i14 > 8) {
            i14 -= 8;
            this.zza[i16] = (byte) (i15 >>> i14);
            i16++;
        }
        byte[] bArr2 = this.zza;
        byte b10 = (byte) (bArr2[i16] & ((1 << r0) - 1));
        bArr2[i16] = b10;
        bArr2[i16] = (byte) (((i15 & ((1 << i14) - 1)) << (8 - i14)) | b10);
        zzm(14);
        a();
    }

    public final void zzg(byte[] bArr, int i8, int i9) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i9 >> 3;
            if (i11 >= i10) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i12 = this.f15389a;
            int i13 = i12 + 1;
            this.f15389a = i13;
            byte b9 = bArr2[i12];
            int i14 = this.f15390b;
            byte b10 = (byte) (b9 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((bArr2[i13] & 255) >> (8 - i14)) | b10);
            i11++;
        }
        int i15 = i9 & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b11;
        int i16 = this.f15390b;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.zza;
            int i17 = this.f15389a;
            this.f15389a = i17 + 1;
            b11 = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            bArr[i10] = b11;
            i16 -= 8;
        }
        int i18 = i16 + i15;
        this.f15390b = i18;
        byte[] bArr4 = this.zza;
        int i19 = this.f15389a;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | b11);
        if (i18 == 8) {
            this.f15390b = 0;
            this.f15389a = i19 + 1;
        }
        a();
    }

    public final void zzh(byte[] bArr, int i8, int i9) {
        F10.zzf(this.f15390b == 0);
        System.arraycopy(this.zza, this.f15389a, bArr, 0, i9);
        this.f15389a += i9;
        a();
    }

    public final void zzi(C4099qh0 c4099qh0) {
        zzj(c4099qh0.zzM(), c4099qh0.zze());
        zzk(c4099qh0.zzd() * 8);
    }

    public final void zzj(byte[] bArr, int i8) {
        this.zza = bArr;
        this.f15389a = 0;
        this.f15390b = 0;
        this.f15391c = i8;
    }

    public final void zzk(int i8) {
        int i9 = i8 / 8;
        this.f15389a = i9;
        this.f15390b = i8 - (i9 * 8);
        a();
    }

    public final void zzl() {
        int i8 = this.f15390b + 1;
        this.f15390b = i8;
        if (i8 == 8) {
            this.f15390b = 0;
            this.f15389a++;
        }
        a();
    }

    public final void zzm(int i8) {
        int i9 = i8 / 8;
        int i10 = this.f15389a + i9;
        this.f15389a = i10;
        int i11 = this.f15390b + (i8 - (i9 * 8));
        this.f15390b = i11;
        if (i11 > 7) {
            this.f15389a = i10 + 1;
            this.f15390b = i11 - 8;
        }
        a();
    }

    public final void zzn(int i8) {
        F10.zzf(this.f15390b == 0);
        this.f15389a += i8;
        a();
    }

    public final boolean zzo() {
        int i8 = this.zza[this.f15389a] & (128 >> this.f15390b);
        zzl();
        return i8 != 0;
    }

    public C1755Pg0() {
        this.zza = AbstractC2281am0.zzf;
    }
}
