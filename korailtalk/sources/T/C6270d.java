package t;

import android.util.Size;
import t.O;

/* renamed from: t.d */
/* loaded from: classes.dex */
final class C6270d extends O.h {

    /* renamed from: a */
    private final String f36661a;

    /* renamed from: b */
    private final Class f36662b;

    /* renamed from: c */
    private final z.C0 f36663c;

    /* renamed from: d */
    private final Size f36664d;

    C6270d(String str, Class cls, z.C0 c02, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f36661a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f36662b = cls;
        if (c02 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f36663c = c02;
        this.f36664d = size;
    }

    @Override // t.O.h
    z.C0 c() {
        return this.f36663c;
    }

    @Override // t.O.h
    Size d() {
        return this.f36664d;
    }

    @Override // t.O.h
    String e() {
        return this.f36661a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.h)) {
            return false;
        }
        O.h hVar = (O.h) obj;
        if (this.f36661a.equals(hVar.e()) && this.f36662b.equals(hVar.f()) && this.f36663c.equals(hVar.c())) {
            Size size = this.f36664d;
            if (size == null) {
                if (hVar.d() == null) {
                    return true;
                }
            } else if (size.equals(hVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // t.O.h
    Class f() {
        return this.f36662b;
    }

    public int hashCode() {
        int iHashCode = (((((this.f36661a.hashCode() ^ 1000003) * 1000003) ^ this.f36662b.hashCode()) * 1000003) ^ this.f36663c.hashCode()) * 1000003;
        Size size = this.f36664d;
        return iHashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f36661a + ", useCaseType=" + this.f36662b + ", sessionConfig=" + this.f36663c + ", surfaceResolution=" + this.f36664d + "}";
    }
}
