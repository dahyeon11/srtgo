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
public final class B implements Collection, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f4463a;

    private static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final long[] f4464a;

        /* renamed from: b, reason: collision with root package name */
        private int f4465b;

        public a(long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f4464a = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4465b < this.f4464a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return A.m12boximpl(m36nextsVKNKU());
        }

        /* renamed from: next-s-VKNKU, reason: not valid java name */
        public long m36nextsVKNKU() {
            int i8 = this.f4465b;
            long[] jArr = this.f4464a;
            if (i8 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f4465b));
            }
            this.f4465b = i8 + 1;
            return A.m13constructorimpl(jArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ B(long[] jArr) {
        this.f4463a = jArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ B m19boximpl(long[] jArr) {
        return new B(jArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m21constructorimpl(long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m23containsAllimpl(long[] jArr, Collection<A> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<A> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof A) || !AbstractC0765i.contains(jArr, ((A) obj).m18unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof B) && Intrinsics.areEqual(jArr, ((B) obj).m35unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25equalsimpl0(long[] jArr, long[] jArr2) {
        return Intrinsics.areEqual(jArr, jArr2);
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m26getsVKNKU(long[] jArr, int i8) {
        return A.m13constructorimpl(jArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m27getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m29isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<A> m30iteratorimpl(long[] jArr) {
        return new a(jArr);
    }

    /* renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m31setk8EXiF4(long[] jArr, int i8, long j8) {
        jArr[i8] = j8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-VKZWuLQ, reason: not valid java name */
    public boolean m33addVKZWuLQ(long j8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof A) {
            return m34containsVKZWuLQ(((A) obj).m18unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m34containsVKZWuLQ(long j8) {
        return m22containsVKZWuLQ(this.f4463a, j8);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m23containsAllimpl(this.f4463a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m24equalsimpl(this.f4463a, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m27getSizeimpl(this.f4463a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m28hashCodeimpl(this.f4463a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m29isEmptyimpl(this.f4463a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<A> iterator() {
        return m30iteratorimpl(this.f4463a);
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
        return m32toStringimpl(this.f4463a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long[] m35unboximpl() {
        return this.f4463a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m20constructorimpl(int i8) {
        return m21constructorimpl(new long[i8]);
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m22containsVKZWuLQ(long[] jArr, long j8) {
        return AbstractC0765i.contains(jArr, j8);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
