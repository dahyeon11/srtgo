package S3;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class j {
    private static int a(float[] fArr, int[] iArr, int i8, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i9 = 0; i9 < 6; i9++) {
            int iCeil = (int) Math.ceil(fArr[i9]);
            iArr[i9] = iCeil;
            if (i8 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i8 = iCeil;
            }
            if (i8 == iCeil) {
                bArr[i9] = (byte) (bArr[i9] + 1);
            }
        }
        return i8;
    }

    private static int b(byte[] bArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 6; i9++) {
            i8 += bArr[i9];
        }
        return i8;
    }

    static void c(char c9) {
        String hexString = Integer.toHexString(c9);
        throw new IllegalArgumentException("Illegal character: " + c9 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean d(char c9) {
        return c9 >= '0' && c9 <= '9';
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        if (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            while (d(cCharAt) && i8 < length) {
                i9++;
                i8++;
                if (i8 < length) {
                    cCharAt = charSequence.charAt(i8);
                }
            }
        }
        return i9;
    }

    static boolean e(char c9) {
        return c9 >= 128 && c9 <= 255;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, l.FORCE_NONE, null, null);
    }

    private static boolean f(char c9) {
        if (c9 == ' ') {
            return true;
        }
        if (c9 < '0' || c9 > '9') {
            return c9 >= 'A' && c9 <= 'Z';
        }
        return true;
    }

    private static boolean g(char c9) {
        return c9 >= ' ' && c9 <= '^';
    }

    private static boolean h(char c9) {
        if (c9 == ' ') {
            return true;
        }
        if (c9 < '0' || c9 > '9') {
            return c9 >= 'a' && c9 <= 'z';
        }
        return true;
    }

    private static boolean i(char c9) {
        if (k(c9) || c9 == ' ') {
            return true;
        }
        if (c9 < '0' || c9 > '9') {
            return c9 >= 'A' && c9 <= 'Z';
        }
        return true;
    }

    private static boolean j(char c9) {
        return false;
    }

    private static boolean k(char c9) {
        return c9 == '\r' || c9 == '*' || c9 == '>';
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x01df, code lost:
    
        return 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int l(java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.j.l(java.lang.CharSequence, int, int):int");
    }

    private static char m(char c9, int i8) {
        int i9 = c9 + ((i8 * 149) % 253) + 1;
        if (i9 > 254) {
            i9 -= 254;
        }
        return (char) i9;
    }

    public static String encodeHighLevel(String str, l lVar, F3.f fVar, F3.f fVar2) {
        int newEncoding = 0;
        g[] gVarArr = {new a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.setSymbolShape(lVar);
        hVar.setSizeConstraints(fVar, fVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.writeCodeword((char) 236);
            hVar.setSkipAtEnd(2);
            hVar.f4615f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.writeCodeword((char) 237);
            hVar.setSkipAtEnd(2);
            hVar.f4615f += 7;
        }
        while (hVar.hasMoreCharacters()) {
            gVarArr[newEncoding].encode(hVar);
            if (hVar.getNewEncoding() >= 0) {
                newEncoding = hVar.getNewEncoding();
                hVar.resetEncoderSignal();
            }
        }
        int codewordCount = hVar.getCodewordCount();
        hVar.updateSymbolInfo();
        int dataCapacity = hVar.getSymbolInfo().getDataCapacity();
        if (codewordCount < dataCapacity && newEncoding != 0 && newEncoding != 5) {
            hVar.writeCodeword((char) 254);
        }
        StringBuilder codewords = hVar.getCodewords();
        if (codewords.length() < dataCapacity) {
            codewords.append((char) 129);
        }
        while (codewords.length() < dataCapacity) {
            codewords.append(m((char) 129, codewords.length() + 1));
        }
        return hVar.getCodewords().toString();
    }
}
