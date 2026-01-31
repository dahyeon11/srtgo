package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5271y extends AbstractC5202d implements AbstractC5227l0.b, RandomAccess, InterfaceC5195a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C5271y f27416d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f27417b;

    /* renamed from: c, reason: collision with root package name */
    private int f27418c;

    static {
        C5271y c5271y = new C5271y(new double[0], 0);
        f27416d = c5271y;
        c5271y.makeImmutable();
    }

    C5271y() {
        this(new double[10], 0);
    }

    private void b(int i8, double d9) {
        int i9;
        a();
        if (i8 < 0 || i8 > (i9 = this.f27418c)) {
            throw new IndexOutOfBoundsException(d(i8));
        }
        double[] dArr = this.f27417b;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i9 - i8);
        } else {
            double[] dArr2 = new double[((i9 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f27417b, i8, dArr2, i8 + 1, this.f27418c - i8);
            this.f27417b = dArr2;
        }
        this.f27417b[i8] = d9;
        this.f27418c++;
        ((AbstractList) this).modCount++;
    }

    private void c(int i8) {
        if (i8 < 0 || i8 >= this.f27418c) {
            throw new IndexOutOfBoundsException(d(i8));
        }
    }

    private String d(int i8) {
        return "Index:" + i8 + ", Size:" + this.f27418c;
    }

    public static C5271y emptyList() {
        return f27416d;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        AbstractC5227l0.a(collection);
        if (!(collection instanceof C5271y)) {
            return super.addAll(collection);
        }
        C5271y c5271y = (C5271y) collection;
        int i8 = c5271y.f27418c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f27418c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        double[] dArr = this.f27417b;
        if (i10 > dArr.length) {
            this.f27417b = Arrays.copyOf(dArr, i10);
        }
        System.arraycopy(c5271y.f27417b, 0, this.f27417b, this.f27418c, c5271y.f27418c);
        this.f27418c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.b
    public void addDouble(double d9) {
        a();
        int i8 = this.f27418c;
        double[] dArr = this.f27417b;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f27417b = dArr2;
        }
        double[] dArr3 = this.f27417b;
        int i9 = this.f27418c;
        this.f27418c = i9 + 1;
        dArr3[i9] = d9;
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
        if (!(obj instanceof C5271y)) {
            return super.equals(obj);
        }
        C5271y c5271y = (C5271y) obj;
        if (this.f27418c != c5271y.f27418c) {
            return false;
        }
        double[] dArr = c5271y.f27417b;
        for (int i8 = 0; i8 < this.f27418c; i8++) {
            if (Double.doubleToLongBits(this.f27417b[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.b
    public double getDouble(int i8) {
        c(i8);
        return this.f27417b[i8];
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i8 = 0; i8 < this.f27418c; i8++) {
            iHashLong = (iHashLong * 31) + AbstractC5227l0.hashLong(Double.doubleToLongBits(this.f27417b[i8]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f27417b[i8] == dDoubleValue) {
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
        double[] dArr = this.f27417b;
        System.arraycopy(dArr, i9, dArr, i8, this.f27418c - i9);
        this.f27418c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5227l0.b
    public double setDouble(int i8, double d9) {
        a();
        c(i8);
        double[] dArr = this.f27417b;
        double d10 = dArr[i8];
        dArr[i8] = d9;
        return d10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f27418c;
    }

    private C5271y(double[] dArr, int i8) {
        this.f27417b = dArr;
        this.f27418c = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i8) {
        return Double.valueOf(getDouble(i8));
    }

    @Override // com.google.protobuf.AbstractC5202d, com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
    public AbstractC5227l0.b mutableCopyWithCapacity(int i8) {
        if (i8 >= this.f27418c) {
            return new C5271y(Arrays.copyOf(this.f27417b, i8), this.f27418c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Double remove(int i8) {
        a();
        c(i8);
        double[] dArr = this.f27417b;
        double d9 = dArr[i8];
        if (i8 < this.f27418c - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (r3 - i8) - 1);
        }
        this.f27418c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d9);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Double set(int i8, Double d9) {
        return Double.valueOf(setDouble(i8, d9.doubleValue()));
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d9) {
        addDouble(d9.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public void add(int i8, Double d9) {
        b(i8, d9.doubleValue());
    }
}
