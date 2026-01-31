package K6;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final int f2916a;
    public final P7.f name;
    public final P7.f value;
    public static final P7.f RESPONSE_STATUS = P7.f.encodeUtf8(I7.c.RESPONSE_STATUS_UTF8);
    public static final P7.f TARGET_METHOD = P7.f.encodeUtf8(I7.c.TARGET_METHOD_UTF8);
    public static final P7.f TARGET_PATH = P7.f.encodeUtf8(I7.c.TARGET_PATH_UTF8);
    public static final P7.f TARGET_SCHEME = P7.f.encodeUtf8(I7.c.TARGET_SCHEME_UTF8);
    public static final P7.f TARGET_AUTHORITY = P7.f.encodeUtf8(I7.c.TARGET_AUTHORITY_UTF8);
    public static final P7.f TARGET_HOST = P7.f.encodeUtf8(":host");
    public static final P7.f VERSION = P7.f.encodeUtf8(":version");

    public d(String str, String str2) {
        this(P7.f.encodeUtf8(str), P7.f.encodeUtf8(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.name.equals(dVar.name) && this.value.equals(dVar.value);
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.name.utf8(), this.value.utf8());
    }

    public d(P7.f fVar, String str) {
        this(fVar, P7.f.encodeUtf8(str));
    }

    public d(P7.f fVar, P7.f fVar2) {
        this.name = fVar;
        this.value = fVar2;
        this.f2916a = fVar.size() + 32 + fVar2.size();
    }
}
