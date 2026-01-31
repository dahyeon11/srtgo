package j3;

import e3.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5819a {

    /* renamed from: j3.a$a, reason: collision with other inner class name */
    private static class C0331a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final boolean[] f33408a;

        /* renamed from: b, reason: collision with root package name */
        final int f33409b;

        /* renamed from: c, reason: collision with root package name */
        final int f33410c;

        C0331a(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        boolean[] a() {
            return Arrays.copyOfRange(this.f33408a, this.f33409b, this.f33410c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && AbstractC5819a.c(this.f33408a, ((Boolean) obj).booleanValue(), this.f33409b, this.f33410c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0331a)) {
                return super.equals(obj);
            }
            C0331a c0331a = (C0331a) obj;
            int size = size();
            if (c0331a.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.f33408a[this.f33409b + i8] != c0331a.f33408a[c0331a.f33409b + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i8 = this.f33409b; i8 < this.f33410c; i8++) {
                iHashCode = (iHashCode * 31) + AbstractC5819a.hashCode(this.f33408a[i8]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Boolean) || (iC = AbstractC5819a.c(this.f33408a, ((Boolean) obj).booleanValue(), this.f33409b, this.f33410c)) < 0) {
                return -1;
            }
            return iC - this.f33409b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Boolean) || (iD = AbstractC5819a.d(this.f33408a, ((Boolean) obj).booleanValue(), this.f33409b, this.f33410c)) < 0) {
                return -1;
            }
            return iD - this.f33409b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33410c - this.f33409b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i8, int i9) {
            w.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f33408a;
            int i10 = this.f33409b;
            return new C0331a(zArr, i8 + i10, i10 + i9);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.f33408a[this.f33409b] ? "[true" : "[false");
            int i8 = this.f33409b;
            while (true) {
                i8++;
                if (i8 >= this.f33410c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(this.f33408a[i8] ? ", true" : ", false");
            }
        }

        C0331a(boolean[] zArr, int i8, int i9) {
            this.f33408a = zArr;
            this.f33409b = i8;
            this.f33410c = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i8) {
            w.checkElementIndex(i8, size());
            return Boolean.valueOf(this.f33408a[this.f33409b + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i8, Boolean bool) {
            w.checkElementIndex(i8, size());
            boolean[] zArr = this.f33408a;
            int i9 = this.f33409b;
            boolean z8 = zArr[i9 + i8];
            zArr[i9 + i8] = ((Boolean) w.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z8);
        }
    }

    /* renamed from: j3.a$b */
    private enum b implements Comparator {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* renamed from: a, reason: collision with root package name */
        private final int f33412a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33413b;

        b(int i8, String str) {
            this.f33412a = i8;
            this.f33413b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f33413b;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.f33412a : 0) - (bool.booleanValue() ? this.f33412a : 0);
        }
    }

    /* renamed from: j3.a$c */
    private enum c implements Comparator {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i8 = 0; i8 < iMin; i8++) {
                int iCompare = AbstractC5819a.compare(zArr[i8], zArr2[i8]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.emptyList() : new C0331a(zArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(boolean[] zArr, boolean z8, int i8, int i9) {
        while (i8 < i9) {
            if (zArr[i8] == z8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int compare(boolean z8, boolean z9) {
        if (z8 == z9) {
            return 0;
        }
        return z8 ? 1 : -1;
    }

    public static boolean[] concat(boolean[]... zArr) {
        int length = 0;
        for (boolean[] zArr2 : zArr) {
            length += zArr2.length;
        }
        boolean[] zArr3 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z8) {
        for (boolean z9 : zArr) {
            if (z9 == z8) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... zArr) {
        int i8 = 0;
        for (boolean z8 : zArr) {
            if (z8) {
                i8++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(boolean[] zArr, boolean z8, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (zArr[i10] == z8) {
                return i10;
            }
        }
        return -1;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i8, int i9) {
        w.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        w.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return zArr.length < i8 ? Arrays.copyOf(zArr, i8 + i9) : zArr;
    }

    public static Comparator<Boolean> falseFirst() {
        return b.FALSE_FIRST;
    }

    public static int hashCode(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int indexOf(boolean[] zArr, boolean z8) {
        return c(zArr, z8, 0, zArr.length);
    }

    public static String join(String str, boolean... zArr) {
        w.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zArr.length * 7);
        sb.append(zArr[0]);
        for (int i8 = 1; i8 < zArr.length; i8++) {
            sb.append(str);
            sb.append(zArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(boolean[] zArr, boolean z8) {
        return d(zArr, z8, 0, zArr.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return c.INSTANCE;
    }

    public static void reverse(boolean[] zArr) {
        w.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static void rotate(boolean[] zArr, int i8) {
        rotate(zArr, i8, 0, zArr.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof C0331a) {
            return ((C0331a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zArr[i8] = ((Boolean) w.checkNotNull(array[i8])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return b.TRUE_FIRST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(boolean[] r5, boolean[] r6) {
        /*
            java.lang.String r0 = "array"
            e3.w.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            e3.w.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.AbstractC5819a.indexOf(boolean[], boolean[]):int");
    }

    public static void rotate(boolean[] zArr, int i8, int i9, int i10) {
        w.checkNotNull(zArr);
        w.checkPositionIndexes(i9, i10, zArr.length);
        if (zArr.length <= 1) {
            return;
        }
        int i11 = i10 - i9;
        int i12 = (-i8) % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        int i13 = i12 + i9;
        if (i13 == i9) {
            return;
        }
        reverse(zArr, i9, i13);
        reverse(zArr, i13, i10);
        reverse(zArr, i9, i10);
    }

    public static void reverse(boolean[] zArr, int i8, int i9) {
        w.checkNotNull(zArr);
        w.checkPositionIndexes(i8, i9, zArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            boolean z8 = zArr[i8];
            zArr[i8] = zArr[i10];
            zArr[i10] = z8;
            i8++;
        }
    }
}
