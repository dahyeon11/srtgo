package F3;

/* loaded from: classes2.dex */
public final class n extends j {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f1150c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1151d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1152e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1153f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1154g;

    public n(byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, boolean z8) {
        super(i12, i13);
        if (i10 + i12 > i8 || i11 + i13 > i9) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f1150c = bArr;
        this.f1151d = i8;
        this.f1152e = i9;
        this.f1153f = i10;
        this.f1154g = i11;
        if (z8) {
            a(i12, i13);
        }
    }

    private void a(int i8, int i9) {
        byte[] bArr = this.f1150c;
        int i10 = (this.f1154g * this.f1151d) + this.f1153f;
        int i11 = 0;
        while (i11 < i9) {
            int i12 = (i8 / 2) + i10;
            int i13 = (i10 + i8) - 1;
            int i14 = i10;
            while (i14 < i12) {
                byte b9 = bArr[i14];
                bArr[i14] = bArr[i13];
                bArr[i13] = b9;
                i14++;
                i13--;
            }
            i11++;
            i10 += this.f1151d;
        }
    }

    @Override // F3.j
    public j crop(int i8, int i9, int i10, int i11) {
        return new n(this.f1150c, this.f1151d, this.f1152e, this.f1153f + i8, this.f1154g + i9, i10, i11, false);
    }

    @Override // F3.j
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i8 = this.f1151d;
        if (width == i8 && height == this.f1152e) {
            return this.f1150c;
        }
        int i9 = width * height;
        byte[] bArr = new byte[i9];
        int i10 = (this.f1154g * i8) + this.f1153f;
        if (width == i8) {
            System.arraycopy(this.f1150c, i10, bArr, 0, i9);
            return bArr;
        }
        for (int i11 = 0; i11 < height; i11++) {
            System.arraycopy(this.f1150c, i10, bArr, i11 * width, width);
            i10 += this.f1151d;
        }
        return bArr;
    }

    @Override // F3.j
    public byte[] getRow(int i8, byte[] bArr) {
        if (i8 < 0 || i8 >= getHeight()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i8);
        }
        int width = getWidth();
        if (bArr == null || bArr.length < width) {
            bArr = new byte[width];
        }
        System.arraycopy(this.f1150c, ((i8 + this.f1154g) * this.f1151d) + this.f1153f, bArr, 0, width);
        return bArr;
    }

    public int getThumbnailHeight() {
        return getHeight() / 2;
    }

    public int getThumbnailWidth() {
        return getWidth() / 2;
    }

    @Override // F3.j
    public boolean isCropSupported() {
        return true;
    }

    public int[] renderThumbnail() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int[] iArr = new int[width * height];
        byte[] bArr = this.f1150c;
        int i8 = (this.f1154g * this.f1151d) + this.f1153f;
        for (int i9 = 0; i9 < height; i9++) {
            int i10 = i9 * width;
            for (int i11 = 0; i11 < width; i11++) {
                iArr[i10 + i11] = ((bArr[(i11 << 1) + i8] & 255) * 65793) | (-16777216);
            }
            i8 += this.f1151d << 1;
        }
        return iArr;
    }
}
