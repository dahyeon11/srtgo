package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Qy0 extends Tx0 implements RandomAccess, InterfaceC2995gz0, Yz0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Qy0 f16041d = new Qy0(new float[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private float[] f16042b;

    /* renamed from: c, reason: collision with root package name */
    private int f16043c;

    private Qy0(float[] fArr, int i8, boolean z8) {
        super(z8);
        this.f16042b = fArr;
        this.f16043c = i8;
    }

    private final String b(int i8) {
        return "Index:" + i8 + ", Size:" + this.f16043c;
    }

    private final void c(int i8) {
        if (i8 < 0 || i8 >= this.f16043c) {
            throw new IndexOutOfBoundsException(b(i8));
        }
    }

    public static Qy0 zze() {
        return f16041d;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f16043c)) {
            throw new IndexOutOfBoundsException(b(i8));
        }
        int i10 = i8 + 1;
        float[] fArr = this.f16042b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i10, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f16042b, i8, fArr2, i10, this.f16043c - i8);
            this.f16042b = fArr2;
        }
        this.f16042b[i8] = fFloatValue;
        this.f16043c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC3793nz0.zzd;
        collection.getClass();
        if (!(collection instanceof Qy0)) {
            return super.addAll(collection);
        }
        Qy0 qy0 = (Qy0) collection;
        int i8 = qy0.f16043c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f16043c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f16042b;
        if (i10 > fArr.length) {
            this.f16042b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(qy0.f16042b, 0, this.f16042b, this.f16043c, qy0.f16043c);
        this.f16043c = i10;
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
        if (!(obj instanceof Qy0)) {
            return super.equals(obj);
        }
        Qy0 qy0 = (Qy0) obj;
        if (this.f16043c != qy0.f16043c) {
            return false;
        }
        float[] fArr = qy0.f16042b;
        for (int i8 = 0; i8 < this.f16043c; i8++) {
            if (Float.floatToIntBits(this.f16042b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Float.valueOf(this.f16042b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i8 = 0; i8 < this.f16043c; i8++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f16042b[i8]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i8 = this.f16043c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f16042b[i9] == fFloatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        float[] fArr = this.f16042b;
        float f8 = fArr[i8];
        if (i8 < this.f16043c - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.f16043c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f16042b;
        System.arraycopy(fArr, i9, fArr, i8, this.f16043c - i9);
        this.f16043c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        c(i8);
        float[] fArr = this.f16042b;
        float f8 = fArr[i8];
        fArr[i8] = fFloatValue;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16043c;
    }

    public final float zzd(int i8) {
        c(i8);
        return this.f16042b[i8];
    }

    @Override // com.google.android.gms.internal.ads.Tx0, com.google.android.gms.internal.ads.InterfaceC3679mz0, com.google.android.gms.internal.ads.InterfaceC3451kz0
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2995gz0 zzf(int i8) {
        if (i8 >= this.f16043c) {
            return new Qy0(Arrays.copyOf(this.f16042b, i8), this.f16043c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f8) {
        a();
        int i8 = this.f16043c;
        float[] fArr = this.f16042b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f16042b = fArr2;
        }
        float[] fArr3 = this.f16042b;
        int i9 = this.f16043c;
        this.f16043c = i9 + 1;
        fArr3[i9] = f8;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
