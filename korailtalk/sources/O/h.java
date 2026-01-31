package O;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: d, reason: collision with root package name */
    static Object[] f3387d;

    /* renamed from: e, reason: collision with root package name */
    static int f3388e;

    /* renamed from: f, reason: collision with root package name */
    static Object[] f3389f;

    /* renamed from: g, reason: collision with root package name */
    static int f3390g;

    /* renamed from: a, reason: collision with root package name */
    int[] f3391a;

    /* renamed from: b, reason: collision with root package name */
    Object[] f3392b;

    /* renamed from: c, reason: collision with root package name */
    int f3393c;

    public h() {
        this.f3391a = d.f3356a;
        this.f3392b = d.f3358c;
        this.f3393c = 0;
    }

    private void a(int i8) {
        if (i8 == 8) {
            synchronized (h.class) {
                try {
                    Object[] objArr = f3389f;
                    if (objArr != null) {
                        this.f3392b = objArr;
                        f3389f = (Object[]) objArr[0];
                        this.f3391a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3390g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i8 == 4) {
            synchronized (h.class) {
                try {
                    Object[] objArr2 = f3387d;
                    if (objArr2 != null) {
                        this.f3392b = objArr2;
                        f3387d = (Object[]) objArr2[0];
                        this.f3391a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3388e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3391a = new int[i8];
        this.f3392b = new Object[i8 << 1];
    }

    private static int b(int[] iArr, int i8, int i9) {
        try {
            return d.a(iArr, i8, i9);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void c(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                try {
                    if (f3390g < 10) {
                        objArr[0] = f3389f;
                        objArr[1] = iArr;
                        for (int i9 = (i8 << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f3389f = objArr;
                        f3390g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                try {
                    if (f3388e < 10) {
                        objArr[0] = f3387d;
                        objArr[1] = iArr;
                        for (int i10 = (i8 << 1) - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        f3387d = objArr;
                        f3388e++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i8 = this.f3393c;
        if (i8 > 0) {
            int[] iArr = this.f3391a;
            Object[] objArr = this.f3392b;
            this.f3391a = d.f3356a;
            this.f3392b = d.f3358c;
            this.f3393c = 0;
            c(iArr, objArr, i8);
        }
        if (this.f3393c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return f(obj) >= 0;
    }

    int d(Object obj, int i8) {
        int i9 = this.f3393c;
        if (i9 == 0) {
            return -1;
        }
        int iB = b(this.f3391a, i9, i8);
        if (iB < 0 || obj.equals(this.f3392b[iB << 1])) {
            return iB;
        }
        int i10 = iB + 1;
        while (i10 < i9 && this.f3391a[i10] == i8) {
            if (obj.equals(this.f3392b[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iB - 1; i11 >= 0 && this.f3391a[i11] == i8; i11--) {
            if (obj.equals(this.f3392b[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    int e() {
        int i8 = this.f3393c;
        if (i8 == 0) {
            return -1;
        }
        int iB = b(this.f3391a, i8, 0);
        if (iB < 0 || this.f3392b[iB << 1] == null) {
            return iB;
        }
        int i9 = iB + 1;
        while (i9 < i8 && this.f3391a[i9] == 0) {
            if (this.f3392b[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iB - 1; i10 >= 0 && this.f3391a[i10] == 0; i10--) {
            if (this.f3392b[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public void ensureCapacity(int i8) {
        int i9 = this.f3393c;
        int[] iArr = this.f3391a;
        if (iArr.length < i8) {
            Object[] objArr = this.f3392b;
            a(i8);
            if (this.f3393c > 0) {
                System.arraycopy(iArr, 0, this.f3391a, 0, i9);
                System.arraycopy(objArr, 0, this.f3392b, 0, i9 << 1);
            }
            c(iArr, objArr, i9);
        }
        if (this.f3393c != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f3393c; i8++) {
                try {
                    Object objKeyAt = keyAt(i8);
                    Object objValueAt = valueAt(i8);
                    Object obj2 = hVar.get(objKeyAt);
                    if (objValueAt == null) {
                        if (obj2 != null || !hVar.containsKey(objKeyAt)) {
                            return false;
                        }
                    } else if (!objValueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f3393c; i9++) {
                try {
                    Object objKeyAt2 = keyAt(i9);
                    Object objValueAt2 = valueAt(i9);
                    Object obj3 = map.get(objKeyAt2);
                    if (objValueAt2 == null) {
                        if (obj3 != null || !map.containsKey(objKeyAt2)) {
                            return false;
                        }
                    } else if (!objValueAt2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    int f(Object obj) {
        int i8 = this.f3393c * 2;
        Object[] objArr = this.f3392b;
        if (obj == null) {
            for (int i9 = 1; i9 < i8; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i8; i10 += 2) {
            if (obj.equals(objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? this.f3392b[(iIndexOfKey << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f3391a;
        Object[] objArr = this.f3392b;
        int i8 = this.f3393c;
        int i9 = 1;
        int i10 = 0;
        int iHashCode = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f3393c <= 0;
    }

    public Object keyAt(int i8) {
        return this.f3392b[i8 << 1];
    }

    public Object put(Object obj, Object obj2) {
        int i8;
        int iD;
        int i9 = this.f3393c;
        if (obj == null) {
            iD = e();
            i8 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i8 = iHashCode;
            iD = d(obj, iHashCode);
        }
        if (iD >= 0) {
            int i10 = (iD << 1) + 1;
            Object[] objArr = this.f3392b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iD;
        int[] iArr = this.f3391a;
        if (i9 >= iArr.length) {
            int i12 = 8;
            if (i9 >= 8) {
                i12 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i12 = 4;
            }
            Object[] objArr2 = this.f3392b;
            a(i12);
            if (i9 != this.f3393c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3391a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f3392b, 0, objArr2.length);
            }
            c(iArr, objArr2, i9);
        }
        if (i11 < i9) {
            int[] iArr3 = this.f3391a;
            int i13 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i13, i9 - i11);
            Object[] objArr3 = this.f3392b;
            System.arraycopy(objArr3, i11 << 1, objArr3, i13 << 1, (this.f3393c - i11) << 1);
        }
        int i14 = this.f3393c;
        if (i9 == i14) {
            int[] iArr4 = this.f3391a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i8;
                Object[] objArr4 = this.f3392b;
                int i15 = i11 << 1;
                objArr4[i15] = obj;
                objArr4[i15 + 1] = obj2;
                this.f3393c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(h hVar) {
        int i8 = hVar.f3393c;
        ensureCapacity(this.f3393c + i8);
        if (this.f3393c != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                put(hVar.keyAt(i9), hVar.valueAt(i9));
            }
        } else if (i8 > 0) {
            System.arraycopy(hVar.f3391a, 0, this.f3391a, 0, i8);
            System.arraycopy(hVar.f3392b, 0, this.f3392b, 0, i8 << 1);
            this.f3393c = i8;
        }
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public Object removeAt(int i8) {
        Object[] objArr = this.f3392b;
        int i9 = i8 << 1;
        Object obj = objArr[i9 + 1];
        int i10 = this.f3393c;
        int i11 = 0;
        if (i10 <= 1) {
            c(this.f3391a, objArr, i10);
            this.f3391a = d.f3356a;
            this.f3392b = d.f3358c;
        } else {
            int i12 = i10 - 1;
            int[] iArr = this.f3391a;
            if (iArr.length <= 8 || i10 >= iArr.length / 3) {
                if (i8 < i12) {
                    int i13 = i8 + 1;
                    int i14 = i12 - i8;
                    System.arraycopy(iArr, i13, iArr, i8, i14);
                    Object[] objArr2 = this.f3392b;
                    System.arraycopy(objArr2, i13 << 1, objArr2, i9, i14 << 1);
                }
                Object[] objArr3 = this.f3392b;
                int i15 = i12 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                a(i10 > 8 ? i10 + (i10 >> 1) : 8);
                if (i10 != this.f3393c) {
                    throw new ConcurrentModificationException();
                }
                if (i8 > 0) {
                    System.arraycopy(iArr, 0, this.f3391a, 0, i8);
                    System.arraycopy(objArr, 0, this.f3392b, 0, i9);
                }
                if (i8 < i12) {
                    int i16 = i8 + 1;
                    int i17 = i12 - i8;
                    System.arraycopy(iArr, i16, this.f3391a, i8, i17);
                    System.arraycopy(objArr, i16 << 1, this.f3392b, i9, i17 << 1);
                }
            }
            i11 = i12;
        }
        if (i10 != this.f3393c) {
            throw new ConcurrentModificationException();
        }
        this.f3393c = i11;
        return obj;
    }

    public Object replace(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, obj2);
        }
        return null;
    }

    public Object setValueAt(int i8, Object obj) {
        int i9 = (i8 << 1) + 1;
        Object[] objArr = this.f3392b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    public int size() {
        return this.f3393c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3393c * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f3393c; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object objKeyAt = keyAt(i8);
            if (objKeyAt != this) {
                sb.append(objKeyAt);
            } else {
                sb.append("(this Map)");
            }
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
        return this.f3392b[(i8 << 1) + 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0) {
            return false;
        }
        Object objValueAt = valueAt(iIndexOfKey);
        if (obj2 != objValueAt && (obj2 == null || !obj2.equals(objValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0) {
            return false;
        }
        Object objValueAt = valueAt(iIndexOfKey);
        if (objValueAt != obj2 && (obj2 == null || !obj2.equals(objValueAt))) {
            return false;
        }
        setValueAt(iIndexOfKey, obj3);
        return true;
    }

    public h(int i8) {
        if (i8 == 0) {
            this.f3391a = d.f3356a;
            this.f3392b = d.f3358c;
        } else {
            a(i8);
        }
        this.f3393c = 0;
    }

    public h(h hVar) {
        this();
        if (hVar != null) {
            putAll(hVar);
        }
    }
}
