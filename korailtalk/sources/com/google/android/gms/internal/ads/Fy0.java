package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Fy0 extends Tx0 implements RandomAccess, InterfaceC2536cz0, Yz0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Fy0 f13093d = new Fy0(new double[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private double[] f13094b;

    /* renamed from: c, reason: collision with root package name */
    private int f13095c;

    private Fy0(double[] dArr, int i8, boolean z8) {
        super(z8);
        this.f13094b = dArr;
        this.f13095c = i8;
    }

    private final String b(int i8) {
        return "Index:" + i8 + ", Size:" + this.f13095c;
    }

    private final void c(int i8) {
        if (i8 < 0 || i8 >= this.f13095c) {
            throw new IndexOutOfBoundsException(b(i8));
        }
    }

    public static Fy0 zze() {
        return f13093d;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f13095c)) {
            throw new IndexOutOfBoundsException(b(i8));
        }
        int i10 = i8 + 1;
        double[] dArr = this.f13094b;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i10, i9 - i8);
        } else {
            double[] dArr2 = new double[((i9 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f13094b, i8, dArr2, i10, this.f13095c - i8);
            this.f13094b = dArr2;
        }
        this.f13094b[i8] = dDoubleValue;
        this.f13095c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC3793nz0.zzd;
        collection.getClass();
        if (!(collection instanceof Fy0)) {
            return super.addAll(collection);
        }
        Fy0 fy0 = (Fy0) collection;
        int i8 = fy0.f13095c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f13095c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        double[] dArr = this.f13094b;
        if (i10 > dArr.length) {
            this.f13094b = Arrays.copyOf(dArr, i10);
        }
        System.arraycopy(fy0.f13094b, 0, this.f13094b, this.f13095c, fy0.f13095c);
        this.f13095c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fy0)) {
            return super.equals(obj);
        }
        Fy0 fy0 = (Fy0) obj;
        if (this.f13095c != fy0.f13095c) {
            return false;
        }
        double[] dArr = fy0.f13094b;
        for (int i8 = 0; i8 < this.f13095c; i8++) {
            if (Double.doubleToLongBits(this.f13094b[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Double.valueOf(this.f13094b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f13095c; i9++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f13094b[i9]);
            byte[] bArr = AbstractC3793nz0.zzd;
            i8 = (i8 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i8 = this.f13095c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f13094b[i9] == dDoubleValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        double[] dArr = this.f13094b;
        double d9 = dArr[i8];
        if (i8 < this.f13095c - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (r3 - i8) - 1);
        }
        this.f13095c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f13094b;
        System.arraycopy(dArr, i9, dArr, i8, this.f13095c - i9);
        this.f13095c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        c(i8);
        double[] dArr = this.f13094b;
        double d9 = dArr[i8];
        dArr[i8] = dDoubleValue;
        return Double.valueOf(d9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13095c;
    }

    public final double zzd(int i8) {
        c(i8);
        return this.f13094b[i8];
    }

    @Override // com.google.android.gms.internal.ads.Tx0, com.google.android.gms.internal.ads.InterfaceC3679mz0, com.google.android.gms.internal.ads.InterfaceC3451kz0
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2536cz0 zzf(int i8) {
        if (i8 >= this.f13095c) {
            return new Fy0(Arrays.copyOf(this.f13094b, i8), this.f13095c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(double d9) {
        a();
        int i8 = this.f13095c;
        double[] dArr = this.f13094b;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f13094b = dArr2;
        }
        double[] dArr3 = this.f13094b;
        int i9 = this.f13095c;
        this.f13095c = i9 + 1;
        dArr3[i9] = d9;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Double) obj).doubleValue());
        return true;
    }
}
