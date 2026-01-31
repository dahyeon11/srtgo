package f3;

import j3.AbstractC5820b;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: f3.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5490u extends AbstractSet implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient Object f31127a;

    /* renamed from: b, reason: collision with root package name */
    private transient int[] f31128b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f31129c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f31130d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f31131e;

    /* renamed from: f3.u$a */
    class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f31132a;

        /* renamed from: b, reason: collision with root package name */
        int f31133b;

        /* renamed from: c, reason: collision with root package name */
        int f31134c = -1;

        a() {
            this.f31132a = C5490u.this.f31130d;
            this.f31133b = C5490u.this.j();
        }

        private void a() {
            if (C5490u.this.f31130d != this.f31132a) {
                throw new ConcurrentModificationException();
            }
        }

        void b() {
            this.f31132a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31133b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i8 = this.f31133b;
            this.f31134c = i8;
            Object objH = C5490u.this.h(i8);
            this.f31133b = C5490u.this.k(this.f31133b);
            return objH;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            AbstractC5484r.d(this.f31134c >= 0);
            b();
            C5490u c5490u = C5490u.this;
            c5490u.remove(c5490u.h(this.f31134c));
            this.f31133b = C5490u.this.c(this.f31133b, this.f31134c);
            this.f31134c = -1;
        }
    }

    C5490u() {
        n(3);
    }

    public static <E> C5490u create() {
        return new C5490u();
    }

    public static <E> C5490u createWithExpectedSize(int i8) {
        return new C5490u(i8);
    }

    private Set f(int i8) {
        return new LinkedHashSet(i8, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object h(int i8) {
        return r()[i8];
    }

    private int i(int i8) {
        return s()[i8];
    }

    private int l() {
        return (1 << (this.f31130d & 31)) - 1;
    }

    private Object[] r() {
        Object[] objArr = this.f31129c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] s() {
        int[] iArr = this.f31128b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object t() {
        Object obj = this.f31127a;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void v(int i8) {
        int iMin;
        int length = s().length;
        if (i8 <= length || (iMin = Math.min(s7.x.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        u(iMin);
    }

    private int w(int i8, int i9, int i10, int i11) {
        Object objA = AbstractC5492v.a(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            AbstractC5492v.i(objA, i10 & i12, i11 + 1);
        }
        Object objT = t();
        int[] iArrS = s();
        for (int i13 = 0; i13 <= i8; i13++) {
            int iH = AbstractC5492v.h(objT, i13);
            while (iH != 0) {
                int i14 = iH - 1;
                int i15 = iArrS[i14];
                int iB = AbstractC5492v.b(i15, i8) | i13;
                int i16 = iB & i12;
                int iH2 = AbstractC5492v.h(objA, i16);
                AbstractC5492v.i(objA, i16, iH);
                iArrS[i14] = AbstractC5492v.d(iB, iH2, i12);
                iH = AbstractC5492v.c(i15, i8);
            }
        }
        this.f31127a = objA;
        z(i12);
        return i12;
    }

    private void x(int i8, Object obj) {
        r()[i8] = obj;
    }

    private void y(int i8, int i9) {
        s()[i8] = i9;
    }

    private void z(int i8) {
        this.f31130d = AbstractC5492v.d(this.f31130d, 32 - Integer.numberOfLeadingZeros(i8), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (q()) {
            d();
        }
        Set setG = g();
        if (setG != null) {
            return setG.add(obj);
        }
        int[] iArrS = s();
        Object[] objArrR = r();
        int i8 = this.f31131e;
        int i9 = i8 + 1;
        int iC = AbstractC5453b0.c(obj);
        int iL = l();
        int i10 = iC & iL;
        int iH = AbstractC5492v.h(t(), i10);
        if (iH != 0) {
            int iB = AbstractC5492v.b(iC, iL);
            int i11 = 0;
            while (true) {
                int i12 = iH - 1;
                int i13 = iArrS[i12];
                if (AbstractC5492v.b(i13, iL) == iB && e3.r.equal(obj, objArrR[i12])) {
                    return false;
                }
                int iC2 = AbstractC5492v.c(i13, iL);
                i11++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i11 >= 9) {
                        return e().add(obj);
                    }
                    if (i9 > iL) {
                        iL = w(iL, AbstractC5492v.e(iL), iC, i8);
                    } else {
                        iArrS[i12] = AbstractC5492v.d(i13, i9, iL);
                    }
                }
            }
        } else if (i9 > iL) {
            iL = w(iL, AbstractC5492v.e(iL), iC, i8);
        } else {
            AbstractC5492v.i(t(), i10, i9);
        }
        v(i9);
        o(i8, obj, iC, iL);
        this.f31131e = i9;
        m();
        return true;
    }

    int c(int i8, int i9) {
        return i8 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (q()) {
            return;
        }
        m();
        Set setG = g();
        if (setG != null) {
            this.f31130d = AbstractC5820b.constrainToRange(size(), 3, s7.x.MAX_CAPACITY_MASK);
            setG.clear();
            this.f31127a = null;
            this.f31131e = 0;
            return;
        }
        Arrays.fill(r(), 0, this.f31131e, (Object) null);
        AbstractC5492v.g(t());
        Arrays.fill(s(), 0, this.f31131e, 0);
        this.f31131e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (q()) {
            return false;
        }
        Set setG = g();
        if (setG != null) {
            return setG.contains(obj);
        }
        int iC = AbstractC5453b0.c(obj);
        int iL = l();
        int iH = AbstractC5492v.h(t(), iC & iL);
        if (iH == 0) {
            return false;
        }
        int iB = AbstractC5492v.b(iC, iL);
        do {
            int i8 = iH - 1;
            int i9 = i(i8);
            if (AbstractC5492v.b(i9, iL) == iB && e3.r.equal(obj, h(i8))) {
                return true;
            }
            iH = AbstractC5492v.c(i9, iL);
        } while (iH != 0);
        return false;
    }

    int d() {
        e3.w.checkState(q(), "Arrays already allocated");
        int i8 = this.f31130d;
        int iJ = AbstractC5492v.j(i8);
        this.f31127a = AbstractC5492v.a(iJ);
        z(iJ - 1);
        this.f31128b = new int[i8];
        this.f31129c = new Object[i8];
        return i8;
    }

    Set e() {
        Set setF = f(l() + 1);
        int iJ = j();
        while (iJ >= 0) {
            setF.add(h(iJ));
            iJ = k(iJ);
        }
        this.f31127a = setF;
        this.f31128b = null;
        this.f31129c = null;
        m();
        return setF;
    }

    Set g() {
        Object obj = this.f31127a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        Set setG = g();
        return setG != null ? setG.iterator() : new a();
    }

    int j() {
        return isEmpty() ? -1 : 0;
    }

    int k(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f31131e) {
            return i9;
        }
        return -1;
    }

    void m() {
        this.f31130d += 32;
    }

    void n(int i8) {
        e3.w.checkArgument(i8 >= 0, "Expected size must be >= 0");
        this.f31130d = AbstractC5820b.constrainToRange(i8, 1, s7.x.MAX_CAPACITY_MASK);
    }

    void o(int i8, Object obj, int i9, int i10) {
        y(i8, AbstractC5492v.d(i9, 0, i10));
        x(i8, obj);
    }

    void p(int i8, int i9) {
        Object objT = t();
        int[] iArrS = s();
        Object[] objArrR = r();
        int size = size();
        int i10 = size - 1;
        if (i8 >= i10) {
            objArrR[i8] = null;
            iArrS[i8] = 0;
            return;
        }
        Object obj = objArrR[i10];
        objArrR[i8] = obj;
        objArrR[i10] = null;
        iArrS[i8] = iArrS[i10];
        iArrS[i10] = 0;
        int iC = AbstractC5453b0.c(obj) & i9;
        int iH = AbstractC5492v.h(objT, iC);
        if (iH == size) {
            AbstractC5492v.i(objT, iC, i8 + 1);
            return;
        }
        while (true) {
            int i11 = iH - 1;
            int i12 = iArrS[i11];
            int iC2 = AbstractC5492v.c(i12, i9);
            if (iC2 == size) {
                iArrS[i11] = AbstractC5492v.d(i12, i8 + 1, i9);
                return;
            }
            iH = iC2;
        }
    }

    boolean q() {
        return this.f31127a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (q()) {
            return false;
        }
        Set setG = g();
        if (setG != null) {
            return setG.remove(obj);
        }
        int iL = l();
        int iF = AbstractC5492v.f(obj, null, iL, t(), s(), r(), null);
        if (iF == -1) {
            return false;
        }
        p(iF, iL);
        this.f31131e--;
        m();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set setG = g();
        return setG != null ? setG.size() : this.f31131e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (q()) {
            return new Object[0];
        }
        Set setG = g();
        return setG != null ? setG.toArray() : Arrays.copyOf(r(), this.f31131e);
    }

    public void trimToSize() {
        if (q()) {
            return;
        }
        Set setG = g();
        if (setG != null) {
            Set setF = f(size());
            setF.addAll(setG);
            this.f31127a = setF;
            return;
        }
        int i8 = this.f31131e;
        if (i8 < s().length) {
            u(i8);
        }
        int iJ = AbstractC5492v.j(i8);
        int iL = l();
        if (iJ < iL) {
            w(iL, iJ, 0, 0);
        }
    }

    void u(int i8) {
        this.f31128b = Arrays.copyOf(s(), i8);
        this.f31129c = Arrays.copyOf(r(), i8);
    }

    public static <E> C5490u create(Collection<? extends E> collection) {
        C5490u c5490uCreateWithExpectedSize = createWithExpectedSize(collection.size());
        c5490uCreateWithExpectedSize.addAll(collection);
        return c5490uCreateWithExpectedSize;
    }

    C5490u(int i8) {
        n(i8);
    }

    @SafeVarargs
    public static <E> C5490u create(E... eArr) {
        C5490u c5490uCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(c5490uCreateWithExpectedSize, eArr);
        return c5490uCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (q()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set setG = g();
        if (setG != null) {
            return (T[]) setG.toArray(tArr);
        }
        return (T[]) Q0.g(r(), 0, this.f31131e, tArr);
    }
}
