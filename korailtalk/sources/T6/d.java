package T6;

import S6.AbstractC0759c;
import S6.AbstractC0765i;
import S6.M;
import j7.l;
import j7.s;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes3.dex */
public final class d implements Map, Serializable, KMutableMap {
    public static final a Companion = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final d f4940n;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f4941a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f4942b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f4943c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f4944d;

    /* renamed from: e, reason: collision with root package name */
    private int f4945e;

    /* renamed from: f, reason: collision with root package name */
    private int f4946f;

    /* renamed from: g, reason: collision with root package name */
    private int f4947g;

    /* renamed from: h, reason: collision with root package name */
    private int f4948h;

    /* renamed from: i, reason: collision with root package name */
    private int f4949i;

    /* renamed from: j, reason: collision with root package name */
    private T6.f f4950j;

    /* renamed from: k, reason: collision with root package name */
    private g f4951k;

    /* renamed from: l, reason: collision with root package name */
    private T6.e f4952l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4953m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(int i8) {
            return Integer.highestOneBit(s.coerceAtLeast(i8, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i8) {
            return Integer.numberOfLeadingZeros(i8) + 1;
        }

        public final d getEmpty$kotlin_stdlib() {
            return d.f4940n;
        }

        private a() {
        }
    }

    public static final class b extends C0077d implements Iterator, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        public final void nextAppendString(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f4946f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f4941a[getLastIndex$kotlin_stdlib()];
            if (obj == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = getMap$kotlin_stdlib().f4942b;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f4946f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f4941a[getLastIndex$kotlin_stdlib()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = getMap$kotlin_stdlib().f4942b;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return iHashCode2;
        }

        @Override // java.util.Iterator
        public c next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f4946f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            c cVar = new c(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return cVar;
        }
    }

    public static final class c implements Map.Entry, KMutableMap.Entry {

        /* renamed from: a, reason: collision with root package name */
        private final d f4954a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4955b;

        public c(d map, int i8) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f4954a = map;
            this.f4955b = i8;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f4954a.f4941a[this.f4955b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f4954a.f4942b;
            Intrinsics.checkNotNull(objArr);
            return objArr[this.f4955b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f4954a.checkIsMutable$kotlin_stdlib();
            Object[] objArrA = this.f4954a.a();
            int i8 = this.f4955b;
            Object obj2 = objArrA[i8];
            objArrA[i8] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: T6.d$d, reason: collision with other inner class name */
    public static class C0077d {

        /* renamed from: a, reason: collision with root package name */
        private final d f4956a;

        /* renamed from: b, reason: collision with root package name */
        private int f4957b;

        /* renamed from: c, reason: collision with root package name */
        private int f4958c;

        /* renamed from: d, reason: collision with root package name */
        private int f4959d;

        public C0077d(d map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f4956a = map;
            this.f4958c = -1;
            this.f4959d = map.f4948h;
            initNext$kotlin_stdlib();
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (this.f4956a.f4948h != this.f4959d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int getIndex$kotlin_stdlib() {
            return this.f4957b;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.f4958c;
        }

        public final d getMap$kotlin_stdlib() {
            return this.f4956a;
        }

        public final boolean hasNext() {
            return this.f4957b < this.f4956a.f4946f;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.f4957b < this.f4956a.f4946f) {
                int[] iArr = this.f4956a.f4943c;
                int i8 = this.f4957b;
                if (iArr[i8] >= 0) {
                    return;
                } else {
                    this.f4957b = i8 + 1;
                }
            }
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.f4958c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f4956a.checkIsMutable$kotlin_stdlib();
            this.f4956a.p(this.f4958c);
            this.f4958c = -1;
            this.f4959d = this.f4956a.f4948h;
        }

        public final void setIndex$kotlin_stdlib(int i8) {
            this.f4957b = i8;
        }

        public final void setLastIndex$kotlin_stdlib(int i8) {
            this.f4958c = i8;
        }
    }

    public static final class e extends C0077d implements Iterator, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f4946f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f4941a[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    public static final class f extends C0077d implements Iterator, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f4946f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object[] objArr = getMap$kotlin_stdlib().f4942b;
            Intrinsics.checkNotNull(objArr);
            Object obj = objArr[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f4953m = true;
        f4940n = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i8, int i9) {
        this.f4941a = objArr;
        this.f4942b = objArr2;
        this.f4943c = iArr;
        this.f4944d = iArr2;
        this.f4945e = i8;
        this.f4946f = i9;
        this.f4947g = Companion.b(h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] a() {
        Object[] objArr = this.f4942b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrArrayOfUninitializedElements = T6.c.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.f4942b = objArrArrayOfUninitializedElements;
        return objArrArrayOfUninitializedElements;
    }

    private final void b() {
        int i8;
        Object[] objArr = this.f4942b;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i8 = this.f4946f;
            if (i9 >= i8) {
                break;
            }
            if (this.f4943c[i9] >= 0) {
                Object[] objArr2 = this.f4941a;
                objArr2[i10] = objArr2[i9];
                if (objArr != null) {
                    objArr[i10] = objArr[i9];
                }
                i10++;
            }
            i9++;
        }
        T6.c.resetRange(this.f4941a, i10, i8);
        if (objArr != null) {
            T6.c.resetRange(objArr, i10, this.f4946f);
        }
        this.f4946f = i10;
    }

    private final boolean c(Map map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void d(int i8) {
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > getCapacity$kotlin_stdlib()) {
            int iNewCapacity$kotlin_stdlib = AbstractC0759c.Companion.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), i8);
            this.f4941a = T6.c.copyOfUninitializedElements(this.f4941a, iNewCapacity$kotlin_stdlib);
            Object[] objArr = this.f4942b;
            this.f4942b = objArr != null ? T6.c.copyOfUninitializedElements(objArr, iNewCapacity$kotlin_stdlib) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f4943c, iNewCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f4943c = iArrCopyOf;
            int iA = Companion.a(iNewCapacity$kotlin_stdlib);
            if (iA > h()) {
                n(iA);
            }
        }
    }

    private final void e(int i8) {
        if (q(i8)) {
            n(h());
        } else {
            d(this.f4946f + i8);
        }
    }

    private final int f(Object obj) {
        int i8 = i(obj);
        int i9 = this.f4945e;
        while (true) {
            int i10 = this.f4944d[i8];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (Intrinsics.areEqual(this.f4941a[i11], obj)) {
                    return i11;
                }
            }
            i9--;
            if (i9 < 0) {
                return -1;
            }
            i8 = i8 == 0 ? h() - 1 : i8 - 1;
        }
    }

    private final int g(Object obj) {
        int i8 = this.f4946f;
        while (true) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
            if (this.f4943c[i8] >= 0) {
                Object[] objArr = this.f4942b;
                Intrinsics.checkNotNull(objArr);
                if (Intrinsics.areEqual(objArr[i8], obj)) {
                    return i8;
                }
            }
        }
    }

    private final int h() {
        return this.f4944d.length;
    }

    private final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f4947g;
    }

    private final boolean j(Collection collection) {
        boolean z8 = false;
        if (collection.isEmpty()) {
            return false;
        }
        e(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (k((Map.Entry) it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    private final boolean k(Map.Entry entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        Object[] objArrA = a();
        if (iAddKey$kotlin_stdlib >= 0) {
            objArrA[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i8 = (-iAddKey$kotlin_stdlib) - 1;
        if (Intrinsics.areEqual(entry.getValue(), objArrA[i8])) {
            return false;
        }
        objArrA[i8] = entry.getValue();
        return true;
    }

    private final boolean l(int i8) {
        int i9 = i(this.f4941a[i8]);
        int i10 = this.f4945e;
        while (true) {
            int[] iArr = this.f4944d;
            if (iArr[i9] == 0) {
                iArr[i9] = i8 + 1;
                this.f4943c[i8] = i9;
                return true;
            }
            i10--;
            if (i10 < 0) {
                return false;
            }
            i9 = i9 == 0 ? h() - 1 : i9 - 1;
        }
    }

    private final void m() {
        this.f4948h++;
    }

    private final void n(int i8) {
        m();
        if (this.f4946f > size()) {
            b();
        }
        int i9 = 0;
        if (i8 != h()) {
            this.f4944d = new int[i8];
            this.f4947g = Companion.b(i8);
        } else {
            AbstractC0765i.fill(this.f4944d, 0, 0, h());
        }
        while (i9 < this.f4946f) {
            int i10 = i9 + 1;
            if (!l(i9)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i9 = i10;
        }
    }

    private final void o(int i8) {
        int iCoerceAtMost = s.coerceAtMost(this.f4945e * 2, h() / 2);
        int i9 = 0;
        int i10 = i8;
        do {
            i8 = i8 == 0 ? h() - 1 : i8 - 1;
            i9++;
            if (i9 > this.f4945e) {
                this.f4944d[i10] = 0;
                return;
            }
            int[] iArr = this.f4944d;
            int i11 = iArr[i8];
            if (i11 == 0) {
                iArr[i10] = 0;
                return;
            }
            if (i11 < 0) {
                iArr[i10] = -1;
            } else {
                int i12 = i11 - 1;
                if (((i(this.f4941a[i12]) - i8) & (h() - 1)) >= i9) {
                    this.f4944d[i10] = i11;
                    this.f4943c[i12] = i10;
                }
                iCoerceAtMost--;
            }
            i10 = i8;
            i9 = 0;
            iCoerceAtMost--;
        } while (iCoerceAtMost >= 0);
        this.f4944d[i10] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(int i8) {
        T6.c.resetAt(this.f4941a, i8);
        o(this.f4943c[i8]);
        this.f4943c[i8] = -1;
        this.f4949i = size() - 1;
        m();
    }

    private final boolean q(int i8) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i9 = this.f4946f;
        int i10 = capacity$kotlin_stdlib - i9;
        int size = i9 - size();
        return i10 < i8 && i10 + size >= i8 && size >= getCapacity$kotlin_stdlib() / 4;
    }

    public final int addKey$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int i8 = i(obj);
            int iCoerceAtMost = s.coerceAtMost(this.f4945e * 2, h() / 2);
            int i9 = 0;
            while (true) {
                int i10 = this.f4944d[i8];
                if (i10 <= 0) {
                    if (this.f4946f < getCapacity$kotlin_stdlib()) {
                        int i11 = this.f4946f;
                        int i12 = i11 + 1;
                        this.f4946f = i12;
                        this.f4941a[i11] = obj;
                        this.f4943c[i11] = i8;
                        this.f4944d[i8] = i12;
                        this.f4949i = size() + 1;
                        m();
                        if (i9 > this.f4945e) {
                            this.f4945e = i9;
                        }
                        return i11;
                    }
                    e(1);
                } else {
                    if (Intrinsics.areEqual(this.f4941a[i10 - 1], obj)) {
                        return -i10;
                    }
                    i9++;
                    if (i9 > iCoerceAtMost) {
                        n(h() * 2);
                        break;
                    }
                    i8 = i8 == 0 ? h() - 1 : i8 - 1;
                }
            }
        }
    }

    public final Map<Object, Object> build() {
        checkIsMutable$kotlin_stdlib();
        this.f4953m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f4940n;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.f4953m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        M it = new l(0, this.f4946f - 1).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int[] iArr = this.f4943c;
            int i8 = iArr[iNextInt];
            if (i8 >= 0) {
                this.f4944d[i8] = 0;
                iArr[iNextInt] = -1;
            }
        }
        T6.c.resetRange(this.f4941a, 0, this.f4946f);
        Object[] objArr = this.f4942b;
        if (objArr != null) {
            T6.c.resetRange(objArr, 0, this.f4946f);
        }
        this.f4949i = 0;
        this.f4946f = 0;
        m();
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m8) {
        Intrinsics.checkNotNullParameter(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<Object, Object> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iF = f(entry.getKey());
        if (iF < 0) {
            return false;
        }
        Object[] objArr = this.f4942b;
        Intrinsics.checkNotNull(objArr);
        return Intrinsics.areEqual(objArr[iF], entry.getValue());
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final b entriesIterator$kotlin_stdlib() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && c((Map) obj));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.f4942b;
        Intrinsics.checkNotNull(objArr);
        return objArr[iF];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.f4941a.length;
    }

    public Set<Map.Entry<Object, Object>> getEntries() {
        T6.e eVar = this.f4952l;
        if (eVar != null) {
            return eVar;
        }
        T6.e eVar2 = new T6.e(this);
        this.f4952l = eVar2;
        return eVar2;
    }

    public Set<Object> getKeys() {
        T6.f fVar = this.f4950j;
        if (fVar != null) {
            return fVar;
        }
        T6.f fVar2 = new T6.f(this);
        this.f4950j = fVar2;
        return fVar2;
    }

    public int getSize() {
        return this.f4949i;
    }

    public Collection<Object> getValues() {
        g gVar = this.f4951k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f4951k = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iNextHashCode$kotlin_stdlib = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            iNextHashCode$kotlin_stdlib += bVarEntriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return iNextHashCode$kotlin_stdlib;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.f4953m;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    public final e keysIterator$kotlin_stdlib() {
        return new e(this);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(obj);
        Object[] objArrA = a();
        if (iAddKey$kotlin_stdlib >= 0) {
            objArrA[iAddKey$kotlin_stdlib] = obj2;
            return null;
        }
        int i8 = (-iAddKey$kotlin_stdlib) - 1;
        Object obj3 = objArrA[i8];
        objArrA[i8] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        j(from.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int iRemoveKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (iRemoveKey$kotlin_stdlib < 0) {
            return null;
        }
        Object[] objArr = this.f4942b;
        Intrinsics.checkNotNull(objArr);
        Object obj2 = objArr[iRemoveKey$kotlin_stdlib];
        T6.c.resetAt(objArr, iRemoveKey$kotlin_stdlib);
        return obj2;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<Object, Object> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iF = f(entry.getKey());
        if (iF < 0) {
            return false;
        }
        Object[] objArr = this.f4942b;
        Intrinsics.checkNotNull(objArr);
        if (!Intrinsics.areEqual(objArr[iF], entry.getValue())) {
            return false;
        }
        p(iF);
        return true;
    }

    public final int removeKey$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iF = f(obj);
        if (iF < 0) {
            return -1;
        }
        p(iF);
        return iF;
    }

    public final boolean removeValue$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        p(iG);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i8 = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i8 > 0) {
                sb.append(", ");
            }
            bVarEntriesIterator$kotlin_stdlib.nextAppendString(sb);
            i8++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public final f valuesIterator$kotlin_stdlib() {
        return new f(this);
    }

    public d() {
        this(8);
    }

    public d(int i8) {
        this(T6.c.arrayOfUninitializedElements(i8), null, new int[i8], new int[Companion.a(i8)], 2, 0);
    }
}
