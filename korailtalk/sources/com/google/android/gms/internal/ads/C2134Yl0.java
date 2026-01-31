package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Yl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2134Yl0 extends AbstractC2739em0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f17416a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f17417b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2134Yl0(Set set, Set set2) {
        super(null);
        this.f17416a = set;
        this.f17417b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f17416a.contains(obj) && this.f17417b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f17416a.containsAll(collection) && this.f17417b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f17417b, this.f17416a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2739em0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C2093Xl0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f17416a.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (this.f17417b.contains(it.next())) {
                i8++;
            }
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2739em0
    /* renamed from: zza */
    public final AbstractC3311jm0 iterator() {
        return new C2093Xl0(this);
    }
}
