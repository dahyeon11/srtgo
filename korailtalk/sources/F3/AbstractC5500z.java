package f3;

import j3.AbstractC5819a;
import java.io.Serializable;
import java.util.NoSuchElementException;

/* renamed from: f3.z */
/* loaded from: classes2.dex */
abstract class AbstractC5500z implements Comparable, Serializable {

    /* renamed from: a */
    final Comparable f31194a;

    /* renamed from: f3.z$a */
    private static final class a extends AbstractC5500z {

        /* renamed from: b */
        private static final a f31195b = new a();

        private a() {
            super("");
        }

        @Override // f3.AbstractC5500z
        void f(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // f3.AbstractC5500z
        void g(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // f3.AbstractC5500z
        Comparable h() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // f3.AbstractC5500z
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // f3.AbstractC5500z
        boolean i(Comparable comparable) {
            return false;
        }

        @Override // f3.AbstractC5500z
        EnumC5478o j() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // f3.AbstractC5500z
        EnumC5478o k() {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }

        @Override // f3.AbstractC5500z, java.lang.Comparable
        public int compareTo(AbstractC5500z abstractC5500z) {
            return abstractC5500z == this ? 0 : 1;
        }
    }

    /* renamed from: f3.z$b */
    private static final class b extends AbstractC5500z {
        b(Comparable comparable) {
            super((Comparable) e3.w.checkNotNull(comparable));
        }

        @Override // f3.AbstractC5500z, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((AbstractC5500z) obj);
        }

        @Override // f3.AbstractC5500z
        AbstractC5500z e(AbstractC5408A abstractC5408A) {
            Comparable comparableL = l(abstractC5408A);
            return comparableL != null ? AbstractC5500z.d(comparableL) : AbstractC5500z.a();
        }

        @Override // f3.AbstractC5500z
        void f(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f31194a);
        }

        @Override // f3.AbstractC5500z
        void g(StringBuilder sb) {
            sb.append(this.f31194a);
            sb.append(']');
        }

        @Override // f3.AbstractC5500z
        public int hashCode() {
            return ~this.f31194a.hashCode();
        }

        @Override // f3.AbstractC5500z
        boolean i(Comparable comparable) {
            return W0.a(this.f31194a, comparable) < 0;
        }

        @Override // f3.AbstractC5500z
        EnumC5478o j() {
            return EnumC5478o.OPEN;
        }

        @Override // f3.AbstractC5500z
        EnumC5478o k() {
            return EnumC5478o.CLOSED;
        }

        Comparable l(AbstractC5408A abstractC5408A) {
            return abstractC5408A.next(this.f31194a);
        }

        public String toString() {
            return "/" + this.f31194a + "\\";
        }
    }

    /* renamed from: f3.z$c */
    private static final class c extends AbstractC5500z {

        /* renamed from: b */
        private static final c f31196b = new c();

        private c() {
            super("");
        }

        @Override // f3.AbstractC5500z
        AbstractC5500z e(AbstractC5408A abstractC5408A) {
            try {
                return AbstractC5500z.d(abstractC5408A.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // f3.AbstractC5500z
        void f(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // f3.AbstractC5500z
        void g(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // f3.AbstractC5500z
        Comparable h() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // f3.AbstractC5500z
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // f3.AbstractC5500z
        boolean i(Comparable comparable) {
            return true;
        }

        @Override // f3.AbstractC5500z
        EnumC5478o j() {
            throw new IllegalStateException();
        }

        @Override // f3.AbstractC5500z
        EnumC5478o k() {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }

        @Override // f3.AbstractC5500z, java.lang.Comparable
        public int compareTo(AbstractC5500z abstractC5500z) {
            return abstractC5500z == this ? 0 : -1;
        }
    }

    /* renamed from: f3.z$d */
    private static final class d extends AbstractC5500z {
        d(Comparable comparable) {
            super((Comparable) e3.w.checkNotNull(comparable));
        }

        @Override // f3.AbstractC5500z, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((AbstractC5500z) obj);
        }

        @Override // f3.AbstractC5500z
        void f(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f31194a);
        }

        @Override // f3.AbstractC5500z
        void g(StringBuilder sb) {
            sb.append(this.f31194a);
            sb.append(')');
        }

        @Override // f3.AbstractC5500z
        public int hashCode() {
            return this.f31194a.hashCode();
        }

        @Override // f3.AbstractC5500z
        boolean i(Comparable comparable) {
            return W0.a(this.f31194a, comparable) <= 0;
        }

        @Override // f3.AbstractC5500z
        EnumC5478o j() {
            return EnumC5478o.CLOSED;
        }

        @Override // f3.AbstractC5500z
        EnumC5478o k() {
            return EnumC5478o.OPEN;
        }

        public String toString() {
            return "\\" + this.f31194a + "/";
        }
    }

    AbstractC5500z(Comparable comparable) {
        this.f31194a = comparable;
    }

    static AbstractC5500z a() {
        return a.f31195b;
    }

    static AbstractC5500z b(Comparable comparable) {
        return new b(comparable);
    }

    static AbstractC5500z c() {
        return c.f31196b;
    }

    static AbstractC5500z d(Comparable comparable) {
        return new d(comparable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5500z)) {
            return false;
        }
        try {
            return compareTo((AbstractC5500z) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    abstract void f(StringBuilder sb);

    abstract void g(StringBuilder sb);

    Comparable h() {
        return this.f31194a;
    }

    public abstract int hashCode();

    abstract boolean i(Comparable comparable);

    abstract EnumC5478o j();

    abstract EnumC5478o k();

    @Override // java.lang.Comparable
    public int compareTo(AbstractC5500z abstractC5500z) {
        if (abstractC5500z == c()) {
            return 1;
        }
        if (abstractC5500z == a()) {
            return -1;
        }
        int iA = W0.a(this.f31194a, abstractC5500z.f31194a);
        return iA != 0 ? iA : AbstractC5819a.compare(this instanceof b, abstractC5500z instanceof b);
    }

    AbstractC5500z e(AbstractC5408A abstractC5408A) {
        return this;
    }
}
