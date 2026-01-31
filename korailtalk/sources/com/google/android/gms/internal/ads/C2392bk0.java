package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bk0 */
/* loaded from: classes2.dex */
final class C2392bk0 extends AbstractC4562ul0 {

    /* renamed from: a */
    final /* synthetic */ C2621dk0 f18176a;

    C2392bk0(C2621dk0 c2621dk0) {
        this.f18176a = c2621dk0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4562ul0
    final Map a() {
        return this.f18176a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4562ul0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return AbstractC5130zk0.a(this.f18176a.f18669d.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2506ck0(this.f18176a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4562ul0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C2621dk0 c2621dk0 = this.f18176a;
        AbstractC4105qk0.n(c2621dk0.f18670e, entry.getKey());
        return true;
    }
}
