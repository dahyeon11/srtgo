package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5224k0 extends AbstractC5202d implements AbstractC5227l0.g, RandomAccess, InterfaceC5195a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C5224k0 f26559d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f26560b;

    /* renamed from: c, reason: collision with root package name */
    private int f26561c;

    static {
        C5224k0 c5224k0 = new C5224k0(new int[0], 0);
        f26559d = c5224k0;
        c5224k0.makeImmutable();
    }

    C5224k0() {
        this(new int[10], 0);
    }

    private void b(int i8, int i9) {
        int i10;
        a();
        if (i8 < 0 || i8 > (i10 = this.f26561c)) {
            throw new IndexOutOfBoundsException(d(i8));
        }
        int[] iArr = this.f26560b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i10 - i8);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f26560b, i8, iArr2, i8 + 1, this.f26561c - i8);
            this.f26560b = iArr2;
        }
        this.f26560b[i8] = i9;
        this.f26561c++;
        ((AbstractList) this).modCount++;
    }

    private void c(int i8) {
        if (i8 < 0 || i8 >= this.f26561c) {
            throw new IndexOutOfBoundsException(d(i8));
        }
    }

    private String d(int i8) {
        return "Index:" + i8 + ", Size:" + this.f26561c;
    }

    public static C5224k0 emptyList() {
        return f26559d;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        AbstractC5227l0.a(collection);
        if (!(collection instanceof C5224k0)) {
            return super.addAll(collection);
        }
        C5224k0 c5224k0 = (C5224k0) collection;
        int i8 = c5224k0.f26561c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f26561c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f26560b;
        if (i10 > iArr.length) {
            this.f26560b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c5224k0.f26560b, 0, this.f26560b, this.f26561c, c5224k0.f26561c);
        this.f26561c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.g
    public void addInt(int i8) {
        a();
        int i9 = this.f26561c;
        int[] iArr = this.f26560b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f26560b = iArr2;
        }
        int[] iArr3 = this.f26560b;
        int i10 = this.f26561c;
        this.f26561c = i10 + 1;
        iArr3[i10] = i8;
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
        if (!(obj instanceof C5224k0)) {
            return super.equals(obj);
        }
        C5224k0 c5224k0 = (C5224k0) obj;
        if (this.f26561c != c5224k0.f26561c) {
            return false;
        }
        int[] iArr = c5224k0.f26560b;
        for (int i8 = 0; i8 < this.f26561c; i8++) {
            if (this.f26560b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.g
    public int getInt(int i8) {
        c(i8);
        return this.f26560b[i8];
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f26561c; i9++) {
            i8 = (i8 * 31) + this.f26560b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f26560b[i8] == iIntValue) {
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
        int[] iArr = this.f26560b;
        System.arraycopy(iArr, i9, iArr, i8, this.f26561c - i9);
        this.f26561c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5227l0.g
    public int setInt(int i8, int i9) {
        a();
        c(i8);
        int[] iArr = this.f26560b;
        int i10 = iArr[i8];
        iArr[i8] = i9;
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26561c;
    }

    private C5224k0(int[] iArr, int i8) {
        this.f26560b = iArr;
        this.f26561c = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i8) {
        return Integer.valueOf(getInt(i8));
    }

    @Override // com.google.protobuf.AbstractC5202d, com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
    public AbstractC5227l0.g mutableCopyWithCapacity(int i8) {
        if (i8 >= this.f26561c) {
            return new C5224k0(Arrays.copyOf(this.f26560b, i8), this.f26561c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Integer remove(int i8) {
        a();
        c(i8);
        int[] iArr = this.f26560b;
        int i9 = iArr[i8];
        if (i8 < this.f26561c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f26561c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Integer set(int i8, Integer num) {
        return Integer.valueOf(setInt(i8, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public void add(int i8, Integer num) {
        b(i8, num.intValue());
    }
}
