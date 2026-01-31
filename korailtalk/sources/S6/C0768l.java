package S6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S6.l */
/* loaded from: classes3.dex */
public class C0768l extends C0767k {

    /* renamed from: S6.l$a */
    public static final class a extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ byte[] f4728a;

        a(byte[] bArr) {
            this.f4728a = bArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return contains(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4728a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return indexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4728a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return lastIndexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean contains(byte b9) {
            return AbstractC0765i.contains(this.f4728a, b9);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Byte get(int i8) {
            return Byte.valueOf(this.f4728a[i8]);
        }

        public int indexOf(byte b9) {
            return AbstractC0765i.indexOf(this.f4728a, b9);
        }

        public int lastIndexOf(byte b9) {
            return AbstractC0765i.lastIndexOf(this.f4728a, b9);
        }
    }

    /* renamed from: S6.l$b */
    public static final class b extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ short[] f4729a;

        b(short[] sArr) {
            this.f4729a = sArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return contains(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4729a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return indexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4729a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return lastIndexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        public boolean contains(short s8) {
            return AbstractC0765i.contains(this.f4729a, s8);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Short get(int i8) {
            return Short.valueOf(this.f4729a[i8]);
        }

        public int indexOf(short s8) {
            return AbstractC0765i.indexOf(this.f4729a, s8);
        }

        public int lastIndexOf(short s8) {
            return AbstractC0765i.lastIndexOf(this.f4729a, s8);
        }
    }

    /* renamed from: S6.l$c */
    public static final class c extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ int[] f4730a;

        c(int[] iArr) {
            this.f4730a = iArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return contains(((Number) obj).intValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4730a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return indexOf(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4730a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return lastIndexOf(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean contains(int i8) {
            return AbstractC0765i.contains(this.f4730a, i8);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Integer get(int i8) {
            return Integer.valueOf(this.f4730a[i8]);
        }

        public int indexOf(int i8) {
            return AbstractC0765i.indexOf(this.f4730a, i8);
        }

        public int lastIndexOf(int i8) {
            return AbstractC0765i.lastIndexOf(this.f4730a, i8);
        }
    }

    /* renamed from: S6.l$d */
    public static final class d extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ long[] f4731a;

        d(long[] jArr) {
            this.f4731a = jArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return contains(((Number) obj).longValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4731a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return indexOf(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4731a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return lastIndexOf(((Number) obj).longValue());
            }
            return -1;
        }

        public boolean contains(long j8) {
            return AbstractC0765i.contains(this.f4731a, j8);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Long get(int i8) {
            return Long.valueOf(this.f4731a[i8]);
        }

        public int indexOf(long j8) {
            return AbstractC0765i.indexOf(this.f4731a, j8);
        }

        public int lastIndexOf(long j8) {
            return AbstractC0765i.lastIndexOf(this.f4731a, j8);
        }
    }

    /* renamed from: S6.l$e */
    public static final class e extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ float[] f4732a;

        e(float[] fArr) {
            this.f4732a = fArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return contains(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4732a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return indexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4732a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return lastIndexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean contains(float f8) {
            for (float f9 : this.f4732a) {
                if (Float.floatToIntBits(f9) == Float.floatToIntBits(f8)) {
                    return true;
                }
            }
            return false;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Float get(int i8) {
            return Float.valueOf(this.f4732a[i8]);
        }

        public int indexOf(float f8) {
            float[] fArr = this.f4732a;
            int length = fArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (Float.floatToIntBits(fArr[i8]) == Float.floatToIntBits(f8)) {
                    return i8;
                }
            }
            return -1;
        }

        public int lastIndexOf(float f8) {
            float[] fArr = this.f4732a;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i8 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f8)) {
                    return length;
                }
                if (i8 < 0) {
                    return -1;
                }
                length = i8;
            }
        }
    }

    /* renamed from: S6.l$f */
    public static final class f extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ double[] f4733a;

        f(double[] dArr) {
            this.f4733a = dArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return contains(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4733a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return indexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4733a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return lastIndexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        public boolean contains(double d9) {
            for (double d10 : this.f4733a) {
                if (Double.doubleToLongBits(d10) == Double.doubleToLongBits(d9)) {
                    return true;
                }
            }
            return false;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Double get(int i8) {
            return Double.valueOf(this.f4733a[i8]);
        }

        public int indexOf(double d9) {
            double[] dArr = this.f4733a;
            int length = dArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (Double.doubleToLongBits(dArr[i8]) == Double.doubleToLongBits(d9)) {
                    return i8;
                }
            }
            return -1;
        }

        public int lastIndexOf(double d9) {
            double[] dArr = this.f4733a;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i8 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d9)) {
                    return length;
                }
                if (i8 < 0) {
                    return -1;
                }
                length = i8;
            }
        }
    }

    /* renamed from: S6.l$g */
    public static final class g extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ boolean[] f4734a;

        g(boolean[] zArr) {
            this.f4734a = zArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return contains(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4734a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return indexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4734a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return lastIndexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        public boolean contains(boolean z8) {
            return C0769m.contains(this.f4734a, z8);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Boolean get(int i8) {
            return Boolean.valueOf(this.f4734a[i8]);
        }

        public int indexOf(boolean z8) {
            return C0769m.indexOf(this.f4734a, z8);
        }

        public int lastIndexOf(boolean z8) {
            return C0769m.lastIndexOf(this.f4734a, z8);
        }
    }

    /* renamed from: S6.l$h */
    public static final class h extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ char[] f4735a;

        h(char[] cArr) {
            this.f4735a = cArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return contains(((Character) obj).charValue());
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4735a.length;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return this.f4735a.length == 0;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean contains(char c9) {
            return AbstractC0765i.contains(this.f4735a, c9);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Character get(int i8) {
            return Character.valueOf(this.f4735a[i8]);
        }

        public int indexOf(char c9) {
            return C0769m.indexOf(this.f4735a, c9);
        }

        public int lastIndexOf(char c9) {
            return C0769m.lastIndexOf(this.f4735a, c9);
        }
    }

    public static <T> List<T> asList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> listA = AbstractC0772n.a(tArr);
        Intrinsics.checkNotNullExpressionValue(listA, "asList(...)");
        return listA;
    }

    public static final <T> int binarySearch(T[] tArr, T t8, Comparator<? super T> comparator, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i8, i9, t8, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i8, i9);
    }

    public static <T> T[] copyInto(T[] tArr, T[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        return AbstractC0765i.copyInto(objArr, objArr2, i8, i9, i10);
    }

    public static <T> T[] copyOfRange(T[] tArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final <T> void fill(T[] tArr, T t8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i8, i9, t8);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        fill(objArr, obj, i8, i9);
    }

    public static final <R> List<R> filterIsInstance(Object[] objArr, Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Object[] objArr, C destination, Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final /* synthetic */ Double max(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return C0769m.maxOrNull(dArr);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        int lastIndex = C0769m.getLastIndex(tArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(t8);
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                T t9 = tArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(t9);
                if (comparable.compareTo(comparable2) < 0) {
                    t8 = t9;
                    comparable = comparable2;
                }
            }
        }
        return t8;
    }

    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(objArr, comparator);
    }

    public static final /* synthetic */ Double min(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return C0769m.minOrNull(dArr);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        int lastIndex = C0769m.getLastIndex(tArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(t8);
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                T t9 = tArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(t9);
                if (comparable.compareTo(comparable2) > 0) {
                    t8 = t9;
                    comparable = comparable2;
                }
            }
        }
        return t8;
    }

    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(objArr, comparator);
    }

    public static <T> T[] plus(T[] tArr, T t8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t8;
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    public static final void sort(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = comparableArr.length;
        }
        sort(comparableArr, i8, i9);
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        sortWith(objArr, comparator, i8, i9);
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) C0769m.toCollection(tArr, new TreeSet());
    }

    public static final Byte[] toTypedArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = Byte.valueOf(bArr[i8]);
        }
        return bArr2;
    }

    public static final List<Byte> asList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new a(bArr);
    }

    public static final <T> int binarySearch(T[] tArr, T t8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i8, i9, t8);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        return binarySearch(objArr, obj, i8, i9);
    }

    public static byte[] copyInto(byte[] bArr, byte[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = bArr.length;
        }
        return AbstractC0765i.copyInto(bArr, bArr2, i8, i9, i10);
    }

    public static void fill(byte[] bArr, byte b9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i8, i9, b9);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        AbstractC0765i.fill(bArr, b9, i8, i9);
    }

    public static final /* synthetic */ Float max(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return C0769m.maxOrNull(fArr);
    }

    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final /* synthetic */ Float min(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return C0769m.minOrNull(fArr);
    }

    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final void sort(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = bArr.length;
        }
        sort(bArr, i8, i9);
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i8, i9, comparator);
    }

    public static final SortedSet<Byte> toSortedSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) C0769m.toCollection(bArr, new TreeSet());
    }

    public static final List<Short> asList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new b(sArr);
    }

    public static final int binarySearch(byte[] bArr, byte b9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i8, i9, b9);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return binarySearch(bArr, b9, i8, i9);
    }

    public static final short[] copyInto(short[] sArr, short[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(sArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = sArr.length;
        }
        return copyInto(sArr, sArr2, i8, i9, i10);
    }

    public static byte[] copyOfRange(byte[] bArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static void fill(short[] sArr, short s8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i8, i9, s8);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = sArr.length;
        }
        AbstractC0765i.fill(sArr, s8, i8, i9);
    }

    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return C0769m.maxOrNull(comparableArr);
    }

    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return C0769m.minOrNull(comparableArr);
    }

    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final void sort(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = sArr.length;
        }
        sort(sArr, i8, i9);
    }

    public static final SortedSet<Short> toSortedSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (SortedSet) C0769m.toCollection(sArr, new TreeSet());
    }

    public static final List<Integer> asList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new c(iArr);
    }

    public static final int binarySearch(short[] sArr, short s8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i8, i9, s8);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = sArr.length;
        }
        return binarySearch(sArr, s8, i8, i9);
    }

    public static final int[] copyInto(int[] iArr, int[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        return copyInto(iArr, iArr2, i8, i9, i10);
    }

    public static void fill(int[] iArr, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i9, i10, i8);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = iArr.length;
        }
        AbstractC0765i.fill(iArr, i8, i9, i10);
    }

    public static final /* synthetic */ Byte max(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return C0769m.maxOrNull(bArr);
    }

    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final /* synthetic */ Byte min(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return C0769m.minOrNull(bArr);
    }

    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final void sort(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = iArr.length;
        }
        sort(iArr, i8, i9);
    }

    public static final SortedSet<Integer> toSortedSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) C0769m.toCollection(iArr, new TreeSet());
    }

    public static final Short[] toTypedArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            shArr[i8] = Short.valueOf(sArr[i8]);
        }
        return shArr;
    }

    public static final List<Long> asList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new d(jArr);
    }

    public static final int binarySearch(int[] iArr, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i9, i10, i8);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = iArr.length;
        }
        return binarySearch(iArr, i8, i9, i10);
    }

    public static final long[] copyInto(long[] jArr, long[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = jArr.length;
        }
        return copyInto(jArr, jArr2, i8, i9, i10);
    }

    public static short[] copyOfRange(short[] sArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    public static void fill(long[] jArr, long j8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i8, i9, j8);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = jArr.length;
        }
        AbstractC0765i.fill(jArr, j8, i8, i9);
    }

    public static final /* synthetic */ Short max(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return C0769m.maxOrNull(sArr);
    }

    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    public static final /* synthetic */ Short min(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return C0769m.minOrNull(sArr);
    }

    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    public static final byte[] plus(byte[] bArr, byte b9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b9;
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final void sort(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = jArr.length;
        }
        sort(jArr, i8, i9);
    }

    public static final SortedSet<Long> toSortedSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) C0769m.toCollection(jArr, new TreeSet());
    }

    public static final List<Float> asList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new e(fArr);
    }

    public static final int binarySearch(long[] jArr, long j8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i8, i9, j8);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = jArr.length;
        }
        return binarySearch(jArr, j8, i8, i9);
    }

    public static final float[] copyInto(float[] fArr, float[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = fArr.length;
        }
        return copyInto(fArr, fArr2, i8, i9, i10);
    }

    public static final void fill(float[] fArr, float f8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i8, i9, f8);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = fArr.length;
        }
        fill(fArr, f8, i8, i9);
    }

    public static final /* synthetic */ Integer max(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return C0769m.maxOrNull(iArr);
    }

    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final /* synthetic */ Integer min(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return C0769m.minOrNull(iArr);
    }

    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final void sort(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = fArr.length;
        }
        sort(fArr, i8, i9);
    }

    public static final SortedSet<Float> toSortedSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) C0769m.toCollection(fArr, new TreeSet());
    }

    public static final List<Double> asList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new f(dArr);
    }

    public static final int binarySearch(float[] fArr, float f8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i8, i9, f8);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = fArr.length;
        }
        return binarySearch(fArr, f8, i8, i9);
    }

    public static final double[] copyInto(double[] dArr, double[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(dArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = dArr.length;
        }
        return copyInto(dArr, dArr2, i8, i9, i10);
    }

    public static int[] copyOfRange(int[] iArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    public static final void fill(double[] dArr, double d9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i8, i9, d9);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = dArr.length;
        }
        fill(dArr, d9, i8, i9);
    }

    public static final /* synthetic */ Long max(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return C0769m.maxOrNull(jArr);
    }

    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final /* synthetic */ Long min(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return C0769m.minOrNull(jArr);
    }

    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final void sort(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = dArr.length;
        }
        sort(dArr, i8, i9);
    }

    public static final SortedSet<Double> toSortedSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) C0769m.toCollection(dArr, new TreeSet());
    }

    public static final Integer[] toTypedArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            numArr[i8] = Integer.valueOf(iArr[i8]);
        }
        return numArr;
    }

    public static final List<Boolean> asList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new g(zArr);
    }

    public static final int binarySearch(double[] dArr, double d9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i8, i9, d9);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = dArr.length;
        }
        return binarySearch(dArr, d9, i8, i9);
    }

    public static final boolean[] copyInto(boolean[] zArr, boolean[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(zArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = zArr.length;
        }
        return copyInto(zArr, zArr2, i8, i9, i10);
    }

    public static final void fill(boolean[] zArr, boolean z8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i8, i9, z8);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = zArr.length;
        }
        fill(zArr, z8, i8, i9);
    }

    public static final /* synthetic */ Float max(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return C0769m.maxOrNull(fArr);
    }

    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    public static final /* synthetic */ Float min(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return C0769m.minOrNull(fArr);
    }

    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    public static final <T> void sort(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = cArr.length;
        }
        sort(cArr, i8, i9);
    }

    public static final SortedSet<Boolean> toSortedSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) C0769m.toCollection(zArr, new TreeSet());
    }

    public static final List<Character> asList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new h(cArr);
    }

    public static final int binarySearch(char[] cArr, char c9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i8, i9, c9);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = cArr.length;
        }
        return binarySearch(cArr, c9, i8, i9);
    }

    public static final char[] copyInto(char[] cArr, char[] destination, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = cArr.length;
        }
        return copyInto(cArr, cArr2, i8, i9, i10);
    }

    public static long[] copyOfRange(long[] jArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    public static final void fill(char[] cArr, char c9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i8, i9, c9);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = cArr.length;
        }
        fill(cArr, c9, i8, i9);
    }

    public static final /* synthetic */ Double max(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return C0769m.maxOrNull(dArr);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b9);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b10));
            if (comparable.compareTo(comparable2) < 0) {
                b9 = b10;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    public static final /* synthetic */ Double min(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return C0769m.minOrNull(dArr);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b9);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b10));
            if (comparable.compareTo(comparable2) > 0) {
                b9 = b10;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return C0769m.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    public static final short[] plus(short[] sArr, short s8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s8;
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final <T extends Comparable<? super T>> void sort(T[] tArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i8, i9);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = objArr.length;
        }
        sort(objArr, i8, i9);
    }

    public static final SortedSet<Character> toSortedSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (SortedSet) C0769m.toCollection(cArr, new TreeSet());
    }

    public static final /* synthetic */ Character max(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return C0769m.maxOrNull(cArr);
    }

    public static final /* synthetic */ Character min(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return C0769m.minOrNull(cArr);
    }

    public static final void sort(byte[] bArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i8, i9);
    }

    public static final <T> SortedSet<T> toSortedSet(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) C0769m.toCollection(tArr, new TreeSet(comparator));
    }

    public static final Long[] toTypedArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            lArr[i8] = Long.valueOf(jArr[i8]);
        }
        return lArr;
    }

    public static final float[] copyOfRange(float[] fArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static final void sort(short[] sArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i8, i9);
    }

    public static final void sort(int[] iArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i8, i9);
    }

    public static final double[] copyOfRange(double[] dArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    public static final int[] plus(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i8;
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final void sort(long[] jArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i8, i9);
    }

    public static final Float[] toTypedArray(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            fArr2[i8] = Float.valueOf(fArr[i8]);
        }
        return fArr2;
    }

    public static final void sort(float[] fArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.sort(fArr, i8, i9);
    }

    public static final boolean[] copyOfRange(boolean[] zArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    public static final void sort(double[] dArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i8, i9);
    }

    public static final void sort(char[] cArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i8, i9);
    }

    public static final Double[] toTypedArray(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            dArr2[i8] = Double.valueOf(dArr[i8]);
        }
        return dArr2;
    }

    public static final char[] copyOfRange(char[] cArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        C0766j.copyOfRangeToIndexCheck(i9, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i8, i9);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    public static final long[] plus(long[] jArr, long j8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j8;
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final <T> void sort(T[] tArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i8, i9);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s8);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s9));
            if (comparable.compareTo(comparable2) < 0) {
                s8 = s9;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s8);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s9));
            if (comparable.compareTo(comparable2) > 0) {
                s8 = s9;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s8);
    }

    public static final Boolean[] toTypedArray(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            boolArr[i8] = Boolean.valueOf(zArr[i8]);
        }
        return boolArr;
    }

    public static final float[] plus(float[] fArr, float f8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f8;
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final Character[] toTypedArray(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            chArr[i8] = Character.valueOf(cArr[i8]);
        }
        return chArr;
    }

    public static final double[] plus(double[] dArr, double d9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d9;
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) < 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) > 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final boolean[] plus(boolean[] zArr, boolean z8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z8;
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static final char[] plus(char[] cArr, char c9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c9;
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final <T> T[] plus(T[] tArr, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) < 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) > 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final byte[] plus(byte[] bArr, Collection<Byte> elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final short[] plus(short[] sArr, Collection<Short> elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = C0769m.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) < 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = C0769m.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) > 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    public static final int[] plus(int[] iArr, Collection<Integer> elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final long[] plus(long[] jArr, Collection<Long> elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final float[] plus(float[] fArr, Collection<Float> elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d9 = dArr[0];
        int lastIndex = C0769m.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d9);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d10 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d10));
            if (comparable.compareTo(comparable2) < 0) {
                d9 = d10;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d9);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d9 = dArr[0];
        int lastIndex = C0769m.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d9);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d10 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d10));
            if (comparable.compareTo(comparable2) > 0) {
                d9 = d10;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d9);
    }

    public static final double[] plus(double[] dArr, Collection<Double> elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final boolean[] plus(boolean[] zArr, Collection<Boolean> elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z8 = zArr[0];
        int lastIndex = C0769m.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z8);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z9 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z9));
            if (comparable.compareTo(comparable2) < 0) {
                z8 = z9;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z8 = zArr[0];
        int lastIndex = C0769m.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z8);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z9 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z9));
            if (comparable.compareTo(comparable2) > 0) {
                z8 = z9;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z8);
    }

    public static final char[] plus(char[] cArr, Collection<Character> elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final <T> T[] plus(T[] tArr, T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    public static final byte[] plus(byte[] bArr, byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        int lastIndex = C0769m.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c9);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c10));
            if (comparable.compareTo(comparable2) < 0) {
                c9 = c10;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c9);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        int lastIndex = C0769m.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c9);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c10));
            if (comparable.compareTo(comparable2) > 0) {
                c9 = c10;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c9);
    }

    public static final short[] plus(short[] sArr, short[] elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, sArrCopyOf, length, length2);
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final int[] plus(int[] iArr, int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final long[] plus(long[] jArr, long[] elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final float[] plus(float[] fArr, float[] elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final double[] plus(double[] dArr, double[] elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final boolean[] plus(boolean[] zArr, boolean[] elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static final char[] plus(char[] cArr, char[] elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }
}
