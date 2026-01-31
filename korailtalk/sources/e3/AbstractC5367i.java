package e3;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: e3.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5367i implements l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30377a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC5367i f30378b;

    /* renamed from: e3.i$a */
    class a implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f30379a;

        /* renamed from: e3.i$a$a, reason: collision with other inner class name */
        class C0279a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator f30381a;

            C0279a() {
                this.f30381a = a.this.f30379a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f30381a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return AbstractC5367i.this.convert(this.f30381a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f30381a.remove();
            }
        }

        a(Iterable iterable) {
            this.f30379a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return new C0279a();
        }
    }

    /* renamed from: e3.i$b */
    private static final class b extends AbstractC5367i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        final AbstractC5367i f30383c;

        /* renamed from: d, reason: collision with root package name */
        final AbstractC5367i f30384d;

        b(AbstractC5367i abstractC5367i, AbstractC5367i abstractC5367i2) {
            this.f30383c = abstractC5367i;
            this.f30384d = abstractC5367i2;
        }

        @Override // e3.AbstractC5367i
        Object a(Object obj) {
            return this.f30383c.a(this.f30384d.a(obj));
        }

        @Override // e3.AbstractC5367i
        Object b(Object obj) {
            return this.f30384d.b(this.f30383c.b(obj));
        }

        @Override // e3.AbstractC5367i
        protected Object d(Object obj) {
            throw new AssertionError();
        }

        @Override // e3.AbstractC5367i
        protected Object e(Object obj) {
            throw new AssertionError();
        }

        @Override // e3.AbstractC5367i, e3.l
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30383c.equals(bVar.f30383c) && this.f30384d.equals(bVar.f30384d);
        }

        public int hashCode() {
            return (this.f30383c.hashCode() * 31) + this.f30384d.hashCode();
        }

        public String toString() {
            return this.f30383c + ".andThen(" + this.f30384d + ")";
        }
    }

    /* renamed from: e3.i$c */
    private static final class c extends AbstractC5367i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private final l f30385c;

        /* renamed from: d, reason: collision with root package name */
        private final l f30386d;

        /* synthetic */ c(l lVar, l lVar2, a aVar) {
            this(lVar, lVar2);
        }

        @Override // e3.AbstractC5367i
        protected Object d(Object obj) {
            return this.f30386d.apply(obj);
        }

        @Override // e3.AbstractC5367i
        protected Object e(Object obj) {
            return this.f30385c.apply(obj);
        }

        @Override // e3.AbstractC5367i, e3.l
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30385c.equals(cVar.f30385c) && this.f30386d.equals(cVar.f30386d);
        }

        public int hashCode() {
            return (this.f30385c.hashCode() * 31) + this.f30386d.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f30385c + ", " + this.f30386d + ")";
        }

        private c(l lVar, l lVar2) {
            this.f30385c = (l) w.checkNotNull(lVar);
            this.f30386d = (l) w.checkNotNull(lVar2);
        }
    }

    /* renamed from: e3.i$d */
    private static final class d extends AbstractC5367i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        static final d f30387c = new d();

        private d() {
        }

        @Override // e3.AbstractC5367i
        AbstractC5367i c(AbstractC5367i abstractC5367i) {
            return (AbstractC5367i) w.checkNotNull(abstractC5367i, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // e3.AbstractC5367i
        public d reverse() {
            return this;
        }

        @Override // e3.AbstractC5367i
        protected Object d(Object obj) {
            return obj;
        }

        @Override // e3.AbstractC5367i
        protected Object e(Object obj) {
            return obj;
        }
    }

    /* renamed from: e3.i$e */
    private static final class e extends AbstractC5367i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        final AbstractC5367i f30388c;

        e(AbstractC5367i abstractC5367i) {
            this.f30388c = abstractC5367i;
        }

        @Override // e3.AbstractC5367i
        Object a(Object obj) {
            return this.f30388c.b(obj);
        }

        @Override // e3.AbstractC5367i
        Object b(Object obj) {
            return this.f30388c.a(obj);
        }

        @Override // e3.AbstractC5367i
        protected Object d(Object obj) {
            throw new AssertionError();
        }

        @Override // e3.AbstractC5367i
        protected Object e(Object obj) {
            throw new AssertionError();
        }

        @Override // e3.AbstractC5367i, e3.l
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f30388c.equals(((e) obj).f30388c);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f30388c.hashCode();
        }

        @Override // e3.AbstractC5367i
        public AbstractC5367i reverse() {
            return this.f30388c;
        }

        public String toString() {
            return this.f30388c + ".reverse()";
        }
    }

    protected AbstractC5367i() {
        this(true);
    }

    private Object f(Object obj) {
        return d(q.a(obj));
    }

    public static <A, B> AbstractC5367i from(l lVar, l lVar2) {
        return new c(lVar, lVar2, null);
    }

    private Object g(Object obj) {
        return e(q.a(obj));
    }

    public static <T> AbstractC5367i identity() {
        return d.f30387c;
    }

    Object a(Object obj) {
        if (!this.f30377a) {
            return f(obj);
        }
        if (obj == null) {
            return null;
        }
        return w.checkNotNull(d(obj));
    }

    public final <C> AbstractC5367i andThen(AbstractC5367i abstractC5367i) {
        return c(abstractC5367i);
    }

    @Override // e3.l
    @Deprecated
    public final Object apply(Object obj) {
        return convert(obj);
    }

    Object b(Object obj) {
        if (!this.f30377a) {
            return g(obj);
        }
        if (obj == null) {
            return null;
        }
        return w.checkNotNull(e(obj));
    }

    AbstractC5367i c(AbstractC5367i abstractC5367i) {
        return new b(this, (AbstractC5367i) w.checkNotNull(abstractC5367i));
    }

    public final Object convert(Object obj) {
        return b(obj);
    }

    public Iterable<Object> convertAll(Iterable<Object> iterable) {
        w.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    protected abstract Object d(Object obj);

    protected abstract Object e(Object obj);

    @Override // e3.l
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public AbstractC5367i reverse() {
        AbstractC5367i abstractC5367i = this.f30378b;
        if (abstractC5367i != null) {
            return abstractC5367i;
        }
        e eVar = new e(this);
        this.f30378b = eVar;
        return eVar;
    }

    AbstractC5367i(boolean z8) {
        this.f30377a = z8;
    }
}
