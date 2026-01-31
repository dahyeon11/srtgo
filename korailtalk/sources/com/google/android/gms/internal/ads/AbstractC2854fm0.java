package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.fm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2854fm0 {
    static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean c(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC1561Kl0) {
            collection = ((InterfaceC1561Kl0) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return d(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    static boolean d(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static AbstractC2739em0 zzb(Set set, Set set2) {
        AbstractC1188Bj0.zzc(set, "set1");
        AbstractC1188Bj0.zzc(set2, "set2");
        return new C2134Yl0(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, InterfaceC1229Cj0 interfaceC1229Cj0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C2175Zl0)) {
                set.getClass();
                return new C2175Zl0(set, interfaceC1229Cj0);
            }
            C2175Zl0 c2175Zl0 = (C2175Zl0) set;
            return new C2175Zl0(c2175Zl0.f24010a, AbstractC1352Fj0.zza(c2175Zl0.f24011b, interfaceC1229Cj0));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof C2175Zl0)) {
            sortedSet.getClass();
            return new C2396bm0(sortedSet, interfaceC1229Cj0);
        }
        C2175Zl0 c2175Zl02 = (C2175Zl0) sortedSet;
        return new C2396bm0((SortedSet) c2175Zl02.f24010a, AbstractC1352Fj0.zza(c2175Zl02.f24011b, interfaceC1229Cj0));
    }
}
