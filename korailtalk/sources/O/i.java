package O;

/* loaded from: classes.dex */
public class i implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f3394e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f3395a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f3396b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f3397c;

    /* renamed from: d, reason: collision with root package name */
    private int f3398d;

    public i() {
        this(10);
    }

    private void a() {
        int i8 = this.f3398d;
        int[] iArr = this.f3396b;
        Object[] objArr = this.f3397c;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != f3394e) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        this.f3395a = false;
        this.f3398d = i9;
    }

    public void append(int i8, Object obj) {
        int i9 = this.f3398d;
        if (i9 != 0 && i8 <= this.f3396b[i9 - 1]) {
            put(i8, obj);
            return;
        }
        if (this.f3395a && i9 >= this.f3396b.length) {
            a();
        }
        int i10 = this.f3398d;
        if (i10 >= this.f3396b.length) {
            int iIdealIntArraySize = d.idealIntArraySize(i10 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            Object[] objArr = new Object[iIdealIntArraySize];
            int[] iArr2 = this.f3396b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f3397c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3396b = iArr;
            this.f3397c = objArr;
        }
        this.f3396b[i10] = i8;
        this.f3397c[i10] = obj;
        this.f3398d = i10 + 1;
    }

    public void clear() {
        int i8 = this.f3398d;
        Object[] objArr = this.f3397c;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f3398d = 0;
        this.f3395a = false;
    }

    public boolean containsKey(int i8) {
        return indexOfKey(i8) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    @Deprecated
    public void delete(int i8) {
        remove(i8);
    }

    public Object get(int i8) {
        return get(i8, null);
    }

    public int indexOfKey(int i8) {
        if (this.f3395a) {
            a();
        }
        return d.a(this.f3396b, this.f3398d, i8);
    }

    public int indexOfValue(Object obj) {
        if (this.f3395a) {
            a();
        }
        for (int i8 = 0; i8 < this.f3398d; i8++) {
            if (this.f3397c[i8] == obj) {
                return i8;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i8) {
        if (this.f3395a) {
            a();
        }
        return this.f3396b[i8];
    }

    public void put(int i8, Object obj) {
        int iA = d.a(this.f3396b, this.f3398d, i8);
        if (iA >= 0) {
            this.f3397c[iA] = obj;
            return;
        }
        int i9 = ~iA;
        int i10 = this.f3398d;
        if (i9 < i10) {
            Object[] objArr = this.f3397c;
            if (objArr[i9] == f3394e) {
                this.f3396b[i9] = i8;
                objArr[i9] = obj;
                return;
            }
        }
        if (this.f3395a && i10 >= this.f3396b.length) {
            a();
            i9 = ~d.a(this.f3396b, this.f3398d, i8);
        }
        int i11 = this.f3398d;
        if (i11 >= this.f3396b.length) {
            int iIdealIntArraySize = d.idealIntArraySize(i11 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            Object[] objArr2 = new Object[iIdealIntArraySize];
            int[] iArr2 = this.f3396b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3397c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3396b = iArr;
            this.f3397c = objArr2;
        }
        int i12 = this.f3398d;
        if (i12 - i9 != 0) {
            int[] iArr3 = this.f3396b;
            int i13 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i13, i12 - i9);
            Object[] objArr4 = this.f3397c;
            System.arraycopy(objArr4, i9, objArr4, i13, this.f3398d - i9);
        }
        this.f3396b[i9] = i8;
        this.f3397c[i9] = obj;
        this.f3398d++;
    }

    public void putAll(i iVar) {
        int size = iVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            put(iVar.keyAt(i8), iVar.valueAt(i8));
        }
    }

    public Object putIfAbsent(int i8, Object obj) {
        Object obj2 = get(i8);
        if (obj2 == null) {
            put(i8, obj);
        }
        return obj2;
    }

    public void remove(int i8) {
        int iA = d.a(this.f3396b, this.f3398d, i8);
        if (iA >= 0) {
            Object[] objArr = this.f3397c;
            Object obj = objArr[iA];
            Object obj2 = f3394e;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f3395a = true;
            }
        }
    }

    public void removeAt(int i8) {
        Object[] objArr = this.f3397c;
        Object obj = objArr[i8];
        Object obj2 = f3394e;
        if (obj != obj2) {
            objArr[i8] = obj2;
            this.f3395a = true;
        }
    }

    public void removeAtRange(int i8, int i9) {
        int iMin = Math.min(this.f3398d, i9 + i8);
        while (i8 < iMin) {
            removeAt(i8);
            i8++;
        }
    }

    public Object replace(int i8, Object obj) {
        int iIndexOfKey = indexOfKey(i8);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.f3397c;
        Object obj2 = objArr[iIndexOfKey];
        objArr[iIndexOfKey] = obj;
        return obj2;
    }

    public void setValueAt(int i8, Object obj) {
        if (this.f3395a) {
            a();
        }
        this.f3397c[i8] = obj;
    }

    public int size() {
        if (this.f3395a) {
            a();
        }
        return this.f3398d;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3398d * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f3398d; i8++) {
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
        if (this.f3395a) {
            a();
        }
        return this.f3397c[i8];
    }

    public i(int i8) {
        this.f3395a = false;
        if (i8 == 0) {
            this.f3396b = d.f3356a;
            this.f3397c = d.f3358c;
        } else {
            int iIdealIntArraySize = d.idealIntArraySize(i8);
            this.f3396b = new int[iIdealIntArraySize];
            this.f3397c = new Object[iIdealIntArraySize];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public i m10clone() {
        try {
            i iVar = (i) super.clone();
            iVar.f3396b = (int[]) this.f3396b.clone();
            iVar.f3397c = (Object[]) this.f3397c.clone();
            return iVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public Object get(int i8, Object obj) {
        Object obj2;
        int iA = d.a(this.f3396b, this.f3398d, i8);
        return (iA < 0 || (obj2 = this.f3397c[iA]) == f3394e) ? obj : obj2;
    }

    public boolean replace(int i8, Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(i8);
        if (iIndexOfKey < 0) {
            return false;
        }
        Object obj3 = this.f3397c[iIndexOfKey];
        if (obj3 != obj && (obj == null || !obj.equals(obj3))) {
            return false;
        }
        this.f3397c[iIndexOfKey] = obj2;
        return true;
    }

    public boolean remove(int i8, Object obj) {
        int iIndexOfKey = indexOfKey(i8);
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
