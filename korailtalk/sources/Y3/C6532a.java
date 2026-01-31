package y3;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6532a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f37611a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37612b;

    C6532a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f37611a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f37612b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f37611a.equals(fVar.getLibraryName()) && this.f37612b.equals(fVar.getVersion());
    }

    @Override // y3.f
    public String getLibraryName() {
        return this.f37611a;
    }

    @Override // y3.f
    public String getVersion() {
        return this.f37612b;
    }

    public int hashCode() {
        return ((this.f37611a.hashCode() ^ 1000003) * 1000003) ^ this.f37612b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f37611a + ", version=" + this.f37612b + "}";
    }
}
