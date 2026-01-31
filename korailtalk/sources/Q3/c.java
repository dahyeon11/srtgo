package Q3;

import F3.h;
import Q7.C;
import Q7.C0712p;
import e3.AbstractC5358c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f4022a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f4023b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f4024c;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f4025d;

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f4026e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4027a;

        static {
            int[] iArr = new int[b.values().length];
            f4027a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4027a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4027a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4027a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4027a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', C.INNER_CLASS_SEPARATOR_CHAR, '%', '&', '\'', '(', ')', '*', '+', ',', '-', C.PACKAGE_SEPARATOR_CHAR, '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f4023b = cArr;
        f4024c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f4025d = cArr;
        f4026e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', AbstractC5358c.MAX};
    }

    static M3.e a(byte[] bArr) throws h {
        M3.c cVar = new M3.c(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVarC = b.ASCII_ENCODE;
        do {
            b bVar = b.ASCII_ENCODE;
            if (bVarC == bVar) {
                bVarC = c(cVar, sb, sb2);
            } else {
                int i8 = a.f4027a[bVarC.ordinal()];
                if (i8 == 1) {
                    e(cVar, sb);
                } else if (i8 == 2) {
                    g(cVar, sb);
                } else if (i8 == 3) {
                    b(cVar, sb);
                } else if (i8 == 4) {
                    f(cVar, sb);
                } else {
                    if (i8 != 5) {
                        throw h.getFormatInstance();
                    }
                    d(cVar, sb, arrayList);
                }
                bVarC = bVar;
            }
            if (bVarC == b.PAD_ENCODE) {
                break;
            }
        } while (cVar.available() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String string = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new M3.e(bArr, string, arrayList, null);
    }

    private static void b(M3.c cVar, StringBuilder sb) throws h {
        int bits;
        int[] iArr = new int[3];
        while (cVar.available() != 8 && (bits = cVar.readBits(8)) != 254) {
            h(bits, cVar.readBits(8), iArr);
            for (int i8 = 0; i8 < 3; i8++) {
                int i9 = iArr[i8];
                if (i9 == 0) {
                    sb.append(C0712p.CR);
                } else if (i9 == 1) {
                    sb.append('*');
                } else if (i9 == 2) {
                    sb.append('>');
                } else if (i9 == 3) {
                    sb.append(' ');
                } else if (i9 < 14) {
                    sb.append((char) (i9 + 44));
                } else {
                    if (i9 >= 40) {
                        throw h.getFormatInstance();
                    }
                    sb.append((char) (i9 + 51));
                }
            }
            if (cVar.available() <= 0) {
                return;
            }
        }
    }

    private static b c(M3.c cVar, StringBuilder sb, StringBuilder sb2) throws h {
        boolean z8 = false;
        do {
            int bits = cVar.readBits(8);
            if (bits == 0) {
                throw h.getFormatInstance();
            }
            if (bits <= 128) {
                if (z8) {
                    bits += 128;
                }
                sb.append((char) (bits - 1));
                return b.ASCII_ENCODE;
            }
            if (bits == 129) {
                return b.PAD_ENCODE;
            }
            if (bits <= 229) {
                int i8 = bits - 130;
                if (i8 < 10) {
                    sb.append('0');
                }
                sb.append(i8);
            } else {
                if (bits == 230) {
                    return b.C40_ENCODE;
                }
                if (bits == 231) {
                    return b.BASE256_ENCODE;
                }
                if (bits == 232) {
                    sb.append((char) 29);
                } else if (bits != 233 && bits != 234) {
                    if (bits == 235) {
                        z8 = true;
                    } else if (bits == 236) {
                        sb.append("[)>\u001e05\u001d");
                        sb2.insert(0, "\u001e\u0004");
                    } else if (bits == 237) {
                        sb.append("[)>\u001e06\u001d");
                        sb2.insert(0, "\u001e\u0004");
                    } else {
                        if (bits == 238) {
                            return b.ANSIX12_ENCODE;
                        }
                        if (bits == 239) {
                            return b.TEXT_ENCODE;
                        }
                        if (bits == 240) {
                            return b.EDIFACT_ENCODE;
                        }
                        if (bits != 241 && bits >= 242 && (bits != 254 || cVar.available() != 0)) {
                            throw h.getFormatInstance();
                        }
                    }
                }
            }
        } while (cVar.available() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(M3.c cVar, StringBuilder sb, Collection collection) throws h {
        int byteOffset = cVar.getByteOffset();
        int i8 = byteOffset + 2;
        int i9 = i(cVar.readBits(8), byteOffset + 1);
        if (i9 == 0) {
            i9 = cVar.available() / 8;
        } else if (i9 >= 250) {
            i9 = ((i9 - 249) * 250) + i(cVar.readBits(8), i8);
            i8 = byteOffset + 3;
        }
        if (i9 < 0) {
            throw h.getFormatInstance();
        }
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            if (cVar.available() < 8) {
                throw h.getFormatInstance();
            }
            bArr[i10] = (byte) i(cVar.readBits(8), i8);
            i10++;
            i8++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e8) {
            throw new IllegalStateException("Platform does not support required encoding: " + e8);
        }
    }

    private static void e(M3.c cVar, StringBuilder sb) throws h {
        int bits;
        int[] iArr = new int[3];
        boolean z8 = false;
        int i8 = 0;
        while (cVar.available() != 8 && (bits = cVar.readBits(8)) != 254) {
            h(bits, cVar.readBits(8), iArr);
            for (int i9 = 0; i9 < 3; i9++) {
                int i10 = iArr[i9];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            char[] cArr = f4023b;
                            if (i10 < cArr.length) {
                                char c9 = cArr[i10];
                                if (z8) {
                                    sb.append((char) (c9 + 128));
                                    z8 = false;
                                } else {
                                    sb.append(c9);
                                }
                            } else if (i10 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i10 != 30) {
                                    throw h.getFormatInstance();
                                }
                                z8 = true;
                            }
                            i8 = 0;
                        } else {
                            if (i8 != 3) {
                                throw h.getFormatInstance();
                            }
                            if (z8) {
                                sb.append((char) (i10 + 224));
                                z8 = false;
                                i8 = 0;
                            } else {
                                sb.append((char) (i10 + 96));
                                i8 = 0;
                            }
                        }
                    } else if (z8) {
                        sb.append((char) (i10 + 128));
                        z8 = false;
                        i8 = 0;
                    } else {
                        sb.append((char) i10);
                        i8 = 0;
                    }
                } else if (i10 < 3) {
                    i8 = i10 + 1;
                } else {
                    char[] cArr2 = f4022a;
                    if (i10 >= cArr2.length) {
                        throw h.getFormatInstance();
                    }
                    char c10 = cArr2[i10];
                    if (z8) {
                        sb.append((char) (c10 + 128));
                        z8 = false;
                    } else {
                        sb.append(c10);
                    }
                }
            }
            if (cVar.available() <= 0) {
                return;
            }
        }
    }

    private static void f(M3.c cVar, StringBuilder sb) {
        while (cVar.available() > 16) {
            for (int i8 = 0; i8 < 4; i8++) {
                int bits = cVar.readBits(6);
                if (bits == 31) {
                    int bitOffset = 8 - cVar.getBitOffset();
                    if (bitOffset != 8) {
                        cVar.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((bits & 32) == 0) {
                    bits |= 64;
                }
                sb.append((char) bits);
            }
            if (cVar.available() <= 0) {
                return;
            }
        }
    }

    private static void g(M3.c cVar, StringBuilder sb) throws h {
        int bits;
        int[] iArr = new int[3];
        boolean z8 = false;
        int i8 = 0;
        while (cVar.available() != 8 && (bits = cVar.readBits(8)) != 254) {
            h(bits, cVar.readBits(8), iArr);
            for (int i9 = 0; i9 < 3; i9++) {
                int i10 = iArr[i9];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            char[] cArr = f4025d;
                            if (i10 < cArr.length) {
                                char c9 = cArr[i10];
                                if (z8) {
                                    sb.append((char) (c9 + 128));
                                    z8 = false;
                                } else {
                                    sb.append(c9);
                                }
                            } else if (i10 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i10 != 30) {
                                    throw h.getFormatInstance();
                                }
                                z8 = true;
                            }
                            i8 = 0;
                        } else {
                            if (i8 != 3) {
                                throw h.getFormatInstance();
                            }
                            char[] cArr2 = f4026e;
                            if (i10 >= cArr2.length) {
                                throw h.getFormatInstance();
                            }
                            char c10 = cArr2[i10];
                            if (z8) {
                                sb.append((char) (c10 + 128));
                                z8 = false;
                                i8 = 0;
                            } else {
                                sb.append(c10);
                                i8 = 0;
                            }
                        }
                    } else if (z8) {
                        sb.append((char) (i10 + 128));
                        z8 = false;
                        i8 = 0;
                    } else {
                        sb.append((char) i10);
                        i8 = 0;
                    }
                } else if (i10 < 3) {
                    i8 = i10 + 1;
                } else {
                    char[] cArr3 = f4024c;
                    if (i10 >= cArr3.length) {
                        throw h.getFormatInstance();
                    }
                    char c11 = cArr3[i10];
                    if (z8) {
                        sb.append((char) (c11 + 128));
                        z8 = false;
                    } else {
                        sb.append(c11);
                    }
                }
            }
            if (cVar.available() <= 0) {
                return;
            }
        }
    }

    private static void h(int i8, int i9, int[] iArr) {
        int i10 = ((i8 << 8) + i9) - 1;
        int i11 = i10 / 1600;
        iArr[0] = i11;
        int i12 = i10 - (i11 * 1600);
        int i13 = i12 / 40;
        iArr[1] = i13;
        iArr[2] = i12 - (i13 * 40);
    }

    private static int i(int i8, int i9) {
        int i10 = i8 - (((i9 * 149) % 255) + 1);
        return i10 >= 0 ? i10 : i10 + 256;
    }
}
