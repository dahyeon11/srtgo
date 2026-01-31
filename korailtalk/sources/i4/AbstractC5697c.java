package i4;

import F3.v;
import g4.h;
import g4.j;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5697c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f31896a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: i4.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31897a;

        static {
            int[] iArr = new int[h.values().length];
            f31897a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31897a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31897a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31897a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, M3.a aVar, String str2) throws v, UnsupportedEncodingException {
        try {
            for (byte b9 : str.getBytes(str2)) {
                aVar.appendBits(b9, 8);
            }
        } catch (UnsupportedEncodingException e8) {
            throw new v(e8);
        }
    }

    static void b(CharSequence charSequence, M3.a aVar) throws v {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length) {
            int iO = o(charSequence.charAt(i8));
            if (iO == -1) {
                throw new v();
            }
            int i9 = i8 + 1;
            if (i9 < length) {
                int iO2 = o(charSequence.charAt(i9));
                if (iO2 == -1) {
                    throw new v();
                }
                aVar.appendBits((iO * 45) + iO2, 11);
                i8 += 2;
            } else {
                aVar.appendBits(iO, 6);
                i8 = i9;
            }
        }
    }

    static void c(String str, h hVar, M3.a aVar, String str2) throws v, UnsupportedEncodingException {
        int i8 = a.f31897a[hVar.ordinal()];
        if (i8 == 1) {
            h(str, aVar);
            return;
        }
        if (i8 == 2) {
            b(str, aVar);
            return;
        }
        if (i8 == 3) {
            a(str, aVar, str2);
        } else if (i8 == 4) {
            e(str, aVar);
        } else {
            throw new v("Invalid mode: " + hVar);
        }
    }

    public static h chooseMode(String str) {
        return l(str, null);
    }

    private static void d(M3.d dVar, M3.a aVar) {
        aVar.appendBits(h.ECI.getBits(), 4);
        aVar.appendBits(dVar.getValue(), 8);
    }

    static void e(String str, M3.a aVar) throws v, UnsupportedEncodingException {
        int i8;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i9 = 0; i9 < length; i9 += 2) {
                int i10 = ((bytes[i9] & 255) << 8) | (bytes[i9 + 1] & 255);
                int i11 = 33088;
                if (i10 >= 33088 && i10 <= 40956) {
                    i8 = i10 - i11;
                } else if (i10 < 57408 || i10 > 60351) {
                    i8 = -1;
                } else {
                    i11 = 49472;
                    i8 = i10 - i11;
                }
                if (i8 == -1) {
                    throw new v("Invalid byte sequence");
                }
                aVar.appendBits(((i8 >> 8) * 192) + (i8 & 255), 13);
            }
        } catch (UnsupportedEncodingException e8) {
            throw new v(e8);
        }
    }

    public static C5700f encode(String str, g4.f fVar) {
        return encode(str, fVar, null);
    }

    static void f(int i8, j jVar, h hVar, M3.a aVar) throws v {
        int characterCountBits = hVar.getCharacterCountBits(jVar);
        int i9 = 1 << characterCountBits;
        if (i8 < i9) {
            aVar.appendBits(i8, characterCountBits);
            return;
        }
        throw new v(i8 + " is bigger than " + (i9 - 1));
    }

    static void g(h hVar, M3.a aVar) {
        aVar.appendBits(hVar.getBits(), 4);
    }

    static void h(CharSequence charSequence, M3.a aVar) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length) {
            int iCharAt = charSequence.charAt(i8) - '0';
            int i9 = i8 + 2;
            if (i9 < length) {
                aVar.appendBits((iCharAt * 100) + ((charSequence.charAt(i8 + 1) - '0') * 10) + (charSequence.charAt(i9) - '0'), 10);
                i8 += 3;
            } else {
                i8++;
                if (i8 < length) {
                    aVar.appendBits((iCharAt * 10) + (charSequence.charAt(i8) - '0'), 7);
                    i8 = i9;
                } else {
                    aVar.appendBits(iCharAt, 4);
                }
            }
        }
    }

    private static int i(h hVar, M3.a aVar, M3.a aVar2, j jVar) {
        return aVar.getSize() + hVar.getCharacterCountBits(jVar) + aVar2.getSize();
    }

    private static int j(C5696b c5696b) {
        return AbstractC5698d.a(c5696b) + AbstractC5698d.c(c5696b) + AbstractC5698d.d(c5696b) + AbstractC5698d.e(c5696b);
    }

    private static int k(M3.a aVar, g4.f fVar, j jVar, C5696b c5696b) throws v {
        int i8 = Integer.MAX_VALUE;
        int i9 = -1;
        for (int i10 = 0; i10 < 8; i10++) {
            AbstractC5699e.a(aVar, fVar, jVar, i10, c5696b);
            int iJ = j(c5696b);
            if (iJ < i8) {
                i9 = i10;
                i8 = iJ;
            }
        }
        return i9;
    }

    private static h l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && r(str)) {
            return h.KANJI;
        }
        boolean z8 = false;
        boolean z9 = false;
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z9 = true;
            } else {
                if (o(cCharAt) == -1) {
                    return h.BYTE;
                }
                z8 = true;
            }
        }
        return z8 ? h.ALPHANUMERIC : z9 ? h.NUMERIC : h.BYTE;
    }

    private static j m(int i8, g4.f fVar) throws v {
        for (int i9 = 1; i9 <= 40; i9++) {
            j versionForNumber = j.getVersionForNumber(i9);
            if (u(i8, versionForNumber, fVar)) {
                return versionForNumber;
            }
        }
        throw new v("Data too big");
    }

    static byte[] n(byte[] bArr, int i8) {
        int length = bArr.length;
        int[] iArr = new int[length + i8];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = bArr[i9] & 255;
        }
        new O3.d(O3.a.QR_CODE_FIELD_256).encode(iArr, i8);
        byte[] bArr2 = new byte[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            bArr2[i10] = (byte) iArr[length + i10];
        }
        return bArr2;
    }

    static int o(int i8) {
        int[] iArr = f31896a;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    static void p(int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) throws v {
        if (i11 >= i10) {
            throw new v("Block ID too large");
        }
        int i12 = i8 % i10;
        int i13 = i10 - i12;
        int i14 = i8 / i10;
        int i15 = i14 + 1;
        int i16 = i9 / i10;
        int i17 = i16 + 1;
        int i18 = i14 - i16;
        int i19 = i15 - i17;
        if (i18 != i19) {
            throw new v("EC bytes mismatch");
        }
        if (i10 != i13 + i12) {
            throw new v("RS blocks mismatch");
        }
        if (i8 != ((i16 + i18) * i13) + ((i17 + i19) * i12)) {
            throw new v("Total bytes mismatch");
        }
        if (i11 < i13) {
            iArr[0] = i16;
            iArr2[0] = i18;
        } else {
            iArr[0] = i17;
            iArr2[0] = i19;
        }
    }

    static M3.a q(M3.a aVar, int i8, int i9, int i10) throws v {
        if (aVar.getSizeInBytes() != i9) {
            throw new v("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            p(i8, i9, i10, i12, iArr, iArr2);
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            aVar.toBytes(i11 << 3, bArr, 0, i13);
            byte[] bArrN = n(bArr, iArr2[0]);
            arrayList.add(new C5695a(bArr, bArrN));
            iMax = Math.max(iMax, i13);
            iMax2 = Math.max(iMax2, bArrN.length);
            i11 += iArr[0];
        }
        if (i9 != i11) {
            throw new v("Data bytes does not match offset");
        }
        M3.a aVar2 = new M3.a();
        for (int i14 = 0; i14 < iMax; i14++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] dataBytes = ((C5695a) it.next()).getDataBytes();
                if (i14 < dataBytes.length) {
                    aVar2.appendBits(dataBytes[i14], 8);
                }
            }
        }
        for (int i15 = 0; i15 < iMax2; i15++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] errorCorrectionBytes = ((C5695a) it2.next()).getErrorCorrectionBytes();
                if (i15 < errorCorrectionBytes.length) {
                    aVar2.appendBits(errorCorrectionBytes[i15], 8);
                }
            }
        }
        if (i8 == aVar2.getSizeInBytes()) {
            return aVar2;
        }
        throw new v("Interleaving error: " + i8 + " and " + aVar2.getSizeInBytes() + " differ.");
    }

    private static boolean r(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i8 = 0; i8 < length; i8 += 2) {
                int i9 = bytes[i8] & 255;
                if ((i9 < 129 || i9 > 159) && (i9 < 224 || i9 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static j s(g4.f fVar, h hVar, M3.a aVar, M3.a aVar2) {
        return m(i(hVar, aVar, aVar2, m(i(hVar, aVar, aVar2, j.getVersionForNumber(1)), fVar)), fVar);
    }

    static void t(int i8, M3.a aVar) throws v {
        int i9 = i8 << 3;
        if (aVar.getSize() > i9) {
            throw new v("data bits cannot fit in the QR Code" + aVar.getSize() + " > " + i9);
        }
        for (int i10 = 0; i10 < 4 && aVar.getSize() < i9; i10++) {
            aVar.appendBit(false);
        }
        int size = aVar.getSize() & 7;
        if (size > 0) {
            while (size < 8) {
                aVar.appendBit(false);
                size++;
            }
        }
        int sizeInBytes = i8 - aVar.getSizeInBytes();
        for (int i11 = 0; i11 < sizeInBytes; i11++) {
            aVar.appendBits((i11 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.getSize() != i9) {
            throw new v("Bits size does not equal capacity");
        }
    }

    private static boolean u(int i8, j jVar, g4.f fVar) {
        return jVar.getTotalCodewords() - jVar.getECBlocksForLevel(fVar).getTotalECCodewords() >= (i8 + 7) / 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i4.C5700f encode(java.lang.String r6, g4.f r7, java.util.Map<F3.g, ?> r8) throws F3.v, java.io.UnsupportedEncodingException {
        /*
            java.lang.String r0 = "ISO-8859-1"
            if (r8 == 0) goto L15
            F3.g r1 = F3.g.CHARACTER_SET
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L15
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L16
        L15:
            r1 = r0
        L16:
            g4.h r2 = l(r6, r1)
            M3.a r3 = new M3.a
            r3.<init>()
            g4.h r4 = g4.h.BYTE
            if (r2 != r4) goto L32
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            M3.d r0 = M3.d.getCharacterSetECIByName(r1)
            if (r0 == 0) goto L32
            d(r0, r3)
        L32:
            g(r2, r3)
            M3.a r0 = new M3.a
            r0.<init>()
            c(r6, r2, r0, r1)
            if (r8 == 0) goto L6a
            F3.g r1 = F3.g.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L6a
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            g4.j r8 = g4.j.getVersionForNumber(r8)
            int r1 = i(r2, r3, r0, r8)
            boolean r1 = u(r1, r8, r7)
            if (r1 == 0) goto L62
            goto L6e
        L62:
            F3.v r6 = new F3.v
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>(r7)
            throw r6
        L6a:
            g4.j r8 = s(r7, r2, r3, r0)
        L6e:
            M3.a r1 = new M3.a
            r1.<init>()
            r1.appendBitArray(r3)
            if (r2 != r4) goto L7d
            int r6 = r0.getSizeInBytes()
            goto L81
        L7d:
            int r6 = r6.length()
        L81:
            f(r6, r8, r2, r1)
            r1.appendBitArray(r0)
            g4.j$b r6 = r8.getECBlocksForLevel(r7)
            int r0 = r8.getTotalCodewords()
            int r3 = r6.getTotalECCodewords()
            int r0 = r0 - r3
            t(r0, r1)
            int r3 = r8.getTotalCodewords()
            int r6 = r6.getNumBlocks()
            M3.a r6 = q(r1, r3, r0, r6)
            i4.f r0 = new i4.f
            r0.<init>()
            r0.setECLevel(r7)
            r0.setMode(r2)
            r0.setVersion(r8)
            int r1 = r8.getDimensionForVersion()
            i4.b r2 = new i4.b
            r2.<init>(r1, r1)
            int r1 = k(r6, r7, r8, r2)
            r0.setMaskPattern(r1)
            i4.AbstractC5699e.a(r6, r7, r8, r1, r2)
            r0.setMatrix(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC5697c.encode(java.lang.String, g4.f, java.util.Map):i4.f");
    }
}
