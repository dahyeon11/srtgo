package F3;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f1134a;

    /* renamed from: b, reason: collision with root package name */
    private M3.b f1135b;

    public c(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f1134a = bVar;
    }

    public c crop(int i8, int i9, int i10, int i11) {
        return new c(this.f1134a.createBinarizer(this.f1134a.getLuminanceSource().crop(i8, i9, i10, i11)));
    }

    public M3.b getBlackMatrix() {
        if (this.f1135b == null) {
            this.f1135b = this.f1134a.getBlackMatrix();
        }
        return this.f1135b;
    }

    public M3.a getBlackRow(int i8, M3.a aVar) {
        return this.f1134a.getBlackRow(i8, aVar);
    }

    public int getHeight() {
        return this.f1134a.getHeight();
    }

    public int getWidth() {
        return this.f1134a.getWidth();
    }

    public boolean isCropSupported() {
        return this.f1134a.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.f1134a.getLuminanceSource().isRotateSupported();
    }

    public c rotateCounterClockwise() {
        return new c(this.f1134a.createBinarizer(this.f1134a.getLuminanceSource().rotateCounterClockwise()));
    }

    public c rotateCounterClockwise45() {
        return new c(this.f1134a.createBinarizer(this.f1134a.getLuminanceSource().rotateCounterClockwise45()));
    }

    public String toString() {
        try {
            return getBlackMatrix().toString();
        } catch (m unused) {
            return "";
        }
    }
}
