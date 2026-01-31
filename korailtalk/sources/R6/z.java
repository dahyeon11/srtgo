package R6;

import S6.AbstractC0765i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes2.dex */
public final class z implements Collection, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f4497a;

    private static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f4498a;

        /* renamed from: b, reason: collision with root package name */
        private int f4499b;

        public a(int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f4498a = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4499b < this.f4498a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return y.m101boximpl(m125nextpVg5ArA());
        }

        /* renamed from: next-pVg5ArA, reason: not valid java name */
        public int m125nextpVg5ArA() {
            int i8 = this.f4499b;
            int[] iArr = this.f4498a;
            if (i8 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f4499b));
            }
            this.f4499b = i8 + 1;
            return y.m102constructorimpl(iArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(int[] iArr) {
        this.f4497a = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ z m108boximpl(int[] iArr) {
        return new z(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m110constructorimpl(int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m112containsAllimpl(int[] iArr, Collection<y> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<y> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y) || !AbstractC0765i.contains(iArr, ((y) obj).m107unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m113equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof z) && Intrinsics.areEqual(iArr, ((z) obj).m124unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m114equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m115getpVg5ArA(int[] iArr, int i8) {
        return y.m102constructorimpl(iArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m116getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m117hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m118isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<y> m119iteratorimpl(int[] iArr) {
        return new a(iArr);
    }

    /* renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m120setVXSXFK8(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m121toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-WZ4Q5Ns, reason: not valid java name */
    public boolean m122addWZ4Q5Ns(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends y> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y) {
            return m123containsWZ4Q5Ns(((y) obj).m107unboximpl());
        }
        return false;
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m123containsWZ4Q5Ns(int i8) {
        return m111containsWZ4Q5Ns(this.f4497a, i8);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m112containsAllimpl(this.f4497a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m113equalsimpl(this.f4497a, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m116getSizeimpl(this.f4497a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m117hashCodeimpl(this.f4497a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m118isEmptyimpl(this.f4497a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<y> iterator() {
        return m119iteratorimpl(this.f4497a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return m121toStringimpl(this.f4497a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m124unboximpl() {
        return this.f4497a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m109constructorimpl(int i8) {
        return m110constructorimpl(new int[i8]);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m111containsWZ4Q5Ns(int[] iArr, int i8) {
        return AbstractC0765i.contains(iArr, i8);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
