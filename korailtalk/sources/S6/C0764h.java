package S6;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S6.h */
/* loaded from: classes3.dex */
public final class C0764h extends AbstractC0761e {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final Object[] f4707d = new Object[0];

    /* renamed from: a */
    private int f4708a;

    /* renamed from: b */
    private Object[] f4709b;

    /* renamed from: c */
    private int f4710c;

    /* renamed from: S6.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C0764h(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = f4707d;
        } else {
            if (i8 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i8);
            }
            objArr = new Object[i8];
        }
        this.f4709b = objArr;
    }

    private final void a(int i8, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f4709b.length;
        while (i8 < length && it.hasNext()) {
            this.f4709b[i8] = it.next();
            i8++;
        }
        int i9 = this.f4708a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f4709b[i10] = it.next();
        }
        this.f4710c = size() + collection.size();
    }

    private final void b(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.f4709b;
        AbstractC0765i.copyInto(objArr2, objArr, 0, this.f4708a, objArr2.length);
        Object[] objArr3 = this.f4709b;
        int length = objArr3.length;
        int i9 = this.f4708a;
        AbstractC0765i.copyInto(objArr3, objArr, length - i9, 0, i9);
        this.f4708a = 0;
        this.f4709b = objArr;
    }

    private final int c(int i8) {
        return i8 == 0 ? C0769m.getLastIndex(this.f4709b) : i8 - 1;
    }

    private final void d(int i8) {
        if (i8 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f4709b;
        if (i8 <= objArr.length) {
            return;
        }
        if (objArr == f4707d) {
            this.f4709b = new Object[j7.s.coerceAtLeast(i8, 10)];
        } else {
            b(AbstractC0759c.Companion.newCapacity$kotlin_stdlib(objArr.length, i8));
        }
    }

    private final int e(int i8) {
        if (i8 == C0769m.getLastIndex(this.f4709b)) {
            return 0;
        }
        return i8 + 1;
    }

    private final int f(int i8) {
        return i8 < 0 ? i8 + this.f4709b.length : i8;
    }

    private final int g(int i8) {
        Object[] objArr = this.f4709b;
        return i8 >= objArr.length ? i8 - objArr.length : i8;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        d(size() + elements.size());
        a(g(this.f4708a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        d(size() + 1);
        int iC = c(this.f4708a);
        this.f4708a = iC;
        this.f4709b[iC] = obj;
        this.f4710c = size() + 1;
    }

    public final void addLast(Object obj) {
        d(size() + 1);
        this.f4709b[g(this.f4708a + size())] = obj;
        this.f4710c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iG = g(this.f4708a + size());
        int i8 = this.f4708a;
        if (i8 < iG) {
            C0768l.fill(this.f4709b, (Object) null, i8, iG);
        } else if (!isEmpty()) {
            Object[] objArr = this.f4709b;
            C0768l.fill(objArr, (Object) null, this.f4708a, objArr.length);
            C0768l.fill(this.f4709b, (Object) null, 0, iG);
        }
        this.f4708a = 0;
        this.f4710c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f4709b[this.f4708a];
    }

    public final Object firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.f4709b[this.f4708a];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        return this.f4709b[g(this.f4708a + i8)];
    }

    @Override // S6.AbstractC0761e
    public int getSize() {
        return this.f4710c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i8;
        int iG = g(this.f4708a + size());
        int length = this.f4708a;
        if (length < iG) {
            while (length < iG) {
                if (Intrinsics.areEqual(obj, this.f4709b[length])) {
                    i8 = this.f4708a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iG) {
            return -1;
        }
        int length2 = this.f4709b.length;
        while (true) {
            if (length >= length2) {
                for (int i9 = 0; i9 < iG; i9++) {
                    if (Intrinsics.areEqual(obj, this.f4709b[i9])) {
                        length = i9 + this.f4709b.length;
                        i8 = this.f4708a;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.f4709b[length])) {
                i8 = this.f4708a;
                break;
            }
            length++;
        }
        return length - i8;
    }

    public final void internalStructure$kotlin_stdlib(f7.p structure) {
        int i8;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i8 = this.f4708a) < g(this.f4708a + size())) ? this.f4708a : i8 - this.f4709b.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f4709b[g(this.f4708a + r.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i8;
        int iG = g(this.f4708a + size());
        int i9 = this.f4708a;
        if (i9 < iG) {
            lastIndex = iG - 1;
            if (i9 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.f4709b[lastIndex])) {
                    if (lastIndex != i9) {
                        lastIndex--;
                    }
                }
                i8 = this.f4708a;
                return lastIndex - i8;
            }
            return -1;
        }
        if (i9 > iG) {
            int i10 = iG - 1;
            while (true) {
                if (-1 >= i10) {
                    lastIndex = C0769m.getLastIndex(this.f4709b);
                    int i11 = this.f4708a;
                    if (i11 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.f4709b[lastIndex])) {
                            if (lastIndex != i11) {
                                lastIndex--;
                            }
                        }
                        i8 = this.f4708a;
                    }
                } else {
                    if (Intrinsics.areEqual(obj, this.f4709b[i10])) {
                        lastIndex = i10 + this.f4709b.length;
                        i8 = this.f4708a;
                        break;
                    }
                    i10--;
                }
            }
            return lastIndex - i8;
        }
        return -1;
    }

    public final Object lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.f4709b[g(this.f4708a + r.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int iG;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f4709b.length != 0) {
            int iG2 = g(this.f4708a + size());
            int i8 = this.f4708a;
            if (i8 < iG2) {
                iG = i8;
                while (i8 < iG2) {
                    Object obj = this.f4709b[i8];
                    if (elements.contains(obj)) {
                        z8 = true;
                    } else {
                        this.f4709b[iG] = obj;
                        iG++;
                    }
                    i8++;
                }
                C0768l.fill(this.f4709b, (Object) null, iG, iG2);
            } else {
                int length = this.f4709b.length;
                boolean z9 = false;
                int i9 = i8;
                while (i8 < length) {
                    Object[] objArr = this.f4709b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        z9 = true;
                    } else {
                        this.f4709b[i9] = obj2;
                        i9++;
                    }
                    i8++;
                }
                iG = g(i9);
                for (int i10 = 0; i10 < iG2; i10++) {
                    Object[] objArr2 = this.f4709b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        z9 = true;
                    } else {
                        this.f4709b[iG] = obj3;
                        iG = e(iG);
                    }
                }
                z8 = z9;
            }
            if (z8) {
                this.f4710c = f(iG - this.f4708a);
            }
        }
        return z8;
    }

    @Override // S6.AbstractC0761e
    public Object removeAt(int i8) {
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        if (i8 == r.getLastIndex(this)) {
            return removeLast();
        }
        if (i8 == 0) {
            return removeFirst();
        }
        int iG = g(this.f4708a + i8);
        Object obj = this.f4709b[iG];
        if (i8 < (size() >> 1)) {
            int i9 = this.f4708a;
            if (iG >= i9) {
                Object[] objArr = this.f4709b;
                AbstractC0765i.copyInto(objArr, objArr, i9 + 1, i9, iG);
            } else {
                Object[] objArr2 = this.f4709b;
                AbstractC0765i.copyInto(objArr2, objArr2, 1, 0, iG);
                Object[] objArr3 = this.f4709b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.f4708a;
                AbstractC0765i.copyInto(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.f4709b;
            int i11 = this.f4708a;
            objArr4[i11] = null;
            this.f4708a = e(i11);
        } else {
            int iG2 = g(this.f4708a + r.getLastIndex(this));
            if (iG <= iG2) {
                Object[] objArr5 = this.f4709b;
                AbstractC0765i.copyInto(objArr5, objArr5, iG, iG + 1, iG2 + 1);
            } else {
                Object[] objArr6 = this.f4709b;
                AbstractC0765i.copyInto(objArr6, objArr6, iG, iG + 1, objArr6.length);
                Object[] objArr7 = this.f4709b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0765i.copyInto(objArr7, objArr7, 0, 1, iG2 + 1);
            }
            this.f4709b[iG2] = null;
        }
        this.f4710c = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f4709b;
        int i8 = this.f4708a;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f4708a = e(i8);
        this.f4710c = size() - 1;
        return obj;
    }

    public final Object removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iG = g(this.f4708a + r.getLastIndex(this));
        Object[] objArr = this.f4709b;
        Object obj = objArr[iG];
        objArr[iG] = null;
        this.f4710c = size() - 1;
        return obj;
    }

    public final Object removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int iG;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f4709b.length != 0) {
            int iG2 = g(this.f4708a + size());
            int i8 = this.f4708a;
            if (i8 < iG2) {
                iG = i8;
                while (i8 < iG2) {
                    Object obj = this.f4709b[i8];
                    if (elements.contains(obj)) {
                        this.f4709b[iG] = obj;
                        iG++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                C0768l.fill(this.f4709b, (Object) null, iG, iG2);
            } else {
                int length = this.f4709b.length;
                boolean z9 = false;
                int i9 = i8;
                while (i8 < length) {
                    Object[] objArr = this.f4709b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        this.f4709b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                iG = g(i9);
                for (int i10 = 0; i10 < iG2; i10++) {
                    Object[] objArr2 = this.f4709b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.f4709b[iG] = obj3;
                        iG = e(iG);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                this.f4710c = f(iG - this.f4708a);
            }
        }
        return z8;
    }

    @Override // S6.AbstractC0761e, java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        int iG = g(this.f4708a + i8);
        Object[] objArr = this.f4709b;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) C0766j.arrayOfNulls(array, size());
        }
        int iG = g(this.f4708a + size());
        int i8 = this.f4708a;
        if (i8 < iG) {
            AbstractC0765i.copyInto$default(this.f4709b, array, 0, i8, iG, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f4709b;
            AbstractC0765i.copyInto(objArr, array, 0, this.f4708a, objArr.length);
            Object[] objArr2 = this.f4709b;
            AbstractC0765i.copyInto(objArr2, array, objArr2.length - this.f4708a, 0, iG);
        }
        return (T[]) r.terminateCollectionToArray(size(), array);
    }

    @Override // S6.AbstractC0761e, java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        AbstractC0759c.Companion.checkPositionIndex$kotlin_stdlib(i8, size());
        if (i8 == size()) {
            addLast(obj);
            return;
        }
        if (i8 == 0) {
            addFirst(obj);
            return;
        }
        d(size() + 1);
        int iG = g(this.f4708a + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int iC = c(iG);
            int iC2 = c(this.f4708a);
            int i9 = this.f4708a;
            if (iC >= i9) {
                Object[] objArr = this.f4709b;
                objArr[iC2] = objArr[i9];
                AbstractC0765i.copyInto(objArr, objArr, i9, i9 + 1, iC + 1);
            } else {
                Object[] objArr2 = this.f4709b;
                AbstractC0765i.copyInto(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f4709b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0765i.copyInto(objArr3, objArr3, 0, 1, iC + 1);
            }
            this.f4709b[iC] = obj;
            this.f4708a = iC2;
        } else {
            int iG2 = g(this.f4708a + size());
            if (iG < iG2) {
                Object[] objArr4 = this.f4709b;
                AbstractC0765i.copyInto(objArr4, objArr4, iG + 1, iG, iG2);
            } else {
                Object[] objArr5 = this.f4709b;
                AbstractC0765i.copyInto(objArr5, objArr5, 1, 0, iG2);
                Object[] objArr6 = this.f4709b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0765i.copyInto(objArr6, objArr6, iG + 1, iG, objArr6.length - 1);
            }
            this.f4709b[iG] = obj;
        }
        this.f4710c = size() + 1;
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC0759c.Companion.checkPositionIndex$kotlin_stdlib(i8, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(elements);
        }
        d(size() + elements.size());
        int iG = g(this.f4708a + size());
        int iG2 = g(this.f4708a + i8);
        int size = elements.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.f4708a;
            int length = i9 - size;
            if (iG2 < i9) {
                Object[] objArr = this.f4709b;
                AbstractC0765i.copyInto(objArr, objArr, length, i9, objArr.length);
                if (size >= iG2) {
                    Object[] objArr2 = this.f4709b;
                    AbstractC0765i.copyInto(objArr2, objArr2, objArr2.length - size, 0, iG2);
                } else {
                    Object[] objArr3 = this.f4709b;
                    AbstractC0765i.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f4709b;
                    AbstractC0765i.copyInto(objArr4, objArr4, 0, size, iG2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f4709b;
                AbstractC0765i.copyInto(objArr5, objArr5, length, i9, iG2);
            } else {
                Object[] objArr6 = this.f4709b;
                length += objArr6.length;
                int i10 = iG2 - i9;
                int length2 = objArr6.length - length;
                if (length2 >= i10) {
                    AbstractC0765i.copyInto(objArr6, objArr6, length, i9, iG2);
                } else {
                    AbstractC0765i.copyInto(objArr6, objArr6, length, i9, i9 + length2);
                    Object[] objArr7 = this.f4709b;
                    AbstractC0765i.copyInto(objArr7, objArr7, 0, this.f4708a + length2, iG2);
                }
            }
            this.f4708a = length;
            a(f(iG2 - size), elements);
        } else {
            int i11 = iG2 + size;
            if (iG2 < iG) {
                int i12 = size + iG;
                Object[] objArr8 = this.f4709b;
                if (i12 <= objArr8.length) {
                    AbstractC0765i.copyInto(objArr8, objArr8, i11, iG2, iG);
                } else if (i11 >= objArr8.length) {
                    AbstractC0765i.copyInto(objArr8, objArr8, i11 - objArr8.length, iG2, iG);
                } else {
                    int length3 = iG - (i12 - objArr8.length);
                    AbstractC0765i.copyInto(objArr8, objArr8, 0, length3, iG);
                    Object[] objArr9 = this.f4709b;
                    AbstractC0765i.copyInto(objArr9, objArr9, i11, iG2, length3);
                }
            } else {
                Object[] objArr10 = this.f4709b;
                AbstractC0765i.copyInto(objArr10, objArr10, size, 0, iG);
                Object[] objArr11 = this.f4709b;
                if (i11 >= objArr11.length) {
                    AbstractC0765i.copyInto(objArr11, objArr11, i11 - objArr11.length, iG2, objArr11.length);
                } else {
                    AbstractC0765i.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f4709b;
                    AbstractC0765i.copyInto(objArr12, objArr12, i11, iG2, objArr12.length - size);
                }
            }
            a(iG2, elements);
        }
        return true;
    }

    public C0764h() {
        this.f4709b = f4707d;
    }

    public C0764h(Collection<Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f4709b = array;
        this.f4710c = array.length;
        if (array.length == 0) {
            this.f4709b = f4707d;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
