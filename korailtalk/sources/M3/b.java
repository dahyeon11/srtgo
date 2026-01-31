package M3;

import Q7.X;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final int f3096a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3097b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3098c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f3099d;

    public b(int i8) {
        this(i8, i8);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f3097b * (this.f3096a + 1));
        for (int i8 = 0; i8 < this.f3097b; i8++) {
            for (int i9 = 0; i9 < this.f3096a; i9++) {
                sb.append(get(i9, i8) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public static b parse(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        boolean[] zArr = new boolean[str.length()];
        int i8 = -1;
        int length = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (length < str.length()) {
            if (str.charAt(length) == '\n' || str.charAt(length) == '\r') {
                if (i9 > i10) {
                    if (i8 == -1) {
                        i8 = i9 - i10;
                    } else if (i9 - i10 != i8) {
                        throw new IllegalArgumentException("row lengths do not match");
                    }
                    i11++;
                    i10 = i9;
                }
                length++;
            } else {
                if (str.substring(length, str2.length() + length).equals(str2)) {
                    length += str2.length();
                    zArr[i9] = true;
                } else {
                    if (!str.substring(length, str3.length() + length).equals(str3)) {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(length));
                    }
                    length += str3.length();
                    zArr[i9] = false;
                }
                i9++;
            }
        }
        if (i9 > i10) {
            if (i8 == -1) {
                i8 = i9 - i10;
            } else if (i9 - i10 != i8) {
                throw new IllegalArgumentException("row lengths do not match");
            }
            i11++;
        }
        b bVar = new b(i8, i11);
        for (int i12 = 0; i12 < i9; i12++) {
            if (zArr[i12]) {
                bVar.set(i12 % i8, i12 / i8);
            }
        }
        return bVar;
    }

    public void clear() {
        int length = this.f3099d.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f3099d[i8] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3096a == bVar.f3096a && this.f3097b == bVar.f3097b && this.f3098c == bVar.f3098c && Arrays.equals(this.f3099d, bVar.f3099d);
    }

    public void flip(int i8, int i9) {
        int i10 = (i9 * this.f3098c) + (i8 / 32);
        int[] iArr = this.f3099d;
        iArr[i10] = (1 << (i8 & 31)) ^ iArr[i10];
    }

    public boolean get(int i8, int i9) {
        return ((this.f3099d[(i9 * this.f3098c) + (i8 / 32)] >>> (i8 & 31)) & 1) != 0;
    }

    public int[] getBottomRightOnBit() {
        int length = this.f3099d.length - 1;
        while (length >= 0 && this.f3099d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i8 = this.f3098c;
        int i9 = length / i8;
        int i10 = (length % i8) << 5;
        int i11 = 31;
        while ((this.f3099d[length] >>> i11) == 0) {
            i11--;
        }
        return new int[]{i10 + i11, i9};
    }

    public int[] getEnclosingRectangle() {
        int i8 = this.f3096a;
        int i9 = this.f3097b;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < this.f3097b; i12++) {
            int i13 = 0;
            while (true) {
                int i14 = this.f3098c;
                if (i13 < i14) {
                    int i15 = this.f3099d[(i14 * i12) + i13];
                    if (i15 != 0) {
                        if (i12 < i9) {
                            i9 = i12;
                        }
                        if (i12 > i11) {
                            i11 = i12;
                        }
                        int i16 = i13 << 5;
                        if (i16 < i8) {
                            int i17 = 0;
                            while ((i15 << (31 - i17)) == 0) {
                                i17++;
                            }
                            int i18 = i17 + i16;
                            if (i18 < i8) {
                                i8 = i18;
                            }
                        }
                        if (i16 + 31 > i10) {
                            int i19 = 31;
                            while ((i15 >>> i19) == 0) {
                                i19--;
                            }
                            int i20 = i16 + i19;
                            if (i20 > i10) {
                                i10 = i20;
                            }
                        }
                    }
                    i13++;
                }
            }
        }
        if (i10 < i8 || i11 < i9) {
            return null;
        }
        return new int[]{i8, i9, (i10 - i8) + 1, (i11 - i9) + 1};
    }

    public int getHeight() {
        return this.f3097b;
    }

    public a getRow(int i8, a aVar) {
        if (aVar == null || aVar.getSize() < this.f3096a) {
            aVar = new a(this.f3096a);
        } else {
            aVar.clear();
        }
        int i9 = i8 * this.f3098c;
        for (int i10 = 0; i10 < this.f3098c; i10++) {
            aVar.setBulk(i10 << 5, this.f3099d[i9 + i10]);
        }
        return aVar;
    }

    public int getRowSize() {
        return this.f3098c;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            iArr = this.f3099d;
            if (i9 >= iArr.length || iArr[i9] != 0) {
                break;
            }
            i9++;
        }
        if (i9 == iArr.length) {
            return null;
        }
        int i10 = this.f3098c;
        int i11 = i9 / i10;
        int i12 = (i9 % i10) << 5;
        while ((iArr[i9] << (31 - i8)) == 0) {
            i8++;
        }
        return new int[]{i12 + i8, i11};
    }

    public int getWidth() {
        return this.f3096a;
    }

    public int hashCode() {
        int i8 = this.f3096a;
        return (((((((i8 * 31) + i8) * 31) + this.f3097b) * 31) + this.f3098c) * 31) + Arrays.hashCode(this.f3099d);
    }

    public void rotate180() {
        int width = getWidth();
        int height = getHeight();
        a aVar = new a(width);
        a aVar2 = new a(width);
        for (int i8 = 0; i8 < (height + 1) / 2; i8++) {
            aVar = getRow(i8, aVar);
            int i9 = (height - 1) - i8;
            aVar2 = getRow(i9, aVar2);
            aVar.reverse();
            aVar2.reverse();
            setRow(i8, aVar2);
            setRow(i9, aVar);
        }
    }

    public void set(int i8, int i9) {
        int i10 = (i9 * this.f3098c) + (i8 / 32);
        int[] iArr = this.f3099d;
        iArr[i10] = (1 << (i8 & 31)) | iArr[i10];
    }

    public void setRegion(int i8, int i9, int i10, int i11) {
        if (i9 < 0 || i8 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i11 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i12 = i10 + i8;
        int i13 = i11 + i9;
        if (i13 > this.f3097b || i12 > this.f3096a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i9 < i13) {
            int i14 = this.f3098c * i9;
            for (int i15 = i8; i15 < i12; i15++) {
                int[] iArr = this.f3099d;
                int i16 = (i15 / 32) + i14;
                iArr[i16] = iArr[i16] | (1 << (i15 & 31));
            }
            i9++;
        }
    }

    public void setRow(int i8, a aVar) {
        int[] bitArray = aVar.getBitArray();
        int[] iArr = this.f3099d;
        int i9 = this.f3098c;
        System.arraycopy(bitArray, 0, iArr, i8 * i9, i9);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int i8, int i9) {
        int i10 = (i9 * this.f3098c) + (i8 / 32);
        int[] iArr = this.f3099d;
        iArr[i10] = (~(1 << (i8 & 31))) & iArr[i10];
    }

    public void xor(b bVar) {
        if (this.f3096a != bVar.getWidth() || this.f3097b != bVar.getHeight() || this.f3098c != bVar.getRowSize()) {
            throw new IllegalArgumentException("input matrix dimensions do not match");
        }
        a aVar = new a((this.f3096a / 32) + 1);
        for (int i8 = 0; i8 < this.f3097b; i8++) {
            int i9 = this.f3098c * i8;
            int[] bitArray = bVar.getRow(i8, aVar).getBitArray();
            for (int i10 = 0; i10 < this.f3098c; i10++) {
                int[] iArr = this.f3099d;
                int i11 = i9 + i10;
                iArr[i11] = iArr[i11] ^ bitArray[i10];
            }
        }
    }

    public b(int i8, int i9) {
        if (i8 <= 0 || i9 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f3096a = i8;
        this.f3097b = i9;
        int i10 = (i8 + 31) / 32;
        this.f3098c = i10;
        this.f3099d = new int[i10 * i9];
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m8clone() {
        return new b(this.f3096a, this.f3097b, this.f3098c, (int[]) this.f3099d.clone());
    }

    public String toString(String str, String str2) {
        return a(str, str2, X.LF);
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return a(str, str2, str3);
    }

    private b(int i8, int i9, int i10, int[] iArr) {
        this.f3096a = i8;
        this.f3097b = i9;
        this.f3098c = i10;
        this.f3099d = iArr;
    }
}
