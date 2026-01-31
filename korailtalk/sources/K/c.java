package K;

import K.f;

/* loaded from: classes.dex */
final class c extends f.b {

    /* renamed from: e, reason: collision with root package name */
    private final int f2694e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2695f;

    c(int i8, int i9) {
        this.f2694e = i8;
        this.f2695f = i9;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f2694e == bVar.getImageFormat() && this.f2695f == bVar.getMaxImages();
    }

    @Override // K.f.b, K.l
    public int getImageFormat() {
        return this.f2694e;
    }

    @Override // K.f.b, K.l
    public int getMaxImages() {
        return this.f2695f;
    }

    public int hashCode() {
        return ((this.f2694e ^ 1000003) * 1000003) ^ this.f2695f;
    }

    public String toString() {
        return "MultiResolutionImageReaderConfig{imageFormat=" + this.f2694e + ", maxImages=" + this.f2695f + "}";
    }
}
