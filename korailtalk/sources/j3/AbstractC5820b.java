package j3;

import e3.AbstractC5358c;
import e3.AbstractC5367i;
import e3.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5820b extends AbstractC5821c {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    /* renamed from: j3.b$a */
    private static class a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final int[] f33415a;

        /* renamed from: b, reason: collision with root package name */
        final int f33416b;

        /* renamed from: c, reason: collision with root package name */
        final int f33417c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        int[] a() {
            return Arrays.copyOfRange(this.f33415a, this.f33416b, this.f33417c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && AbstractC5820b.c(this.f33415a, ((Integer) obj).intValue(), this.f33416b, this.f33417c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.f33415a[this.f33416b + i8] != aVar.f33415a[aVar.f33416b + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i8 = this.f33416b; i8 < this.f33417c; i8++) {
                iHashCode = (iHashCode * 31) + AbstractC5820b.hashCode(this.f33415a[i8]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Integer) || (iC = AbstractC5820b.c(this.f33415a, ((Integer) obj).intValue(), this.f33416b, this.f33417c)) < 0) {
                return -1;
            }
            return iC - this.f33416b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Integer) || (iD = AbstractC5820b.d(this.f33415a, ((Integer) obj).intValue(), this.f33416b, this.f33417c)) < 0) {
                return -1;
            }
            return iD - this.f33416b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33417c - this.f33416b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i8, int i9) {
            w.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            int[] iArr = this.f33415a;
            int i10 = this.f33416b;
            return new a(iArr, i8 + i10, i10 + i9);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f33415a[this.f33416b]);
            int i8 = this.f33416b;
            while (true) {
                i8++;
                if (i8 >= this.f33417c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f33415a[i8]);
            }
        }

        a(int[] iArr, int i8, int i9) {
            this.f33415a = iArr;
            this.f33416b = i8;
            this.f33417c = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i8) {
            w.checkElementIndex(i8, size());
            return Integer.valueOf(this.f33415a[this.f33416b + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i8, Integer num) {
            w.checkElementIndex(i8, size());
            int[] iArr = this.f33415a;
            int i9 = this.f33416b;
            int i10 = iArr[i9 + i8];
            iArr[i9 + i8] = ((Integer) w.checkNotNull(num)).intValue();
            return Integer.valueOf(i10);
        }
    }

    /* renamed from: j3.b$b, reason: collision with other inner class name */
    private static final class C0332b extends AbstractC5367i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        static final C0332b f33418c = new C0332b();

        private C0332b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e3.AbstractC5367i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String d(Integer num) {
            return num.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e3.AbstractC5367i
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer e(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* renamed from: j3.b$c */
    private enum c implements Comparator {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i8 = 0; i8 < iMin; i8++) {
                int iCompare = AbstractC5820b.compare(iArr[i8], iArr2[i8]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    public static List<Integer> asList(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int[] iArr, int i8, int i9, int i10) {
        while (i9 < i10) {
            if (iArr[i9] == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int checkedCast(long j8) {
        int i8 = (int) j8;
        w.checkArgument(((long) i8) == j8, "Out of range: %s", j8);
        return i8;
    }

    public static int compare(int i8, int i9) {
        if (i8 < i9) {
            return -1;
        }
        return i8 > i9 ? 1 : 0;
    }

    public static int[] concat(int[]... iArr) {
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int constrainToRange(int i8, int i9, int i10) {
        w.checkArgument(i9 <= i10, "min (%s) must be less than or equal to max (%s)", i9, i10);
        return Math.min(Math.max(i8, i9), i10);
    }

    public static boolean contains(int[] iArr, int i8) {
        for (int i9 : iArr) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int[] iArr, int i8, int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            if (iArr[i11] == i8) {
                return i11;
            }
        }
        return -1;
    }

    public static int[] ensureCapacity(int[] iArr, int i8, int i9) {
        w.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        w.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return iArr.length < i8 ? Arrays.copyOf(iArr, i8 + i9) : iArr;
    }

    public static int fromByteArray(byte[] bArr) {
        w.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int fromBytes(byte b9, byte b10, byte b11, byte b12) {
        return (b9 << AbstractC5358c.CAN) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public static int indexOf(int[] iArr, int i8) {
        return c(iArr, i8, 0, iArr.length);
    }

    public static String join(String str, int... iArr) {
        w.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            sb.append(str);
            sb.append(iArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(int[] iArr, int i8) {
        return d(iArr, i8, 0, iArr.length);
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return c.INSTANCE;
    }

    public static int max(int... iArr) {
        w.checkArgument(iArr.length > 0);
        int i8 = iArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 > i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    public static int min(int... iArr) {
        w.checkArgument(iArr.length > 0);
        int i8 = iArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 < i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    public static void reverse(int[] iArr) {
        w.checkNotNull(iArr);
        reverse(iArr, 0, iArr.length);
    }

    public static void rotate(int[] iArr, int i8) {
        rotate(iArr, i8, 0, iArr.length);
    }

    public static int saturatedCast(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static void sortDescending(int[] iArr) {
        w.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static AbstractC5367i stringConverter() {
        return C0332b.f33418c;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = ((Number) w.checkNotNull(array[i8])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int i8) {
        return new byte[]{(byte) (i8 >> 24), (byte) (i8 >> 16), (byte) (i8 >> 8), (byte) i8};
    }

    public static Integer tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(int[] r5, int[] r6) {
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
            r3 = r5[r3]
            r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: j3.AbstractC5820b.indexOf(int[], int[]):int");
    }

    public static void rotate(int[] iArr, int i8, int i9, int i10) {
        w.checkNotNull(iArr);
        w.checkPositionIndexes(i9, i10, iArr.length);
        if (iArr.length <= 1) {
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
        reverse(iArr, i9, i13);
        reverse(iArr, i13, i10);
        reverse(iArr, i9, i10);
    }

    public static Integer tryParse(String str, int i8) {
        Long lTryParse = AbstractC5822d.tryParse(str, i8);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(lTryParse.intValue());
    }

    public static void reverse(int[] iArr, int i8, int i9) {
        w.checkNotNull(iArr);
        w.checkPositionIndexes(i8, i9, iArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            int i11 = iArr[i8];
            iArr[i8] = iArr[i10];
            iArr[i10] = i11;
            i8++;
        }
    }

    public static void sortDescending(int[] iArr, int i8, int i9) {
        w.checkNotNull(iArr);
        w.checkPositionIndexes(i8, i9, iArr.length);
        Arrays.sort(iArr, i8, i9);
        reverse(iArr, i8, i9);
    }

    public static int hashCode(int i8) {
        return i8;
    }
}
