package j3;

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

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5822d {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    /* renamed from: j3.d$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f33420a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i8 = 0; i8 < 10; i8++) {
                bArr[i8 + 48] = (byte) i8;
            }
            for (int i9 = 0; i9 < 26; i9++) {
                byte b9 = (byte) (i9 + 10);
                bArr[i9 + 65] = b9;
                bArr[i9 + 97] = b9;
            }
            f33420a = bArr;
        }

        static int a(char c9) {
            if (c9 < 128) {
                return f33420a[c9];
            }
            return -1;
        }
    }

    /* renamed from: j3.d$b */
    private enum b implements Comparator {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i8 = 0; i8 < iMin; i8++) {
                int iCompare = AbstractC5822d.compare(jArr[i8], jArr2[i8]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* renamed from: j3.d$c */
    private static class c extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final long[] f33422a;

        /* renamed from: b, reason: collision with root package name */
        final int f33423b;

        /* renamed from: c, reason: collision with root package name */
        final int f33424c;

        c(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        long[] a() {
            return Arrays.copyOfRange(this.f33422a, this.f33423b, this.f33424c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && AbstractC5822d.c(this.f33422a, ((Long) obj).longValue(), this.f33423b, this.f33424c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            c cVar = (c) obj;
            int size = size();
            if (cVar.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.f33422a[this.f33423b + i8] != cVar.f33422a[cVar.f33423b + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i8 = this.f33423b; i8 < this.f33424c; i8++) {
                iHashCode = (iHashCode * 31) + AbstractC5822d.hashCode(this.f33422a[i8]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Long) || (iC = AbstractC5822d.c(this.f33422a, ((Long) obj).longValue(), this.f33423b, this.f33424c)) < 0) {
                return -1;
            }
            return iC - this.f33423b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Long) || (iD = AbstractC5822d.d(this.f33422a, ((Long) obj).longValue(), this.f33423b, this.f33424c)) < 0) {
                return -1;
            }
            return iD - this.f33423b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33424c - this.f33423b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i8, int i9) {
            w.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            long[] jArr = this.f33422a;
            int i10 = this.f33423b;
            return new c(jArr, i8 + i10, i10 + i9);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f33422a[this.f33423b]);
            int i8 = this.f33423b;
            while (true) {
                i8++;
                if (i8 >= this.f33424c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f33422a[i8]);
            }
        }

        c(long[] jArr, int i8, int i9) {
            this.f33422a = jArr;
            this.f33423b = i8;
            this.f33424c = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i8) {
            w.checkElementIndex(i8, size());
            return Long.valueOf(this.f33422a[this.f33423b + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i8, Long l8) {
            w.checkElementIndex(i8, size());
            long[] jArr = this.f33422a;
            int i9 = this.f33423b;
            long j8 = jArr[i9 + i8];
            jArr[i9 + i8] = ((Long) w.checkNotNull(l8)).longValue();
            return Long.valueOf(j8);
        }
    }

    /* renamed from: j3.d$d, reason: collision with other inner class name */
    private static final class C0333d extends AbstractC5367i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        static final C0333d f33425c = new C0333d();

        private C0333d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e3.AbstractC5367i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String d(Long l8) {
            return l8.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e3.AbstractC5367i
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Long e(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.emptyList() : new c(jArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(long[] jArr, long j8, int i8, int i9) {
        while (i8 < i9) {
            if (jArr[i8] == j8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int compare(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 > j9 ? 1 : 0;
    }

    public static long[] concat(long[]... jArr) {
        int length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        long[] jArr3 = new long[length];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static long constrainToRange(long j8, long j9, long j10) {
        w.checkArgument(j9 <= j10, "min (%s) must be less than or equal to max (%s)", j9, j10);
        return Math.min(Math.max(j8, j9), j10);
    }

    public static boolean contains(long[] jArr, long j8) {
        for (long j9 : jArr) {
            if (j9 == j8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(long[] jArr, long j8, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (jArr[i10] == j8) {
                return i10;
            }
        }
        return -1;
    }

    public static long[] ensureCapacity(long[] jArr, int i8, int i9) {
        w.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        w.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return jArr.length < i8 ? Arrays.copyOf(jArr, i8 + i9) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        w.checkArgument(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b9, byte b10, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16) {
        return ((b10 & 255) << 48) | ((b9 & 255) << 56) | ((b11 & 255) << 40) | ((b12 & 255) << 32) | ((b13 & 255) << 24) | ((b14 & 255) << 16) | ((b15 & 255) << 8) | (b16 & 255);
    }

    public static int hashCode(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int indexOf(long[] jArr, long j8) {
        return c(jArr, j8, 0, jArr.length);
    }

    public static String join(String str, long... jArr) {
        w.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 10);
        sb.append(jArr[0]);
        for (int i8 = 1; i8 < jArr.length; i8++) {
            sb.append(str);
            sb.append(jArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        return d(jArr, j8, 0, jArr.length);
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return b.INSTANCE;
    }

    public static long max(long... jArr) {
        w.checkArgument(jArr.length > 0);
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 > j8) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static long min(long... jArr) {
        w.checkArgument(jArr.length > 0);
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 < j8) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static void reverse(long[] jArr) {
        w.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void rotate(long[] jArr, int i8) {
        rotate(jArr, i8, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        w.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static AbstractC5367i stringConverter() {
        return C0333d.f33425c;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof c) {
            return ((c) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = ((Number) w.checkNotNull(array[i8])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j8) {
        byte[] bArr = new byte[8];
        for (int i8 = 7; i8 >= 0; i8--) {
            bArr[i8] = (byte) (255 & j8);
            j8 >>= 8;
        }
        return bArr;
    }

    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(long[] r7, long[] r8) {
        /*
            java.lang.String r0 = "array"
            e3.w.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            e3.w.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.AbstractC5822d.indexOf(long[], long[]):int");
    }

    public static void rotate(long[] jArr, int i8, int i9, int i10) {
        w.checkNotNull(jArr);
        w.checkPositionIndexes(i9, i10, jArr.length);
        if (jArr.length <= 1) {
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
        reverse(jArr, i9, i13);
        reverse(jArr, i13, i10);
        reverse(jArr, i9, i10);
    }

    public static Long tryParse(String str, int i8) {
        if (((String) w.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i8 < 2 || i8 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i8);
        }
        int i9 = str.charAt(0) == '-' ? 1 : 0;
        if (i9 == str.length()) {
            return null;
        }
        int i10 = i9 + 1;
        int iA = a.a(str.charAt(i9));
        if (iA < 0 || iA >= i8) {
            return null;
        }
        long j8 = -iA;
        long j9 = i8;
        long j10 = Long.MIN_VALUE / j9;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            int iA2 = a.a(str.charAt(i10));
            if (iA2 < 0 || iA2 >= i8 || j8 < j10) {
                return null;
            }
            long j11 = j8 * j9;
            long j12 = iA2;
            if (j11 < j12 - Long.MIN_VALUE) {
                return null;
            }
            j8 = j11 - j12;
            i10 = i11;
        }
        if (i9 != 0) {
            return Long.valueOf(j8);
        }
        if (j8 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j8);
    }

    public static void reverse(long[] jArr, int i8, int i9) {
        w.checkNotNull(jArr);
        w.checkPositionIndexes(i8, i9, jArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            long j8 = jArr[i8];
            jArr[i8] = jArr[i10];
            jArr[i10] = j8;
            i8++;
        }
    }

    public static void sortDescending(long[] jArr, int i8, int i9) {
        w.checkNotNull(jArr);
        w.checkPositionIndexes(i8, i9, jArr.length);
        Arrays.sort(jArr, i8, i9);
        reverse(jArr, i8, i9);
    }
}
