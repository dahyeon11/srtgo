package f3;

import f3.K0;
import f3.L0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: f3.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5464h extends AbstractCollection implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f30941a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set f30942b;

    /* renamed from: f3.h$a */
    class a extends L0.g {
        a() {
        }

        @Override // f3.L0.g
        K0 a() {
            return AbstractC5464h.this;
        }

        @Override // f3.L0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return AbstractC5464h.this.d();
        }
    }

    /* renamed from: f3.h$b */
    class b extends L0.h {
        b() {
        }

        @Override // f3.L0.h
        K0 a() {
            return AbstractC5464h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K0.a> iterator() {
            return AbstractC5464h.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC5464h.this.c();
        }
    }

    AbstractC5464h() {
    }

    Set a() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
    public final boolean add(Object obj) {
        add(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<Object> collection) {
        return L0.b(this, collection);
    }

    Set b() {
        return new b();
    }

    abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public abstract /* synthetic */ int count(Object obj);

    abstract Iterator d();

    abstract Iterator e();

    public Set<Object> elementSet() {
        Set<Object> set = this.f30941a;
        if (set != null) {
            return set;
        }
        Set<Object> setA = a();
        this.f30941a = setA;
        return setA;
    }

    public Set<K0.a> entrySet() {
        Set<K0.a> set = this.f30942b;
        if (set != null) {
            return set;
        }
        Set<K0.a> setB = b();
        this.f30942b = setB;
        return setB;
    }

    @Override // java.util.Collection, f3.K0
    public final boolean equals(Object obj) {
        return L0.d(this, obj);
    }

    @Override // java.util.Collection, f3.K0
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
    public final boolean removeAll(Collection<?> collection) {
        return L0.h(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
    public final boolean retainAll(Collection<?> collection) {
        return L0.i(this, collection);
    }

    @Override // f3.K0
    public int setCount(Object obj, int i8) {
        return L0.k(this, obj, i8);
    }

    @Override // java.util.AbstractCollection, f3.K0
    public final String toString() {
        return entrySet().toString();
    }

    public int add(Object obj, int i8) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.K0
    public boolean setCount(Object obj, int i8, int i9) {
        return L0.l(this, obj, i8, i9);
    }
}
