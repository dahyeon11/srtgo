package f3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: f3.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5457d0 extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f30921a = new Object[0];

    /* renamed from: f3.d0$a */
    static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f30922a;

        /* renamed from: b, reason: collision with root package name */
        int f30923b;

        /* renamed from: c, reason: collision with root package name */
        boolean f30924c;

        a(int i8) {
            AbstractC5484r.b(i8, "initialCapacity");
            this.f30922a = new Object[i8];
            this.f30923b = 0;
        }

        private void c(int i8) {
            Object[] objArr = this.f30922a;
            if (objArr.length < i8) {
                this.f30922a = Arrays.copyOf(objArr, b.a(objArr.length, i8));
                this.f30924c = false;
            } else if (this.f30924c) {
                this.f30922a = (Object[]) objArr.clone();
                this.f30924c = false;
            }
        }

        @Override // f3.AbstractC5457d0.b
        public b addAll(Iterable<Object> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                c(this.f30923b + collection.size());
                if (collection instanceof AbstractC5457d0) {
                    this.f30923b = ((AbstractC5457d0) collection).a(this.f30922a, this.f30923b);
                    return this;
                }
            }
            super.addAll(iterable);
            return this;
        }

        final void b(Object[] objArr, int i8) {
            Q0.c(objArr, i8);
            c(this.f30923b + i8);
            System.arraycopy(objArr, 0, this.f30922a, this.f30923b, i8);
            this.f30923b += i8;
        }

        @Override // f3.AbstractC5457d0.b
        public a add(Object obj) {
            e3.w.checkNotNull(obj);
            c(this.f30923b + 1);
            Object[] objArr = this.f30922a;
            int i8 = this.f30923b;
            this.f30923b = i8 + 1;
            objArr[i8] = obj;
            return this;
        }

        @Override // f3.AbstractC5457d0.b
        public b add(Object... objArr) {
            b(objArr, objArr.length);
            return this;
        }
    }

    AbstractC5457d0() {
    }

    int a(Object[] objArr, int i8) {
        t1 it = iterator();
        while (it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5465h0 asList() {
        return isEmpty() ? AbstractC5465h0.of() : AbstractC5465h0.e(toArray());
    }

    Object[] b() {
        return null;
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract t1 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f30921a);
    }

    /* renamed from: f3.d0$b */
    public static abstract class b {
        b() {
        }

        static int a(int i8, int i9) {
            if (i9 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i8 + (i8 >> 1) + 1;
            if (iHighestOneBit < i9) {
                iHighestOneBit = Integer.highestOneBit(i9 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b add(Object obj);

        public b add(Object... objArr) {
            for (Object obj : objArr) {
                add(obj);
            }
            return this;
        }

        public b addAll(Iterable<Object> iterable) {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public abstract AbstractC5457d0 build();

        public b addAll(Iterator<Object> it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        e3.w.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrB = b();
            if (objArrB != null) {
                return (T[]) V0.a(objArrB, d(), c(), tArr);
            }
            tArr = (T[]) Q0.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
