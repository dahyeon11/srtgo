package F3;

/* loaded from: classes2.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    private final j f1143c;

    public i(j jVar) {
        super(jVar.getWidth(), jVar.getHeight());
        this.f1143c = jVar;
    }

    @Override // F3.j
    public j crop(int i8, int i9, int i10, int i11) {
        return new i(this.f1143c.crop(i8, i9, i10, i11));
    }

    @Override // F3.j
    public byte[] getMatrix() {
        byte[] matrix = this.f1143c.getMatrix();
        int width = getWidth() * getHeight();
        byte[] bArr = new byte[width];
        for (int i8 = 0; i8 < width; i8++) {
            bArr[i8] = (byte) (255 - (matrix[i8] & 255));
        }
        return bArr;
    }

    @Override // F3.j
    public byte[] getRow(int i8, byte[] bArr) {
        byte[] row = this.f1143c.getRow(i8, bArr);
        int width = getWidth();
        for (int i9 = 0; i9 < width; i9++) {
            row[i9] = (byte) (255 - (row[i9] & 255));
        }
        return row;
    }

    @Override // F3.j
    public j invert() {
        return this.f1143c;
    }

    @Override // F3.j
    public boolean isCropSupported() {
        return this.f1143c.isCropSupported();
    }

    @Override // F3.j
    public boolean isRotateSupported() {
        return this.f1143c.isRotateSupported();
    }

    @Override // F3.j
    public j rotateCounterClockwise() {
        return new i(this.f1143c.rotateCounterClockwise());
    }

    @Override // F3.j
    public j rotateCounterClockwise45() {
        return new i(this.f1143c.rotateCounterClockwise45());
    }
}
