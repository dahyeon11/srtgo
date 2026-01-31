package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ek0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2735ek0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f18805a;

    /* renamed from: b, reason: collision with root package name */
    Object f18806b = null;

    /* renamed from: c, reason: collision with root package name */
    Collection f18807c = null;

    /* renamed from: d, reason: collision with root package name */
    Iterator f18808d = EnumC3309jl0.INSTANCE;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC4105qk0 f18809e;

    AbstractC2735ek0(AbstractC4105qk0 abstractC4105qk0) {
        this.f18809e = abstractC4105qk0;
        this.f18805a = abstractC4105qk0.f21984d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18805a.hasNext() || this.f18808d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18808d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f18805a.next();
            this.f18806b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f18807c = collection;
            this.f18808d = collection.iterator();
        }
        return this.f18808d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18808d.remove();
        Collection collection = this.f18807c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f18805a.remove();
        }
        AbstractC4105qk0 abstractC4105qk0 = this.f18809e;
        abstractC4105qk0.f21985e--;
    }
}
