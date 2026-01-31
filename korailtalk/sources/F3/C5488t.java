package f3;

import j3.AbstractC5820b;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: f3.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5488t extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f31104j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f31105a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f31106b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f31107c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f31108d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f31109e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f31110f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f31111g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f31112h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f31113i;

    /* renamed from: f3.t$a */
    class a extends e {
        a() {
            super(C5488t.this, null);
        }

        @Override // f3.C5488t.e
        Object b(int i8) {
            return C5488t.this.F(i8);
        }
    }

    /* renamed from: f3.t$b */
    class b extends e {
        b() {
            super(C5488t.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.C5488t.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i8) {
            return C5488t.this.new g(i8);
        }
    }

    /* renamed from: f3.t$c */
    class c extends e {
        c() {
            super(C5488t.this, null);
        }

        @Override // f3.C5488t.e
        Object b(int i8) {
            return C5488t.this.V(i8);
        }
    }

    /* renamed from: f3.t$d */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5488t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapV = C5488t.this.v();
            if (mapV != null) {
                return mapV.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iC = C5488t.this.C(entry.getKey());
            return iC != -1 && e3.r.equal(C5488t.this.V(iC), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return C5488t.this.x();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapV = C5488t.this.v();
            if (mapV != null) {
                return mapV.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C5488t.this.I()) {
                return false;
            }
            int iA = C5488t.this.A();
            int iF = AbstractC5492v.f(entry.getKey(), entry.getValue(), iA, C5488t.this.M(), C5488t.this.K(), C5488t.this.L(), C5488t.this.N());
            if (iF == -1) {
                return false;
            }
            C5488t.this.H(iF, iA);
            C5488t.e(C5488t.this);
            C5488t.this.B();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5488t.this.size();
        }
    }

    /* renamed from: f3.t$f */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5488t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C5488t.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return C5488t.this.G();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapV = C5488t.this.v();
            return mapV != null ? mapV.keySet().remove(obj) : C5488t.this.J(obj) != C5488t.f31104j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5488t.this.size();
        }
    }

    /* renamed from: f3.t$g */
    final class g extends AbstractC5460f {

        /* renamed from: a, reason: collision with root package name */
        private final Object f31123a;

        /* renamed from: b, reason: collision with root package name */
        private int f31124b;

        g(int i8) {
            this.f31123a = C5488t.this.F(i8);
            this.f31124b = i8;
        }

        private void a() {
            int i8 = this.f31124b;
            if (i8 == -1 || i8 >= C5488t.this.size() || !e3.r.equal(this.f31123a, C5488t.this.F(this.f31124b))) {
                this.f31124b = C5488t.this.C(this.f31123a);
            }
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getKey() {
            return this.f31123a;
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getValue() {
            Map mapV = C5488t.this.v();
            if (mapV != null) {
                return N0.a(mapV.get(this.f31123a));
            }
            a();
            int i8 = this.f31124b;
            return i8 == -1 ? N0.b() : C5488t.this.V(i8);
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapV = C5488t.this.v();
            if (mapV != null) {
                return N0.a(mapV.put(this.f31123a, obj));
            }
            a();
            int i8 = this.f31124b;
            if (i8 == -1) {
                C5488t.this.put(this.f31123a, obj);
                return N0.b();
            }
            Object objV = C5488t.this.V(i8);
            C5488t.this.U(this.f31124b, obj);
            return objV;
        }
    }

    /* renamed from: f3.t$h */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C5488t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return C5488t.this.W();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C5488t.this.size();
        }
    }

    C5488t() {
        D(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A() {
        return (1 << (this.f31109e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C(Object obj) {
        if (I()) {
            return -1;
        }
        int iC = AbstractC5453b0.c(obj);
        int iA = A();
        int iH = AbstractC5492v.h(M(), iC & iA);
        if (iH == 0) {
            return -1;
        }
        int iB = AbstractC5492v.b(iC, iA);
        do {
            int i8 = iH - 1;
            int iW = w(i8);
            if (AbstractC5492v.b(iW, iA) == iB && e3.r.equal(obj, F(i8))) {
                return i8;
            }
            iH = AbstractC5492v.c(iW, iA);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object F(int i8) {
        return L()[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object J(Object obj) {
        if (I()) {
            return f31104j;
        }
        int iA = A();
        int iF = AbstractC5492v.f(obj, null, iA, M(), K(), L(), null);
        if (iF == -1) {
            return f31104j;
        }
        Object objV = V(iF);
        H(iF, iA);
        this.f31110f--;
        B();
        return objV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] K() {
        int[] iArr = this.f31106b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] L() {
        Object[] objArr = this.f31107c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object M() {
        Object obj = this.f31105a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] N() {
        Object[] objArr = this.f31108d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void P(int i8) {
        int iMin;
        int length = K().length;
        if (i8 <= length || (iMin = Math.min(s7.x.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        O(iMin);
    }

    private int Q(int i8, int i9, int i10, int i11) {
        Object objA = AbstractC5492v.a(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            AbstractC5492v.i(objA, i10 & i12, i11 + 1);
        }
        Object objM = M();
        int[] iArrK = K();
        for (int i13 = 0; i13 <= i8; i13++) {
            int iH = AbstractC5492v.h(objM, i13);
            while (iH != 0) {
                int i14 = iH - 1;
                int i15 = iArrK[i14];
                int iB = AbstractC5492v.b(i15, i8) | i13;
                int i16 = iB & i12;
                int iH2 = AbstractC5492v.h(objA, i16);
                AbstractC5492v.i(objA, i16, iH);
                iArrK[i14] = AbstractC5492v.d(iB, iH2, i12);
                iH = AbstractC5492v.c(i15, i8);
            }
        }
        this.f31105a = objA;
        S(i12);
        return i12;
    }

    private void R(int i8, int i9) {
        K()[i8] = i9;
    }

    private void S(int i8) {
        this.f31109e = AbstractC5492v.d(this.f31109e, 32 - Integer.numberOfLeadingZeros(i8), 31);
    }

    private void T(int i8, Object obj) {
        L()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i8, Object obj) {
        N()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object V(int i8) {
        return N()[i8];
    }

    public static <K, V> C5488t create() {
        return new C5488t();
    }

    public static <K, V> C5488t createWithExpectedSize(int i8) {
        return new C5488t(i8);
    }

    static /* synthetic */ int e(C5488t c5488t) {
        int i8 = c5488t.f31110f;
        c5488t.f31110f = i8 - 1;
        return i8;
    }

    private int w(int i8) {
        return K()[i8];
    }

    void B() {
        this.f31109e += 32;
    }

    void D(int i8) {
        e3.w.checkArgument(i8 >= 0, "Expected size must be >= 0");
        this.f31109e = AbstractC5820b.constrainToRange(i8, 1, s7.x.MAX_CAPACITY_MASK);
    }

    void E(int i8, Object obj, Object obj2, int i9, int i10) {
        R(i8, AbstractC5492v.d(i9, 0, i10));
        T(i8, obj);
        U(i8, obj2);
    }

    Iterator G() {
        Map mapV = v();
        return mapV != null ? mapV.keySet().iterator() : new a();
    }

    void H(int i8, int i9) {
        Object objM = M();
        int[] iArrK = K();
        Object[] objArrL = L();
        Object[] objArrN = N();
        int size = size();
        int i10 = size - 1;
        if (i8 >= i10) {
            objArrL[i8] = null;
            objArrN[i8] = null;
            iArrK[i8] = 0;
            return;
        }
        Object obj = objArrL[i10];
        objArrL[i8] = obj;
        objArrN[i8] = objArrN[i10];
        objArrL[i10] = null;
        objArrN[i10] = null;
        iArrK[i8] = iArrK[i10];
        iArrK[i10] = 0;
        int iC = AbstractC5453b0.c(obj) & i9;
        int iH = AbstractC5492v.h(objM, iC);
        if (iH == size) {
            AbstractC5492v.i(objM, iC, i8 + 1);
            return;
        }
        while (true) {
            int i11 = iH - 1;
            int i12 = iArrK[i11];
            int iC2 = AbstractC5492v.c(i12, i9);
            if (iC2 == size) {
                iArrK[i11] = AbstractC5492v.d(i12, i8 + 1, i9);
                return;
            }
            iH = iC2;
        }
    }

    boolean I() {
        return this.f31105a == null;
    }

    void O(int i8) {
        this.f31106b = Arrays.copyOf(K(), i8);
        this.f31107c = Arrays.copyOf(L(), i8);
        this.f31108d = Arrays.copyOf(N(), i8);
    }

    Iterator W() {
        Map mapV = v();
        return mapV != null ? mapV.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (I()) {
            return;
        }
        B();
        Map mapV = v();
        if (mapV != null) {
            this.f31109e = AbstractC5820b.constrainToRange(size(), 3, s7.x.MAX_CAPACITY_MASK);
            mapV.clear();
            this.f31105a = null;
            this.f31110f = 0;
            return;
        }
        Arrays.fill(L(), 0, this.f31110f, (Object) null);
        Arrays.fill(N(), 0, this.f31110f, (Object) null);
        AbstractC5492v.g(M());
        Arrays.fill(K(), 0, this.f31110f, 0);
        this.f31110f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapV = v();
        return mapV != null ? mapV.containsKey(obj) : C(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapV = v();
        if (mapV != null) {
            return mapV.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f31110f; i8++) {
            if (e3.r.equal(obj, V(i8))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        Set<Map.Entry<Object, Object>> set = this.f31112h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<Object, Object>> setR = r();
        this.f31112h = setR;
        return setR;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapV = v();
        if (mapV != null) {
            return mapV.get(obj);
        }
        int iC = C(obj);
        if (iC == -1) {
            return null;
        }
        n(iC);
        return V(iC);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        Set<Object> set = this.f31111g;
        if (set != null) {
            return set;
        }
        Set<Object> setT = t();
        this.f31111g = setT;
        return setT;
    }

    int o(int i8, int i9) {
        return i8 - 1;
    }

    int p() {
        e3.w.checkState(I(), "Arrays already allocated");
        int i8 = this.f31109e;
        int iJ = AbstractC5492v.j(i8);
        this.f31105a = AbstractC5492v.a(iJ);
        S(iJ - 1);
        this.f31106b = new int[i8];
        this.f31107c = new Object[i8];
        this.f31108d = new Object[i8];
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int iQ;
        int i8;
        if (I()) {
            p();
        }
        Map mapV = v();
        if (mapV != null) {
            return mapV.put(obj, obj2);
        }
        int[] iArrK = K();
        Object[] objArrL = L();
        Object[] objArrN = N();
        int i9 = this.f31110f;
        int i10 = i9 + 1;
        int iC = AbstractC5453b0.c(obj);
        int iA = A();
        int i11 = iC & iA;
        int iH = AbstractC5492v.h(M(), i11);
        if (iH != 0) {
            int iB = AbstractC5492v.b(iC, iA);
            int i12 = 0;
            while (true) {
                int i13 = iH - 1;
                int i14 = iArrK[i13];
                if (AbstractC5492v.b(i14, iA) == iB && e3.r.equal(obj, objArrL[i13])) {
                    Object obj3 = objArrN[i13];
                    objArrN[i13] = obj2;
                    n(i13);
                    return obj3;
                }
                int iC2 = AbstractC5492v.c(i14, iA);
                i12++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i12 >= 9) {
                        return q().put(obj, obj2);
                    }
                    if (i10 > iA) {
                        iQ = Q(iA, AbstractC5492v.e(iA), iC, i9);
                    } else {
                        iArrK[i13] = AbstractC5492v.d(i14, i10, iA);
                    }
                }
            }
            i8 = iA;
        } else if (i10 > iA) {
            iQ = Q(iA, AbstractC5492v.e(iA), iC, i9);
            i8 = iQ;
        } else {
            AbstractC5492v.i(M(), i11, i10);
            i8 = iA;
        }
        P(i10);
        E(i9, obj, obj2, iC, i8);
        this.f31110f = i10;
        B();
        return null;
    }

    Map q() {
        Map mapS = s(A() + 1);
        int iY = y();
        while (iY >= 0) {
            mapS.put(F(iY), V(iY));
            iY = z(iY);
        }
        this.f31105a = mapS;
        this.f31106b = null;
        this.f31107c = null;
        this.f31108d = null;
        B();
        return mapS;
    }

    Set r() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapV = v();
        if (mapV != null) {
            return mapV.remove(obj);
        }
        Object objJ = J(obj);
        if (objJ == f31104j) {
            return null;
        }
        return objJ;
    }

    Map s(int i8) {
        return new LinkedHashMap(i8, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapV = v();
        return mapV != null ? mapV.size() : this.f31110f;
    }

    Set t() {
        return new f();
    }

    public void trimToSize() {
        if (I()) {
            return;
        }
        Map mapV = v();
        if (mapV != null) {
            Map mapS = s(size());
            mapS.putAll(mapV);
            this.f31105a = mapS;
            return;
        }
        int i8 = this.f31110f;
        if (i8 < K().length) {
            O(i8);
        }
        int iJ = AbstractC5492v.j(i8);
        int iA = A();
        if (iJ < iA) {
            Q(iA, iJ, 0, 0);
        }
    }

    Collection u() {
        return new h();
    }

    Map v() {
        Object obj = this.f31105a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        Collection<Object> collection = this.f31113i;
        if (collection != null) {
            return collection;
        }
        Collection<Object> collectionU = u();
        this.f31113i = collectionU;
        return collectionU;
    }

    Iterator x() {
        Map mapV = v();
        return mapV != null ? mapV.entrySet().iterator() : new b();
    }

    int y() {
        return isEmpty() ? -1 : 0;
    }

    int z(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f31110f) {
            return i9;
        }
        return -1;
    }

    C5488t(int i8) {
        D(i8);
    }

    /* renamed from: f3.t$e */
    private abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f31118a;

        /* renamed from: b, reason: collision with root package name */
        int f31119b;

        /* renamed from: c, reason: collision with root package name */
        int f31120c;

        private e() {
            this.f31118a = C5488t.this.f31109e;
            this.f31119b = C5488t.this.y();
            this.f31120c = -1;
        }

        private void a() {
            if (C5488t.this.f31109e != this.f31118a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i8);

        void c() {
            this.f31118a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31119b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i8 = this.f31119b;
            this.f31120c = i8;
            Object objB = b(i8);
            this.f31119b = C5488t.this.z(this.f31119b);
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            AbstractC5484r.d(this.f31120c >= 0);
            c();
            C5488t c5488t = C5488t.this;
            c5488t.remove(c5488t.F(this.f31120c));
            this.f31119b = C5488t.this.o(this.f31119b, this.f31120c);
            this.f31120c = -1;
        }

        /* synthetic */ e(C5488t c5488t, a aVar) {
            this();
        }
    }

    void n(int i8) {
    }
}
