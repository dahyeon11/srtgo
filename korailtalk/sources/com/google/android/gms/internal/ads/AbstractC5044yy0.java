package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5044yy0 extends Dy0 {

    /* renamed from: d, reason: collision with root package name */
    final byte[] f24094d;

    /* renamed from: e, reason: collision with root package name */
    final int f24095e;

    /* renamed from: f, reason: collision with root package name */
    int f24096f;

    /* renamed from: g, reason: collision with root package name */
    int f24097g;

    AbstractC5044yy0(int i8) {
        super(null);
        if (i8 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i8, 20)];
        this.f24094d = bArr;
        this.f24095e = bArr.length;
    }

    final void g(byte b9) {
        int i8 = this.f24096f;
        this.f24096f = i8 + 1;
        this.f24094d[i8] = b9;
        this.f24097g++;
    }

    final void h(int i8) {
        int i9 = this.f24096f;
        int i10 = i9 + 1;
        this.f24096f = i10;
        byte[] bArr = this.f24094d;
        bArr[i9] = (byte) (i8 & 255);
        int i11 = i9 + 2;
        this.f24096f = i11;
        bArr[i10] = (byte) ((i8 >> 8) & 255);
        int i12 = i9 + 3;
        this.f24096f = i12;
        bArr[i11] = (byte) ((i8 >> 16) & 255);
        this.f24096f = i9 + 4;
        bArr[i12] = (byte) ((i8 >> 24) & 255);
        this.f24097g += 4;
    }

    final void i(long j8) {
        int i8 = this.f24096f;
        int i9 = i8 + 1;
        this.f24096f = i9;
        byte[] bArr = this.f24094d;
        bArr[i8] = (byte) (j8 & 255);
        int i10 = i8 + 2;
        this.f24096f = i10;
        bArr[i9] = (byte) ((j8 >> 8) & 255);
        int i11 = i8 + 3;
        this.f24096f = i11;
        bArr[i10] = (byte) ((j8 >> 16) & 255);
        int i12 = i8 + 4;
        this.f24096f = i12;
        bArr[i11] = (byte) (255 & (j8 >> 24));
        int i13 = i8 + 5;
        this.f24096f = i13;
        bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
        int i14 = i8 + 6;
        this.f24096f = i14;
        bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
        int i15 = i8 + 7;
        this.f24096f = i15;
        bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
        this.f24096f = i8 + 8;
        bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        this.f24097g += 8;
    }

    final void j(int i8) {
        if (!Dy0.f12722c) {
            while ((i8 & (-128)) != 0) {
                byte[] bArr = this.f24094d;
                int i9 = this.f24096f;
                this.f24096f = i9 + 1;
                bArr[i9] = (byte) ((i8 | 128) & 255);
                this.f24097g++;
                i8 >>>= 7;
            }
            byte[] bArr2 = this.f24094d;
            int i10 = this.f24096f;
            this.f24096f = i10 + 1;
            bArr2[i10] = (byte) i8;
            this.f24097g++;
            return;
        }
        long j8 = this.f24096f;
        while ((i8 & (-128)) != 0) {
            byte[] bArr3 = this.f24094d;
            int i11 = this.f24096f;
            this.f24096f = i11 + 1;
            MA0.y(bArr3, i11, (byte) ((i8 | 128) & 255));
            i8 >>>= 7;
        }
        byte[] bArr4 = this.f24094d;
        int i12 = this.f24096f;
        this.f24096f = i12 + 1;
        MA0.y(bArr4, i12, (byte) i8);
        this.f24097g += (int) (this.f24096f - j8);
    }

    final void k(long j8) {
        if (Dy0.f12722c) {
            long j9 = this.f24096f;
            while (true) {
                int i8 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr = this.f24094d;
                    int i9 = this.f24096f;
                    this.f24096f = i9 + 1;
                    MA0.y(bArr, i9, (byte) i8);
                    this.f24097g += (int) (this.f24096f - j9);
                    return;
                }
                byte[] bArr2 = this.f24094d;
                int i10 = this.f24096f;
                this.f24096f = i10 + 1;
                MA0.y(bArr2, i10, (byte) ((i8 | 128) & 255));
                j8 >>>= 7;
            }
        } else {
            while (true) {
                int i11 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr3 = this.f24094d;
                    int i12 = this.f24096f;
                    this.f24096f = i12 + 1;
                    bArr3[i12] = (byte) i11;
                    this.f24097g++;
                    return;
                }
                byte[] bArr4 = this.f24094d;
                int i13 = this.f24096f;
                this.f24096f = i13 + 1;
                bArr4[i13] = (byte) ((i11 | 128) & 255);
                this.f24097g++;
                j8 >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
