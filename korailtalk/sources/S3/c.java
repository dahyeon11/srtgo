package S3;

/* loaded from: classes2.dex */
class c implements g {
    c() {
    }

    private int a(h hVar, StringBuilder sb, StringBuilder sb2, int i8) {
        int length = sb.length();
        sb.delete(length - i8, length);
        hVar.f4615f--;
        int iB = b(hVar.getCurrentChar(), sb2);
        hVar.resetSymbolInfo();
        return iB;
    }

    private static String c(CharSequence charSequence, int i8) {
        int iCharAt = (charSequence.charAt(i8) * 1600) + (charSequence.charAt(i8 + 1) * '(') + charSequence.charAt(i8 + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    static void e(h hVar, StringBuilder sb) {
        hVar.writeCodewords(c(sb, 0));
        sb.delete(0, 3);
    }

    int b(char c9, StringBuilder sb) {
        if (c9 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c9 >= '0' && c9 <= '9') {
            sb.append((char) (c9 - ','));
            return 1;
        }
        if (c9 >= 'A' && c9 <= 'Z') {
            sb.append((char) (c9 - '3'));
            return 1;
        }
        if (c9 >= 0 && c9 <= 31) {
            sb.append((char) 0);
            sb.append(c9);
            return 2;
        }
        if (c9 >= '!' && c9 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c9 - '!'));
            return 2;
        }
        if (c9 >= ':' && c9 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c9 - '+'));
            return 2;
        }
        if (c9 >= '[' && c9 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c9 - 'E'));
            return 2;
        }
        if (c9 >= '`' && c9 <= 127) {
            sb.append((char) 2);
            sb.append((char) (c9 - '`'));
            return 2;
        }
        if (c9 >= 128) {
            sb.append("\u0001\u001e");
            return b((char) (c9 - 128), sb) + 2;
        }
        throw new IllegalArgumentException("Illegal character: " + c9);
    }

    void d(h hVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int codewordCount = hVar.getCodewordCount() + length;
        hVar.updateSymbolInfo(codewordCount);
        int dataCapacity = hVar.getSymbolInfo().getDataCapacity() - codewordCount;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                e(hVar, sb);
            }
            if (hVar.hasMoreCharacters()) {
                hVar.writeCodeword((char) 254);
            }
        } else if (dataCapacity == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                e(hVar, sb);
            }
            if (hVar.hasMoreCharacters()) {
                hVar.writeCodeword((char) 254);
            }
            hVar.f4615f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                e(hVar, sb);
            }
            if (dataCapacity > 0 || hVar.hasMoreCharacters()) {
                hVar.writeCodeword((char) 254);
            }
        }
        hVar.signalEncoderChange(0);
    }

    @Override // S3.g
    public void encode(h hVar) {
        int iL;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.hasMoreCharacters()) {
                break;
            }
            char currentChar = hVar.getCurrentChar();
            hVar.f4615f++;
            int iB = b(currentChar, sb);
            int codewordCount = hVar.getCodewordCount() + ((sb.length() / 3) << 1);
            hVar.updateSymbolInfo(codewordCount);
            int dataCapacity = hVar.getSymbolInfo().getDataCapacity() - codewordCount;
            if (!hVar.hasMoreCharacters()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (dataCapacity < 2 || dataCapacity > 2)) {
                    iB = a(hVar, sb, sb2, iB);
                }
                while (sb.length() % 3 == 1 && ((iB <= 3 && dataCapacity != 1) || iB > 3)) {
                    iB = a(hVar, sb, sb2, iB);
                }
            } else if (sb.length() % 3 == 0 && (iL = j.l(hVar.getMessage(), hVar.f4615f, getEncodingMode())) != getEncodingMode()) {
                hVar.signalEncoderChange(iL);
                break;
            }
        }
        d(hVar, sb);
    }

    @Override // S3.g
    public int getEncodingMode() {
        return 1;
    }
}
