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
public final class E implements Collection, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private final short[] f4467a;

    private static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final short[] f4468a;

        /* renamed from: b, reason: collision with root package name */
        private int f4469b;

        public a(short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f4468a = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4469b < this.f4468a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return D.m37boximpl(m61nextMh2AYeg());
        }

        /* renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m61nextMh2AYeg() {
            int i8 = this.f4469b;
            short[] sArr = this.f4468a;
            if (i8 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f4469b));
            }
            this.f4469b = i8 + 1;
            return D.m38constructorimpl(sArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ E(short[] sArr) {
        this.f4467a = sArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ E m44boximpl(short[] sArr) {
        return new E(sArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m46constructorimpl(short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m48containsAllimpl(short[] sArr, Collection<D> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<D> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof D) || !AbstractC0765i.contains(sArr, ((D) obj).m43unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m49equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof E) && Intrinsics.areEqual(sArr, ((E) obj).m60unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m50equalsimpl0(short[] sArr, short[] sArr2) {
        return Intrinsics.areEqual(sArr, sArr2);
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m51getMh2AYeg(short[] sArr, int i8) {
        return D.m38constructorimpl(sArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m52getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m53hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m54isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<D> m55iteratorimpl(short[] sArr) {
        return new a(sArr);
    }

    /* renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m56set01HTLdE(short[] sArr, int i8, short s8) {
        sArr[i8] = s8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m57toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-xj2QHRw, reason: not valid java name */
    public boolean m58addxj2QHRw(short s8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends D> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof D) {
            return m59containsxj2QHRw(((D) obj).m43unboximpl());
        }
        return false;
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m59containsxj2QHRw(short s8) {
        return m47containsxj2QHRw(this.f4467a, s8);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m48containsAllimpl(this.f4467a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m49equalsimpl(this.f4467a, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m52getSizeimpl(this.f4467a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m53hashCodeimpl(this.f4467a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m54isEmptyimpl(this.f4467a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<D> iterator() {
        return m55iteratorimpl(this.f4467a);
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
        return m57toStringimpl(this.f4467a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m60unboximpl() {
        return this.f4467a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m45constructorimpl(int i8) {
        return m46constructorimpl(new short[i8]);
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m47containsxj2QHRw(short[] sArr, short s8) {
        return AbstractC0765i.contains(sArr, s8);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
