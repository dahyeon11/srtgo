package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4332sk0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC4446tk0 f22684a;

    C4332sk0(AbstractC4446tk0 abstractC4446tk0) {
        this.f22684a = abstractC4446tk0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f22684a.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f22684a.zzs().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f22684a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f22684a.zze();
    }
}
