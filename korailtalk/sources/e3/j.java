package e3;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class j {

    static final class b extends j implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final b f30389a = new b();

        b() {
        }

        @Override // e3.j
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // e3.j
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    private static final class c implements x, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final j f30390a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f30391b;

        c(j jVar, Object obj) {
            this.f30390a = (j) w.checkNotNull(jVar);
            this.f30391b = obj;
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            return this.f30390a.equivalent(obj, this.f30391b);
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30390a.equals(cVar.f30390a) && r.equal(this.f30391b, cVar.f30391b);
        }

        public int hashCode() {
            return r.hashCode(this.f30390a, this.f30391b);
        }

        public String toString() {
            return this.f30390a + ".equivalentTo(" + this.f30391b + ")";
        }
    }

    static final class d extends j implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final d f30392a = new d();

        d() {
        }

        @Override // e3.j
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // e3.j
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class e implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final j f30393a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f30394b;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f30393a.equals(eVar.f30393a)) {
                return this.f30393a.equivalent(this.f30394b, eVar.f30394b);
            }
            return false;
        }

        public Object get() {
            return this.f30394b;
        }

        public int hashCode() {
            return this.f30393a.hash(this.f30394b);
        }

        public String toString() {
            return this.f30393a + ".wrap(" + this.f30394b + ")";
        }

        private e(j jVar, Object obj) {
            this.f30393a = (j) w.checkNotNull(jVar);
            this.f30394b = obj;
        }
    }

    protected j() {
    }

    public static j equals() {
        return b.f30389a;
    }

    public static j identity() {
        return d.f30392a;
    }

    protected abstract boolean a(Object obj, Object obj2);

    protected abstract int b(Object obj);

    public final boolean equivalent(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }

    public final x equivalentTo(Object obj) {
        return new c(this, obj);
    }

    public final int hash(Object obj) {
        if (obj == null) {
            return 0;
        }
        return b(obj);
    }

    public final <F> j onResultOf(l lVar) {
        return new m(lVar, this);
    }

    public final <S> j pairwise() {
        return new t(this);
    }

    public final <S> e wrap(S s8) {
        return new e(s8);
    }
}
