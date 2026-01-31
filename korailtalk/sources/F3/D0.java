package f3;

import j3.AbstractC5820b;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
class D0 extends AbstractMap implements ConcurrentMap, Serializable {

    /* renamed from: j, reason: collision with root package name */
    static final A f30621j = new C5412a();

    /* renamed from: a, reason: collision with root package name */
    final transient int f30622a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f30623b;

    /* renamed from: c, reason: collision with root package name */
    final transient m[] f30624c;

    /* renamed from: d, reason: collision with root package name */
    final int f30625d;

    /* renamed from: e, reason: collision with root package name */
    final e3.j f30626e;

    /* renamed from: f, reason: collision with root package name */
    final transient i f30627f;

    /* renamed from: g, reason: collision with root package name */
    transient Set f30628g;

    /* renamed from: h, reason: collision with root package name */
    transient Collection f30629h;

    /* renamed from: i, reason: collision with root package name */
    transient Set f30630i;

    interface A {
        void clear();

        A copyFor(ReferenceQueue<Object> referenceQueue, h hVar);

        Object get();

        h getEntry();
    }

    static final class B extends WeakReference implements A {

        /* renamed from: a, reason: collision with root package name */
        final h f30631a;

        B(ReferenceQueue referenceQueue, Object obj, h hVar) {
            super(obj, referenceQueue);
            this.f30631a = hVar;
        }

        @Override // f3.D0.A
        public A copyFor(ReferenceQueue<Object> referenceQueue, h hVar) {
            return new B(referenceQueue, get(), hVar);
        }

        @Override // f3.D0.A
        public h getEntry() {
            return this.f30631a;
        }
    }

    final class C extends AbstractC5460f {

        /* renamed from: a, reason: collision with root package name */
        final Object f30632a;

        /* renamed from: b, reason: collision with root package name */
        Object f30633b;

        C(Object obj, Object obj2) {
            this.f30632a = obj;
            this.f30633b = obj2;
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f30632a.equals(entry.getKey()) && this.f30633b.equals(entry.getValue());
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getKey() {
            return this.f30632a;
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getValue() {
            return this.f30633b;
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public int hashCode() {
            return this.f30632a.hashCode() ^ this.f30633b.hashCode();
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object objPut = D0.this.put(this.f30632a, obj);
            this.f30633b = obj;
            return objPut;
        }
    }

    /* renamed from: f3.D0$a, reason: case insensitive filesystem */
    class C5412a implements A {
        C5412a() {
        }

        @Override // f3.D0.A
        public /* bridge */ /* synthetic */ A copyFor(ReferenceQueue referenceQueue, h hVar) {
            android.support.v4.media.session.f.a(hVar);
            return copyFor((ReferenceQueue<Object>) referenceQueue, (d) null);
        }

        @Override // f3.D0.A
        public Object get() {
            return null;
        }

        @Override // f3.D0.A
        public /* bridge */ /* synthetic */ h getEntry() {
            getEntry();
            return null;
        }

        public A copyFor(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // f3.D0.A
        public d getEntry() {
            return null;
        }

        @Override // f3.D0.A
        public void clear() {
        }
    }

    /* renamed from: f3.D0$b, reason: case insensitive filesystem */
    static abstract class AbstractC5413b implements h {

        /* renamed from: a, reason: collision with root package name */
        final Object f30635a;

        /* renamed from: b, reason: collision with root package name */
        final int f30636b;

        AbstractC5413b(Object obj, int i8) {
            this.f30635a = obj;
            this.f30636b = i8;
        }

        @Override // f3.D0.h
        public final int getHash() {
            return this.f30636b;
        }

        @Override // f3.D0.h
        public final Object getKey() {
            return this.f30635a;
        }

        @Override // f3.D0.h
        public h getNext() {
            return null;
        }

        @Override // f3.D0.h
        public abstract /* synthetic */ Object getValue();
    }

    /* renamed from: f3.D0$c, reason: case insensitive filesystem */
    static abstract class AbstractC5414c extends WeakReference implements h {

        /* renamed from: a, reason: collision with root package name */
        final int f30637a;

        AbstractC5414c(ReferenceQueue referenceQueue, Object obj, int i8) {
            super(obj, referenceQueue);
            this.f30637a = i8;
        }

        @Override // f3.D0.h
        public final int getHash() {
            return this.f30637a;
        }

        @Override // f3.D0.h
        public final Object getKey() {
            return get();
        }

        @Override // f3.D0.h
        public h getNext() {
            return null;
        }

        @Override // f3.D0.h
        public abstract /* synthetic */ Object getValue();
    }

    static final class d implements h {
    }

    final class e extends g {
        e(D0 d02) {
            super();
        }

        @Override // f3.D0.g, java.util.Iterator
        public Map.Entry<Object, Object> next() {
            return c();
        }
    }

    final class f extends l {
        f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            D0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = D0.this.get(key)) != null && D0.this.m().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return D0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return new e(D0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && D0.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return D0.this.size();
        }
    }

    abstract class g implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f30639a;

        /* renamed from: b, reason: collision with root package name */
        int f30640b = -1;

        /* renamed from: c, reason: collision with root package name */
        m f30641c;

        /* renamed from: d, reason: collision with root package name */
        AtomicReferenceArray f30642d;

        /* renamed from: e, reason: collision with root package name */
        h f30643e;

        /* renamed from: f, reason: collision with root package name */
        C f30644f;

        /* renamed from: g, reason: collision with root package name */
        C f30645g;

        g() {
            this.f30639a = D0.this.f30624c.length - 1;
            a();
        }

        final void a() {
            this.f30644f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i8 = this.f30639a;
                if (i8 < 0) {
                    return;
                }
                m[] mVarArr = D0.this.f30624c;
                this.f30639a = i8 - 1;
                m mVar = mVarArr[i8];
                this.f30641c = mVar;
                if (mVar.f30649b != 0) {
                    this.f30642d = this.f30641c.f30652e;
                    this.f30640b = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(h hVar) {
            try {
                Object key = hVar.getKey();
                Object objD = D0.this.d(hVar);
                if (objD == null) {
                    this.f30641c.r();
                    return false;
                }
                this.f30644f = D0.this.new C(key, objD);
                this.f30641c.r();
                return true;
            } catch (Throwable th) {
                this.f30641c.r();
                throw th;
            }
        }

        C c() {
            C c9 = this.f30644f;
            if (c9 == null) {
                throw new NoSuchElementException();
            }
            this.f30645g = c9;
            a();
            return this.f30645g;
        }

        boolean d() {
            h hVar = this.f30643e;
            if (hVar == null) {
                return false;
            }
            while (true) {
                this.f30643e = hVar.getNext();
                h hVar2 = this.f30643e;
                if (hVar2 == null) {
                    return false;
                }
                if (b(hVar2)) {
                    return true;
                }
                hVar = this.f30643e;
            }
        }

        boolean e() {
            while (true) {
                int i8 = this.f30640b;
                if (i8 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.f30642d;
                this.f30640b = i8 - 1;
                h hVar = (h) atomicReferenceArray.get(i8);
                this.f30643e = hVar;
                if (hVar != null && (b(hVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30644f != null;
        }

        @Override // java.util.Iterator
        public abstract Object next();

        @Override // java.util.Iterator
        public void remove() {
            AbstractC5484r.d(this.f30645g != null);
            D0.this.remove(this.f30645g.getKey());
            this.f30645g = null;
        }
    }

    interface h {
        int getHash();

        Object getKey();

        h getNext();

        Object getValue();
    }

    interface i {
        h copy(m mVar, h hVar, h hVar2);

        n keyStrength();

        h newEntry(m mVar, Object obj, int i8, h hVar);

        m newSegment(D0 d02, int i8);

        void setValue(m mVar, h hVar, Object obj);

        n valueStrength();
    }

    final class j extends g {
        j(D0 d02) {
            super();
        }

        @Override // f3.D0.g, java.util.Iterator
        public Object next() {
            return c().getKey();
        }
    }

    final class k extends l {
        k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            D0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return D0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return D0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return new j(D0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return D0.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return D0.this.size();
        }
    }

    private static abstract class l extends AbstractSet {
        private l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return D0.k(this).toArray();
        }

        /* synthetic */ l(C5412a c5412a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) D0.k(this).toArray(tArr);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class n {
        public static final n STRONG = new a("STRONG", 0);
        public static final n WEAK = new b("WEAK", 1);

        /* renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ n[] f30654a = a();

        enum a extends n {
            a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // f3.D0.n
            e3.j b() {
                return e3.j.equals();
            }
        }

        enum b extends n {
            b(String str, int i8) {
                super(str, i8, null);
            }

            @Override // f3.D0.n
            e3.j b() {
                return e3.j.identity();
            }
        }

        private n(String str, int i8) {
        }

        private static /* synthetic */ n[] a() {
            return new n[]{STRONG, WEAK};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f30654a.clone();
        }

        abstract e3.j b();

        /* synthetic */ n(String str, int i8, C5412a c5412a) {
            this(str, i8);
        }
    }

    static class o extends AbstractC5413b implements s {

        /* renamed from: c, reason: collision with root package name */
        private volatile Object f30655c;

        static final class a implements i {

            /* renamed from: a, reason: collision with root package name */
            private static final a f30656a = new a();

            a() {
            }

            static a a() {
                return f30656a;
            }

            @Override // f3.D0.i
            public n keyStrength() {
                return n.STRONG;
            }

            @Override // f3.D0.i
            public n valueStrength() {
                return n.STRONG;
            }

            @Override // f3.D0.i
            public o copy(p pVar, o oVar, o oVar2) {
                o oVarNewEntry = newEntry(pVar, oVar.f30635a, oVar.f30636b, oVar2);
                oVarNewEntry.f30655c = oVar.f30655c;
                return oVarNewEntry;
            }

            @Override // f3.D0.i
            public o newEntry(p pVar, Object obj, int i8, o oVar) {
                return oVar == null ? new o(obj, i8, null) : new b(obj, i8, oVar);
            }

            @Override // f3.D0.i
            public p newSegment(D0 d02, int i8) {
                return new p(d02, i8);
            }

            @Override // f3.D0.i
            public void setValue(p pVar, o oVar, Object obj) {
                oVar.f30655c = obj;
            }
        }

        private static final class b extends o {

            /* renamed from: d, reason: collision with root package name */
            private final o f30657d;

            b(Object obj, int i8, o oVar) {
                super(obj, i8, null);
                this.f30657d = oVar;
            }

            @Override // f3.D0.AbstractC5413b, f3.D0.h
            public o getNext() {
                return this.f30657d;
            }
        }

        /* synthetic */ o(Object obj, int i8, C5412a c5412a) {
            this(obj, i8);
        }

        @Override // f3.D0.AbstractC5413b, f3.D0.h
        public final Object getValue() {
            return this.f30655c;
        }

        private o(Object obj, int i8) {
            super(obj, i8);
            this.f30655c = null;
        }
    }

    static final class p extends m {
        p(D0 d02, int i8) {
            super(d02, i8);
        }

        public o castForTesting(h hVar) {
            return (o) hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.D0.m
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public p D() {
            return this;
        }
    }

    static class q extends AbstractC5413b implements z {

        /* renamed from: c, reason: collision with root package name */
        private volatile A f30658c;

        static final class a implements i {

            /* renamed from: a, reason: collision with root package name */
            private static final a f30659a = new a();

            a() {
            }

            static a a() {
                return f30659a;
            }

            @Override // f3.D0.i
            public n keyStrength() {
                return n.STRONG;
            }

            @Override // f3.D0.i
            public n valueStrength() {
                return n.WEAK;
            }

            @Override // f3.D0.i
            public q copy(r rVar, q qVar, q qVar2) {
                if (m.n(qVar)) {
                    return null;
                }
                q qVarNewEntry = newEntry(rVar, qVar.f30635a, qVar.f30636b, qVar2);
                qVarNewEntry.f30658c = qVar.f30658c.copyFor(rVar.f30661g, qVarNewEntry);
                return qVarNewEntry;
            }

            @Override // f3.D0.i
            public q newEntry(r rVar, Object obj, int i8, q qVar) {
                return qVar == null ? new q(obj, i8, null) : new b(obj, i8, qVar);
            }

            @Override // f3.D0.i
            public r newSegment(D0 d02, int i8) {
                return new r(d02, i8);
            }

            @Override // f3.D0.i
            public void setValue(r rVar, q qVar, Object obj) {
                A a9 = qVar.f30658c;
                qVar.f30658c = new B(rVar.f30661g, obj, qVar);
                a9.clear();
            }
        }

        private static final class b extends q {

            /* renamed from: d, reason: collision with root package name */
            private final q f30660d;

            b(Object obj, int i8, q qVar) {
                super(obj, i8, null);
                this.f30660d = qVar;
            }

            @Override // f3.D0.AbstractC5413b, f3.D0.h
            public q getNext() {
                return this.f30660d;
            }
        }

        /* synthetic */ q(Object obj, int i8, C5412a c5412a) {
            this(obj, i8);
        }

        @Override // f3.D0.AbstractC5413b, f3.D0.h
        public final Object getValue() {
            return this.f30658c.get();
        }

        @Override // f3.D0.z
        public final A getValueReference() {
            return this.f30658c;
        }

        private q(Object obj, int i8) {
            super(obj, i8);
            this.f30658c = D0.l();
        }
    }

    static final class r extends m {

        /* renamed from: g, reason: collision with root package name */
        private final ReferenceQueue f30661g;

        r(D0 d02, int i8) {
            super(d02, i8);
            this.f30661g = new ReferenceQueue();
        }

        public A getWeakValueReferenceForTesting(h hVar) {
            return castForTesting(hVar).getValueReference();
        }

        public A newWeakValueReferenceForTesting(h hVar, Object obj) {
            return new B(this.f30661g, obj, castForTesting(hVar));
        }

        @Override // f3.D0.m
        void o() {
            b(this.f30661g);
        }

        @Override // f3.D0.m
        void p() {
            f(this.f30661g);
        }

        public void setWeakValueReferenceForTesting(h hVar, A a9) {
            q qVarCastForTesting = castForTesting(hVar);
            A a10 = qVarCastForTesting.f30658c;
            qVarCastForTesting.f30658c = a9;
            a10.clear();
        }

        public q castForTesting(h hVar) {
            return (q) hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.D0.m
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public r D() {
            return this;
        }
    }

    interface s extends h {
        @Override // f3.D0.h
        /* synthetic */ int getHash();

        @Override // f3.D0.h
        /* synthetic */ Object getKey();

        @Override // f3.D0.h
        /* synthetic */ h getNext();

        @Override // f3.D0.h
        /* synthetic */ Object getValue();
    }

    final class t extends g {
        t(D0 d02) {
            super();
        }

        @Override // f3.D0.g, java.util.Iterator
        public Object next() {
            return c().getValue();
        }
    }

    final class u extends AbstractCollection {
        u() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            D0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return D0.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return D0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new t(D0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return D0.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return D0.k(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) D0.k(this).toArray(tArr);
        }
    }

    static class v extends AbstractC5414c implements s {

        /* renamed from: b, reason: collision with root package name */
        private volatile Object f30663b;

        static final class a implements i {

            /* renamed from: a, reason: collision with root package name */
            private static final a f30664a = new a();

            a() {
            }

            static a a() {
                return f30664a;
            }

            @Override // f3.D0.i
            public n keyStrength() {
                return n.WEAK;
            }

            @Override // f3.D0.i
            public n valueStrength() {
                return n.STRONG;
            }

            @Override // f3.D0.i
            public v copy(w wVar, v vVar, v vVar2) {
                Object key = vVar.getKey();
                if (key == null) {
                    return null;
                }
                v vVarNewEntry = newEntry(wVar, key, vVar.f30637a, vVar2);
                vVarNewEntry.f30663b = vVar.f30663b;
                return vVarNewEntry;
            }

            @Override // f3.D0.i
            public v newEntry(w wVar, Object obj, int i8, v vVar) {
                return vVar == null ? new v(wVar.f30666g, obj, i8, null) : new b(wVar.f30666g, obj, i8, vVar, null);
            }

            @Override // f3.D0.i
            public w newSegment(D0 d02, int i8) {
                return new w(d02, i8);
            }

            @Override // f3.D0.i
            public void setValue(w wVar, v vVar, Object obj) {
                vVar.f30663b = obj;
            }
        }

        private static final class b extends v {

            /* renamed from: c, reason: collision with root package name */
            private final v f30665c;

            /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i8, v vVar, C5412a c5412a) {
                this(referenceQueue, obj, i8, vVar);
            }

            private b(ReferenceQueue referenceQueue, Object obj, int i8, v vVar) {
                super(referenceQueue, obj, i8, null);
                this.f30665c = vVar;
            }

            @Override // f3.D0.AbstractC5414c, f3.D0.h
            public v getNext() {
                return this.f30665c;
            }
        }

        /* synthetic */ v(ReferenceQueue referenceQueue, Object obj, int i8, C5412a c5412a) {
            this(referenceQueue, obj, i8);
        }

        @Override // f3.D0.AbstractC5414c, f3.D0.h
        public final Object getValue() {
            return this.f30663b;
        }

        private v(ReferenceQueue referenceQueue, Object obj, int i8) {
            super(referenceQueue, obj, i8);
            this.f30663b = null;
        }
    }

    static final class w extends m {

        /* renamed from: g, reason: collision with root package name */
        private final ReferenceQueue f30666g;

        w(D0 d02, int i8) {
            super(d02, i8);
            this.f30666g = new ReferenceQueue();
        }

        @Override // f3.D0.m
        void o() {
            b(this.f30666g);
        }

        @Override // f3.D0.m
        void p() {
            e(this.f30666g);
        }

        public v castForTesting(h hVar) {
            return (v) hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.D0.m
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public w D() {
            return this;
        }
    }

    static class x extends AbstractC5414c implements z {

        /* renamed from: b, reason: collision with root package name */
        private volatile A f30667b;

        static final class a implements i {

            /* renamed from: a, reason: collision with root package name */
            private static final a f30668a = new a();

            a() {
            }

            static a a() {
                return f30668a;
            }

            @Override // f3.D0.i
            public n keyStrength() {
                return n.WEAK;
            }

            @Override // f3.D0.i
            public n valueStrength() {
                return n.WEAK;
            }

            @Override // f3.D0.i
            public x copy(y yVar, x xVar, x xVar2) {
                Object key = xVar.getKey();
                if (key == null || m.n(xVar)) {
                    return null;
                }
                x xVarNewEntry = newEntry(yVar, key, xVar.f30637a, xVar2);
                xVarNewEntry.f30667b = xVar.f30667b.copyFor(yVar.f30671h, xVarNewEntry);
                return xVarNewEntry;
            }

            @Override // f3.D0.i
            public x newEntry(y yVar, Object obj, int i8, x xVar) {
                return xVar == null ? new x(yVar.f30670g, obj, i8) : new b(yVar.f30670g, obj, i8, xVar);
            }

            @Override // f3.D0.i
            public y newSegment(D0 d02, int i8) {
                return new y(d02, i8);
            }

            @Override // f3.D0.i
            public void setValue(y yVar, x xVar, Object obj) {
                A a9 = xVar.f30667b;
                xVar.f30667b = new B(yVar.f30671h, obj, xVar);
                a9.clear();
            }
        }

        private static final class b extends x {

            /* renamed from: c, reason: collision with root package name */
            private final x f30669c;

            b(ReferenceQueue referenceQueue, Object obj, int i8, x xVar) {
                super(referenceQueue, obj, i8);
                this.f30669c = xVar;
            }

            @Override // f3.D0.AbstractC5414c, f3.D0.h
            public x getNext() {
                return this.f30669c;
            }
        }

        x(ReferenceQueue referenceQueue, Object obj, int i8) {
            super(referenceQueue, obj, i8);
            this.f30667b = D0.l();
        }

        @Override // f3.D0.AbstractC5414c, f3.D0.h
        public final Object getValue() {
            return this.f30667b.get();
        }

        @Override // f3.D0.z
        public final A getValueReference() {
            return this.f30667b;
        }
    }

    static final class y extends m {

        /* renamed from: g, reason: collision with root package name */
        private final ReferenceQueue f30670g;

        /* renamed from: h, reason: collision with root package name */
        private final ReferenceQueue f30671h;

        y(D0 d02, int i8) {
            super(d02, i8);
            this.f30670g = new ReferenceQueue();
            this.f30671h = new ReferenceQueue();
        }

        public A getWeakValueReferenceForTesting(h hVar) {
            return castForTesting(hVar).getValueReference();
        }

        public A newWeakValueReferenceForTesting(h hVar, Object obj) {
            return new B(this.f30671h, obj, castForTesting(hVar));
        }

        @Override // f3.D0.m
        void o() {
            b(this.f30670g);
        }

        @Override // f3.D0.m
        void p() {
            e(this.f30670g);
            f(this.f30671h);
        }

        public void setWeakValueReferenceForTesting(h hVar, A a9) {
            x xVarCastForTesting = castForTesting(hVar);
            A a10 = xVarCastForTesting.f30667b;
            xVarCastForTesting.f30667b = a9;
            a10.clear();
        }

        public x castForTesting(h hVar) {
            return (x) hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.D0.m
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public y D() {
            return this;
        }
    }

    interface z extends h {
        @Override // f3.D0.h
        /* synthetic */ int getHash();

        @Override // f3.D0.h
        /* synthetic */ Object getKey();

        @Override // f3.D0.h
        /* synthetic */ h getNext();

        @Override // f3.D0.h
        /* synthetic */ Object getValue();

        A getValueReference();
    }

    private D0(C0 c02, i iVar) {
        this.f30625d = Math.min(c02.a(), 65536);
        this.f30626e = c02.c();
        this.f30627f = iVar;
        int iMin = Math.min(c02.b(), 1073741824);
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 < this.f30625d) {
            i10++;
            i11 <<= 1;
        }
        this.f30623b = 32 - i10;
        this.f30622a = i11 - 1;
        this.f30624c = f(i11);
        int i12 = iMin / i11;
        while (i9 < (i11 * i12 < iMin ? i12 + 1 : i12)) {
            i9 <<= 1;
        }
        while (true) {
            m[] mVarArr = this.f30624c;
            if (i8 >= mVarArr.length) {
                return;
            }
            mVarArr[i8] = c(i9);
            i8++;
        }
    }

    static D0 b(C0 c02) {
        n nVarD = c02.d();
        n nVar = n.STRONG;
        if (nVarD == nVar && c02.e() == nVar) {
            return new D0(c02, o.a.a());
        }
        if (c02.d() == nVar && c02.e() == n.WEAK) {
            return new D0(c02, q.a.a());
        }
        n nVarD2 = c02.d();
        n nVar2 = n.WEAK;
        if (nVarD2 == nVar2 && c02.e() == nVar) {
            return new D0(c02, v.a.a());
        }
        if (c02.d() == nVar2 && c02.e() == nVar2) {
            return new D0(c02, x.a.a());
        }
        throw new AssertionError();
    }

    static int i(int i8) {
        int i9 = i8 + ((i8 << 15) ^ (-12931));
        int i10 = i9 ^ (i9 >>> 10);
        int i11 = i10 + (i10 << 3);
        int i12 = i11 ^ (i11 >>> 6);
        int i13 = i12 + (i12 << 2) + (i12 << 14);
        return i13 ^ (i13 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        AbstractC5495w0.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    static A l() {
        return f30621j;
    }

    m c(int i8) {
        return this.f30627f.newSegment(this, i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (m mVar : this.f30624c) {
            mVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iE = e(obj);
        return j(iE).c(obj, iE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z8 = false;
        if (obj == null) {
            return false;
        }
        m[] mVarArr = this.f30624c;
        long j8 = -1;
        int i8 = 0;
        while (i8 < 3) {
            int length = mVarArr.length;
            long j9 = 0;
            for (?? r10 = z8; r10 < length; r10++) {
                m mVar = mVarArr[r10];
                int i9 = mVar.f30649b;
                ?? r12 = mVar.f30652e;
                for (?? r13 = z8; r13 < r12.length(); r13++) {
                    for (h next = (h) r12.get(r13); next != null; next = next.getNext()) {
                        Object objL = mVar.l(next);
                        if (objL != null && m().equivalent(obj, objL)) {
                            return true;
                        }
                    }
                }
                j9 += mVar.f30650c;
                z8 = false;
            }
            if (j9 == j8) {
                return false;
            }
            i8++;
            j8 = j9;
            z8 = false;
        }
        return z8;
    }

    Object d(h hVar) {
        if (hVar.getKey() == null) {
            return null;
        }
        return hVar.getValue();
    }

    int e(Object obj) {
        return i(this.f30626e.hash(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        Set<Map.Entry<Object, Object>> set = this.f30630i;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f30630i = fVar;
        return fVar;
    }

    final m[] f(int i8) {
        return new m[i8];
    }

    void g(h hVar) {
        int hash = hVar.getHash();
        j(hash).u(hVar, hash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iE = e(obj);
        return j(iE).h(obj, iE);
    }

    void h(A a9) {
        h entry = a9.getEntry();
        int hash = entry.getHash();
        j(hash).v(entry.getKey(), hash, a9);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        m[] mVarArr = this.f30624c;
        long j8 = 0;
        for (int i8 = 0; i8 < mVarArr.length; i8++) {
            if (mVarArr[i8].f30649b != 0) {
                return false;
            }
            j8 += mVarArr[i8].f30650c;
        }
        if (j8 == 0) {
            return true;
        }
        for (int i9 = 0; i9 < mVarArr.length; i9++) {
            if (mVarArr[i9].f30649b != 0) {
                return false;
            }
            j8 -= mVarArr[i9].f30650c;
        }
        return j8 == 0;
    }

    m j(int i8) {
        return this.f30624c[(i8 >>> this.f30623b) & this.f30622a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        Set<Object> set = this.f30628g;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f30628g = kVar;
        return kVar;
    }

    e3.j m() {
        return this.f30627f.valueStrength().b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        e3.w.checkNotNull(obj);
        e3.w.checkNotNull(obj2);
        int iE = e(obj);
        return j(iE).t(obj, iE, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        e3.w.checkNotNull(obj);
        e3.w.checkNotNull(obj2);
        int iE = e(obj);
        return j(iE).t(obj, iE, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iE = e(obj);
        return j(iE).w(obj, iE);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        e3.w.checkNotNull(obj);
        e3.w.checkNotNull(obj3);
        if (obj2 == null) {
            return false;
        }
        int iE = e(obj);
        return j(iE).A(obj, iE, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j8 = 0;
        for (int i8 = 0; i8 < this.f30624c.length; i8++) {
            j8 += r0[i8].f30649b;
        }
        return AbstractC5820b.saturatedCast(j8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        Collection<Object> collection = this.f30629h;
        if (collection != null) {
            return collection;
        }
        u uVar = new u();
        this.f30629h = uVar;
        return uVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iE = e(obj);
        return j(iE).x(obj, iE, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        e3.w.checkNotNull(obj);
        e3.w.checkNotNull(obj2);
        int iE = e(obj);
        return j(iE).z(obj, iE, obj2);
    }

    static abstract class m extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        final D0 f30648a;

        /* renamed from: b, reason: collision with root package name */
        volatile int f30649b;

        /* renamed from: c, reason: collision with root package name */
        int f30650c;

        /* renamed from: d, reason: collision with root package name */
        int f30651d;

        /* renamed from: e, reason: collision with root package name */
        volatile AtomicReferenceArray f30652e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f30653f = new AtomicInteger();

        m(D0 d02, int i8) {
            this.f30648a = d02;
            m(q(i8));
        }

        static boolean n(h hVar) {
            return hVar.getValue() == null;
        }

        boolean A(Object obj, int i8, Object obj2, Object obj3) {
            lock();
            try {
                s();
                AtomicReferenceArray atomicReferenceArray = this.f30652e;
                int length = (atomicReferenceArray.length() - 1) & i8;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h next = hVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i8 && key != null && this.f30648a.f30626e.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.f30648a.m().equivalent(obj2, value)) {
                                return false;
                            }
                            this.f30650c++;
                            E(next, obj3);
                            return true;
                        }
                        if (n(next)) {
                            this.f30650c++;
                            h hVarY = y(hVar, next);
                            int i9 = this.f30649b - 1;
                            atomicReferenceArray.set(length, hVarY);
                            this.f30649b = i9;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void B() {
            C();
        }

        void C() {
            if (tryLock()) {
                try {
                    p();
                    this.f30653f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract m D();

        void E(h hVar, Object obj) {
            this.f30648a.f30627f.setValue(D(), hVar, obj);
        }

        void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        void a() {
            if (this.f30649b != 0) {
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = this.f30652e;
                    for (int i8 = 0; i8 < atomicReferenceArray.length(); i8++) {
                        atomicReferenceArray.set(i8, null);
                    }
                    o();
                    this.f30653f.set(0);
                    this.f30650c++;
                    this.f30649b = 0;
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }

        void b(ReferenceQueue referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        boolean c(Object obj, int i8) {
            try {
                boolean z8 = false;
                if (this.f30649b == 0) {
                    return false;
                }
                h hVarK = k(obj, i8);
                if (hVarK != null) {
                    if (hVarK.getValue() != null) {
                        z8 = true;
                    }
                }
                return z8;
            } finally {
                r();
            }
        }

        h d(h hVar, h hVar2) {
            return this.f30648a.f30627f.copy(D(), hVar, hVar2);
        }

        void e(ReferenceQueue referenceQueue) {
            int i8 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                this.f30648a.g((h) objPoll);
                i8++;
            } while (i8 != 16);
        }

        void f(ReferenceQueue referenceQueue) {
            int i8 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                this.f30648a.h((A) objPoll);
                i8++;
            } while (i8 != 16);
        }

        void g() {
            AtomicReferenceArray atomicReferenceArray = this.f30652e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i8 = this.f30649b;
            AtomicReferenceArray atomicReferenceArrayQ = q(length << 1);
            this.f30651d = (atomicReferenceArrayQ.length() * 3) / 4;
            int length2 = atomicReferenceArrayQ.length() - 1;
            for (int i9 = 0; i9 < length; i9++) {
                h next = (h) atomicReferenceArray.get(i9);
                if (next != null) {
                    h next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayQ.set(hash, next);
                    } else {
                        h hVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                hVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayQ.set(hash, hVar);
                        while (next != hVar) {
                            int hash3 = next.getHash() & length2;
                            h hVarD = d(next, (h) atomicReferenceArrayQ.get(hash3));
                            if (hVarD != null) {
                                atomicReferenceArrayQ.set(hash3, hVarD);
                            } else {
                                i8--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f30652e = atomicReferenceArrayQ;
            this.f30649b = i8;
        }

        Object h(Object obj, int i8) {
            try {
                h hVarK = k(obj, i8);
                if (hVarK == null) {
                    r();
                    return null;
                }
                Object value = hVarK.getValue();
                if (value == null) {
                    F();
                }
                return value;
            } finally {
                r();
            }
        }

        h i(Object obj, int i8) {
            if (this.f30649b == 0) {
                return null;
            }
            for (h hVarJ = j(i8); hVarJ != null; hVarJ = hVarJ.getNext()) {
                if (hVarJ.getHash() == i8) {
                    Object key = hVarJ.getKey();
                    if (key == null) {
                        F();
                    } else if (this.f30648a.f30626e.equivalent(obj, key)) {
                        return hVarJ;
                    }
                }
            }
            return null;
        }

        h j(int i8) {
            return (h) this.f30652e.get(i8 & (r0.length() - 1));
        }

        h k(Object obj, int i8) {
            return i(obj, i8);
        }

        Object l(h hVar) {
            if (hVar.getKey() == null) {
                F();
                return null;
            }
            Object value = hVar.getValue();
            if (value != null) {
                return value;
            }
            F();
            return null;
        }

        void m(AtomicReferenceArray atomicReferenceArray) {
            this.f30651d = (atomicReferenceArray.length() * 3) / 4;
            this.f30652e = atomicReferenceArray;
        }

        AtomicReferenceArray q(int i8) {
            return new AtomicReferenceArray(i8);
        }

        void r() {
            if ((this.f30653f.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        void s() {
            C();
        }

        Object t(Object obj, int i8, Object obj2, boolean z8) {
            lock();
            try {
                s();
                int i9 = this.f30649b + 1;
                if (i9 > this.f30651d) {
                    g();
                    i9 = this.f30649b + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f30652e;
                int length = (atomicReferenceArray.length() - 1) & i8;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h next = hVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i8 && key != null && this.f30648a.f30626e.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value == null) {
                            this.f30650c++;
                            E(next, obj2);
                            this.f30649b = this.f30649b;
                            unlock();
                            return null;
                        }
                        if (z8) {
                            unlock();
                            return value;
                        }
                        this.f30650c++;
                        E(next, obj2);
                        unlock();
                        return value;
                    }
                }
                this.f30650c++;
                h hVarNewEntry = this.f30648a.f30627f.newEntry(D(), obj, i8, hVar);
                E(hVarNewEntry, obj2);
                atomicReferenceArray.set(length, hVarNewEntry);
                this.f30649b = i9;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        boolean u(h hVar, int i8) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f30652e;
                int length = i8 & (atomicReferenceArray.length() - 1);
                h hVar2 = (h) atomicReferenceArray.get(length);
                for (h next = hVar2; next != null; next = next.getNext()) {
                    if (next == hVar) {
                        this.f30650c++;
                        h hVarY = y(hVar2, next);
                        int i9 = this.f30649b - 1;
                        atomicReferenceArray.set(length, hVarY);
                        this.f30649b = i9;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        boolean v(Object obj, int i8, A a9) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f30652e;
                int length = (atomicReferenceArray.length() - 1) & i8;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h next = hVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i8 && key != null && this.f30648a.f30626e.equivalent(obj, key)) {
                        if (((z) next).getValueReference() != a9) {
                            return false;
                        }
                        this.f30650c++;
                        h hVarY = y(hVar, next);
                        int i9 = this.f30649b - 1;
                        atomicReferenceArray.set(length, hVarY);
                        this.f30649b = i9;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        Object w(Object obj, int i8) {
            lock();
            try {
                s();
                AtomicReferenceArray atomicReferenceArray = this.f30652e;
                int length = (atomicReferenceArray.length() - 1) & i8;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h next = hVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i8 && key != null && this.f30648a.f30626e.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value == null && !n(next)) {
                            return null;
                        }
                        this.f30650c++;
                        h hVarY = y(hVar, next);
                        int i9 = this.f30649b - 1;
                        atomicReferenceArray.set(length, hVarY);
                        this.f30649b = i9;
                        return value;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f30648a.m().equivalent(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (n(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f30650c++;
            r9 = y(r3, r4);
            r10 = r8.f30649b - 1;
            r0.set(r1, r9);
            r8.f30649b = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean x(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.s()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r8.f30652e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                f3.D0$h r3 = (f3.D0.h) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                f3.D0 r7 = r8.f30648a     // Catch: java.lang.Throwable -> L5c
                e3.j r7 = r7.f30626e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                f3.D0 r10 = r8.f30648a     // Catch: java.lang.Throwable -> L5c
                e3.j r10 = r10.m()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f30650c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f30650c = r9     // Catch: java.lang.Throwable -> L5c
                f3.D0$h r9 = r8.y(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f30649b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f30649b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                f3.D0$h r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.D0.m.x(java.lang.Object, int, java.lang.Object):boolean");
        }

        h y(h hVar, h hVar2) {
            int i8 = this.f30649b;
            h next = hVar2.getNext();
            while (hVar != hVar2) {
                h hVarD = d(hVar, next);
                if (hVarD != null) {
                    next = hVarD;
                } else {
                    i8--;
                }
                hVar = hVar.getNext();
            }
            this.f30649b = i8;
            return next;
        }

        Object z(Object obj, int i8, Object obj2) {
            lock();
            try {
                s();
                AtomicReferenceArray atomicReferenceArray = this.f30652e;
                int length = (atomicReferenceArray.length() - 1) & i8;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h next = hVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i8 && key != null && this.f30648a.f30626e.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            this.f30650c++;
                            E(next, obj2);
                            return value;
                        }
                        if (n(next)) {
                            this.f30650c++;
                            h hVarY = y(hVar, next);
                            int i9 = this.f30649b - 1;
                            atomicReferenceArray.set(length, hVarY);
                            this.f30649b = i9;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        void o() {
        }

        void p() {
        }
    }
}
