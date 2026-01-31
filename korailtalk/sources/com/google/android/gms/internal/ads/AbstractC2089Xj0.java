package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.Xj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2089Xj0 extends AbstractC3425km0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17287a;

    /* renamed from: b, reason: collision with root package name */
    private int f17288b;

    protected AbstractC2089Xj0(int i8, int i9) {
        AbstractC1188Bj0.zzb(i9, i8, "index");
        this.f17287a = i8;
        this.f17288b = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f17288b < this.f17287a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17288b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f17288b;
        this.f17288b = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17288b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f17288b - 1;
        this.f17288b = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17288b - 1;
    }
}
