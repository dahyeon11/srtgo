package P7;

import Q7.X;
import com.kakao.sdk.auth.Constants;
import e3.AbstractC5358c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class f implements Serializable, Comparable {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f3780a;

    /* renamed from: b, reason: collision with root package name */
    transient int f3781b;

    /* renamed from: c, reason: collision with root package name */
    transient String f3782c;

    /* renamed from: d, reason: collision with root package name */
    static final char[] f3779d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final f EMPTY = of(new byte[0]);

    f(byte[] bArr) {
        this.f3780a = bArr;
    }

    static int a(String str, int i8) {
        int length = str.length();
        int iCharCount = 0;
        int i9 = 0;
        while (iCharCount < length) {
            if (i9 == i8) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i9++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }

    private static int b(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        if (c9 >= 'A' && c9 <= 'F') {
            return c9 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c9);
    }

    private f c(String str) {
        try {
            return of(MessageDigest.getInstance(str).digest(this.f3780a));
        } catch (NoSuchAlgorithmException e8) {
            throw new AssertionError(e8);
        }
    }

    private f d(String str, f fVar) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(fVar.toByteArray(), str));
            return of(mac.doFinal(this.f3780a));
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new AssertionError(e9);
        }
    }

    public static f decodeBase64(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] bArrDecode = b.decode(str);
        if (bArrDecode != null) {
            return new f(bArrDecode);
        }
        return null;
    }

    public static f decodeHex(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) ((b(str.charAt(i9)) << 4) + b(str.charAt(i9 + 1)));
        }
        return of(bArr);
    }

    public static f encodeString(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new f(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public static f encodeUtf8(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(y.UTF_8));
        fVar.f3782c = str;
        return fVar;
    }

    public static f of(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f read(InputStream inputStream, int i8) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i8);
        }
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int i10 = inputStream.read(bArr, i9, i8 - i9);
            if (i10 == -1) {
                throw new EOFException();
            }
            i9 += i10;
        }
        return new f(bArr);
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.f3780a).asReadOnlyBuffer();
    }

    public String base64() {
        return b.encode(this.f3780a);
    }

    public String base64Url() {
        return b.encodeUrl(this.f3780a);
    }

    byte[] e() {
        return this.f3780a;
    }

    public final boolean endsWith(f fVar) {
        return rangeEquals(size() - fVar.size(), fVar, 0, fVar.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int size = fVar.size();
            byte[] bArr = this.f3780a;
            if (size == bArr.length && fVar.rangeEquals(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    void f(c cVar) {
        byte[] bArr = this.f3780a;
        cVar.write(bArr, 0, bArr.length);
    }

    public byte getByte(int i8) {
        return this.f3780a[i8];
    }

    public int hashCode() {
        int i8 = this.f3781b;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = Arrays.hashCode(this.f3780a);
        this.f3781b = iHashCode;
        return iHashCode;
    }

    public String hex() {
        byte[] bArr = this.f3780a;
        char[] cArr = new char[bArr.length * 2];
        int i8 = 0;
        for (byte b9 : bArr) {
            int i9 = i8 + 1;
            char[] cArr2 = f3779d;
            cArr[i8] = cArr2[(b9 >> 4) & 15];
            i8 += 2;
            cArr[i9] = cArr2[b9 & AbstractC5358c.SI];
        }
        return new String(cArr);
    }

    public f hmacSha1(f fVar) {
        return d("HmacSHA1", fVar);
    }

    public f hmacSha256(f fVar) {
        return d("HmacSHA256", fVar);
    }

    public f hmacSha512(f fVar) {
        return d("HmacSHA512", fVar);
    }

    public final int indexOf(f fVar) {
        return indexOf(fVar.e(), 0);
    }

    public final int lastIndexOf(f fVar) {
        return lastIndexOf(fVar.e(), size());
    }

    public f md5() {
        return c("MD5");
    }

    public boolean rangeEquals(int i8, f fVar, int i9, int i10) {
        return fVar.rangeEquals(i9, this.f3780a, i8, i10);
    }

    public f sha1() {
        return c("SHA-1");
    }

    public f sha256() {
        return c(Constants.CODE_CHALLENGE_ALGORITHM);
    }

    public f sha512() {
        return c(Constants.CODE_VERIFIER_ALGORITHM);
    }

    public int size() {
        return this.f3780a.length;
    }

    public final boolean startsWith(f fVar) {
        return rangeEquals(0, fVar, 0, fVar.size());
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.f3780a, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public f substring(int i8) {
        return substring(i8, this.f3780a.length);
    }

    public f toAsciiLowercase() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f3780a;
            if (i8 >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i8];
            if (b9 >= 65 && b9 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i8] = (byte) (b9 + 32);
                for (int i9 = i8 + 1; i9 < bArr2.length; i9++) {
                    byte b10 = bArr2[i9];
                    if (b10 >= 65 && b10 <= 90) {
                        bArr2[i9] = (byte) (b10 + 32);
                    }
                }
                return new f(bArr2);
            }
            i8++;
        }
    }

    public f toAsciiUppercase() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f3780a;
            if (i8 >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i8];
            if (b9 >= 97 && b9 <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i8] = (byte) (b9 - 32);
                for (int i9 = i8 + 1; i9 < bArr2.length; i9++) {
                    byte b10 = bArr2[i9];
                    if (b10 >= 97 && b10 <= 122) {
                        bArr2[i9] = (byte) (b10 - 32);
                    }
                }
                return new f(bArr2);
            }
            i8++;
        }
    }

    public byte[] toByteArray() {
        return (byte[]) this.f3780a.clone();
    }

    public String toString() {
        if (this.f3780a.length == 0) {
            return "[size=0]";
        }
        String strUtf8 = utf8();
        int iA = a(strUtf8, 64);
        if (iA == -1) {
            if (this.f3780a.length <= 64) {
                return "[hex=" + hex() + "]";
            }
            return "[size=" + this.f3780a.length + " hex=" + substring(0, 64).hex() + "…]";
        }
        String strReplace = strUtf8.substring(0, iA).replace("\\", "\\\\").replace(X.LF, "\\n").replace(X.CR, "\\r");
        if (iA >= strUtf8.length()) {
            return "[text=" + strReplace + "]";
        }
        return "[size=" + this.f3780a.length + " text=" + strReplace + "…]";
    }

    public String utf8() {
        String str = this.f3782c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f3780a, y.UTF_8);
        this.f3782c = str2;
        return str2;
    }

    public void write(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        outputStream.write(this.f3780a);
    }

    @Override // java.lang.Comparable
    public int compareTo(f fVar) {
        int size = size();
        int size2 = fVar.size();
        int iMin = Math.min(size, size2);
        for (int i8 = 0; i8 < iMin; i8++) {
            int i9 = getByte(i8) & 255;
            int i10 = fVar.getByte(i8) & 255;
            if (i9 != i10) {
                return i9 < i10 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(f fVar, int i8) {
        return indexOf(fVar.e(), i8);
    }

    public final int lastIndexOf(f fVar, int i8) {
        return lastIndexOf(fVar.e(), i8);
    }

    public boolean rangeEquals(int i8, byte[] bArr, int i9, int i10) {
        if (i8 >= 0) {
            byte[] bArr2 = this.f3780a;
            if (i8 <= bArr2.length - i10 && i9 >= 0 && i9 <= bArr.length - i10 && y.arrayRangeEquals(bArr2, i8, bArr, i9, i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public f substring(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3780a;
        if (i9 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f3780a.length + ")");
        }
        int i10 = i9 - i8;
        if (i10 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i8 == 0 && i9 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i8, bArr2, 0, i10);
        return new f(bArr2);
    }

    public static f of(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            y.checkOffsetAndCount(bArr.length, i8, i9);
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            return new f(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public int indexOf(byte[] bArr, int i8) {
        int length = this.f3780a.length - bArr.length;
        for (int iMax = Math.max(i8, 0); iMax <= length; iMax++) {
            if (y.arrayRangeEquals(this.f3780a, iMax, bArr, 0, bArr.length)) {
                return iMax;
            }
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i8) {
        for (int iMin = Math.min(i8, this.f3780a.length - bArr.length); iMin >= 0; iMin--) {
            if (y.arrayRangeEquals(this.f3780a, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static f of(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new f(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }
}
