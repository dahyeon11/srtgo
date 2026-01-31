package S3;

/* loaded from: classes2.dex */
final class b implements g {
    b() {
    }

    private static char a(char c9, int i8) {
        int i9 = c9 + ((i8 * 149) % 255) + 1;
        return i9 <= 255 ? (char) i9 : (char) (i9 - 256);
    }

    @Override // S3.g
    public void encode(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!hVar.hasMoreCharacters()) {
                break;
            }
            sb.append(hVar.getCurrentChar());
            hVar.f4615f++;
            int iL = j.l(hVar.getMessage(), hVar.f4615f, getEncodingMode());
            if (iL != getEncodingMode()) {
                hVar.signalEncoderChange(iL);
                break;
            }
        }
        int length = sb.length() - 1;
        int codewordCount = hVar.getCodewordCount() + length + 1;
        hVar.updateSymbolInfo(codewordCount);
        boolean z8 = hVar.getSymbolInfo().getDataCapacity() - codewordCount > 0;
        if (hVar.hasMoreCharacters() || z8) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: " + length);
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i8 = 0; i8 < length2; i8++) {
            hVar.writeCodeword(a(sb.charAt(i8), hVar.getCodewordCount() + 1));
        }
    }

    @Override // S3.g
    public int getEncodingMode() {
        return 5;
    }
}
