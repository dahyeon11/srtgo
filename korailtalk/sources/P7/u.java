package P7;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class u extends f {

    /* renamed from: e, reason: collision with root package name */
    final transient byte[][] f3822e;

    /* renamed from: f, reason: collision with root package name */
    final transient int[] f3823f;

    u(c cVar, int i8) {
        super(null);
        y.checkOffsetAndCount(cVar.f3775b, 0L, i8);
        s sVar = cVar.f3774a;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = sVar.f3815c;
            int i13 = sVar.f3814b;
            if (i12 == i13) {
                throw new AssertionError("s.limit == s.pos");
            }
            i10 += i12 - i13;
            i11++;
            sVar = sVar.f3818f;
        }
        this.f3822e = new byte[i11][];
        this.f3823f = new int[i11 * 2];
        s sVar2 = cVar.f3774a;
        int i14 = 0;
        while (i9 < i8) {
            byte[][] bArr = this.f3822e;
            bArr[i14] = sVar2.f3813a;
            int i15 = sVar2.f3815c;
            int i16 = sVar2.f3814b;
            i9 += i15 - i16;
            if (i9 > i8) {
                i9 = i8;
            }
            int[] iArr = this.f3823f;
            iArr[i14] = i9;
            iArr[bArr.length + i14] = i16;
            sVar2.f3816d = true;
            i14++;
            sVar2 = sVar2.f3818f;
        }
    }

    private int g(int i8) {
        int iBinarySearch = Arrays.binarySearch(this.f3823f, 0, this.f3822e.length, i8 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private f h() {
        return new f(toByteArray());
    }

    @Override // P7.f
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // P7.f
    public String base64() {
        return h().base64();
    }

    @Override // P7.f
    public String base64Url() {
        return h().base64Url();
    }

    @Override // P7.f
    byte[] e() {
        return toByteArray();
    }

    @Override // P7.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.size() == size() && rangeEquals(0, fVar, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // P7.f
    void f(c cVar) {
        int length = this.f3822e.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int[] iArr = this.f3823f;
            int i10 = iArr[length + i8];
            int i11 = iArr[i8];
            s sVar = new s(this.f3822e[i8], i10, (i10 + i11) - i9, true, false);
            s sVar2 = cVar.f3774a;
            if (sVar2 == null) {
                sVar.f3819g = sVar;
                sVar.f3818f = sVar;
                cVar.f3774a = sVar;
            } else {
                sVar2.f3819g.push(sVar);
            }
            i8++;
            i9 = i11;
        }
        cVar.f3775b += i9;
    }

    @Override // P7.f
    public byte getByte(int i8) {
        y.checkOffsetAndCount(this.f3823f[this.f3822e.length - 1], i8, 1L);
        int iG = g(i8);
        int i9 = iG == 0 ? 0 : this.f3823f[iG - 1];
        int[] iArr = this.f3823f;
        byte[][] bArr = this.f3822e;
        return bArr[iG][(i8 - i9) + iArr[bArr.length + iG]];
    }

    @Override // P7.f
    public int hashCode() {
        int i8 = this.f3781b;
        if (i8 != 0) {
            return i8;
        }
        int length = this.f3822e.length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            byte[] bArr = this.f3822e[i9];
            int[] iArr = this.f3823f;
            int i12 = iArr[length + i9];
            int i13 = iArr[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        this.f3781b = i10;
        return i10;
    }

    @Override // P7.f
    public String hex() {
        return h().hex();
    }

    @Override // P7.f
    public f hmacSha1(f fVar) {
        return h().hmacSha1(fVar);
    }

    @Override // P7.f
    public f hmacSha256(f fVar) {
        return h().hmacSha256(fVar);
    }

    @Override // P7.f
    public int indexOf(byte[] bArr, int i8) {
        return h().indexOf(bArr, i8);
    }

    @Override // P7.f
    public int lastIndexOf(byte[] bArr, int i8) {
        return h().lastIndexOf(bArr, i8);
    }

    @Override // P7.f
    public f md5() {
        return h().md5();
    }

    @Override // P7.f
    public boolean rangeEquals(int i8, f fVar, int i9, int i10) {
        if (i8 < 0 || i8 > size() - i10) {
            return false;
        }
        int iG = g(i8);
        while (i10 > 0) {
            int i11 = iG == 0 ? 0 : this.f3823f[iG - 1];
            int iMin = Math.min(i10, ((this.f3823f[iG] - i11) + i11) - i8);
            int[] iArr = this.f3823f;
            byte[][] bArr = this.f3822e;
            if (!fVar.rangeEquals(i9, bArr[iG], (i8 - i11) + iArr[bArr.length + iG], iMin)) {
                return false;
            }
            i8 += iMin;
            i9 += iMin;
            i10 -= iMin;
            iG++;
        }
        return true;
    }

    @Override // P7.f
    public f sha1() {
        return h().sha1();
    }

    @Override // P7.f
    public f sha256() {
        return h().sha256();
    }

    @Override // P7.f
    public int size() {
        return this.f3823f[this.f3822e.length - 1];
    }

    @Override // P7.f
    public String string(Charset charset) {
        return h().string(charset);
    }

    @Override // P7.f
    public f substring(int i8) {
        return h().substring(i8);
    }

    @Override // P7.f
    public f toAsciiLowercase() {
        return h().toAsciiLowercase();
    }

    @Override // P7.f
    public f toAsciiUppercase() {
        return h().toAsciiUppercase();
    }

    @Override // P7.f
    public byte[] toByteArray() {
        int[] iArr = this.f3823f;
        byte[][] bArr = this.f3822e;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int[] iArr2 = this.f3823f;
            int i10 = iArr2[length + i8];
            int i11 = iArr2[i8];
            System.arraycopy(this.f3822e[i8], i10, bArr2, i9, i11 - i9);
            i8++;
            i9 = i11;
        }
        return bArr2;
    }

    @Override // P7.f
    public String toString() {
        return h().toString();
    }

    @Override // P7.f
    public String utf8() {
        return h().utf8();
    }

    @Override // P7.f
    public void write(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        int length = this.f3822e.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int[] iArr = this.f3823f;
            int i10 = iArr[length + i8];
            int i11 = iArr[i8];
            outputStream.write(this.f3822e[i8], i10, i11 - i9);
            i8++;
            i9 = i11;
        }
    }

    @Override // P7.f
    public f substring(int i8, int i9) {
        return h().substring(i8, i9);
    }

    @Override // P7.f
    public boolean rangeEquals(int i8, byte[] bArr, int i9, int i10) {
        if (i8 < 0 || i8 > size() - i10 || i9 < 0 || i9 > bArr.length - i10) {
            return false;
        }
        int iG = g(i8);
        while (i10 > 0) {
            int i11 = iG == 0 ? 0 : this.f3823f[iG - 1];
            int iMin = Math.min(i10, ((this.f3823f[iG] - i11) + i11) - i8);
            int[] iArr = this.f3823f;
            byte[][] bArr2 = this.f3822e;
            if (!y.arrayRangeEquals(bArr2[iG], (i8 - i11) + iArr[bArr2.length + iG], bArr, i9, iMin)) {
                return false;
            }
            i8 += iMin;
            i9 += iMin;
            i10 -= iMin;
            iG++;
        }
        return true;
    }
}
