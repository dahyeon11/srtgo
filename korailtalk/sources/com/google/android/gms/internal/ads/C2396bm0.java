package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.bm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2396bm0 extends C2175Zl0 implements SortedSet {
    C2396bm0(SortedSet sortedSet, InterfaceC1229Cj0 interfaceC1229Cj0) {
        super(sortedSet, interfaceC1229Cj0);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f24010a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f24010a.iterator();
        it.getClass();
        InterfaceC1229Cj0 interfaceC1229Cj0 = this.f24011b;
        interfaceC1229Cj0.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC1229Cj0.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C2396bm0(((SortedSet) this.f24010a).headSet(obj), this.f24011b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f24010a;
        while (true) {
            InterfaceC1229Cj0 interfaceC1229Cj0 = this.f24011b;
            Object objLast = sortedSetHeadSet.last();
            if (interfaceC1229Cj0.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C2396bm0(((SortedSet) this.f24010a).subSet(obj, obj2), this.f24011b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C2396bm0(((SortedSet) this.f24010a).tailSet(obj), this.f24011b);
    }
}
