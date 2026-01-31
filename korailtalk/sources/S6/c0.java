package S6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class c0 extends AbstractC0759c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f4698a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4699b;

    /* renamed from: c, reason: collision with root package name */
    private int f4700c;

    /* renamed from: d, reason: collision with root package name */
    private int f4701d;

    public static final class a extends AbstractC0758b {

        /* renamed from: c, reason: collision with root package name */
        private int f4702c;

        /* renamed from: d, reason: collision with root package name */
        private int f4703d;

        a() {
            this.f4702c = c0.this.size();
            this.f4703d = c0.this.f4700c;
        }

        @Override // S6.AbstractC0758b
        protected void a() {
            if (this.f4702c == 0) {
                b();
                return;
            }
            c(c0.this.f4698a[this.f4703d]);
            this.f4703d = (this.f4703d + 1) % c0.this.f4699b;
            this.f4702c--;
        }
    }

    public c0(Object[] buffer, int i8) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f4698a = buffer;
        if (i8 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i8).toString());
        }
        if (i8 <= buffer.length) {
            this.f4699b = buffer.length;
            this.f4701d = i8;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i8 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // java.util.Collection, java.util.List
    public final void add(Object obj) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f4698a[(this.f4700c + size()) % this.f4699b] = obj;
        this.f4701d = size() + 1;
    }

    public final c0 expanded(int i8) {
        Object[] array;
        int i9 = this.f4699b;
        int iCoerceAtMost = j7.s.coerceAtMost(i9 + (i9 >> 1) + 1, i8);
        if (this.f4700c == 0) {
            array = Arrays.copyOf(this.f4698a, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new c0(array, size());
    }

    @Override // S6.AbstractC0759c, java.util.List
    public Object get(int i8) {
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        return this.f4698a[(this.f4700c + i8) % this.f4699b];
    }

    @Override // S6.AbstractC0759c, S6.AbstractC0757a
    public int getSize() {
        return this.f4701d;
    }

    public final boolean isFull() {
        return size() == this.f4699b;
    }

    @Override // S6.AbstractC0759c, S6.AbstractC0757a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new a();
    }

    public final void removeFirst(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i8).toString());
        }
        if (i8 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i8 + ", size = " + size()).toString());
        }
        if (i8 > 0) {
            int i9 = this.f4700c;
            int i10 = (i9 + i8) % this.f4699b;
            if (i9 > i10) {
                C0768l.fill(this.f4698a, (Object) null, i9, this.f4699b);
                C0768l.fill(this.f4698a, (Object) null, 0, i10);
            } else {
                C0768l.fill(this.f4698a, (Object) null, i9, i10);
            }
            this.f4700c = i10;
            this.f4701d = size() - i8;
        }
    }

    @Override // S6.AbstractC0757a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = this.f4700c; i9 < size && i10 < this.f4699b; i10++) {
            objArr[i9] = this.f4698a[i10];
            i9++;
        }
        while (i9 < size) {
            objArr[i9] = this.f4698a[i8];
            i9++;
            i8++;
        }
        return (T[]) r.terminateCollectionToArray(size, objArr);
    }

    public c0(int i8) {
        this(new Object[i8], 0);
    }

    @Override // S6.AbstractC0757a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
