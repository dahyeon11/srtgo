package n1;

import java.util.List;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5929e extends AbstractC5935k {

    /* renamed from: a, reason: collision with root package name */
    private final List f34161a;

    C5929e(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f34161a = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5935k) {
            return this.f34161a.equals(((AbstractC5935k) obj).zza());
        }
        return false;
    }

    public int hashCode() {
        return this.f34161a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f34161a + "}";
    }

    @Override // n1.AbstractC5935k
    public List<AbstractC5942r> zza() {
        return this.f34161a;
    }
}
