package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5229m extends AbstractC5202d implements AbstractC5227l0.a, RandomAccess, InterfaceC5195a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C5229m f26573d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f26574b;

    /* renamed from: c, reason: collision with root package name */
    private int f26575c;

    static {
        C5229m c5229m = new C5229m(new boolean[0], 0);
        f26573d = c5229m;
        c5229m.makeImmutable();
    }

    C5229m() {
        this(new boolean[10], 0);
    }

    private void b(int i8, boolean z8) {
        int i9;
        a();
        if (i8 < 0 || i8 > (i9 = this.f26575c)) {
            throw new IndexOutOfBoundsException(d(i8));
        }
        boolean[] zArr = this.f26574b;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f26574b, i8, zArr2, i8 + 1, this.f26575c - i8);
            this.f26574b = zArr2;
        }
        this.f26574b[i8] = z8;
        this.f26575c++;
        ((AbstractList) this).modCount++;
    }

    private void c(int i8) {
        if (i8 < 0 || i8 >= this.f26575c) {
            throw new IndexOutOfBoundsException(d(i8));
        }
    }

    private String d(int i8) {
        return "Index:" + i8 + ", Size:" + this.f26575c;
    }

    public static C5229m emptyList() {
        return f26573d;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        AbstractC5227l0.a(collection);
        if (!(collection instanceof C5229m)) {
            return super.addAll(collection);
        }
        C5229m c5229m = (C5229m) collection;
        int i8 = c5229m.f26575c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f26575c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        boolean[] zArr = this.f26574b;
        if (i10 > zArr.length) {
            this.f26574b = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(c5229m.f26574b, 0, this.f26574b, this.f26575c, c5229m.f26575c);
        this.f26575c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.a
    public void addBoolean(boolean z8) {
        a();
        int i8 = this.f26575c;
        boolean[] zArr = this.f26574b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f26574b = zArr2;
        }
        boolean[] zArr3 = this.f26574b;
        int i9 = this.f26575c;
        this.f26575c = i9 + 1;
        zArr3[i9] = z8;
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
        if (!(obj instanceof C5229m)) {
            return super.equals(obj);
        }
        C5229m c5229m = (C5229m) obj;
        if (this.f26575c != c5229m.f26575c) {
            return false;
        }
        boolean[] zArr = c5229m.f26574b;
        for (int i8 = 0; i8 < this.f26575c; i8++) {
            if (this.f26574b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.a
    public boolean getBoolean(int i8) {
        c(i8);
        return this.f26574b[i8];
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i8 = 0; i8 < this.f26575c; i8++) {
            iHashBoolean = (iHashBoolean * 31) + AbstractC5227l0.hashBoolean(this.f26574b[i8]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f26574b[i8] == zBooleanValue) {
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
        boolean[] zArr = this.f26574b;
        System.arraycopy(zArr, i9, zArr, i8, this.f26575c - i9);
        this.f26575c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5227l0.a
    public boolean setBoolean(int i8, boolean z8) {
        a();
        c(i8);
        boolean[] zArr = this.f26574b;
        boolean z9 = zArr[i8];
        zArr[i8] = z8;
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26575c;
    }

    private C5229m(boolean[] zArr, int i8) {
        this.f26574b = zArr;
        this.f26575c = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i8) {
        return Boolean.valueOf(getBoolean(i8));
    }

    @Override // com.google.protobuf.AbstractC5202d, com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
    public AbstractC5227l0.a mutableCopyWithCapacity(int i8) {
        if (i8 >= this.f26575c) {
            return new C5229m(Arrays.copyOf(this.f26574b, i8), this.f26575c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Boolean remove(int i8) {
        a();
        c(i8);
        boolean[] zArr = this.f26574b;
        boolean z8 = zArr[i8];
        if (i8 < this.f26575c - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (r2 - i8) - 1);
        }
        this.f26575c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Boolean set(int i8, Boolean bool) {
        return Boolean.valueOf(setBoolean(i8, bool.booleanValue()));
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public void add(int i8, Boolean bool) {
        b(i8, bool.booleanValue());
    }
}
