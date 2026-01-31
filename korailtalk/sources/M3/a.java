package M3;

import Q7.C;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int[] f3094a;

    /* renamed from: b, reason: collision with root package name */
    private int f3095b;

    public a() {
        this.f3095b = 0;
        this.f3094a = new int[1];
    }

    private void a(int i8) {
        if (i8 > (this.f3094a.length << 5)) {
            int[] iArrB = b(i8);
            int[] iArr = this.f3094a;
            System.arraycopy(iArr, 0, iArrB, 0, iArr.length);
            this.f3094a = iArrB;
        }
    }

    private static int[] b(int i8) {
        return new int[(i8 + 31) / 32];
    }

    public void appendBit(boolean z8) {
        a(this.f3095b + 1);
        if (z8) {
            int[] iArr = this.f3094a;
            int i8 = this.f3095b;
            int i9 = i8 / 32;
            iArr[i9] = (1 << (i8 & 31)) | iArr[i9];
        }
        this.f3095b++;
    }

    public void appendBitArray(a aVar) {
        int i8 = aVar.f3095b;
        a(this.f3095b + i8);
        for (int i9 = 0; i9 < i8; i9++) {
            appendBit(aVar.get(i9));
        }
    }

    public void appendBits(int i8, int i9) {
        if (i9 < 0 || i9 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        a(this.f3095b + i9);
        while (i9 > 0) {
            boolean z8 = true;
            if (((i8 >> (i9 - 1)) & 1) != 1) {
                z8 = false;
            }
            appendBit(z8);
            i9--;
        }
    }

    public void clear() {
        int length = this.f3094a.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f3094a[i8] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3095b == aVar.f3095b && Arrays.equals(this.f3094a, aVar.f3094a);
    }

    public void flip(int i8) {
        int[] iArr = this.f3094a;
        int i9 = i8 / 32;
        iArr[i9] = (1 << (i8 & 31)) ^ iArr[i9];
    }

    public boolean get(int i8) {
        return ((1 << (i8 & 31)) & this.f3094a[i8 / 32]) != 0;
    }

    public int[] getBitArray() {
        return this.f3094a;
    }

    public int getNextSet(int i8) {
        int i9 = this.f3095b;
        if (i8 >= i9) {
            return i9;
        }
        int i10 = i8 / 32;
        int i11 = (~((1 << (i8 & 31)) - 1)) & this.f3094a[i10];
        while (i11 == 0) {
            i10++;
            int[] iArr = this.f3094a;
            if (i10 == iArr.length) {
                return this.f3095b;
            }
            i11 = iArr[i10];
        }
        int iNumberOfTrailingZeros = (i10 << 5) + Integer.numberOfTrailingZeros(i11);
        int i12 = this.f3095b;
        return iNumberOfTrailingZeros > i12 ? i12 : iNumberOfTrailingZeros;
    }

    public int getNextUnset(int i8) {
        int i9 = this.f3095b;
        if (i8 >= i9) {
            return i9;
        }
        int i10 = i8 / 32;
        int i11 = (~((1 << (i8 & 31)) - 1)) & (~this.f3094a[i10]);
        while (i11 == 0) {
            i10++;
            int[] iArr = this.f3094a;
            if (i10 == iArr.length) {
                return this.f3095b;
            }
            i11 = ~iArr[i10];
        }
        int iNumberOfTrailingZeros = (i10 << 5) + Integer.numberOfTrailingZeros(i11);
        int i12 = this.f3095b;
        return iNumberOfTrailingZeros > i12 ? i12 : iNumberOfTrailingZeros;
    }

    public int getSize() {
        return this.f3095b;
    }

    public int getSizeInBytes() {
        return (this.f3095b + 7) / 8;
    }

    public int hashCode() {
        return (this.f3095b * 31) + Arrays.hashCode(this.f3094a);
    }

    public boolean isRange(int i8, int i9, boolean z8) {
        if (i9 < i8 || i8 < 0 || i9 > this.f3095b) {
            throw new IllegalArgumentException();
        }
        if (i9 == i8) {
            return true;
        }
        int i10 = i9 - 1;
        int i11 = i8 / 32;
        int i12 = i10 / 32;
        int i13 = i11;
        while (i13 <= i12) {
            int i14 = (2 << (i13 >= i12 ? 31 & i10 : 31)) - (1 << (i13 > i11 ? 0 : i8 & 31));
            int i15 = this.f3094a[i13] & i14;
            if (!z8) {
                i14 = 0;
            }
            if (i15 != i14) {
                return false;
            }
            i13++;
        }
        return true;
    }

    public void reverse() {
        int[] iArr = new int[this.f3094a.length];
        int i8 = (this.f3095b - 1) / 32;
        int i9 = i8 + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            long j8 = this.f3094a[i10];
            long j9 = ((j8 & 1431655765) << 1) | ((j8 >> 1) & 1431655765);
            long j10 = ((j9 & 858993459) << 2) | ((j9 >> 2) & 858993459);
            long j11 = ((j10 & 252645135) << 4) | ((j10 >> 4) & 252645135);
            long j12 = ((j11 & 16711935) << 8) | ((j11 >> 8) & 16711935);
            iArr[i8 - i10] = (int) (((j12 & 65535) << 16) | ((j12 >> 16) & 65535));
        }
        int i11 = this.f3095b;
        int i12 = i9 << 5;
        if (i11 != i12) {
            int i13 = i12 - i11;
            int i14 = iArr[0] >>> i13;
            for (int i15 = 1; i15 < i9; i15++) {
                int i16 = iArr[i15];
                iArr[i15 - 1] = i14 | (i16 << (32 - i13));
                i14 = i16 >>> i13;
            }
            iArr[i8] = i14;
        }
        this.f3094a = iArr;
    }

    public void set(int i8) {
        int[] iArr = this.f3094a;
        int i9 = i8 / 32;
        iArr[i9] = (1 << (i8 & 31)) | iArr[i9];
    }

    public void setBulk(int i8, int i9) {
        this.f3094a[i8 / 32] = i9;
    }

    public void setRange(int i8, int i9) {
        if (i9 < i8 || i8 < 0 || i9 > this.f3095b) {
            throw new IllegalArgumentException();
        }
        if (i9 == i8) {
            return;
        }
        int i10 = i9 - 1;
        int i11 = i8 / 32;
        int i12 = i10 / 32;
        int i13 = i11;
        while (i13 <= i12) {
            int i14 = 31;
            int i15 = i13 > i11 ? 0 : i8 & 31;
            if (i13 >= i12) {
                i14 = 31 & i10;
            }
            int i16 = (2 << i14) - (1 << i15);
            int[] iArr = this.f3094a;
            iArr[i13] = i16 | iArr[i13];
            i13++;
        }
    }

    public void toBytes(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                if (get(i8)) {
                    i12 |= 1 << (7 - i13);
                }
                i8++;
            }
            bArr[i9 + i11] = (byte) i12;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f3095b);
        for (int i8 = 0; i8 < this.f3095b; i8++) {
            if ((i8 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(get(i8) ? 'X' : C.PACKAGE_SEPARATOR_CHAR);
        }
        return sb.toString();
    }

    public void xor(a aVar) {
        if (this.f3095b != aVar.f3095b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i8 = 0;
        while (true) {
            int[] iArr = this.f3094a;
            if (i8 >= iArr.length) {
                return;
            }
            iArr[i8] = iArr[i8] ^ aVar.f3094a[i8];
            i8++;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a m7clone() {
        return new a((int[]) this.f3094a.clone(), this.f3095b);
    }

    public a(int i8) {
        this.f3095b = i8;
        this.f3094a = b(i8);
    }

    a(int[] iArr, int i8) {
        this.f3094a = iArr;
        this.f3095b = i8;
    }
}
