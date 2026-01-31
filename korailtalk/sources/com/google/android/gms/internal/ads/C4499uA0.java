package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4499uA0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f22984a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22985b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f22986c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC4955yA0 f22987d;

    /* synthetic */ C4499uA0(AbstractC4955yA0 abstractC4955yA0, AbstractC4385tA0 abstractC4385tA0) {
        this.f22987d = abstractC4955yA0;
    }

    private final Iterator a() {
        if (this.f22986c == null) {
            this.f22986c = this.f22987d.f23853c.entrySet().iterator();
        }
        return this.f22986c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22984a + 1 >= this.f22987d.f23852b.size()) {
            return !this.f22987d.f23853c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f22985b = true;
        int i8 = this.f22984a + 1;
        this.f22984a = i8;
        return i8 < this.f22987d.f23852b.size() ? (Map.Entry) this.f22987d.f23852b.get(this.f22984a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22985b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f22985b = false;
        this.f22987d.h();
        if (this.f22984a >= this.f22987d.f23852b.size()) {
            a().remove();
            return;
        }
        AbstractC4955yA0 abstractC4955yA0 = this.f22987d;
        int i8 = this.f22984a;
        this.f22984a = i8 - 1;
        abstractC4955yA0.f(i8);
    }
}
