package O;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f3341e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f3342f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    private static Object[] f3343g;

    /* renamed from: h, reason: collision with root package name */
    private static int f3344h;

    /* renamed from: i, reason: collision with root package name */
    private static Object[] f3345i;

    /* renamed from: j, reason: collision with root package name */
    private static int f3346j;

    /* renamed from: a, reason: collision with root package name */
    private int[] f3347a;

    /* renamed from: b, reason: collision with root package name */
    Object[] f3348b;

    /* renamed from: c, reason: collision with root package name */
    int f3349c;

    /* renamed from: d, reason: collision with root package name */
    private g f3350d;

    class a extends g {
        a() {
        }

        @Override // O.g
        protected void a() {
            b.this.clear();
        }

        @Override // O.g
        protected Object b(int i8, int i9) {
            return b.this.f3348b[i8];
        }

        @Override // O.g
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // O.g
        protected int d() {
            return b.this.f3349c;
        }

        @Override // O.g
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // O.g
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // O.g
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // O.g
        protected void h(int i8) {
            b.this.removeAt(i8);
        }

        @Override // O.g
        protected Object i(int i8, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i8) {
        if (i8 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f3345i;
                    if (objArr != null) {
                        this.f3348b = objArr;
                        f3345i = (Object[]) objArr[0];
                        this.f3347a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3346j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i8 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f3343g;
                    if (objArr2 != null) {
                        this.f3348b = objArr2;
                        f3343g = (Object[]) objArr2[0];
                        this.f3347a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3344h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3347a = new int[i8];
        this.f3348b = new Object[i8];
    }

    private static void b(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f3346j < 10) {
                        objArr[0] = f3345i;
                        objArr[1] = iArr;
                        for (int i9 = i8 - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f3345i = objArr;
                        f3346j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f3344h < 10) {
                        objArr[0] = f3343g;
                        objArr[1] = iArr;
                        for (int i10 = i8 - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        f3343g = objArr;
                        f3344h++;
                    }
                } finally {
                }
            }
        }
    }

    private g c() {
        if (this.f3350d == null) {
            this.f3350d = new a();
        }
        return this.f3350d;
    }

    private int d(Object obj, int i8) {
        int i9 = this.f3349c;
        if (i9 == 0) {
            return -1;
        }
        int iA = d.a(this.f3347a, i9, i8);
        if (iA < 0 || obj.equals(this.f3348b[iA])) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i9 && this.f3347a[i10] == i8) {
            if (obj.equals(this.f3348b[i10])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f3347a[i11] == i8; i11--) {
            if (obj.equals(this.f3348b[i11])) {
                return i11;
            }
        }
        return ~i10;
    }

    private int e() {
        int i8 = this.f3349c;
        if (i8 == 0) {
            return -1;
        }
        int iA = d.a(this.f3347a, i8, 0);
        if (iA < 0 || this.f3348b[iA] == null) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f3347a[i9] == 0) {
            if (this.f3348b[i9] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f3347a[i10] == 0; i10--) {
            if (this.f3348b[i10] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i8;
        int iD;
        if (obj == null) {
            iD = e();
            i8 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i8 = iHashCode;
            iD = d(obj, iHashCode);
        }
        if (iD >= 0) {
            return false;
        }
        int i9 = ~iD;
        int i10 = this.f3349c;
        int[] iArr = this.f3347a;
        if (i10 >= iArr.length) {
            int i11 = 8;
            if (i10 >= 8) {
                i11 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.f3348b;
            a(i11);
            int[] iArr2 = this.f3347a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3348b, 0, objArr.length);
            }
            b(iArr, objArr, this.f3349c);
        }
        int i12 = this.f3349c;
        if (i9 < i12) {
            int[] iArr3 = this.f3347a;
            int i13 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i13, i12 - i9);
            Object[] objArr2 = this.f3348b;
            System.arraycopy(objArr2, i9, objArr2, i13, this.f3349c - i9);
        }
        this.f3347a[i9] = i8;
        this.f3348b[i9] = obj;
        this.f3349c++;
        return true;
    }

    public void addAll(b bVar) {
        int i8 = bVar.f3349c;
        ensureCapacity(this.f3349c + i8);
        if (this.f3349c != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                add(bVar.valueAt(i9));
            }
        } else if (i8 > 0) {
            System.arraycopy(bVar.f3347a, 0, this.f3347a, 0, i8);
            System.arraycopy(bVar.f3348b, 0, this.f3348b, 0, i8);
            this.f3349c = i8;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i8 = this.f3349c;
        if (i8 != 0) {
            b(this.f3347a, this.f3348b, i8);
            this.f3347a = f3341e;
            this.f3348b = f3342f;
            this.f3349c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void ensureCapacity(int i8) {
        int[] iArr = this.f3347a;
        if (iArr.length < i8) {
            Object[] objArr = this.f3348b;
            a(i8);
            int i9 = this.f3349c;
            if (i9 > 0) {
                System.arraycopy(iArr, 0, this.f3347a, 0, i9);
                System.arraycopy(objArr, 0, this.f3348b, 0, this.f3349c);
            }
            b(iArr, objArr, this.f3349c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f3349c; i8++) {
                try {
                    if (!set.contains(valueAt(i8))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f3347a;
        int i8 = this.f3349c;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += iArr[i10];
        }
        return i9;
    }

    public int indexOf(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f3349c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return c().getKeySet().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public boolean removeAll(b bVar) {
        int i8 = bVar.f3349c;
        int i9 = this.f3349c;
        for (int i10 = 0; i10 < i8; i10++) {
            remove(bVar.valueAt(i10));
        }
        return i9 != this.f3349c;
    }

    public Object removeAt(int i8) {
        Object[] objArr = this.f3348b;
        Object obj = objArr[i8];
        int i9 = this.f3349c;
        if (i9 <= 1) {
            b(this.f3347a, objArr, i9);
            this.f3347a = f3341e;
            this.f3348b = f3342f;
            this.f3349c = 0;
        } else {
            int[] iArr = this.f3347a;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                int i10 = i9 - 1;
                this.f3349c = i10;
                if (i8 < i10) {
                    int i11 = i8 + 1;
                    System.arraycopy(iArr, i11, iArr, i8, i10 - i8);
                    Object[] objArr2 = this.f3348b;
                    System.arraycopy(objArr2, i11, objArr2, i8, this.f3349c - i8);
                }
                this.f3348b[this.f3349c] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                this.f3349c--;
                if (i8 > 0) {
                    System.arraycopy(iArr, 0, this.f3347a, 0, i8);
                    System.arraycopy(objArr, 0, this.f3348b, 0, i8);
                }
                int i12 = this.f3349c;
                if (i8 < i12) {
                    int i13 = i8 + 1;
                    System.arraycopy(iArr, i13, this.f3347a, i8, i12 - i8);
                    System.arraycopy(objArr, i13, this.f3348b, i8, this.f3349c - i8);
                }
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z8 = false;
        for (int i8 = this.f3349c - 1; i8 >= 0; i8--) {
            if (!collection.contains(this.f3348b[i8])) {
                removeAt(i8);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f3349c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i8 = this.f3349c;
        Object[] objArr = new Object[i8];
        System.arraycopy(this.f3348b, 0, objArr, 0, i8);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3349c * 14);
        sb.append('{');
        for (int i8 = 0; i8 < this.f3349c; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object objValueAt = valueAt(i8);
            if (objValueAt != this) {
                sb.append(objValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object valueAt(int i8) {
        return this.f3348b[i8];
    }

    public b(int i8) {
        if (i8 == 0) {
            this.f3347a = f3341e;
            this.f3348b = f3342f;
        } else {
            a(i8);
        }
        this.f3349c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3349c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3349c));
        }
        System.arraycopy(this.f3348b, 0, tArr, 0, this.f3349c);
        int length = tArr.length;
        int i8 = this.f3349c;
        if (length > i8) {
            tArr[i8] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public b(b bVar) {
        this();
        if (bVar != null) {
            addAll(bVar);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<Object> collection) {
        ensureCapacity(this.f3349c + collection.size());
        Iterator<Object> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public b(Collection<Object> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }
}
