package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ck0 */
/* loaded from: classes2.dex */
final class C2506ck0 implements Iterator {

    /* renamed from: a */
    final Iterator f18345a;

    /* renamed from: b */
    Collection f18346b;

    /* renamed from: c */
    final /* synthetic */ C2621dk0 f18347c;

    C2506ck0(C2621dk0 c2621dk0) {
        this.f18347c = c2621dk0;
        this.f18345a = c2621dk0.f18669d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18345a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f18345a.next();
        this.f18346b = (Collection) entry.getValue();
        return this.f18347c.c(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1188Bj0.zzk(this.f18346b != null, "no calls to next() since the last call to remove()");
        this.f18345a.remove();
        this.f18347c.f18670e.f21985e -= this.f18346b.size();
        this.f18346b.clear();
        this.f18346b = null;
    }
}
