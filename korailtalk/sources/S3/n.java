package S3;

/* loaded from: classes2.dex */
final class n extends c {
    n() {
    }

    @Override // S3.c
    int b(char c9, StringBuilder sb) {
        if (c9 == '\r') {
            sb.append((char) 0);
        } else if (c9 == '*') {
            sb.append((char) 1);
        } else if (c9 == '>') {
            sb.append((char) 2);
        } else if (c9 == ' ') {
            sb.append((char) 3);
        } else if (c9 >= '0' && c9 <= '9') {
            sb.append((char) (c9 - ','));
        } else if (c9 < 'A' || c9 > 'Z') {
            j.c(c9);
        } else {
            sb.append((char) (c9 - '3'));
        }
        return 1;
    }

    @Override // S3.c
    void d(h hVar, StringBuilder sb) {
        hVar.updateSymbolInfo();
        int dataCapacity = hVar.getSymbolInfo().getDataCapacity() - hVar.getCodewordCount();
        hVar.f4615f -= sb.length();
        if (hVar.getRemainingCharacters() > 1 || dataCapacity > 1 || hVar.getRemainingCharacters() != dataCapacity) {
            hVar.writeCodeword((char) 254);
        }
        if (hVar.getNewEncoding() < 0) {
            hVar.signalEncoderChange(0);
        }
    }

    @Override // S3.c, S3.g
    public void encode(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.hasMoreCharacters()) {
                break;
            }
            char currentChar = hVar.getCurrentChar();
            hVar.f4615f++;
            b(currentChar, sb);
            if (sb.length() % 3 == 0) {
                c.e(hVar, sb);
                int iL = j.l(hVar.getMessage(), hVar.f4615f, getEncodingMode());
                if (iL != getEncodingMode()) {
                    hVar.signalEncoderChange(iL);
                    break;
                }
            }
        }
        d(hVar, sb);
    }

    @Override // S3.c, S3.g
    public int getEncodingMode() {
        return 3;
    }
}
