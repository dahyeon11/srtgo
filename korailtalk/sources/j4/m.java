package j4;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f33463a;

    /* renamed from: b, reason: collision with root package name */
    private int f33464b;

    /* renamed from: c, reason: collision with root package name */
    private int f33465c;

    public m(byte[] bArr, int i8, int i9) {
        this.f33463a = bArr;
        this.f33464b = i8;
        this.f33465c = i9;
    }

    public static byte[] rotate180(byte[] bArr, int i8, int i9) {
        int i10 = i8 * i9;
        byte[] bArr2 = new byte[i10];
        int i11 = i10 - 1;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i11] = bArr[i12];
            i11--;
        }
        return bArr2;
    }

    public static byte[] rotateCCW(byte[] bArr, int i8, int i9) {
        int i10 = i8 * i9;
        byte[] bArr2 = new byte[i10];
        int i11 = i10 - 1;
        for (int i12 = 0; i12 < i8; i12++) {
            for (int i13 = i9 - 1; i13 >= 0; i13--) {
                bArr2[i11] = bArr[(i13 * i8) + i12];
                i11--;
            }
        }
        return bArr2;
    }

    public static byte[] rotateCW(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i8 * i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            for (int i12 = i9 - 1; i12 >= 0; i12--) {
                bArr2[i10] = bArr[(i12 * i8) + i11];
                i10++;
            }
        }
        return bArr2;
    }

    public m cropAndScale(Rect rect, int i8) {
        int iWidth = rect.width() / i8;
        int iHeight = rect.height() / i8;
        int i9 = rect.top;
        byte[] bArr = new byte[iWidth * iHeight];
        if (i8 == 1) {
            int i10 = (i9 * this.f33464b) + rect.left;
            for (int i11 = 0; i11 < iHeight; i11++) {
                System.arraycopy(this.f33463a, i10, bArr, i11 * iWidth, iWidth);
                i10 += this.f33464b;
            }
        } else {
            int i12 = (i9 * this.f33464b) + rect.left;
            for (int i13 = 0; i13 < iHeight; i13++) {
                int i14 = i13 * iWidth;
                int i15 = i12;
                for (int i16 = 0; i16 < iWidth; i16++) {
                    bArr[i14] = this.f33463a[i15];
                    i15 += i8;
                    i14++;
                }
                i12 += this.f33464b * i8;
            }
        }
        return new m(bArr, iWidth, iHeight);
    }

    public byte[] getData() {
        return this.f33463a;
    }

    public int getHeight() {
        return this.f33465c;
    }

    public int getWidth() {
        return this.f33464b;
    }

    public m rotateCameraPreview(int i8) {
        return i8 != 90 ? i8 != 180 ? i8 != 270 ? this : new m(rotateCCW(this.f33463a, this.f33464b, this.f33465c), this.f33465c, this.f33464b) : new m(rotate180(this.f33463a, this.f33464b, this.f33465c), this.f33464b, this.f33465c) : new m(rotateCW(this.f33463a, this.f33464b, this.f33465c), this.f33465c, this.f33464b);
    }
}
