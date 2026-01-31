package e3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class s implements Serializable {

    class a implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f30416a;

        /* renamed from: e3.s$a$a, reason: collision with other inner class name */
        class C0281a extends AbstractC5357b {

            /* renamed from: c, reason: collision with root package name */
            private final Iterator f30417c;

            C0281a() {
                this.f30417c = (Iterator) w.checkNotNull(a.this.f30416a.iterator());
            }

            @Override // e3.AbstractC5357b
            protected Object a() {
                while (this.f30417c.hasNext()) {
                    s sVar = (s) this.f30417c.next();
                    if (sVar.isPresent()) {
                        return sVar.get();
                    }
                }
                return b();
            }
        }

        a(Iterable iterable) {
            this.f30416a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return new C0281a();
        }
    }

    s() {
    }

    public static <T> s absent() {
        return C5356a.a();
    }

    public static <T> s fromNullable(T t8) {
        return t8 == null ? absent() : new z(t8);
    }

    public static <T> s of(T t8) {
        return new z(w.checkNotNull(t8));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends s> iterable) {
        w.checkNotNull(iterable);
        return new a(iterable);
    }

    public abstract Set<Object> asSet();

    public abstract boolean equals(Object obj);

    public abstract Object get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract s or(s sVar);

    public abstract Object or(InterfaceC5355E interfaceC5355E);

    public abstract Object or(Object obj);

    public abstract Object orNull();

    public abstract String toString();

    public abstract <V> s transform(l lVar);
}
