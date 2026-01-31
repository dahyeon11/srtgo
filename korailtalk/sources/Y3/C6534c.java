package y3;

import java.util.Iterator;
import java.util.Set;
import n3.o;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6534c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final String f37614a;

    /* renamed from: b, reason: collision with root package name */
    private final C6535d f37615b;

    C6534c(Set set, C6535d c6535d) {
        this.f37614a = b(set);
        this.f37615b = c6535d;
    }

    static /* synthetic */ h a(n3.f fVar) {
        return new C6534c(fVar.setOf(f.class), C6535d.getInstance());
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.getLibraryName());
            sb.append('/');
            sb.append(fVar.getVersion());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static n3.e component() {
        return n3.e.builder(h.class).add(o.setOf(f.class)).factory(C6533b.f37613a).build();
    }

    @Override // y3.h
    public String getUserAgent() {
        if (this.f37615b.a().isEmpty()) {
            return this.f37614a;
        }
        return this.f37614a + ' ' + b(this.f37615b.a());
    }
}
