package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.az0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2307az0 extends Tx0 implements RandomAccess, InterfaceC3110hz0, Yz0 {

    /* renamed from: d, reason: collision with root package name */
    private static final C2307az0 f18059d = new C2307az0(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f18060b;

    /* renamed from: c, reason: collision with root package name */
    private int f18061c;

    private C2307az0(int[] iArr, int i8, boolean z8) {
        super(z8);
        this.f18060b = iArr;
        this.f18061c = i8;
    }

    private final String b(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18061c;
    }

    private final void c(int i8) {
        if (i8 < 0 || i8 >= this.f18061c) {
            throw new IndexOutOfBoundsException(b(i8));
        }
    }

    public static C2307az0 zzg() {
        return f18059d;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f18061c)) {
            throw new IndexOutOfBoundsException(b(i8));
        }
        int i10 = i8 + 1;
        int[] iArr = this.f18060b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i10, i9 - i8);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f18060b, i8, iArr2, i10, this.f18061c - i8);
            this.f18060b = iArr2;
        }
        this.f18060b[i8] = iIntValue;
        this.f18061c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC3793nz0.zzd;
        collection.getClass();
        if (!(collection instanceof C2307az0)) {
            return super.addAll(collection);
        }
        C2307az0 c2307az0 = (C2307az0) collection;
        int i8 = c2307az0.f18061c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f18061c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f18060b;
        if (i10 > iArr.length) {
            this.f18060b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c2307az0.f18060b, 0, this.f18060b, this.f18061c, c2307az0.f18061c);
        this.f18061c = i10;
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
        if (!(obj instanceof C2307az0)) {
            return super.equals(obj);
        }
        C2307az0 c2307az0 = (C2307az0) obj;
        if (this.f18061c != c2307az0.f18061c) {
            return false;
        }
        int[] iArr = c2307az0.f18060b;
        for (int i8 = 0; i8 < this.f18061c; i8++) {
            if (this.f18060b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Integer.valueOf(this.f18060b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f18061c; i9++) {
            i8 = (i8 * 31) + this.f18060b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i8 = this.f18061c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f18060b[i9] == iIntValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        int[] iArr = this.f18060b;
        int i9 = iArr[i8];
        if (i8 < this.f18061c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f18061c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f18060b;
        System.arraycopy(iArr, i9, iArr, i8, this.f18061c - i9);
        this.f18061c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        return Integer.valueOf(zze(i8, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18061c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3110hz0
    public final int zzd(int i8) {
        c(i8);
        return this.f18060b[i8];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3110hz0
    public final int zze(int i8, int i9) {
        a();
        c(i8);
        int[] iArr = this.f18060b;
        int i10 = iArr[i8];
        iArr[i8] = i9;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, com.google.android.gms.internal.ads.InterfaceC3679mz0, com.google.android.gms.internal.ads.InterfaceC3451kz0
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3110hz0 zzf(int i8) {
        if (i8 >= this.f18061c) {
            return new C2307az0(Arrays.copyOf(this.f18060b, i8), this.f18061c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3110hz0
    public final void zzi(int i8) {
        a();
        int i9 = this.f18061c;
        int[] iArr = this.f18060b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f18060b = iArr2;
        }
        int[] iArr3 = this.f18060b;
        int i10 = this.f18061c;
        this.f18061c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
