package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5270x0 extends AbstractC5202d implements AbstractC5227l0.h, RandomAccess, InterfaceC5195a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C5270x0 f27413d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f27414b;

    /* renamed from: c, reason: collision with root package name */
    private int f27415c;

    static {
        C5270x0 c5270x0 = new C5270x0(new long[0], 0);
        f27413d = c5270x0;
        c5270x0.makeImmutable();
    }

    C5270x0() {
        this(new long[10], 0);
    }

    private void b(int i8, long j8) {
        int i9;
        a();
        if (i8 < 0 || i8 > (i9 = this.f27415c)) {
            throw new IndexOutOfBoundsException(d(i8));
        }
        long[] jArr = this.f27414b;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
        } else {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f27414b, i8, jArr2, i8 + 1, this.f27415c - i8);
            this.f27414b = jArr2;
        }
        this.f27414b[i8] = j8;
        this.f27415c++;
        ((AbstractList) this).modCount++;
    }

    private void c(int i8) {
        if (i8 < 0 || i8 >= this.f27415c) {
            throw new IndexOutOfBoundsException(d(i8));
        }
    }

    private String d(int i8) {
        return "Index:" + i8 + ", Size:" + this.f27415c;
    }

    public static C5270x0 emptyList() {
        return f27413d;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        AbstractC5227l0.a(collection);
        if (!(collection instanceof C5270x0)) {
            return super.addAll(collection);
        }
        C5270x0 c5270x0 = (C5270x0) collection;
        int i8 = c5270x0.f27415c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f27415c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f27414b;
        if (i10 > jArr.length) {
            this.f27414b = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(c5270x0.f27414b, 0, this.f27414b, this.f27415c, c5270x0.f27415c);
        this.f27415c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.h
    public void addLong(long j8) {
        a();
        int i8 = this.f27415c;
        long[] jArr = this.f27414b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f27414b = jArr2;
        }
        long[] jArr3 = this.f27414b;
        int i9 = this.f27415c;
        this.f27415c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5270x0)) {
            return super.equals(obj);
        }
        C5270x0 c5270x0 = (C5270x0) obj;
        if (this.f27415c != c5270x0.f27415c) {
            return false;
        }
        long[] jArr = c5270x0.f27414b;
        for (int i8 = 0; i8 < this.f27415c; i8++) {
            if (this.f27414b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.h
    public long getLong(int i8) {
        c(i8);
        return this.f27414b[i8];
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i8 = 0; i8 < this.f27415c; i8++) {
            iHashLong = (iHashLong * 31) + AbstractC5227l0.hashLong(this.f27414b[i8]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f27414b[i8] == jLongValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f27414b;
        System.arraycopy(jArr, i9, jArr, i8, this.f27415c - i9);
        this.f27415c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5227l0.h
    public long setLong(int i8, long j8) {
        a();
        c(i8);
        long[] jArr = this.f27414b;
        long j9 = jArr[i8];
        jArr[i8] = j8;
        return j9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f27415c;
    }

    private C5270x0(long[] jArr, int i8) {
        this.f27414b = jArr;
        this.f27415c = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i8) {
        return Long.valueOf(getLong(i8));
    }

    @Override // com.google.protobuf.AbstractC5202d, com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
    public AbstractC5227l0.h mutableCopyWithCapacity(int i8) {
        if (i8 >= this.f27415c) {
            return new C5270x0(Arrays.copyOf(this.f27414b, i8), this.f27415c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Long remove(int i8) {
        a();
        c(i8);
        long[] jArr = this.f27414b;
        long j8 = jArr[i8];
        if (i8 < this.f27415c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f27415c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Long set(int i8, Long l8) {
        return Long.valueOf(setLong(i8, l8.longValue()));
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l8) {
        addLong(l8.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public void add(int i8, Long l8) {
        b(i8, l8.longValue());
    }
}
