package K;

import K.f;
import android.util.Size;

/* loaded from: classes.dex */
final class b extends f.a {

    /* renamed from: e, reason: collision with root package name */
    private final Size f2691e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2692f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2693g;

    b(Size size, int i8, int i9) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2691e = size;
        this.f2692f = i8;
        this.f2693g = i9;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.a)) {
            return false;
        }
        f.a aVar = (f.a) obj;
        return this.f2691e.equals(aVar.getSize()) && this.f2692f == aVar.getImageFormat() && this.f2693g == aVar.getMaxImages();
    }

    @Override // K.f.a, K.j
    public int getImageFormat() {
        return this.f2692f;
    }

    @Override // K.f.a, K.j
    public int getMaxImages() {
        return this.f2693g;
    }

    @Override // K.f.a, K.j
    public Size getSize() {
        return this.f2691e;
    }

    public int hashCode() {
        return ((((this.f2691e.hashCode() ^ 1000003) * 1000003) ^ this.f2692f) * 1000003) ^ this.f2693g;
    }

    public String toString() {
        return "ImageReaderConfig{size=" + this.f2691e + ", imageFormat=" + this.f2692f + ", maxImages=" + this.f2693g + "}";
    }
}
