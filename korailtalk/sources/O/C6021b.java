package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6021b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    c f34357a;

    /* renamed from: b, reason: collision with root package name */
    private c f34358b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f34359c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f34360d = 0;

    /* renamed from: o.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.C6021b.e
        c a(c cVar) {
            return cVar.f34364d;
        }

        @Override // o.C6021b.e
        c b(c cVar) {
            return cVar.f34363c;
        }
    }

    /* renamed from: o.b$b, reason: collision with other inner class name */
    private static class C0356b extends e {
        C0356b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.C6021b.e
        c a(c cVar) {
            return cVar.f34363c;
        }

        @Override // o.C6021b.e
        c b(c cVar) {
            return cVar.f34364d;
        }
    }

    /* renamed from: o.b$c */
    static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        final Object f34361a;

        /* renamed from: b, reason: collision with root package name */
        final Object f34362b;

        /* renamed from: c, reason: collision with root package name */
        c f34363c;

        /* renamed from: d, reason: collision with root package name */
        c f34364d;

        c(Object obj, Object obj2) {
            this.f34361a = obj;
            this.f34362b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34361a.equals(cVar.f34361a) && this.f34362b.equals(cVar.f34362b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f34361a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f34362b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f34361a.hashCode() ^ this.f34362b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f34361a + SimpleComparison.EQUAL_TO_OPERATION + this.f34362b;
        }
    }

    /* renamed from: o.b$d */
    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private c f34365a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34366b = true;

        d() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34366b) {
                return C6021b.this.f34357a != null;
            }
            c cVar = this.f34365a;
            return (cVar == null || cVar.f34363c == null) ? false : true;
        }

        @Override // o.C6021b.f
        void supportRemove(c cVar) {
            c cVar2 = this.f34365a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f34364d;
                this.f34365a = cVar3;
                this.f34366b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            if (this.f34366b) {
                this.f34366b = false;
                this.f34365a = C6021b.this.f34357a;
            } else {
                c cVar = this.f34365a;
                this.f34365a = cVar != null ? cVar.f34363c : null;
            }
            return this.f34365a;
        }
    }

    /* renamed from: o.b$e */
    private static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        c f34368a;

        /* renamed from: b, reason: collision with root package name */
        c f34369b;

        e(c cVar, c cVar2) {
            this.f34368a = cVar2;
            this.f34369b = cVar;
        }

        private c c() {
            c cVar = this.f34369b;
            c cVar2 = this.f34368a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return b(cVar);
        }

        abstract c a(c cVar);

        abstract c b(c cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34369b != null;
        }

        @Override // o.C6021b.f
        public void supportRemove(c cVar) {
            if (this.f34368a == cVar && cVar == this.f34369b) {
                this.f34369b = null;
                this.f34368a = null;
            }
            c cVar2 = this.f34368a;
            if (cVar2 == cVar) {
                this.f34368a = a(cVar2);
            }
            if (this.f34369b == cVar) {
                this.f34369b = c();
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            c cVar = this.f34369b;
            this.f34369b = c();
            return cVar;
        }
    }

    /* renamed from: o.b$f */
    public static abstract class f {
        abstract void supportRemove(c cVar);
    }

    protected c a(Object obj) {
        c cVar = this.f34357a;
        while (cVar != null && !cVar.f34361a.equals(obj)) {
            cVar = cVar.f34363c;
        }
        return cVar;
    }

    c b(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f34360d++;
        c cVar2 = this.f34358b;
        if (cVar2 == null) {
            this.f34357a = cVar;
            this.f34358b = cVar;
            return cVar;
        }
        cVar2.f34363c = cVar;
        cVar.f34364d = cVar2;
        this.f34358b = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<Object, Object>> descendingIterator() {
        C0356b c0356b = new C0356b(this.f34358b, this.f34357a);
        this.f34359c.put(c0356b, Boolean.FALSE);
        return c0356b;
    }

    public Map.Entry<Object, Object> eldest() {
        return this.f34357a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6021b)) {
            return false;
        }
        C6021b c6021b = (C6021b) obj;
        if (size() != c6021b.size()) {
            return false;
        }
        Iterator<Map.Entry<Object, Object>> it = iterator();
        Iterator<Map.Entry<Object, Object>> it2 = c6021b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            Map.Entry<Object, Object> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<Object, Object>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<Object, Object>> iterator() {
        a aVar = new a(this.f34357a, this.f34358b);
        this.f34359c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public o.b.d iteratorWithAdditions() {
        d dVar = new d();
        this.f34359c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<Object, Object> newest() {
        return this.f34358b;
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f34362b;
        }
        b(obj, obj2);
        return null;
    }

    public Object remove(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f34360d--;
        if (!this.f34359c.isEmpty()) {
            Iterator it = this.f34359c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).supportRemove(cVarA);
            }
        }
        c cVar = cVarA.f34364d;
        if (cVar != null) {
            cVar.f34363c = cVarA.f34363c;
        } else {
            this.f34357a = cVarA.f34363c;
        }
        c cVar2 = cVarA.f34363c;
        if (cVar2 != null) {
            cVar2.f34364d = cVar;
        } else {
            this.f34358b = cVar;
        }
        cVarA.f34363c = null;
        cVarA.f34364d = null;
        return cVarA.f34362b;
    }

    public int size() {
        return this.f34360d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<Object, Object>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
