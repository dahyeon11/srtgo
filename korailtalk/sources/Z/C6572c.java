package z;

import z.InterfaceC6565N;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6572c extends InterfaceC6565N.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f37802a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f37803b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f37804c;

    C6572c(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f37802a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f37803b = cls;
        this.f37804c = obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC6565N.a)) {
            return false;
        }
        InterfaceC6565N.a aVar = (InterfaceC6565N.a) obj;
        if (this.f37802a.equals(aVar.getId()) && this.f37803b.equals(aVar.getValueClass())) {
            Object obj2 = this.f37804c;
            if (obj2 == null) {
                if (aVar.getToken() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.getToken())) {
                return true;
            }
        }
        return false;
    }

    @Override // z.InterfaceC6565N.a
    public String getId() {
        return this.f37802a;
    }

    @Override // z.InterfaceC6565N.a
    public Object getToken() {
        return this.f37804c;
    }

    @Override // z.InterfaceC6565N.a
    public Class<Object> getValueClass() {
        return this.f37803b;
    }

    public int hashCode() {
        int iHashCode = (((this.f37802a.hashCode() ^ 1000003) * 1000003) ^ this.f37803b.hashCode()) * 1000003;
        Object obj = this.f37804c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f37802a + ", valueClass=" + this.f37803b + ", token=" + this.f37804c + "}";
    }
}
