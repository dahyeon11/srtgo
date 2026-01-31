package e4;

import F3.v;
import e3.AbstractC5358c;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class g {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f30457c;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f30455a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, AbstractC5358c.CR, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f30456b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, AbstractC5358c.CR, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f30458d = new byte[128];

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f30459e = Charset.forName("ISO-8859-1");

    static {
        int i8 = 0;
        byte[] bArr = new byte[128];
        f30457c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i9 = 0;
        while (true) {
            byte[] bArr2 = f30455a;
            if (i9 >= bArr2.length) {
                break;
            }
            byte b9 = bArr2[i9];
            if (b9 > 0) {
                f30457c[b9] = (byte) i9;
            }
            i9++;
        }
        Arrays.fill(f30458d, (byte) -1);
        while (true) {
            byte[] bArr3 = f30456b;
            if (i8 >= bArr3.length) {
                return;
            }
            byte b10 = bArr3[i8];
            if (b10 > 0) {
                f30458d[b10] = (byte) i8;
            }
            i8++;
        }
    }

    private static int a(String str, int i8, Charset charset) throws v {
        int i9;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i10 = i8;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            int i11 = 0;
            while (i11 < 13 && k(cCharAt) && (i9 = i10 + (i11 = i11 + 1)) < length) {
                cCharAt = str.charAt(i9);
            }
            if (i11 >= 13) {
                return i10 - i8;
            }
            char cCharAt2 = str.charAt(i10);
            if (!charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                throw new v("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
            i10++;
        }
        return i10 - i8;
    }

    private static int b(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        if (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            while (k(cCharAt) && i8 < length) {
                i9++;
                i8++;
                if (i8 < length) {
                    cCharAt = charSequence.charAt(i8);
                }
            }
        }
        return i9;
    }

    private static int c(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = i8;
        while (i9 < length) {
            char cCharAt = charSequence.charAt(i9);
            int i10 = 0;
            while (i10 < 13 && k(cCharAt) && i9 < length) {
                i10++;
                i9++;
                if (i9 < length) {
                    cCharAt = charSequence.charAt(i9);
                }
            }
            if (i10 < 13) {
                if (i10 <= 0) {
                    if (!n(charSequence.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
            } else {
                return (i9 - i8) - i10;
            }
        }
        return i9 - i8;
    }

    private static void d(byte[] bArr, int i8, int i9, int i10, StringBuilder sb) {
        int i11;
        if (i9 == 1 && i10 == 0) {
            sb.append((char) 913);
        } else if (i9 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i9 >= 6) {
            char[] cArr = new char[5];
            i11 = i8;
            while ((i8 + i9) - i11 >= 6) {
                long j8 = 0;
                for (int i12 = 0; i12 < 6; i12++) {
                    j8 = (j8 << 8) + (bArr[i11 + i12] & 255);
                }
                for (int i13 = 0; i13 < 5; i13++) {
                    cArr[i13] = (char) (j8 % 900);
                    j8 /= 900;
                }
                for (int i14 = 4; i14 >= 0; i14--) {
                    sb.append(cArr[i14]);
                }
                i11 += 6;
            }
        } else {
            i11 = i8;
        }
        while (i11 < i8 + i9) {
            sb.append((char) (bArr[i11] & 255));
            i11++;
        }
    }

    static String e(String str, c cVar, Charset charset) throws v {
        M3.d characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f30459e;
        } else if (!f30459e.equals(charset) && (characterSetECIByName = M3.d.getCharacterSetECIByName(charset.name())) != null) {
            h(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        if (cVar == c.TEXT) {
            g(str, 0, length, sb, 0);
        } else if (cVar == c.BYTE) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb);
        } else if (cVar == c.NUMERIC) {
            sb.append((char) 902);
            f(str, 0, length, sb);
        } else {
            int i8 = 0;
            int iG = 0;
            int i9 = 0;
            while (i8 < length) {
                int iB = b(str, i8);
                if (iB >= 13) {
                    sb.append((char) 902);
                    f(str, i8, iB, sb);
                    i8 += iB;
                    i9 = 2;
                    iG = 0;
                } else {
                    int iC = c(str, i8);
                    if (iC >= 5 || iB == length) {
                        if (i9 != 0) {
                            sb.append((char) 900);
                            iG = 0;
                            i9 = 0;
                        }
                        iG = g(str, i8, iC, sb, iG);
                        i8 += iC;
                    } else {
                        int iA = a(str, i8, charset);
                        if (iA == 0) {
                            iA = 1;
                        }
                        int i10 = iA + i8;
                        byte[] bytes2 = str.substring(i8, i10).getBytes(charset);
                        if (bytes2.length == 1 && i9 == 0) {
                            d(bytes2, 0, 1, 0, sb);
                        } else {
                            d(bytes2, 0, bytes2.length, i9, sb);
                            iG = 0;
                            i9 = 1;
                        }
                        i8 = i10;
                    }
                }
            }
        }
        return sb.toString();
    }

    private static void f(String str, int i8, int i9, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i9 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i10 = 0;
        while (i10 < i9) {
            sb2.setLength(0);
            int iMin = Math.min(44, i9 - i10);
            StringBuilder sb3 = new StringBuilder("1");
            int i11 = i8 + i10;
            sb3.append(str.substring(i11, i11 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i10 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4 A[EDGE_INSN: B:73:0x00f4->B:55:0x00f4 BREAK  A[LOOP:0: B:3:0x000f->B:90:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.g.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void h(int i8, StringBuilder sb) throws v {
        if (i8 >= 0 && i8 < 900) {
            sb.append((char) 927);
            sb.append((char) i8);
            return;
        }
        if (i8 < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i8 / 900) - 1));
            sb.append((char) (i8 % 900));
        } else if (i8 < 811800) {
            sb.append((char) 925);
            sb.append((char) (810900 - i8));
        } else {
            throw new v("ECI number not in valid range from 0..811799, but was " + i8);
        }
    }

    private static boolean i(char c9) {
        if (c9 != ' ') {
            return c9 >= 'a' && c9 <= 'z';
        }
        return true;
    }

    private static boolean j(char c9) {
        if (c9 != ' ') {
            return c9 >= 'A' && c9 <= 'Z';
        }
        return true;
    }

    private static boolean k(char c9) {
        return c9 >= '0' && c9 <= '9';
    }

    private static boolean l(char c9) {
        return f30457c[c9] != -1;
    }

    private static boolean m(char c9) {
        return f30458d[c9] != -1;
    }

    private static boolean n(char c9) {
        if (c9 == '\t' || c9 == '\n' || c9 == '\r') {
            return true;
        }
        return c9 >= ' ' && c9 <= '~';
    }
}
