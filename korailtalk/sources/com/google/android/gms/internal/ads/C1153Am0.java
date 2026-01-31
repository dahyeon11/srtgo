package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.Am0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1153Am0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    final int[] f12208a;

    /* renamed from: b, reason: collision with root package name */
    final int f12209b;

    /* renamed from: c, reason: collision with root package name */
    final int f12210c;

    C1153Am0(int[] iArr, int i8, int i9) {
        this.f12208a = iArr;
        this.f12209b = i8;
        this.f12210c = i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && AbstractC1235Cm0.a(this.f12208a, ((Integer) obj).intValue(), this.f12209b, this.f12210c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1153Am0)) {
            return super.equals(obj);
        }
        C1153Am0 c1153Am0 = (C1153Am0) obj;
        int i8 = this.f12210c - this.f12209b;
        if (c1153Am0.f12210c - c1153Am0.f12209b != i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f12208a[this.f12209b + i9] != c1153Am0.f12208a[c1153Am0.f12209b + i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC1188Bj0.zza(i8, this.f12210c - this.f12209b, "index");
        return Integer.valueOf(this.f12208a[this.f12209b + i8]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = this.f12209b; i9 < this.f12210c; i9++) {
            i8 = (i8 * 31) + this.f12208a[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iA;
        if (!(obj instanceof Integer) || (iA = AbstractC1235Cm0.a(this.f12208a, ((Integer) obj).intValue(), this.f12209b, this.f12210c)) < 0) {
            return -1;
        }
        return iA - this.f12209b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f12208a;
            int iIntValue = ((Integer) obj).intValue();
            int i8 = this.f12209b;
            int i9 = this.f12210c - 1;
            while (true) {
                if (i9 < i8) {
                    i9 = -1;
                    break;
                }
                if (iArr[i9] == iIntValue) {
                    break;
                }
                i9--;
            }
            if (i9 >= 0) {
                return i9 - this.f12209b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        Integer num = (Integer) obj;
        AbstractC1188Bj0.zza(i8, this.f12210c - this.f12209b, "index");
        int[] iArr = this.f12208a;
        int i9 = this.f12209b + i8;
        int i10 = iArr[i9];
        num.getClass();
        iArr[i9] = num.intValue();
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12210c - this.f12209b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i8, int i9) {
        AbstractC1188Bj0.zzi(i8, i9, this.f12210c - this.f12209b);
        if (i8 == i9) {
            return Collections.emptyList();
        }
        int[] iArr = this.f12208a;
        int i10 = this.f12209b;
        return new C1153Am0(iArr, i10 + i8, i9 + i10);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f12210c - this.f12209b) * 5);
        sb.append('[');
        sb.append(this.f12208a[this.f12209b]);
        int i8 = this.f12209b;
        while (true) {
            i8++;
            if (i8 >= this.f12210c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f12208a[i8]);
        }
    }
}
