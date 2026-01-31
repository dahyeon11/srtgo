package F3;

import Q7.C;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f1144a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1145b;

    protected j(int i8, int i9) {
        this.f1144a = i8;
        this.f1145b = i9;
    }

    public j crop(int i8, int i9, int i10, int i11) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.f1145b;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i8, byte[] bArr);

    public final int getWidth() {
        return this.f1144a;
    }

    public j invert() {
        return new i(this);
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public j rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public j rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int i8 = this.f1144a;
        byte[] row = new byte[i8];
        StringBuilder sb = new StringBuilder(this.f1145b * (i8 + 1));
        for (int i9 = 0; i9 < this.f1145b; i9++) {
            row = getRow(i9, row);
            for (int i10 = 0; i10 < this.f1144a; i10++) {
                int i11 = row[i10] & 255;
                sb.append(i11 < 64 ? '#' : i11 < 128 ? '+' : i11 < 192 ? C.PACKAGE_SEPARATOR_CHAR : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
