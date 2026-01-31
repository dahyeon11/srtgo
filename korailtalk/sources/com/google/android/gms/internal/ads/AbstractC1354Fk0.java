package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.Fk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1354Fk0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f13058a;

    /* renamed from: b, reason: collision with root package name */
    int f13059b;

    /* renamed from: c, reason: collision with root package name */
    int f13060c = -1;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1518Jk0 f13061d;

    /* synthetic */ AbstractC1354Fk0(C1518Jk0 c1518Jk0, AbstractC1313Ek0 abstractC1313Ek0) {
        this.f13061d = c1518Jk0;
        this.f13058a = c1518Jk0.f13687e;
        this.f13059b = c1518Jk0.h();
    }

    private final void b() {
        if (this.f13061d.f13687e != this.f13058a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i8);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13059b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f13059b;
        this.f13060c = i8;
        Object objA = a(i8);
        this.f13059b = this.f13061d.i(this.f13059b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        AbstractC1188Bj0.zzk(this.f13060c >= 0, "no calls to next() since the last call to remove()");
        this.f13058a += 32;
        int i8 = this.f13060c;
        C1518Jk0 c1518Jk0 = this.f13061d;
        c1518Jk0.remove(C1518Jk0.j(c1518Jk0, i8));
        this.f13059b--;
        this.f13060c = -1;
    }
}
