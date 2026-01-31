package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.xD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4847xD0 extends AbstractList {

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4961yD0 f23671c = AbstractC4961yD0.zzb(C4847xD0.class);

    /* renamed from: a, reason: collision with root package name */
    final List f23672a;

    /* renamed from: b, reason: collision with root package name */
    final Iterator f23673b;

    public C4847xD0(List list, Iterator it) {
        this.f23672a = list;
        this.f23673b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        if (this.f23672a.size() > i8) {
            return this.f23672a.get(i8);
        }
        if (!this.f23673b.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23672a.add(this.f23673b.next());
        return get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C4733wD0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        AbstractC4961yD0 abstractC4961yD0 = f23671c;
        abstractC4961yD0.zza("potentially expensive size() call");
        abstractC4961yD0.zza("blowup running");
        while (this.f23673b.hasNext()) {
            this.f23672a.add(this.f23673b.next());
        }
        return this.f23672a.size();
    }
}
