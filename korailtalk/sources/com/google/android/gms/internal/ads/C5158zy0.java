package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5158zy0 extends Dy0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f24221d;

    /* renamed from: e, reason: collision with root package name */
    private final int f24222e;

    /* renamed from: f, reason: collision with root package name */
    private int f24223f;

    C5158zy0(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f24221d = bArr;
        this.f24223f = 0;
        this.f24222e = i9;
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    final void e(int i8, Pz0 pz0, InterfaceC3360kA0 interfaceC3360kA0) throws Ay0 {
        zzu((i8 << 3) | 2);
        zzu(((Qx0) pz0).b(interfaceC3360kA0));
        interfaceC3360kA0.zzj(pz0, this.f12723a);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzL() {
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzM(byte b9) throws Ay0 {
        try {
            byte[] bArr = this.f24221d;
            int i8 = this.f24223f;
            this.f24223f = i8 + 1;
            bArr[i8] = b9;
        } catch (IndexOutOfBoundsException e8) {
            throw new Ay0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24223f), Integer.valueOf(this.f24222e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzN(int i8, boolean z8) throws Ay0 {
        zzu(i8 << 3);
        zzM(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzO(int i8, AbstractC3677my0 abstractC3677my0) throws Ay0 {
        zzu((i8 << 3) | 2);
        zzu(abstractC3677my0.zzd());
        abstractC3677my0.i(this);
    }

    @Override // com.google.android.gms.internal.ads.Dy0, com.google.android.gms.internal.ads.Yx0
    public final void zza(byte[] bArr, int i8, int i9) throws Ay0 {
        zze(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final int zzb() {
        return this.f24222e - this.f24223f;
    }

    public final void zze(byte[] bArr, int i8, int i9) throws Ay0 {
        try {
            System.arraycopy(bArr, i8, this.f24221d, this.f24223f, i9);
            this.f24223f += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new Ay0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24223f), Integer.valueOf(this.f24222e), Integer.valueOf(i9)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzh(int i8, int i9) throws Ay0 {
        zzu((i8 << 3) | 5);
        zzi(i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzi(int i8) throws Ay0 {
        try {
            byte[] bArr = this.f24221d;
            int i9 = this.f24223f;
            int i10 = i9 + 1;
            this.f24223f = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f24223f = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f24223f = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f24223f = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new Ay0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24223f), Integer.valueOf(this.f24222e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzj(int i8, long j8) throws Ay0 {
        zzu((i8 << 3) | 1);
        zzk(j8);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzk(long j8) throws Ay0 {
        try {
            byte[] bArr = this.f24221d;
            int i8 = this.f24223f;
            int i9 = i8 + 1;
            this.f24223f = i9;
            bArr[i8] = (byte) (((int) j8) & 255);
            int i10 = i8 + 2;
            this.f24223f = i10;
            bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
            int i11 = i8 + 3;
            this.f24223f = i11;
            bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
            int i12 = i8 + 4;
            this.f24223f = i12;
            bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
            int i13 = i8 + 5;
            this.f24223f = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f24223f = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f24223f = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f24223f = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new Ay0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24223f), Integer.valueOf(this.f24222e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzl(int i8, int i9) throws Ay0 {
        zzu(i8 << 3);
        zzm(i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzm(int i8) throws Ay0 {
        if (i8 >= 0) {
            zzu(i8);
        } else {
            zzw(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzo(int i8, Pz0 pz0) throws Ay0 {
        zzu(11);
        zzt(2, i8);
        zzu(26);
        zzu(pz0.zzaY());
        pz0.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzp(int i8, AbstractC3677my0 abstractC3677my0) throws Ay0 {
        zzu(11);
        zzt(2, i8);
        zzO(3, abstractC3677my0);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzq(int i8, String str) throws Ay0 {
        zzu((i8 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws Ay0 {
        int i8 = this.f24223f;
        try {
            int iZzD = Dy0.zzD(str.length() * 3);
            int iZzD2 = Dy0.zzD(str.length());
            if (iZzD2 != iZzD) {
                zzu(RA0.e(str));
                byte[] bArr = this.f24221d;
                int i9 = this.f24223f;
                this.f24223f = RA0.d(str, bArr, i9, this.f24222e - i9);
                return;
            }
            int i10 = i8 + iZzD2;
            this.f24223f = i10;
            int iD = RA0.d(str, this.f24221d, i10, this.f24222e - i10);
            this.f24223f = i8;
            zzu((iD - i8) - iZzD2);
            this.f24223f = iD;
        } catch (QA0 e8) {
            this.f24223f = i8;
            c(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new Ay0(e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzs(int i8, int i9) throws Ay0 {
        zzu((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzt(int i8, int i9) throws Ay0 {
        zzu(i8 << 3);
        zzu(i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzu(int i8) throws Ay0 {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f24221d;
                int i9 = this.f24223f;
                this.f24223f = i9 + 1;
                bArr[i9] = (byte) ((i8 | 128) & 255);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new Ay0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24223f), Integer.valueOf(this.f24222e), 1), e8);
            }
        }
        byte[] bArr2 = this.f24221d;
        int i10 = this.f24223f;
        this.f24223f = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzv(int i8, long j8) throws Ay0 {
        zzu(i8 << 3);
        zzw(j8);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzw(long j8) throws Ay0 {
        if (!Dy0.f12722c || this.f24222e - this.f24223f < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f24221d;
                    int i8 = this.f24223f;
                    this.f24223f = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new Ay0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24223f), Integer.valueOf(this.f24222e), 1), e8);
                }
            }
            byte[] bArr2 = this.f24221d;
            int i9 = this.f24223f;
            this.f24223f = i9 + 1;
            bArr2[i9] = (byte) j8;
            return;
        }
        while (true) {
            int i10 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.f24221d;
                int i11 = this.f24223f;
                this.f24223f = i11 + 1;
                MA0.y(bArr3, i11, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f24221d;
            int i12 = this.f24223f;
            this.f24223f = i12 + 1;
            MA0.y(bArr4, i12, (byte) ((i10 | 128) & 255));
            j8 >>>= 7;
        }
    }
}
