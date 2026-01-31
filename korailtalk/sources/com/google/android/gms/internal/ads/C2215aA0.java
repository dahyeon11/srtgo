package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.aA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2215aA0 extends Tx0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C2215aA0 f17911d = new C2215aA0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private Object[] f17912b;

    /* renamed from: c, reason: collision with root package name */
    private int f17913c;

    private C2215aA0(Object[] objArr, int i8, boolean z8) {
        super(z8);
        this.f17912b = objArr;
        this.f17913c = i8;
    }

    private final String b(int i8) {
        return "Index:" + i8 + ", Size:" + this.f17913c;
    }

    private final void c(int i8) {
        if (i8 < 0 || i8 >= this.f17913c) {
            throw new IndexOutOfBoundsException(b(i8));
        }
    }

    public static C2215aA0 zzd() {
        return f17911d;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        a();
        if (i8 < 0 || i8 > (i9 = this.f17913c)) {
            throw new IndexOutOfBoundsException(b(i8));
        }
        int i10 = i8 + 1;
        Object[] objArr = this.f17912b;
        if (i9 < objArr.length) {
            System.arraycopy(objArr, i8, objArr, i10, i9 - i8);
        } else {
            Object[] objArr2 = new Object[((i9 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i8);
            System.arraycopy(this.f17912b, i8, objArr2, i10, this.f17913c - i8);
            this.f17912b = objArr2;
        }
        this.f17912b[i8] = obj;
        this.f17913c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        c(i8);
        return this.f17912b[i8];
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        a();
        c(i8);
        Object[] objArr = this.f17912b;
        Object obj = objArr[i8];
        if (i8 < this.f17913c - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f17913c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        a();
        c(i8);
        Object[] objArr = this.f17912b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17913c;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, com.google.android.gms.internal.ads.InterfaceC3679mz0, com.google.android.gms.internal.ads.InterfaceC3451kz0
    public final /* bridge */ /* synthetic */ InterfaceC3679mz0 zzf(int i8) {
        if (i8 >= this.f17913c) {
            return new C2215aA0(Arrays.copyOf(this.f17912b, i8), this.f17913c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i8 = this.f17913c;
        Object[] objArr = this.f17912b;
        if (i8 == objArr.length) {
            this.f17912b = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f17912b;
        int i9 = this.f17913c;
        this.f17913c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
