package Y3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f5612a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5613b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5614c;

    c(List list, int i8, boolean z8) {
        this.f5612a = new ArrayList(list);
        this.f5613b = i8;
        this.f5614c = z8;
    }

    List a() {
        return this.f5612a;
    }

    int b() {
        return this.f5613b;
    }

    boolean c(List list) {
        return this.f5612a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5612a.equals(cVar.a()) && this.f5614c == cVar.f5614c;
    }

    public int hashCode() {
        return this.f5612a.hashCode() ^ Boolean.valueOf(this.f5614c).hashCode();
    }

    public String toString() {
        return "{ " + this.f5612a + " }";
    }
}
