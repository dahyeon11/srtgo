package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fk0 */
/* loaded from: classes2.dex */
final class C2850fk0 implements Iterator {

    /* renamed from: a */
    Map.Entry f19235a;

    /* renamed from: b */
    final /* synthetic */ Iterator f19236b;

    /* renamed from: c */
    final /* synthetic */ C2965gk0 f19237c;

    C2850fk0(C2965gk0 c2965gk0, Iterator it) {
        this.f19236b = it;
        this.f19237c = c2965gk0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19236b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f19236b.next();
        this.f19235a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1188Bj0.zzk(this.f19235a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f19235a.getValue();
        this.f19236b.remove();
        this.f19237c.f19392b.f21985e -= collection.size();
        collection.clear();
        this.f19235a = null;
    }
}
