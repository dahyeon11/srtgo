package Z;

import Q7.X;

/* loaded from: classes.dex */
public class d {
    public final Object first;
    public final Object second;

    public d(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public static <A, B> d create(A a9, B b9) {
        return new d(a9, b9);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.equals(dVar.first, this.first) && c.equals(dVar.second, this.second);
    }

    public int hashCode() {
        Object obj = this.first;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.second;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.first + X.SPACE + this.second + "}";
    }
}
