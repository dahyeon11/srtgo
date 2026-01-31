package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.yk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5016yk0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Collection f24010a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC1229Cj0 f24011b;

    AbstractC5016yk0(Collection collection, InterfaceC1229Cj0 interfaceC1229Cj0) {
        this.f24010a = collection;
        this.f24011b = interfaceC1229Cj0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        AbstractC1188Bj0.zze(this.f24011b.zza(obj));
        return this.f24010a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1188Bj0.zze(this.f24011b.zza(it.next()));
        }
        return this.f24010a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        AbstractC3082hl0.zzb(this.f24010a, this.f24011b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (AbstractC5130zk0.a(this.f24010a, obj)) {
            return this.f24011b.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC1229Cj0 interfaceC1229Cj0 = this.f24011b;
        Iterator it = this.f24010a.iterator();
        AbstractC1188Bj0.zzc(interfaceC1229Cj0, "predicate");
        int i8 = 0;
        while (it.hasNext()) {
            if (interfaceC1229Cj0.zza(it.next())) {
                return i8 == -1;
            }
            i8++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f24010a.iterator();
        it.getClass();
        InterfaceC1229Cj0 interfaceC1229Cj0 = this.f24011b;
        interfaceC1229Cj0.getClass();
        return new C3196il0(it, interfaceC1229Cj0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f24010a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f24010a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f24011b.zza(next) && collection.contains(next)) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f24010a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f24011b.zza(next) && !collection.contains(next)) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f24010a.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (this.f24011b.zza(it.next())) {
                i8++;
            }
        }
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        AbstractC3537ll0.zzc(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        AbstractC3537ll0.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
