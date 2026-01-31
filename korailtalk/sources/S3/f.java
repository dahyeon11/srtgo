package S3;

/* loaded from: classes2.dex */
final class f implements g {
    f() {
    }

    private static void a(char c9, StringBuilder sb) {
        if (c9 >= ' ' && c9 <= '?') {
            sb.append(c9);
        } else if (c9 < '@' || c9 > '^') {
            j.c(c9);
        } else {
            sb.append((char) (c9 - '@'));
        }
    }

    private static String b(CharSequence charSequence, int i8) {
        int length = charSequence.length() - i8;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i8) << 18) + ((length >= 2 ? charSequence.charAt(i8 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i8 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i8 + 3) : (char) 0);
        char c9 = (char) ((iCharAt >> 16) & 255);
        char c10 = (char) ((iCharAt >> 8) & 255);
        char c11 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c9);
        if (length >= 2) {
            sb.append(c10);
        }
        if (length >= 3) {
            sb.append(c11);
        }
        return sb.toString();
    }

    private static void c(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z8 = true;
            if (length == 1) {
                hVar.updateSymbolInfo();
                int dataCapacity = hVar.getSymbolInfo().getDataCapacity() - hVar.getCodewordCount();
                if (hVar.getRemainingCharacters() == 0 && dataCapacity <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i8 = length - 1;
            String strB = b(charSequence, 0);
            if (hVar.hasMoreCharacters() || i8 > 2) {
                z8 = false;
            }
            if (i8 <= 2) {
                hVar.updateSymbolInfo(hVar.getCodewordCount() + i8);
                if (hVar.getSymbolInfo().getDataCapacity() - hVar.getCodewordCount() >= 3) {
                    hVar.updateSymbolInfo(hVar.getCodewordCount() + strB.length());
                    z8 = false;
                }
            }
            if (z8) {
                hVar.resetSymbolInfo();
                hVar.f4615f -= i8;
            } else {
                hVar.writeCodewords(strB);
            }
        } finally {
            hVar.signalEncoderChange(0);
        }
    }

    @Override // S3.g
    public void encode(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.hasMoreCharacters()) {
                break;
            }
            a(hVar.getCurrentChar(), sb);
            hVar.f4615f++;
            if (sb.length() >= 4) {
                hVar.writeCodewords(b(sb, 0));
                sb.delete(0, 4);
                if (j.l(hVar.getMessage(), hVar.f4615f, getEncodingMode()) != getEncodingMode()) {
                    hVar.signalEncoderChange(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        c(hVar, sb);
    }

    @Override // S3.g
    public int getEncodingMode() {
        return 4;
    }
}
