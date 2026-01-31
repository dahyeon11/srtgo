package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Xl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2093Xl0 extends AbstractC2130Yj0 {

    /* renamed from: c, reason: collision with root package name */
    final Iterator f17289c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2134Yl0 f17290d;

    C2093Xl0(C2134Yl0 c2134Yl0) {
        this.f17290d = c2134Yl0;
        this.f17289c = c2134Yl0.f17416a.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2130Yj0
    protected final Object a() {
        while (this.f17289c.hasNext()) {
            Iterator it = this.f17289c;
            Set set = this.f17290d.f17417b;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
