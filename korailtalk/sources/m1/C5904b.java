package m1;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5904b {

    /* renamed from: a, reason: collision with root package name */
    private final String f34111a;

    private C5904b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f34111a = str;
    }

    public static C5904b of(String str) {
        return new C5904b(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5904b) {
            return this.f34111a.equals(((C5904b) obj).f34111a);
        }
        return false;
    }

    public String getName() {
        return this.f34111a;
    }

    public int hashCode() {
        return this.f34111a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f34111a + "\"}";
    }
}
