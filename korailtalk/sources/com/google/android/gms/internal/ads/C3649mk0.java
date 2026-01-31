package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mk0 */
/* loaded from: classes2.dex */
class C3649mk0 implements Iterator {

    /* renamed from: a */
    final Iterator f20976a;

    /* renamed from: b */
    final Collection f20977b;

    /* renamed from: c */
    final /* synthetic */ AbstractC3763nk0 f20978c;

    C3649mk0(AbstractC3763nk0 abstractC3763nk0, Iterator it) {
        this.f20978c = abstractC3763nk0;
        this.f20977b = abstractC3763nk0.f21333b;
        this.f20976a = it;
    }

    final void a() {
        this.f20978c.zzb();
        if (this.f20978c.f21333b != this.f20977b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f20976a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f20976a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20976a.remove();
        AbstractC4105qk0 abstractC4105qk0 = this.f20978c.f21336e;
        abstractC4105qk0.f21985e--;
        this.f20978c.b();
    }

    C3649mk0(AbstractC3763nk0 abstractC3763nk0) {
        this.f20978c = abstractC3763nk0;
        Collection collection = abstractC3763nk0.f21333b;
        this.f20977b = collection;
        this.f20976a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
