package z;

import android.util.Size;
import android.view.Surface;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6576e extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Surface f37806a;

    /* renamed from: b, reason: collision with root package name */
    private final Size f37807b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37808c;

    C6576e(Surface surface, Size size, int i8) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f37806a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f37807b = size;
        this.f37808c = i8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f37806a.equals(w0Var.getSurface()) && this.f37807b.equals(w0Var.getSize()) && this.f37808c == w0Var.getImageFormat();
    }

    @Override // z.w0
    public int getImageFormat() {
        return this.f37808c;
    }

    @Override // z.w0
    public Size getSize() {
        return this.f37807b;
    }

    @Override // z.w0
    public Surface getSurface() {
        return this.f37806a;
    }

    public int hashCode() {
        return ((((this.f37806a.hashCode() ^ 1000003) * 1000003) ^ this.f37807b.hashCode()) * 1000003) ^ this.f37808c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f37806a + ", size=" + this.f37807b + ", imageFormat=" + this.f37808c + "}";
    }
}
