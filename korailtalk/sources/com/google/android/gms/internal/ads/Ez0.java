package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Ez0 extends Tx0 implements RandomAccess, InterfaceC3451kz0, Yz0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Ez0 f12880d = new Ez0(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private long[] f12881b;

    /* renamed from: c, reason: collision with root package name */
    private int f12882c;

    private Ez0(long[] jArr, int i8, boolean z8) {
        super(z8);
        this.f12881b = jArr;
        this.f12882c = i8;
    }

    private final String b(int i8) {
        return "Index:" + i8 + ", Size:" + this.f12882c;
    }

    private final void c(int i8) {
        if (i8 < 0 || i8 >= this.f12882c) {
            throw new IndexOutOfBoundsException(b(i8));
        }
    }

    public static Ez0 zzh() {
        return f12880d;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i8 < 0 || i8 > (i9 = this.f12882c)) {
            throw new IndexOutOfBoundsException(b(i8));
        }
        int i10 = i8 + 1;
        long[] jArr = this.f12881b;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i10, i9 - i8);
        } else {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f12881b, i8, jArr2, i10, this.f12882c - i8);
            this.f12881b = jArr2;
        }
        this.f12881b[i8] = jLongValue;
        this.f12882c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC3793nz0.zzd;
        collection.getClass();
        if (!(collection instanceof Ez0)) {
            return super.addAll(collection);
        }
        Ez0 ez0 = (Ez0) collection;
        int i8 = ez0.f12882c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f12882c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f12881b;
        if (i10 > jArr.length) {
            this.f12881b = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(ez0.f12881b, 0, this.f12881b, this.f12882c, ez0.f12882c);
        this.f12882c = i10;
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
        if (!(obj instanceof Ez0)) {
            return super.equals(obj);
        }
        Ez0 ez0 = (Ez0) obj;
        if (this.f12882c != ez0.f12882c) {
            return false;
        }
        long[] jArr = ez0.f12881b;
        for (int i8 = 0; i8 < this.f12882c; i8++) {
            if (this.f12881b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Long.valueOf(this.f12881b[i8]);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f12882c; i9++) {
            long j8 = this.f12881b[i9];
            byte[] bArr = AbstractC3793nz0.zzd;
            i8 = (i8 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i8 = this.f12882c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f12881b[i9] == jLongValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        long[] jArr = this.f12881b;
        long j8 = jArr[i8];
        if (i8 < this.f12882c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f12882c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f12881b;
        System.arraycopy(jArr, i9, jArr, i8, this.f12882c - i9);
        this.f12882c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        return Long.valueOf(zzd(i8, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12882c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3451kz0
    public final long zza(int i8) {
        c(i8);
        return this.f12881b[i8];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3451kz0
    public final long zzd(int i8, long j8) {
        a();
        c(i8);
        long[] jArr = this.f12881b;
        long j9 = jArr[i8];
        jArr[i8] = j8;
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, com.google.android.gms.internal.ads.InterfaceC3679mz0, com.google.android.gms.internal.ads.InterfaceC3451kz0
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3451kz0 zzf(int i8) {
        if (i8 >= this.f12882c) {
            return new Ez0(Arrays.copyOf(this.f12881b, i8), this.f12882c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3451kz0
    public final void zzg(long j8) {
        a();
        int i8 = this.f12882c;
        long[] jArr = this.f12881b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f12881b = jArr2;
        }
        long[] jArr3 = this.f12881b;
        int i9 = this.f12882c;
        this.f12882c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
