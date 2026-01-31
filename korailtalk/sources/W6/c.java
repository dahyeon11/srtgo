package W6;

import W6.g;
import f7.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final g f5382a;

    /* renamed from: b, reason: collision with root package name */
    private final g.b f5383b;

    static final class a extends Lambda implements p {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // f7.p
        public final String invoke(String acc, g.b element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f5382a = left;
        this.f5383b = element;
    }

    private final boolean b(g.b bVar) {
        return Intrinsics.areEqual(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (b(cVar.f5383b)) {
            g gVar = cVar.f5382a;
            if (!(gVar instanceof c)) {
                Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int e() {
        int i8 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f5382a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i8;
            }
            i8++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // W6.g
    public <R> R fold(R r8, p operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) operation.invoke(this.f5382a.fold(r8, operation), this.f5383b);
    }

    @Override // W6.g
    public <E extends g.b> E get(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            E e8 = (E) cVar.f5383b.get(key);
            if (e8 != null) {
                return e8;
            }
            g gVar = cVar.f5382a;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(key);
            }
            cVar = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f5382a.hashCode() + this.f5383b.hashCode();
    }

    @Override // W6.g
    public g minusKey(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f5383b.get(key) != null) {
            return this.f5382a;
        }
        g gVarMinusKey = this.f5382a.minusKey(key);
        return gVarMinusKey == this.f5382a ? this : gVarMinusKey == h.INSTANCE ? this.f5383b : new c(gVarMinusKey, this.f5383b);
    }

    @Override // W6.g
    public g plus(g gVar) {
        return g.a.plus(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.INSTANCE)) + ']';
    }
}
