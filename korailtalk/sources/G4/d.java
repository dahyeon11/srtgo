package g4;

import M3.l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f31334a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    static M3.e a(byte[] bArr, j jVar, f fVar, Map map) throws F3.h {
        h hVar;
        h hVar2;
        M3.c cVar = new M3.c(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i8 = 1;
        ArrayList arrayList = new ArrayList(1);
        int i9 = -1;
        int bits = -1;
        boolean z8 = false;
        M3.d characterSetECIByValue = null;
        while (true) {
            try {
                h hVarForBits = cVar.available() < 4 ? h.TERMINATOR : h.forBits(cVar.readBits(4));
                h hVar3 = h.TERMINATOR;
                if (hVarForBits == hVar3) {
                    hVar = hVar3;
                    hVar2 = hVarForBits;
                } else if (hVarForBits == h.FNC1_FIRST_POSITION || hVarForBits == h.FNC1_SECOND_POSITION) {
                    hVar = hVar3;
                    hVar2 = hVarForBits;
                    z8 = true;
                } else {
                    if (hVarForBits == h.STRUCTURED_APPEND) {
                        if (cVar.available() < 16) {
                            throw F3.h.getFormatInstance();
                        }
                        int bits2 = cVar.readBits(8);
                        bits = cVar.readBits(8);
                        i9 = bits2;
                    } else if (hVarForBits == h.ECI) {
                        characterSetECIByValue = M3.d.getCharacterSetECIByValue(g(cVar));
                        if (characterSetECIByValue == null) {
                            throw F3.h.getFormatInstance();
                        }
                    } else if (hVarForBits == h.HANZI) {
                        int bits3 = cVar.readBits(4);
                        int bits4 = cVar.readBits(hVarForBits.getCharacterCountBits(jVar));
                        if (bits3 == i8) {
                            d(cVar, sb, bits4);
                        }
                    } else {
                        int bits5 = cVar.readBits(hVarForBits.getCharacterCountBits(jVar));
                        if (hVarForBits == h.NUMERIC) {
                            f(cVar, sb, bits5);
                        } else if (hVarForBits == h.ALPHANUMERIC) {
                            b(cVar, sb, bits5, z8);
                        } else if (hVarForBits == h.BYTE) {
                            hVar = hVar3;
                            hVar2 = hVarForBits;
                            c(cVar, sb, bits5, characterSetECIByValue, arrayList, map);
                        } else {
                            hVar = hVar3;
                            hVar2 = hVarForBits;
                            if (hVar2 != h.KANJI) {
                                throw F3.h.getFormatInstance();
                            }
                            e(cVar, sb, bits5);
                        }
                    }
                    hVar = hVar3;
                    hVar2 = hVarForBits;
                }
                if (hVar2 == hVar) {
                    return new M3.e(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i9, bits);
                }
                i8 = 1;
            } catch (IllegalArgumentException unused) {
                throw F3.h.getFormatInstance();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(M3.c r3, java.lang.StringBuilder r4, int r5, boolean r6) throws F3.h {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.available()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.readBits(r2)
            int r2 = r1 / 45
            char r2 = h(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = h(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            F3.h r3 = F3.h.getFormatInstance()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.available()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.readBits(r2)
            char r3 = h(r3)
            r4.append(r3)
            goto L47
        L42:
            F3.h r3 = F3.h.getFormatInstance()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d.b(M3.c, java.lang.StringBuilder, int, boolean):void");
    }

    private static void c(M3.c cVar, StringBuilder sb, int i8, M3.d dVar, Collection collection, Map map) throws F3.h {
        if ((i8 << 3) > cVar.available()) {
            throw F3.h.getFormatInstance();
        }
        byte[] bArr = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = (byte) cVar.readBits(8);
        }
        try {
            sb.append(new String(bArr, dVar == null ? l.guessEncoding(bArr, map) : dVar.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw F3.h.getFormatInstance();
        }
    }

    private static void d(M3.c cVar, StringBuilder sb, int i8) throws F3.h {
        if (i8 * 13 > cVar.available()) {
            throw F3.h.getFormatInstance();
        }
        byte[] bArr = new byte[i8 * 2];
        int i9 = 0;
        while (i8 > 0) {
            int bits = cVar.readBits(13);
            int i10 = (bits % 96) | ((bits / 96) << 8);
            int i11 = i10 + (i10 < 959 ? 41377 : 42657);
            bArr[i9] = (byte) (i11 >> 8);
            bArr[i9 + 1] = (byte) i11;
            i9 += 2;
            i8--;
        }
        try {
            sb.append(new String(bArr, l.GB2312));
        } catch (UnsupportedEncodingException unused) {
            throw F3.h.getFormatInstance();
        }
    }

    private static void e(M3.c cVar, StringBuilder sb, int i8) throws F3.h {
        if (i8 * 13 > cVar.available()) {
            throw F3.h.getFormatInstance();
        }
        byte[] bArr = new byte[i8 * 2];
        int i9 = 0;
        while (i8 > 0) {
            int bits = cVar.readBits(13);
            int i10 = (bits % 192) | ((bits / 192) << 8);
            int i11 = i10 + (i10 < 7936 ? 33088 : 49472);
            bArr[i9] = (byte) (i11 >> 8);
            bArr[i9 + 1] = (byte) i11;
            i9 += 2;
            i8--;
        }
        try {
            sb.append(new String(bArr, l.SHIFT_JIS));
        } catch (UnsupportedEncodingException unused) {
            throw F3.h.getFormatInstance();
        }
    }

    private static void f(M3.c cVar, StringBuilder sb, int i8) throws F3.h {
        while (i8 >= 3) {
            if (cVar.available() < 10) {
                throw F3.h.getFormatInstance();
            }
            int bits = cVar.readBits(10);
            if (bits >= 1000) {
                throw F3.h.getFormatInstance();
            }
            sb.append(h(bits / 100));
            sb.append(h((bits / 10) % 10));
            sb.append(h(bits % 10));
            i8 -= 3;
        }
        if (i8 == 2) {
            if (cVar.available() < 7) {
                throw F3.h.getFormatInstance();
            }
            int bits2 = cVar.readBits(7);
            if (bits2 >= 100) {
                throw F3.h.getFormatInstance();
            }
            sb.append(h(bits2 / 10));
            sb.append(h(bits2 % 10));
            return;
        }
        if (i8 == 1) {
            if (cVar.available() < 4) {
                throw F3.h.getFormatInstance();
            }
            int bits3 = cVar.readBits(4);
            if (bits3 >= 10) {
                throw F3.h.getFormatInstance();
            }
            sb.append(h(bits3));
        }
    }

    private static int g(M3.c cVar) throws F3.h {
        int bits = cVar.readBits(8);
        if ((bits & 128) == 0) {
            return bits & 127;
        }
        if ((bits & 192) == 128) {
            return cVar.readBits(8) | ((bits & 63) << 8);
        }
        if ((bits & 224) == 192) {
            return cVar.readBits(16) | ((bits & 31) << 16);
        }
        throw F3.h.getFormatInstance();
    }

    private static char h(int i8) throws F3.h {
        char[] cArr = f31334a;
        if (i8 < cArr.length) {
            return cArr[i8];
        }
        throw F3.h.getFormatInstance();
    }
}
