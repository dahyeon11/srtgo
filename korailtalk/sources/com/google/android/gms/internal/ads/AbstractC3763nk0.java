package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.nk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3763nk0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f21332a;

    /* renamed from: b, reason: collision with root package name */
    Collection f21333b;

    /* renamed from: c, reason: collision with root package name */
    final AbstractC3763nk0 f21334c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f21335d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f21336e;

    AbstractC3763nk0(AbstractC4105qk0 abstractC4105qk0, Object obj, Collection collection, AbstractC3763nk0 abstractC3763nk0) {
        this.f21336e = abstractC4105qk0;
        this.f21332a = obj;
        this.f21333b = collection;
        this.f21334c = abstractC3763nk0;
        this.f21335d = abstractC3763nk0 == null ? null : abstractC3763nk0.f21333b;
    }

    final void a() {
        AbstractC3763nk0 abstractC3763nk0 = this.f21334c;
        if (abstractC3763nk0 != null) {
            abstractC3763nk0.a();
            return;
        }
        AbstractC4105qk0 abstractC4105qk0 = this.f21336e;
        abstractC4105qk0.f21984d.put(this.f21332a, this.f21333b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f21333b.isEmpty();
        boolean zAdd = this.f21333b.add(obj);
        if (zAdd) {
            this.f21336e.f21985e++;
            if (zIsEmpty) {
                a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f21333b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f21333b.size();
        this.f21336e.f21985e += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    final void b() {
        AbstractC3763nk0 abstractC3763nk0 = this.f21334c;
        if (abstractC3763nk0 != null) {
            abstractC3763nk0.b();
        } else if (this.f21333b.isEmpty()) {
            AbstractC4105qk0 abstractC4105qk0 = this.f21336e;
            abstractC4105qk0.f21984d.remove(this.f21332a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f21333b.clear();
        this.f21336e.f21985e -= size;
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f21333b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f21333b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f21333b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f21333b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C3649mk0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f21333b.remove(obj);
        if (zRemove) {
            AbstractC4105qk0 abstractC4105qk0 = this.f21336e;
            abstractC4105qk0.f21985e--;
            b();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f21333b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f21333b.size();
            this.f21336e.f21985e += size2 - size;
            b();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f21333b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f21333b.size();
            this.f21336e.f21985e += size2 - size;
            b();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f21333b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f21333b.toString();
    }

    final void zzb() {
        AbstractC3763nk0 abstractC3763nk0 = this.f21334c;
        if (abstractC3763nk0 != null) {
            abstractC3763nk0.zzb();
            AbstractC3763nk0 abstractC3763nk02 = this.f21334c;
            if (abstractC3763nk02.f21333b != this.f21335d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f21333b.isEmpty()) {
            AbstractC4105qk0 abstractC4105qk0 = this.f21336e;
            Collection collection = (Collection) abstractC4105qk0.f21984d.get(this.f21332a);
            if (collection != null) {
                this.f21333b = collection;
            }
        }
    }
}
