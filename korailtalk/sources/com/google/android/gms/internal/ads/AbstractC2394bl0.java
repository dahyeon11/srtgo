package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.bl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2394bl0 extends AbstractC2009Vk0 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3425km0 f18178b = new C2173Zk0(C1724Ol0.f15149e, 0);
    public static final /* synthetic */ int zzd = 0;

    AbstractC2394bl0() {
    }

    static AbstractC2394bl0 e(Object[] objArr, int i8) {
        return i8 == 0 ? C1724Ol0.f15149e : new C1724Ol0(objArr, i8);
    }

    public static C2091Xk0 zzi(int i8) {
        return new C2091Xk0(i8);
    }

    public static AbstractC2394bl0 zzk(Collection collection) {
        if (!(collection instanceof AbstractC2009Vk0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC1642Ml0.b(array, length);
            return e(array, length);
        }
        AbstractC2394bl0 abstractC2394bl0Zzd = ((AbstractC2009Vk0) collection).zzd();
        if (!abstractC2394bl0Zzd.zzf()) {
            return abstractC2394bl0Zzd;
        }
        Object[] array2 = abstractC2394bl0Zzd.toArray();
        return e(array2, array2.length);
    }

    public static AbstractC2394bl0 zzl(Object[] objArr) {
        if (objArr.length == 0) {
            return C1724Ol0.f15149e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        AbstractC1642Ml0.b(objArr2, length);
        return e(objArr2, length);
    }

    public static AbstractC2394bl0 zzm() {
        return C1724Ol0.f15149e;
    }

    public static AbstractC2394bl0 zzn(Object obj) {
        Object[] objArr = {obj};
        AbstractC1642Ml0.b(objArr, 1);
        return e(objArr, 1);
    }

    public static AbstractC2394bl0 zzo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1642Ml0.b(objArr, 2);
        return e(objArr, 2);
    }

    public static AbstractC2394bl0 zzp(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC1642Ml0.b(objArr, 3);
        return e(objArr, 3);
    }

    public static AbstractC2394bl0 zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        AbstractC1642Ml0.b(objArr, 5);
        return e(objArr, 5);
    }

    public static AbstractC2394bl0 zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        AbstractC1642Ml0.b(objArr, 6);
        return e(objArr, 6);
    }

    public static AbstractC2394bl0 zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        AbstractC1642Ml0.b(objArr, 9);
        return e(objArr, 9);
    }

    public static AbstractC2394bl0 zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        AbstractC1642Ml0.b(objArr, 10);
        return e(objArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    int a(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i8 = 0; i8 < size; i8++) {
                        if (AbstractC4672vj0.zza(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC4672vj0.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i8 = 0; i8 < size; i8++) {
            iHashCode = (iHashCode * 31) + get(i8).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (obj.equals(get(i8))) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    @Deprecated
    public final AbstractC2394bl0 zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    /* renamed from: zze */
    public final AbstractC3311jm0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public AbstractC2394bl0 subList(int i8, int i9) {
        AbstractC1188Bj0.zzi(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? C1724Ol0.f15149e : new C2279al0(this, i8, i10);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final AbstractC3425km0 listIterator(int i8) {
        AbstractC1188Bj0.zzb(i8, size(), "index");
        return isEmpty() ? f18178b : new C2173Zk0(this, i8);
    }
}
