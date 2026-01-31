package N7;

import P7.c;
import P7.f;

/* loaded from: classes3.dex */
public abstract class c {
    static String a(int i8) {
        if (i8 < 1000 || i8 >= 5000) {
            return "Code must be in range [1000,5000): " + i8;
        }
        if ((i8 < 1004 || i8 > 1006) && (i8 < 1012 || i8 > 2999)) {
            return null;
        }
        return "Code " + i8 + " is reserved and may not be used.";
    }

    public static String acceptHeader(String str) {
        return f.encodeUtf8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    static void b(c.C0065c c0065c, byte[] bArr) {
        int length = bArr.length;
        int i8 = 0;
        do {
            byte[] bArr2 = c0065c.data;
            int i9 = c0065c.start;
            int i10 = c0065c.end;
            while (i9 < i10) {
                int i11 = i8 % length;
                bArr2[i9] = (byte) (bArr2[i9] ^ bArr[i11]);
                i9++;
                i8 = i11 + 1;
            }
        } while (c0065c.next() != -1);
    }

    static void c(int i8) {
        String strA = a(i8);
        if (strA != null) {
            throw new IllegalArgumentException(strA);
        }
    }
}
