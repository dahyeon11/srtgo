package z;

import android.util.Size;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6580g extends I0 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f37811a;

    /* renamed from: b, reason: collision with root package name */
    private final Size f37812b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f37813c;

    C6580g(Size size, Size size2, Size size3) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f37811a = size;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f37812b = size2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f37813c = size3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return this.f37811a.equals(i02.getAnalysisSize()) && this.f37812b.equals(i02.getPreviewSize()) && this.f37813c.equals(i02.getRecordSize());
    }

    @Override // z.I0
    public Size getAnalysisSize() {
        return this.f37811a;
    }

    @Override // z.I0
    public Size getPreviewSize() {
        return this.f37812b;
    }

    @Override // z.I0
    public Size getRecordSize() {
        return this.f37813c;
    }

    public int hashCode() {
        return ((((this.f37811a.hashCode() ^ 1000003) * 1000003) ^ this.f37812b.hashCode()) * 1000003) ^ this.f37813c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f37811a + ", previewSize=" + this.f37812b + ", recordSize=" + this.f37813c + "}";
    }
}
