package Y0;

import Q7.X;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    Object f5582a;

    /* renamed from: b, reason: collision with root package name */
    Object f5583b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Z.d)) {
            return false;
        }
        Z.d dVar = (Z.d) obj;
        return a(dVar.first, this.f5582a) && a(dVar.second, this.f5583b);
    }

    public int hashCode() {
        Object obj = this.f5582a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f5583b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public void set(Object obj, Object obj2) {
        this.f5582a = obj;
        this.f5583b = obj2;
    }

    public String toString() {
        return "Pair{" + this.f5582a + X.SPACE + this.f5583b + "}";
    }
}
