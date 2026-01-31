package S3;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f4610a;

    /* renamed from: b, reason: collision with root package name */
    private l f4611b;

    /* renamed from: c, reason: collision with root package name */
    private F3.f f4612c;

    /* renamed from: d, reason: collision with root package name */
    private F3.f f4613d;

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f4614e;

    /* renamed from: f, reason: collision with root package name */
    int f4615f;

    /* renamed from: g, reason: collision with root package name */
    private int f4616g;

    /* renamed from: h, reason: collision with root package name */
    private k f4617h;

    /* renamed from: i, reason: collision with root package name */
    private int f4618i;

    h(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i8 = 0; i8 < length; i8++) {
            char c9 = (char) (bytes[i8] & 255);
            if (c9 == '?' && str.charAt(i8) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c9);
        }
        this.f4610a = sb.toString();
        this.f4611b = l.FORCE_NONE;
        this.f4614e = new StringBuilder(str.length());
        this.f4616g = -1;
    }

    private int a() {
        return this.f4610a.length() - this.f4618i;
    }

    public int getCodewordCount() {
        return this.f4614e.length();
    }

    public StringBuilder getCodewords() {
        return this.f4614e;
    }

    public char getCurrent() {
        return this.f4610a.charAt(this.f4615f);
    }

    public char getCurrentChar() {
        return this.f4610a.charAt(this.f4615f);
    }

    public String getMessage() {
        return this.f4610a;
    }

    public int getNewEncoding() {
        return this.f4616g;
    }

    public int getRemainingCharacters() {
        return a() - this.f4615f;
    }

    public k getSymbolInfo() {
        return this.f4617h;
    }

    public boolean hasMoreCharacters() {
        return this.f4615f < a();
    }

    public void resetEncoderSignal() {
        this.f4616g = -1;
    }

    public void resetSymbolInfo() {
        this.f4617h = null;
    }

    public void setSizeConstraints(F3.f fVar, F3.f fVar2) {
        this.f4612c = fVar;
        this.f4613d = fVar2;
    }

    public void setSkipAtEnd(int i8) {
        this.f4618i = i8;
    }

    public void setSymbolShape(l lVar) {
        this.f4611b = lVar;
    }

    public void signalEncoderChange(int i8) {
        this.f4616g = i8;
    }

    public void updateSymbolInfo() {
        updateSymbolInfo(getCodewordCount());
    }

    public void writeCodeword(char c9) {
        this.f4614e.append(c9);
    }

    public void writeCodewords(String str) {
        this.f4614e.append(str);
    }

    public void updateSymbolInfo(int i8) {
        k kVar = this.f4617h;
        if (kVar == null || i8 > kVar.getDataCapacity()) {
            this.f4617h = k.lookup(i8, this.f4611b, this.f4612c, this.f4613d, true);
        }
    }
}
