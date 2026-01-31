package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.kl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3423kl0 extends AbstractC3311jm0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f20467a;

    C3423kl0(Object obj) {
        this.f20467a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20467a != this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f20467a;
        this.f20467a = this;
        if (obj != this) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
