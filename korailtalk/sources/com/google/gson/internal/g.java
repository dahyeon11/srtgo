package com.google.gson.internal;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class g extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f26041i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f26042a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26043b;

    /* renamed from: c, reason: collision with root package name */
    e f26044c;

    /* renamed from: d, reason: collision with root package name */
    int f26045d;

    /* renamed from: e, reason: collision with root package name */
    int f26046e;

    /* renamed from: f, reason: collision with root package name */
    final e f26047f;

    /* renamed from: g, reason: collision with root package name */
    private b f26048g;

    /* renamed from: h, reason: collision with root package name */
    private c f26049h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Map.Entry<Object, Object> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f26045d;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f26063f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f26045d;
        }
    }

    private abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        e f26054a;

        /* renamed from: b, reason: collision with root package name */
        e f26055b = null;

        /* renamed from: c, reason: collision with root package name */
        int f26056c;

        d() {
            this.f26054a = g.this.f26047f.f26061d;
            this.f26056c = g.this.f26046e;
        }

        final e a() {
            e eVar = this.f26054a;
            g gVar = g.this;
            if (eVar == gVar.f26047f) {
                throw new NoSuchElementException();
            }
            if (gVar.f26046e != this.f26056c) {
                throw new ConcurrentModificationException();
            }
            this.f26054a = eVar.f26061d;
            this.f26055b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f26054a != g.this.f26047f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f26055b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.f(eVar, true);
            this.f26055b = null;
            this.f26056c = g.this.f26046e;
        }
    }

    public g() {
        this(f26041i, true);
    }

    private boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void e(e eVar, boolean z8) {
        while (eVar != null) {
            e eVar2 = eVar.f26059b;
            e eVar3 = eVar.f26060c;
            int i8 = eVar2 != null ? eVar2.f26066i : 0;
            int i9 = eVar3 != null ? eVar3.f26066i : 0;
            int i10 = i8 - i9;
            if (i10 == -2) {
                e eVar4 = eVar3.f26059b;
                e eVar5 = eVar3.f26060c;
                int i11 = (eVar4 != null ? eVar4.f26066i : 0) - (eVar5 != null ? eVar5.f26066i : 0);
                if (i11 == -1 || (i11 == 0 && !z8)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z8) {
                    return;
                }
            } else if (i10 == 2) {
                e eVar6 = eVar2.f26059b;
                e eVar7 = eVar2.f26060c;
                int i12 = (eVar6 != null ? eVar6.f26066i : 0) - (eVar7 != null ? eVar7.f26066i : 0);
                if (i12 == 1 || (i12 == 0 && !z8)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z8) {
                    return;
                }
            } else if (i10 == 0) {
                eVar.f26066i = i8 + 1;
                if (z8) {
                    return;
                }
            } else {
                eVar.f26066i = Math.max(i8, i9) + 1;
                if (!z8) {
                    return;
                }
            }
            eVar = eVar.f26058a;
        }
    }

    private void h(e eVar, e eVar2) {
        e eVar3 = eVar.f26058a;
        eVar.f26058a = null;
        if (eVar2 != null) {
            eVar2.f26058a = eVar3;
        }
        if (eVar3 == null) {
            this.f26044c = eVar2;
        } else if (eVar3.f26059b == eVar) {
            eVar3.f26059b = eVar2;
        } else {
            eVar3.f26060c = eVar2;
        }
    }

    private void i(e eVar) {
        e eVar2 = eVar.f26059b;
        e eVar3 = eVar.f26060c;
        e eVar4 = eVar3.f26059b;
        e eVar5 = eVar3.f26060c;
        eVar.f26060c = eVar4;
        if (eVar4 != null) {
            eVar4.f26058a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f26059b = eVar;
        eVar.f26058a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f26066i : 0, eVar4 != null ? eVar4.f26066i : 0) + 1;
        eVar.f26066i = iMax;
        eVar3.f26066i = Math.max(iMax, eVar5 != null ? eVar5.f26066i : 0) + 1;
    }

    private void j(e eVar) {
        e eVar2 = eVar.f26059b;
        e eVar3 = eVar.f26060c;
        e eVar4 = eVar2.f26059b;
        e eVar5 = eVar2.f26060c;
        eVar.f26059b = eVar5;
        if (eVar5 != null) {
            eVar5.f26058a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f26060c = eVar;
        eVar.f26058a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f26066i : 0, eVar5 != null ? eVar5.f26066i : 0) + 1;
        eVar.f26066i = iMax;
        eVar2.f26066i = Math.max(iMax, eVar4 != null ? eVar4.f26066i : 0) + 1;
    }

    e b(Object obj, boolean z8) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f26042a;
        e eVar2 = this.f26044c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f26041i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f26063f) : comparator.compare(obj, eVar2.f26063f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f26059b : eVar2.f26060c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z8) {
            return null;
        }
        e eVar4 = this.f26047f;
        if (eVar2 != null) {
            eVar = new e(this.f26043b, eVar2, obj, eVar4, eVar4.f26062e);
            if (iCompareTo < 0) {
                eVar2.f26059b = eVar;
            } else {
                eVar2.f26060c = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == f26041i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f26043b, eVar2, obj, eVar4, eVar4.f26062e);
            this.f26044c = eVar;
        }
        this.f26045d++;
        this.f26046e++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f26065h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f26044c = null;
        this.f26045d = 0;
        this.f26046e++;
        e eVar = this.f26047f;
        eVar.f26062e = eVar;
        eVar.f26061d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    e d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        b bVar = this.f26048g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f26048g = bVar2;
        return bVar2;
    }

    void f(e eVar, boolean z8) {
        int i8;
        if (z8) {
            e eVar2 = eVar.f26062e;
            eVar2.f26061d = eVar.f26061d;
            eVar.f26061d.f26062e = eVar2;
        }
        e eVar3 = eVar.f26059b;
        e eVar4 = eVar.f26060c;
        e eVar5 = eVar.f26058a;
        int i9 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f26059b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f26060c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f26045d--;
            this.f26046e++;
            return;
        }
        e eVarLast = eVar3.f26066i > eVar4.f26066i ? eVar3.last() : eVar4.first();
        f(eVarLast, false);
        e eVar6 = eVar.f26059b;
        if (eVar6 != null) {
            i8 = eVar6.f26066i;
            eVarLast.f26059b = eVar6;
            eVar6.f26058a = eVarLast;
            eVar.f26059b = null;
        } else {
            i8 = 0;
        }
        e eVar7 = eVar.f26060c;
        if (eVar7 != null) {
            i9 = eVar7.f26066i;
            eVarLast.f26060c = eVar7;
            eVar7.f26058a = eVarLast;
            eVar.f26060c = null;
        }
        eVarLast.f26066i = Math.max(i8, i9) + 1;
        h(eVar, eVarLast);
    }

    e g(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f26065h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        c cVar = this.f26049h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f26049h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f26043b) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.f26065h;
        eVarB.f26065h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f26065h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f26045d;
    }

    public g(boolean z8) {
        this(f26041i, z8);
    }

    public g(Comparator<Object> comparator, boolean z8) {
        this.f26045d = 0;
        this.f26046e = 0;
        this.f26042a = comparator == null ? f26041i : comparator;
        this.f26043b = z8;
        this.f26047f = new e(z8);
    }

    static final class e implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        e f26058a;

        /* renamed from: b, reason: collision with root package name */
        e f26059b;

        /* renamed from: c, reason: collision with root package name */
        e f26060c;

        /* renamed from: d, reason: collision with root package name */
        e f26061d;

        /* renamed from: e, reason: collision with root package name */
        e f26062e;

        /* renamed from: f, reason: collision with root package name */
        final Object f26063f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f26064g;

        /* renamed from: h, reason: collision with root package name */
        Object f26065h;

        /* renamed from: i, reason: collision with root package name */
        int f26066i;

        e(boolean z8) {
            this.f26063f = null;
            this.f26064g = z8;
            this.f26062e = this;
            this.f26061d = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f26063f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f26065h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public e first() {
            e eVar = this;
            for (e eVar2 = this.f26059b; eVar2 != null; eVar2 = eVar2.f26059b) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f26063f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f26065h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f26063f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f26065h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        public e last() {
            e eVar = this;
            for (e eVar2 = this.f26060c; eVar2 != null; eVar2 = eVar2.f26060c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f26064g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f26065h;
            this.f26065h = obj;
            return obj2;
        }

        public String toString() {
            return this.f26063f + SimpleComparison.EQUAL_TO_OPERATION + this.f26065h;
        }

        e(boolean z8, e eVar, Object obj, e eVar2, e eVar3) {
            this.f26058a = eVar;
            this.f26063f = obj;
            this.f26064g = z8;
            this.f26066i = 1;
            this.f26061d = eVar2;
            this.f26062e = eVar3;
            eVar3.f26061d = this;
            eVar2.f26062e = this;
        }
    }
}
