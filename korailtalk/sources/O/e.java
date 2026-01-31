package O;

/* loaded from: classes.dex */
public class e implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f3359e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f3360a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f3361b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f3362c;

    /* renamed from: d, reason: collision with root package name */
    private int f3363d;

    public e() {
        this(10);
    }

    private void a() {
        int i8 = this.f3363d;
        long[] jArr = this.f3361b;
        Object[] objArr = this.f3362c;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != f3359e) {
                if (i10 != i9) {
                    jArr[i9] = jArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        this.f3360a = false;
        this.f3363d = i9;
    }

    public void append(long j8, Object obj) {
        int i8 = this.f3363d;
        if (i8 != 0 && j8 <= this.f3361b[i8 - 1]) {
            put(j8, obj);
            return;
        }
        if (this.f3360a && i8 >= this.f3361b.length) {
            a();
        }
        int i9 = this.f3363d;
        if (i9 >= this.f3361b.length) {
            int iIdealLongArraySize = d.idealLongArraySize(i9 + 1);
            long[] jArr = new long[iIdealLongArraySize];
            Object[] objArr = new Object[iIdealLongArraySize];
            long[] jArr2 = this.f3361b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f3362c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3361b = jArr;
            this.f3362c = objArr;
        }
        this.f3361b[i9] = j8;
        this.f3362c[i9] = obj;
        this.f3363d = i9 + 1;
    }

    public void clear() {
        int i8 = this.f3363d;
        Object[] objArr = this.f3362c;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f3363d = 0;
        this.f3360a = false;
    }

    public boolean containsKey(long j8) {
        return indexOfKey(j8) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    @Deprecated
    public void delete(long j8) {
        remove(j8);
    }

    public Object get(long j8) {
        return get(j8, null);
    }

    public int indexOfKey(long j8) {
        if (this.f3360a) {
            a();
        }
        return d.b(this.f3361b, this.f3363d, j8);
    }

    public int indexOfValue(Object obj) {
        if (this.f3360a) {
            a();
        }
        for (int i8 = 0; i8 < this.f3363d; i8++) {
            if (this.f3362c[i8] == obj) {
                return i8;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i8) {
        if (this.f3360a) {
            a();
        }
        return this.f3361b[i8];
    }

    public void put(long j8, Object obj) {
        int iB = d.b(this.f3361b, this.f3363d, j8);
        if (iB >= 0) {
            this.f3362c[iB] = obj;
            return;
        }
        int i8 = ~iB;
        int i9 = this.f3363d;
        if (i8 < i9) {
            Object[] objArr = this.f3362c;
            if (objArr[i8] == f3359e) {
                this.f3361b[i8] = j8;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f3360a && i9 >= this.f3361b.length) {
            a();
            i8 = ~d.b(this.f3361b, this.f3363d, j8);
        }
        int i10 = this.f3363d;
        if (i10 >= this.f3361b.length) {
            int iIdealLongArraySize = d.idealLongArraySize(i10 + 1);
            long[] jArr = new long[iIdealLongArraySize];
            Object[] objArr2 = new Object[iIdealLongArraySize];
            long[] jArr2 = this.f3361b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3362c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3361b = jArr;
            this.f3362c = objArr2;
        }
        int i11 = this.f3363d;
        if (i11 - i8 != 0) {
            long[] jArr3 = this.f3361b;
            int i12 = i8 + 1;
            System.arraycopy(jArr3, i8, jArr3, i12, i11 - i8);
            Object[] objArr4 = this.f3362c;
            System.arraycopy(objArr4, i8, objArr4, i12, this.f3363d - i8);
        }
        this.f3361b[i8] = j8;
        this.f3362c[i8] = obj;
        this.f3363d++;
    }

    public void putAll(e eVar) {
        int size = eVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            put(eVar.keyAt(i8), eVar.valueAt(i8));
        }
    }

    public Object putIfAbsent(long j8, Object obj) {
        Object obj2 = get(j8);
        if (obj2 == null) {
            put(j8, obj);
        }
        return obj2;
    }

    public void remove(long j8) {
        int iB = d.b(this.f3361b, this.f3363d, j8);
        if (iB >= 0) {
            Object[] objArr = this.f3362c;
            Object obj = objArr[iB];
            Object obj2 = f3359e;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f3360a = true;
            }
        }
    }

    public void removeAt(int i8) {
        Object[] objArr = this.f3362c;
        Object obj = objArr[i8];
        Object obj2 = f3359e;
        if (obj != obj2) {
            objArr[i8] = obj2;
            this.f3360a = true;
        }
    }

    public Object replace(long j8, Object obj) {
        int iIndexOfKey = indexOfKey(j8);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.f3362c;
        Object obj2 = objArr[iIndexOfKey];
        objArr[iIndexOfKey] = obj;
        return obj2;
    }

    public void setValueAt(int i8, Object obj) {
        if (this.f3360a) {
            a();
        }
        this.f3362c[i8] = obj;
    }

    public int size() {
        if (this.f3360a) {
            a();
        }
        return this.f3363d;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3363d * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f3363d; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i8));
            sb.append('=');
            Object objValueAt = valueAt(i8);
            if (objValueAt != this) {
                sb.append(objValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object valueAt(int i8) {
        if (this.f3360a) {
            a();
        }
        return this.f3362c[i8];
    }

    public e(int i8) {
        this.f3360a = false;
        if (i8 == 0) {
            this.f3361b = d.f3357b;
            this.f3362c = d.f3358c;
        } else {
            int iIdealLongArraySize = d.idealLongArraySize(i8);
            this.f3361b = new long[iIdealLongArraySize];
            this.f3362c = new Object[iIdealLongArraySize];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public e m9clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f3361b = (long[]) this.f3361b.clone();
            eVar.f3362c = (Object[]) this.f3362c.clone();
            return eVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public Object get(long j8, Object obj) {
        Object obj2;
        int iB = d.b(this.f3361b, this.f3363d, j8);
        return (iB < 0 || (obj2 = this.f3362c[iB]) == f3359e) ? obj : obj2;
    }

    public boolean replace(long j8, Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(j8);
        if (iIndexOfKey < 0) {
            return false;
        }
        Object obj3 = this.f3362c[iIndexOfKey];
        if (obj3 != obj && (obj == null || !obj.equals(obj3))) {
            return false;
        }
        this.f3362c[iIndexOfKey] = obj2;
        return true;
    }

    public boolean remove(long j8, Object obj) {
        int iIndexOfKey = indexOfKey(j8);
        if (iIndexOfKey < 0) {
            return false;
        }
        Object objValueAt = valueAt(iIndexOfKey);
        if (obj != objValueAt && (obj == null || !obj.equals(objValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }
}
