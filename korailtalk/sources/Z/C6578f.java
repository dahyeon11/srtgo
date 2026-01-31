package z;

import z.H0;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6578f extends H0 {

    /* renamed from: a, reason: collision with root package name */
    private final H0.b f37809a;

    /* renamed from: b, reason: collision with root package name */
    private final H0.a f37810b;

    C6578f(H0.b bVar, H0.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f37809a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f37810b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return this.f37809a.equals(h02.getConfigType()) && this.f37810b.equals(h02.getConfigSize());
    }

    @Override // z.H0
    public H0.a getConfigSize() {
        return this.f37810b;
    }

    @Override // z.H0
    public H0.b getConfigType() {
        return this.f37809a;
    }

    public int hashCode() {
        return ((this.f37809a.hashCode() ^ 1000003) * 1000003) ^ this.f37810b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f37809a + ", configSize=" + this.f37810b + "}";
    }
}
