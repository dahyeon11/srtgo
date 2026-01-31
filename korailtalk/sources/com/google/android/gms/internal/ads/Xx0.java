package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Xx0 extends Tx0 implements RandomAccess, InterfaceC2421bz0, Yz0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Xx0 f17305d = new Xx0(new boolean[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f17306b;

    /* renamed from: c, reason: collision with root package name */
    private int f17307c;

    private Xx0(boolean[] zArr, int i8, boolean z8) {
        super(z8);
        this.f17306b = zArr;
        this.f17307c = i8;
    }

    private final String b(int i8) {
        return "Index:" + i8 + ", Size:" + this.f17307c;
    }

    private final void c(int i8) {
        if (i8 < 0 || i8 >= this.f17307c) {
            throw new IndexOutOfBoundsException(b(i8));
        }
    }

    public static Xx0 zzd() {
        return f17305d;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f17307c)) {
            throw new IndexOutOfBoundsException(b(i8));
        }
        int i10 = i8 + 1;
        boolean[] zArr = this.f17306b;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i10, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f17306b, i8, zArr2, i10, this.f17307c - i8);
            this.f17306b = zArr2;
        }
        this.f17306b[i8] = zBooleanValue;
        this.f17307c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC3793nz0.zzd;
        collection.getClass();
        if (!(collection instanceof Xx0)) {
            return super.addAll(collection);
        }
        Xx0 xx0 = (Xx0) collection;
        int i8 = xx0.f17307c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f17307c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        boolean[] zArr = this.f17306b;
        if (i10 > zArr.length) {
            this.f17306b = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(xx0.f17306b, 0, this.f17306b, this.f17307c, xx0.f17307c);
        this.f17307c = i10;
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
        if (!(obj instanceof Xx0)) {
            return super.equals(obj);
        }
        Xx0 xx0 = (Xx0) obj;
        if (this.f17307c != xx0.f17307c) {
            return false;
        }
        boolean[] zArr = xx0.f17306b;
        for (int i8 = 0; i8 < this.f17307c; i8++) {
            if (this.f17306b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Boolean.valueOf(this.f17306b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i8 = 0; i8 < this.f17307c; i8++) {
            iZza = (iZza * 31) + AbstractC3793nz0.zza(this.f17306b[i8]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.f17307c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f17306b[i9] == zBooleanValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        boolean[] zArr = this.f17306b;
        boolean z8 = zArr[i8];
        if (i8 < this.f17307c - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (r2 - i8) - 1);
        }
        this.f17307c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f17306b;
        System.arraycopy(zArr, i9, zArr, i8, this.f17307c - i9);
        this.f17307c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i8);
        boolean[] zArr = this.f17306b;
        boolean z8 = zArr[i8];
        zArr[i8] = zBooleanValue;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17307c;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, com.google.android.gms.internal.ads.InterfaceC3679mz0, com.google.android.gms.internal.ads.InterfaceC3451kz0
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2421bz0 zzf(int i8) {
        if (i8 >= this.f17307c) {
            return new Xx0(Arrays.copyOf(this.f17306b, i8), this.f17307c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(boolean z8) {
        a();
        int i8 = this.f17307c;
        boolean[] zArr = this.f17306b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f17306b = zArr2;
        }
        boolean[] zArr3 = this.f17306b;
        int i9 = this.f17307c;
        this.f17307c = i9 + 1;
        zArr3[i9] = z8;
    }

    public final boolean zzh(int i8) {
        c(i8);
        return this.f17306b[i8];
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
