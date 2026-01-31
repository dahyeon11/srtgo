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
public final class x implements Collection, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4493a;

    private static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f4494a;

        /* renamed from: b, reason: collision with root package name */
        private int f4495b;

        public a(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f4494a = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4495b < this.f4494a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return w.m76boximpl(m100nextw2LRezQ());
        }

        /* renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m100nextw2LRezQ() {
            int i8 = this.f4495b;
            byte[] bArr = this.f4494a;
            if (i8 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f4495b));
            }
            this.f4495b = i8 + 1;
            return w.m77constructorimpl(bArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ x(byte[] bArr) {
        this.f4493a = bArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x m83boximpl(byte[] bArr) {
        return new x(bArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m85constructorimpl(byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m87containsAllimpl(byte[] bArr, Collection<w> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<w> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof w) || !AbstractC0765i.contains(bArr, ((w) obj).m82unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m88equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof x) && Intrinsics.areEqual(bArr, ((x) obj).m99unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m89equalsimpl0(byte[] bArr, byte[] bArr2) {
        return Intrinsics.areEqual(bArr, bArr2);
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m90getw2LRezQ(byte[] bArr, int i8) {
        return w.m77constructorimpl(bArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m91getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m92hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m93isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<w> m94iteratorimpl(byte[] bArr) {
        return new a(bArr);
    }

    /* renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m95setVurrAj0(byte[] bArr, int i8, byte b9) {
        bArr[i8] = b9;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m96toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-7apg3OU, reason: not valid java name */
    public boolean m97add7apg3OU(byte b9) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends w> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof w) {
            return m98contains7apg3OU(((w) obj).m82unboximpl());
        }
        return false;
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m98contains7apg3OU(byte b9) {
        return m86contains7apg3OU(this.f4493a, b9);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m87containsAllimpl(this.f4493a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m88equalsimpl(this.f4493a, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m91getSizeimpl(this.f4493a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m92hashCodeimpl(this.f4493a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m93isEmptyimpl(this.f4493a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<w> iterator() {
        return m94iteratorimpl(this.f4493a);
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
        return m96toStringimpl(this.f4493a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m99unboximpl() {
        return this.f4493a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m84constructorimpl(int i8) {
        return m85constructorimpl(new byte[i8]);
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m86contains7apg3OU(byte[] bArr, byte b9) {
        return AbstractC0765i.contains(bArr, b9);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
