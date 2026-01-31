package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
abstract class RA0 {

    /* renamed from: a, reason: collision with root package name */
    private static final OA0 f16066a;

    static {
        if (MA0.a() && MA0.b()) {
            int i8 = Ux0.zza;
        }
        f16066a = new PA0();
    }

    static /* bridge */ /* synthetic */ int c(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte b9 = bArr[i8 - 1];
        if (i10 == 0) {
            if (b9 > -12) {
                return -1;
            }
            return b9;
        }
        if (i10 == 1) {
            return k(b9, bArr[i8]);
        }
        if (i10 == 2) {
            return l(b9, bArr[i8], bArr[i8 + 1]);
        }
        throw new AssertionError();
    }

    static int d(String str, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int length = str.length();
        int i13 = 0;
        while (true) {
            i10 = i8 + i9;
            if (i13 >= length || (i12 = i13 + i8) >= i10 || (cCharAt = str.charAt(i13)) >= 128) {
                break;
            }
            bArr[i12] = (byte) cCharAt;
            i13++;
        }
        if (i13 == length) {
            return i8 + length;
        }
        int i14 = i8 + i13;
        while (i13 < length) {
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 128 && i14 < i10) {
                bArr[i14] = (byte) cCharAt2;
                i14++;
            } else if (cCharAt2 < 2048 && i14 <= i10 - 2) {
                bArr[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i14 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i14 > i10 - 3) {
                    if (i14 > i10 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i11 = i13 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i11)))) {
                            throw new QA0(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                    }
                    int i15 = i13 + 1;
                    if (i15 != str.length()) {
                        char cCharAt3 = str.charAt(i15);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i16 = i14 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i13 = i15;
                        } else {
                            i13 = i15;
                        }
                    }
                    throw new QA0(i13 - 1, length);
                }
                bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i14 += 3;
            }
            i13++;
        }
        return i14;
    }

    static int e(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && str.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char cCharAt = str.charAt(i9);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
                i9++;
            } else {
                int length2 = str.length();
                while (i9 < length2) {
                    char cCharAt2 = str.charAt(i9);
                    if (cCharAt2 < 2048) {
                        i8 += (127 - cCharAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i9) < 65536) {
                                throw new QA0(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i8;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    static int f(int i8, byte[] bArr, int i9, int i10) {
        return f16066a.a(i8, bArr, i9, i10);
    }

    static String g(ByteBuffer byteBuffer, int i8, int i9) {
        OA0 oa0 = f16066a;
        if (byteBuffer.hasArray()) {
            return oa0.b(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9);
        }
        return byteBuffer.isDirect() ? OA0.d(byteBuffer, i8, i9) : OA0.d(byteBuffer, i8, i9);
    }

    static String h(byte[] bArr, int i8, int i9) {
        return f16066a.b(bArr, i8, i9);
    }

    static boolean i(byte[] bArr) {
        return f16066a.c(bArr, 0, bArr.length);
    }

    static boolean j(byte[] bArr, int i8, int i9) {
        return f16066a.c(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }
}
