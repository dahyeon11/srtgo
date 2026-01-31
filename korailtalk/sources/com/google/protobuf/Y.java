package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Y extends AbstractC5202d implements AbstractC5227l0.f, RandomAccess, InterfaceC5195a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final Y f26367d;

    /* renamed from: b, reason: collision with root package name */
    private float[] f26368b;

    /* renamed from: c, reason: collision with root package name */
    private int f26369c;

    static {
        Y y8 = new Y(new float[0], 0);
        f26367d = y8;
        y8.makeImmutable();
    }

    Y() {
        this(new float[10], 0);
    }

    private void b(int i8, float f8) {
        int i9;
        a();
        if (i8 < 0 || i8 > (i9 = this.f26369c)) {
            throw new IndexOutOfBoundsException(d(i8));
        }
        float[] fArr = this.f26368b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f26368b, i8, fArr2, i8 + 1, this.f26369c - i8);
            this.f26368b = fArr2;
        }
        this.f26368b[i8] = f8;
        this.f26369c++;
        ((AbstractList) this).modCount++;
    }

    private void c(int i8) {
        if (i8 < 0 || i8 >= this.f26369c) {
            throw new IndexOutOfBoundsException(d(i8));
        }
    }

    private String d(int i8) {
        return "Index:" + i8 + ", Size:" + this.f26369c;
    }

    public static Y emptyList() {
        return f26367d;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        AbstractC5227l0.a(collection);
        if (!(collection instanceof Y)) {
            return super.addAll(collection);
        }
        Y y8 = (Y) collection;
        int i8 = y8.f26369c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f26369c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f26368b;
        if (i10 > fArr.length) {
            this.f26368b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(y8.f26368b, 0, this.f26368b, this.f26369c, y8.f26369c);
        this.f26369c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.f
    public void addFloat(float f8) {
        a();
        int i8 = this.f26369c;
        float[] fArr = this.f26368b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f26368b = fArr2;
        }
        float[] fArr3 = this.f26368b;
        int i9 = this.f26369c;
        this.f26369c = i9 + 1;
        fArr3[i9] = f8;
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
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y8 = (Y) obj;
        if (this.f26369c != y8.f26369c) {
            return false;
        }
        float[] fArr = y8.f26368b;
        for (int i8 = 0; i8 < this.f26369c; i8++) {
            if (Float.floatToIntBits(this.f26368b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC5227l0.f
    public float getFloat(int i8) {
        c(i8);
        return this.f26368b[i8];
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i8 = 0; i8 < this.f26369c; i8++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f26368b[i8]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f26368b[i8] == fFloatValue) {
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
        float[] fArr = this.f26368b;
        System.arraycopy(fArr, i9, fArr, i8, this.f26369c - i9);
        this.f26369c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5227l0.f
    public float setFloat(int i8, float f8) {
        a();
        c(i8);
        float[] fArr = this.f26368b;
        float f9 = fArr[i8];
        fArr[i8] = f8;
        return f9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26369c;
    }

    private Y(float[] fArr, int i8) {
        this.f26368b = fArr;
        this.f26369c = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i8) {
        return Float.valueOf(getFloat(i8));
    }

    @Override // com.google.protobuf.AbstractC5202d, com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
    public AbstractC5227l0.f mutableCopyWithCapacity(int i8) {
        if (i8 >= this.f26369c) {
            return new Y(Arrays.copyOf(this.f26368b, i8), this.f26369c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Float remove(int i8) {
        a();
        c(i8);
        float[] fArr = this.f26368b;
        float f8 = fArr[i8];
        if (i8 < this.f26369c - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.f26369c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public Float set(int i8, Float f8) {
        return Float.valueOf(setFloat(i8, f8.floatValue()));
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f8) {
        addFloat(f8.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public void add(int i8, Float f8) {
        b(i8, f8.floatValue());
    }
}
