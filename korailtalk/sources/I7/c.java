package I7;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final int f2362a;
    public final P7.f name;
    public final P7.f value;
    public static final P7.f PSEUDO_PREFIX = P7.f.encodeUtf8(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final P7.f RESPONSE_STATUS = P7.f.encodeUtf8(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final P7.f TARGET_METHOD = P7.f.encodeUtf8(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final P7.f TARGET_PATH = P7.f.encodeUtf8(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final P7.f TARGET_SCHEME = P7.f.encodeUtf8(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final P7.f TARGET_AUTHORITY = P7.f.encodeUtf8(TARGET_AUTHORITY_UTF8);

    public c(String str, String str2) {
        this(P7.f.encodeUtf8(str), P7.f.encodeUtf8(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.name.equals(cVar.name) && this.value.equals(cVar.value);
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return D7.e.format("%s: %s", this.name.utf8(), this.value.utf8());
    }

    public c(P7.f fVar, String str) {
        this(fVar, P7.f.encodeUtf8(str));
    }

    public c(P7.f fVar, P7.f fVar2) {
        this.name = fVar;
        this.value = fVar2;
        this.f2362a = fVar.size() + 32 + fVar2.size();
    }
}
