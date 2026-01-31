package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.gl0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2967gl0 extends AbstractC2009Vk0 implements Set {

    /* renamed from: b */
    private transient AbstractC2394bl0 f19395b;

    AbstractC2967gl0() {
    }

    static int e(int i8) {
        int iMax = Math.max(i8, 2);
        if (iMax >= 751619276) {
            AbstractC1188Bj0.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static AbstractC2967gl0 j(int i8, Object... objArr) {
        if (i8 == 0) {
            return C1970Ul0.f16709i;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C2969gm0(obj);
        }
        int iE = e(i8);
        Object[] objArr2 = new Object[iE];
        int i9 = iE - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object obj2 = objArr[i12];
            AbstractC1642Ml0.a(obj2, i12);
            int iHashCode = obj2.hashCode();
            int iA = AbstractC1886Sk0.a(iHashCode);
            while (true) {
                int i13 = iA & i9;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i11, i8, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C2969gm0(obj4);
        }
        if (e(i11) < iE / 2) {
            return j(i11, objArr);
        }
        if (k(i11, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new C1970Ul0(objArr, i10, objArr2, i9, i11);
    }

    public static boolean k(int i8, int i9) {
        return i8 < (i9 >> 1) + (i9 >> 2);
    }

    public static C2852fl0 zzj(int i8) {
        return new C2852fl0(i8);
    }

    public static AbstractC2967gl0 zzl(Collection collection) {
        if ((collection instanceof AbstractC2967gl0) && !(collection instanceof SortedSet)) {
            AbstractC2967gl0 abstractC2967gl0 = (AbstractC2967gl0) collection;
            if (!abstractC2967gl0.zzf()) {
                return abstractC2967gl0;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static AbstractC2967gl0 zzm(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? j(length, (Object[]) objArr.clone()) : new C2969gm0(objArr[0]) : C1970Ul0.f16709i;
    }

    public static AbstractC2967gl0 zzn() {
        return C1970Ul0.f16709i;
    }

    public static AbstractC2967gl0 zzo(Object obj) {
        return new C2969gm0(obj);
    }

    public static AbstractC2967gl0 zzp(Object obj, Object obj2) {
        return j(2, obj, obj2);
    }

    public static AbstractC2967gl0 zzq(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    public static AbstractC2967gl0 zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static AbstractC2967gl0 zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return j(12, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2967gl0) && i() && ((AbstractC2967gl0) obj).i() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC2854fm0.b(this, obj);
    }

    AbstractC2394bl0 f() {
        Object[] array = toArray();
        int i8 = AbstractC2394bl0.zzd;
        return AbstractC2394bl0.e(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2854fm0.a(this);
    }

    boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    public AbstractC2394bl0 zzd() {
        AbstractC2394bl0 abstractC2394bl0 = this.f19395b;
        if (abstractC2394bl0 != null) {
            return abstractC2394bl0;
        }
        AbstractC2394bl0 abstractC2394bl0F = f();
        this.f19395b = abstractC2394bl0F;
        return abstractC2394bl0F;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zze */
    public abstract AbstractC3311jm0 iterator();
}
