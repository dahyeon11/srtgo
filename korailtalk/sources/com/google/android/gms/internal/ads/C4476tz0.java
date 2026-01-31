package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4476tz0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f22953a;

    public C4476tz0(Iterator it) {
        this.f22953a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22953a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f22953a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22953a.remove();
    }
}
