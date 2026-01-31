package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.pk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3991pk0 extends AbstractC3763nk0 implements List {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f21801f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3991pk0(AbstractC4105qk0 abstractC4105qk0, Object obj, List list, AbstractC3763nk0 abstractC3763nk0) {
        super(abstractC4105qk0, obj, list, abstractC3763nk0);
        this.f21801f = abstractC4105qk0;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        zzb();
        boolean zIsEmpty = this.f21333b.isEmpty();
        ((List) this.f21333b).add(i8, obj);
        this.f21801f.f21985e++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f21333b).addAll(i8, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f21333b.size();
        this.f21801f.f21985e += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzb();
        return ((List) this.f21333b).get(i8);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f21333b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f21333b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C3877ok0(this);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        zzb();
        Object objRemove = ((List) this.f21333b).remove(i8);
        AbstractC4105qk0 abstractC4105qk0 = this.f21801f;
        abstractC4105qk0.f21985e--;
        b();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        zzb();
        return ((List) this.f21333b).set(i8, obj);
    }

    @Override // java.util.List
    public final List subList(int i8, int i9) {
        zzb();
        List listSubList = ((List) this.f21333b).subList(i8, i9);
        AbstractC3763nk0 abstractC3763nk0 = this.f21334c;
        if (abstractC3763nk0 == null) {
            abstractC3763nk0 = this;
        }
        return this.f21801f.i(this.f21332a, listSubList, abstractC3763nk0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        zzb();
        return new C3877ok0(this, i8);
    }
}
