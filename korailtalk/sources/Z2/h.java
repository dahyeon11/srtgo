package z2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class h extends d implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final l f37867b = new f(j.f37868e, 0);

    h() {
    }

    static h f(Object[] objArr, int i8) {
        return i8 == 0 ? j.f37868e : new j(objArr, i8);
    }

    public static h zzj(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return j.f37868e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        e eVar = new e(4);
        eVar.zzb(next);
        eVar.zzc(it);
        eVar.f37861c = true;
        return f(eVar.f37859a, eVar.f37860b);
    }

    public static h zzk(Collection collection) {
        if (!(collection instanceof d)) {
            Object[] array = collection.toArray();
            int length = array.length;
            i.a(array, length);
            return f(array, length);
        }
        h hVarZzd = ((d) collection).zzd();
        if (!hVarZzd.d()) {
            return hVarZzd;
        }
        Object[] array2 = hVarZzd.toArray();
        return f(array2, array2.length);
    }

    public static h zzl() {
        return j.f37868e;
    }

    public static h zzm(Object obj) {
        Object[] objArr = {obj};
        i.a(objArr, 1);
        return f(objArr, 1);
    }

    public static h zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        i.a(objArr, 2);
        return f(objArr, 2);
    }

    @Override // z2.d
    int a(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
                        if (v.zza(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !v.zza(it.next(), it2.next())) {
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

    @Override // z2.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // z2.d
    /* renamed from: zze */
    public final k iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public h subList(int i8, int i9) {
        w.zzc(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? j.f37868e : new g(this, i8, i10);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final l listIterator(int i8) {
        w.zzb(i8, size(), "index");
        return isEmpty() ? f37867b : new f(this, i8);
    }

    @Override // z2.d
    @Deprecated
    public final h zzd() {
        return this;
    }
}
