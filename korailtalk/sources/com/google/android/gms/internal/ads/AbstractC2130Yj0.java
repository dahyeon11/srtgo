package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.Yj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2130Yj0 extends AbstractC3311jm0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f17410a;

    /* renamed from: b, reason: collision with root package name */
    private int f17411b = 2;

    protected AbstractC2130Yj0() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f17411b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1188Bj0.zzj(this.f17411b != 4);
        int i8 = this.f17411b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.f17411b = 4;
            this.f17410a = a();
            if (this.f17411b != 3) {
                this.f17411b = 1;
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
        this.f17411b = 2;
        Object obj = this.f17410a;
        this.f17410a = null;
        return obj;
    }
}
