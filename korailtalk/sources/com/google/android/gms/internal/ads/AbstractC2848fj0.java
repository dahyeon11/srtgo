package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.fj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2848fj0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Object f19233a;

    /* renamed from: b, reason: collision with root package name */
    private int f19234b = 2;

    protected AbstractC2848fj0() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f19234b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1188Bj0.zzj(this.f19234b != 4);
        int i8 = this.f19234b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.f19234b = 4;
            this.f19233a = a();
            if (this.f19234b != 3) {
                this.f19234b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19234b = 2;
        Object obj = this.f19233a;
        this.f19233a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
