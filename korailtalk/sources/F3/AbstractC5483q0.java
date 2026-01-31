package f3;

import f3.AbstractC5457d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: f3.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5483q0 extends AbstractC5457d0 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC5465h0 f31074b;

    /* renamed from: f3.q0$a */
    public static class a extends AbstractC5457d0.a {

        /* renamed from: d, reason: collision with root package name */
        Object[] f31075d;

        /* renamed from: e, reason: collision with root package name */
        private int f31076e;

        public a() {
            super(4);
        }

        private void d(Object obj) {
            Objects.requireNonNull(this.f31075d);
            int length = this.f31075d.length - 1;
            int iHashCode = obj.hashCode();
            int iB = AbstractC5453b0.b(iHashCode);
            while (true) {
                int i8 = iB & length;
                Object[] objArr = this.f31075d;
                Object obj2 = objArr[i8];
                if (obj2 == null) {
                    objArr[i8] = obj;
                    this.f31076e += iHashCode;
                    super.add(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iB = i8 + 1;
                }
            }
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterable iterable) {
            return addAll((Iterable<Object>) iterable);
        }

        a(int i8) {
            super(i8);
            this.f31075d = new Object[AbstractC5483q0.g(i8)];
        }

        @Override // f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterator it) {
            return addAll((Iterator<Object>) it);
        }

        @Override // f3.AbstractC5457d0.b
        public AbstractC5483q0 build() {
            AbstractC5483q0 abstractC5483q0H;
            int i8 = this.f30923b;
            if (i8 == 0) {
                return AbstractC5483q0.of();
            }
            if (i8 == 1) {
                Object obj = this.f30922a[0];
                Objects.requireNonNull(obj);
                return AbstractC5483q0.of(obj);
            }
            if (this.f31075d == null || AbstractC5483q0.g(i8) != this.f31075d.length) {
                abstractC5483q0H = AbstractC5483q0.h(this.f30923b, this.f30922a);
                this.f30923b = abstractC5483q0H.size();
            } else {
                Object[] objArrCopyOf = AbstractC5483q0.k(this.f30923b, this.f30922a.length) ? Arrays.copyOf(this.f30922a, this.f30923b) : this.f30922a;
                abstractC5483q0H = new c1(objArrCopyOf, this.f31076e, this.f31075d, r5.length - 1, this.f30923b);
            }
            this.f30924c = true;
            this.f31075d = null;
            return abstractC5483q0H;
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a addAll(Iterable<Object> iterable) {
            e3.w.checkNotNull(iterable);
            if (this.f31075d != null) {
                Iterator<Object> it = iterable.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
            } else {
                super.addAll(iterable);
            }
            return this;
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a add(Object obj) {
            e3.w.checkNotNull(obj);
            if (this.f31075d != null && AbstractC5483q0.g(this.f30923b) <= this.f31075d.length) {
                d(obj);
                return this;
            }
            this.f31075d = null;
            super.add(obj);
            return this;
        }

        @Override // f3.AbstractC5457d0.b
        public a addAll(Iterator<Object> it) {
            e3.w.checkNotNull(it);
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a add(Object... objArr) {
            if (this.f31075d != null) {
                for (Object obj : objArr) {
                    add(obj);
                }
            } else {
                super.add(objArr);
            }
            return this;
        }
    }

    AbstractC5483q0() {
    }

    public static <E> a builder() {
        return new a();
    }

    public static <E> a builderWithExpectedSize(int i8) {
        AbstractC5484r.b(i8, "expectedSize");
        return new a(i8);
    }

    public static <E> AbstractC5483q0 copyOf(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC5483q0) && !(collection instanceof SortedSet)) {
            AbstractC5483q0 abstractC5483q0 = (AbstractC5483q0) collection;
            if (!abstractC5483q0.isPartialView()) {
                return abstractC5483q0;
            }
        }
        Object[] array = collection.toArray();
        return h(array.length, array);
    }

    static int g(int i8) {
        int iMax = Math.max(i8, 2);
        if (iMax >= 751619276) {
            e3.w.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC5483q0 h(int i8, Object... objArr) {
        if (i8 == 0) {
            return of();
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iG = g(i8);
        Object[] objArr2 = new Object[iG];
        int i9 = iG - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object objA = Q0.a(objArr[i12], i12);
            int iHashCode = objA.hashCode();
            int iB = AbstractC5453b0.b(iHashCode);
            while (true) {
                int i13 = iB & i9;
                Object obj2 = objArr2[i13];
                if (obj2 == null) {
                    objArr[i11] = objA;
                    objArr2[i13] = objA;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i11, i8, (Object) null);
        if (i11 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new i1(obj3);
        }
        if (g(i11) < iG / 2) {
            return h(i11, objArr);
        }
        if (k(i11, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new c1(objArr, i10, objArr2, i9, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(int i8, int i9) {
        return i8 < (i9 >> 1) + (i9 >> 2);
    }

    public static <E> AbstractC5483q0 of() {
        return c1.f30880i;
    }

    @Override // f3.AbstractC5457d0
    public AbstractC5465h0 asList() {
        AbstractC5465h0 abstractC5465h0 = this.f31074b;
        if (abstractC5465h0 != null) {
            return abstractC5465h0;
        }
        AbstractC5465h0 abstractC5465h0I = i();
        this.f31074b = abstractC5465h0I;
        return abstractC5465h0I;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC5483q0) && j() && ((AbstractC5483q0) obj).j() && hashCode() != obj.hashCode()) {
            return false;
        }
        return h1.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return h1.b(this);
    }

    AbstractC5465h0 i() {
        return AbstractC5465h0.e(toArray());
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract t1 iterator();

    boolean j() {
        return false;
    }

    public static <E> AbstractC5483q0 of(E e8) {
        return new i1(e8);
    }

    public static <E> AbstractC5483q0 of(E e8, E e9) {
        return h(2, e8, e9);
    }

    public static <E> AbstractC5483q0 of(E e8, E e9, E e10) {
        return h(3, e8, e9, e10);
    }

    public static <E> AbstractC5483q0 of(E e8, E e9, E e10, E e11) {
        return h(4, e8, e9, e10, e11);
    }

    public static <E> AbstractC5483q0 copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> AbstractC5483q0 of(E e8, E e9, E e10, E e11, E e12) {
        return h(5, e8, e9, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> AbstractC5483q0 of(E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        e3.w.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e8;
        objArr[1] = e9;
        objArr[2] = e10;
        objArr[3] = e11;
        objArr[4] = e12;
        objArr[5] = e13;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return h(length, objArr);
    }

    public static <E> AbstractC5483q0 copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new a().add((Object) next).addAll((Iterator<Object>) it).build();
    }

    public static <E> AbstractC5483q0 copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return h(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
