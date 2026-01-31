package S3;

/* loaded from: classes2.dex */
final class a implements g {
    a() {
    }

    private static char a(char c9, char c10) {
        if (j.d(c9) && j.d(c10)) {
            return (char) (((c9 - '0') * 10) + (c10 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c9 + c10);
    }

    @Override // S3.g
    public void encode(h hVar) {
        if (j.determineConsecutiveDigitCount(hVar.getMessage(), hVar.f4615f) >= 2) {
            hVar.writeCodeword(a(hVar.getMessage().charAt(hVar.f4615f), hVar.getMessage().charAt(hVar.f4615f + 1)));
            hVar.f4615f += 2;
            return;
        }
        char currentChar = hVar.getCurrentChar();
        int iL = j.l(hVar.getMessage(), hVar.f4615f, getEncodingMode());
        if (iL == getEncodingMode()) {
            if (!j.e(currentChar)) {
                hVar.writeCodeword((char) (currentChar + 1));
                hVar.f4615f++;
                return;
            } else {
                hVar.writeCodeword((char) 235);
                hVar.writeCodeword((char) (currentChar - 127));
                hVar.f4615f++;
                return;
            }
        }
        if (iL == 1) {
            hVar.writeCodeword((char) 230);
            hVar.signalEncoderChange(1);
            return;
        }
        if (iL == 2) {
            hVar.writeCodeword((char) 239);
            hVar.signalEncoderChange(2);
            return;
        }
        if (iL == 3) {
            hVar.writeCodeword((char) 238);
            hVar.signalEncoderChange(3);
        } else if (iL == 4) {
            hVar.writeCodeword((char) 240);
            hVar.signalEncoderChange(4);
        } else if (iL == 5) {
            hVar.writeCodeword((char) 231);
            hVar.signalEncoderChange(5);
        } else {
            throw new IllegalStateException("Illegal mode: " + iL);
        }
    }

    @Override // S3.g
    public int getEncodingMode() {
        return 0;
    }
}
